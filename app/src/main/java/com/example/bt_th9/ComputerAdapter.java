package com.example.bt_th9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComputerAdapter  extends RecyclerView.Adapter{
    private List<Computer> maytinhs;
    // Lưu Context để dễ dàng truy cập
    private Context mContext;

    public ComputerAdapter(List maytinhs, Context mContext) {
        this.maytinhs = maytinhs;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Nạp layout cho View biểu diễn phần tử sinh viên
        View maytinhView =
                inflater.inflate(R.layout.activity_may_tinh_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(maytinhView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Computer computer = maytinhs.get(position);

    }


    @Override
    public int getItemCount() {
        return maytinhs.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private View itemview;
        public TextView tenMayTinh;
        public TextView dungLuong;
        public TextView ram;
        public Button detail_button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemview = itemView;
            tenMayTinh = itemView.findViewById(R.id.tenmaytinh);
            dungLuong = itemView.findViewById(R.id.dungluong);
            ram = itemView.findViewById(R.id.ram);
            detail_button = itemView.findViewById(R.id.detail_button);

            //Xử lý khi nút Chi tiết được bấm
            detail_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),
                                    tenMayTinh.getText() +" | "
                                            + " Demo function", Toast.LENGTH_SHORT)
                            .show();
                }
            });
        }
}
}

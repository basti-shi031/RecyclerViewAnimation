package basti.coryphaei.com.headerhidelistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bowen on 2015/10/19.
 */
public class ListAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<String> mList;
    private Context mContext;

    public ListAdapter(List<String> list,Context context){
        mList = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String s = mList.get(position);
        holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder{

    public TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.text);
    }
}

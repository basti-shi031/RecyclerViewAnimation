package basti.coryphaei.com.headerhidelistview;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Toolbar mToolbar;
    private List<String> mList;
    private ListAdapter mAdapter;
    private CollapsingToolbarLayout mCollapsingTolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initToolBar();

        initDates();
    }

    private void initDates() {

        mList = new ArrayList<>();
        for (int i = 0;i<20;i++)
            mList.add("第"+i+"个Item");


        mAdapter = new ListAdapter(mList,this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(mAdapter);
    }

    private void initToolBar() {


        mCollapsingTolbarLayout.setTitle("标题2");
    }

    private void initView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mCollapsingTolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
    }
}

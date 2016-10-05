package com.dhn.peanut.setting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.dhn.peanut.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SettingActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
    }


    private void initView(){

        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        initToolbar();

    }

    private void initToolbar() {
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        mToolbar.setTitle(R.string.setting);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.drawable.arrow_left);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

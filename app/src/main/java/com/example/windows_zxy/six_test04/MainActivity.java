package com.example.windows_zxy.six_test04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.windows_zxy.six_test04.bean.UserBean;
import com.example.windows_zxy.six_test04.zxy.DaoMaster;
import com.example.windows_zxy.six_test04.zxy.DaoSession;
import com.example.windows_zxy.six_test04.zxy.UserBeanDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoSession session = DaoMaster.newDevSession(this, "zxy.db");
        UserBeanDao beanDao = session.getUserBeanDao();
        UserBean userBean = new UserBean(0l,"犊子","女",18);
        beanDao.insert(userBean);
    }
}

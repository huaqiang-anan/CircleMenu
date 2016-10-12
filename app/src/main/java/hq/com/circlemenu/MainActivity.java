package hq.com.circlemenu;

import android.app.Activity;
import android.os.Bundle;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by huaqiang
 * on 2016/10/12.
 */
public class MainActivity extends Activity {
    @InjectView(R.id.circle_menu)
    CircleMenu circleMenu;
    private int[] iconResArray = new int[5];

    {
        iconResArray[0] = R.drawable.icon_home;
        iconResArray[1] = R.drawable.icon_search;
        iconResArray[2] = R.drawable.icon_notify;
        iconResArray[3] = R.drawable.icon_setting;
        iconResArray[4] = R.drawable.icon_gps;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        // 设置打开/关闭菜单图标
        circleMenu.setMainIconResource(R.drawable.icon_menu, R.drawable.icon_cancel);
        // 设置一组 Resource 格式的子菜单项图
        circleMenu.setSubIconResources(iconResArray);
        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int index) {
            }
        });
        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
            @Override
            public void onMenuOpened() {
            }

            @Override
            public void onMenuClosed() {
            }
        });
    }
}

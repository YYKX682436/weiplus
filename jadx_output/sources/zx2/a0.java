package zx2;

/* loaded from: classes2.dex */
public interface a0 {
    com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout a();

    com.tencent.mm.view.recyclerview.WxRecyclerView b();

    void c(android.view.Window window);

    default int d() {
        return -1;
    }

    androidx.viewpager.widget.ViewPager e();

    android.view.View f();

    com.google.android.material.tabs.TabLayout g();

    int getLayoutId();

    com.tencent.mm.view.HardTouchableLayout h();
}

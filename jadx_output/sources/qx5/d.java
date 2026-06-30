package qx5;

/* loaded from: classes13.dex */
public class d extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final qx5.y f367487i;

    public d(androidx.fragment.app.FragmentManager fragmentManager, qx5.y yVar) {
        super(fragmentManager, 0);
        this.f367487i = yVar;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 4;
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        qx5.y yVar = this.f367487i;
        if (i17 == 0) {
            return new com.tencent.xweb.debug.FragmentCore(yVar);
        }
        if (i17 == 1) {
            return new com.tencent.xweb.debug.FragmentPlugin(yVar);
        }
        if (i17 == 2) {
            return new com.tencent.xweb.debug.FragmentInfo(yVar);
        }
        if (i17 == 3) {
            return new com.tencent.xweb.debug.FragmentLog(yVar);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        if (i17 == 0) {
            return "内核调试";
        }
        if (i17 == 1) {
            return "插件调试";
        }
        if (i17 == 2) {
            return "调试信息";
        }
        if (i17 == 3) {
            return "初始日志";
        }
        return null;
    }
}

package cx3;

/* loaded from: classes15.dex */
public final class d0 extends androidx.fragment.app.y1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoThreeFragment demoThreeFragment, androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        kotlin.jvm.internal.o.d(fragmentManager);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 3;
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return "页面" + (i17 + 1);
    }
}

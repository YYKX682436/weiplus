package go2;

/* loaded from: classes2.dex */
public final class b1 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ go2.d1 f273955g;

    public b1(go2.d1 d1Var) {
        this.f273955g = d1Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        super.c(window);
        go2.d1 d1Var = this.f273955g;
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) d1Var.getRootView().findViewById(com.tencent.mm.R.id.q0q);
        if (viewPager == null) {
            viewPager = (androidx.viewpager.widget.ViewPager) window.findViewById(com.tencent.mm.R.id.q0q);
        }
        this.f477055c = viewPager;
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) d1Var.getRootView().findViewById(com.tencent.mm.R.id.q0o);
        if (tabLayout == null) {
            tabLayout = (com.google.android.material.tabs.TabLayout) window.findViewById(com.tencent.mm.R.id.q0o);
        }
        this.f477053a = tabLayout;
        com.tencent.mm.view.HardTouchableLayout hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) d1Var.getRootView().findViewById(com.tencent.mm.R.id.q0p);
        if (hardTouchableLayout == null) {
            hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) window.findViewById(com.tencent.mm.R.id.q0p);
        }
        this.f477054b = hardTouchableLayout;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcc;
    }
}

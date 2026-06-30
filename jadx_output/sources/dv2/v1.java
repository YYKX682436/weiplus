package dv2;

/* loaded from: classes2.dex */
public final class v1 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.w1 f243965g;

    public v1(dv2.w1 w1Var) {
        this.f243965g = w1Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        dv2.w1 w1Var = this.f243965g;
        this.f477055c = (androidx.viewpager.widget.ViewPager) w1Var.getRootView().findViewById(com.tencent.mm.R.id.f486836v33);
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) w1Var.getRootView().findViewById(com.tencent.mm.R.id.f486834v31);
        this.f477057e = finderTabLayout;
        android.view.ViewGroup.LayoutParams layoutParams = finderTabLayout != null ? finderTabLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = w1Var.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.an6);
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = this.f477057e;
        if (finderTabLayout2 != null) {
            finderTabLayout2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout3 = this.f477057e;
        if (finderTabLayout3 != null) {
            int dimension = (int) w1Var.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            int dimension2 = (int) w1Var.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            finderTabLayout3.f133104h = dimension;
            finderTabLayout3.f133105i = 0;
            finderTabLayout3.f133106m = dimension2;
            finderTabLayout3.f133107n = 0;
            finderTabLayout3.e();
        }
    }

    @Override // zx2.a0
    public int d() {
        return com.tencent.mm.R.id.f486835v32;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ee7;
    }
}

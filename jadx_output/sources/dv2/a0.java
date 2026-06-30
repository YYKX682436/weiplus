package dv2;

/* loaded from: classes2.dex */
public final class a0 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.b0 f243805g;

    public a0(dv2.b0 b0Var) {
        this.f243805g = b0Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        dv2.b0 b0Var = this.f243805g;
        this.f477055c = (androidx.viewpager.widget.ViewPager) b0Var.getRootView().findViewById(com.tencent.mm.R.id.ugt);
        this.f477057e = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) b0Var.getRootView().findViewById(com.tencent.mm.R.id.ugr);
        if (!b0Var.isBelongFragment()) {
            return;
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477057e;
        android.view.ViewGroup.LayoutParams layoutParams = finderTabLayout != null ? finderTabLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = b0Var.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.an6);
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = this.f477057e;
        if (finderTabLayout2 != null) {
            finderTabLayout2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout3 = this.f477057e;
        if (finderTabLayout3 != null) {
            int dimension = (int) b0Var.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            int dimension2 = (int) b0Var.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            finderTabLayout3.f133104h = dimension;
            finderTabLayout3.f133105i = 0;
            finderTabLayout3.f133106m = dimension2;
            finderTabLayout3.f133107n = 0;
            finderTabLayout3.e();
        }
    }

    @Override // zx2.a0
    public int d() {
        return com.tencent.mm.R.id.ugs;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489030b32;
    }
}

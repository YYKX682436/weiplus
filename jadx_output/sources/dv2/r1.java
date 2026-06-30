package dv2;

/* loaded from: classes2.dex */
public final class r1 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.s1 f243941g;

    public r1(dv2.s1 s1Var) {
        this.f243941g = s1Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        super.c(window);
        this.f477057e = (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) this.f243941g.getRootView().findViewById(com.tencent.mm.R.id.nup);
    }

    @Override // zx2.a0
    public int d() {
        return com.tencent.mm.R.id.nuq;
    }

    @Override // zx2.l, zx2.a0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ee6;
    }
}

package xt2;

/* loaded from: classes2.dex */
public final class g3 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f456767e;

    public g3(com.tencent.mm.view.MMPAGView mMPAGView, xt2.r3 r3Var) {
        this.f456766d = mMPAGView;
        this.f456767e = r3Var;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456766d.setVisibility(8);
        xt2.r3 r3Var = this.f456767e;
        java.lang.Runnable runnable = r3Var.f456981d;
        if (runnable != null) {
            r3Var.f456980c.removeCallbacks(runnable);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag cancel");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456766d.setVisibility(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag start");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f456766d.setVisibility(8);
        xt2.r3 r3Var = this.f456767e;
        java.lang.Runnable runnable = r3Var.f456981d;
        if (runnable != null) {
            r3Var.f456980c.removeCallbacks(runnable);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "cart promote pag end");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}

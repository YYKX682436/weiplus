package up0;

/* loaded from: classes13.dex */
public final class f implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f429773d;

    public f(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f429773d = mMPAGView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBBootsPlayPagManager", "stop here");
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f429773d;
        mMPAGView2.n();
        com.tencent.mars.xlog.Log.i(mMPAGView2.f213327d, "freeCache useRfx:" + mMPAGView2.useRfx);
        mMPAGView2.f213329f.freeCache();
        mMPAGView2.f213328e.freeCache();
        mMPAGView2.i(this);
        mMPAGView2.setVisibility(4);
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}

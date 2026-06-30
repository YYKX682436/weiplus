package ty0;

/* loaded from: classes4.dex */
public final class i1 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f422847d;

    @Override // n0.e4
    public void b() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mars.xlog.Log.i("MicroMsg.ComposePagView", "onRemembered");
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f422847d;
        boolean z17 = false;
        if (mMPAGView2 != null && !mMPAGView2.f()) {
            z17 = true;
        }
        if (!z17 || (mMPAGView = this.f422847d) == null) {
            return;
        }
        mMPAGView.g();
    }

    @Override // n0.e4
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ComposePagView", "onAbandoned");
        d();
    }

    @Override // n0.e4
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ComposePagView", "onForgotten");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f422847d;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
    }
}

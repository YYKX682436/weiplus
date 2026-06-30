package ym5;

/* loaded from: classes13.dex */
public final class f2 implements com.tencent.mm.rfx.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463295a;

    public f2(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f463295a = mMPAGView;
    }

    @Override // com.tencent.mm.rfx.i
    public void a(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        int i17;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463295a;
        if (!mMPAGView.getUseRfx() || (i17 = mMPAGView.f213341u) == 0) {
            return;
        }
        ym5.l2.f463424a.a(rfxPagView, mMPAGView.f213342v, i17);
        mMPAGView.f213338r = 0;
        mMPAGView.f213339s = 0.0d;
        mMPAGView.f213341u = 0;
        mMPAGView.f213342v = 0.0d;
    }

    @Override // com.tencent.mm.rfx.i
    public void b(com.tencent.mm.rfx.RfxPagView rfxPagView) {
    }

    @Override // com.tencent.mm.rfx.i
    public void c(com.tencent.mm.rfx.RfxPagView rfxPagView) {
    }

    @Override // com.tencent.mm.rfx.i
    public void d(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        int i17;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463295a;
        if (!mMPAGView.getUseRfx() || (i17 = mMPAGView.f213341u) == 0) {
            return;
        }
        ym5.l2.f463424a.a(rfxPagView, mMPAGView.f213342v, i17);
        mMPAGView.f213338r = 0;
        mMPAGView.f213339s = 0.0d;
        mMPAGView.f213341u = 0;
        mMPAGView.f213342v = 0.0d;
    }

    @Override // com.tencent.mm.rfx.i
    public void e(com.tencent.mm.rfx.RfxPagView rfxPagView, com.tencent.mm.rfx.RfxPagFrameInfo rfxPagFrameInfo) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463295a;
        if (mMPAGView.getUseRfx() && rfxPagFrameInfo != null && mMPAGView.f213340t) {
            mMPAGView.f213341u++;
            mMPAGView.f213342v += (int) rfxPagFrameInfo.frameCpuTimeCost;
        }
    }

    @Override // com.tencent.mm.rfx.i
    public void f(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463295a;
        if (mMPAGView.getUseRfx()) {
            mMPAGView.f213340t = true;
        }
    }
}

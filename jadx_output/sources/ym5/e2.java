package ym5;

/* loaded from: classes13.dex */
public final class e2 implements org.libpag.PAGView.PAGViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463262a;

    public e2(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f463262a = mMPAGView;
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationCancel(org.libpag.PAGView pAGView) {
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationEnd(org.libpag.PAGView pAGView) {
        int i17;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463262a;
        if (mMPAGView.getUseRfx() || (i17 = mMPAGView.f213338r) == 0) {
            return;
        }
        ym5.l2.f463424a.a(pAGView, mMPAGView.f213339s, i17);
        mMPAGView.f213338r = 0;
        mMPAGView.f213339s = 0.0d;
        mMPAGView.f213341u = 0;
        mMPAGView.f213342v = 0.0d;
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationRepeat(org.libpag.PAGView pAGView) {
        int i17;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463262a;
        if (mMPAGView.getUseRfx() || (i17 = mMPAGView.f213338r) == 0) {
            return;
        }
        ym5.l2.f463424a.a(pAGView, mMPAGView.f213339s, i17);
        mMPAGView.f213338r = 0;
        mMPAGView.f213339s = 0.0d;
        mMPAGView.f213341u = 0;
        mMPAGView.f213342v = 0.0d;
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationStart(org.libpag.PAGView pAGView) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463262a;
        if (mMPAGView.getUseRfx()) {
            return;
        }
        mMPAGView.f213337q = true;
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationUpdate(org.libpag.PAGView pAGView) {
    }
}

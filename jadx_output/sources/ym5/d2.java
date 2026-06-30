package ym5;

/* loaded from: classes13.dex */
public final class d2 implements org.libpag.PAGView.PAGViewFrameUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463248a;

    public d2(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f463248a = mMPAGView;
    }

    @Override // org.libpag.PAGView.PAGViewFrameUpdateListener
    public final void onAnimationUpdateWithFrameInfo(boolean z17, double d17) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f463248a;
        if (mMPAGView.getUseRfx() || !mMPAGView.f213337q) {
            return;
        }
        mMPAGView.f213338r++;
        mMPAGView.f213339s += (int) d17;
    }
}

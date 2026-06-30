package ue2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.o f426826d;

    public n(ue2.o oVar) {
        this.f426826d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hn0.f fVar;
        ue2.o oVar = this.f426826d;
        tn0.w0 w0Var = oVar.f426842u;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            ((hn0.p) fVar).j(dk2.ef.f233372a.G());
        }
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = oVar.f426840s;
        if (livePreviewView != null) {
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.renderRatioLayout;
            tRTCVideoRatioLayout.getClass();
            tRTCVideoRatioLayout.f68576o.d(false);
        }
    }
}

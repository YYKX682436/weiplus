package rp1;

/* loaded from: classes13.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398557d;

    public y(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398557d = contentFloatBallView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f398557d.setVisibility(0);
    }
}

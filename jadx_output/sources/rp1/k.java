package rp1;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398447d;

    public k(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398447d = contentFloatBallView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398447d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView.I(contentFloatBallView, true, contentFloatBallView.A, false, false, null, false, null, 124, null);
        com.tencent.mm.plugin.ball.service.i.a(1, 1, this.f398447d.A ? 1 : 2);
    }
}

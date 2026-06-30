package rp1;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398417d;

    public i(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398417d = contentFloatBallView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398417d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView.I(contentFloatBallView, false, contentFloatBallView.A, false, false, null, false, null, 124, null);
    }
}

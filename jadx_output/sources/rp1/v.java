package rp1;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398535d;

    public v(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398535d = contentFloatBallView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView;
        collapseView = this.f398535d.getCollapseView();
        collapseView.setVisibility(0);
    }
}

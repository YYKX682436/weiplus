package rp1;

/* loaded from: classes14.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f398561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f398562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398563f;

    public z(android.view.WindowManager.LayoutParams layoutParams, android.graphics.Point point, com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398561d = layoutParams;
        this.f398562e = point;
        this.f398563f = contentFloatBallView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Point point = this.f398562e;
        int i17 = point.x;
        android.view.WindowManager.LayoutParams layoutParams = this.f398561d;
        layoutParams.width = i17;
        layoutParams.height = point.y;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398563f;
        android.view.WindowManager windowManager = contentFloatBallView.f93425m;
        if (windowManager != null) {
            windowManager.updateViewLayout(contentFloatBallView, layoutParams);
        }
    }
}

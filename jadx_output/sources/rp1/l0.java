package rp1;

/* loaded from: classes14.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallBlurView f398469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f398470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398471f;

    public l0(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f398469d = floatBallBlurView;
        this.f398470e = bitmap;
        this.f398471f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.ball.view.FloatBallBlurView.f93459p;
        this.f398469d.c(this.f398470e, this.f398471f);
    }
}

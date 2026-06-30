package hp1;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView f282919e;

    public c(java.lang.String str, com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView) {
        this.f282918d = str;
        this.f282919e = floatBallVideoPanelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView = this.f282919e;
        android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(this.f282918d, floatBallVideoPanelView.f92984m, floatBallVideoPanelView.f92983i, 0.0f);
        if (j07 != null) {
            pm0.v.X(new hp1.b(floatBallVideoPanelView, j07));
        }
    }
}

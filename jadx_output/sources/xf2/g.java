package xf2;

/* loaded from: classes5.dex */
public final class g implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f454274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f454275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f454276c;

    public g(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView, boolean z17, float f17) {
        this.f454274a = screenShotView;
        this.f454275b = z17;
        this.f454276c = f17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new xf2.f(this.f454274a, (android.graphics.Bitmap) obj, this.f454275b, this.f454276c, r2.getWidth() / r2.getHeight()));
    }
}

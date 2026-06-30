package pc3;

/* loaded from: classes7.dex */
public final class c implements gh.r {

    /* renamed from: d, reason: collision with root package name */
    public gh.t f353370d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f353371e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.magicbrush.ui.MagicBrushView f353372f;

    public c(android.content.Context context, com.tencent.magicbrush.MagicBrush magicBrush) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(magicBrush, "magicBrush");
        pc3.b bVar = new pc3.b(context, this, magicBrush);
        bVar.setEnableTouchEvent(false);
        bVar.setMagicBrush(magicBrush);
        this.f353372f = bVar;
    }

    @Override // gh.r
    public java.lang.Object getSurface() {
        return this.f353371e;
    }

    @Override // gh.r
    public android.view.View getThisView() {
        return this.f353372f;
    }

    @Override // gh.r
    public gh.y getViewType() {
        return gh.y.SurfaceView;
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.tencent.magicbrush.MBRuntime runtime) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        callback.invoke(java.lang.Boolean.FALSE);
    }

    @Override // gh.r
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBRendererView", "onDestroy() called");
        this.f353371e = null;
        this.f353370d = null;
    }

    @Override // gh.r
    public void setSurfaceListener(gh.t tVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBRendererView", "setSurfaceListener() called with: l = " + tVar);
        this.f353370d = tVar;
    }
}

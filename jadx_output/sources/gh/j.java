package gh;

/* loaded from: classes14.dex */
public class j extends android.view.SurfaceView implements gh.r, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f271830d;

    /* renamed from: e, reason: collision with root package name */
    public final gh.y f271831e;

    /* renamed from: f, reason: collision with root package name */
    public gh.t f271832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f271830d = this;
        this.f271831e = gh.y.SurfaceView;
        getHolder().addCallback(this);
    }

    public void a(android.view.SurfaceHolder holder, boolean z17) {
        java.lang.Object surfaceTexture;
        kotlin.jvm.internal.o.g(holder, "holder");
        gh.t tVar = this.f271832f;
        if (tVar != null) {
            if (getSurfaceTexture() == null) {
                surfaceTexture = holder.getSurface();
            } else {
                surfaceTexture = getSurfaceTexture();
                kotlin.jvm.internal.o.d(surfaceTexture);
            }
            kotlin.jvm.internal.o.f(surfaceTexture, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            tVar.a(surfaceTexture, z17);
        }
    }

    @Override // gh.r
    public java.lang.Object getSurface() {
        return gh.q.a(this);
    }

    public java.lang.Object getSurfaceTexture() {
        return null;
    }

    @Override // gh.r
    public android.view.View getThisView() {
        return this.f271830d;
    }

    @Override // gh.r
    public gh.y getViewType() {
        return this.f271831e;
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.tencent.magicbrush.MBRuntime runtime) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        callback.invoke(java.lang.Boolean.TRUE);
    }

    @Override // gh.r
    public void onDestroy() {
    }

    @Override // gh.r
    public void setSurfaceListener(gh.t tVar) {
        this.f271832f = tVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        java.lang.Object surfaceTexture;
        kotlin.jvm.internal.o.g(holder, "holder");
        gh.t tVar = this.f271832f;
        if (tVar != null) {
            if (getSurfaceTexture() == null) {
                surfaceTexture = holder.getSurface();
            } else {
                surfaceTexture = getSurfaceTexture();
                kotlin.jvm.internal.o.d(surfaceTexture);
            }
            kotlin.jvm.internal.o.f(surfaceTexture, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            tVar.c(surfaceTexture, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        java.lang.Object surfaceTexture;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.graphics.Rect surfaceFrame = holder.getSurfaceFrame();
        gh.t tVar = this.f271832f;
        if (tVar != null) {
            if (getSurfaceTexture() == null) {
                surfaceTexture = holder.getSurface();
            } else {
                surfaceTexture = getSurfaceTexture();
                kotlin.jvm.internal.o.d(surfaceTexture);
            }
            java.lang.Object obj = surfaceTexture;
            kotlin.jvm.internal.o.f(obj, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            gh.s.a(tVar, obj, surfaceFrame.width(), surfaceFrame.height(), false, false, 16, null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        a(holder, false);
    }
}

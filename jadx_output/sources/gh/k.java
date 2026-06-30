package gh;

/* loaded from: classes7.dex */
public class k extends android.view.TextureView implements gh.r, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f271834d;

    /* renamed from: e, reason: collision with root package name */
    public gh.t f271835e;

    /* renamed from: f, reason: collision with root package name */
    public final gh.y f271836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f271834d = this;
        super.setSurfaceTextureListener(this);
        this.f271836f = gh.y.TextureView;
    }

    @Override // gh.r
    public java.lang.Object getSurface() {
        return gh.q.a(this);
    }

    @Override // gh.r
    public android.view.View getThisView() {
        return this.f271834d;
    }

    @Override // gh.r
    public gh.y getViewType() {
        return this.f271836f;
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        gh.t tVar = this.f271835e;
        if (tVar != null) {
            gh.s.a(tVar, surface, i17, i18, true, false, 16, null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        gh.t tVar = this.f271835e;
        if (tVar != null) {
            tVar.a(surface, false);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        gh.t tVar = this.f271835e;
        if (tVar != null) {
            tVar.c(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // gh.r
    public void setSurfaceListener(gh.t tVar) {
        this.f271835e = tVar;
    }
}

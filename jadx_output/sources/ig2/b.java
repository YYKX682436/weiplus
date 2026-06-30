package ig2;

/* loaded from: classes3.dex */
public final class b implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.d f291365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f291366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f291367f;

    public b(ig2.d dVar, mn0.b0 b0Var, com.tencent.mm.live.core.view.LiveVideoView liveVideoView) {
        this.f291365d = dVar;
        this.f291366e = b0Var;
        this.f291367f = liveVideoView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        ls5.d dVar;
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f291365d.getClass();
        com.tencent.mars.xlog.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom switch view success. #1");
        mn0.b0 b0Var = this.f291366e;
        if (b0Var != null) {
            b0Var.z(this.f291367f, i17, i18);
        }
        if (b0Var == null || (dVar = ((mn0.y) b0Var).f329807f) == null) {
            return;
        }
        dVar.f321128h = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

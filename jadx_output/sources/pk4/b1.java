package pk4;

/* loaded from: classes15.dex */
public final class b1 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f356464d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f356465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356466f;

    public b1(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView) {
        this.f356466f = thumbPlayerVideoView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356466f;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "onSurfaceTextureAvailable： " + surfaceTexture + '(' + i17 + " x " + i18 + ')');
        android.view.Surface surface = this.f356465e;
        if (surface != null) {
            com.tencent.mars.xlog.Log.w(thumbPlayerVideoView.f174596h, "surface is already valid");
            return;
        }
        if (surface != null) {
            surface.release();
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.f356465e = surface2;
        kk4.c cVar = thumbPlayerVideoView.f174597i;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(surface2, 1);
        }
        thumbPlayerVideoView.f174604s = false;
        thumbPlayerVideoView.o();
        java.lang.Double d17 = thumbPlayerVideoView.f174600o;
        if (d17 != null) {
            thumbPlayerVideoView.a(d17.doubleValue(), thumbPlayerVideoView.f174599n);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356466f;
        com.tencent.mars.xlog.Log.w(thumbPlayerVideoView.f174596h, "onSurfaceTextureDestroyed");
        android.view.Surface surface = this.f356465e;
        if (surface != null) {
            surface.release();
        }
        this.f356465e = null;
        thumbPlayerVideoView.f174604s = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i(this.f356466f.f174596h, "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f356464d = surface.getTimestamp();
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356466f;
        yz5.a aVar = thumbPlayerVideoView.f174602q.f356526c;
        if (aVar != null) {
            aVar.invoke();
            thumbPlayerVideoView.f174602q.f356526c = null;
        }
    }
}

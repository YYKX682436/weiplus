package pk4;

/* loaded from: classes15.dex */
public final class h0 implements mk4.a {

    /* renamed from: d, reason: collision with root package name */
    public long f356487d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f356488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356489f;

    public h0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
        this.f356489f = thumbPlayerSurfaceView;
    }

    @Override // mk4.a
    public boolean a(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356489f;
        com.tencent.mars.xlog.Log.w(thumbPlayerSurfaceView.f174575d, "onSurfaceTextureDestroyed");
        int i17 = thumbPlayerSurfaceView.f174588t;
        if (i17 != 11 && i17 != 8 && i17 != 9) {
            thumbPlayerSurfaceView.f174585q.e(thumbPlayerSurfaceView.f174586r);
        }
        kk4.c cVar = thumbPlayerSurfaceView.f174576e;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(null);
        }
        android.view.Surface surface2 = this.f356488e;
        if (surface2 != null) {
            surface2.release();
        }
        this.f356488e = null;
        thumbPlayerSurfaceView.f174583o = false;
        return false;
    }

    @Override // mk4.a
    public void b(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f356489f.f174575d, "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
    }

    @Override // mk4.a
    public void c(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356489f;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "onSurfaceTextureAvailable： " + surface + '(' + i17 + " x " + i18 + ')');
        android.view.Surface surface2 = this.f356488e;
        if (surface2 != null || !(surface instanceof android.view.SurfaceHolder)) {
            com.tencent.mars.xlog.Log.w(thumbPlayerSurfaceView.f174575d, "surface is already valid");
            return;
        }
        if (surface2 != null) {
            surface2.release();
        }
        android.view.Surface surface3 = ((android.view.SurfaceHolder) surface).getSurface();
        this.f356488e = surface3;
        kk4.c cVar = thumbPlayerSurfaceView.f174576e;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(surface3, 2);
        }
        thumbPlayerSurfaceView.f174583o = false;
        thumbPlayerSurfaceView.l();
        java.lang.Double d17 = thumbPlayerSurfaceView.f174579h;
        if (d17 != null) {
            thumbPlayerSurfaceView.a(d17.doubleValue(), thumbPlayerSurfaceView.f174578g);
        }
    }

    @Override // mk4.a
    public void d(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (surface instanceof android.view.SurfaceHolder) {
            this.f356487d = java.lang.System.currentTimeMillis();
        }
    }
}

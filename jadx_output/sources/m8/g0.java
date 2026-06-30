package m8;

/* loaded from: classes15.dex */
public final class g0 implements u9.t, n8.n, i9.k, z8.f, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m8.i0 f324556d;

    public g0(m8.i0 i0Var, m8.f0 f0Var) {
        this.f324556d = i0Var;
    }

    @Override // n8.n
    public void B(com.google.android.exoplayer2.Format format) {
        m8.i0 i0Var = this.f324556d;
        i0Var.f324568i = format;
        i0Var.getClass();
    }

    @Override // i9.k
    public void a(java.util.List list) {
        java.util.Iterator it = this.f324556d.f324563d.iterator();
        while (it.hasNext()) {
            ((i9.k) it.next()).a(list);
        }
    }

    @Override // n8.n
    public void c(java.lang.String str, long j17, long j18) {
        this.f324556d.getClass();
    }

    @Override // u9.t
    public void g(int i17, long j17) {
        this.f324556d.getClass();
    }

    @Override // u9.t
    public void h(int i17, int i18, int i19, float f17) {
        m8.i0 i0Var = this.f324556d;
        java.util.Iterator it = i0Var.f324562c.iterator();
        while (it.hasNext()) {
            ((ha3.d) ((m8.h0) it.next())).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onVideoSizeChanged width: " + i17 + ", height: " + i18 + ", unappliedRotationDegrees: " + i19 + ", pixelWidthHeightRatio: " + f17);
        }
        i0Var.getClass();
    }

    @Override // n8.n
    public void i(o8.f fVar) {
        m8.i0 i0Var = this.f324556d;
        i0Var.getClass();
        i0Var.f324568i = null;
        i0Var.getClass();
        i0Var.getClass();
    }

    @Override // u9.t
    public void j(o8.f fVar) {
        m8.i0 i0Var = this.f324556d;
        i0Var.getClass();
        i0Var.getClass();
    }

    @Override // u9.t
    public void l(java.lang.String str, long j17, long j18) {
        this.f324556d.getClass();
    }

    @Override // n8.n
    public void m(int i17) {
        m8.i0 i0Var = this.f324556d;
        i0Var.getClass();
        i0Var.getClass();
    }

    @Override // u9.t
    public void n(android.view.Surface surface) {
        m8.i0 i0Var = this.f324556d;
        if (i0Var.f324569j == surface) {
            java.util.Iterator it = i0Var.f324562c.iterator();
            while (it.hasNext()) {
                ha3.d dVar = (ha3.d) ((m8.h0) it.next());
                if (!dVar.f279806d) {
                    dVar.f279806d = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onRenderedFirstFrame");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("event", "firstFrame");
                    dVar.f279808f.b(hashMap);
                }
            }
        }
        i0Var.getClass();
    }

    @Override // n8.n
    public void o(o8.f fVar) {
        m8.i0 i0Var = this.f324556d;
        i0Var.getClass();
        i0Var.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f324556d.l(new android.view.Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f324556d.l(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // z8.f
    public void p(com.google.android.exoplayer2.metadata.Metadata metadata) {
        java.util.Iterator it = this.f324556d.f324564e.iterator();
        while (it.hasNext()) {
            ((z8.f) it.next()).p(metadata);
        }
    }

    @Override // u9.t
    public void q(o8.f fVar) {
        m8.i0 i0Var = this.f324556d;
        i0Var.getClass();
        i0Var.f324567h = null;
        i0Var.getClass();
    }

    @Override // u9.t
    public void s(com.google.android.exoplayer2.Format format) {
        m8.i0 i0Var = this.f324556d;
        i0Var.f324567h = format;
        i0Var.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f324556d.l(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f324556d.l(null, false);
    }

    @Override // n8.n
    public void x(int i17, long j17, long j18) {
        this.f324556d.getClass();
    }
}

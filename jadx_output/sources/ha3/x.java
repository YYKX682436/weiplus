package ha3;

/* loaded from: classes15.dex */
public final class x implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279959d;

    public x(ha3.d0 d0Var) {
        this.f279959d = d0Var;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        ha3.d0 d0Var = this.f279959d;
        kk4.c cVar = d0Var.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(null);
        }
        android.view.Surface surface = d0Var.f279827q;
        if (surface != null) {
            surface.release();
        }
        d0Var.f279827q = null;
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayer", "onSurfaceAvailable width: " + i17 + ", height: " + i18);
        if (surfaceTexture != null) {
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            ha3.d0 d0Var = this.f279959d;
            d0Var.f279827q = surface;
            kk4.c cVar = d0Var.f279815e;
            if (cVar != null) {
                ((kk4.f0) cVar).setSurface(d0Var.f279827q);
            }
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

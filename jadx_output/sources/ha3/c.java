package ha3;

/* loaded from: classes15.dex */
public final class c implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f279803d;

    public c(ha3.g gVar) {
        this.f279803d = gVar;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        ha3.g gVar = this.f279803d;
        m8.i0 i0Var = gVar.f279857h;
        if (i0Var != null) {
            i0Var.i();
            i0Var.l(null, false);
        }
        android.view.Surface surface = gVar.f279865p;
        if (surface != null) {
            surface.release();
        }
        gVar.f279865p = null;
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onSurfaceAvailable width: " + i17 + ", height: " + i18);
        if (surfaceTexture != null) {
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            ha3.g gVar = this.f279803d;
            gVar.f279865p = surface;
            m8.i0 i0Var = gVar.f279857h;
            if (i0Var != null) {
                i0Var.i();
                i0Var.l(surface, false);
            }
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

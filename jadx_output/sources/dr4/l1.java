package dr4;

/* loaded from: classes14.dex */
public final class l1 implements y03.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr4.q f242663b;

    public l1(dr4.p1 p1Var, dr4.q qVar) {
        this.f242662a = p1Var;
        this.f242663b = qVar;
    }

    @Override // y03.i
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureSizeChanged: width=" + i17 + ", height=" + i18);
        this.f242662a.j(this.f242663b, i17, i18, 1);
    }

    @Override // y03.i
    public void b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.VoIPRenderMgr", "onSurfaceTextureDestroy");
        dr4.x1 x1Var = this.f242662a.f242708g;
        if (x1Var != null) {
            x1Var.c(this.f242663b, 1);
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureReady: " + surfaceTexture);
        this.f242662a.k(this.f242663b, 1);
    }
}

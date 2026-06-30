package dr4;

/* loaded from: classes14.dex */
public final class k1 implements y03.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr4.q f242656b;

    public k1(dr4.p1 p1Var, dr4.q qVar) {
        this.f242655a = p1Var;
        this.f242656b = qVar;
    }

    @Override // y03.i
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureSizeChanged: width=" + i17 + ", height=" + i18);
        this.f242655a.j(this.f242656b, i17, i18, 0);
    }

    @Override // y03.i
    public void b() {
        com.tencent.mars.xlog.Log.w("MicroMsg.VoIPRenderMgr", "onSurfaceTextureDestroy");
        dr4.x1 x1Var = this.f242655a.f242708g;
        if (x1Var != null) {
            x1Var.c(this.f242656b, 0);
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureReady: " + surfaceTexture);
        this.f242655a.k(this.f242656b, 0);
    }
}

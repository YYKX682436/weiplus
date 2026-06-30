package qa1;

/* loaded from: classes14.dex */
public class w implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f361028d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f361029e;

    public w(qa1.p pVar) {
        this.f361028d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        int width = surfaceHolder.getSurfaceFrame().width();
        int height = surfaceHolder.getSurfaceFrame().height();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface created %s %d %d", surfaceHolder, java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
        k63.o0 o0Var = (k63.o0) i95.n0.c(k63.o0.class);
        android.view.Surface surface = surfaceHolder.getSurface();
        ((k63.s) o0Var).getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352174m, null, 0, surface, 6, null), p60.q.class, null);
        k63.o0 o0Var2 = (k63.o0) i95.n0.c(k63.o0.class);
        qa1.v vVar = new qa1.v(this, width, height, surfaceHolder, oVar);
        ((k63.s) o0Var2).getClass();
        com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352175n, null, 0, null, 12, null), p60.q.class, new k63.r(vVar));
    }

    @Override // qa1.n
    public boolean g(int i17) {
        int i18 = qa1.p.f361010p;
        return (i17 & 2) > 0;
    }

    @Override // qa1.u
    public ms0.c getAbsSurfaceRenderer() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy queueEvent");
        return null;
    }

    @Override // qa1.u
    public android.opengl.EGLContext getEGLContext() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getEGLContext");
        return null;
    }

    @Override // qa1.u
    public int getPreviewTextureId() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    @Override // qa1.u
    public int getSurfaceHeight() {
        return this.f361028d.f361015n;
    }

    @Override // qa1.n
    public java.lang.Object getSurfaceTexture() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "getSurfaceTexture %s", this.f361029e);
        return this.f361029e;
    }

    @Override // qa1.u
    public int getSurfaceWidth() {
        return this.f361028d.f361014m;
    }

    @Override // qa1.n
    public void init() {
        this.f361029e = null;
    }

    @Override // qa1.u
    public boolean isAvailable() {
        return this.f361028d.f361013i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface destroyed");
        qa1.p pVar = this.f361028d;
        pVar.a(surfaceHolder, z17);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface changed %s %d %d", surfaceHolder, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        ((k63.s) ((k63.o0) i95.n0.c(k63.o0.class))).getClass();
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352176o, null, 0, new com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload(i18, i19), 6, null), p60.q.class, null);
        qa1.p pVar = this.f361028d;
        pVar.d(surfaceHolder, i17, i18, i19);
        pVar.b(oVar);
    }

    @Override // et0.r
    public void requestRender() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    @Override // qa1.u
    public void setOnSurfaceTextureAvailableDelegate(qa1.t tVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    @Override // qa1.u
    public void setOnTextureDrawFinishDelegate(yz5.l lVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    @Override // qa1.u
    public void setPreviewRenderer(ms0.c cVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setPreviewRenderer");
    }
}

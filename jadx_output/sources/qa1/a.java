package qa1;

/* loaded from: classes14.dex */
public class a implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f360959d;

    public a(qa1.p pVar) {
        this.f360959d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        qa1.p pVar = this.f360959d;
        pVar.e(surfaceHolder);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public boolean g(int i17) {
        return i17 == 0;
    }

    @Override // qa1.u
    public ms0.c getAbsSurfaceRenderer() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy queueEvent");
        return null;
    }

    @Override // qa1.u
    public android.opengl.EGLContext getEGLContext() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getEGLContext");
        return null;
    }

    @Override // qa1.u
    public int getPreviewTextureId() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    @Override // qa1.u
    public int getSurfaceHeight() {
        return this.f360959d.f361015n;
    }

    @Override // qa1.n
    public java.lang.Object getSurfaceTexture() {
        return this.f360959d.c();
    }

    @Override // qa1.u
    public int getSurfaceWidth() {
        return this.f360959d.f361014m;
    }

    @Override // qa1.n
    public void init() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: init. switch to support node js");
    }

    @Override // qa1.u
    public boolean isAvailable() {
        return this.f360959d.f361013i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        qa1.p pVar = this.f360959d;
        pVar.a(surfaceHolder, z17);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        qa1.p pVar = this.f360959d;
        pVar.d(surfaceHolder, i17, i18, i19);
        pVar.b(oVar);
    }

    @Override // et0.r
    public void requestRender() {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    @Override // qa1.u
    public void setOnSurfaceTextureAvailableDelegate(qa1.t tVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    @Override // qa1.u
    public void setOnTextureDrawFinishDelegate(yz5.l lVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    @Override // qa1.u
    public void setPreviewRenderer(ms0.c cVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setPreviewRenderer");
    }
}

package um5;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.w f429183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f429184e;

    public q(um5.w wVar, android.os.HandlerThread handlerThread) {
        this.f429183d = wVar;
        this.f429184e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.w wVar = this.f429183d;
        wVar.f429192a.b();
        com.tencent.tav.coremedia.TextureInfo textureInfo = wVar.f429200i;
        if (textureInfo != null) {
            textureInfo.release();
        }
        um5.y yVar = wVar.f429199h;
        if (yVar != null) {
            android.opengl.GLES20.glDeleteProgram(yVar.f429224c);
        }
        android.view.Surface surface = wVar.f429198g;
        if (surface != null) {
            surface.release();
        }
        com.tencent.tav.decoder.RenderContext renderContext = wVar.f429197f;
        if (renderContext != null) {
            renderContext.release();
        }
        um5.x xVar = wVar.f429209r;
        xVar.getClass();
        yz5.l lVar = um5.x.f429211k;
        if (lVar != null) {
            lVar.invoke(xVar);
        }
        android.os.HandlerThread handlerThread = this.f429184e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        xm5.b.c(wVar.c(), "destroyEGL finished", new java.lang.Object[0]);
    }
}

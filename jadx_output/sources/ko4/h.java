package ko4;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f310075d;

    public h(ko4.l lVar) {
        this.f310075d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ko4.l lVar = this.f310075d;
        ko4.d dVar = lVar.f310090k;
        if (dVar != null) {
            android.opengl.GLES20.glDeleteTextures(3, new int[]{dVar.f310058j, dVar.f310059k, dVar.f310060l}, 0);
            android.opengl.GLES20.glDeleteProgram(dVar.f310051c);
        }
        com.tencent.tav.decoder.RenderContext renderContext = lVar.f310082c;
        if (renderContext != null) {
            renderContext.release();
        }
        lVar.f310080a.quit();
        com.tencent.mm.mediaplus.VideoSoftDecoderJni.nDestroy(lVar.f310091l);
        lVar.f310091l = 0L;
    }
}

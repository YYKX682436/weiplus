package d32;

/* loaded from: classes10.dex */
public final class g implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f226145d;

    public g(d32.j jVar) {
        this.f226145d = jVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        d32.j jVar = this.f226145d;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureEGLPixelBuffer", "onVideoSurfaceFrameAvailable");
        jVar.f226158k.post(new d32.i(new d32.h(jVar)));
    }
}

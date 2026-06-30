package wq4;

/* loaded from: classes14.dex */
public final class l0 extends android.graphics.SurfaceTexture {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448663a;

    public l0(int i17) {
        super(i17);
        this.f448663a = "MicroMsg.VoipSurfaceTexture";
        try {
            detachFromGLContext();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i(this.f448663a, "detachFromGLContext  in init error");
        }
    }
}

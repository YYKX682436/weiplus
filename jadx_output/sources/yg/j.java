package yg;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f462095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462096f;

    public j(com.tencent.magicbrush.MBRuntime mBRuntime, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        this.f462096f = mBRuntime;
        this.f462094d = i17;
        this.f462095e = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f462096f;
        mBRuntime.nativeNotifyWindowDestroyed(mBRuntime.f48577a, this.f462094d);
        android.graphics.SurfaceTexture surfaceTexture = this.f462095e;
        if (surfaceTexture == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not release. maybe released by other module", new java.lang.Object[0]);
        } else {
            surfaceTexture.release();
        }
    }
}

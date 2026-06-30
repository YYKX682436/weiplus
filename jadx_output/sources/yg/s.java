package yg;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f462118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f462121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f462122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462123i;

    public s(com.tencent.magicbrush.MBRuntime mBRuntime, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, boolean z17) {
        this.f462123i = mBRuntime;
        this.f462118d = surfaceTexture;
        this.f462119e = i17;
        this.f462120f = i18;
        this.f462121g = i19;
        this.f462122h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462118d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowAvailable. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462123i;
            mBRuntime.nativeNotifyWindowAvailable(mBRuntime.f48577a, this.f462119e, this.f462118d, this.f462120f, this.f462121g, this.f462122h);
        }
    }
}

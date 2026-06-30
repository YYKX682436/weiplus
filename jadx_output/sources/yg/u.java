package yg;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f462131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f462134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462135h;

    public u(com.tencent.magicbrush.MBRuntime mBRuntime, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        this.f462135h = mBRuntime;
        this.f462131d = surfaceTexture;
        this.f462132e = i17;
        this.f462133f = i18;
        this.f462134g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462131d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462135h;
            mBRuntime.nativeNotifyWindowChanged(mBRuntime.f48577a, this.f462132e, this.f462131d, this.f462133f, this.f462134g);
        }
    }
}

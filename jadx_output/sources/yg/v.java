package yg;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f462136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f462139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462140h;

    public v(com.tencent.magicbrush.MBRuntime mBRuntime, android.view.Surface surface, int i17, int i18, int i19) {
        this.f462140h = mBRuntime;
        this.f462136d = surface;
        this.f462137e = i17;
        this.f462138f = i18;
        this.f462139g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f462136d == null) {
            ah.i.c("MicroMsg.MagicBrush.MBRuntime", new java.lang.RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowChanged. maybe released by other module", new java.lang.Object[0]);
        } else {
            com.tencent.magicbrush.MBRuntime mBRuntime = this.f462140h;
            mBRuntime.nativeNotifyWindowChangedForSurface(mBRuntime.f48577a, this.f462137e, this.f462136d, this.f462138f, this.f462139g);
        }
    }
}

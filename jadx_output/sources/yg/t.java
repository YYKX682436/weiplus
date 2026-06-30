package yg;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f462126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f462127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f462128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f462129i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462130m;

    public t(com.tencent.magicbrush.MBRuntime mBRuntime, int i17, int i18, android.view.Surface surface, int i19, int i27, boolean z17) {
        this.f462130m = mBRuntime;
        this.f462124d = i17;
        this.f462125e = i18;
        this.f462126f = surface;
        this.f462127g = i19;
        this.f462128h = i27;
        this.f462129i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f462130m;
        mBRuntime.nativeNotifyWindowAvailableForSurface(mBRuntime.f48577a, this.f462124d, this.f462125e, this.f462126f, this.f462127g, this.f462128h, this.f462129i);
    }
}

package rc3;

/* loaded from: classes7.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f393952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f393954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f393955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f393956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f393957i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f393958m;

    public b1(rc3.f1 f1Var, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f393952d = f1Var;
        this.f393953e = i17;
        this.f393954f = i18;
        this.f393955g = i19;
        this.f393956h = i27;
        this.f393957i = i28;
        this.f393958m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        rc3.f1 f1Var = this.f393952d;
        java.lang.String str = (java.lang.String) f1Var.f393993n.get(java.lang.Integer.valueOf(this.f393953e));
        if (str == null) {
            return;
        }
        sc3.k1 k1Var = (sc3.k1) f1Var.f393988f.invoke(str);
        if (k1Var != null) {
            k1Var.H0().C3(this.f393953e, this.f393954f, this.f393955g, this.f393956h, this.f393957i, this.f393958m);
        }
        com.tencent.mars.xlog.Log.i("MagicBrushPublicService", "onCanvasViewCreated ipc cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}

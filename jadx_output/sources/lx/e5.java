package lx;

/* loaded from: classes4.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f321747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f321748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f321749i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321750m;

    public e5(lx.m5 m5Var, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, yz5.l lVar) {
        this.f321744d = m5Var;
        this.f321745e = str;
        this.f321746f = str2;
        this.f321747g = j17;
        this.f321748h = j18;
        this.f321749i = j19;
        this.f321750m = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        long j17 = this.f321749i;
        long j18 = this.f321748h;
        long j19 = this.f321747g;
        java.lang.String str = this.f321746f;
        java.lang.String str2 = this.f321745e;
        lx.m5 m5Var = this.f321744d;
        try {
            lx.m5.a(m5Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage: " + str2 + ", " + str + ", " + j19 + ", " + j18 + ", " + j17);
            z17 = lx.b6.a(str2, str, (int) j19, (int) j18, (int) j17);
        } catch (java.lang.Throwable th6) {
            lx.m5.a(m5Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage error: " + th6);
            z17 = false;
        }
        lx.m5.a(m5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage finish: " + str2 + ", " + str + ", " + j19 + ", " + j18 + ", " + j17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321750m.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17))));
    }
}

package f65;

/* loaded from: classes12.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f260006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f260007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f260008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f260009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f260010i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f260011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f260012n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260013o;

    public x0(java.lang.String str, int i17, int i18, long j17, long j18, long j19, boolean z17, long j27, java.lang.String str2) {
        this.f260005d = str;
        this.f260006e = i17;
        this.f260007f = i18;
        this.f260008g = j17;
        this.f260009h = j18;
        this.f260010i = j19;
        this.f260011m = z17;
        this.f260012n = j27;
        this.f260013o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f260019a;
        f65.w0 w0Var = new f65.w0(this.f260008g, this.f260009h, this.f260010i, this.f260011m, this.f260012n, this.f260013o);
        java.lang.String str = this.f260005d;
        com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str, w0Var));
        org.json.JSONObject jSONObject = com.tencent.mm.sdk.platformtools.t8.K0(a17.f61625m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f61625m);
        jSONObject.put("cdnErrorCode", this.f260006e);
        f65.y0.b(y0Var, str, jSONObject);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.f61625m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.f61624l = this.f260007f;
        f65.w[] wVarArr = f65.w.f259997d;
        a17.f61623k = 3L;
        a17.k();
        ((q04.r) f65.y0.f260020b).Ri(19, str);
    }
}

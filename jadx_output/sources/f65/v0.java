package f65;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f259990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f259992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f259993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f259994i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f259995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f259996n;

    public v0(java.lang.String str, boolean z17, java.lang.String str2, long j17, long j18, long j19, boolean z18, long j27) {
        this.f259989d = str;
        this.f259990e = z17;
        this.f259991f = str2;
        this.f259992g = j17;
        this.f259993h = j18;
        this.f259994i = j19;
        this.f259995m = z18;
        this.f259996n = j27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f260019a;
        f65.u0 u0Var = new f65.u0(this.f259990e, this.f259991f, this.f259992g, this.f259993h, this.f259994i, this.f259995m, this.f259996n);
        java.lang.String str = this.f259989d;
        com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str, u0Var));
        f65.w[] wVarArr = f65.w.f259997d;
        a17.f61623k = 1L;
        org.json.JSONObject jSONObject = com.tencent.mm.sdk.platformtools.t8.K0(a17.f61625m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f61625m);
        r45.pz6 d17 = y0Var.d(str);
        if (d17 != null) {
            jSONObject.put("isNewSend", d17.f383517t);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.f61625m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.k();
    }
}

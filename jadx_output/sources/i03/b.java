package i03;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f286529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i03.c f286530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f286531g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286532h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f286533i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, long j17, i03.c cVar, java.lang.String[] strArr, java.lang.String str2, int i17) {
        super(0);
        this.f286528d = str;
        this.f286529e = j17;
        this.f286530f = cVar;
        this.f286531g = strArr;
        this.f286532h = str2;
        this.f286533i = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.FlutterSlowFrameStackStruct flutterSlowFrameStackStruct = new com.tencent.mm.autogen.mmdata.rpt.FlutterSlowFrameStackStruct();
        flutterSlowFrameStackStruct.f58194i = flutterSlowFrameStackStruct.b("Runner", this.f286528d, true);
        long j17 = this.f286529e;
        flutterSlowFrameStackStruct.f58189d = j17;
        flutterSlowFrameStackStruct.f58195j = flutterSlowFrameStackStruct.b("KeyFrame", "", true);
        i03.c cVar = this.f286530f;
        cVar.getClass();
        java.lang.String[] strArr = this.f286531g;
        int length = 5000 / strArr.length;
        flutterSlowFrameStackStruct.f58190e = flutterSlowFrameStackStruct.b("StackTrace", i03.c.a(cVar, (java.lang.String) kz5.z.L(strArr), length), true);
        if (strArr.length > 1) {
            flutterSlowFrameStackStruct.f58196k = flutterSlowFrameStackStruct.b("StrackTrace2", i03.c.a(cVar, strArr[1], length), true);
        }
        if (strArr.length > 2) {
            flutterSlowFrameStackStruct.f58197l = flutterSlowFrameStackStruct.b("StrackTrace3", i03.c.a(cVar, strArr[2], length), true);
        }
        flutterSlowFrameStackStruct.f58201p = flutterSlowFrameStackStruct.b("Phase", this.f286532h, true);
        flutterSlowFrameStackStruct.f58202q = flutterSlowFrameStackStruct.b("Revision", a03.h.a(), true);
        flutterSlowFrameStackStruct.f58203r = this.f286533i;
        flutterSlowFrameStackStruct.f58204s = flutterSlowFrameStackStruct.b("rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_engine_slow_runner_report_duration_limit, 0);
        if (Ni <= 0 || j17 > Ni) {
            flutterSlowFrameStackStruct.k();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSlowRunnerReport", "report slow runner expt:" + Ni + " detail:" + flutterSlowFrameStackStruct.n());
        return jz5.f0.f302826a;
    }
}

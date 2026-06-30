package kj;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f308190d;

    /* renamed from: e, reason: collision with root package name */
    public final long f308191e;

    /* renamed from: f, reason: collision with root package name */
    public final long f308192f;

    /* renamed from: g, reason: collision with root package name */
    public final long f308193g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f308194h;

    /* renamed from: i, reason: collision with root package name */
    public final int f308195i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kj.e0 f308196m;

    public d0(kj.e0 e0Var, long[] jArr, long j17, long j18, long j19, boolean z17, int i17) {
        this.f308196m = e0Var;
        this.f308190d = jArr;
        this.f308195i = i17;
        this.f308191e = j17;
        this.f308192f = j18;
        this.f308193g = j19;
        this.f308194h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long[] jArr = this.f308190d;
        if (jArr.length > 0) {
            lj.e.d(jArr, linkedList, false, -1L);
            lj.e.f(linkedList, 30, new kj.c0(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        long c17 = lj.e.c(linkedList, sb6, sb7);
        long j17 = this.f308193g;
        long max = java.lang.Math.max(j17, c17);
        java.lang.String b17 = lj.e.b(linkedList, max);
        kj.e0 e0Var = this.f308196m;
        long j18 = e0Var.f308204o;
        boolean z17 = this.f308194h;
        if ((j17 > j18 && !z17) || (j17 > e0Var.f308205p && z17)) {
            oj.j.f("Matrix.StartupTracer", "stackKey:%s \n%s", b17, sb7.toString());
        }
        long j19 = this.f308191e;
        long j27 = this.f308192f;
        int i17 = this.f308195i;
        dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
        if (bVar == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("application_create", j19);
            jSONObject.put("application_create_scene", i17);
            jSONObject.put("first_activity_create", j27);
            jSONObject.put("startup_duration", max);
            jSONObject.put("is_warm_start_up", z17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_StartUp";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
        } catch (org.json.JSONException e17) {
            oj.j.b("Matrix.StartupTracer", "[JSONException for StartUpReportTask error: %s", e17);
        }
        if ((max <= e0Var.f308204o || z17) && (max <= e0Var.f308205p || !z17)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            oj.d.d(jSONObject2, ih.d.d().f291471b);
            jSONObject2.put("detail", fj.a.STARTUP);
            jSONObject2.put("cost", max);
            jSONObject2.put("stack", sb6.toString());
            jSONObject2.put("stackKey", b17);
            jSONObject2.put("subType", z17 ? 2 : 1);
            ri.d0 d0Var2 = new ri.d0();
            d0Var2.f395860b = "Trace_EvilMethod";
            d0Var2.f395862d = jSONObject2;
            bVar.d(d0Var2);
        } catch (org.json.JSONException e18) {
            oj.j.b("Matrix.StartupTracer", "[JSONException error: %s", e18);
        }
    }
}

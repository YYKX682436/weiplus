package yc1;

/* loaded from: classes7.dex */
public class q extends yc1.b {
    public static final int CTRL_INDEX = 346;
    public static final java.lang.String NAME = "createSocketTask";

    /* renamed from: p, reason: collision with root package name */
    public static uh1.n0 f460801p;

    /* renamed from: h, reason: collision with root package name */
    public final uh1.p0 f460802h;

    /* renamed from: i, reason: collision with root package name */
    public final int f460803i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f460804m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f460805n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f460806o = new java.util.concurrent.atomic.AtomicBoolean(false);

    public q(int i17, uh1.p0 p0Var) {
        this.f460803i = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateSocketTask", "JsApiCreateSocketTask, programType:%d", java.lang.Integer.valueOf(i17));
        this.f460803i = i17;
        this.f460802h = p0Var;
    }

    public static org.json.JSONObject C(yc1.q qVar, xk1.e eVar) {
        qVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        xk1.f fVar = (xk1.f) eVar;
        for (java.lang.String str : java.util.Collections.unmodifiableSet(fVar.f455007a.keySet())) {
            try {
                jSONObject.put(str, fVar.a(str));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiCreateSocketTask", e17, "JSONExceptions ", new java.lang.Object[0]);
            }
        }
        return jSONObject;
    }

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str3 = "fail";
        } else {
            str3 = "fail:" + str2;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("socketTaskId", str);
        hashMap.put("state", "error");
        hashMap.put("errMsg", str3);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        yc1.p pVar = new yc1.p();
        pVar.p(lVar);
        pVar.r(jSONObject);
        pVar.n(this.f460761g.a(str));
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 3L, 1L, false);
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "socketTaskId";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // gb1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l r15, org.json.JSONObject r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc1.q.d(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, java.lang.String):void");
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f427904b;
        uh1.s0.f427901a.getClass();
        sb6.append(uh1.t0.f427904b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}

package j85;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j85.g f298251a = new j85.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f298252b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f298253c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f298254d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f298255e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f298256f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f298257g;

    static {
        new java.util.HashMap();
        f298252b = "MicroMsg.SensitiveReporter";
        f298253c = new java.util.concurrent.CopyOnWriteArrayList();
        f298254d = new java.util.HashMap();
        f298255e = new java.util.ArrayList();
        f298256f = 2000L;
        f298257g = jz5.h.b(j85.b.f298241d);
    }

    public static final void a(j85.g gVar, com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct) {
        gVar.getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f298253c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(systemServiceHookStatusStruct);
        }
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) f298257g).getValue()).sendEmptyMessage(1);
    }

    public final void b(java.lang.String methodName, java.lang.String throwAbleStr) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(throwAbleStr, "throwAbleStr");
        pm0.v.M(f298252b, false, new j85.e(throwAbleStr, methodName), 2, null);
    }

    public final void c(d85.g0 permission, d85.f0 f0Var, java.lang.String str) {
        java.lang.String str2 = f298252b;
        java.lang.String str3 = "";
        kotlin.jvm.internal.o.g(permission, "permission");
        try {
            com.tencent.mars.xlog.Log.i(str2, "[reportUnControlSwitch] enter");
            java.lang.String str4 = f0Var != null ? f0Var.f227176d : null;
            if (str4 == null) {
                str4 = "null";
            }
            int i17 = f0Var != null ? f0Var.f227177e : -1;
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            java.util.List list = (java.util.List) e85.i.f250319e.get(permission.f227192d);
            boolean z17 = !(list != null && list.contains(str4));
            com.tencent.mars.xlog.Log.i(str2, "[reportUnControlSwitch] permission:" + permission + ", business:" + f0Var + ", isUnControl:" + z17 + ", process:" + bm5.f1.a());
            if (z17) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("webview_url_prefs_url", "");
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                java.lang.String g07 = g0Var != null ? kz5.n0.g0(((com.tencent.mm.feature.lite.i) g0Var).xj(), "|", null, null, 0, null, null, 62, null) : "";
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("currentUrl", string);
                jSONObject.put("liteAppIdStr", g07);
                if (str != null) {
                    str3 = str;
                }
                jSONObject.put("appBrandId", str3);
                jSONObject.put("activityDump", um0.a.a());
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                jSONObject.put("callerStack", com.tencent.mm.sdk.platformtools.z3.b(true));
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                com.tencent.mars.xlog.Log.i(str2, "[reportUnControlSwitch] json = ".concat(r26.i0.t(jSONObject2, ",", ";", false)));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                ((cy1.a) rVar).Ej("request_sys_permission", kz5.c1.k(new jz5.l("business_id", r26.i0.t(jSONObject3, ",", ";", false)), new jz5.l("sys_permission_id", java.lang.String.valueOf(permission.f227193e)), new jz5.l("business_scene_id", java.lang.String.valueOf(i17))), 33328);
            }
            com.tencent.mars.xlog.Log.i(str2, "[reportUnControlSwitch] exit");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i(str2, "[reportUnControlSwitch] error:" + th6.getMessage());
        }
    }
}

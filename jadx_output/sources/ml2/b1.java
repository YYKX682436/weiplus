package ml2;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.b1 f327211a = new ml2.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f327212b = new java.util.concurrent.ConcurrentHashMap();

    public static void a(ml2.b1 b1Var, java.lang.String hashCode, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            jSONObject = null;
        }
        synchronized (b1Var) {
            kotlin.jvm.internal.o.g(hashCode, "hashCode");
            ml2.a1 a1Var = (ml2.a1) f327212b.get(hashCode);
            if (a1Var != null) {
                if (jSONObject != null) {
                    a1Var.f327197d = jSONObject;
                } else {
                    java.lang.String str = a1Var.f327195b.f56561l;
                    if (!(str == null || str.length() == 0)) {
                        try {
                            java.lang.String str2 = a1Var.f327195b.f56561l;
                            kotlin.jvm.internal.o.f(str2, "getPg_udf_kv(...)");
                            a1Var.f327197d = new org.json.JSONObject(r26.i0.t(str2, ";", ",", false));
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("LiveExposeTimeReporter", th6, "onDispose", new java.lang.Object[0]);
                        }
                    }
                }
                com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct();
                finderBroadcastPageOutStruct.r(a1Var.f327195b.f56554e);
                finderBroadcastPageOutStruct.p(a1Var.f327195b.f56563n);
                finderBroadcastPageOutStruct.q(a1Var.f327195b.f56558i);
                org.json.JSONObject jSONObject2 = a1Var.f327197d;
                if (jSONObject2 == null) {
                    jSONObject2 = new org.json.JSONObject();
                }
                jSONObject2.put("staytime", c01.id.c() - a1Var.f327196c);
                java.lang.String jSONObject3 = jSONObject2.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                finderBroadcastPageOutStruct.s(r26.i0.t(jSONObject3, ",", ";", false));
                com.tencent.mars.xlog.Log.i("LiveExposeTimeReporter", "onDispose " + a1Var + ", extra:" + jSONObject + ", struct:" + finderBroadcastPageOutStruct.n());
                finderBroadcastPageOutStruct.k();
                f327212b.remove(hashCode);
            } else {
                com.tencent.mars.xlog.Log.i("LiveExposeTimeReporter", "hashCode " + hashCode + " has been disposed");
            }
        }
    }

    public final synchronized void b(ml2.a1 pageInfo) {
        kotlin.jvm.internal.o.g(pageInfo, "pageInfo");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f327212b;
        if (concurrentHashMap.containsKey(pageInfo.f327194a)) {
            com.tencent.mars.xlog.Log.i("LiveExposeTimeReporter", "same page " + pageInfo.f327194a + ", return");
            return;
        }
        pageInfo.f327196c = c01.id.c();
        com.tencent.mars.xlog.Log.i("LiveExposeTimeReporter", "onExpose " + pageInfo);
        concurrentHashMap.put(pageInfo.f327194a, pageInfo);
        pageInfo.f327195b.k();
    }
}

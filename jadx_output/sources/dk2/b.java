package dk2;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.b f233228a = new dk2.b();

    public final java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            lo0.a0 a0Var = ko0.l.f309870a.b().f320080e;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (lo0.k kVar : a0Var.f319954e) {
                jSONObject2.put(kVar.f320018a, a06.d.a(kVar.f320032o * 100.0d));
            }
            jSONObject.put("type", a0Var.f319950a);
            jSONObject.put("result", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return r26.i0.t(jSONObject3, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.BeautySuitDataManager", e17.toString());
            return "";
        }
    }
}

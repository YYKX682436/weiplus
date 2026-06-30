package hc2;

/* loaded from: classes.dex */
public abstract class k {
    public static final java.lang.String a(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderExt", e17.getMessage());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}

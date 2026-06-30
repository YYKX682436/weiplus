package ri;

/* loaded from: classes.dex */
public abstract class l0 {
    public static final org.json.JSONObject a(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        try {
            return new org.json.JSONObject(map);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String b(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        try {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
            return "";
        }
    }
}

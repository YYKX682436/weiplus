package ht2;

/* loaded from: classes.dex */
public abstract class z0 {
    public static final java.lang.String a(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (jSONObject.opt(next) == null) {
                jSONObject.remove(next);
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}

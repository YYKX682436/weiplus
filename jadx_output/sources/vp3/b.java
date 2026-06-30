package vp3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final vp3.b f438968a = new vp3.b();

    public final java.lang.String a() {
        java.util.Map f17 = com.tencent.matrix.lifecycle.owners.f0.f52742x.f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : ((java.util.HashMap) f17).entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, entry.getKey());
                jSONObject2.put("C", ((java.lang.Number) entry.getValue()).intValue());
                jSONArray.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("total", i17);
            jSONObject3.put("leak", jSONArray);
            jSONObject = jSONObject3;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryHookHelper", th6, "", new java.lang.Object[0]);
        }
        try {
            java.lang.String jSONObject4 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return r26.i0.t(jSONObject4, ",", ";", false);
        } catch (java.lang.Throwable th7) {
            oj.j.d("Matrix.Safe", th7, "", new java.lang.Object[0]);
            return "";
        }
    }
}

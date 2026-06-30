package xp3;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final xp3.j f455928a = new xp3.j();

    public static final void a(long j17, long j18, int i17, long j19, java.lang.String top1BmStack, int i18, long j27, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(top1BmStack, "top1BmStack");
        xp3.j jVar = f455928a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (j19 > 0) {
                jSONObject.put("bmSize", j19);
                jSONObject.put("bmCount", i17);
                jSONObject.put("t1Size", j27);
                jSONObject.put("t1Count", i18);
                jSONObject.put("t1Stack", top1BmStack);
            }
            str2 = "";
            try {
                ri.k0.f395920a.a(new ri.j0(400, null, 0, 0, j17, j18, j27, i18, top1BmStack, 0, null, i17, null, j19, 0L, 0L, str == null ? "" : str, ri.l0.b(jVar.b(com.tencent.matrix.lifecycle.owners.f0.f52742x.f())), 0, 0, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67316210, 1, null));
            } catch (java.lang.Throwable th6) {
                th = th6;
                oj.j.d("MicroMsg.ProcessCheckerReportHelper", th, str2, new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str2 = "";
        }
    }

    public final org.json.JSONObject b(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, entry.getKey());
                jSONObject2.put("C", ((java.lang.Number) entry.getValue()).intValue());
                jSONArray.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("total", i17);
            jSONObject3.put("leak", jSONArray);
            return jSONObject3;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.ProcessCheckerReportHelper", th6, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }
}

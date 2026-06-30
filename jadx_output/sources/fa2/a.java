package fa2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final fa2.a f260706a = new fa2.a();

    public static void a(fa2.a aVar, android.content.Context context, java.lang.String str, int i17, int i18, r45.hj2 hj2Var, org.json.JSONObject jSONObject, int i19, java.lang.Object obj) {
        long j17;
        java.lang.String str2;
        java.lang.String string;
        r45.zi2 zi2Var;
        java.lang.String str3 = "";
        java.lang.String eid = (i19 & 2) != 0 ? "" : str;
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 138;
        }
        if ((i19 & 16) != 0) {
            hj2Var = null;
        }
        if ((i19 & 32) != 0) {
            jSONObject = null;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eid, "eid");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (hj2Var != null) {
            try {
                j17 = hj2Var.getLong(0);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderMusicReporter", e17.getMessage());
            }
        } else {
            j17 = 0;
        }
        jSONObject.put("music_profile_id", pm0.v.u(j17));
        if (hj2Var == null || (zi2Var = (r45.zi2) hj2Var.getCustom(3)) == null || (str2 = zi2Var.getString(12)) == null) {
            str2 = "";
        }
        jSONObject.put("songid", str2);
        if (hj2Var != null && (string = hj2Var.getString(15)) != null) {
            str3 = string;
        }
        jSONObject.put("audioId", str3);
        com.tencent.mars.xlog.Log.i("FinderMusicReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i18 + " action:" + i17 + " eid:" + eid + " udf_kv:" + jSONObject);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        g0Var.d(21875, Ri, str4, valueOf2, valueOf3, valueOf, eid, r26.i0.t(jSONObject2, ",", ";", false));
    }

    public final void b(android.content.Context context, int i17, r45.hj2 hj2Var, int i18, java.lang.String wording) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wording, "wording");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("jump_type", i18);
            byte[] bytes = wording.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            jSONObject.put("wording", android.util.Base64.encodeToString(bytes, 2));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("FinderMusicReporter", e17.getMessage());
        }
        a(this, context, "music_people_cell", i17, 0, hj2Var, jSONObject, 8, null);
    }
}

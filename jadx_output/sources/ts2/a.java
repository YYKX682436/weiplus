package ts2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ts2.a f421620a = new ts2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f421621b;

    static {
        rg.c cVar = rg.c.DIMENSION_LEVEL_360;
        f421621b = "\n        {\n        \"level\":2,\n        \"interval\":1.0\n        }\n    ";
    }

    public static com.tencent.maas.camerafun.MJAuditCaptureSettings a(ts2.a aVar, java.lang.String session, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(session, "session");
        dw3.h hVar = dw3.h.f244211a;
        java.lang.String a17 = hVar.a("mj".concat(session));
        if (z17) {
            com.tencent.mm.vfs.w6.f(a17);
            hVar.a("mj".concat(session));
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_template_record_security_config, f421621b, true);
        if (android.text.TextUtils.isEmpty(Zi)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            rg.c cVar = rg.c.DIMENSION_LEVEL_360;
            rg.c a18 = rg.c.a(jSONObject.optInt(ya.b.LEVEL, 2));
            double optDouble = jSONObject.optDouble("interval", 1.0d);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordTemplateConfig", "getMJAuditCaptureSettings level:" + a18 + " interval:" + optDouble + " dir:" + a17);
            return new com.tencent.maas.camerafun.MJAuditCaptureSettings(a18, optDouble, jg.c.JPEGs, a17, "mjScy");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordTemplateConfig", e17, "getMJAuditCaptureSettings error", new java.lang.Object[0]);
            return null;
        }
    }
}

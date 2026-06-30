package y42;

/* loaded from: classes7.dex */
public class a extends x42.a {
    @Override // x42.b
    public java.lang.String a() {
        return "debug_alert";
    }

    @Override // x42.b
    public java.lang.Object b(com.eclipsesource.mmv8.V8Array v8Array) {
        com.tencent.mm.sdk.platformtools.o4 e17;
        if (v8Array != null && v8Array.length() >= 1) {
            java.lang.String string = v8Array.getString(0);
            if (u46.l.e(string)) {
                return null;
            }
            g42.i.a("EdgeComputingJsApiBase", "[EdgeComputingJsApiDebugAlert] logic, msg : " + string);
            if (!u46.l.e(string) && (e17 = g42.i.e()) != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = "mmkv_key_log_last_report_time" + t42.a.f415498b;
                if ((currentTimeMillis - e17.getLong(str, 0L) > 604800000 || g42.i.g()) && t42.a.a()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20176, t42.a.f415498b, 12, 0, 0, string.replace(",", ";"));
                    e17.putLong(str, currentTimeMillis);
                }
            }
        }
        return null;
    }

    @Override // x42.b
    public int getType() {
        return 1;
    }

    @Override // x42.b
    public void release() {
    }
}

package d55;

/* loaded from: classes12.dex */
public abstract class t {
    public static void a(android.content.Context context, java.lang.String str, com.tencent.mm.recoveryv2.RecoveryCrash$Record recoveryCrash$Record, d55.s sVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "fallback");
            jSONObject.put("time", recoveryCrash$Record.f192207e);
            jSONObject.put("crash_count", recoveryCrash$Record.f192206d);
            jSONObject.put("version", recoveryCrash$Record.f192208f);
            jSONObject.put("actions", ((d55.r) sVar).f226612b.toString());
            context.getSharedPreferences("recovery_journal_fallback", 4).edit().putString(str, jSONObject.toString()).apply();
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery.journal", "put fallback desc fail", th6);
        }
    }
}

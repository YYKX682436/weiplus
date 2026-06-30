package hw;

/* loaded from: classes7.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final hw.e0 a(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        try {
            cl0.g gVar = new cl0.g(jsonStr);
            return new hw.e0(gVar.getLong("disconnect_as_crash_frequency_threshold_in_microseconds"), gVar.getInt("max_crash_limit_before_close_feature"), gVar.getLong("recover_feature_switch_after_in_seconds"));
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicEcsTLBaseFeatureService", e17, "hy: json parse failed!! use default config, ori json is ".concat(jsonStr), new java.lang.Object[0]);
            return a("\n            {\"disconnect_as_crash_frequency_threshold_in_microseconds\": 30000,\n            \"max_crash_limit_before_close_feature\": 3,\n            \"recover_feature_switch_after_in_seconds\": 86400}\n        ");
        }
    }
}

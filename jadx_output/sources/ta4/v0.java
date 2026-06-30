package ta4;

/* loaded from: classes.dex */
public abstract class v0 {
    public static final java.lang.String a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporterKt");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporterKt");
        return t17;
    }
}

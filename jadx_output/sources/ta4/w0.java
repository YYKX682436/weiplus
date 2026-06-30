package ta4;

/* loaded from: classes4.dex */
public final class w0 {
    public w0(kotlin.jvm.internal.i iVar) {
    }

    public final ta4.x0 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        if (ta4.x0.a().isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
            return null;
        }
        ta4.x0 x0Var = (ta4.x0) ta4.x0.a().removeFirst();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        return x0Var;
    }

    public final ta4.x0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        ta4.x0 x0Var = new ta4.x0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        return x0Var;
    }
}

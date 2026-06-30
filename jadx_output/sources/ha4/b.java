package ha4;

/* loaded from: classes4.dex */
public abstract class b {
    public static void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.lucky.model.ConstantsLuckyIDKEY");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(270L, i17, 1L, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.lucky.model.ConstantsLuckyIDKEY");
    }
}

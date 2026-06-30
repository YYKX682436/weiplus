package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class r3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.t3 f164643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.sns.model.t3 t3Var, android.os.Looper looper) {
        super(looper);
        this.f164643a = t3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.model.t3 t3Var = this.f164643a;
        int i17 = t3Var.f164690c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        if (i17 < 5) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            long j17 = t3Var.f164689b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            if (currentTimeMillis - j17 <= 300000) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                boolean z17 = t3Var.f164688a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
                    return;
                }
                if (com.tencent.mm.plugin.sns.model.t3.f164686e) {
                    new com.tencent.mm.plugin.sns.model.s3(t3Var).f("");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.model.t3.f164686e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
    }
}

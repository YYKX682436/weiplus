package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.k6 f164307d;

    public i6(com.tencent.mm.plugin.sns.model.k6 k6Var) {
        this.f164307d = k6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "run resetTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.model.k6 k6Var = this.f164307d;
        k6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDraftTmpFile", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.j6(k6Var, k6Var.f164363b));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDraftTmpFile", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        k6Var.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataChanged", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        new com.tencent.mm.autogen.events.SnsRetryEditTipExpiredEvent().e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataChanged", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        k6Var.f164364c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        k6Var.f164365d = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$1");
    }
}

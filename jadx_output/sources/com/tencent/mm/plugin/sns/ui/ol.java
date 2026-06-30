package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pl f170112d;

    public ol(com.tencent.mm.plugin.sns.ui.pl plVar) {
        this.f170112d = plVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17$1");
        synchronized (com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(this.f170112d.f170247d)) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "comment notify");
                com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f170112d.f170247d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI.f167276p = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(this.f170112d.f170247d).onNotifyChange(null, null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17$1");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17$1");
    }
}

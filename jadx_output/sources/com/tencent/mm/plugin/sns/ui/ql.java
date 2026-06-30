package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ql implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170347d;

    public ql(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170347d = snsMsgUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$18");
        if (com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(this.f170347d) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "notifyUI error,because adapter == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$18");
            return;
        }
        synchronized (com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(this.f170347d)) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "notifyUI call adapter onNotifyChange");
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(this.f170347d).onNotifyChange(null, null);
                com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f170347d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3002", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI.f167273m = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3002", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$18");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$18");
    }
}

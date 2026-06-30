package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance f170248d;

    public pm(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance snsMsgUIWithRelevance) {
        this.f170248d = snsMsgUIWithRelevance;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$2");
        try {
            com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance snsMsgUIWithRelevance = this.f170248d;
            snsMsgUIWithRelevance.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursorForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            snsMsgUIWithRelevance.f167268e.q();
            snsMsgUIWithRelevance.Y = true;
            snsMsgUIWithRelevance.n7();
            snsMsgUIWithRelevance.enableOptionMenu(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursorForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUIWithRelevance", "onActivityResult error: " + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$2");
    }
}

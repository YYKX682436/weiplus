package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class nm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll f170018d;

    public nm(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll snsMsgUIWithAll) {
        this.f170018d = snsMsgUIWithAll;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$3");
        try {
            this.f170018d.s7();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUIWithAll", "onActivityResult error: " + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$3");
    }
}

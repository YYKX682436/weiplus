package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.rm f170349e;

    public qm(com.tencent.mm.plugin.sns.ui.rm rmVar, int i17) {
        this.f170349e = rmVar;
        this.f170348d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance$1");
        try {
            this.f170349e.D.setMMTitle(this.f170348d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUIWithRelevance", "setMMTitle error: " + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance$1");
    }
}

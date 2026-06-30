package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.im f168521d;

    public hm(com.tencent.mm.plugin.sns.ui.im imVar) {
        this.f168521d = imVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$2");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        com.tencent.mm.plugin.sns.ui.im imVar = this.f168521d;
        Aj.updateNotify(imVar.f168621d, false, new java.lang.String[0]);
        r45.k76 k76Var = new r45.k76();
        try {
            k76Var.parseFrom(imVar.f168626i.field_curActionBuf);
            com.tencent.mm.plugin.sns.model.d6.l(imVar.f168621d, k76Var.f378458d);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsMsgUI", e17, "bless parse acion error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$2");
    }
}

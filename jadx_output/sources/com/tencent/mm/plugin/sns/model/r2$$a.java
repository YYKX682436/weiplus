package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final /* synthetic */ class r2$$a implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        wa4.q qVar = (wa4.q) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        if (qVar.f444276e == 0) {
            qVar.f444278g = c01.id.c();
        }
        com.tencent.mm.plugin.sns.statistics.j0.f164861a.p(qVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return null;
    }
}

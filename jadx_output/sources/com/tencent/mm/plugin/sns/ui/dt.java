package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dt implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ut f168210d;

    public dt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction, com.tencent.mm.plugin.sns.ui.ut utVar) {
        this.f168210d = utVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12");
        gm0.j1.i();
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68386, null), 0) + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(68386, java.lang.Integer.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.SnsUIAction$$a snsUIAction$$a = (com.tencent.mm.plugin.sns.ui.SnsUIAction$$a) this.f168210d;
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = snsUIAction$$a.f167503a;
        snsUIAction.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$selectPhoto$0", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.o(snsUIAction$$a.f167504b, snsUIAction$$a.f167505c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$selectPhoto$0", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12");
    }
}

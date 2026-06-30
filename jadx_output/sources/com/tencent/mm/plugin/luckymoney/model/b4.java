package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f145177d;

    public b4(com.tencent.mm.plugin.luckymoney.model.d4 d4Var, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f145177d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = this.f145177d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(checkResUpdateCacheFileEvent.f54053g.f7761c)) {
            return;
        }
        if (com.tencent.mm.plugin.luckymoney.model.e5.i(checkResUpdateCacheFileEvent.f54053g.f7761c, com.tencent.mm.plugin.luckymoney.model.e5.e())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update succ");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 22);
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update fail");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 23);
            z17 = false;
        }
        zy.r rVar = (zy.r) i95.n0.c(zy.r.class);
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        ((yy.a) rVar).Ui(r2Var.f7759a, r2Var.f7760b, r2Var.f7762d, z17);
    }
}

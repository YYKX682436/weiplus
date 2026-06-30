package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gk extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo3.m f146954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, fo3.m mVar) {
        super(false);
        this.f146955e = luckyMoneyNotHookReceiveUI;
        this.f146954d = mVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gb3.o.f270035a.a(4);
        li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146955e;
        gVar.Ri(luckyMoneyNotHookReceiveUI, 10, 3);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = luckyMoneyNotHookReceiveUI.D1.f145432y;
        g0Var.d(11701, 5, java.lang.Integer.valueOf(i17 == 1 ? 1 : i17 == 0 ? 2 : 0), java.lang.Integer.valueOf(luckyMoneyNotHookReceiveUI.X6()), 0, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "open btn click! mLiveId[%s]", luckyMoneyNotHookReceiveUI.f146477p1);
        fo3.m mVar = this.f146954d;
        mVar.onClick(view);
        if (mVar.f264915i) {
            w04.l.INSTANCE.ac(540999719, mVar.f264913g, true);
        }
        luckyMoneyNotHookReceiveUI.f146474o.setClickable(false);
        luckyMoneyNotHookReceiveUI.d7(ml2.f5.f327460h, true);
        luckyMoneyNotHookReceiveUI.V6("");
    }
}

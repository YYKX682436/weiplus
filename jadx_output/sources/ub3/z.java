package ub3;

/* loaded from: classes9.dex */
public class z implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb3.c f426149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426150b;

    public z(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI, tb3.c cVar) {
        this.f426150b = luckyMoneyF2FReceiveUI;
        this.f426149a = cVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        com.tencent.mm.protobuf.g gVar;
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f426150b;
        if (i17 != 2 || (gVar = this.f426149a.f417002x) == null) {
            luckyMoneyF2FReceiveUI.finish();
        } else {
            luckyMoneyF2FReceiveUI.doSceneProgress(new tb3.c(luckyMoneyF2FReceiveUI.f145099n, gVar), true);
        }
    }
}

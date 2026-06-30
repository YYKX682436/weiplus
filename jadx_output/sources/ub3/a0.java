package ub3;

/* loaded from: classes9.dex */
public class a0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f426087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426088e;

    public a0(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI, com.tencent.mm.protobuf.g gVar) {
        this.f426088e = luckyMoneyF2FReceiveUI;
        this.f426087d = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.utils.y yVar = (com.tencent.mm.plugin.wallet_core.utils.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f426088e;
        long j17 = luckyMoneyF2FReceiveUI.f145110y;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (longValue != j17) {
            com.tencent.mars.xlog.Log.e("LuckyMoneyF2FReceiveUI", "unexpected halfpage callback");
        } else {
            luckyMoneyF2FReceiveUI.f145110y = 0L;
            if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181000f) {
                luckyMoneyF2FReceiveUI.doSceneProgress(new tb3.c(luckyMoneyF2FReceiveUI.f145099n, this.f426087d), true);
            } else {
                luckyMoneyF2FReceiveUI.finish();
            }
        }
        return f0Var;
    }
}

package ub3;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb3.c f426095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426096e;

    public c0(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI, tb3.c cVar) {
        this.f426096e = luckyMoneyF2FReceiveUI;
        this.f426095d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.protobuf.g gVar = this.f426095d.f417002x;
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f426096e;
        if (gVar == null || gVar.f192156a.length <= 0) {
            luckyMoneyF2FReceiveUI.finish();
        } else {
            luckyMoneyF2FReceiveUI.doSceneProgress(new tb3.c(luckyMoneyF2FReceiveUI.f145099n, gVar), true);
        }
    }
}

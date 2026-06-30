package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class a3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146691a;

    public a3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f146691a = luckyMoneyDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "getRedpacketFission resp errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f146691a;
        if (luckyMoneyDetailUI.isFinishing() || luckyMoneyDetailUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "this activity has finished do not show fissison entrance");
            return null;
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null || !((r45.xm3) fVar).f390231d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "do not show fissison entrance");
            luckyMoneyDetailUI.f146095s2 = false;
            luckyMoneyDetailUI.X.setVisibility(8);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "show fissison entrance");
        luckyMoneyDetailUI.f146095s2 = true;
        luckyMoneyDetailUI.X.setVisibility(0);
        gb3.m.a(21, luckyMoneyDetailUI.V2);
        luckyMoneyDetailUI.Z.setText(((r45.xm3) fVar2.f70618d).f390232e);
        n11.a b17 = n11.a.b();
        java.lang.String str = ((r45.xm3) fVar2.f70618d).f390233f;
        android.widget.ImageView imageView = luckyMoneyDetailUI.Y;
        o11.f fVar3 = new o11.f();
        fVar3.f342091o = com.tencent.mm.R.drawable.bgo;
        fVar3.f342079c = true;
        b17.h(str, imageView, fVar3.a());
        if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.xm3) fVar2.f70618d).f390235h)) {
            return null;
        }
        luckyMoneyDetailUI.X.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.z2(this, fVar2));
        return null;
    }
}

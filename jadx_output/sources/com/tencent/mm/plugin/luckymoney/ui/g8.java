package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146934a;

    public g8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146934a = luckyMoneyNewDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "getRedpacketFission resp errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146934a;
        if (luckyMoneyNewDetailUI.isFinishing() || luckyMoneyNewDetailUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "this activity has finished do not show fissison entrance");
        } else if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null && ((r45.xm3) fVar).f390231d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "show fissison entrance");
            luckyMoneyNewDetailUI.f146221s2 = true;
            android.widget.LinearLayout linearLayout2 = luckyMoneyNewDetailUI.X;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            gb3.m.a(21, luckyMoneyNewDetailUI.V2);
            android.widget.TextView textView = luckyMoneyNewDetailUI.Z;
            if (textView != null) {
                r45.xm3 xm3Var = (r45.xm3) fVar2.f70618d;
                textView.setText(xm3Var != null ? xm3Var.f390232e : null);
            }
            n11.a b17 = n11.a.b();
            r45.xm3 xm3Var2 = (r45.xm3) fVar2.f70618d;
            java.lang.String str = xm3Var2 != null ? xm3Var2.f390233f : null;
            android.widget.ImageView imageView = luckyMoneyNewDetailUI.Y;
            o11.f fVar3 = new o11.f();
            fVar3.f342091o = com.tencent.mm.R.drawable.bgo;
            fVar3.f342079c = true;
            b17.h(str, imageView, fVar3.a());
            r45.xm3 xm3Var3 = (r45.xm3) fVar2.f70618d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xm3Var3 != null ? xm3Var3.f390235h : null) && (linearLayout = luckyMoneyNewDetailUI.X) != null) {
                linearLayout.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.f8(fVar2, luckyMoneyNewDetailUI));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "do not show fissison entrance");
            luckyMoneyNewDetailUI.f146221s2 = false;
            android.widget.LinearLayout linearLayout3 = luckyMoneyNewDetailUI.X;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        return null;
    }
}

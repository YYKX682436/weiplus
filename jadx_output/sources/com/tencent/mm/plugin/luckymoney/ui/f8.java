package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f146899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146900e;

    public f8(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146899d = fVar;
        this.f146900e = luckyMoneyNewDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$getRedpacketFissionEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.modelbase.f fVar = this.f146899d;
        r45.xm3 xm3Var = (r45.xm3) fVar.f70618d;
        objArr[0] = xm3Var != null ? xm3Var.f390235h : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click fissison entrance： %s", objArr);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146900e;
        gb3.m.a(22, luckyMoneyNewDetailUI.V2);
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewDetailUI.getContext();
        r45.xm3 xm3Var2 = (r45.xm3) fVar.f70618d;
        com.tencent.mm.wallet_core.ui.r1.V(context, xm3Var2 != null ? xm3Var2.f390235h : null, true);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$getRedpacketFissionEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

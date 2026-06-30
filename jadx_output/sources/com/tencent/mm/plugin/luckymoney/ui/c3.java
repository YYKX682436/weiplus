package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eg7 f146773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146774e;

    public c3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, r45.eg7 eg7Var) {
        this.f146774e = luckyMoneyDetailUI;
        this.f146773d = eg7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "[setWxAppInfoEntrance] click wxapp entrance");
        gb3.m.a(42, this.f146774e.V2);
        r45.eg7 eg7Var = this.f146773d;
        com.tencent.mm.wallet_core.ui.r1.b0(eg7Var.f373466d, eg7Var.f373467e, 0, 1100);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

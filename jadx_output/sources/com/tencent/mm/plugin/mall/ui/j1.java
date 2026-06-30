package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.k1 f148416d;

    public j1(com.tencent.mm.plugin.mall.ui.k1 k1Var) {
        this.f148416d = k1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(5);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 1);
        com.tencent.mm.plugin.mall.ui.k1 k1Var = this.f148416d;
        j45.l.j(k1Var.f148427h.getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent, null);
        com.tencent.mm.wallet_core.model.n1.d(9, 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11850, 5, 0);
        g0Var.d(14419, k1Var.f148427h.f148243h, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

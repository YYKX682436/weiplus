package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes3.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155254d;

    public y0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155254d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155254d;
        intent.putExtra("rawUrl", rechargeUI.D);
        j45.l.j(rechargeUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

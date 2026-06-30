package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155152d;

    public d1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155152d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155152d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rechargeUI.f155135t.f179827o.f179837m)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", rechargeUI.f155135t.f179827o.f179837m);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(rechargeUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

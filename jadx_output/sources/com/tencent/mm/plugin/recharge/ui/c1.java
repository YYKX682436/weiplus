package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155148d;

    public c1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155148d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bt4.f b17 = bt4.f.b();
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155148d;
        java.lang.String str = rechargeUI.f155135t.f179819d;
        b17.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.HashMap hashMap = (java.util.HashMap) b17.f24470a;
            if (hashMap.containsKey(str)) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) hashMap.get(str);
                if ("1".equals(mallNews.f179831d)) {
                    mallNews.f179831d = "2";
                    b17.g();
                }
            }
        }
        rechargeUI.f155127i.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

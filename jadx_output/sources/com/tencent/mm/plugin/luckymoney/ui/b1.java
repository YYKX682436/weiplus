package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class b1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI f146734d;

    public b1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI) {
        this.f146734d = luckyMoneyCanShareListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI = this.f146734d;
        com.tencent.mm.plugin.luckymoney.model.o4 item = luckyMoneyCanShareListUI.f146041h.getItem((int) j17);
        if (item != null && !com.tencent.mm.sdk.platformtools.t8.K0(item.f145509t)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(luckyMoneyCanShareListUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_sendid", item.f145509t);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI2 = this.f146734d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(luckyMoneyCanShareListUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyCanShareListUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(luckyMoneyCanShareListUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyCanShareListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class n6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147223d;

    public n6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        this.f147223d = luckyMoneyMyRecordUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.luckymoney.model.o4 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int i18 = (int) j17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i19 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.I;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147223d;
        g0Var.d(11701, java.lang.Integer.valueOf(luckyMoneyMyRecordUI.f146154g == 1 ? 8 : 9), 0, 0, 0, 2);
        if (i18 >= 0 && i18 < luckyMoneyMyRecordUI.f146166v.getCount() && (item = luckyMoneyMyRecordUI.f146166v.getItem(i18)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(item.f145509t)) {
            android.content.Intent intent = new android.content.Intent();
            int i27 = item.f145510u;
            if (i27 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go busi detail");
                intent.setClass(luckyMoneyMyRecordUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.class);
            } else if (i27 == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go union detail");
                intent.putExtra("key_hb_kind", item.f145510u);
                intent.setClass(luckyMoneyMyRecordUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
            } else if (i27 == 6) {
                intent.putExtra("key_hb_kind", i27);
                intent.putExtra("key_hk_scene", 2);
                intent.setClass(luckyMoneyMyRecordUI.getContext(), com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.class);
            } else if (i27 == 7) {
                intent.putExtra("key_hb_kind", i27);
                intent.setClass(luckyMoneyMyRecordUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go normal detail");
                intent.setClass(luckyMoneyMyRecordUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
            }
            intent.putExtra("key_sendid", item.f145509t);
            int i28 = luckyMoneyMyRecordUI.f146154g == 1 ? 3 : 1;
            intent.putExtra("key_jump_from", i28);
            if (i28 == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(item.f145508s)) {
                intent.putExtra("key_receiveid", item.f145508s);
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI2 = this.f147223d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(luckyMoneyMyRecordUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyMyRecordUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(luckyMoneyMyRecordUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.w6 f147444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147445e;

    public t6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI, com.tencent.mm.plugin.luckymoney.ui.w6 w6Var) {
        this.f147445e = luckyMoneyMyRecordUI;
        this.f147444d = w6Var;
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
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147445e;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = luckyMoneyMyRecordUI.H;
        if (j0Var != null && j0Var.isShowing()) {
            luckyMoneyMyRecordUI.H.dismiss();
        }
        com.tencent.mm.plugin.luckymoney.ui.w6 w6Var = this.f147444d;
        java.lang.String str = (java.lang.String) w6Var.f147635d.get(i17);
        w6Var.f147636e = i17;
        if (!str.equals(luckyMoneyMyRecordUI.C)) {
            luckyMoneyMyRecordUI.C = str;
            luckyMoneyMyRecordUI.f146162r.setText(luckyMoneyMyRecordUI.getString(com.tencent.mm.R.string.gnd, str));
            luckyMoneyMyRecordUI.f146167w = 0;
            ((java.util.LinkedList) luckyMoneyMyRecordUI.f146168x).clear();
            ((java.util.HashMap) luckyMoneyMyRecordUI.f146170z).clear();
            java.util.ArrayList arrayList2 = luckyMoneyMyRecordUI.f146169y;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            luckyMoneyMyRecordUI.W6();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(luckyMoneyMyRecordUI.f146154g == 1 ? 8 : 9), 0, 0, 0, 3, str);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

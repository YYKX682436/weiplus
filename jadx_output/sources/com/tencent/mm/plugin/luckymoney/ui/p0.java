package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r5 f147297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f147298e;

    public p0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI, com.tencent.mm.plugin.luckymoney.model.r5 r5Var) {
        this.f147298e = luckyMoneyBusiReceiveUI;
        this.f147297d = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f147298e;
        android.view.View view2 = luckyMoneyBusiReceiveUI.f146015s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyBusiReceiveUI.f146021y.setVisibility(8);
        android.view.View view3 = luckyMoneyBusiReceiveUI.f146013q;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.luckymoney.model.r5 r5Var = this.f147297d;
        com.tencent.mm.plugin.luckymoney.model.h0 h0Var = r5Var.f145588r;
        luckyMoneyBusiReceiveUI.f146020x.setText((h0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f145306f)) ? luckyMoneyBusiReceiveUI.getString(com.tencent.mm.R.string.gny) : r5Var.f145588r.f145306f);
        luckyMoneyBusiReceiveUI.f146019w.setText(r5Var.f145585o);
        android.view.View view4 = luckyMoneyBusiReceiveUI.f146018v;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyBusiReceiveUI.f146020x.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.n0(this));
        com.tencent.mm.plugin.luckymoney.model.m5.B(luckyMoneyBusiReceiveUI.f146015s, new com.tencent.mm.plugin.luckymoney.ui.o0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

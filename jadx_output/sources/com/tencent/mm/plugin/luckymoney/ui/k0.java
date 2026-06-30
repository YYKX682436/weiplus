package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f147091d;

    public k0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        this.f147091d = luckyMoneyBusiReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 11, 0, 0, 0, 4);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f147091d;
        intent.setClass(luckyMoneyBusiReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.class);
        intent.putExtra("key_native_url", luckyMoneyBusiReceiveUI.B);
        intent.putExtra("key_sendid", luckyMoneyBusiReceiveUI.G.f145617i);
        intent.putExtra("key_static_from_scene", luckyMoneyBusiReceiveUI.F);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI2 = this.f147091d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(luckyMoneyBusiReceiveUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(luckyMoneyBusiReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

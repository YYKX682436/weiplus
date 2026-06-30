package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r5 f147359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f147360e;

    public r0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI, com.tencent.mm.plugin.luckymoney.model.r5 r5Var) {
        this.f147360e = luckyMoneyBusiReceiveUI;
        this.f147359d = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f147360e;
        intent.setClass(luckyMoneyBusiReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.class);
        com.tencent.mm.plugin.luckymoney.model.r5 r5Var = this.f147359d;
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = r5Var.f145591u;
        if (realnameGuideHelper != null) {
            intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
        }
        intent.putExtra("key_native_url", luckyMoneyBusiReceiveUI.B);
        intent.putExtra("key_sendid", r5Var.f145581h);
        intent.putExtra("key_static_from_scene", luckyMoneyBusiReceiveUI.F);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI2 = this.f147360e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(luckyMoneyBusiReceiveUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(luckyMoneyBusiReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiReceiveUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

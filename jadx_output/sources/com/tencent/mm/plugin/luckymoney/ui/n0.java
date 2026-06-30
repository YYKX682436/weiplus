package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.p0 f147213d;

    public n0(com.tencent.mm.plugin.luckymoney.ui.p0 p0Var) {
        this.f147213d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 12, 0, 0, 0, 2);
        com.tencent.mm.plugin.luckymoney.model.m5.p(this.f147213d.f147298e, 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

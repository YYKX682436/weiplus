package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f147755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.a3 f147756e;

    public z2(com.tencent.mm.plugin.luckymoney.ui.a3 a3Var, com.tencent.mm.modelbase.f fVar) {
        this.f147756e = a3Var;
        this.f147755d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$43$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.modelbase.f fVar = this.f147755d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "click fissison entrance： %s", ((r45.xm3) fVar.f70618d).f390235h);
        com.tencent.mm.plugin.luckymoney.ui.a3 a3Var = this.f147756e;
        gb3.m.a(22, a3Var.f146691a.V2);
        com.tencent.mm.wallet_core.ui.r1.V(a3Var.f146691a.getContext(), ((r45.xm3) fVar.f70618d).f390235h, true);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$43$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vn implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.zm f147584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147585e;

    public vn(com.tencent.mm.plugin.luckymoney.ui.co coVar, com.tencent.mm.plugin.luckymoney.ui.zm zmVar) {
        this.f147585e = coVar;
        this.f147584d = zmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.ui.zm zmVar = this.f147584d;
        if (zmVar.f147793b != null) {
            com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147585e;
            int layoutPosition = coVar.getLayoutPosition();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.V6(coVar.M, layoutPosition);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "longclick normalVh realPos : %s ，mSelectPos：%s", java.lang.Integer.valueOf(layoutPosition), java.lang.Integer.valueOf(coVar.M.f146534v));
            com.tencent.mm.plugin.luckymoney.ui.co.o(coVar, view, 1, zmVar.f147793b.f389500f);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

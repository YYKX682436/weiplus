package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ps implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f119426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119427e;

    public ps(r45.dz1 dz1Var, com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f119426d = dz1Var;
        this.f119427e = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.dz1 dz1Var = this.f119426d;
        int integer = dz1Var.getInteger(7);
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119427e;
        if (integer == 1) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = etVar.I;
            qo0.b bVar = qo0.b.f365393o3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS", true);
            k0Var.statusChange(bVar, bundle);
            com.tencent.mm.plugin.finder.live.widget.e0.t(etVar, false, 1, null);
        } else if (etVar.m0()) {
            android.content.Context context = etVar.f118183e;
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.dpv));
        } else {
            kotlinx.coroutines.y0 y0Var = etVar.E;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.xs(dz1Var, etVar, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

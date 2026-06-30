package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class us implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rr f119997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f119998f;

    public us(com.tencent.mm.plugin.finder.live.widget.et etVar, com.tencent.mm.plugin.finder.live.widget.rr rrVar, r45.dz1 dz1Var) {
        this.f119996d = etVar;
        this.f119997e = rrVar;
        this.f119998f = dz1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119996d;
        int[] iArr = etVar.P;
        int i17 = iArr[0];
        com.tencent.mm.plugin.finder.live.widget.rr rrVar = this.f119997e;
        if (i17 == 0 || iArr[1] == 0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r4Var.M2(etVar.f118280J, "onItemLongClickCallback before change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
            rrVar.itemView.getLocationOnScreen(etVar.P);
            r4Var.M2(etVar.f118280J, "onItemLongClickCallback after change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
        }
        com.tencent.mm.plugin.finder.live.widget.et.h0(etVar).a();
        rl5.r h07 = com.tencent.mm.plugin.finder.live.widget.et.h0(etVar);
        android.view.View view2 = rrVar.itemView;
        com.tencent.mm.plugin.finder.live.widget.rs rsVar = new com.tencent.mm.plugin.finder.live.widget.rs(etVar);
        com.tencent.mm.plugin.finder.live.widget.ts tsVar = new com.tencent.mm.plugin.finder.live.widget.ts(etVar, this.f119998f);
        int[] iArr2 = etVar.P;
        h07.h(view2, rsVar, tsVar, iArr2[0], iArr2[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshLotteryItemView$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

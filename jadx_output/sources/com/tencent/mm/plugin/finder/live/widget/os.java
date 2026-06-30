package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class os implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rr f119318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f119319f;

    public os(com.tencent.mm.plugin.finder.live.widget.et etVar, com.tencent.mm.plugin.finder.live.widget.rr rrVar, r45.vv1 vv1Var) {
        this.f119317d = etVar;
        this.f119318e = rrVar;
        this.f119319f = vv1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshGiftItemView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119317d;
        int[] iArr = etVar.P;
        int i17 = iArr[0];
        com.tencent.mm.plugin.finder.live.widget.rr rrVar = this.f119318e;
        if (i17 == 0 || iArr[1] == 0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r4Var.M2(etVar.f118280J, "onItemLongClickCallback before change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
            rrVar.itemView.getLocationOnScreen(etVar.P);
            r4Var.M2(etVar.f118280J, "onItemLongClickCallback after change x:" + etVar.P[0] + ", original y:" + etVar.P[1]);
        }
        com.tencent.mm.plugin.finder.live.widget.et.h0(etVar).a();
        rl5.r h07 = com.tencent.mm.plugin.finder.live.widget.et.h0(etVar);
        android.view.View view2 = rrVar.itemView;
        com.tencent.mm.plugin.finder.live.widget.ks ksVar = new com.tencent.mm.plugin.finder.live.widget.ks(etVar);
        com.tencent.mm.plugin.finder.live.widget.ns nsVar = new com.tencent.mm.plugin.finder.live.widget.ns(etVar, this.f119319f);
        int[] iArr2 = etVar.P;
        h07.h(view2, ksVar, nsVar, iArr2[0], iArr2[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$refreshGiftItemView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

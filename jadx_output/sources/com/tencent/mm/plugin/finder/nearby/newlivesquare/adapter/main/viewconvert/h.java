package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.c f121697f;

    public h(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar, vp2.c cVar) {
        this.f121695d = s0Var;
        this.f121696e = tVar;
        this.f121697f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ne1 ne1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f121695d;
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) s0Var.itemView.findViewById(com.tencent.mm.R.id.lqa)).getAdapter();
        com.tencent.mm.protobuf.g gVar = null;
        up2.e eVar = adapter instanceof up2.e ? (up2.e) adapter : null;
        vp2.c cVar = this.f121697f;
        if (eVar != null) {
            vp2.f fVar = (vp2.f) ((in5.c) kz5.n0.a0(eVar.I, eVar.F0(cVar.f438912f)));
            if (fVar != null && (ne1Var = fVar.f438919d) != null) {
                gVar = ne1Var.f381307e;
            }
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t.n(this.f121696e, s0Var, cVar, gVar);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

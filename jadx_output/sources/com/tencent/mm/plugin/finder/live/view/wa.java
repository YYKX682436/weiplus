package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f116783f;

    public wa(com.tencent.mm.plugin.finder.live.view.gb gbVar, int i17, r45.a52 a52Var) {
        this.f116781d = gbVar;
        this.f116782e = i17;
        this.f116783f = a52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f116781d.T;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(this.f116782e), (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f116783f.getCustom(8));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

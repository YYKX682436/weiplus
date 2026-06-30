package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class za implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f116861e;

    public za(com.tencent.mm.plugin.finder.live.view.gb gbVar, r45.a52 a52Var) {
        this.f116860d = gbVar;
        this.f116861e = a52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116860d;
        wt2.a aVar = gbVar.R;
        if (aVar != null) {
            aVar.B4(this.f116861e, new com.tencent.mm.plugin.finder.live.view.ya(gbVar));
        }
        gbVar.s(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

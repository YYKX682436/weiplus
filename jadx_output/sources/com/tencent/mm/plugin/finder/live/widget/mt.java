package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class mt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f119119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pt f119120e;

    public mt(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.live.widget.pt ptVar) {
        this.f119119d = recyclerView;
        this.f119120e = ptVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveQcPollBottomSheetWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.recyclerview.widget.f2 adapter = this.f119119d.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.widget.FinderLiveQcPollBottomSheetWidget.RecyclerViewAdapter");
        com.tencent.mm.plugin.finder.live.widget.ht htVar = (com.tencent.mm.plugin.finder.live.widget.ht) adapter;
        java.util.Set x17 = htVar.x();
        kotlin.jvm.internal.o.g(x17, "<this>");
        boolean z17 = !x17.isEmpty();
        com.tencent.mm.plugin.finder.live.widget.pt ptVar = this.f119120e;
        if (z17) {
            java.util.Set x18 = htVar.x();
            java.util.List list = ptVar.H.f233583e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (x18.contains(((dk2.ic) obj).f233622a)) {
                    arrayList2.add(obj);
                }
            }
            ptVar.f119428J.invoke(ptVar.H, arrayList2);
            ptVar.N = true;
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(ptVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveQcPollBottomSheetWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

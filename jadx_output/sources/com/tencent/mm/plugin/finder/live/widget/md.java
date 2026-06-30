package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class md implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f119065d;

    public md(com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView) {
        this.f119065d = finderLiveDescEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView.f117603p;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f119065d;
        finderLiveDescEditView.a();
        yz5.a aVar = finderLiveDescEditView.f117607g;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

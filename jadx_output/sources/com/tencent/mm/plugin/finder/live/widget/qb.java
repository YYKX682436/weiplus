package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sb f119517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.v1 f119518e;

    public qb(com.tencent.mm.plugin.finder.live.widget.sb sbVar, com.tencent.mm.plugin.finder.live.widget.v1 v1Var) {
        this.f119517d = sbVar;
        this.f119518e = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLivePreparePanelAnchorAdapter$AnchorItemHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f119517d.f119748f;
        if (lVar != null) {
            lVar.invoke(this.f119518e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLivePreparePanelAnchorAdapter$AnchorItemHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

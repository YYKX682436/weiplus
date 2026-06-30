package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f118760d;

    public jj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget) {
        this.f118760d = finderLiveFinderDetailWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFinderDetailWidget$setupNoticeActionBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.i2[] i2VarArr = ml2.i2.f327553d;
        int i17 = com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget.B;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget = this.f118760d;
        finderLiveFinderDetailWidget.b(2, 2);
        kotlinx.coroutines.y0 y0Var = finderLiveFinderDetailWidget.f117636z;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.ij(finderLiveFinderDetailWidget, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFinderDetailWidget$setupNoticeActionBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

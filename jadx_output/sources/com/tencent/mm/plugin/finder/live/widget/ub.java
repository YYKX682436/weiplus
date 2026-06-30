package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ub implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yb f119967d;

    public ub(com.tencent.mm.plugin.finder.live.widget.yb ybVar) {
        this.f119967d = ybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveSettingPanel", "cancel button clicked");
        com.tencent.mm.plugin.finder.live.widget.yb ybVar = this.f119967d;
        ybVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.e0.t(ybVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

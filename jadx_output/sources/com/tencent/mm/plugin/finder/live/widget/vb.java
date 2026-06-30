package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yb f120058d;

    public vb(com.tencent.mm.plugin.finder.live.widget.yb ybVar) {
        this.f120058d = ybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("confirm button clicked, settlementMode=");
        com.tencent.mm.plugin.finder.live.widget.yb ybVar = this.f120058d;
        sb6.append(ybVar.H.f120117a);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveSettingPanel", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.e0.t(ybVar, false, 1, null);
        yz5.a aVar = ybVar.I;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

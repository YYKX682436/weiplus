package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yb f120168d;

    public wb(com.tencent.mm.plugin.finder.live.widget.yb ybVar) {
        this.f120168d = ybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initSettlementModeItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveSettingPanel", "settlement mode item clicked, show select panel");
        com.tencent.mm.plugin.finder.live.widget.yb ybVar = this.f120168d;
        com.tencent.mm.plugin.finder.live.widget.d80 currentMode = ybVar.H.f120117a;
        com.tencent.mm.plugin.finder.live.widget.xb xbVar = new com.tencent.mm.plugin.finder.live.widget.xb(ybVar);
        android.content.Context context = ybVar.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(currentMode, "currentMode");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveSettlementModeSelect", "show, currentMode=" + currentMode);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.y1(context);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.z1(xbVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveSettingPanel$initSettlementModeItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e0 f119457d;

    public q(com.tencent.mm.plugin.finder.live.widget.e0 e0Var) {
        this.f119457d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$initRootView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f119457d.U();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage$initRootView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

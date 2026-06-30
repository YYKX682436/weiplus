package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes9.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x0 f119235d;

    public o0(com.tencent.mm.plugin.finder.live.widget.x0 x0Var) {
        this.f119235d = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage$initRootView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.x0.i(this.f119235d, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/BaseBottomPanelTabSheetPage$initRootView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

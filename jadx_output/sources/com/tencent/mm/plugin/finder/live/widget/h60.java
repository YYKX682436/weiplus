package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118549d;

    public h60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118549d = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createGameOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.z60.c(this.f118549d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createGameOptionsContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

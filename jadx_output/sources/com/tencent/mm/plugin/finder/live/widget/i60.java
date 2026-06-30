package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x50 f118644e;

    public i60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, com.tencent.mm.plugin.finder.live.widget.x50 x50Var) {
        this.f118643d = z60Var;
        this.f118644e = x50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createOptionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f118643d;
        z60Var.j(z60Var.f120543q, this.f118644e.f120294a);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$createOptionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

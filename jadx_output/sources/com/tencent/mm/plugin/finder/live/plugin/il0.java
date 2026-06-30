package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class il0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ll0 f112988d;

    public il0(com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var) {
        this.f112988d = ll0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) this.f112988d.X0(com.tencent.mm.plugin.finder.live.plugin.x80.class);
        if (x80Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, java.lang.Boolean.TRUE, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

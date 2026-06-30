package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x80 f114694d;

    public v80(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var) {
        this.f114694d = x80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.x80.A1(this.f114694d, null, null, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

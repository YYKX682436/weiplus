package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f112122d;

    public c7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f112122d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f112122d;
        if (x7Var.f115046z.b()) {
            x7Var.f115046z.a();
        } else {
            x7Var.C1();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

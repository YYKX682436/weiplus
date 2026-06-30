package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f111981d;

    public b7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f111981d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f111981d;
        if (x7Var.f115046z.b()) {
            x7Var.f115046z.a();
        } else {
            com.tencent.mm.plugin.finder.live.view.j2 j2Var = x7Var.B;
            boolean z17 = false;
            if (j2Var != null) {
                android.view.View view2 = j2Var.f116401i.i().f253301d;
                if (view2 != null && view2.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.finder.live.view.j2 j2Var2 = x7Var.B;
                if (j2Var2 != null) {
                    j2Var2.f116401i.i().b();
                }
            } else {
                x7Var.C1();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f112376d;

    public e7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f112376d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f112376d;
        if (x7Var.f115046z.b()) {
            x7Var.f115046z.a();
        } else {
            x7Var.C1();
        }
        df2.g3 g3Var = (df2.g3) x7Var.U0(df2.g3.class);
        if (g3Var != null) {
            g3Var.Z6(0, (int) ((mm2.c1) x7Var.P0(mm2.c1.class)).f328866q, ((mm2.o4) x7Var.P0(mm2.o4.class)).U.f377132g, new com.tencent.mm.plugin.finder.live.plugin.d7(x7Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

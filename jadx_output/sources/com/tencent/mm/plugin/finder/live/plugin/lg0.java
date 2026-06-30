package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lg0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wg0 f113396d;

    public lg0(com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var) {
        this.f113396d = wg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorClosePlugin", "close click!");
        if (((mm2.n0) this.f113396d.P0(mm2.n0.class)).f329273r) {
            com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = this.f113396d;
            if (wg0Var.f114935u == null) {
                android.view.ViewGroup viewGroup = wg0Var.f365323d;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
                android.content.res.Resources resources = viewGroup.getContext().getResources();
                java.lang.String string = resources.getString(com.tencent.mm.R.string.e_k);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = resources.getString(com.tencent.mm.R.string.e_l);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.tg0(string, string2);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.live.plugin.ug0(wg0Var);
                k0Var.f211854d = new com.tencent.mm.plugin.finder.live.plugin.vg0(wg0Var);
                wg0Var.f114935u = k0Var;
                k0Var.v();
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.wg0.t1(this.f113396d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

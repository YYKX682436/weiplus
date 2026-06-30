package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129378d;

    public j3(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129378d = finderCreateContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initAvatarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129378d;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.f(finderCreateContactUI, 1000, 1, 5, null, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initAvatarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

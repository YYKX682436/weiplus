package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class wl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f129995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.cm f129996e;

    public wl(in5.s0 s0Var, com.tencent.mm.plugin.finder.ui.cm cmVar) {
        this.f129995d = s0Var;
        this.f129996e = cmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f129995d;
        lb2.j jVar = (lb2.j) s0Var.f293125i;
        com.tencent.mm.plugin.finder.ui.ci ciVar = com.tencent.mm.plugin.finder.ui.ci.f128994a;
        java.lang.String title = jVar.f317749d;
        kotlin.jvm.internal.o.g(title, "title");
        if (!(title.length() == 0)) {
            java.util.List V0 = kz5.n0.V0(ciVar.a());
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            arrayList2.remove(title);
            arrayList2.add(0, title);
            while (arrayList2.size() > 10) {
                arrayList2.remove(arrayList2.size() - 1);
            }
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.finder.ui.ci.f128995b).getValue()).putString("recent_v1", kz5.n0.g0(V0, "\n", null, null, 0, null, null, 62, null));
        }
        if (!jVar.k().isEmpty()) {
            com.tencent.mm.plugin.finder.ui.cm cmVar = this.f129996e;
            cmVar.getClass();
            java.util.List k17 = jVar.k();
            java.util.List S0 = kz5.n0.S0(kz5.c0.g(k17));
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(s0Var.f293121e, 1, true);
            k0Var.q(jVar.f317749d, 17);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.zl(k17, S0);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.bm(cmVar, jVar, s0Var);
            k0Var.v();
        } else {
            jVar.n(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

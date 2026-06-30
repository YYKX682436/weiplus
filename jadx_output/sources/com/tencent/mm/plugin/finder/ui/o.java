package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129563d;

    public o(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129563d = finderActivityDescUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129563d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderActivityDescUI, 1, true);
        r45.h21 h21Var = finderActivityDescUI.Y;
        if (h21Var == null || (string = h21Var.getString(10)) == null) {
            string = finderActivityDescUI.getResources().getString(com.tencent.mm.R.string.f491255cj3);
        }
        kotlin.jvm.internal.o.d(string);
        k0Var.q(string, 17);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.m(finderActivityDescUI);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.n(finderActivityDescUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

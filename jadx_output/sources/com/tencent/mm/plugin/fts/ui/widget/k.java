package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g23.f f138287e;

    public k(com.tencent.mm.plugin.fts.ui.widget.v vVar, g23.f fVar) {
        this.f138286d = vVar;
        this.f138287e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138286d;
        ((android.view.inputmethod.InputMethodManager) vVar.getContext().getSystemService("input_method")).hideSoftInputFromWindow(vVar.f209962e.getWindowToken(), 0);
        g23.f inputActionConfig = this.f138287e;
        kotlin.jvm.internal.o.f(inputActionConfig, "$inputActionConfig");
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = vVar.f138333y;
        a0Var.getClass();
        long j17 = inputActionConfig.f267911d * 1000;
        if (((java.util.ArrayList) inputActionConfig.f267913f).size() > 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(a0Var.f138242a, false, 1);
            k0Var.f211872n = new com.tencent.mm.plugin.fts.ui.widget.x(inputActionConfig);
            k0Var.f211881s = new com.tencent.mm.plugin.fts.ui.widget.y(inputActionConfig, j17, a0Var);
            k0Var.C = new com.tencent.mm.plugin.fts.ui.widget.z(inputActionConfig, a0Var);
            k0Var.v();
        } else {
            g23.i iVar = inputActionConfig.f267912e;
            if (iVar != null) {
                z50.b bVar = z50.c.f470162a;
                android.content.Context context = a0Var.f138242a;
                z13.f fVar = a0Var.f138243b;
                bVar.c(iVar, j17, context, fVar.c7(), fVar.a7(), fVar.f469401g);
            }
        }
        java.lang.String str = inputActionConfig.f267909b;
        boolean b17 = kotlin.jvm.internal.o.b(str, "add");
        z50.d dVar = z50.e.f470163a;
        if (b17) {
            dVar.b(vu4.a.I, vu4.b.f440266p, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        } else if (kotlin.jvm.internal.o.b(str, "photo")) {
            dVar.b(vu4.a.I, vu4.b.f440262i, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

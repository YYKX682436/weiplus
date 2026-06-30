package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f138290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g23.g f138291f;

    public l(com.tencent.mm.plugin.fts.ui.widget.v vVar, android.widget.CheckBox checkBox, g23.g gVar) {
        this.f138289d = vVar;
        this.f138290e = checkBox;
        this.f138291f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.widget.n1 n1Var = com.tencent.mm.plugin.fts.ui.widget.n1.f138306f;
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138289d;
        vVar.setLargeModeSwitchType(n1Var);
        android.widget.CheckBox checkBox = this.f138290e;
        boolean z17 = !checkBox.isChecked();
        checkBox.setChecked(z17);
        g23.g gVar = this.f138291f;
        gVar.f267916c = z17;
        vVar.D = z17;
        vVar.C.invoke(java.lang.Boolean.valueOf(z17));
        vVar.q();
        if (vVar.v()) {
            vVar.f(false);
            vVar.s();
        }
        java.lang.String str = gVar.f267914a;
        boolean b17 = kotlin.jvm.internal.o.b(str, "globalSearchAskRealPeople");
        z50.d dVar = z50.e.f470163a;
        if (b17) {
            if (z17) {
                dVar.b(vu4.a.B, vu4.b.f440261h, vVar.f138333y.f138243b.a7(), vVar.f138333y.f138243b.f469401g);
            } else {
                dVar.b(vu4.a.C, vu4.b.f440261h, vVar.f138333y.f138243b.a7(), vVar.f138333y.f138243b.f469401g);
            }
        } else if (kotlin.jvm.internal.o.b(str, "globalSearchDeepThink")) {
            if (z17) {
                dVar.b(vu4.a.B, vu4.b.f440260g, vVar.f138333y.f138243b.a7(), vVar.f138333y.f138243b.f469401g);
            } else {
                dVar.b(vu4.a.C, vu4.b.f440260g, vVar.f138333y.f138243b.a7(), vVar.f138333y.f138243b.f469401g);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

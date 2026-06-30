package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderChooseOriginalView f132628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132629e;

    public m3(com.tencent.mm.plugin.finder.view.FinderChooseOriginalView finderChooseOriginalView, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f132628d = finderChooseOriginalView;
        this.f132629e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(this.f132628d.getContext());
        e3Var.f(com.tencent.mm.R.layout.b4q);
        e3Var.f131959f.findViewById(com.tencent.mm.R.id.f483757bz1).setOnClickListener(new com.tencent.mm.plugin.finder.view.l3(e3Var));
        e3Var.i();
        this.f132629e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

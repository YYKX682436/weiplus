package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderChooseOriginalView f132475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132476e;

    public k3(com.tencent.mm.plugin.finder.view.FinderChooseOriginalView finderChooseOriginalView, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f132475d = finderChooseOriginalView;
        this.f132476e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f132475d.setOriginalFlag(1);
        this.f132476e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

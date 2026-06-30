package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderChooseOriginalView f132411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f132412e;

    public j3(com.tencent.mm.plugin.finder.view.FinderChooseOriginalView finderChooseOriginalView, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f132411d = finderChooseOriginalView;
        this.f132412e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f132411d.setOriginalFlag(2);
        this.f132412e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

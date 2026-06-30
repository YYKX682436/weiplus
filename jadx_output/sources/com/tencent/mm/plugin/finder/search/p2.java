package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.q2 f125813d;

    public p2(com.tencent.mm.plugin.finder.search.q2 q2Var) {
        this.f125813d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.q2 q2Var = this.f125813d;
        q2Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.HotSearchInfoDialog", "dismissDialog");
        y9.i iVar = q2Var.f125824b;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

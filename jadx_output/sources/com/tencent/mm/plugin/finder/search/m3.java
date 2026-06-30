package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.t3 f125773d;

    public m3(com.tencent.mm.plugin.finder.search.t3 t3Var) {
        this.f125773d = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = (com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) this.f125773d.f125858e;
        finderMixSearchPresenter.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.b31 b31Var = new r45.b31();
        b31Var.set(6, finderMixSearchPresenter.f125566e);
        b31Var.set(0, finderMixSearchPresenter.f125568g);
        b31Var.set(1, java.lang.Integer.valueOf(finderMixSearchPresenter.f125569h));
        b31Var.set(2, 1);
        b31Var.set(4, finderMixSearchPresenter.f125570i);
        java.util.ArrayList arrayList2 = finderMixSearchPresenter.f125571m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Boolean.valueOf(b31Var.getList(7).add((r45.mu2) it.next())));
        }
        int i17 = finderMixSearchPresenter.f125576r;
        try {
            if (i17 == 13) {
                intent.putExtra("request_type", 17);
            } else {
                intent.putExtra("request_type", 1);
            }
            intent.putExtra("is_force_night_mode", i17 == 13);
        } catch (java.lang.Exception unused) {
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).oj(finderMixSearchPresenter.f125567f, b31Var, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.q21 f125708e;

    public h0(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI, r45.q21 q21Var) {
        this.f125707d = finderFansSearchUI;
        this.f125708e = q21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125707d;
            finderFansSearchUI.F = com.tencent.mm.plugin.finder.ui.c6.a(this.f125708e, finderFansSearchUI, new com.tencent.mm.plugin.finder.search.g0(finderFansSearchUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$FansSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

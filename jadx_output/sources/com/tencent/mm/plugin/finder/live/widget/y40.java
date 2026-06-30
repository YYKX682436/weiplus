package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f120413d;

    public y40(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f120413d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.re2 re2Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f120413d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f329587k;
            re2Var = hn1Var != null ? (r45.re2) hn1Var.getCustom(2) : null;
        } else {
            re2Var = q50Var.g0().f329590n;
        }
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = q50Var.f119497l1;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var2 = com.tencent.mm.plugin.finder.live.widget.o40.f119253h;
        boolean z17 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var3 = com.tencent.mm.plugin.finder.live.widget.o40.f119252g;
        boolean z18 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var3;
        q50Var.getClass();
        android.content.Context context = q50Var.f118183e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.class);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", ((mm2.c1) q50Var.H.business(mm2.c1.class)).f328875r4);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_HIDE_SELECT_FROM_CONTACT_BOOK", true);
        if (z18) {
            intent.putStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST", (re2Var == null || (list4 = re2Var.getList(2)) == null) ? null : new java.util.ArrayList<>(list4));
            intent.putExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", true);
        } else if (z17) {
            intent.putStringArrayListExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST", (re2Var == null || (list3 = re2Var.getList(2)) == null) ? null : new java.util.ArrayList<>(list3));
            intent.putExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", true);
            intent.putExtra("KEY_PARAMS_WHITE_LIST", q50Var.f119504z1.toByteArray());
        } else {
            intent.putExtra("KEY_PARAMS_WHITE_LIST", q50Var.f119504z1.toByteArray());
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST", (re2Var == null || (list2 = re2Var.getList(0)) == null) ? null : new java.util.ArrayList<>(list2));
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_USER_LIST", (re2Var == null || (list = re2Var.getList(1)) == null) ? null : new java.util.ArrayList<>(list));
        }
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (mMFragmentActivity != null) {
            mMFragmentActivity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
        }
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.live.widget.x40(q50Var, z19, re2Var, z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118407d;

    public g50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f118407d = q50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList G2;
        java.util.ArrayList arrayList;
        r45.re2 re2Var;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118407d;
        if (q50Var.g0().d()) {
            r45.hn1 hn1Var = q50Var.g0().f329587k;
            if (hn1Var != null && (re2Var = (r45.re2) hn1Var.getCustom(2)) != null) {
                G2 = re2Var.getList(3);
            }
            G2 = null;
        } else {
            java.util.List list = q50Var.g0().f329580d;
            if (list != null) {
                G2 = zl2.r4.f473950a.G2(list, null);
            }
            G2 = null;
        }
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = q50Var.f119497l1;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var2 = com.tencent.mm.plugin.finder.live.widget.o40.f119253h;
        boolean z17 = o40Var == o40Var2 && q50Var.A1 == o40Var2;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var3 = com.tencent.mm.plugin.finder.live.widget.o40.f119252g;
        boolean z18 = o40Var == o40Var3 && q50Var.A1 == o40Var2;
        boolean z19 = o40Var == o40Var3 && q50Var.A1 == o40Var3;
        q50Var.getClass();
        android.content.Context context = q50Var.f118183e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI.class);
        java.util.LinkedList list2 = q50Var.f119504z1.getList(3);
        kotlin.jvm.internal.o.f(list2, "getAudience_list(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((r45.il1) it.next()).toByteArray());
        }
        if (G2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(G2, 10));
            java.util.Iterator it6 = G2.iterator();
            while (it6.hasNext()) {
                arrayList.add(((r45.il1) it6.next()).toByteArray());
            }
        } else {
            arrayList = null;
        }
        if (z18) {
            java.util.List list3 = q50Var.g0().f329579c;
            intent.putExtra("KEY_PARAMS_WHITE_LIST", list3 instanceof java.io.Serializable ? (java.io.Serializable) list3 : null);
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_FORBID_SELECT_WHITE_LIST", arrayList);
        } else if (z17) {
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_WHITE_LIST", arrayList);
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
        } else {
            java.util.List list4 = q50Var.g0().f329579c;
            intent.putExtra("KEY_PARAMS_WHITE_LIST", list4 instanceof java.io.Serializable ? (java.io.Serializable) list4 : null);
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
            if (!(arrayList instanceof java.io.Serializable)) {
                arrayList = null;
            }
            intent.putExtra("KEY_PARAMS_FORBID_UNSELECT_WHITE_LIST", arrayList);
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.live.widget.f50(q50Var, z19, G2, z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivingWhiteListPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

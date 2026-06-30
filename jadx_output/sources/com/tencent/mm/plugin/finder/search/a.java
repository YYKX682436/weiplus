package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI f125608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f125609e;

    public a(com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, int i17) {
        this.f125608d = finderContactSearchIncludeFollowUI;
        this.f125609e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        r45.mu2 mu2Var = (r45.mu2) tag;
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f125608d;
        finderContactSearchIncludeFollowUI.getClass();
        boolean z17 = false;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        if (finderContact != null) {
            if ((finderContact.getUser_flag() & 4) != 0) {
                z17 = true;
            }
        }
        int i17 = this.f125609e;
        if (z17 && finderContactSearchIncludeFollowUI.f125521u == 2) {
            java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
            if (a17 == null) {
                a17 = "";
            }
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(finderContactSearchIncludeFollowUI.getContext(), "wxid_wi_1d142z0zdj03", 5, a17, new com.tencent.mm.plugin.finder.search.l(finderContactSearchIncludeFollowUI, mu2Var, i17));
        } else {
            finderContactSearchIncludeFollowUI.X6(mu2Var, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

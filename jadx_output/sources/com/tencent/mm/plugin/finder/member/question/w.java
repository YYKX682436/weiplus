package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class w implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f121370d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.member.question.s f121371e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f121372f;

    /* renamed from: g, reason: collision with root package name */
    public final int f121373g;

    /* renamed from: h, reason: collision with root package name */
    public final int f121374h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f121375i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f121376m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f121377n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f121378o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f121379p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121380q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f121381r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f121382s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.convert.c f121383t;

    public w(com.tencent.mm.ui.MMActivity activity, android.view.View rootView, com.tencent.mm.plugin.finder.member.question.s presenter, java.lang.String finderAuthorUsername, int i17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f121370d = rootView;
        this.f121371e = presenter;
        this.f121372f = finderAuthorUsername;
        this.f121373g = i17;
        this.f121374h = i18;
        this.f121375i = activity;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout a() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f121380q;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("refreshLayout");
        throw null;
    }

    public final void g() {
        android.view.View view = this.f121376m;
        if (view == null) {
            kotlin.jvm.internal.o.o("emptyLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f121379p;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f121378o;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryTip");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f121377n;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("progress");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f121375i;
    }

    public final void j(boolean z17, boolean z18) {
        if (z17) {
            if (this.f121373g == 5) {
                com.tencent.mm.ui.MMActivity activity = this.f121375i;
                kotlin.jvm.internal.o.g(activity, "activity");
                go2.c0 c0Var = (go2.c0) pf5.z.f353948a.a(activity).e(go2.c0.class);
                if (c0Var != null) {
                    pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.e80(c0Var, 1, false));
                }
            }
            android.view.View view = this.f121376m;
            if (view == null) {
                kotlin.jvm.internal.o.o("emptyLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f121379p;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f121378o;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("retryTip");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f121377n;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("progress");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f121376m;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("emptyLayout");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z18) {
                android.view.View view6 = this.f121382s;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("footer");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showSuccess", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            a().A(true);
        }
        android.view.View view7 = this.f121376m;
        if (view7 != null) {
            view7.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("emptyLayout");
            throw null;
        }
    }
}

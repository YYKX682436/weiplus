package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class s3 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.t3 f125849a;

    public s3(com.tencent.mm.plugin.finder.search.t3 t3Var) {
        this.f125849a = t3Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.widget.TextView textView2;
        android.view.View view7;
        android.view.View view8;
        android.view.View view9;
        android.widget.TextView textView3;
        android.view.View view10;
        android.view.View view11;
        android.view.View view12;
        android.widget.TextView textView4;
        com.tencent.mm.plugin.finder.search.t3 t3Var = this.f125849a;
        jz5.l p17 = ((com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e).p(-1);
        boolean booleanValue = ((java.lang.Boolean) p17.f302833d).booleanValue();
        if (!((java.lang.Boolean) p17.f302834e).booleanValue()) {
            return false;
        }
        if (booleanValue) {
            on5.c loadMoreFooter = t3Var.f125861h.getLoadMoreFooter();
            android.view.View view13 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view13 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view13, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c loadMoreFooter2 = t3Var.f125861h.getLoadMoreFooter();
            if (loadMoreFooter2 != null && (view12 = loadMoreFooter2.getView()) != null && (textView4 = (android.widget.TextView) view12.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView4.setText(com.tencent.mm.R.string.f491894el1);
            }
            on5.c loadMoreFooter3 = t3Var.f125861h.getLoadMoreFooter();
            android.widget.TextView textView5 = (loadMoreFooter3 == null || (view11 = loadMoreFooter3.getView()) == null) ? null : (android.widget.TextView) view11.findViewById(com.tencent.mm.R.id.ili);
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            on5.c loadMoreFooter4 = t3Var.f125861h.getLoadMoreFooter();
            android.view.View findViewById = (loadMoreFooter4 == null || (view10 = loadMoreFooter4.getView()) == null) ? null : view10.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c loadMoreFooter5 = t3Var.f125862i.getLoadMoreFooter();
            android.view.View view14 = loadMoreFooter5 != null ? loadMoreFooter5.getView() : null;
            if (view14 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view14, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c loadMoreFooter6 = t3Var.f125862i.getLoadMoreFooter();
            if (loadMoreFooter6 != null && (view9 = loadMoreFooter6.getView()) != null && (textView3 = (android.widget.TextView) view9.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView3.setText(com.tencent.mm.R.string.f491894el1);
            }
            on5.c loadMoreFooter7 = t3Var.f125862i.getLoadMoreFooter();
            android.widget.TextView textView6 = (loadMoreFooter7 == null || (view8 = loadMoreFooter7.getView()) == null) ? null : (android.widget.TextView) view8.findViewById(com.tencent.mm.R.id.ili);
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            on5.c loadMoreFooter8 = t3Var.f125862i.getLoadMoreFooter();
            android.view.View findViewById2 = (loadMoreFooter8 == null || (view7 = loadMoreFooter8.getView()) == null) ? null : view7.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById2 == null) {
                return true;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        on5.c loadMoreFooter9 = t3Var.f125861h.getLoadMoreFooter();
        android.view.View view15 = loadMoreFooter9 != null ? loadMoreFooter9.getView() : null;
        if (view15 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view15, arrayList5.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c loadMoreFooter10 = t3Var.f125861h.getLoadMoreFooter();
        if (loadMoreFooter10 != null && (view6 = loadMoreFooter10.getView()) != null && (textView2 = (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        on5.c loadMoreFooter11 = t3Var.f125861h.getLoadMoreFooter();
        android.widget.TextView textView7 = (loadMoreFooter11 == null || (view5 = loadMoreFooter11.getView()) == null) ? null : (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.ili);
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        on5.c loadMoreFooter12 = t3Var.f125861h.getLoadMoreFooter();
        android.view.View findViewById3 = (loadMoreFooter12 == null || (view4 = loadMoreFooter12.getView()) == null) ? null : view4.findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c loadMoreFooter13 = t3Var.f125862i.getLoadMoreFooter();
        android.view.View view16 = loadMoreFooter13 != null ? loadMoreFooter13.getView() : null;
        if (view16 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view16, arrayList7.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view16, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c loadMoreFooter14 = t3Var.f125862i.getLoadMoreFooter();
        if (loadMoreFooter14 != null && (view3 = loadMoreFooter14.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f491896el3);
        }
        on5.c loadMoreFooter15 = t3Var.f125862i.getLoadMoreFooter();
        android.widget.TextView textView8 = (loadMoreFooter15 == null || (view2 = loadMoreFooter15.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ili);
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
        on5.c loadMoreFooter16 = t3Var.f125862i.getLoadMoreFooter();
        android.view.View findViewById4 = (loadMoreFooter16 == null || (view = loadMoreFooter16.getView()) == null) ? null : view.findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById4 == null) {
            return true;
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
        arrayList8.add(0);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(findViewById4, arrayList8.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}

package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class z4 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderTopicSearchUI f125994a;

    public z4(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI) {
        this.f125994a = finderTopicSearchUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int i18 = com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI.E;
        com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onLoadMoreBegin");
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125994a;
        java.lang.String str = finderTopicSearchUI.f125591e;
        if (finderTopicSearchUI.f125593g != 1) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderTopicSearchUI.f125602s;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderTopicSearchUI.f125602s;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x2 = refreshLoadMoreLayout2.getF213435x();
            android.widget.TextView textView3 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderTopicSearchUI.f125602s;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x3 = refreshLoadMoreLayout3.getF213435x();
            android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        bq.o1 o1Var = new bq.o1(str, finderTopicSearchUI.f125592f, finderTopicSearchUI.f125596m, finderTopicSearchUI.f125594h, finderTopicSearchUI.f125597n, null, null, null, null, null, false, 0, 4064, null);
        finderTopicSearchUI.f125606w = o1Var;
        pm0.v.T(o1Var.l(), new com.tencent.mm.plugin.finder.search.y4(finderTopicSearchUI)).f(finderTopicSearchUI);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderTopicSearchUI.f125602s;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x4 = refreshLoadMoreLayout4.getF213435x();
        if (f213435x4 != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491894el1);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderTopicSearchUI.f125602s;
        if (refreshLoadMoreLayout5 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x5 = refreshLoadMoreLayout5.getF213435x();
        android.widget.TextView textView4 = f213435x5 != null ? (android.widget.TextView) f213435x5.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderTopicSearchUI.f125602s;
        if (refreshLoadMoreLayout6 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x6 = refreshLoadMoreLayout6.getF213435x();
        android.view.View findViewById2 = f213435x6 != null ? f213435x6.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class o0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125795a;

    public o0(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI) {
        this.f125795a = finderFansSearchUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mars.xlog.Log.i("Finder.FinderFansSearchUI", "onLoadMoreBegin");
        com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125795a;
        if (finderFansSearchUI.f125537u != null) {
            if (finderFansSearchUI.f125539w != 1) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderFansSearchUI.B;
                if (refreshLoadMoreLayout == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
                if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                    textView.setText(com.tencent.mm.R.string.f491896el3);
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderFansSearchUI.B;
                if (refreshLoadMoreLayout2 == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                android.view.View f213435x2 = refreshLoadMoreLayout2.getF213435x();
                android.widget.TextView textView3 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderFansSearchUI.B;
                if (refreshLoadMoreLayout3 == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                android.view.View f213435x3 = refreshLoadMoreLayout3.getF213435x();
                findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String query = finderFansSearchUI.f125537u;
            com.tencent.mm.protobuf.g gVar = finderFansSearchUI.f125538v;
            androidx.appcompat.app.AppCompatActivity context = finderFansSearchUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(context);
            com.tencent.mm.plugin.finder.search.l0 l0Var = new com.tencent.mm.plugin.finder.search.l0(finderFansSearchUI);
            com.tencent.mm.plugin.finder.search.n0 n0Var = new com.tencent.mm.plugin.finder.search.n0(finderFansSearchUI);
            kotlin.jvm.internal.o.g(query, "query");
            bq.u uVar = new bq.u(query, gVar, d17);
            uVar.l().q(new cq.a0(l0Var, n0Var));
            finderFansSearchUI.I = uVar;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderFansSearchUI.B;
            if (refreshLoadMoreLayout4 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x4 = refreshLoadMoreLayout4.getF213435x();
            if (f213435x4 != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491894el1);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderFansSearchUI.B;
            if (refreshLoadMoreLayout5 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x5 = refreshLoadMoreLayout5.getF213435x();
            android.widget.TextView textView4 = f213435x5 != null ? (android.widget.TextView) f213435x5.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderFansSearchUI.B;
            if (refreshLoadMoreLayout6 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x6 = refreshLoadMoreLayout6.getF213435x();
            findViewById = f213435x6 != null ? f213435x6.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = findViewById;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

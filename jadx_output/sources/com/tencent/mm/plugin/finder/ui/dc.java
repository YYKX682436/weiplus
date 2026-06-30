package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class dc extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f129065a;

    public dc(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        this.f129065a = finderPostAtUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int i18 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
        com.tencent.mars.xlog.Log.i("Finder.FinderPostAtUI", "onLoadMoreBegin");
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f129065a;
        if (finderPostAtUI.C == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if (!finderPostAtUI.f128648x) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderPostAtUI.B;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderPostAtUI.B;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x2 = refreshLoadMoreLayout2.getF213435x();
            android.widget.TextView textView3 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderPostAtUI.B;
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
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        gm0.j1.d().g(new db2.o5(finderPostAtUI.f128647w));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderPostAtUI.B;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x4 = refreshLoadMoreLayout4.getF213435x();
        if (f213435x4 != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491894el1);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderPostAtUI.B;
        if (refreshLoadMoreLayout5 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        android.view.View f213435x5 = refreshLoadMoreLayout5.getF213435x();
        android.widget.TextView textView4 = f213435x5 != null ? (android.widget.TextView) f213435x5.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderPostAtUI.B;
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
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$3", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

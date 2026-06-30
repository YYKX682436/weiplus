package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gh {
    public gh(kotlin.jvm.internal.i iVar) {
    }

    public final void a(in5.s0 holder, android.widget.FrameLayout feedHeaderBar, long j17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feedHeaderBar, "feedHeaderBar");
        android.view.View findViewById = feedHeaderBar.findViewById(com.tencent.mm.R.id.gae);
        if (findViewById.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) feedHeaderBar.findViewById(com.tencent.mm.R.id.gag);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            textView.setText(com.tencent.mm.R.string.jze);
            textView.setTextColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f478553an));
            android.view.View findViewById2 = feedHeaderBar.findViewById(com.tencent.mm.R.id.gac);
            findViewById2.setBackground(feedHeaderBar.getContext().getDrawable(com.tencent.mm.R.drawable.abg));
            findViewById2.setPadding(findViewById2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn), findViewById2.getPaddingTop(), findViewById2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn), findViewById2.getPaddingBottom());
        }
        android.view.View findViewById3 = feedHeaderBar.findViewById(com.tencent.mm.R.id.gac);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setOnClickListener(null);
        com.tencent.mm.plugin.finder.view.EllipsizedTextView ellipsizedTextView = (com.tencent.mm.plugin.finder.view.EllipsizedTextView) feedHeaderBar.findViewById(com.tencent.mm.R.id.a8p);
        if (ellipsizedTextView != null) {
            ellipsizedTextView.setTextSize(0, ellipsizedTextView.b() ? feedHeaderBar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9) : feedHeaderBar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479850gz));
        }
        boolean z17 = feedHeaderBar instanceof com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout;
        com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout finderAuthorAreaLayout = z17 ? (com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout) feedHeaderBar : null;
        if (finderAuthorAreaLayout != null) {
            finderAuthorAreaLayout.setShrinkText(false);
        }
        com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout finderAuthorAreaLayout2 = z17 ? (com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout) feedHeaderBar : null;
        if (finderAuthorAreaLayout2 != null) {
            finderAuthorAreaLayout2.setFeed((com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i);
        }
        ((android.widget.TextView) feedHeaderBar.findViewById(com.tencent.mm.R.id.gag)).setTextSize(0, feedHeaderBar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
        android.view.View findViewById4 = feedHeaderBar.findViewById(com.tencent.mm.R.id.che);
        com.tencent.mm.plugin.finder.view.FadeOutLinearLayout fadeOutLinearLayout = findViewById4 instanceof com.tencent.mm.plugin.finder.view.FadeOutLinearLayout ? (com.tencent.mm.plugin.finder.view.FadeOutLinearLayout) findViewById4 : null;
        if (fadeOutLinearLayout != null) {
            int i17 = com.tencent.mm.plugin.finder.view.FadeOutLinearLayout.f130852n;
            fadeOutLinearLayout.b(0, j17, 0);
        }
    }
}

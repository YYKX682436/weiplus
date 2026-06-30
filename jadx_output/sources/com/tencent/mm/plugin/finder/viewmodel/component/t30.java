package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class t30 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f135970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f135973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135974h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135975i;

    public t30(android.widget.LinearLayout linearLayout, android.view.View view, android.view.View view2, android.widget.TextView textView, android.view.View view3, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135970d = linearLayout;
        this.f135971e = view;
        this.f135972f = view2;
        this.f135973g = textView;
        this.f135974h = view3;
        this.f135975i = f50Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.hg hgVar = (com.tencent.mm.plugin.finder.viewmodel.component.hg) obj;
        com.tencent.mars.xlog.Log.i("Finder.SelfOftenReadAuthorUIC", "applyEntryMode: " + hgVar);
        int ordinal = hgVar.ordinal();
        android.view.View view = this.f135972f;
        android.view.View view2 = this.f135971e;
        android.widget.LinearLayout linearLayout = this.f135970d;
        if (ordinal == 0) {
            linearLayout.setVisibility(8);
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (ordinal != 1) {
            android.view.View view3 = this.f135974h;
            android.widget.TextView textView = this.f135973g;
            if (ordinal == 2) {
                linearLayout.setVisibility(0);
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.oyj);
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                linearLayout.setClickable(false);
                linearLayout.setOnClickListener(null);
                if (view2 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (ordinal == 3) {
                linearLayout.setVisibility(0);
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.f493805p52);
                }
                if (view3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                linearLayout.setClickable(true);
                linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.s30(this.f135975i));
                if (view2 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            linearLayout.setVisibility(8);
            if (view2 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view2, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$4", "emit", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAggregationRepo$EntryMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

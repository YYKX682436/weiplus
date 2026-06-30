package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fe implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.je f134395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134400i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134401m;

    public fe(com.tencent.mm.plugin.finder.viewmodel.component.je jeVar, android.widget.TextView textView, kotlin.jvm.internal.h0 h0Var, android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f134395d = jeVar;
        this.f134396e = textView;
        this.f134397f = h0Var;
        this.f134398g = view;
        this.f134399h = view2;
        this.f134400i = baseFinderFeed;
        this.f134401m = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        r45.u25 u25Var = (r45.u25) obj;
        java.lang.String str2 = this.f134401m;
        kotlin.jvm.internal.h0 h0Var = this.f134397f;
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.viewmodel.component.je jeVar = this.f134395d;
        if (u25Var != null) {
            jeVar.f134859o = u25Var;
            ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134400i;
            long itemId = baseFinderFeed.getItemId();
            ((dd0.k0) t0Var).getClass();
            vx3.i a17 = qx3.d.a(itemId);
            boolean z17 = a17 != null ? a17.f441308y : false;
            ed0.t0 t0Var2 = (ed0.t0) i95.n0.c(ed0.t0.class);
            long itemId2 = baseFinderFeed.getItemId();
            ((dd0.k0) t0Var2).getClass();
            vx3.i a18 = qx3.d.a(itemId2);
            java.lang.String str3 = a18 != null ? a18.f441292i : null;
            ed0.t0 t0Var3 = (ed0.t0) i95.n0.c(ed0.t0.class);
            long itemId3 = baseFinderFeed.getItemId();
            ((dd0.k0) t0Var3).getClass();
            vx3.i a19 = qx3.d.a(itemId3);
            java.lang.String str4 = a19 != null ? a19.f441293j : null;
            if (!android.text.TextUtils.isEmpty(u25Var.getString(0))) {
                r45.u25 u25Var2 = jeVar.f134859o;
                if (u25Var2 == null || (str = u25Var2.getString(0)) == null) {
                    str = "";
                }
            } else if (!android.text.TextUtils.isEmpty(u25Var.getString(1)) && !android.text.TextUtils.isEmpty(u25Var.getString(2))) {
                str = u25Var.getString(1) + " - " + u25Var.getString(2);
                kotlin.jvm.internal.o.d(str);
            } else if (!z17 || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                str = str2;
            } else {
                str = str3 + " - " + str4;
                kotlin.jvm.internal.o.d(str);
            }
            h0Var.f310123d = str;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            h0Var.f310123d = str2;
        }
        android.widget.TextView textView = this.f134396e;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        textView.setText((java.lang.CharSequence) h0Var.f310123d);
        textView.setTextSize(0, jeVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479850gz));
        textView.requestLayout();
        double d17 = jeVar.f134860p * 0.6d;
        android.view.View view = this.f134398g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f134399h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$1", "onChanged", "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View ringtoneBubbleLeftLayout = this.f134399h;
        kotlin.jvm.internal.o.f(ringtoneBubbleLeftLayout, "$ringtoneBubbleLeftLayout");
        if (jeVar.e7(ringtoneBubbleLeftLayout) > d17) {
            android.view.ViewGroup.LayoutParams layoutParams = ringtoneBubbleLeftLayout.getLayoutParams();
            layoutParams.width = (int) d17;
            ringtoneBubbleLeftLayout.setLayoutParams(layoutParams);
            ringtoneBubbleLeftLayout.requestLayout();
        }
        float dimension = jeVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        android.view.View view3 = this.f134398g;
        kotlin.jvm.internal.o.e(view3, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view3).b(dimension, dimension, dimension, dimension);
        view3.requestLayout();
        jeVar.f134861q.add(ringtoneBubbleLeftLayout);
    }
}

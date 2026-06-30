package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class a7 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f111817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f111818e;

    public a7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, android.view.ViewGroup viewGroup) {
        this.f111817d = x7Var;
        this.f111818e = viewGroup;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f111817d;
            java.util.Iterator it = x7Var.N.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).a(x7Var.Q);
            }
            int i18 = x7Var.Q;
            com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = x7Var.f115039s;
            if (i18 == 0) {
                java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329322q;
                kotlin.jvm.internal.o.f(list, "<get-newLinkMicUserList>(...)");
                kz5.h0.B(list, com.tencent.mm.plugin.finder.live.plugin.y6.f115158d);
                finderLiveTextIndicator.a(((mm2.o4) x7Var.P0(mm2.o4.class)).t7() > 0);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327825n, "", -1, -1);
                x7Var.f115040t.setBackgroundDrawable(this.f111818e.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.aja));
            } else if (i18 == 1) {
                java.util.List list2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329322q;
                kotlin.jvm.internal.o.f(list2, "<get-newLinkMicUserList>(...)");
                kz5.h0.B(list2, com.tencent.mm.plugin.finder.live.plugin.z6.f115301d);
                finderLiveTextIndicator.b(((mm2.o4) x7Var.P0(mm2.o4.class)).u7() > 0);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327826o, "", -1, -1);
            }
            int i19 = x7Var.Q;
            android.widget.TextView textView = finderLiveTextIndicator.f116113e;
            android.widget.TextView textView2 = finderLiveTextIndicator.f116112d;
            if (i19 == 0) {
                textView2.setAlpha(1.0f);
                textView.setAlpha(0.5f);
            } else {
                textView2.setAlpha(0.5f);
                textView.setAlpha(1.0f);
            }
            x7Var.u1();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int measuredWidth;
        int measuredWidth2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = this.f111817d.f115039s;
        int i19 = com.tencent.mm.ui.bl.b(this.f111818e.getContext()).x;
        finderLiveTextIndicator.getClass();
        float f17 = i19;
        float abs = (java.lang.Math.abs(i17) / f17) * 0.3f;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTextIndicator", "runTabColorAnimation dx: " + i17 + " totalX: " + i19 + " alphaOffset: " + abs + " offest: " + (java.lang.Math.abs(i17) / f17));
        android.widget.TextView textView = finderLiveTextIndicator.f116112d;
        android.widget.TextView textView2 = finderLiveTextIndicator.f116113e;
        if (i17 > 0) {
            float alpha = textView.getAlpha() - abs;
            textView.setAlpha(alpha >= 0.5f ? alpha : 0.5f);
            float alpha2 = textView2.getAlpha() + abs;
            textView2.setAlpha(alpha2 <= 1.0f ? alpha2 : 1.0f);
        } else {
            float alpha3 = textView.getAlpha() + abs;
            textView.setAlpha(alpha3 <= 1.0f ? alpha3 : 1.0f);
            float alpha4 = textView2.getAlpha() - abs;
            textView2.setAlpha(alpha4 >= 0.5f ? alpha4 : 0.5f);
        }
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveTextIndicator.f116117i.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float marginStart = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() + textView.getMeasuredWidth() + finderLiveTextIndicator.f116114f.getMeasuredWidth();
        float abs2 = (java.lang.Math.abs(i17) / f17) * marginStart;
        android.view.View view = finderLiveTextIndicator.f116118m;
        if (i17 > 0) {
            float translationX = view.getTranslationX() + abs2;
            if (translationX <= marginStart) {
                marginStart = translationX;
            }
            view.setTranslationX(marginStart);
        } else {
            float translationX2 = view.getTranslationX() - abs2;
            if (translationX2 < 0.0f) {
                translationX2 = 0.0f;
            }
            view.setTranslationX(translationX2);
        }
        int abs3 = java.lang.Math.abs(textView.getMeasuredWidth() - textView2.getMeasuredWidth());
        if (abs3 == 0) {
            view.getLayoutParams().width = textView.getMeasuredWidth();
        } else {
            if (textView.getMeasuredWidth() > textView2.getMeasuredWidth()) {
                measuredWidth = textView.getMeasuredWidth();
                measuredWidth2 = textView2.getMeasuredWidth();
            } else {
                measuredWidth = textView2.getMeasuredWidth();
                measuredWidth2 = textView.getMeasuredWidth();
            }
            float abs4 = (java.lang.Math.abs(i17) / f17) * abs3;
            if (textView.getMeasuredWidth() > textView2.getMeasuredWidth()) {
                if (i17 > 0) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    int i27 = view.getLayoutParams().width - ((int) abs4);
                    if (i27 >= measuredWidth2) {
                        measuredWidth2 = i27;
                    }
                    layoutParams2.width = measuredWidth2;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    int i28 = view.getLayoutParams().width + ((int) abs4);
                    if (i28 <= measuredWidth) {
                        measuredWidth = i28;
                    }
                    layoutParams3.width = measuredWidth;
                }
            } else if (i17 > 0) {
                android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                int i29 = view.getLayoutParams().width + ((int) abs4);
                if (i29 <= measuredWidth) {
                    measuredWidth = i29;
                }
                layoutParams4.width = measuredWidth;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                int i37 = view.getLayoutParams().width - ((int) abs4);
                if (i37 >= measuredWidth2) {
                    measuredWidth2 = i37;
                }
                layoutParams5.width = measuredWidth2;
            }
        }
        view.requestLayout();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

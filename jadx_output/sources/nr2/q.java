package nr2;

/* loaded from: classes2.dex */
public final class q implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f339288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339289b;

    /* renamed from: c, reason: collision with root package name */
    public float f339290c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f339291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339292e;

    public q(nr2.j0 j0Var) {
        this.f339292e = j0Var;
        this.f339288a = j0Var.getActivity().getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f339289b = j0Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
        this.f339291d = i65.a.b(j0Var.getContext(), 72);
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / this.f339291d);
        if (min == this.f339290c) {
            return;
        }
        this.f339290c = min;
        nr2.j0 j0Var = this.f339292e;
        if (min < 0.5f) {
            float f17 = (0.5f - min) / 0.5f;
            android.view.View view2 = j0Var.f339234u;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f339288a);
            android.view.View view3 = j0Var.f339230q;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("courseTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(min, f17);
            return;
        }
        float f18 = (min - 0.5f) / 0.5f;
        int i18 = (int) (255 * f18);
        android.view.View view4 = j0Var.f339234u;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.tencent.mm.ui.uk.a(this.f339289b, i18));
        android.view.View view5 = j0Var.f339230q;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("courseTitleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(min, f18);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        nr2.j0 j0Var = this.f339292e;
        if (d17 < 0.5d) {
            android.widget.TextView textView = j0Var.f339231r;
            if (textView == null) {
                kotlin.jvm.internal.o.o("courseBarTitle");
                throw null;
            }
            c(textView, 4);
        } else {
            android.widget.TextView textView2 = j0Var.f339231r;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("courseBarTitle");
                throw null;
            }
            c(textView2, 0);
        }
        android.view.View view = j0Var.f339236w;
        if (view == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = j0Var.f339235v;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

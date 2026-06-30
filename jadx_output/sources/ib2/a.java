package ib2;

/* loaded from: classes2.dex */
public final class a implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f290092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f290093b;

    /* renamed from: c, reason: collision with root package name */
    public float f290094c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public final int f290095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290096e;

    public a(ib2.w wVar) {
        this.f290096e = wVar;
        this.f290092a = wVar.getActivity().getResources().getColor(com.tencent.mm.R.color.a9e);
        this.f290093b = wVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
        this.f290095d = i65.a.b(wVar.getContext(), 72);
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / this.f290095d);
        if (min == this.f290094c) {
            return;
        }
        this.f290094c = min;
        ib2.w wVar = this.f290096e;
        if (min < 0.5f) {
            float f17 = (0.5f - min) / 0.5f;
            android.view.View view2 = wVar.f290164o;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            view2.setBackgroundColor(this.f290092a);
            android.view.View view3 = wVar.f290160h;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("collectionTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b(min, f17);
            return;
        }
        float f18 = (min - 0.5f) / 0.5f;
        int i18 = (int) (255 * f18);
        android.view.View view4 = wVar.f290164o;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("titleContainer");
            throw null;
        }
        view4.setBackgroundColor(com.tencent.mm.ui.uk.a(this.f290093b, i18));
        android.view.View view5 = wVar.f290160h;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("collectionTitleLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b(min, f18);
    }

    public final void b(float f17, float f18) {
        double d17 = f17;
        ib2.w wVar = this.f290096e;
        if (d17 < 0.5d) {
            android.view.View view = wVar.f290160h;
            if (view == null) {
                kotlin.jvm.internal.o.o("collectionTitleLayout");
                throw null;
            }
            c(view, 4);
        } else {
            android.view.View view2 = wVar.f290160h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("collectionTitleLayout");
                throw null;
            }
            c(view2, 0);
        }
        android.view.View view3 = wVar.f290166q;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = wVar.f290165p;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "changeViewAlpha", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void c(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$OnOffsetChangedListener", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

package zv0;

/* loaded from: classes5.dex */
public final class p extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f476212d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView f476213e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f476214f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f476215g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f476216h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f476217i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f476218m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f476219n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zv0.q qVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.q8t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f476212d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.h5w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f476213e = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f486827qa0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f476214f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.d3u);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f476215g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.q4i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f476216h = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.hrm);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f476217i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.qol);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f476218m = findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.f486140qv5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f476219n = findViewById8;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        int i18;
        zv0.r data = (zv0.r) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = zv0.r.f476220d.f476221a;
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo2 = data.f476221a;
        boolean b17 = kotlin.jvm.internal.o.b(mJMaterialInfo2, mJMaterialInfo);
        android.widget.TextView textView = this.f476212d;
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView mCRoundCornerAnimateView = this.f476213e;
        boolean z17 = data.f476223c;
        if (b17) {
            mCRoundCornerAnimateView.setImageDrawable(j65.q.a(mCRoundCornerAnimateView.getContext()).getDrawable(com.tencent.mm.R.drawable.f480951bu, null));
            android.view.View view = this.f476219n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(mJMaterialInfo2.f48226d);
            mCRoundCornerAnimateView.setVisibility(0);
            textView.setVisibility(0);
            android.view.View view2 = this.f476214f;
            i18 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f476217i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f476218m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f476216h;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f476215g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindOriginTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f476219n;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cy0.c cVar = by0.q.f36347a;
        java.lang.String str = mJMaterialInfo2.f48227e;
        kotlin.jvm.internal.o.f(str, "getPreviewImageURL(...)");
        new cy0.g(new ip0.a(str), by0.q.f36347a).c(mCRoundCornerAnimateView);
        textView.setVisibility(0);
        textView.setText(mJMaterialInfo2.f48226d);
        zu0.i iVar = zu0.i.f475677g;
        zu0.i iVar2 = data.f476222b;
        if (iVar2 == iVar) {
            android.view.View view8 = this.f476217i;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f476218m;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view10 = this.f476217i;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view11 = this.f476218m;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view12 = this.f476214f;
        i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view12, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (iVar2 == zu0.i.f475675e) {
            android.view.View view13 = this.f476215g;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view14 = this.f476216h;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view15 = this.f476215g;
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        arrayList15.add(8);
        java.util.Collections.reverse(arrayList15);
        yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
        yj0.a.f(view15, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view16 = this.f476216h;
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        arrayList16.add(8);
        java.util.Collections.reverse(arrayList16);
        yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
        yj0.a.f(view16, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionAdapter$TransitionHolder", "bindMaterialTransition", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

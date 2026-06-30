package uv0;

/* loaded from: classes5.dex */
public final class c extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f431318d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f431319e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f431320f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f431321g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f431322h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uv0.f f431323i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uv0.f fVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f431323i = fVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.q8t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f431318d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.h5w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f431319e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f486827qa0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f431320f = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.d3u);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f431321g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.q4i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f431322h = findViewById5;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.k data = (vv0.k) obj;
        kotlin.jvm.internal.o.g(data, "data");
        vv0.k kVar = vv0.k.f440383f;
        boolean b17 = kotlin.jvm.internal.o.b(data, kVar);
        android.widget.TextView textView = this.f431318d;
        uv0.f fVar = this.f431323i;
        android.widget.ImageView imageView = this.f431319e;
        if (b17) {
            textView.setVisibility(8);
            imageView.setImageResource(com.tencent.mm.R.drawable.cnl);
            imageView.setAlpha(1.0f);
            android.view.View view = this.f431320f;
            int i18 = kotlin.jvm.internal.o.b(fVar.f431329i, kVar) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f431321g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f431322h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        vo0.e.f438468b.c(data.f440387c, imageView, fVar.f431328h);
        textView.setVisibility(0);
        textView.setText(data.f440386b);
        android.view.View view4 = this.f431320f;
        int i19 = kotlin.jvm.internal.o.b(fVar.f431329i, data) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (data.f440389e == zu0.i.f475675e) {
            android.view.View view5 = this.f431321g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f431322h;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f431321g;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f431322h;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterAdapter$FilterHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/FilterInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

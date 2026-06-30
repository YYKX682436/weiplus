package sv0;

/* loaded from: classes5.dex */
public final class i extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f413227d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f413228e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f413229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.n data = (vv0.n) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.aai);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f413227d = findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.f485438q80);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f413228e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.f487450qb4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f413229f = (android.widget.TextView) findViewById3;
        if (data.f440401d) {
            android.view.View view = this.f413227d;
            if (view == null) {
                kotlin.jvm.internal.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f413227d;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SortSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dx0.p pVar = data.f440399b;
        if (pVar != null) {
            android.widget.ImageView imageView = this.f413228e;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("ivThumbnail");
                throw null;
            }
            imageView.setRotation(pVar.f244468b);
            android.widget.ImageView imageView2 = this.f413228e;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("ivThumbnail");
                throw null;
            }
            imageView2.setImageBitmap(pVar.f244467a);
        }
        android.widget.TextView textView = this.f413229f;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(data.f440400c));
        } else {
            kotlin.jvm.internal.o.o("tvOrder");
            throw null;
        }
    }
}

package pw0;

/* loaded from: classes5.dex */
public final class h extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f358634d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f358635e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f358636f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f358637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f358634d = jz5.h.b(new pw0.d(this));
        this.f358635e = jz5.h.b(new pw0.e(this));
        this.f358636f = jz5.h.b(new pw0.f(this));
        this.f358637g = jz5.h.b(new pw0.g(this));
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        vv0.n data = (vv0.n) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.Object value = ((jz5.n) this.f358636f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText(java.lang.String.valueOf(data.f440400c));
        dx0.p pVar = data.f440399b;
        if (pVar != null) {
            jz5.g gVar = this.f358635e;
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.ImageView) value2).setRotation(pVar.f244468b);
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ((android.widget.ImageView) value3).setImageBitmap(pVar.f244467a);
        }
        jz5.g gVar2 = this.f358634d;
        jz5.g gVar3 = this.f358637g;
        if (data.f440401d) {
            java.lang.Object value4 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            android.view.View view = (android.view.View) value4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value5 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            android.view.View view2 = (android.view.View) value5;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value6 = ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        android.view.View view3 = (android.view.View) value6;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value7 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        android.view.View view4 = (android.view.View) value7;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/SegmentAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/models/SegmentData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

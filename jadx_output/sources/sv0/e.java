package sv0;

/* loaded from: classes5.dex */
public final class e extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final sv0.g f413216d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f413217e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f413218f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f413219g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f413220h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.maas.base.MJID f413221i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sv0.f fVar, android.view.View itemView, sv0.g getCoverThumbnailCallback) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(getCoverThumbnailCallback, "getCoverThumbnailCallback");
        this.f413216d = getCoverThumbnailCallback;
        this.f413217e = jz5.h.b(new sv0.a(itemView));
        this.f413218f = jz5.h.b(new sv0.c(itemView));
        this.f413219g = jz5.h.b(new sv0.b(itemView));
        this.f413220h = jz5.h.b(new sv0.d(itemView));
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sv0.h data = (sv0.h) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.maas.base.MJID segmentID = data.f413223a;
        this.f413221i = segmentID;
        rv0.a6 a6Var = (rv0.a6) this.f413216d;
        a6Var.getClass();
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 v76 = a6Var.f399926a.v7();
        dx0.p m17 = v76 != null ? v76.m(segmentID) : null;
        if ((m17 != null ? m17.f244467a : null) != null) {
            j().setRotation(m17.f244468b);
            j().setImageBitmap(m17.f244467a);
        }
        java.lang.Object value = ((jz5.n) this.f413218f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String format = java.lang.String.format("%.1fS", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) data.f413224b) / 1000.0f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        ((android.widget.TextView) value).setText(format);
        jz5.g gVar = this.f413220h;
        jz5.g gVar2 = this.f413219g;
        if (data.f413226d) {
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.View view = (android.view.View) value2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            android.view.View view2 = (android.view.View) value3;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value4 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        android.view.View view3 = (android.view.View) value4;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value5 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        android.view.View view4 = (android.view.View) value5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/ClipStorylineSegmentsAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/adapter/SimpleSegmentInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.widget.ImageView j() {
        java.lang.Object value = ((jz5.n) this.f413217e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }
}

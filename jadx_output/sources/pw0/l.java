package pw0;

/* loaded from: classes5.dex */
public final class l extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f358640d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f358641e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f358642f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f358643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pw0.m f358644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pw0.m mVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f358644h = mVar;
        this.f358640d = view;
        this.f358641e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7z);
        this.f358642f = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.f358643g = view.findViewById(com.tencent.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f358640d;
        view.setBackgroundResource(com.tencent.mm.R.drawable.cmj);
        view.setSelected(data.f413424c);
        data.toString();
        int ordinal = data.f413423b.ordinal();
        android.widget.ProgressBar progressBar = this.f358642f;
        if (ordinal == 1) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f358643g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (ordinal != 4) {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f358643g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view4 = this.f358643g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String str = data.f413422a.f48227e;
        kotlin.jvm.internal.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivTextStyle = this.f358641e;
        kotlin.jvm.internal.o.f(ivTextStyle, "ivTextStyle");
        aVar.c(str, ivTextStyle, this.f358644h.f358645h);
    }
}

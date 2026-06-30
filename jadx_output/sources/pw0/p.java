package pw0;

/* loaded from: classes5.dex */
public final class p extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f358655d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f358656e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f358657f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f358658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pw0.q qVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f358655d = view;
        this.f358656e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7z);
        this.f358657f = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.f358658g = view.findViewById(com.tencent.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f358655d;
        view.setBackgroundResource(com.tencent.mm.R.drawable.cmk);
        view.setSelected(data.f413424c);
        zu0.i iVar = zu0.i.f475675e;
        zu0.i iVar2 = data.f413423b;
        android.widget.ProgressBar progressBar = this.f358657f;
        if (iVar2 == iVar) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f358658g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f358658g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleColorAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String str = data.f413422a.f48227e;
        kotlin.jvm.internal.o.d(str);
        boolean n17 = r26.i0.n(str, ".svg", false);
        android.widget.ImageView ivTextStyle = this.f358656e;
        if (!n17) {
            wo0.c i18 = vo0.e.f438468b.i(str);
            kotlin.jvm.internal.o.f(ivTextStyle, "ivTextStyle");
            ((wo0.b) i18).c(ivTextStyle);
            return;
        }
        vo0.a aVar = by0.s.f36348a;
        android.net.Uri parse = android.net.Uri.parse(str);
        kotlin.jvm.internal.o.f(parse, "parse(...)");
        java.lang.String absolutePath = i3.b.a(parse).getAbsolutePath();
        kotlin.jvm.internal.o.f(absolutePath, "getAbsolutePath(...)");
        wo0.c i19 = by0.s.f36348a.i(absolutePath);
        kotlin.jvm.internal.o.f(ivTextStyle, "ivTextStyle");
        ((wo0.b) i19).c(ivTextStyle);
    }
}

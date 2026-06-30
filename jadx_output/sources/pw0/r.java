package pw0;

/* loaded from: classes5.dex */
public final class r extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f358659d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f358660e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f358661f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f358662g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f358663h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pw0.s f358664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pw0.s sVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f358664i = sVar;
        this.f358659d = view;
        this.f358660e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7x);
        this.f358661f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7y);
        this.f358662g = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.f358663h = view.findViewById(com.tencent.mm.R.id.q4i);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f358659d;
        view.setBackgroundResource(com.tencent.mm.R.drawable.cml);
        view.setSelected(data.f413424c);
        zu0.i iVar = zu0.i.f475674d;
        android.widget.ImageView imageView = this.f358661f;
        zu0.i iVar2 = data.f413423b;
        if (iVar2 == iVar) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        zu0.i iVar3 = zu0.i.f475675e;
        android.widget.ProgressBar progressBar = this.f358662g;
        if (iVar2 == iVar3) {
            progressBar.setVisibility(0);
            android.view.View view2 = this.f358663h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view3 = this.f358663h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleFontAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String str = data.f413422a.f48227e;
        kotlin.jvm.internal.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivTextFont = this.f358660e;
        kotlin.jvm.internal.o.f(ivTextFont, "ivTextFont");
        aVar.c(str, ivTextFont, this.f358664i.f358665h);
    }
}

package iw0;

/* loaded from: classes5.dex */
public final class b extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f295181d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f295182e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f295183f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f295184g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f295185h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iw0.c f295186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(iw0.c cVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f295186i = cVar;
        this.f295181d = view;
        this.f295182e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7v);
        this.f295183f = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.f295184g = view.findViewById(com.tencent.mm.R.id.q4i);
        this.f295185h = view.findViewById(com.tencent.mm.R.id.f486828qa1);
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        kw0.a data = (kw0.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String str = data.f312788a.f48227e;
        kotlin.jvm.internal.o.f(str, "getPreviewImageURL(...)");
        android.widget.ImageView ivStickerFancyText = this.f295182e;
        kotlin.jvm.internal.o.f(ivStickerFancyText, "ivStickerFancyText");
        iw0.c cVar = this.f295186i;
        aVar.c(str, ivStickerFancyText, cVar.f295188i);
        zu0.i iVar = zu0.i.f475675e;
        zu0.i iVar2 = data.f312789b;
        android.widget.ProgressBar progressBar = this.f295183f;
        if (iVar2 == iVar) {
            progressBar.setVisibility(0);
            android.view.View view = this.f295184g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view2 = this.f295184g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (cVar.f295187h && data.f312790c) {
            android.view.View view3 = this.f295185h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f295185h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/adapter/StickerStyleAdapter$Holder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/models/StickerData;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

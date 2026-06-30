package im3;

/* loaded from: classes10.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final qk4.b f292697e;

    public i(qk4.b videoLayoutRecycler) {
        kotlin.jvm.internal.o.g(videoLayoutRecycler, "videoLayoutRecycler");
        this.f292697e = videoLayoutRecycler;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        im3.j item = (im3.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f292700f.f380365f;
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            java.lang.String str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            o11.f fVar = new o11.f();
            fVar.f342077a = true;
            fVar.f342079c = true;
            fVar.f342091o = com.tencent.mm.R.drawable.ccy;
            n11.a.b().h(str, imageView, fVar.a());
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.oy7);
        frameLayout.setVisibility(0);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.kwj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setOnClickListener(new im3.h(this, frameLayout, item, p17));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

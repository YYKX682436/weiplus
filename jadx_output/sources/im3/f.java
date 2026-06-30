package im3;

/* loaded from: classes10.dex */
public final class f extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final qk4.b f292689e;

    public f(qk4.b videoLayoutRecycler) {
        kotlin.jvm.internal.o.g(videoLayoutRecycler, "videoLayoutRecycler");
        this.f292689e = videoLayoutRecycler;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        im3.j item = (im3.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = item.f292704m;
        java.lang.String o17 = galleryItem$MediaItem != null ? galleryItem$MediaItem.o() : null;
        java.lang.String str = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null;
        long j17 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138434i : 0L;
        long j18 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138435m : 0L;
        ((t23.r0) i1Var).getClass();
        android.graphics.Bitmap g17 = t23.p0.h().g(o17, str, j17, null, j18);
        kotlin.jvm.internal.o.f(g17, "getGalleryBitmapFromMemory(...)");
        if (g17.isRecycled()) {
            imageView.setImageResource(com.tencent.mm.R.drawable.ccy);
        } else {
            imageView.setImageBitmap(g17);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.oy7);
        frameLayout.setVisibility(0);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.kwj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem : null;
        if (galleryItem$VideoMediaItem != null && (galleryItem$VideoMediaItem.f138448z == -1 || galleryItem$VideoMediaItem.f138447y == -1)) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new im3.e(galleryItem$VideoMediaItem, im3.b.f292680d, null), 2, null);
        }
        p17.setOnClickListener(new im3.c(this, frameLayout, item, p17));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

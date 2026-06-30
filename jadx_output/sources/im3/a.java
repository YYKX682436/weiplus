package im3;

/* loaded from: classes10.dex */
public final class a extends in5.r {
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
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        kotlin.jvm.internal.o.d(imageView);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = item.f292704m;
        int type = galleryItem$MediaItem != null ? galleryItem$MediaItem.getType() : 0;
        java.lang.String o17 = galleryItem$MediaItem != null ? galleryItem$MediaItem.o() : null;
        java.lang.String str = o17 == null ? "" : o17;
        java.lang.String str2 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null;
        ((o23.i) b1Var).Ai(imageView, type, str, str2 == null ? "" : str2, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138434i : 0L, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138435m : 0L);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

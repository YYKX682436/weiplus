package ga2;

/* loaded from: classes10.dex */
public final class h extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ed7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = item.f279795h;
        if (galleryItem$MediaItem == null) {
            return;
        }
        java.lang.String str = galleryItem$MediaItem.f138430e;
        if (str == null) {
            str = "";
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.width = com.tencent.mm.ui.bh.a(holder.f293121e).f197135a;
        holder.itemView.setLayoutParams(layoutParams);
        nz5.b.a(false, false, null, null, 0, new ga2.g(galleryItem$MediaItem, str, holder), 31, null);
    }
}

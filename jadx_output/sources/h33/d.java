package h33;

/* loaded from: classes5.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dyo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        h33.c item = (h33.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) holder.p(com.tencent.mm.R.id.bju);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = item.f278456e;
        if (mMNeat7extView != null) {
            mMNeat7extView.b(j33.d0.f(galleryItem$MediaItem.f138430e));
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = (com.tencent.mm.ui.widget.MMTextView) holder.p(com.tencent.mm.R.id.f483637bj2);
        if (mMTextView != null) {
            mMTextView.setText(com.tencent.mm.sdk.platformtools.t8.f0(com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e)));
        }
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) holder.p(com.tencent.mm.R.id.bjs);
        if (mMImageView != null) {
            i95.m c17 = i95.n0.c(pt.m0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            mMImageView.setImageResource(pt.m0.oa((pt.m0) c17, false, com.tencent.mm.vfs.w6.n(galleryItem$MediaItem.f138430e), false, false, 12, null));
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.p(com.tencent.mm.R.id.sps);
        if (mMRoundCornerImageView != null && (str = galleryItem$MediaItem.f138430e) != null && com.tencent.mm.vfs.w6.j(str)) {
            e33.m6.d(mMRoundCornerImageView, galleryItem$MediaItem.getType(), galleryItem$MediaItem.o(), galleryItem$MediaItem.f138430e, galleryItem$MediaItem.f138434i, null, galleryItem$MediaItem.f138435m);
        }
        com.tencent.mm.ui.MMImageView mMImageView2 = (com.tencent.mm.ui.MMImageView) holder.p(com.tencent.mm.R.id.spu);
        if (mMImageView2 != null) {
            mMImageView2.setVisibility(galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? 0 : 8);
        }
    }
}

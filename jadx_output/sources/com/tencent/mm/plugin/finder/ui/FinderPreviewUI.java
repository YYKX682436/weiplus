package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPreviewUI;", "Lcom/tencent/mm/plugin/gallery/ui/ImagePreviewUI;", "<init>", "()V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPreviewUI extends com.tencent.mm.plugin.gallery.ui.ImagePreviewUI {
    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public boolean k7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, float f17) {
        return galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem ? f17 > 0.33f && f17 < 2.0f : super.k7(galleryItem$MediaItem, f17);
    }
}

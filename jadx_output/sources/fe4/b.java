package fe4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f261562a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f261563b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f261564c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f261565d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f261566e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f261567f = new java.util.HashMap();

    public final void a(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMediaList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addMediaList >> publish item size : ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", sb6.toString());
        this.f261562a = list != null ? kz5.n0.V0(list) : new java.util.ArrayList();
        java.util.List list2 = this.f261563b;
        ((java.util.ArrayList) list2).clear();
        java.util.HashMap hashMap = this.f261564c;
        hashMap.clear();
        for (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem : this.f261562a) {
            java.lang.String b17 = snsPublishBaseMultiPicItem.b();
            kotlin.jvm.internal.o.d(b17);
            ((java.util.ArrayList) list2).add(b17);
            java.lang.String b18 = snsPublishBaseMultiPicItem.b();
            kotlin.jvm.internal.o.d(b18);
            hashMap.put(b18, java.lang.Boolean.FALSE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMediaList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
    }

    public final com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem, int i17) {
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishImageItem;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "createPicItemFromGalleryMediaItem >> " + mediaItem.f138434i + ' ' + mediaItem.getType());
        int type = mediaItem.getType();
        if (type == 1) {
            snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem(mediaItem.f138430e, 2, i17, ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) mediaItem).f138424v == 1 ? 1 : 0);
        } else {
            if (type != 6) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("item type is invalid");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
                throw illegalArgumentException;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) mediaItem;
            com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "is live item >> isParsed: " + galleryItem$LivePhotoMediaItem.G);
            java.lang.String o17 = galleryItem$LivePhotoMediaItem.o();
            long j17 = mediaItem.f138434i;
            long j18 = galleryItem$LivePhotoMediaItem.F;
            long j19 = galleryItem$LivePhotoMediaItem.B;
            int i18 = galleryItem$LivePhotoMediaItem.G;
            int i19 = i18 == 1 ? 1 : 0;
            java.lang.String str = i18 == 1 ? galleryItem$LivePhotoMediaItem.f138430e : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append('_');
            sb6.append(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem.CREATOR.hashCode());
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem(o17, 2, i17, j17, j18, j19, str, "", "", i19, 0, 0, "", sb6.toString(), new com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return snsPublishImageItem;
    }

    public final com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem c(java.lang.String path, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPicItemFromPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem(path, z17 ? 1 : 2, i17, 0, null, 24, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPicItemFromPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return snsPublishImageItem;
    }

    public final java.util.List d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePathList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.util.List list = this.f261563b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePathList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return list;
    }

    public final java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.util.List list = this.f261562a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return list;
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        int size = this.f261562a.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return size;
    }
}

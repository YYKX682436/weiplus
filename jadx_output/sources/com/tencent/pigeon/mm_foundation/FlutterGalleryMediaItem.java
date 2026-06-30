package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaItem;", "", "mediaId", "", "mediaType", "Lcom/tencent/pigeon/mm_foundation/MediaType;", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "(Ljava/lang/String;Lcom/tencent/pigeon/mm_foundation/MediaType;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getMediaId", "getMediaType", "()Lcom/tencent/pigeon/mm_foundation/MediaType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlutterGalleryMediaItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem.Companion(null);
    private final java.lang.String filePath;
    private final java.lang.String mediaId;
    private final com.tencent.pigeon.mm_foundation.MediaType mediaType;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaItem$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaItem;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            com.tencent.pigeon.mm_foundation.MediaType.Companion companion = com.tencent.pigeon.mm_foundation.MediaType.INSTANCE;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            com.tencent.pigeon.mm_foundation.MediaType ofRaw = companion.ofRaw(((java.lang.Integer) obj2).intValue());
            kotlin.jvm.internal.o.d(ofRaw);
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem((java.lang.String) obj, ofRaw, (java.lang.String) obj3);
        }
    }

    public FlutterGalleryMediaItem(java.lang.String mediaId, com.tencent.pigeon.mm_foundation.MediaType mediaType, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.mediaId = mediaId;
        this.mediaType = mediaType;
        this.filePath = filePath;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem copy$default(com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem flutterGalleryMediaItem, java.lang.String str, com.tencent.pigeon.mm_foundation.MediaType mediaType, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = flutterGalleryMediaItem.mediaId;
        }
        if ((i17 & 2) != 0) {
            mediaType = flutterGalleryMediaItem.mediaType;
        }
        if ((i17 & 4) != 0) {
            str2 = flutterGalleryMediaItem.filePath;
        }
        return flutterGalleryMediaItem.copy(str, mediaType, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.mm_foundation.MediaType getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem copy(java.lang.String mediaId, com.tencent.pigeon.mm_foundation.MediaType mediaType, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        return new com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem(mediaId, mediaType, filePath);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem flutterGalleryMediaItem = (com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem) other;
        return kotlin.jvm.internal.o.b(this.mediaId, flutterGalleryMediaItem.mediaId) && this.mediaType == flutterGalleryMediaItem.mediaType && kotlin.jvm.internal.o.b(this.filePath, flutterGalleryMediaItem.filePath);
    }

    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    public final com.tencent.pigeon.mm_foundation.MediaType getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return (((this.mediaId.hashCode() * 31) + this.mediaType.hashCode()) * 31) + this.filePath.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.mediaId, java.lang.Integer.valueOf(this.mediaType.getRaw()), this.filePath);
    }

    public java.lang.String toString() {
        return "FlutterGalleryMediaItem(mediaId=" + this.mediaId + ", mediaType=" + this.mediaType + ", filePath=" + this.filePath + ')';
    }
}

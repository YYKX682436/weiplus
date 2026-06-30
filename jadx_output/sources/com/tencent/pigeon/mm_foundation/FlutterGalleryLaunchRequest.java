package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterGalleryLaunchRequest;", "", "mediaItems", "", "Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaItem;", "enterIndex", "", "enterRect", "Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaRect;", "(Ljava/util/List;JLcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaRect;)V", "getEnterIndex", "()J", "getEnterRect", "()Lcom/tencent/pigeon/mm_foundation/FlutterGalleryMediaRect;", "getMediaItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlutterGalleryLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest.Companion(null);
    private final long enterIndex;
    private final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect enterRect;
    private final java.util.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem> mediaItems;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterGalleryLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FlutterGalleryLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem?>");
            java.util.List list2 = (java.util.List) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect.Companion companion = com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect.INSTANCE;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            return new com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest(list2, longValue, companion.fromList((java.util.List) obj3));
        }
    }

    public FlutterGalleryLaunchRequest(java.util.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem> mediaItems, long j17, com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect enterRect) {
        kotlin.jvm.internal.o.g(mediaItems, "mediaItems");
        kotlin.jvm.internal.o.g(enterRect, "enterRect");
        this.mediaItems = mediaItems;
        this.enterIndex = j17;
        this.enterRect = enterRect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest copy$default(com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest flutterGalleryLaunchRequest, java.util.List list, long j17, com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect flutterGalleryMediaRect, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = flutterGalleryLaunchRequest.mediaItems;
        }
        if ((i17 & 2) != 0) {
            j17 = flutterGalleryLaunchRequest.enterIndex;
        }
        if ((i17 & 4) != 0) {
            flutterGalleryMediaRect = flutterGalleryLaunchRequest.enterRect;
        }
        return flutterGalleryLaunchRequest.copy(list, j17, flutterGalleryMediaRect);
    }

    public final java.util.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem> component1() {
        return this.mediaItems;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEnterIndex() {
        return this.enterIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect getEnterRect() {
        return this.enterRect;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest copy(java.util.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem> mediaItems, long enterIndex, com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect enterRect) {
        kotlin.jvm.internal.o.g(mediaItems, "mediaItems");
        kotlin.jvm.internal.o.g(enterRect, "enterRect");
        return new com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest(mediaItems, enterIndex, enterRect);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest flutterGalleryLaunchRequest = (com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest) other;
        return kotlin.jvm.internal.o.b(this.mediaItems, flutterGalleryLaunchRequest.mediaItems) && this.enterIndex == flutterGalleryLaunchRequest.enterIndex && kotlin.jvm.internal.o.b(this.enterRect, flutterGalleryLaunchRequest.enterRect);
    }

    public final long getEnterIndex() {
        return this.enterIndex;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect getEnterRect() {
        return this.enterRect;
    }

    public final java.util.List<com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem> getMediaItems() {
        return this.mediaItems;
    }

    public int hashCode() {
        return (((this.mediaItems.hashCode() * 31) + java.lang.Long.hashCode(this.enterIndex)) * 31) + this.enterRect.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.mediaItems, java.lang.Long.valueOf(this.enterIndex), this.enterRect.toList());
    }

    public java.lang.String toString() {
        return "FlutterGalleryLaunchRequest(mediaItems=" + this.mediaItems + ", enterIndex=" + this.enterIndex + ", enterRect=" + this.enterRect + ')';
    }
}

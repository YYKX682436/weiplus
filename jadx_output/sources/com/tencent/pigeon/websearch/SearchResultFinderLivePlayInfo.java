package com.tencent.pigeon.websearch;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayInfo;", "", "exportId", "", "containerWidth", "", "containerHeight", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getContainerHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContainerWidth", "getExportId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchResultFinderLivePlayInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo.Companion INSTANCE = new com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo.Companion(null);
    private final java.lang.Long containerHeight;
    private final java.lang.Long containerWidth;
    private final java.lang.String exportId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.Object obj = list.get(1);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(2);
            return new com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo(str, valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    public SearchResultFinderLivePlayInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo copy$default(com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo searchResultFinderLivePlayInfo, java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = searchResultFinderLivePlayInfo.exportId;
        }
        if ((i17 & 2) != 0) {
            l17 = searchResultFinderLivePlayInfo.containerWidth;
        }
        if ((i17 & 4) != 0) {
            l18 = searchResultFinderLivePlayInfo.containerHeight;
        }
        return searchResultFinderLivePlayInfo.copy(str, l17, l18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExportId() {
        return this.exportId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getContainerWidth() {
        return this.containerWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getContainerHeight() {
        return this.containerHeight;
    }

    public final com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo copy(java.lang.String exportId, java.lang.Long containerWidth, java.lang.Long containerHeight) {
        return new com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo(exportId, containerWidth, containerHeight);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo)) {
            return false;
        }
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo searchResultFinderLivePlayInfo = (com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo) other;
        return kotlin.jvm.internal.o.b(this.exportId, searchResultFinderLivePlayInfo.exportId) && kotlin.jvm.internal.o.b(this.containerWidth, searchResultFinderLivePlayInfo.containerWidth) && kotlin.jvm.internal.o.b(this.containerHeight, searchResultFinderLivePlayInfo.containerHeight);
    }

    public final java.lang.Long getContainerHeight() {
        return this.containerHeight;
    }

    public final java.lang.Long getContainerWidth() {
        return this.containerWidth;
    }

    public final java.lang.String getExportId() {
        return this.exportId;
    }

    public int hashCode() {
        java.lang.String str = this.exportId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.containerWidth;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.containerHeight;
        return hashCode2 + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.exportId, this.containerWidth, this.containerHeight);
    }

    public java.lang.String toString() {
        return "SearchResultFinderLivePlayInfo(exportId=" + this.exportId + ", containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ')';
    }

    public SearchResultFinderLivePlayInfo(java.lang.String str, java.lang.Long l17, java.lang.Long l18) {
        this.exportId = str;
        this.containerWidth = l17;
        this.containerHeight = l18;
    }

    public /* synthetic */ SearchResultFinderLivePlayInfo(java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : l18);
    }
}

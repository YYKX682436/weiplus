package com.tencent.pigeon.websearch;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/websearch/SearchResultTLPlayerInfo;", "", "textureInfo", "Lcom/tencent/pigeon/websearch/SearchResultTLTextureInfo;", "playerId", "", "(Lcom/tencent/pigeon/websearch/SearchResultTLTextureInfo;Ljava/lang/Long;)V", "getPlayerId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTextureInfo", "()Lcom/tencent/pigeon/websearch/SearchResultTLTextureInfo;", "component1", "component2", "copy", "(Lcom/tencent/pigeon/websearch/SearchResultTLTextureInfo;Ljava/lang/Long;)Lcom/tencent/pigeon/websearch/SearchResultTLPlayerInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchResultTLPlayerInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.websearch.SearchResultTLPlayerInfo.Companion INSTANCE = new com.tencent.pigeon.websearch.SearchResultTLPlayerInfo.Companion(null);
    private final java.lang.Long playerId;
    private final com.tencent.pigeon.websearch.SearchResultTLTextureInfo textureInfo;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/websearch/SearchResultTLPlayerInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/websearch/SearchResultTLPlayerInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.websearch.SearchResultTLPlayerInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(0);
            com.tencent.pigeon.websearch.SearchResultTLTextureInfo fromList = list2 != null ? com.tencent.pigeon.websearch.SearchResultTLTextureInfo.INSTANCE.fromList(list2) : null;
            java.lang.Object obj = list.get(1);
            return new com.tencent.pigeon.websearch.SearchResultTLPlayerInfo(fromList, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResultTLPlayerInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo copy$default(com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, com.tencent.pigeon.websearch.SearchResultTLTextureInfo searchResultTLTextureInfo, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            searchResultTLTextureInfo = searchResultTLPlayerInfo.textureInfo;
        }
        if ((i17 & 2) != 0) {
            l17 = searchResultTLPlayerInfo.playerId;
        }
        return searchResultTLPlayerInfo.copy(searchResultTLTextureInfo, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.websearch.SearchResultTLTextureInfo getTextureInfo() {
        return this.textureInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getPlayerId() {
        return this.playerId;
    }

    public final com.tencent.pigeon.websearch.SearchResultTLPlayerInfo copy(com.tencent.pigeon.websearch.SearchResultTLTextureInfo textureInfo, java.lang.Long playerId) {
        return new com.tencent.pigeon.websearch.SearchResultTLPlayerInfo(textureInfo, playerId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.websearch.SearchResultTLPlayerInfo)) {
            return false;
        }
        com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo = (com.tencent.pigeon.websearch.SearchResultTLPlayerInfo) other;
        return kotlin.jvm.internal.o.b(this.textureInfo, searchResultTLPlayerInfo.textureInfo) && kotlin.jvm.internal.o.b(this.playerId, searchResultTLPlayerInfo.playerId);
    }

    public final java.lang.Long getPlayerId() {
        return this.playerId;
    }

    public final com.tencent.pigeon.websearch.SearchResultTLTextureInfo getTextureInfo() {
        return this.textureInfo;
    }

    public int hashCode() {
        com.tencent.pigeon.websearch.SearchResultTLTextureInfo searchResultTLTextureInfo = this.textureInfo;
        int hashCode = (searchResultTLTextureInfo == null ? 0 : searchResultTLTextureInfo.hashCode()) * 31;
        java.lang.Long l17 = this.playerId;
        return hashCode + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.pigeon.websearch.SearchResultTLTextureInfo searchResultTLTextureInfo = this.textureInfo;
        objArr[0] = searchResultTLTextureInfo != null ? searchResultTLTextureInfo.toList() : null;
        objArr[1] = this.playerId;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "SearchResultTLPlayerInfo(textureInfo=" + this.textureInfo + ", playerId=" + this.playerId + ')';
    }

    public SearchResultTLPlayerInfo(com.tencent.pigeon.websearch.SearchResultTLTextureInfo searchResultTLTextureInfo, java.lang.Long l17) {
        this.textureInfo = searchResultTLTextureInfo;
        this.playerId = l17;
    }

    public /* synthetic */ SearchResultTLPlayerInfo(com.tencent.pigeon.websearch.SearchResultTLTextureInfo searchResultTLTextureInfo, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : searchResultTLTextureInfo, (i17 & 2) != 0 ? null : l17);
    }
}

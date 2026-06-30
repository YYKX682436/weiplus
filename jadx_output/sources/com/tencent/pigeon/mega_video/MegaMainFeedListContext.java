package com.tencent.pigeon.mega_video;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaMainFeedListContext;", "", "mainFeedList", "", "Lcom/tencent/pigeon/mega_video/MegaVideoFeedInfo;", "hasMore", "", "lastBuffer", "", "(Ljava/util/List;Ljava/lang/Boolean;[B)V", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastBuffer", "()[B", "getMainFeedList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;[B)Lcom/tencent/pigeon/mega_video/MegaMainFeedListContext;", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MegaMainFeedListContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mega_video.MegaMainFeedListContext.Companion INSTANCE = new com.tencent.pigeon.mega_video.MegaMainFeedListContext.Companion(null);
    private final java.lang.Boolean hasMore;
    private final byte[] lastBuffer;
    private final java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> mainFeedList;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaMainFeedListContext$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mega_video/MegaMainFeedListContext;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mega_video.MegaMainFeedListContext fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.mega_video.MegaMainFeedListContext((java.util.List) list.get(0), (java.lang.Boolean) list.get(1), (byte[]) list.get(2));
        }
    }

    public MegaMainFeedListContext() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.mega_video.MegaMainFeedListContext copy$default(com.tencent.pigeon.mega_video.MegaMainFeedListContext megaMainFeedListContext, java.util.List list, java.lang.Boolean bool, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = megaMainFeedListContext.mainFeedList;
        }
        if ((i17 & 2) != 0) {
            bool = megaMainFeedListContext.hasMore;
        }
        if ((i17 & 4) != 0) {
            bArr = megaMainFeedListContext.lastBuffer;
        }
        return megaMainFeedListContext.copy(list, bool, bArr);
    }

    public final java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> component1() {
        return this.mainFeedList;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getLastBuffer() {
        return this.lastBuffer;
    }

    public final com.tencent.pigeon.mega_video.MegaMainFeedListContext copy(java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> mainFeedList, java.lang.Boolean hasMore, byte[] lastBuffer) {
        return new com.tencent.pigeon.mega_video.MegaMainFeedListContext(mainFeedList, hasMore, lastBuffer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mega_video.MegaMainFeedListContext)) {
            return false;
        }
        com.tencent.pigeon.mega_video.MegaMainFeedListContext megaMainFeedListContext = (com.tencent.pigeon.mega_video.MegaMainFeedListContext) other;
        return kotlin.jvm.internal.o.b(this.mainFeedList, megaMainFeedListContext.mainFeedList) && kotlin.jvm.internal.o.b(this.hasMore, megaMainFeedListContext.hasMore) && kotlin.jvm.internal.o.b(this.lastBuffer, megaMainFeedListContext.lastBuffer);
    }

    public final java.lang.Boolean getHasMore() {
        return this.hasMore;
    }

    public final byte[] getLastBuffer() {
        return this.lastBuffer;
    }

    public final java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> getMainFeedList() {
        return this.mainFeedList;
    }

    public int hashCode() {
        java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> list = this.mainFeedList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        byte[] bArr = this.lastBuffer;
        return hashCode2 + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.mainFeedList, this.hasMore, this.lastBuffer);
    }

    public java.lang.String toString() {
        return "MegaMainFeedListContext(mainFeedList=" + this.mainFeedList + ", hasMore=" + this.hasMore + ", lastBuffer=" + java.util.Arrays.toString(this.lastBuffer) + ')';
    }

    public MegaMainFeedListContext(java.util.List<com.tencent.pigeon.mega_video.MegaVideoFeedInfo> list, java.lang.Boolean bool, byte[] bArr) {
        this.mainFeedList = list;
        this.hasMore = bool;
        this.lastBuffer = bArr;
    }

    public /* synthetic */ MegaMainFeedListContext(java.util.List list, java.lang.Boolean bool, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : list, (i17 & 2) != 0 ? null : bool, (i17 & 4) != 0 ? null : bArr);
    }
}

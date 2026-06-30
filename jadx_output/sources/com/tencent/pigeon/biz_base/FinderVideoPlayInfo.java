package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz_base/FinderVideoPlayInfo;", "", "finder_object_nonce_id", "", "finder_object_id", "videoScrWidth", "", "videoScrHeight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getFinder_object_id", "()Ljava/lang/String;", "getFinder_object_nonce_id", "getVideoScrHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVideoScrWidth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz_base/FinderVideoPlayInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FinderVideoPlayInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.FinderVideoPlayInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.FinderVideoPlayInfo.Companion(null);
    private final java.lang.String finder_object_id;
    private final java.lang.String finder_object_nonce_id;
    private final java.lang.Long videoScrHeight;
    private final java.lang.Long videoScrWidth;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/FinderVideoPlayInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/FinderVideoPlayInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.FinderVideoPlayInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.Object obj = list.get(2);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(3);
            return new com.tencent.pigeon.biz_base.FinderVideoPlayInfo(str, str2, valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    public FinderVideoPlayInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.FinderVideoPlayInfo copy$default(com.tencent.pigeon.biz_base.FinderVideoPlayInfo finderVideoPlayInfo, java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = finderVideoPlayInfo.finder_object_nonce_id;
        }
        if ((i17 & 2) != 0) {
            str2 = finderVideoPlayInfo.finder_object_id;
        }
        if ((i17 & 4) != 0) {
            l17 = finderVideoPlayInfo.videoScrWidth;
        }
        if ((i17 & 8) != 0) {
            l18 = finderVideoPlayInfo.videoScrHeight;
        }
        return finderVideoPlayInfo.copy(str, str2, l17, l18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFinder_object_nonce_id() {
        return this.finder_object_nonce_id;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFinder_object_id() {
        return this.finder_object_id;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getVideoScrWidth() {
        return this.videoScrWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getVideoScrHeight() {
        return this.videoScrHeight;
    }

    public final com.tencent.pigeon.biz_base.FinderVideoPlayInfo copy(java.lang.String finder_object_nonce_id, java.lang.String finder_object_id, java.lang.Long videoScrWidth, java.lang.Long videoScrHeight) {
        return new com.tencent.pigeon.biz_base.FinderVideoPlayInfo(finder_object_nonce_id, finder_object_id, videoScrWidth, videoScrHeight);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.FinderVideoPlayInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.FinderVideoPlayInfo finderVideoPlayInfo = (com.tencent.pigeon.biz_base.FinderVideoPlayInfo) other;
        return kotlin.jvm.internal.o.b(this.finder_object_nonce_id, finderVideoPlayInfo.finder_object_nonce_id) && kotlin.jvm.internal.o.b(this.finder_object_id, finderVideoPlayInfo.finder_object_id) && kotlin.jvm.internal.o.b(this.videoScrWidth, finderVideoPlayInfo.videoScrWidth) && kotlin.jvm.internal.o.b(this.videoScrHeight, finderVideoPlayInfo.videoScrHeight);
    }

    public final java.lang.String getFinder_object_id() {
        return this.finder_object_id;
    }

    public final java.lang.String getFinder_object_nonce_id() {
        return this.finder_object_nonce_id;
    }

    public final java.lang.Long getVideoScrHeight() {
        return this.videoScrHeight;
    }

    public final java.lang.Long getVideoScrWidth() {
        return this.videoScrWidth;
    }

    public int hashCode() {
        java.lang.String str = this.finder_object_nonce_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.finder_object_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.videoScrWidth;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.videoScrHeight;
        return hashCode3 + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.finder_object_nonce_id, this.finder_object_id, this.videoScrWidth, this.videoScrHeight);
    }

    public java.lang.String toString() {
        return "FinderVideoPlayInfo(finder_object_nonce_id=" + this.finder_object_nonce_id + ", finder_object_id=" + this.finder_object_id + ", videoScrWidth=" + this.videoScrWidth + ", videoScrHeight=" + this.videoScrHeight + ')';
    }

    public FinderVideoPlayInfo(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.Long l18) {
        this.finder_object_nonce_id = str;
        this.finder_object_id = str2;
        this.videoScrWidth = l17;
        this.videoScrHeight = l18;
    }

    public /* synthetic */ FinderVideoPlayInfo(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : l17, (i17 & 8) != 0 ? null : l18);
    }
}

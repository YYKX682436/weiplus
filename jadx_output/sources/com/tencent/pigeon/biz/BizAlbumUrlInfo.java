package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz/BizAlbumUrlInfo;", "", "openScene", "", "subScene", "url", "", "itemShowType", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getItemShowType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpenScene", "getSubScene", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/tencent/pigeon/biz/BizAlbumUrlInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizAlbumUrlInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizAlbumUrlInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizAlbumUrlInfo.Companion(null);
    private final java.lang.Long itemShowType;
    private final java.lang.Long openScene;
    private final java.lang.Long subScene;
    private final java.lang.String url;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizAlbumUrlInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizAlbumUrlInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizAlbumUrlInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(1);
            java.lang.Long valueOf2 = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.String str = (java.lang.String) list.get(2);
            java.lang.Object obj3 = list.get(3);
            return new com.tencent.pigeon.biz.BizAlbumUrlInfo(valueOf, valueOf2, str, obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3);
        }
    }

    public BizAlbumUrlInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizAlbumUrlInfo copy$default(com.tencent.pigeon.biz.BizAlbumUrlInfo bizAlbumUrlInfo, java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Long l19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizAlbumUrlInfo.openScene;
        }
        if ((i17 & 2) != 0) {
            l18 = bizAlbumUrlInfo.subScene;
        }
        if ((i17 & 4) != 0) {
            str = bizAlbumUrlInfo.url;
        }
        if ((i17 & 8) != 0) {
            l19 = bizAlbumUrlInfo.itemShowType;
        }
        return bizAlbumUrlInfo.copy(l17, l18, str, l19);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getOpenScene() {
        return this.openScene;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getSubScene() {
        return this.subScene;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getItemShowType() {
        return this.itemShowType;
    }

    public final com.tencent.pigeon.biz.BizAlbumUrlInfo copy(java.lang.Long openScene, java.lang.Long subScene, java.lang.String url, java.lang.Long itemShowType) {
        return new com.tencent.pigeon.biz.BizAlbumUrlInfo(openScene, subScene, url, itemShowType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizAlbumUrlInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizAlbumUrlInfo bizAlbumUrlInfo = (com.tencent.pigeon.biz.BizAlbumUrlInfo) other;
        return kotlin.jvm.internal.o.b(this.openScene, bizAlbumUrlInfo.openScene) && kotlin.jvm.internal.o.b(this.subScene, bizAlbumUrlInfo.subScene) && kotlin.jvm.internal.o.b(this.url, bizAlbumUrlInfo.url) && kotlin.jvm.internal.o.b(this.itemShowType, bizAlbumUrlInfo.itemShowType);
    }

    public final java.lang.Long getItemShowType() {
        return this.itemShowType;
    }

    public final java.lang.Long getOpenScene() {
        return this.openScene;
    }

    public final java.lang.Long getSubScene() {
        return this.subScene;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        java.lang.Long l17 = this.openScene;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.subScene;
        int hashCode2 = (hashCode + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l19 = this.itemShowType;
        return hashCode3 + (l19 != null ? l19.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.openScene, this.subScene, this.url, this.itemShowType);
    }

    public java.lang.String toString() {
        return "BizAlbumUrlInfo(openScene=" + this.openScene + ", subScene=" + this.subScene + ", url=" + this.url + ", itemShowType=" + this.itemShowType + ')';
    }

    public BizAlbumUrlInfo(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Long l19) {
        this.openScene = l17;
        this.subScene = l18;
        this.url = str;
        this.itemShowType = l19;
    }

    public /* synthetic */ BizAlbumUrlInfo(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Long l19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : l18, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : l19);
    }
}

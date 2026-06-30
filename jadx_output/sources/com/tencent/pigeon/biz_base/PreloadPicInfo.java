package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/biz_base/PreloadPicInfo;", "", "contentUrl", "", "preloadPicUrls", "", "(Ljava/lang/String;Ljava/util/List;)V", "getContentUrl", "()Ljava/lang/String;", "getPreloadPicUrls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PreloadPicInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.PreloadPicInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.PreloadPicInfo.Companion(null);
    private final java.lang.String contentUrl;
    private final java.util.List<java.lang.String> preloadPicUrls;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/PreloadPicInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/PreloadPicInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.PreloadPicInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz_base.PreloadPicInfo((java.lang.String) list.get(0), (java.util.List) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadPicInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz_base.PreloadPicInfo copy$default(com.tencent.pigeon.biz_base.PreloadPicInfo preloadPicInfo, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = preloadPicInfo.contentUrl;
        }
        if ((i17 & 2) != 0) {
            list = preloadPicInfo.preloadPicUrls;
        }
        return preloadPicInfo.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getContentUrl() {
        return this.contentUrl;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.preloadPicUrls;
    }

    public final com.tencent.pigeon.biz_base.PreloadPicInfo copy(java.lang.String contentUrl, java.util.List<java.lang.String> preloadPicUrls) {
        return new com.tencent.pigeon.biz_base.PreloadPicInfo(contentUrl, preloadPicUrls);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.PreloadPicInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.PreloadPicInfo preloadPicInfo = (com.tencent.pigeon.biz_base.PreloadPicInfo) other;
        return kotlin.jvm.internal.o.b(this.contentUrl, preloadPicInfo.contentUrl) && kotlin.jvm.internal.o.b(this.preloadPicUrls, preloadPicInfo.preloadPicUrls);
    }

    public final java.lang.String getContentUrl() {
        return this.contentUrl;
    }

    public final java.util.List<java.lang.String> getPreloadPicUrls() {
        return this.preloadPicUrls;
    }

    public int hashCode() {
        java.lang.String str = this.contentUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.preloadPicUrls;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.contentUrl, this.preloadPicUrls);
    }

    public java.lang.String toString() {
        return "PreloadPicInfo(contentUrl=" + this.contentUrl + ", preloadPicUrls=" + this.preloadPicUrls + ')';
    }

    public PreloadPicInfo(java.lang.String str, java.util.List<java.lang.String> list) {
        this.contentUrl = str;
        this.preloadPicUrls = list;
    }

    public /* synthetic */ PreloadPicInfo(java.lang.String str, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : list);
    }
}

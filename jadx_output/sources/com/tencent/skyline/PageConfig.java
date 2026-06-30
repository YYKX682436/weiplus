package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/tencent/skyline/PageConfig;", "", "backgroundColorContent", "", "pageUrl", "", "(ILjava/lang/String;)V", "useSplashCache", "", "snapshotDelay", "imageBlockingCount", "(ILjava/lang/String;ZII)V", "getBackgroundColorContent", "()I", "getImageBlockingCount", "getPageUrl", "()Ljava/lang/String;", "getSnapshotDelay", "getUseSplashCache", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PageConfig {
    private final int backgroundColorContent;
    private final int imageBlockingCount;
    private final java.lang.String pageUrl;
    private final int snapshotDelay;
    private final boolean useSplashCache;

    public PageConfig(int i17, java.lang.String str, boolean z17, int i18, int i19) {
        this.backgroundColorContent = i17;
        this.pageUrl = str;
        this.useSplashCache = z17;
        this.snapshotDelay = i18;
        this.imageBlockingCount = i19;
    }

    public static /* synthetic */ com.tencent.skyline.PageConfig copy$default(com.tencent.skyline.PageConfig pageConfig, int i17, java.lang.String str, boolean z17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = pageConfig.backgroundColorContent;
        }
        if ((i27 & 2) != 0) {
            str = pageConfig.pageUrl;
        }
        java.lang.String str2 = str;
        if ((i27 & 4) != 0) {
            z17 = pageConfig.useSplashCache;
        }
        boolean z18 = z17;
        if ((i27 & 8) != 0) {
            i18 = pageConfig.snapshotDelay;
        }
        int i28 = i18;
        if ((i27 & 16) != 0) {
            i19 = pageConfig.imageBlockingCount;
        }
        return pageConfig.copy(i17, str2, z18, i28, i19);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColorContent() {
        return this.backgroundColorContent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPageUrl() {
        return this.pageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseSplashCache() {
        return this.useSplashCache;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSnapshotDelay() {
        return this.snapshotDelay;
    }

    /* renamed from: component5, reason: from getter */
    public final int getImageBlockingCount() {
        return this.imageBlockingCount;
    }

    public final com.tencent.skyline.PageConfig copy(int backgroundColorContent, java.lang.String pageUrl, boolean useSplashCache, int snapshotDelay, int imageBlockingCount) {
        return new com.tencent.skyline.PageConfig(backgroundColorContent, pageUrl, useSplashCache, snapshotDelay, imageBlockingCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.skyline.PageConfig)) {
            return false;
        }
        com.tencent.skyline.PageConfig pageConfig = (com.tencent.skyline.PageConfig) other;
        return this.backgroundColorContent == pageConfig.backgroundColorContent && kotlin.jvm.internal.o.b(this.pageUrl, pageConfig.pageUrl) && this.useSplashCache == pageConfig.useSplashCache && this.snapshotDelay == pageConfig.snapshotDelay && this.imageBlockingCount == pageConfig.imageBlockingCount;
    }

    public final int getBackgroundColorContent() {
        return this.backgroundColorContent;
    }

    public final int getImageBlockingCount() {
        return this.imageBlockingCount;
    }

    public final java.lang.String getPageUrl() {
        return this.pageUrl;
    }

    public final int getSnapshotDelay() {
        return this.snapshotDelay;
    }

    public final boolean getUseSplashCache() {
        return this.useSplashCache;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.backgroundColorContent) * 31;
        java.lang.String str = this.pageUrl;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.useSplashCache)) * 31) + java.lang.Integer.hashCode(this.snapshotDelay)) * 31) + java.lang.Integer.hashCode(this.imageBlockingCount);
    }

    public java.lang.String toString() {
        return "PageConfig(backgroundColorContent=" + this.backgroundColorContent + ", pageUrl=" + this.pageUrl + ", useSplashCache=" + this.useSplashCache + ", snapshotDelay=" + this.snapshotDelay + ", imageBlockingCount=" + this.imageBlockingCount + ')';
    }

    public /* synthetic */ PageConfig(int i17, java.lang.String str, boolean z17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, str, (i27 & 4) != 0 ? false : z17, (i27 & 8) != 0 ? 0 : i18, (i27 & 16) != 0 ? -1 : i19);
    }

    public PageConfig(int i17, java.lang.String str) {
        this(i17, str, false, 0, -1);
    }
}

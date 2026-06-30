package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/skyline/PageMonitorConfig;", "", "enablePageDetect", "", "(Z)V", "getEnablePageDetect", "()Z", "setEnablePageDetect", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PageMonitorConfig {
    private boolean enablePageDetect;

    public PageMonitorConfig() {
        this(false, 1, null);
    }

    public static /* synthetic */ com.tencent.skyline.PageMonitorConfig copy$default(com.tencent.skyline.PageMonitorConfig pageMonitorConfig, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = pageMonitorConfig.enablePageDetect;
        }
        return pageMonitorConfig.copy(z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnablePageDetect() {
        return this.enablePageDetect;
    }

    public final com.tencent.skyline.PageMonitorConfig copy(boolean enablePageDetect) {
        return new com.tencent.skyline.PageMonitorConfig(enablePageDetect);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.skyline.PageMonitorConfig) && this.enablePageDetect == ((com.tencent.skyline.PageMonitorConfig) other).enablePageDetect;
    }

    public final boolean getEnablePageDetect() {
        return this.enablePageDetect;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.enablePageDetect);
    }

    public final void setEnablePageDetect(boolean z17) {
        this.enablePageDetect = z17;
    }

    public java.lang.String toString() {
        return "PageMonitorConfig(enablePageDetect=" + this.enablePageDetect + ')';
    }

    public PageMonitorConfig(boolean z17) {
        this.enablePageDetect = z17;
    }

    public /* synthetic */ PageMonitorConfig(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}

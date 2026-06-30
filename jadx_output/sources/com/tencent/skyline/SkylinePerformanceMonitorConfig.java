package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/tencent/skyline/SkylinePerformanceMonitorConfig;", "", "slowFrameStackConfig", "Lcom/tencent/skyline/SlowFrameStackConfig;", "slowDisplayFrameConfig", "Lcom/tencent/skyline/SlowDisplayFrameConfig;", "pageMonitorConfig", "Lcom/tencent/skyline/PageMonitorConfig;", "(Lcom/tencent/skyline/SlowFrameStackConfig;Lcom/tencent/skyline/SlowDisplayFrameConfig;Lcom/tencent/skyline/PageMonitorConfig;)V", "getPageMonitorConfig", "()Lcom/tencent/skyline/PageMonitorConfig;", "setPageMonitorConfig", "(Lcom/tencent/skyline/PageMonitorConfig;)V", "getSlowDisplayFrameConfig", "()Lcom/tencent/skyline/SlowDisplayFrameConfig;", "setSlowDisplayFrameConfig", "(Lcom/tencent/skyline/SlowDisplayFrameConfig;)V", "getSlowFrameStackConfig", "()Lcom/tencent/skyline/SlowFrameStackConfig;", "setSlowFrameStackConfig", "(Lcom/tencent/skyline/SlowFrameStackConfig;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SkylinePerformanceMonitorConfig {
    private com.tencent.skyline.PageMonitorConfig pageMonitorConfig;
    private com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig;
    private com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig;

    public SkylinePerformanceMonitorConfig(com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig, com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig, com.tencent.skyline.PageMonitorConfig pageMonitorConfig) {
        kotlin.jvm.internal.o.g(slowFrameStackConfig, "slowFrameStackConfig");
        kotlin.jvm.internal.o.g(slowDisplayFrameConfig, "slowDisplayFrameConfig");
        kotlin.jvm.internal.o.g(pageMonitorConfig, "pageMonitorConfig");
        this.slowFrameStackConfig = slowFrameStackConfig;
        this.slowDisplayFrameConfig = slowDisplayFrameConfig;
        this.pageMonitorConfig = pageMonitorConfig;
    }

    public static /* synthetic */ com.tencent.skyline.SkylinePerformanceMonitorConfig copy$default(com.tencent.skyline.SkylinePerformanceMonitorConfig skylinePerformanceMonitorConfig, com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig, com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig, com.tencent.skyline.PageMonitorConfig pageMonitorConfig, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            slowFrameStackConfig = skylinePerformanceMonitorConfig.slowFrameStackConfig;
        }
        if ((i17 & 2) != 0) {
            slowDisplayFrameConfig = skylinePerformanceMonitorConfig.slowDisplayFrameConfig;
        }
        if ((i17 & 4) != 0) {
            pageMonitorConfig = skylinePerformanceMonitorConfig.pageMonitorConfig;
        }
        return skylinePerformanceMonitorConfig.copy(slowFrameStackConfig, slowDisplayFrameConfig, pageMonitorConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.skyline.SlowFrameStackConfig getSlowFrameStackConfig() {
        return this.slowFrameStackConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.skyline.SlowDisplayFrameConfig getSlowDisplayFrameConfig() {
        return this.slowDisplayFrameConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tencent.skyline.PageMonitorConfig getPageMonitorConfig() {
        return this.pageMonitorConfig;
    }

    public final com.tencent.skyline.SkylinePerformanceMonitorConfig copy(com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig, com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig, com.tencent.skyline.PageMonitorConfig pageMonitorConfig) {
        kotlin.jvm.internal.o.g(slowFrameStackConfig, "slowFrameStackConfig");
        kotlin.jvm.internal.o.g(slowDisplayFrameConfig, "slowDisplayFrameConfig");
        kotlin.jvm.internal.o.g(pageMonitorConfig, "pageMonitorConfig");
        return new com.tencent.skyline.SkylinePerformanceMonitorConfig(slowFrameStackConfig, slowDisplayFrameConfig, pageMonitorConfig);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.skyline.SkylinePerformanceMonitorConfig)) {
            return false;
        }
        com.tencent.skyline.SkylinePerformanceMonitorConfig skylinePerformanceMonitorConfig = (com.tencent.skyline.SkylinePerformanceMonitorConfig) other;
        return kotlin.jvm.internal.o.b(this.slowFrameStackConfig, skylinePerformanceMonitorConfig.slowFrameStackConfig) && kotlin.jvm.internal.o.b(this.slowDisplayFrameConfig, skylinePerformanceMonitorConfig.slowDisplayFrameConfig) && kotlin.jvm.internal.o.b(this.pageMonitorConfig, skylinePerformanceMonitorConfig.pageMonitorConfig);
    }

    public final com.tencent.skyline.PageMonitorConfig getPageMonitorConfig() {
        return this.pageMonitorConfig;
    }

    public final com.tencent.skyline.SlowDisplayFrameConfig getSlowDisplayFrameConfig() {
        return this.slowDisplayFrameConfig;
    }

    public final com.tencent.skyline.SlowFrameStackConfig getSlowFrameStackConfig() {
        return this.slowFrameStackConfig;
    }

    public int hashCode() {
        return (((this.slowFrameStackConfig.hashCode() * 31) + this.slowDisplayFrameConfig.hashCode()) * 31) + this.pageMonitorConfig.hashCode();
    }

    public final void setPageMonitorConfig(com.tencent.skyline.PageMonitorConfig pageMonitorConfig) {
        kotlin.jvm.internal.o.g(pageMonitorConfig, "<set-?>");
        this.pageMonitorConfig = pageMonitorConfig;
    }

    public final void setSlowDisplayFrameConfig(com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig) {
        kotlin.jvm.internal.o.g(slowDisplayFrameConfig, "<set-?>");
        this.slowDisplayFrameConfig = slowDisplayFrameConfig;
    }

    public final void setSlowFrameStackConfig(com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig) {
        kotlin.jvm.internal.o.g(slowFrameStackConfig, "<set-?>");
        this.slowFrameStackConfig = slowFrameStackConfig;
    }

    public java.lang.String toString() {
        return "SkylinePerformanceMonitorConfig(slowFrameStackConfig=" + this.slowFrameStackConfig + ", slowDisplayFrameConfig=" + this.slowDisplayFrameConfig + ", pageMonitorConfig=" + this.pageMonitorConfig + ')';
    }
}

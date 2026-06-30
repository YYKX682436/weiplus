package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/skyline/SlowDisplayFrameConfig;", "", "enableFrameKit", "", "enableFrameKitStackTrace", "enableFrameKitTraceLayoutDetail", "(ZZZ)V", "getEnableFrameKit", "()Z", "setEnableFrameKit", "(Z)V", "getEnableFrameKitStackTrace", "setEnableFrameKitStackTrace", "getEnableFrameKitTraceLayoutDetail", "setEnableFrameKitTraceLayoutDetail", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlowDisplayFrameConfig {
    private boolean enableFrameKit;
    private boolean enableFrameKitStackTrace;
    private boolean enableFrameKitTraceLayoutDetail;

    public SlowDisplayFrameConfig() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ com.tencent.skyline.SlowDisplayFrameConfig copy$default(com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = slowDisplayFrameConfig.enableFrameKit;
        }
        if ((i17 & 2) != 0) {
            z18 = slowDisplayFrameConfig.enableFrameKitStackTrace;
        }
        if ((i17 & 4) != 0) {
            z19 = slowDisplayFrameConfig.enableFrameKitTraceLayoutDetail;
        }
        return slowDisplayFrameConfig.copy(z17, z18, z19);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableFrameKit() {
        return this.enableFrameKit;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableFrameKitStackTrace() {
        return this.enableFrameKitStackTrace;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableFrameKitTraceLayoutDetail() {
        return this.enableFrameKitTraceLayoutDetail;
    }

    public final com.tencent.skyline.SlowDisplayFrameConfig copy(boolean enableFrameKit, boolean enableFrameKitStackTrace, boolean enableFrameKitTraceLayoutDetail) {
        return new com.tencent.skyline.SlowDisplayFrameConfig(enableFrameKit, enableFrameKitStackTrace, enableFrameKitTraceLayoutDetail);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.skyline.SlowDisplayFrameConfig)) {
            return false;
        }
        com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig = (com.tencent.skyline.SlowDisplayFrameConfig) other;
        return this.enableFrameKit == slowDisplayFrameConfig.enableFrameKit && this.enableFrameKitStackTrace == slowDisplayFrameConfig.enableFrameKitStackTrace && this.enableFrameKitTraceLayoutDetail == slowDisplayFrameConfig.enableFrameKitTraceLayoutDetail;
    }

    public final boolean getEnableFrameKit() {
        return this.enableFrameKit;
    }

    public final boolean getEnableFrameKitStackTrace() {
        return this.enableFrameKitStackTrace;
    }

    public final boolean getEnableFrameKitTraceLayoutDetail() {
        return this.enableFrameKitTraceLayoutDetail;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.enableFrameKit) * 31) + java.lang.Boolean.hashCode(this.enableFrameKitStackTrace)) * 31) + java.lang.Boolean.hashCode(this.enableFrameKitTraceLayoutDetail);
    }

    public final void setEnableFrameKit(boolean z17) {
        this.enableFrameKit = z17;
    }

    public final void setEnableFrameKitStackTrace(boolean z17) {
        this.enableFrameKitStackTrace = z17;
    }

    public final void setEnableFrameKitTraceLayoutDetail(boolean z17) {
        this.enableFrameKitTraceLayoutDetail = z17;
    }

    public java.lang.String toString() {
        return "SlowDisplayFrameConfig(enableFrameKit=" + this.enableFrameKit + ", enableFrameKitStackTrace=" + this.enableFrameKitStackTrace + ", enableFrameKitTraceLayoutDetail=" + this.enableFrameKitTraceLayoutDetail + ')';
    }

    public SlowDisplayFrameConfig(boolean z17, boolean z18, boolean z19) {
        this.enableFrameKit = z17;
        this.enableFrameKitStackTrace = z18;
        this.enableFrameKitTraceLayoutDetail = z19;
    }

    public /* synthetic */ SlowDisplayFrameConfig(boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? false : z18, (i17 & 4) != 0 ? false : z19);
    }
}

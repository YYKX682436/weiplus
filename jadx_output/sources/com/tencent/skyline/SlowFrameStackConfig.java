package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tencent/skyline/SlowFrameStackConfig;", "", "enableAnrDetect", "", "uiThreshold", "", "rasterThreshold", "(ZII)V", "getEnableAnrDetect", "()Z", "setEnableAnrDetect", "(Z)V", "getRasterThreshold", "()I", "setRasterThreshold", "(I)V", "getUiThreshold", "setUiThreshold", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlowFrameStackConfig {
    private boolean enableAnrDetect;
    private int rasterThreshold;
    private int uiThreshold;

    public SlowFrameStackConfig() {
        this(false, 0, 0, 7, null);
    }

    public static /* synthetic */ com.tencent.skyline.SlowFrameStackConfig copy$default(com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig, boolean z17, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            z17 = slowFrameStackConfig.enableAnrDetect;
        }
        if ((i19 & 2) != 0) {
            i17 = slowFrameStackConfig.uiThreshold;
        }
        if ((i19 & 4) != 0) {
            i18 = slowFrameStackConfig.rasterThreshold;
        }
        return slowFrameStackConfig.copy(z17, i17, i18);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableAnrDetect() {
        return this.enableAnrDetect;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUiThreshold() {
        return this.uiThreshold;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRasterThreshold() {
        return this.rasterThreshold;
    }

    public final com.tencent.skyline.SlowFrameStackConfig copy(boolean enableAnrDetect, int uiThreshold, int rasterThreshold) {
        return new com.tencent.skyline.SlowFrameStackConfig(enableAnrDetect, uiThreshold, rasterThreshold);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.skyline.SlowFrameStackConfig)) {
            return false;
        }
        com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig = (com.tencent.skyline.SlowFrameStackConfig) other;
        return this.enableAnrDetect == slowFrameStackConfig.enableAnrDetect && this.uiThreshold == slowFrameStackConfig.uiThreshold && this.rasterThreshold == slowFrameStackConfig.rasterThreshold;
    }

    public final boolean getEnableAnrDetect() {
        return this.enableAnrDetect;
    }

    public final int getRasterThreshold() {
        return this.rasterThreshold;
    }

    public final int getUiThreshold() {
        return this.uiThreshold;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.enableAnrDetect) * 31) + java.lang.Integer.hashCode(this.uiThreshold)) * 31) + java.lang.Integer.hashCode(this.rasterThreshold);
    }

    public final void setEnableAnrDetect(boolean z17) {
        this.enableAnrDetect = z17;
    }

    public final void setRasterThreshold(int i17) {
        this.rasterThreshold = i17;
    }

    public final void setUiThreshold(int i17) {
        this.uiThreshold = i17;
    }

    public java.lang.String toString() {
        return "SlowFrameStackConfig(enableAnrDetect=" + this.enableAnrDetect + ", uiThreshold=" + this.uiThreshold + ", rasterThreshold=" + this.rasterThreshold + ')';
    }

    public SlowFrameStackConfig(boolean z17, int i17, int i18) {
        this.enableAnrDetect = z17;
        this.uiThreshold = i17;
        this.rasterThreshold = i18;
    }

    public /* synthetic */ SlowFrameStackConfig(boolean z17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? false : z17, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? 0 : i18);
    }
}

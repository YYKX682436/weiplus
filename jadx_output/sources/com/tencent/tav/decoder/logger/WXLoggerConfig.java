package com.tencent.tav.decoder.logger;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0000J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "", "enable", "", ya.b.LEVEL, "", "traceId", "", "enableFrameDetail", "(ZILjava/lang/String;Z)V", "getEnable", "()Z", "getEnableFrameDetail", "getLevel", "()I", "getTraceId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "copyConfig", "equals", "other", "hashCode", "toString", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WXLoggerConfig {
    private final boolean enable;
    private final boolean enableFrameDetail;
    private final int level;
    private final java.lang.String traceId;

    public WXLoggerConfig() {
        this(false, 0, null, false, 15, null);
    }

    public static /* synthetic */ com.tencent.tav.decoder.logger.WXLoggerConfig copy$default(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig, boolean z17, int i17, java.lang.String str, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = wXLoggerConfig.enable;
        }
        if ((i18 & 2) != 0) {
            i17 = wXLoggerConfig.level;
        }
        if ((i18 & 4) != 0) {
            str = wXLoggerConfig.traceId;
        }
        if ((i18 & 8) != 0) {
            z18 = wXLoggerConfig.enableFrameDetail;
        }
        return wXLoggerConfig.copy(z17, i17, str, z18);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableFrameDetail() {
        return this.enableFrameDetail;
    }

    public final com.tencent.tav.decoder.logger.WXLoggerConfig copy(boolean enable, int level, java.lang.String traceId, boolean enableFrameDetail) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        return new com.tencent.tav.decoder.logger.WXLoggerConfig(enable, level, traceId, enableFrameDetail);
    }

    public final com.tencent.tav.decoder.logger.WXLoggerConfig copyConfig() {
        return copy$default(this, false, 0, null, false, 15, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.tav.decoder.logger.WXLoggerConfig)) {
            return false;
        }
        com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig = (com.tencent.tav.decoder.logger.WXLoggerConfig) other;
        return this.enable == wXLoggerConfig.enable && this.level == wXLoggerConfig.level && kotlin.jvm.internal.o.b(this.traceId, wXLoggerConfig.traceId) && this.enableFrameDetail == wXLoggerConfig.enableFrameDetail;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableFrameDetail() {
        return this.enableFrameDetail;
    }

    public final int getLevel() {
        return this.level;
    }

    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.enable) * 31) + java.lang.Integer.hashCode(this.level)) * 31) + this.traceId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enableFrameDetail);
    }

    public java.lang.String toString() {
        return "WXLoggerConfig(enable=" + this.enable + ", level=" + this.level + ", traceId=" + this.traceId + ", enableFrameDetail=" + this.enableFrameDetail + ')';
    }

    public WXLoggerConfig(boolean z17, int i17, java.lang.String traceId, boolean z18) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        this.enable = z17;
        this.level = i17;
        this.traceId = traceId;
        this.enableFrameDetail = z18;
    }

    public /* synthetic */ WXLoggerConfig(boolean z17, int i17, java.lang.String str, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? true : z17, (i18 & 2) != 0 ? 2 : i17, (i18 & 4) != 0 ? "" : str, (i18 & 8) != 0 ? true : z18);
    }
}

package com.tencent.tav.decoder.logger;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J7\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000b\"\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0010\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/tencent/tav/decoder/logger/WXLogger;", "Lcom/tencent/tav/decoder/logger/ILog;", "", "tag", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "Ljz5/f0;", org.chromium.base.BaseSwitches.V, "d", "frame", "i", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "", "", "args", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "w", "e", "", "t", "Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "config", "Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "getConfig", "()Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "setConfig", "(Lcom/tencent/tav/decoder/logger/WXLoggerConfig;)V", "<init>", "()V", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class WXLogger implements com.tencent.tav.decoder.logger.ILog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.tav.decoder.logger.WXLogger.Companion INSTANCE = new com.tencent.tav.decoder.logger.WXLogger.Companion(null);
    private com.tencent.tav.decoder.logger.WXLoggerConfig config = new com.tencent.tav.decoder.logger.WXLoggerConfig(true, 4, null, false, 12, null);

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/tav/decoder/logger/WXLogger$Companion;", "", "()V", "defaultLogger", "Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.tav.decoder.logger.WXLoggerConfig defaultLogger() {
            return new com.tencent.tav.decoder.logger.WXLoggerConfig(false, 0, null, false, 15, null);
        }
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void d(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.d(str, str2);
        }
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void e(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.e(str, str2);
        }
    }

    public final void frame(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable() && this.config.getEnableFrameDetail()) {
            com.tencent.tav.decoder.logger.Logger.i(str, str2);
        }
    }

    public final com.tencent.tav.decoder.logger.WXLoggerConfig getConfig() {
        return this.config;
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void i(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.i(str, str2);
        }
    }

    public final void setConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        kotlin.jvm.internal.o.g(wXLoggerConfig, "<set-?>");
        this.config = wXLoggerConfig;
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void v(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.v(str, str2);
        }
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void w(java.lang.String str, java.lang.String str2) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.w(str, str2);
        }
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.e(str, str2, th6);
        }
    }

    public final void i(java.lang.String tag, java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        if (this.config.getEnable()) {
            com.tencent.tav.decoder.logger.Logger.i(tag, format, java.util.Arrays.copyOf(args, args.length));
        }
    }
}

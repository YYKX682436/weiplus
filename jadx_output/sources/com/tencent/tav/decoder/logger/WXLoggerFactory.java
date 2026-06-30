package com.tencent.tav.decoder.logger;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tencent/tav/decoder/logger/WXLoggerFactory;", "", "()V", "SCENE_BACKGROUND", "", "SCENE_NORMAL", "create", "Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "traceId", "", "defaultConfig", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WXLoggerFactory {
    public static final com.tencent.tav.decoder.logger.WXLoggerFactory INSTANCE = new com.tencent.tav.decoder.logger.WXLoggerFactory();
    public static final int SCENE_BACKGROUND = 1;
    public static final int SCENE_NORMAL = 0;

    private WXLoggerFactory() {
    }

    public final com.tencent.tav.decoder.logger.WXLoggerConfig create(int scene, java.lang.String traceId) {
        kotlin.jvm.internal.o.g(traceId, "traceId");
        return 1 == scene ? new com.tencent.tav.decoder.logger.WXLoggerConfig(true, 0, null, false, 6, null) : defaultConfig();
    }

    public final com.tencent.tav.decoder.logger.WXLoggerConfig defaultConfig() {
        return new com.tencent.tav.decoder.logger.WXLoggerConfig(false, 0, null, false, 15, null);
    }
}

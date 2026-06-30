package com.tencent.thumbplayer.adapter.player;

/* loaded from: classes16.dex */
public final class TPPlayerBaseFactory {
    public static com.tencent.thumbplayer.adapter.player.ITPPlayerBase createSystemMediaPlayer(android.content.Context context, boolean z17, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        return z17 ? new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer(context, tPLoggerContext) : new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer(context, tPLoggerContext);
    }

    public static com.tencent.thumbplayer.adapter.player.ITPPlayerBase createThumbPlayer(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        return new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer(context, tPLoggerContext);
    }
}

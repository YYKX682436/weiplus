package com.tencent.thumbplayer.api.connection;

/* loaded from: classes6.dex */
public class TPPlayerConnectionConstant {

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction(-1)
    public static final int ACTION_NONE = -1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction(1)
    public static final int ACTION_OBTAIN_SYNC_CLOCK = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionAction(0)
    public static final int ACTION_PROVIDE_SYNC_CLOCK = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapConnectionConfig(0)
    public static final int CFG_LONG_SYNC_CLOCK_OFFSET_MS = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface Action {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Config {
    }
}

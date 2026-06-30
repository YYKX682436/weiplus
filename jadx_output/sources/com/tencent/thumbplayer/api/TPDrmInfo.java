package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPDrmInfo {

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType(8)
    public static final int TP_PLAYER_DRM_TYPE_CHACHA20 = 8;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType(64)
    public static final int TP_PLAYER_DRM_TYPE_CHINA_DRM = 64;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType(-1)
    public static final int TP_PLAYER_DRM_TYPE_NONE = -1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType(4)
    public static final int TP_PLAYER_DRM_TYPE_TAIHE = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType(32)
    public static final int TP_PLAYER_DRM_TYPE_WIDEVINE = 32;
    public java.lang.String drmComponentName;
    public long drmGetKeyReqEndTimeMs;
    public long drmGetKeyReqStartTimeMs;
    public long drmGetProvisionReqEndTimeMs;
    public long drmGetProvisionReqStartTimeMs;
    public long drmOpenSessionEndTimeMs;
    public long drmOpenSessionStartTimeMs;
    public long drmPrepareEndTimeMs;
    public long drmPrepareStartTimeMs;
    public long drmProvideKeyRespEndTimeMs;
    public long drmProvideKeyRespStartTimeMs;
    public long drmProvideProvisionRespEndTimeMs;
    public long drmProvideProvisionRespStartTimeMs;
    public long drmRecvKeyRespTimeMs;
    public long drmRecvProvisionRespTimeMs;
    public long drmSendKeyReqTimeMs;
    public long drmSendProvisionReqTimeMs;
    public int drmAbility = -1;
    public int drmSupportSecureDecoder = -1;
    public int drmSupportSecureDecrypt = -1;
    public int drmSecureLevel = -1;

    @com.tencent.thumbplayer.api.TPDrmInfo.TPPlayerDrmType
    public int drmType = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPPlayerDrmType {
    }
}

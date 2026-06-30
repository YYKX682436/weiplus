package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public class TPPlayerDetailInfo {

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(16)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_END = 16;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(15)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_START = 15;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(18)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_END = 18;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(17)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_START = 17;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(4)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_END = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(3)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_START = 3;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(5)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_ON_PREAPRED = 5;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(2)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_PREPARE_START = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(8)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_DECODER_CREATE_START = 8;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(10)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_FRAME_RENDERED = 10;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(0)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_START = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(7)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_DECODER_CREATE_START = 7;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(9)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_FRAME_RENDERED = 9;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(6)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_ON_PREAPRED = 6;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(1)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_PREPARE_START = 1;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_AUDIO_FRAME_RENDERED = 1006;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_VIDEO_FRAME_RENDERED = 1005;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_PREPARED = 1004;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_PREPARE_START = 1003;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_END = 1001;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_START = 1000;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(12)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_END = 12;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(11)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_START = 11;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(14)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_END = 14;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(13)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_START = 13;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType(-1)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_UNKNOWN = -1;
    public long timeSince1970Ms;

    @com.tencent.thumbplayer.api.TPPlayerDetailInfo.TPPlayerDetailInfoType
    public int type;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPPlayerDetailInfoType {
    }

    public TPPlayerDetailInfo(@com.tencent.thumbplayer.api.TPPlayerDetailInfo.TPPlayerDetailInfoType int i17, long j17) {
        this.type = i17;
        this.timeSince1970Ms = j17;
    }

    public TPPlayerDetailInfo(@com.tencent.thumbplayer.api.TPPlayerDetailInfo.TPPlayerDetailInfoType int i17) {
        this(i17, java.lang.System.currentTimeMillis());
    }
}

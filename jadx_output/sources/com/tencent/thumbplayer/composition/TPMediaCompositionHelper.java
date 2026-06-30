package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
class TPMediaCompositionHelper {
    static final java.lang.String EMPTY_CLIP_FLAG = "1";
    public static final int END_OF_FILE = -1;
    static final java.lang.String NORMAL_CLIP_FLAG = "0";
    static final java.lang.String XML_TAG_ASSERT = "assets";
    static final java.lang.String XML_TAG_AUDIO_TRACK = "audio_track";
    static final java.lang.String XML_TAG_AUDIO_TRACKS = "audio_tracks";
    static final java.lang.String XML_TAG_AV_TRACK = "av_track";
    static final java.lang.String XML_TAG_AV_TRACKS = "av_tracks";
    static final java.lang.String XML_TAG_CLIP_DURATION = "clip_durationMs";
    static final java.lang.String XML_TAG_CLIP_END_TIME = "clip_endTimeMs";
    static final java.lang.String XML_TAG_CLIP_ID = "clip_id";
    static final java.lang.String XML_TAG_CLIP_PATH = "clip_path";
    static final java.lang.String XML_TAG_CLIP_PLACE_HOLDER = "clip_placeHolder";
    static final java.lang.String XML_TAG_CLIP_PLAY_TIME = "clip_playTimeMs";
    static final java.lang.String XML_TAG_CLIP_START_TIME = "clip_startTimeMs";
    static final java.lang.String XML_TAG_DRM_APPVER = "clip_drmAppVersion";
    static final java.lang.String XML_TAG_DRM_COMMON_KEY = "clip_drmCommonKey";
    static final java.lang.String XML_TAG_DRM_COOKIE = "clip_drmCookie";
    static final java.lang.String XML_TAG_DRM_GUID = "clip_drmGuid";
    static final java.lang.String XML_TAG_DRM_LICENSE = "clip_drmLicenseUrl";
    static final java.lang.String XML_TAG_DRM_LICENSE_HTTP_HEADERS = "clip_drmLicenseHttpHeaders";
    static final java.lang.String XML_TAG_DRM_LICENSE_STANDARDIZATION = "clip_drmLicenseStandardization";
    static final java.lang.String XML_TAG_DRM_PLATFORM = "clip_drmPlatform";
    static final java.lang.String XML_TAG_DRM_PROVISION = "clip_drmProvisionUrl";
    static final java.lang.String XML_TAG_DRM_SAVE_PATH = "clip_drmSavePath";
    static final java.lang.String XML_TAG_DRM_TYPE = "clip_drmType";
    static final java.lang.String XML_TAG_DRM_USEL1 = "clip_drmUseL1";
    static final java.lang.String XML_TAG_PREFERRED_PROPERTY = "clip_preferredProperty";
    static final java.lang.String XML_TAG_RTC_SDP_EXCHANGE_TYPE = "clip_rtcSdpExchangeType";
    static final java.lang.String XML_TAG_RTC_SERVER_URL = "clip_rtcServerUrl";
    static final java.lang.String XML_TAG_TRACK_CLIP = "track_clip";
    static final java.lang.String XML_TAG_TRACK_ID = "track_id";
    static final java.lang.String XML_TAG_UTF8 = "UTF-8";
    static final java.lang.String XML_TAG_VIDEO_TRACK = "video_track";
    static final java.lang.String XML_TAG_VIDEO_TRACKS = "video_tracks";
    private static int audioClidId = 0;
    private static int avClidId = 0;
    public static java.lang.String composition_duration_strategy = "base_video";
    private static int videoClidId;

    public static int generateTrackClipId(int i17) {
        if (i17 == 1) {
            int i18 = avClidId;
            avClidId = i18 + 1;
            return i18;
        }
        if (i17 == 2) {
            int i19 = videoClidId;
            videoClidId = i19 + 1;
            return i19;
        }
        if (i17 != 3) {
            return -1;
        }
        int i27 = audioClidId;
        audioClidId = i27 + 1;
        return i27;
    }
}

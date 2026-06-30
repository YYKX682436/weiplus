package com.tencent.thumbplayer.core.player;

/* loaded from: classes16.dex */
public class TPNativePlayerInitConfig {
    public static final int BOOL_ENABLE_ACCURATE_DURATION = 131;
    public static final int BOOL_ENABLE_ASYNC_MEDIA_CODEC = 206;
    public static final int BOOL_ENABLE_AUDIO_FRAME_CALLBACK = 402;
    public static final int BOOL_ENABLE_AUDIO_PASSTHROUGH = 210;
    public static final int BOOL_ENABLE_AUDIO_RENDERER_LATENCY_COMPENSATION = 401;
    public static final int BOOL_ENABLE_AVIO_FEOF = 137;
    public static final int BOOL_ENABLE_AV_SYNC = 400;
    public static final int BOOL_ENABLE_COLOR_MANAGEMENT = 407;
    public static final int BOOL_ENABLE_DEFAULT_CODEC_FOR_DOLBY = 299;
    public static final int BOOL_ENABLE_DROPFRAME_BY_REFRESHRATE = 406;
    public static final int BOOL_ENABLE_HDR_CUSTOM_RENDER = 445;
    public static final int BOOL_ENABLE_HEVC_OPTIMIZATION = 115;
    public static final int BOOL_ENABLE_IGNORE_VIDEO_STREAM_IN_COMMON_AUDIO_FORMATS = 133;
    public static final int BOOL_ENABLE_MEDIA_CODEC_REUSE = 213;
    public static final int BOOL_ENABLE_MEDIA_CODEC_SET_OPERATE_RATE = 212;
    public static final int BOOL_ENABLE_MULTI_RECEIVE_FRAMES = 209;
    public static final int BOOL_ENABLE_NATIVE_MEDIA_CODEC = 204;
    public static final int BOOL_ENABLE_NEW_DATA_SOURCE_SWITCH_STRATEGY = 134;
    public static final int BOOL_ENABLE_NEW_DRM_CLIENT = 132;
    public static final int BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER = 130;

    @java.lang.Deprecated
    public static final int BOOL_ENABLE_REFACTOR_RENDER = 444;
    public static final int BOOL_ENABLE_SET_OUTPUT_SURFACE_API = 205;
    public static final int BOOL_ENABLE_VIDEO_DROP_NON_REFERENCE = 216;
    public static final int BOOL_ENABLE_VIDEO_FRAME_CALLBACK = 403;
    public static final int BOOL_HLS_HTTP_KEEP_ALIVE = 110;
    public static final int BOOL_HLS_SWITCH_BY_SEGMENT = 111;
    public static final int BOOL_KEEP_ORIGINAL_PTS = 112;
    public static final int BOOL_RELEASE_MEDIA_CODEC_WHEN_SET_SURFACE = 211;
    public static final int BOOL_RESET_DECODER_ON_PARAMETER_CHANGE = 201;
    public static final int BOOL_SEEK_WITH_CANCELING_PENDING_SEEKS = 160;
    public static final int BOOL_START_PLAYING_TIME_ACCURATE_SEEK = 101;
    public static final int BOOL_VIDEO_DISABLE_MEDIA_CODEC_DOLBY_VISION_COMPONENT = 219;
    public static final int BOOL_VIDEO_ENABLE_MEDIACODEC_FOR_VVC = 223;
    public static final int BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP = 220;
    public static final int BOOL_VIDEO_KEEP_MEDIA_CODEC_PTS = 215;
    public static final int FLOAT_REDUCE_LATENCY_SPEED_UP_RATE = 120;
    public static final int FLOAT_VIDEO_DROP_FRAME_DETECT_MIN_RATE = 208;
    public static final int INT_AUDIO_AVSYNC_STRATEGY = 419;
    public static final int INT_AUDIO_DECODE_THREAD_PRIORITY = 218;
    public static final int INT_AUDIO_RENDERER_TYPE = 404;
    public static final int INT_AUDIO_RENDER_THREAD_PRIORITY = 413;
    public static final int INT_BUFFER_STRATEGY = 125;
    public static final int INT_DECODER_MAX_TOLERATED_ERROR_COUNT = 200;
    public static final int INT_DEMUX_THREAD_PRIORITY = 127;
    public static final int INT_DEMXUER_TYPE = 114;
    public static final int INT_ENABLE_RENDERER_SHARPEN = 451;
    public static final int INT_HLS_PROGRAM_DEFAULT_PLAY_INDEX = 122;
    public static final int INT_HLS_PROGRAM_PREFER_LUMASAMPLES = 123;
    public static final int INT_OUT_AUDIO_FRAME_DURATION_MS = 305;
    public static final int INT_OUT_AUDIO_FRAME_SIZE_BYTE = 303;
    public static final int INT_OUT_AUDIO_SAMPLE_FORMAT = 300;
    public static final int INT_OUT_AUDIO_SAMPLE_RATE_HZ = 302;
    public static final int INT_OUT_VIDEO_HEIGHT = 312;
    public static final int INT_OUT_VIDEO_PIXEL_FORMAT = 310;
    public static final int INT_OUT_VIDEO_ROTATION = 313;
    public static final int INT_OUT_VIDEO_WIDTH = 311;
    public static final int INT_PLAYER_SCHEDULING_THREAD_PRIORITY = 80;
    public static final int INT_REDUCE_LIVE_LATENCY_ACTION = 119;
    public static final int INT_SPECIFY_INPUT_FORMAT_MP4 = 457;
    public static final int INT_STREAM_DEMUXER_FORMAT = 116;
    public static final int INT_STREAM_TYPE = 304;
    public static final int INT_SUBTITLE_OUTPUT_TYPE = 450;
    public static final int INT_TCP_RETRY_COUNT = 109;
    public static final int INT_VIDEO_DECODE_THREAD_PRIORITY = 217;
    public static final int INT_VIDEO_RENDERER_TYPE = 405;
    public static final int INT_VIDEO_SOFT_DECODER_THREADS_FOR_VVC = 224;
    public static final int LONG_AUDIO_BLUETOOTH_MAX_LIMIT_LATENCY_MS = 418;
    public static final int LONG_AUDIO_NON_BLUETOOTH_MAX_LIMIT_LATENCY_MS = 409;
    public static final int LONG_BUFFERING_TIMEOUT_MS = 107;
    public static final int LONG_BUFFER_PACKET_MAX_TOTAL_DURATION_MS = 117;
    public static final int LONG_BUFFER_PACKET_MIN_TOTAL_DURATION_MS = 102;
    public static final int LONG_FFMPEG_TCP_RECV_BUFFER_SIZE = 136;
    public static final int LONG_HLS_PROGRAM_PREFER_BANDWIDTH = 124;
    public static final int LONG_MAX_ANALYZE_DURATION_MS = 121;
    public static final int LONG_MAX_BUFFERING_TIME_MS = 106;
    public static final int LONG_MIN_BUFFERING_PACKET_DURATION_MS = 104;
    public static final int LONG_MIN_BUFFERING_TIME_MS = 105;
    public static final int LONG_MIN_LEFT_PACKET_QUEUE_TOTAL_DURATION_MS_FOR_SWITCH_DATA_SOURCE = 135;
    public static final int LONG_OUT_AUDIO_CHANNEL_LAYOUT = 301;
    public static final int LONG_PRELOAD_PACKET_TOTAL_DURATION_MS = 103;
    public static final int LONG_PREPARE_TIMEOUT_MS = 118;
    public static final int LONG_PROBE_SIZE = 456;
    public static final int LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS = 129;
    public static final int LONG_START_PLAYING_TIME_MS = 100;
    public static final int LONG_TCP_TIMEOUT_MS = 108;
    public static final int LONG_VIDEO_DROP_FRAME_TIME_UNIT_MS = 207;
    public static final int OBJECT_AUDIO_ATTRIBUTES = 414;
    public static final int OBJECT_JITTER_BUFFER_CONFIG = 126;
    public static final int QUEUE_INT_AUDIO_DECODER_TYPE = 202;
    public static final int QUEUE_INT_AUDIO_RENDERER_TYPE = 411;
    public static final int QUEUE_INT_SPECIAL_SEI_TYPES_CALLBACK = 128;
    public static final int QUEUE_INT_VIDEO_DECODER_TYPE = 203;
    public static final int QUEUE_INT_VIDEO_RENDERER_TYPE = 412;
    public static final int QUEUE_STRING_HLS_DECRYPTION_PEM = 455;
    public static final int QUEUE_STRING_HLS_TAG_CALLBACK = 113;
    public static final int STRING_SHARPEN_SHADER_PATH = 452;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> mIntMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.lang.String> mStringMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.lang.Long> mLongMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.lang.Float> mFloatMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.lang.Boolean> mBoolMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.Integer>> mQueueIntMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.String>> mQueueStringMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.Integer, java.lang.Object> mObjectMap = new java.util.HashMap<>();

    public void addQueueInt(int i17, int i18) {
        java.util.Vector<java.lang.Integer> vector = this.mQueueIntMap.get(java.lang.Integer.valueOf(i17));
        if (vector == null) {
            vector = new java.util.Vector<>();
            this.mQueueIntMap.put(java.lang.Integer.valueOf(i17), vector);
        }
        vector.add(java.lang.Integer.valueOf(i18));
    }

    public void addQueueString(int i17, java.lang.String str) {
        java.util.Vector<java.lang.String> vector = this.mQueueStringMap.get(java.lang.Integer.valueOf(i17));
        if (vector == null) {
            vector = new java.util.Vector<>();
            this.mQueueStringMap.put(java.lang.Integer.valueOf(i17), vector);
        }
        vector.add(str);
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Boolean> getBoolMap() {
        return this.mBoolMap;
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Float> getFloatMap() {
        return this.mFloatMap;
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Integer> getIntMap() {
        return this.mIntMap;
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Long> getLongMap() {
        return this.mLongMap;
    }

    public java.util.HashMap<java.lang.Integer, java.lang.Object> getObjectMap() {
        return this.mObjectMap;
    }

    public java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.Integer>> getQueueIntMap() {
        return this.mQueueIntMap;
    }

    public java.util.HashMap<java.lang.Integer, java.util.Vector<java.lang.String>> getQueueStringMap() {
        return this.mQueueStringMap;
    }

    public java.util.HashMap<java.lang.Integer, java.lang.String> getStringMap() {
        return this.mStringMap;
    }

    public void setBool(int i17, boolean z17) {
        this.mBoolMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public void setFloat(int i17, float f17) {
        this.mFloatMap.put(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17));
    }

    public void setInt(int i17, int i18) {
        this.mIntMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void setLong(int i17, long j17) {
        this.mLongMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public void setObject(int i17, java.lang.Object obj) {
        this.mObjectMap.put(java.lang.Integer.valueOf(i17), obj);
    }

    public void setString(int i17, java.lang.String str) {
        this.mStringMap.put(java.lang.Integer.valueOf(i17), str);
    }
}

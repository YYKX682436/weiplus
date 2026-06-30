package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlaybackInfo {
    private static java.lang.String TAG = "TPPlaybackInfo";
    private long audioBitRate;
    private java.lang.String audioCodec;
    private int audioProfile;
    private int channels;
    private java.lang.String containerFormat;
    private int currentPlayClipNo;
    private long currentPositionMs;
    private java.lang.String definition;
    private long demuxerOffset = -1;
    private long durationMs;
    private long height;
    private long playableDurationMs;
    private long sampleRate;
    private long videoBitRate;
    private java.lang.String videoCodec;
    private int videoCodedId;
    private int videoColorSpace;
    private int videoLevel;
    private int videoProfile;
    private long width;

    public static com.tencent.thumbplayer.adapter.TPPlaybackInfo parseInfo(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.tencent.thumbplayer.adapter.TPPlaybackInfo();
        }
        java.lang.String[] split = str.split("\n");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < split.length; i17++) {
            if (!split[i17].startsWith("#") && split[i17].contains("=")) {
                java.lang.String[] split2 = split[i17].split("=");
                if (split2 == null || split2.length < 2) {
                    java.lang.String str2 = TAG;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseInfo, ");
                    sb6.append((split2 == null || split2.length < 1) ? "param null, " : split2[0]);
                    sb6.append("is empty");
                    com.tencent.thumbplayer.utils.TPLogUtil.i(str2, sb6.toString());
                } else {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo = new com.tencent.thumbplayer.adapter.TPPlaybackInfo();
        if (hashMap.containsKey("ContainerFormat")) {
            tPPlaybackInfo.setContainerFormat((java.lang.String) hashMap.get("ContainerFormat"));
        }
        if (hashMap.containsKey("VideoCodec")) {
            tPPlaybackInfo.setVideoCodec((java.lang.String) hashMap.get("VideoCodec"));
        }
        if (hashMap.containsKey("AudioCodec")) {
            tPPlaybackInfo.setAudioCodec((java.lang.String) hashMap.get("AudioCodec"));
        }
        if (hashMap.containsKey("Width")) {
            tPPlaybackInfo.setWidth(java.lang.Long.valueOf((java.lang.String) hashMap.get("Width")).longValue());
        }
        if (hashMap.containsKey("Height")) {
            tPPlaybackInfo.setHeight(java.lang.Long.valueOf((java.lang.String) hashMap.get("Height")).longValue());
        }
        if (hashMap.containsKey("VideoBitRate")) {
            tPPlaybackInfo.setVideoBitRate(java.lang.Long.valueOf((java.lang.String) hashMap.get("VideoBitRate")).longValue());
        }
        if (hashMap.containsKey("AudioBitRate")) {
            tPPlaybackInfo.setAudioBitRate(java.lang.Long.valueOf((java.lang.String) hashMap.get("AudioBitRate")).longValue());
        }
        if (hashMap.containsKey("SampleRate")) {
            tPPlaybackInfo.setSampleRate(java.lang.Long.valueOf((java.lang.String) hashMap.get("SampleRate")).longValue());
        }
        if (hashMap.containsKey("Channels")) {
            tPPlaybackInfo.setChannels(java.lang.Integer.valueOf((java.lang.String) hashMap.get("Channels")).intValue());
        }
        if (hashMap.containsKey("Definition")) {
            tPPlaybackInfo.setDefinition((java.lang.String) hashMap.get("Definition"));
        }
        return tPPlaybackInfo;
    }

    public void clear() {
        this.containerFormat = null;
        this.videoCodec = null;
        this.videoProfile = 0;
        this.videoCodedId = 0;
        this.width = 0L;
        this.height = 0L;
        this.videoBitRate = 0L;
        this.audioCodec = null;
        this.audioProfile = 0;
        this.audioBitRate = 0L;
        this.channels = 0;
        this.sampleRate = 0L;
        this.videoColorSpace = 2;
        this.videoLevel = 0;
        this.currentPositionMs = 0L;
        this.durationMs = 0L;
        this.playableDurationMs = 0L;
        this.currentPlayClipNo = 0;
        this.demuxerOffset = -1L;
    }

    public long getAudioBitRate() {
        return this.audioBitRate;
    }

    public java.lang.String getAudioCodec() {
        return this.audioCodec;
    }

    public int getAudioProfile() {
        return this.audioProfile;
    }

    public int getChannels() {
        return this.channels;
    }

    public java.lang.String getContainerFormat() {
        return this.containerFormat;
    }

    public int getCurrentPlayClipNo() {
        return this.currentPlayClipNo;
    }

    public long getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    public java.lang.String getDefinition() {
        return this.definition;
    }

    public long getDemuxerOffset() {
        return this.demuxerOffset;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public long getHeight() {
        return this.height;
    }

    public long getPlayableDurationMs() {
        return this.playableDurationMs;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public long getVideoBitRate() {
        return this.videoBitRate;
    }

    public java.lang.String getVideoCodec() {
        return this.videoCodec;
    }

    public int getVideoCodedId() {
        return this.videoCodedId;
    }

    public int getVideoColorSpace() {
        return this.videoColorSpace;
    }

    public int getVideoLevel() {
        return this.videoLevel;
    }

    public int getVideoProfile() {
        return this.videoProfile;
    }

    public long getWidth() {
        return this.width;
    }

    public void setAudioBitRate(long j17) {
        this.audioBitRate = j17;
    }

    public void setAudioCodec(java.lang.String str) {
        this.audioCodec = str;
    }

    public void setAudioProfile(int i17) {
        this.audioProfile = i17;
    }

    public void setChannels(int i17) {
        this.channels = i17;
    }

    public void setContainerFormat(java.lang.String str) {
        this.containerFormat = str;
    }

    public void setCurrentPlayClipNo(int i17) {
        this.currentPlayClipNo = i17;
    }

    public void setCurrentPositionMs(long j17) {
        this.currentPositionMs = j17;
    }

    public void setDefinition(java.lang.String str) {
        this.definition = str;
    }

    public void setDemuxerOffset(long j17) {
        this.demuxerOffset = j17;
    }

    public void setDurationMs(long j17) {
        this.durationMs = j17;
    }

    public void setHeight(long j17) {
        this.height = j17;
    }

    public void setPlayableDurationMs(long j17) {
        this.playableDurationMs = j17;
    }

    public void setSampleRate(long j17) {
        this.sampleRate = j17;
    }

    public void setVideoBitRate(long j17) {
        this.videoBitRate = j17;
    }

    public void setVideoCodec(java.lang.String str) {
        this.videoCodec = str;
    }

    public void setVideoCodedId(int i17) {
        this.videoCodedId = i17;
    }

    public void setVideoColorSpace(int i17) {
        this.videoColorSpace = i17;
    }

    public void setVideoLevel(int i17) {
        this.videoLevel = i17;
    }

    public void setVideoProfile(int i17) {
        this.videoProfile = i17;
    }

    public void setWidth(long j17) {
        this.width = j17;
    }
}

package com.tencent.tav.core;

/* loaded from: classes10.dex */
public class ExportConfig implements java.lang.Cloneable {
    private static final java.lang.String TAG = "ExportConfig";
    private static final int UNKNOWN_PARAM_VALUE = 0;
    private int audioAacProfile;
    private int audioBitRate;
    private int audioChannelCount;
    private boolean audioEncodeNeedCodecSpecificData;
    private android.media.MediaFormat audioFormat;
    private int audioSampleRateHz;
    private int colorRange;
    private int colorStandard;
    private int colorTransfer;
    private boolean correctSizeByCodecCapabilities;
    private java.nio.ByteBuffer hdrStaticInfo;
    private boolean highProfile;
    private boolean limitProfileLevel;
    public com.tencent.tav.decoder.logger.WXLoggerConfig loggerConfig;
    private int minMuxDuration;
    private int minMuxFrameCount;
    private java.lang.String outputFilePath;
    private int outputHeight;
    private int outputWidth;
    private int renderHeight;
    private int renderWidth;
    private int suggestParallelCount;
    private int videoBitRate;
    private android.media.MediaFormat videoFormat;
    private int videoFrameRate;
    private int videoIFrameInterval;
    private java.lang.String videoMimeType;

    public ExportConfig(int i17, int i18) {
        this.videoBitRate = 8000000;
        this.videoFrameRate = 30;
        this.videoIFrameInterval = 1;
        this.videoMimeType = "video/avc";
        this.highProfile = false;
        this.limitProfileLevel = false;
        this.minMuxDuration = -1;
        this.minMuxFrameCount = -1;
        this.audioBitRate = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        this.audioAacProfile = 2;
        this.audioChannelCount = 1;
        this.audioSampleRateHz = 44100;
        this.colorRange = 0;
        this.colorStandard = 0;
        this.colorTransfer = 0;
        this.hdrStaticInfo = null;
        this.audioEncodeNeedCodecSpecificData = true;
        this.correctSizeByCodecCapabilities = true;
        this.suggestParallelCount = -1;
        this.loggerConfig = com.tencent.tav.decoder.logger.WXLoggerFactory.INSTANCE.defaultConfig();
        this.outputWidth = i17;
        this.outputHeight = i18;
        this.renderWidth = i17;
        this.renderHeight = i18;
    }

    private int findFormatValue(java.lang.String str, int i17, android.media.MediaFormat mediaFormat) {
        return (mediaFormat == null || !mediaFormat.containsKey(str)) ? i17 : mediaFormat.getInteger(str);
    }

    private int findVideoFormatValue(java.lang.String str, int i17) {
        return findFormatValue(str, i17, this.videoFormat);
    }

    private void initAudioChannelCount() {
        setToAudioFormat("channel-count", this.audioChannelCount);
    }

    private void initAudioSampleRate() {
        setToAudioFormat("sample-rate", this.audioSampleRateHz);
    }

    private void initColorSpace() {
        int i17 = this.colorRange;
        if (i17 != 0) {
            setToVideoFormat("color-range", i17);
        }
        int i18 = this.colorTransfer;
        if (i18 != 0) {
            setToVideoFormat("color-transfer", i18);
        }
        int i19 = this.colorStandard;
        if (i19 != 0) {
            setToVideoFormat("color-standard", i19);
        }
        java.nio.ByteBuffer byteBuffer = this.hdrStaticInfo;
        if (byteBuffer != null) {
            setToVideoFormat("hdr-static-info", byteBuffer);
        }
    }

    private void initFrameRate() {
        setToVideoFormat("frame-rate", this.videoFrameRate);
    }

    private void initHdrInfo() {
        java.nio.ByteBuffer byteBuffer = this.hdrStaticInfo;
        if (byteBuffer != null) {
            setToVideoFormat("hdr-static-info", byteBuffer);
        }
    }

    private void initHighProfile() {
        if (this.highProfile && this.videoMimeType.equalsIgnoreCase("video/avc")) {
            com.tencent.tav.decoder.CodecHelper.selectProfileAndLevel(this.videoFormat, this.limitProfileLevel);
        }
    }

    private void initIFrameInterval() {
        setToVideoFormat("i-frame-interval", this.videoIFrameInterval);
    }

    private void initOutputSize() {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "initOutputSize, correctSizeByCodecCapabilities:" + this.correctSizeByCodecCapabilities);
        if (!this.correctSizeByCodecCapabilities) {
            setToVideoFormat("width", (int) getOutputSize().width);
            setToVideoFormat("height", (int) getOutputSize().height);
            com.tencent.tav.decoder.logger.Logger.i(TAG, "initOutputSize, width:" + getOutputSize().width + " height:" + getOutputSize().height);
            return;
        }
        com.tencent.tav.coremedia.CGSize correctSupportSize = com.tencent.tav.decoder.CodecHelper.correctSupportSize(getOutputSize(), "video/avc");
        setToVideoFormat("width", (int) correctSupportSize.width);
        setToVideoFormat("height", (int) correctSupportSize.height);
        com.tencent.tav.decoder.logger.Logger.i(TAG, "initOutputSize, width:" + correctSupportSize.width + " height:" + correctSupportSize.height);
    }

    private void initVideoBitrate() {
        setToVideoFormat(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.videoBitRate);
    }

    private void setToAudioFormat(java.lang.String str, int i17) {
        if (this.audioFormat == null) {
            getAudioFormat();
        }
        setToFormat(str, i17, this.audioFormat);
    }

    private void setToFormat(java.lang.String str, int i17, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return;
        }
        mediaFormat.setInteger(str, i17);
    }

    private void setToVideoFormat(java.lang.String str, int i17) {
        if (this.videoFormat == null) {
            getVideoFormat();
        }
        setToFormat(str, i17, this.videoFormat);
    }

    public boolean available() {
        return getOutputWidth() > 0 && getOutputHeight() > 0;
    }

    public int getAudioChannelCount() {
        return findFormatValue("channel-count", this.audioChannelCount, this.audioFormat);
    }

    public android.media.MediaFormat getAudioFormat() {
        if (this.audioFormat == null) {
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.audioFormat = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.audioFormat.setInteger("sample-rate", this.audioSampleRateHz);
            initAudioChannelCount();
            this.audioFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.audioBitRate);
            this.audioFormat.setInteger("aac-profile", this.audioAacProfile);
        }
        com.tencent.tav.decoder.logger.Logger.i(TAG, "getAudioFormat:" + this.audioFormat);
        return this.audioFormat;
    }

    public int getAudioSampleRateHz() {
        return findFormatValue("sample-rate", this.audioSampleRateHz, this.audioFormat);
    }

    public int getMinMuxDuration() {
        return this.minMuxDuration;
    }

    public int getMinMuxFrameCount() {
        return this.minMuxFrameCount;
    }

    public java.lang.String getOutputFilePath() {
        return this.outputFilePath;
    }

    public int getOutputHeight() {
        return findVideoFormatValue("height", this.outputHeight);
    }

    public com.tencent.tav.coremedia.CGSize getOutputSize() {
        return new com.tencent.tav.coremedia.CGSize(getOutputWidth(), getOutputHeight());
    }

    public int getOutputWidth() {
        return findVideoFormatValue("width", this.outputWidth);
    }

    public int getRenderHeight() {
        return this.renderHeight;
    }

    public int getRenderWidth() {
        return this.renderWidth;
    }

    public int getSuggestParallelCount() {
        return this.suggestParallelCount;
    }

    public int getVideoBitRate() {
        return findVideoFormatValue(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.videoBitRate);
    }

    public android.media.MediaFormat getVideoFormat() {
        if (this.videoFormat == null) {
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.videoFormat = mediaFormat;
            mediaFormat.setString("mime", this.videoMimeType);
            this.videoFormat.setInteger("color-format", com.tencent.tav.decoder.EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT);
            initOutputSize();
            initVideoBitrate();
            initFrameRate();
            initIFrameInterval();
            initHighProfile();
            initColorSpace();
            initHdrInfo();
        }
        return this.videoFormat;
    }

    public int getVideoFrameRate() {
        return findVideoFormatValue("frame-rate", this.videoFrameRate);
    }

    public boolean isAudioEncodeNeedCodecSpecificData() {
        return this.audioEncodeNeedCodecSpecificData;
    }

    public void setAudioBitRate(int i17) {
        this.audioBitRate = i17;
    }

    public void setAudioChannelCount(int i17) {
        this.audioChannelCount = i17;
        initAudioChannelCount();
    }

    public void setAudioEncodeNeedCodecSpecificData(boolean z17) {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "setAudioEncodeNeedCodecSpecificData:" + z17);
        this.audioEncodeNeedCodecSpecificData = z17;
    }

    public void setAudioSampleRateHz(int i17) {
        this.audioSampleRateHz = i17;
        initAudioSampleRate();
    }

    public void setColorSpace(int i17, int i18, int i19) {
        this.colorRange = i17;
        this.colorStandard = i18;
        this.colorTransfer = i19;
        initColorSpace();
    }

    public void setEncodeHevc(boolean z17) {
        if (z17) {
            this.videoMimeType = "video/hevc";
        } else {
            this.videoMimeType = "video/avc";
        }
    }

    public void setHdrStaticInfo(java.nio.ByteBuffer byteBuffer) {
        this.hdrStaticInfo = byteBuffer;
        initHdrInfo();
    }

    public void setHighProfile(boolean z17) {
        this.highProfile = z17;
        initHighProfile();
    }

    public void setLimitProfileLevel(boolean z17) {
        this.limitProfileLevel = z17;
    }

    public void setMinMuxDuration(int i17) {
        this.minMuxDuration = i17;
    }

    public void setMinMuxFrameCount(int i17) {
        this.minMuxFrameCount = i17;
    }

    public void setNeedCorrectSizeByCodecCapabilities(boolean z17) {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "setNeedCorrectSizeByCodecCapabilities:" + z17);
        this.correctSizeByCodecCapabilities = z17;
    }

    public void setOutputFilePath(java.lang.String str) {
        this.outputFilePath = str;
    }

    public void setOutputSize(int i17, int i18) {
        this.outputWidth = i17;
        this.outputHeight = i18;
        initOutputSize();
    }

    public void setSuggestParallelCount(int i17) {
        this.suggestParallelCount = i17;
    }

    public void setVideoBitRate(int i17) {
        this.videoBitRate = i17;
        initVideoBitrate();
    }

    public void setVideoFrameRate(int i17) {
        this.videoFrameRate = i17;
        initFrameRate();
    }

    public void setVideoIFrameInterval(int i17) {
        this.videoIFrameInterval = i17;
        initIFrameInterval();
    }

    private void setToFormat(java.lang.String str, java.nio.ByteBuffer byteBuffer, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return;
        }
        mediaFormat.setByteBuffer(str, byteBuffer);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.core.ExportConfig m409clone() {
        com.tencent.tav.core.ExportConfig exportConfig = new com.tencent.tav.core.ExportConfig(this.outputWidth, this.outputHeight);
        exportConfig.videoBitRate = this.videoBitRate;
        exportConfig.videoFrameRate = this.videoFrameRate;
        exportConfig.videoIFrameInterval = this.videoIFrameInterval;
        exportConfig.outputWidth = this.outputWidth;
        exportConfig.outputHeight = this.outputHeight;
        exportConfig.renderWidth = this.renderWidth;
        exportConfig.renderHeight = this.renderHeight;
        exportConfig.highProfile = this.highProfile;
        exportConfig.videoMimeType = this.videoMimeType;
        exportConfig.audioBitRate = this.audioBitRate;
        exportConfig.audioAacProfile = this.audioAacProfile;
        exportConfig.audioChannelCount = this.audioChannelCount;
        exportConfig.audioSampleRateHz = this.audioSampleRateHz;
        exportConfig.audioEncodeNeedCodecSpecificData = this.audioEncodeNeedCodecSpecificData;
        exportConfig.colorRange = this.colorRange;
        exportConfig.colorStandard = this.colorStandard;
        exportConfig.colorTransfer = this.colorTransfer;
        exportConfig.hdrStaticInfo = this.hdrStaticInfo;
        exportConfig.correctSizeByCodecCapabilities = this.correctSizeByCodecCapabilities;
        exportConfig.suggestParallelCount = this.suggestParallelCount;
        exportConfig.loggerConfig = this.loggerConfig.copyConfig();
        return exportConfig;
    }

    private void setToVideoFormat(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        if (this.videoFormat == null) {
            getVideoFormat();
        }
        setToFormat(str, byteBuffer, this.videoFormat);
    }

    public ExportConfig(int i17, int i18, int i19, int i27) {
        this.videoBitRate = 8000000;
        this.videoFrameRate = 30;
        this.videoIFrameInterval = 1;
        this.videoMimeType = "video/avc";
        this.highProfile = false;
        this.limitProfileLevel = false;
        this.minMuxDuration = -1;
        this.minMuxFrameCount = -1;
        this.audioBitRate = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        this.audioAacProfile = 2;
        this.audioChannelCount = 1;
        this.audioSampleRateHz = 44100;
        this.colorRange = 0;
        this.colorStandard = 0;
        this.colorTransfer = 0;
        this.hdrStaticInfo = null;
        this.audioEncodeNeedCodecSpecificData = true;
        this.correctSizeByCodecCapabilities = true;
        this.suggestParallelCount = -1;
        this.loggerConfig = com.tencent.tav.decoder.logger.WXLoggerFactory.INSTANCE.defaultConfig();
        this.outputWidth = i17;
        this.outputHeight = i18;
        this.renderWidth = i19;
        this.renderHeight = i27;
    }

    @java.lang.Deprecated
    public ExportConfig(com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig) {
        this.videoBitRate = 8000000;
        this.videoFrameRate = 30;
        this.videoIFrameInterval = 1;
        this.videoMimeType = "video/avc";
        this.highProfile = false;
        this.limitProfileLevel = false;
        this.minMuxDuration = -1;
        this.minMuxFrameCount = -1;
        this.audioBitRate = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        this.audioAacProfile = 2;
        this.audioChannelCount = 1;
        this.audioSampleRateHz = 44100;
        this.colorRange = 0;
        this.colorStandard = 0;
        this.colorTransfer = 0;
        this.hdrStaticInfo = null;
        this.audioEncodeNeedCodecSpecificData = true;
        this.correctSizeByCodecCapabilities = true;
        this.suggestParallelCount = -1;
        this.loggerConfig = com.tencent.tav.decoder.logger.WXLoggerFactory.INSTANCE.defaultConfig();
        this.outputWidth = outputConfig.VIDEO_TARGET_WIDTH;
        this.outputHeight = outputConfig.VIDEO_TARGET_HEIGHT;
        this.videoIFrameInterval = outputConfig.VIDEO_IFRAME_INTERVAL;
        this.videoBitRate = outputConfig.VIDEO_BIT_RATE;
        this.videoFrameRate = outputConfig.VIDEO_FRAME_RATE;
        this.highProfile = outputConfig.HIGH_PROFILE;
        this.audioChannelCount = outputConfig.AUDIO_CHANNEL_COUNT;
        this.audioBitRate = outputConfig.AUDIO_BIT_RATE;
        this.audioAacProfile = outputConfig.AUDIO_AAC_PROFILE;
    }
}

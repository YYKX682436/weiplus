package com.tencent.thumbplayer.adapter.player.thumbplayer;

/* loaded from: classes16.dex */
public class TPThumbPlayerUtils {
    public static final int OPTIONAL_ID_TYPE_BOOL = 3;
    public static final int OPTIONAL_ID_TYPE_FLOAT = 7;
    public static final int OPTIONAL_ID_TYPE_ILLEGAL = -1;
    public static final int OPTIONAL_ID_TYPE_INT = 4;
    public static final int OPTIONAL_ID_TYPE_LONG = 1;
    public static final int OPTIONAL_ID_TYPE_OBJECT = 8;
    public static final int OPTIONAL_ID_TYPE_QUEUE_INT = 5;
    public static final int OPTIONAL_ID_TYPE_QUEUE_STRING = 6;
    public static final int OPTIONAL_ID_TYPE_STRING = 2;
    private static java.lang.String TAG = "TPThumbPlayerUtils";

    public static com.tencent.thumbplayer.api.TPAudioFrameBuffer convert2TPAudioFrameBuffer(com.tencent.thumbplayer.core.common.TPAudioFrame tPAudioFrame) {
        if (tPAudioFrame == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer = new com.tencent.thumbplayer.api.TPAudioFrameBuffer();
        tPAudioFrameBuffer.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioSampleFormat.class, tPAudioFrame.format);
        tPAudioFrameBuffer.data = tPAudioFrame.data;
        tPAudioFrameBuffer.size = tPAudioFrame.linesize;
        tPAudioFrameBuffer.sampleRate = tPAudioFrame.sampleRate;
        tPAudioFrameBuffer.channelLayout = tPAudioFrame.channelLayout;
        tPAudioFrameBuffer.ptsMs = tPAudioFrame.ptsUs / 1000;
        tPAudioFrameBuffer.nbSamples = tPAudioFrame.nbSamples;
        tPAudioFrameBuffer.channels = tPAudioFrame.channels;
        return tPAudioFrameBuffer;
    }

    public static com.tencent.thumbplayer.api.TPPlayerMsg.TPBufferDurationInfo convert2TPBufferDurationInfo(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.BufferDurationInfo bufferDurationInfo) {
        if (bufferDurationInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPBufferDurationInfo tPBufferDurationInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPBufferDurationInfo();
        tPBufferDurationInfo.configIndex = bufferDurationInfo.configIndex;
        tPBufferDurationInfo.autoChange = bufferDurationInfo.autoChange;
        tPBufferDurationInfo.maxBufferDurationUs = bufferDurationInfo.maxBufferDurationUs;
        tPBufferDurationInfo.minLimitDurationUs = bufferDurationInfo.minLimitDurationUs;
        tPBufferDurationInfo.maxLimitDurationUs = bufferDurationInfo.maxLimitDurationUs;
        tPBufferDurationInfo.beforeConfigAudioMaxBufferDurationUs = bufferDurationInfo.beforeConfigAudioMaxBufferDurationUs;
        tPBufferDurationInfo.beforeConfigAudioMinLimitDurationUs = bufferDurationInfo.beforeConfigAudioMinLimitDurationUs;
        tPBufferDurationInfo.beforeConfigAudioMaxLimitDurationUs = bufferDurationInfo.beforeConfigAudioMaxLimitDurationUs;
        tPBufferDurationInfo.beforeConfigVideoMaxBufferDurationUs = bufferDurationInfo.beforeConfigVideoMaxBufferDurationUs;
        tPBufferDurationInfo.beforeConfigVideoMinLimitDurationUs = bufferDurationInfo.beforeConfigVideoMinLimitDurationUs;
        tPBufferDurationInfo.beforeConfigVideoMaxLimitDurationUs = bufferDurationInfo.beforeConfigVideoMaxLimitDurationUs;
        tPBufferDurationInfo.afterConfigAudioMaxBufferDurationUs = bufferDurationInfo.afterConfigAudioMaxBufferDurationUs;
        tPBufferDurationInfo.afterConfigAudioMinLimitDurationUs = bufferDurationInfo.afterConfigAudioMinLimitDurationUs;
        tPBufferDurationInfo.afterConfigAudioMaxLimitDurationUs = bufferDurationInfo.afterConfigAudioMaxLimitDurationUs;
        tPBufferDurationInfo.afterConfigVideoMaxBufferDurationUs = bufferDurationInfo.afterConfigVideoMaxBufferDurationUs;
        tPBufferDurationInfo.afterConfigVideoMinLimitDurationUs = bufferDurationInfo.afterConfigVideoMinLimitDurationUs;
        tPBufferDurationInfo.afterConfigVideoMaxLimitDurationUs = bufferDurationInfo.afterConfigVideoMaxLimitDurationUs;
        return tPBufferDurationInfo;
    }

    public static com.tencent.thumbplayer.api.TPDashFormat convert2TPDashFormat(com.tencent.thumbplayer.core.common.TPMediaTrackDashFormat tPMediaTrackDashFormat) {
        if (tPMediaTrackDashFormat == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPDashFormat tPDashFormat = new com.tencent.thumbplayer.api.TPDashFormat();
        tPDashFormat.representationId = tPMediaTrackDashFormat.representationId;
        tPDashFormat.codecs = tPMediaTrackDashFormat.codecs;
        tPDashFormat.mimeType = tPMediaTrackDashFormat.mimeType;
        tPDashFormat.language = tPMediaTrackDashFormat.language;
        tPDashFormat.width = tPMediaTrackDashFormat.width;
        tPDashFormat.height = tPMediaTrackDashFormat.height;
        tPDashFormat.bandwidth = tPMediaTrackDashFormat.bandwidth;
        tPDashFormat.audioChannels = tPMediaTrackDashFormat.audioChannels;
        tPDashFormat.audioSamplingRate = tPMediaTrackDashFormat.audioSamplingRate;
        tPDashFormat.frameRate = tPMediaTrackDashFormat.frameRate;
        return tPDashFormat;
    }

    public static com.tencent.thumbplayer.api.TPDrmInfo convert2TPDrmInfo(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
        com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo = new com.tencent.thumbplayer.api.TPDrmInfo();
        tPDrmInfo.drmSecureLevel = tPPlayerDrmParams.mSecureLevel;
        tPDrmInfo.drmSupportSecureDecoder = tPPlayerDrmParams.mSupportSecureDecoder;
        tPDrmInfo.drmSupportSecureDecrypt = tPPlayerDrmParams.mSupportSecureDecrypt;
        tPDrmInfo.drmComponentName = tPPlayerDrmParams.mComponentName;
        tPDrmInfo.drmType = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapReportDrmType.class, tPPlayerDrmParams.mDrmType);
        tPDrmInfo.drmPrepareStartTimeMs = tPPlayerDrmParams.mPrepareSTimeMs;
        tPDrmInfo.drmPrepareEndTimeMs = tPPlayerDrmParams.mPrepareETimeMs;
        tPDrmInfo.drmOpenSessionStartTimeMs = tPPlayerDrmParams.mOpenSessionSTimeMs;
        tPDrmInfo.drmOpenSessionEndTimeMs = tPPlayerDrmParams.mOpenSessionETimeMs;
        tPDrmInfo.drmGetProvisionReqStartTimeMs = tPPlayerDrmParams.mGetProvisionReqSTimeMs;
        tPDrmInfo.drmGetProvisionReqEndTimeMs = tPPlayerDrmParams.mGetProvisionReqETimeMs;
        tPDrmInfo.drmSendProvisionReqTimeMs = tPPlayerDrmParams.mSendProvisionReqTimeMs;
        tPDrmInfo.drmRecvProvisionRespTimeMs = tPPlayerDrmParams.mRecvProvisionRespTimeMs;
        tPDrmInfo.drmProvideProvisionRespStartTimeMs = tPPlayerDrmParams.mProvideProvisionRespSTimeMs;
        tPDrmInfo.drmProvideProvisionRespEndTimeMs = tPPlayerDrmParams.mProvideProvisionRespETimeMs;
        tPDrmInfo.drmGetKeyReqStartTimeMs = tPPlayerDrmParams.mGetKeyReqSTimeMs;
        tPDrmInfo.drmGetKeyReqEndTimeMs = tPPlayerDrmParams.mGetKeyReqETimeMs;
        tPDrmInfo.drmSendKeyReqTimeMs = tPPlayerDrmParams.mSendKeyReqTimeMs;
        tPDrmInfo.drmRecvKeyRespTimeMs = tPPlayerDrmParams.mRecvKeyRespTimeMs;
        tPDrmInfo.drmProvideKeyRespStartTimeMs = tPPlayerDrmParams.mProvideKeyRespSTimeMs;
        tPDrmInfo.drmProvideKeyRespEndTimeMs = tPPlayerDrmParams.mProvideKeyRespETimeMs;
        return tPDrmInfo;
    }

    public static com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo convert2TPMediaCodecInfo(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo tPMediaCodecInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo();
        int i17 = mediaCodecInfo.mediaType;
        if (i17 == 0) {
            tPMediaCodecInfo.mediaType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_VIDEO;
        } else if (i17 != 1) {
            tPMediaCodecInfo.mediaType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_UNKNOWN;
        } else {
            tPMediaCodecInfo.mediaType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_AUDIO;
        }
        int i18 = mediaCodecInfo.infoType;
        if (i18 == 0) {
            tPMediaCodecInfo.infoType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_READY;
        } else if (i18 != 1) {
            tPMediaCodecInfo.infoType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_UNKNOWN;
        } else {
            tPMediaCodecInfo.infoType = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_EXCEPTION;
        }
        tPMediaCodecInfo.msg = mediaCodecInfo.msg;
        return tPMediaCodecInfo;
    }

    public static com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo convert2TPMediaDrmInfo(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaDrmInfo mediaDrmInfo) {
        if (mediaDrmInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo tPMediaDrmInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo();
        tPMediaDrmInfo.supportSecureDecoder = mediaDrmInfo.supportSecureDecoder;
        tPMediaDrmInfo.supportSecureDecrypt = mediaDrmInfo.supportSecureDecrypt;
        tPMediaDrmInfo.componentName = mediaDrmInfo.componentName;
        tPMediaDrmInfo.drmType = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDrmType.class, mediaDrmInfo.drmType);
        return tPMediaDrmInfo;
    }

    public static com.tencent.thumbplayer.core.demuxer.TPNativeJitterBufferConfig convert2TPNativeBufferConfig(com.tencent.thumbplayer.api.TPJitterBufferConfig tPJitterBufferConfig) {
        if (tPJitterBufferConfig == null) {
            return null;
        }
        return new com.tencent.thumbplayer.core.demuxer.TPNativeJitterBufferConfig.Builder().setMinDecreaseDurationMs(tPJitterBufferConfig.getMinDecreaseDurationMs()).setMaxIncreaseDurationMs(tPJitterBufferConfig.getMaxIncreaseDurationMs()).setPerIncreaseDurationMs(tPJitterBufferConfig.getPerIncreaseDurationMs()).setPerDecreaseDurationMs(tPJitterBufferConfig.getPerDecreaseDurationMs()).setAdjustIntervalThresholdMs(tPJitterBufferConfig.getAdjustIntervalThresholdMs()).setFrozenThresholdMs(tPJitterBufferConfig.getFrozenThresholdMs()).build();
    }

    private static int convert2TPNativeFontStyleFlags(long j17) {
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.Number, java.lang.Number> entry : com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getEntrySetOfToNativeMap(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSubtitleFontStyle.class)) {
            if ((entry.getKey().intValue() & j17) > 0) {
                i17 |= entry.getValue().intValue();
            }
        }
        return i17;
    }

    public static com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo convert2TPNativeRemoteSdpInfo(com.tencent.thumbplayer.api.TPRemoteSdpInfo tPRemoteSdpInfo) {
        if (tPRemoteSdpInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo tPNativeRemoteSdpInfo = new com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo();
        tPNativeRemoteSdpInfo.isSuccess = tPRemoteSdpInfo.isSuccess;
        tPNativeRemoteSdpInfo.remoteSdp = tPRemoteSdpInfo.remoteSdp;
        return tPNativeRemoteSdpInfo;
    }

    private static long convert2TPNativeSubtitleParamsFlags(long j17) {
        long j18 = 0;
        for (java.util.Map.Entry<java.lang.Number, java.lang.Number> entry : com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getEntrySetOfToNativeMap(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSubtitleRenderParams.class)) {
            if ((entry.getKey().longValue() & j17) > 0) {
                j18 |= entry.getValue().longValue();
            }
        }
        return j18;
    }

    public static com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams convert2TPNativeSubtitleRenderParams(com.tencent.thumbplayer.api.TPSubtitleRenderModel tPSubtitleRenderModel) {
        if (tPSubtitleRenderModel == null) {
            return null;
        }
        com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams = new com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams();
        tPNativeSubtitleRenderParams.canvasWidth = tPSubtitleRenderModel.canvasWidth;
        tPNativeSubtitleRenderParams.canvasHeight = tPSubtitleRenderModel.canvasHeight;
        tPNativeSubtitleRenderParams.paramFlags = convert2TPNativeSubtitleParamsFlags(tPSubtitleRenderModel.paramFlags);
        tPNativeSubtitleRenderParams.paramPriorityFlags = convert2TPNativeSubtitleParamsFlags(tPSubtitleRenderModel.paramPriorityFlags);
        tPNativeSubtitleRenderParams.familyName = tPSubtitleRenderModel.familyName;
        tPNativeSubtitleRenderParams.fontSize = tPSubtitleRenderModel.fontSize;
        tPNativeSubtitleRenderParams.fontColor = tPSubtitleRenderModel.fontColor;
        tPNativeSubtitleRenderParams.fontStyleFlags = convert2TPNativeFontStyleFlags(tPSubtitleRenderModel.fontStyleFlags);
        tPNativeSubtitleRenderParams.outlineWidth = tPSubtitleRenderModel.outlineWidth;
        tPNativeSubtitleRenderParams.outlineColor = tPSubtitleRenderModel.outlineColor;
        tPNativeSubtitleRenderParams.lineSpace = tPSubtitleRenderModel.lineSpace;
        tPNativeSubtitleRenderParams.startMargin = tPSubtitleRenderModel.startMargin;
        tPNativeSubtitleRenderParams.endMargin = tPSubtitleRenderModel.endMargin;
        tPNativeSubtitleRenderParams.verticalMargin = tPSubtitleRenderModel.verticalMargin;
        tPNativeSubtitleRenderParams.fontScale = tPSubtitleRenderModel.fontScale;
        return tPNativeSubtitleRenderParams;
    }

    public static com.tencent.thumbplayer.api.TPPlayerDetailInfo convert2TPPlayerDetailInfo(com.tencent.thumbplayer.core.common.TPDetailInfo tPDetailInfo) {
        if (tPDetailInfo == null) {
            return null;
        }
        return new com.tencent.thumbplayer.api.TPPlayerDetailInfo(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDetailInfoType.class, tPDetailInfo.type), tPDetailInfo.timeSince1970Us / 1000);
    }

    public static com.tencent.thumbplayer.api.TPSurfaceDolbyVisionInfo convert2TPPlayerSurfaceDolbyVisionInfo(com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceDolbyVisionInfo tPNativePlayerSurfaceDolbyVisionInfo) {
        if (tPNativePlayerSurfaceDolbyVisionInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPSurfaceDolbyVisionInfo tPSurfaceDolbyVisionInfo = new com.tencent.thumbplayer.api.TPSurfaceDolbyVisionInfo();
        tPSurfaceDolbyVisionInfo.mProfile = tPNativePlayerSurfaceDolbyVisionInfo.mProfile;
        tPSurfaceDolbyVisionInfo.mLevel = tPNativePlayerSurfaceDolbyVisionInfo.mLevel;
        tPSurfaceDolbyVisionInfo.mBlSignalCompatibilityId = tPNativePlayerSurfaceDolbyVisionInfo.mBlSignalCompatibilityId;
        return tPSurfaceDolbyVisionInfo;
    }

    public static com.tencent.thumbplayer.api.TPSurfaceRenderInfo convert2TPPlayerSurfaceRenderInfo(com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo) {
        if (tPNativePlayerSurfaceRenderInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPSurfaceRenderInfo tPSurfaceRenderInfo = new com.tencent.thumbplayer.api.TPSurfaceRenderInfo();
        tPSurfaceRenderInfo.displayWidth = tPNativePlayerSurfaceRenderInfo.displayWidth;
        tPSurfaceRenderInfo.displayHeight = tPNativePlayerSurfaceRenderInfo.displayHeight;
        tPSurfaceRenderInfo.videoCropInfo = convert2TPVideoCropInfo(tPNativePlayerSurfaceRenderInfo.videoCropInfo);
        return tPSurfaceRenderInfo;
    }

    public static com.tencent.thumbplayer.core.common.TPPostProcessFrame convert2TPPostProcessFrame(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (tPPostProcessFrameBuffer == null) {
            return null;
        }
        com.tencent.thumbplayer.core.common.TPPostProcessFrame tPPostProcessFrame = new com.tencent.thumbplayer.core.common.TPPostProcessFrame();
        int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMediaType.class, tPPostProcessFrameBuffer.mediaType);
        tPPostProcessFrame.mediaType = nativeIntValue;
        if (nativeIntValue == 0) {
            tPPostProcessFrame.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapPixelFormat.class, tPPostProcessFrameBuffer.format);
        } else if (nativeIntValue == 1) {
            tPPostProcessFrame.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioSampleFormat.class, tPPostProcessFrameBuffer.format);
        }
        tPPostProcessFrame.data = tPPostProcessFrameBuffer.data;
        tPPostProcessFrame.linesize = tPPostProcessFrameBuffer.size;
        tPPostProcessFrame.sampleRate = tPPostProcessFrameBuffer.sampleRate;
        tPPostProcessFrame.channelLayout = tPPostProcessFrameBuffer.channelLayout;
        tPPostProcessFrame.ptsUs = tPPostProcessFrameBuffer.ptsMs * 1000;
        tPPostProcessFrame.nbSamples = tPPostProcessFrameBuffer.nbSamples;
        tPPostProcessFrame.channels = tPPostProcessFrameBuffer.channels;
        tPPostProcessFrame.width = tPPostProcessFrameBuffer.width;
        tPPostProcessFrame.height = tPPostProcessFrameBuffer.height;
        tPPostProcessFrame.sampleAspectRatioNum = tPPostProcessFrameBuffer.sampleAspectRatioNum;
        tPPostProcessFrame.sampleAspectRatioDen = tPPostProcessFrameBuffer.sampleAspectRatioDen;
        tPPostProcessFrame.rotation = tPPostProcessFrameBuffer.rotation;
        tPPostProcessFrame.perfData = tPPostProcessFrameBuffer.perfData;
        return tPPostProcessFrame;
    }

    public static com.tencent.thumbplayer.api.TPPostProcessFrameBuffer convert2TPPostProcessFrameBuffer(com.tencent.thumbplayer.core.common.TPPostProcessFrame tPPostProcessFrame) {
        if (tPPostProcessFrame == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer = new com.tencent.thumbplayer.api.TPPostProcessFrameBuffer();
        int tPIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMediaType.class, tPPostProcessFrame.mediaType);
        tPPostProcessFrameBuffer.mediaType = tPIntValue;
        if (tPIntValue == 0) {
            tPPostProcessFrameBuffer.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapPixelFormat.class, tPPostProcessFrame.format);
        } else if (tPIntValue == 1) {
            tPPostProcessFrameBuffer.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioSampleFormat.class, tPPostProcessFrame.format);
        }
        tPPostProcessFrameBuffer.data = tPPostProcessFrame.data;
        tPPostProcessFrameBuffer.size = tPPostProcessFrame.linesize;
        tPPostProcessFrameBuffer.sampleRate = tPPostProcessFrame.sampleRate;
        tPPostProcessFrameBuffer.channelLayout = tPPostProcessFrame.channelLayout;
        tPPostProcessFrameBuffer.ptsMs = tPPostProcessFrame.ptsUs / 1000;
        tPPostProcessFrameBuffer.nbSamples = tPPostProcessFrame.nbSamples;
        tPPostProcessFrameBuffer.channels = tPPostProcessFrame.channels;
        tPPostProcessFrameBuffer.width = tPPostProcessFrame.width;
        tPPostProcessFrameBuffer.height = tPPostProcessFrame.height;
        tPPostProcessFrameBuffer.sampleAspectRatioNum = tPPostProcessFrame.sampleAspectRatioNum;
        tPPostProcessFrameBuffer.sampleAspectRatioDen = tPPostProcessFrame.sampleAspectRatioDen;
        tPPostProcessFrameBuffer.rotation = tPPostProcessFrame.rotation;
        tPPostProcessFrameBuffer.perfData = tPPostProcessFrame.perfData;
        return tPPostProcessFrameBuffer;
    }

    public static com.tencent.thumbplayer.api.TPSubtitleFrameBuffer convert2TPSubtitleFrameBuffer(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame) {
        if (tPSubtitleFrame == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer = new com.tencent.thumbplayer.api.TPSubtitleFrameBuffer();
        tPSubtitleFrameBuffer.data = tPSubtitleFrame.data;
        tPSubtitleFrameBuffer.lineSize = tPSubtitleFrame.linesize;
        tPSubtitleFrameBuffer.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSubtitleFormat.class, tPSubtitleFrame.format);
        int i17 = tPSubtitleFrame.height;
        tPSubtitleFrameBuffer.srcHeight = i17;
        int i18 = tPSubtitleFrame.width;
        tPSubtitleFrameBuffer.srcWidth = i18;
        tPSubtitleFrameBuffer.dstHeight = i17;
        tPSubtitleFrameBuffer.dstWidth = i18;
        tPSubtitleFrameBuffer.rotation = tPSubtitleFrame.rotation;
        tPSubtitleFrameBuffer.ptsMs = tPSubtitleFrame.ptsUs / 1000;
        return tPSubtitleFrameBuffer;
    }

    public static com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoCropInfo convert2TPVideoCropInfo(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoCropInfo videoCropInfo) {
        if (videoCropInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoCropInfo tPVideoCropInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoCropInfo();
        tPVideoCropInfo.width = videoCropInfo.width;
        tPVideoCropInfo.height = videoCropInfo.height;
        tPVideoCropInfo.cropLeft = videoCropInfo.cropLeft;
        tPVideoCropInfo.cropRight = videoCropInfo.cropRight;
        tPVideoCropInfo.cropTop = videoCropInfo.cropTop;
        tPVideoCropInfo.cropBottom = videoCropInfo.cropBottom;
        return tPVideoCropInfo;
    }

    public static com.tencent.thumbplayer.api.TPVideoFrameBuffer convert2TPVideoFrameBuffer(com.tencent.thumbplayer.core.common.TPVideoFrame tPVideoFrame) {
        int i17;
        com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer = new com.tencent.thumbplayer.api.TPVideoFrameBuffer();
        tPVideoFrameBuffer.data = tPVideoFrame.data;
        tPVideoFrameBuffer.lineSize = tPVideoFrame.linesize;
        tPVideoFrameBuffer.format = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapPixelFormat.class, tPVideoFrame.format);
        int i18 = tPVideoFrame.height;
        tPVideoFrameBuffer.srcHeight = i18;
        int i19 = tPVideoFrame.width;
        tPVideoFrameBuffer.srcWidth = i19;
        tPVideoFrameBuffer.dstHeight = i18;
        tPVideoFrameBuffer.dstWidth = i19;
        int i27 = tPVideoFrame.sampleAspectRatioDen;
        if (i27 > 0 && (i17 = tPVideoFrame.sampleAspectRatioNum) > 0) {
            tPVideoFrameBuffer.dstWidth = java.lang.Math.round((i17 / i27) * i19);
        }
        tPVideoFrameBuffer.rotation = tPVideoFrame.rotation;
        tPVideoFrameBuffer.ptsMs = tPVideoFrame.ptsUs / 1000;
        return tPVideoFrameBuffer;
    }

    public static com.tencent.thumbplayer.api.TPVideoPacketBuffer convert2TPVideoPacketBuffer(com.tencent.thumbplayer.core.common.TPVideoPacket tPVideoPacket) {
        if (tPVideoPacket == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPVideoPacketBuffer tPVideoPacketBuffer = new com.tencent.thumbplayer.api.TPVideoPacketBuffer();
        tPVideoPacketBuffer.mData = tPVideoPacket.mData;
        tPVideoPacketBuffer.mSize = tPVideoPacket.mSize;
        tPVideoPacketBuffer.mPtsMs = tPVideoPacket.mPtsUs / 1000;
        tPVideoPacketBuffer.mDtsMs = tPVideoPacket.mDtsUs / 1000;
        tPVideoPacketBuffer.mDolbyVisionInfo = convert2TPPlayerSurfaceDolbyVisionInfo(tPVideoPacket.mDolbyVisionInfo);
        return tPVideoPacketBuffer;
    }

    public static com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo convert2TPVideoSeiInfo(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoSeiInfo videoSeiInfo) {
        if (videoSeiInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo();
        int tPIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, videoSeiInfo.videoCodecType);
        tPVideoSeiInfo.videoCodecType = tPIntValue;
        if (videoSeiInfo.isSpecialType) {
            tPVideoSeiInfo.videoSeiType = videoSeiInfo.videoSeiType;
        } else if (tPIntValue == 26) {
            tPVideoSeiInfo.videoSeiType = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoH264SeiType.class, videoSeiInfo.videoSeiType);
        } else if (tPIntValue == 172) {
            tPVideoSeiInfo.videoSeiType = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoHevcSeiType.class, videoSeiInfo.videoSeiType);
        }
        int i17 = videoSeiInfo.dataSize;
        tPVideoSeiInfo.seiDataSize = i17;
        tPVideoSeiInfo.seiData = java.util.Arrays.copyOf(videoSeiInfo.data, i17);
        return tPVideoSeiInfo;
    }

    public static int convertToNativeParamsType(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    public static com.tencent.thumbplayer.core.common.TPNativeAudioAttributes convertToTPNativeAudioAttributes(com.tencent.thumbplayer.api.TPAudioAttributes tPAudioAttributes) {
        if (tPAudioAttributes == null) {
            return null;
        }
        int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage.class, tPAudioAttributes.getUsage());
        int nativeIntValue2 = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage.class, tPAudioAttributes.getContentType());
        int i17 = (tPAudioAttributes.getFlags() & 1) == 0 ? 0 : 1;
        if ((tPAudioAttributes.getFlags() & 16) != 0) {
            i17 |= 16;
        }
        if ((tPAudioAttributes.getFlags() & 256) != 0) {
            i17 |= 256;
        }
        return new com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder().setUsage(nativeIntValue).setContentType(nativeIntValue2).setFlags(i17).build();
    }

    /* loaded from: classes13.dex */
    public static class OptionIdMapping {
        private final int nativePlayerOptionalID;
        private final int optionalIDType;

        public OptionIdMapping() {
            this.optionalIDType = -1;
            this.nativePlayerOptionalID = -1;
        }

        public int getNativePlayerOptionalID() {
            return this.nativePlayerOptionalID;
        }

        public int getOptionalIDType() {
            return this.optionalIDType;
        }

        public boolean isIllegal() {
            return this.optionalIDType == -1 || this.nativePlayerOptionalID == -1;
        }

        public OptionIdMapping(int i17, int i18) {
            this.optionalIDType = i17;
            this.nativePlayerOptionalID = i18;
        }
    }

    private static com.tencent.thumbplayer.api.TPSurfaceRenderInfo.TPVideoCropInfo convert2TPVideoCropInfo(com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo.TPVideoCropInfo tPVideoCropInfo) {
        if (tPVideoCropInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPSurfaceRenderInfo.TPVideoCropInfo tPVideoCropInfo2 = new com.tencent.thumbplayer.api.TPSurfaceRenderInfo.TPVideoCropInfo();
        tPVideoCropInfo2.cropLeft = tPVideoCropInfo.cropLeft;
        tPVideoCropInfo2.cropRight = tPVideoCropInfo.cropRight;
        tPVideoCropInfo2.cropTop = tPVideoCropInfo.cropTop;
        tPVideoCropInfo2.cropBottom = tPVideoCropInfo.cropBottom;
        tPVideoCropInfo2.width = tPVideoCropInfo.width;
        tPVideoCropInfo2.height = tPVideoCropInfo.height;
        return tPVideoCropInfo2;
    }
}

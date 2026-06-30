package com.tencent.thumbplayer.adapter.strategy.utils;

/* loaded from: classes6.dex */
public class TPNativeKeyMap {
    public static final int INVALID_VALUE = -1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPAudioAVSyncStrategy.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapAudioAVSyncStrategy {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerAudioAVSyncStrategy
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapAudioCodecType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerAudioCodecType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapAudioDecoderType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerAudioDecoderType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapAudioSampleFormat {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerAudioSampleFormat
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = 1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapBufferStrategy {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerBufferStrategy
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapCodecType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerVideoCodecType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapConnectionAction {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeConnectionAction
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.connection.TPPlayerConnectionConstant.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapConnectionConfig {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeConnectionConfig
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapDemuxerType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerDemuxerType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPPlayerDetailInfo.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapDetailInfoType {
        @com.tencent.thumbplayer.core.common.TPDetailInfo.TPDetailInfoType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapDrmType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerDrmType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 1001, searchClass = com.tencent.thumbplayer.api.TPErrorCode.class, tpDefValue = 1001, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapErrorType {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeErrorType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPFeatureType.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapFeatureType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerFeatureType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapHdrType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerHDRType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface MapInitConfig {
        java.lang.String keyName();

        @com.tencent.thumbplayer.api.TPCommonEnum.OptionalIdType
        int type();

        @com.tencent.thumbplayer.api.TPCommonEnum.NativeInitConfig
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapMediaType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerMediaType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPPlayerMsg.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapMsgInfo {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeMsgInfo
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface MapOptionalId {
        java.lang.String keyName();

        @com.tencent.thumbplayer.api.TPCommonEnum.OptionalIdType
        int type();

        @com.tencent.thumbplayer.api.TPCommonEnum.NativeOptionalId
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapPixelFormat {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerPixelFormat
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPPropertyID.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapPropertyId {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativePropertyId
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapReduceLantencyType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerReduceLantencyType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPDrmInfo.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapReportDrmType {
        @com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams.TPDrmType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 2, searchClass = com.tencent.thumbplayer.api.ITPPlayer.class, tpDefValue = 2, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapSeekMode {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeSeekMode
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPSubtitleRenderModel.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapSubtitleFontStyle {
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPSubtitleFrameBuffer.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapSubtitleFormat {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerSubtitleFormat
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPSubtitleRenderModel.class, tpDefValue = -1, valueClass = long.class)
    /* loaded from: classes6.dex */
    public @interface MapSubtitleRenderParams {
        long value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface MapSurfaceType {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeSurfaceType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.ITPPlayer.class, tpDefValue = 1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapSwitchDefMode {
        @com.tencent.thumbplayer.api.TPCommonEnum.NativeSwitchDefMode
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapTPAudioAttributeContentType {
        @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeContentType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapTPAudioAttributeFlag {
        @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeFlag
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPAudioAttributes.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapTPAudioAttributeStreamType {
        @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeStreamType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 0, searchClass = com.tencent.thumbplayer.api.TPAudioAttributes.class, tpDefValue = 0, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapTPAudioAttributeUsage {
        @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeUsage
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPThreadPriority.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapThreadPriorityType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerThreadPriority
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = 2, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = 2, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapVideoColorSpace {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerVideoColorSpace
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPCommonEnum.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapVideoDecoderType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerVideoDecoderType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPVideoSeiH264Type.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapVideoH264SeiType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerVideoH264SeiType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.SearchConfig(nativeDefValue = -1, searchClass = com.tencent.thumbplayer.api.TPVideoSeiHevcType.class, tpDefValue = -1, valueClass = int.class)
    /* loaded from: classes6.dex */
    public @interface MapVideoHevcSeiType {
        @com.tencent.thumbplayer.api.TPCommonEnum.InnerVideoHevcSeiType
        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface SearchConfig {
        long nativeDefValue();

        java.lang.Class<?> searchClass();

        long tpDefValue();

        java.lang.Class<? extends java.lang.Number> valueClass();
    }
}

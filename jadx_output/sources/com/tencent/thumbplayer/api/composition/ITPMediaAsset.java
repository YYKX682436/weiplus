package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaAsset {
    public static final int INVALID_ID = -1;
    public static final int MEDIA_TYPE_AUDIO = 3;
    public static final int MEDIA_TYPE_AV_MIX = 1;
    public static final int MEDIA_TYPE_MUTABLE = 4;
    public static final int MEDIA_TYPE_VIDEO = 2;

    com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam getExtraParam();

    java.util.Map<java.lang.String, java.lang.String> getHttpHeader();

    int getMediaType();

    java.lang.String getUrl();

    void setExtraParam(com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam iTPMediaAssetExtraParam);

    void setHttpHeader(java.util.Map<java.lang.String, java.lang.String> map);
}

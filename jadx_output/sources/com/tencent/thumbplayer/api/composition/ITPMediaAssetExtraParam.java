package com.tencent.thumbplayer.api.composition;

/* loaded from: classes13.dex */
public interface ITPMediaAssetExtraParam extends java.io.Serializable {
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO = "preferred_audio";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_PREFERRED_SUBTITLE = "preferred_subtitle";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO = "preferred_video";

    int getExtraInt(java.lang.String str);

    com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam getExtraObject(java.lang.String str);

    java.lang.String getExtraString(java.lang.String str);

    void setExtraInt(java.lang.String str, int i17);

    void setExtraObject(java.lang.String str, com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam iTPMediaAssetObjectParam);

    void setExtraString(java.lang.String str, java.lang.String str2);
}

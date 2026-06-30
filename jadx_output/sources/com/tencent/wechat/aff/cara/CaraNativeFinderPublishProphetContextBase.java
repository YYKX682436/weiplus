package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public interface CaraNativeFinderPublishProphetContextBase {
    int editTimeMs();

    boolean enterBackgroundOnPostPage();

    float fileSize();

    boolean hasCleanUpLongDesc();

    boolean hasCleanUpShortDesc();

    boolean hasClickLongDescTextView();

    boolean hasClickShortDescTextView();

    boolean hasExtReading();

    boolean hasInvalidWatermark();

    boolean hasOriginalStatementEntry();

    boolean isSearchMusic();

    int longDescLength();

    boolean newSelectOnPostPage();

    float originAudioBitrate();

    float originBitrate();

    int originHight();

    float originVideoFrameRate();

    int originWidth();

    com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType patMusicType();

    com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType poiType();

    boolean postFromDraft();

    float predictProbThreshold();

    int shortDescLength();

    boolean useVideoTemplateInfo();

    int videoDurationMs();

    int videoEmojiNum();

    boolean videoMusicIdValid();

    int videoMusicIndex();

    int videoPlayDuration();

    com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType videoSourceType();

    int videoTextNum();
}

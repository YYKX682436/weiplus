package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeFinderPublishProphetContextBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContextBase stub;

    public CaraNativeFinderPublishProphetContextBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContextBase) obj;
    }

    public int editTimeMs() {
        return this.stub.editTimeMs();
    }

    public boolean enterBackgroundOnPostPage() {
        return this.stub.enterBackgroundOnPostPage();
    }

    public float fileSize() {
        return this.stub.fileSize();
    }

    public boolean hasCleanUpLongDesc() {
        return this.stub.hasCleanUpLongDesc();
    }

    public boolean hasCleanUpShortDesc() {
        return this.stub.hasCleanUpShortDesc();
    }

    public boolean hasClickLongDescTextView() {
        return this.stub.hasClickLongDescTextView();
    }

    public boolean hasClickShortDescTextView() {
        return this.stub.hasClickShortDescTextView();
    }

    public boolean hasExtReading() {
        return this.stub.hasExtReading();
    }

    public boolean hasInvalidWatermark() {
        return this.stub.hasInvalidWatermark();
    }

    public boolean hasOriginalStatementEntry() {
        return this.stub.hasOriginalStatementEntry();
    }

    public boolean isSearchMusic() {
        return this.stub.isSearchMusic();
    }

    public int longDescLength() {
        return this.stub.longDescLength();
    }

    public boolean newSelectOnPostPage() {
        return this.stub.newSelectOnPostPage();
    }

    public float originAudioBitrate() {
        return this.stub.originAudioBitrate();
    }

    public float originBitrate() {
        return this.stub.originBitrate();
    }

    public int originHight() {
        return this.stub.originHight();
    }

    public float originVideoFrameRate() {
        return this.stub.originVideoFrameRate();
    }

    public int originWidth() {
        return this.stub.originWidth();
    }

    public int patMusicType() {
        return this.stub.patMusicType().getNumber();
    }

    public int poiType() {
        return this.stub.poiType().getNumber();
    }

    public boolean postFromDraft() {
        return this.stub.postFromDraft();
    }

    public float predictProbThreshold() {
        return this.stub.predictProbThreshold();
    }

    public int shortDescLength() {
        return this.stub.shortDescLength();
    }

    public boolean useVideoTemplateInfo() {
        return this.stub.useVideoTemplateInfo();
    }

    public int videoDurationMs() {
        return this.stub.videoDurationMs();
    }

    public int videoEmojiNum() {
        return this.stub.videoEmojiNum();
    }

    public boolean videoMusicIdValid() {
        return this.stub.videoMusicIdValid();
    }

    public int videoMusicIndex() {
        return this.stub.videoMusicIndex();
    }

    public int videoPlayDuration() {
        return this.stub.videoPlayDuration();
    }

    public int videoSourceType() {
        return this.stub.videoSourceType().getNumber();
    }

    public int videoTextNum() {
        return this.stub.videoTextNum();
    }
}

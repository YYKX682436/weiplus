package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeFinderPublishProphetContext extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext.Destructor destructor;

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
        }

        public static native void jniDestroyCaraNativeFinderPublishProphetContext(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            jniDestroyCaraNativeFinderPublishProphetContext(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    public CaraNativeFinderPublishProphetContext(com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContextBase caraNativeFinderPublishProphetContextBase) {
        this.zidlCreateName = "cara.CaraNativeFinderPublishProphetContext@Attach";
        jniCreateCaraNativeFinderPublishProphetContext("cara.CaraNativeFinderPublishProphetContext@Attach", this.zidlSvrIdentity, caraNativeFinderPublishProphetContextBase);
    }

    public static com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext buildZidlObjForHolder(java.lang.String str, java.lang.String str2) {
        return new com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2);
    }

    private native void jniCreateCaraNativeFinderPublishProphetContext(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    private native int jnieditTimeMs(long j17);

    private native boolean jnienterBackgroundOnPostPage(long j17);

    private native float jnifileSize(long j17);

    private native boolean jnihasCleanUpLongDesc(long j17);

    private native boolean jnihasCleanUpShortDesc(long j17);

    private native boolean jnihasClickLongDescTextView(long j17);

    private native boolean jnihasClickShortDescTextView(long j17);

    private native boolean jnihasExtReading(long j17);

    private native boolean jnihasInvalidWatermark(long j17);

    private native boolean jnihasOriginalStatementEntry(long j17);

    private native boolean jniisSearchMusic(long j17);

    private native int jnilongDescLength(long j17);

    private native boolean jninewSelectOnPostPage(long j17);

    private native float jnioriginAudioBitrate(long j17);

    private native float jnioriginBitrate(long j17);

    private native int jnioriginHight(long j17);

    private native float jnioriginVideoFrameRate(long j17);

    private native int jnioriginWidth(long j17);

    private native int jnipatMusicType(long j17);

    private native int jnipoiType(long j17);

    private native boolean jnipostFromDraft(long j17);

    private native float jnipredictProbThreshold(long j17);

    private native int jnishortDescLength(long j17);

    private native boolean jniuseVideoTemplateInfo(long j17);

    private native int jnivideoDurationMs(long j17);

    private native int jnivideoEmojiNum(long j17);

    private native boolean jnivideoMusicIdValid(long j17);

    private native int jnivideoMusicIndex(long j17);

    private native int jnivideoPlayDuration(long j17);

    private native int jnivideoSourceType(long j17);

    private native int jnivideoTextNum(long j17);

    public int editTimeMs() {
        return jnieditTimeMs(this.nativeHandler);
    }

    public boolean enterBackgroundOnPostPage() {
        return jnienterBackgroundOnPostPage(this.nativeHandler);
    }

    public float fileSize() {
        return jnifileSize(this.nativeHandler);
    }

    public boolean hasCleanUpLongDesc() {
        return jnihasCleanUpLongDesc(this.nativeHandler);
    }

    public boolean hasCleanUpShortDesc() {
        return jnihasCleanUpShortDesc(this.nativeHandler);
    }

    public boolean hasClickLongDescTextView() {
        return jnihasClickLongDescTextView(this.nativeHandler);
    }

    public boolean hasClickShortDescTextView() {
        return jnihasClickShortDescTextView(this.nativeHandler);
    }

    public boolean hasExtReading() {
        return jnihasExtReading(this.nativeHandler);
    }

    public boolean hasInvalidWatermark() {
        return jnihasInvalidWatermark(this.nativeHandler);
    }

    public boolean hasOriginalStatementEntry() {
        return jnihasOriginalStatementEntry(this.nativeHandler);
    }

    public boolean isSearchMusic() {
        return jniisSearchMusic(this.nativeHandler);
    }

    public int longDescLength() {
        return jnilongDescLength(this.nativeHandler);
    }

    public boolean newSelectOnPostPage() {
        return jninewSelectOnPostPage(this.nativeHandler);
    }

    public float originAudioBitrate() {
        return jnioriginAudioBitrate(this.nativeHandler);
    }

    public float originBitrate() {
        return jnioriginBitrate(this.nativeHandler);
    }

    public int originHight() {
        return jnioriginHight(this.nativeHandler);
    }

    public float originVideoFrameRate() {
        return jnioriginVideoFrameRate(this.nativeHandler);
    }

    public int originWidth() {
        return jnioriginWidth(this.nativeHandler);
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType patMusicType() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.forNumber(jnipatMusicType(this.nativeHandler));
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType poiType() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.forNumber(jnipoiType(this.nativeHandler));
    }

    public boolean postFromDraft() {
        return jnipostFromDraft(this.nativeHandler);
    }

    public float predictProbThreshold() {
        return jnipredictProbThreshold(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext.Destructor destructor = new com.tencent.wechat.aff.cara.CaraNativeFinderPublishProphetContext.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public int shortDescLength() {
        return jnishortDescLength(this.nativeHandler);
    }

    public boolean useVideoTemplateInfo() {
        return jniuseVideoTemplateInfo(this.nativeHandler);
    }

    public int videoDurationMs() {
        return jnivideoDurationMs(this.nativeHandler);
    }

    public int videoEmojiNum() {
        return jnivideoEmojiNum(this.nativeHandler);
    }

    public boolean videoMusicIdValid() {
        return jnivideoMusicIdValid(this.nativeHandler);
    }

    public int videoMusicIndex() {
        return jnivideoMusicIndex(this.nativeHandler);
    }

    public int videoPlayDuration() {
        return jnivideoPlayDuration(this.nativeHandler);
    }

    public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType videoSourceType() {
        return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.forNumber(jnivideoSourceType(this.nativeHandler));
    }

    public int videoTextNum() {
        return jnivideoTextNum(this.nativeHandler);
    }

    public CaraNativeFinderPublishProphetContext(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        jniCreateCaraNativeFinderPublishProphetContext(str, str2, null);
    }
}

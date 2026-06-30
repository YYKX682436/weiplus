package com.tencent.trtc.txcopyrightedmedia;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::extensions")
/* loaded from: classes16.dex */
public class TXCopyrightedMediaImpl extends com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia {
    private long mNativeTXCopyrightedMediaImpl;

    /* loaded from: classes16.dex */
    public class TXSongScoreImpl implements com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore {
        private long mNativeTXCopyrightedSongScore;

        public TXSongScoreImpl(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.mNativeTXCopyrightedSongScore = 0L;
            this.mNativeTXCopyrightedSongScore = com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeCreateSongScore(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.this.mNativeTXCopyrightedMediaImpl, this, str, i17, i18, str2, str3, str4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public int calculateTotalScore() {
            return com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeCalculateTotalScore(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void destroy() {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeDestroySongScore(this.mNativeTXCopyrightedSongScore);
            this.mNativeTXCopyrightedSongScore = 0L;
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void finish() {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeFinish(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.TXSongScoreNoteItem[] getAllGrove() {
            return com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeGetAllGrove(this.mNativeTXCopyrightedSongScore);
        }

        public void onMIDIGroveAndHint(java.lang.String str, boolean z17, float f17, float f18, int i17, java.lang.Object obj) {
            ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIGroveAndHint(str, z17, f17, f18, i17);
        }

        public void onMIDISCoreUpdate(java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
            ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDISCoreUpdate(str, i17, i18, i19);
        }

        public void onMIDIScoreError(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
            ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreError(str, i17, str2);
        }

        public void onMIDIScoreFinish(java.lang.String str, int[] iArr, int i17, java.lang.Object obj) {
            ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreFinish(str, iArr, i17);
        }

        public void onMIDIScorePrepared(java.lang.String str, java.lang.Object obj) {
            ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScorePrepared(str);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void prepare() {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativePrepare(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void process(byte[] bArr, int i17, float f17) {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeProcess(this.mNativeTXCopyrightedSongScore, bArr, i17, f17);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setKeyShift(int i17) {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeSetKeyShift(this.mNativeTXCopyrightedSongScore, i17);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setSongScoreCallback(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback iTXSongScoreCallback) {
            com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.nativeSetSongScoreCallback(this.mNativeTXCopyrightedSongScore, iTXSongScoreCallback);
        }
    }

    public TXCopyrightedMediaImpl() {
        this.mNativeTXCopyrightedMediaImpl = 0L;
        this.mNativeTXCopyrightedMediaImpl = nativeCreateCopyRightedMedia(this);
    }

    public static java.lang.Object createSongScoreNoteItem(int i17, int i18, int i19, int i27) {
        com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.TXSongScoreNoteItem tXSongScoreNoteItem = new com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.TXSongScoreNoteItem();
        tXSongScoreNoteItem.startTime = i17;
        tXSongScoreNoteItem.duration = i18;
        tXSongScoreNoteItem.noteHeight = i19;
        tXSongScoreNoteItem.endTime = i27;
        return tXSongScoreNoteItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeCalculateTotalScore(long j17);

    private static native void nativeCancelPreloadMusic(long j17, java.lang.String str, java.lang.String str2);

    private static native void nativeClearMusicCache(long j17);

    private static native long nativeCreateCopyRightedMedia(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl tXCopyrightedMediaImpl);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateSongScore(long j17, com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.TXSongScoreImpl tXSongScoreImpl, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    private static native void nativeDestroyCopyRightedMedia(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl tXCopyrightedMediaImpl, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDestroySongScore(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFinish(long j17);

    private static native java.lang.String nativeGenMusicURI(long j17, java.lang.String str, int i17, java.lang.String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.TXSongScoreNoteItem[] nativeGetAllGrove(long j17);

    private static native boolean nativeIsMusicPreloaded(long j17, java.lang.String str, java.lang.String str2);

    private static native void nativePreloadMusic(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativePrepare(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProcess(long j17, byte[] bArr, int i17, float f17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetKeyShift(long j17, int i17);

    private static native void nativeSetLicense(long j17, android.content.Context context, java.lang.String str, java.lang.String str2);

    private static native void nativeSetMusicCacheMaxCount(long j17, int i17);

    private static native void nativeSetMusicPreloadCallback(long j17, java.lang.Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSongScoreCallback(long j17, java.lang.Object obj);

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void cancelPreloadMusic(java.lang.String str, java.lang.String str2) {
        nativeCancelPreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache() {
        nativeClearMusicCache(this.mNativeTXCopyrightedMediaImpl);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore createSongScore(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl.TXSongScoreImpl(str, i17, i18, str2, str3, str4);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void destroy() {
        nativeDestroyCopyRightedMedia(this, this.mNativeTXCopyrightedMediaImpl);
        this.mNativeTXCopyrightedMediaImpl = 0L;
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public java.lang.String genMusicURI(java.lang.String str, int i17, java.lang.String str2) {
        return nativeGenMusicURI(this.mNativeTXCopyrightedMediaImpl, str, i17, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void init() {
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public boolean isMusicPreloaded(java.lang.String str, java.lang.String str2) {
        return nativeIsMusicPreloaded(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    public void onPreloadComplete(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.Object obj) {
        ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadComplete(str, str2, i17, str3);
    }

    public void onPreloadProgress(java.lang.String str, java.lang.String str2, float f17, java.lang.Object obj) {
        ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadProgress(str, str2, f17);
    }

    public void onPreloadStart(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        ((com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadStart(str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        nativePreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setLicense(android.content.Context context, java.lang.String str, java.lang.String str2) {
        nativeSetLicense(this.mNativeTXCopyrightedMediaImpl, context, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicCacheMaxCount(int i17) {
        nativeSetMusicCacheMaxCount(this.mNativeTXCopyrightedMediaImpl, i17);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicPreloadCallback(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXMusicPreloadCallback iTXMusicPreloadCallback) {
        nativeSetMusicPreloadCallback(this.mNativeTXCopyrightedMediaImpl, iTXMusicPreloadCallback);
    }
}

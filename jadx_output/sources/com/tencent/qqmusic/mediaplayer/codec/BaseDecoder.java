package com.tencent.qqmusic.mediaplayer.codec;

/* loaded from: classes13.dex */
public abstract class BaseDecoder {
    public int mNativeApeDecoderRef = 0;
    private com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType mAudioType = null;
    private final boolean mHasLoadSoSuccess = com.tencent.qqmusic.mediaplayer.NativeLibs.loadAll(getNativeLibs());

    private void throwIfSoNotLoadSuccess() {
        if (!this.mHasLoadSoSuccess) {
            throw new com.tencent.qqmusic.mediaplayer.SoNotFindException("has't load so success , can't call native funcation");
        }
    }

    public int decodeData(int i17, byte[] bArr) {
        throwIfSoNotLoadSuccess();
        return -1;
    }

    public com.tencent.qqmusic.mediaplayer.AudioInformation getAudioInformation() {
        throwIfSoNotLoadSuccess();
        return null;
    }

    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return this.mAudioType;
    }

    public abstract long getBytePositionOfTime(long j17);

    public long getCurrentTime() {
        throwIfSoNotLoadSuccess();
        return -1L;
    }

    public long getDuration() {
        return -1L;
    }

    public int getErrorCodeMask() {
        return -1;
    }

    public long getMinBufferSize() {
        return 0L;
    }

    public abstract java.util.List<com.tencent.qqmusic.mediaplayer.NativeLibs> getNativeLibs();

    public int init(java.lang.String str, boolean z17) {
        throwIfSoNotLoadSuccess();
        return -1;
    }

    public int release() {
        throwIfSoNotLoadSuccess();
        return -1;
    }

    public int seekTo(int i17) {
        throwIfSoNotLoadSuccess();
        return -1;
    }

    public void setAudioTrack(android.media.AudioTrack audioTrack) {
    }

    public void setAudioType(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        this.mAudioType = audioType;
    }

    public int init(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        throwIfSoNotLoadSuccess();
        return -1;
    }

    public int init(com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource iNativeDataSource) {
        throwIfSoNotLoadSuccess();
        return -1;
    }
}

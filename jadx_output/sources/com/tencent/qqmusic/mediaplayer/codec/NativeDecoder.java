package com.tencent.qqmusic.mediaplayer.codec;

/* loaded from: classes13.dex */
public class NativeDecoder extends com.tencent.qqmusic.mediaplayer.codec.BaseDecoder {
    private static final java.lang.String TAG = "NativeDecoder";
    private final java.util.concurrent.locks.ReadWriteLock mReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private long mNativePointer = 0;

    private native int nativeDecode(long j17, byte[] bArr, int i17, int i18);

    private native com.tencent.qqmusic.mediaplayer.AudioInformation nativeGetAudioInformation(long j17);

    private native long nativeGetBytePositionOfTime(long j17, long j18);

    private native long nativeGetCurrentPosition(long j17);

    private native int nativeGetDetailErrorCode(long j17);

    private native java.lang.String nativeGetDetailErrorDescription(long j17);

    private native long nativeGetDuration(long j17);

    private native long nativeGetMinBufferSize(long j17);

    private native long[] nativeInit(long j17);

    private native long[] nativeInit(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource);

    private native int nativeRelease(long j17);

    private native long nativeSeekTo(long j17, long j18);

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int decodeData(int i17, byte[] bArr) {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeDecode(this.mNativePointer, bArr, 0, i17);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public com.tencent.qqmusic.mediaplayer.AudioInformation getAudioInformation() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetAudioInformation(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getBytePositionOfTime(long j17) {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetBytePositionOfTime(this.mNativePointer, j17);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getCurrentTime() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetCurrentPosition(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getDuration() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetDuration(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int getErrorCodeMask() {
        return -1;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public long getMinBufferSize() {
        this.mReadWriteLock.readLock().lock();
        try {
            return nativeGetMinBufferSize(this.mNativePointer);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public java.util.List<com.tencent.qqmusic.mediaplayer.NativeLibs> getNativeLibs() {
        return java.util.Arrays.asList(com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon, com.tencent.qqmusic.mediaplayer.NativeLibs.formatDetector, com.tencent.qqmusic.mediaplayer.NativeLibs.codecFactory, com.tencent.qqmusic.mediaplayer.NativeLibs.decoderJni, com.tencent.qqmusic.mediaplayer.NativeLibs.cppShared, com.tencent.qqmusic.mediaplayer.NativeLibs.xlog, com.tencent.qqmusic.mediaplayer.NativeLibs.xFFmpeg);
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        long j17;
        this.mReadWriteLock.writeLock().lock();
        try {
            long[] nativeInit = nativeInit(iDataSource);
            if (nativeInit == null || nativeInit.length < 2) {
                j17 = -1;
            } else {
                this.mNativePointer = nativeInit[0];
                j17 = nativeInit[1];
            }
            int i17 = (int) j17;
            return i17;
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int release() {
        this.mReadWriteLock.writeLock().lock();
        try {
            int nativeRelease = nativeRelease(this.mNativePointer);
            this.mNativePointer = 0L;
            return nativeRelease;
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int seekTo(int i17) {
        this.mReadWriteLock.readLock().lock();
        try {
            return (int) nativeSeekTo(this.mNativePointer, i17);
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource iNativeDataSource) {
        long j17;
        this.mReadWriteLock.writeLock().lock();
        if (iNativeDataSource != null) {
            try {
                long[] nativeInit = nativeInit(iNativeDataSource.getNativeInstance());
                if (nativeInit != null && nativeInit.length >= 2) {
                    this.mNativePointer = nativeInit[0];
                    j17 = nativeInit[1];
                    int i17 = (int) j17;
                    return i17;
                }
            } finally {
                this.mReadWriteLock.writeLock().unlock();
            }
        }
        j17 = -1;
        int i172 = (int) j17;
        return i172;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.BaseDecoder
    public int init(java.lang.String str, boolean z17) {
        return init(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str));
    }
}

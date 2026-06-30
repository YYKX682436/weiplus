package com.tencent.thumbplayer.core.imagegenerator;

/* loaded from: classes16.dex */
public class TPImageGenerator {
    private com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback mCallback;
    private int mFd;
    private long mFdLength;
    private long mFdOffset;
    private java.util.Map<java.lang.String, java.lang.String> mHttpHeader;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private java.lang.String mUrl;

    public TPImageGenerator(java.lang.String str, com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPImageGeneratorCallback;
    }

    private native void _cancelAllImageGenerations();

    private native int _createWithFd(int i17, long j17, long j18, java.lang.Object obj);

    private native int _createWithUrl(java.lang.String str, java.lang.Object obj);

    private native void _generateImageAsyncAtTime(long j17, long j18, java.lang.Object obj);

    private native void _generateImagesAsyncForTimes(long[] jArr, long j17, java.lang.Object obj);

    private native void _release();

    private void loadLibrary() {
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.mIsLibLoaded = false;
        }
    }

    public void cancelAllImageGenerations() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            _cancelAllImageGenerations();
        }
    }

    public void generateImageAsyncAtTime(long j17, long j18, com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            _generateImageAsyncAtTime(j17, j18, tPImageGeneratorParams);
            return;
        }
        throw new java.lang.IllegalStateException("Failed to generate image at time " + j17 + " due to invalid state.");
    }

    public void generateImagesAsyncForTimes(long[] jArr, long j17, com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to generate images due to invalid state.");
        }
        _generateImagesAsyncForTimes(jArr, j17, tPImageGeneratorParams);
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            throw new java.lang.IllegalStateException("Failed to init due to invalid state.");
        }
        this.mInited = true;
        java.lang.String str = this.mUrl;
        if (str == null || this.mHttpHeader == null) {
            if (str != null) {
                _createWithUrl(str, this.mCallback);
            } else {
                _createWithFd(this.mFd, this.mFdOffset, this.mFdLength, this.mCallback);
            }
        }
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _release();
        }
    }

    public TPImageGenerator(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPImageGeneratorCallback;
    }

    public TPImageGenerator(int i17, long j17, long j18, com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback iTPImageGeneratorCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mCallback = null;
        this.mFd = -1;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mFd = i17;
        this.mFdOffset = j17;
        this.mFdLength = j18;
        this.mCallback = iTPImageGeneratorCallback;
    }
}

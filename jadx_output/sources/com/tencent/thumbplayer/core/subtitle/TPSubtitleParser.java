package com.tencent.thumbplayer.core.subtitle;

/* loaded from: classes16.dex */
public class TPSubtitleParser {
    public static final int TP_SUBTITLE_OUTPUT_RGBA = 1;
    public static final int TP_SUBTITLE_OUTPUT_TEXT = 0;
    private com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback mCallback;
    private java.util.Map<java.lang.String, java.lang.String> mHttpHeader;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private int mOutputType;
    private java.lang.String mUrl;

    public TPSubtitleParser(java.lang.String str, com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
    }

    private native int _subtitleCreate(java.lang.String str, java.lang.Object obj, int i17);

    private native int _subtitleCreateWithUrlHttpHeader(java.lang.String str, java.lang.Object[] objArr, java.lang.Object obj, int i17);

    private native void _subtitleDelete();

    private native com.tencent.thumbplayer.core.common.TPSubtitleFrameWrapper _subtitleGetFrame(long j17);

    private native java.lang.String _subtitleGetText(long j17, int i17);

    private native int _subtitleGetTrackCount();

    private native java.lang.String _subtitleGetTrackName(int i17);

    private native void _subtitleLoadAsync();

    private native void _subtitlePauseAsync();

    private native int _subtitleSelectTrackAsync(int i17, long j17);

    private native void _subtitleSetRenderParams(com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams);

    private native void _subtitleStartAsync();

    private native void _subtitleStop();

    private void loadLibrary() {
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.mIsLibLoaded = false;
        }
    }

    public com.tencent.thumbplayer.core.common.TPSubtitleFrameWrapper getSubtitleFrame(long j17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleGetFrame(j17);
        }
        throw new java.lang.IllegalStateException("Failed to getSubtitleFrame due to invalid state.");
    }

    public java.lang.String getSubtitleText(long j17, int i17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleGetText(j17, i17);
        }
        throw new java.lang.IllegalStateException("Failed to getSubtitleText due to invalid state.");
    }

    public com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] getTrackInfo() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to getTrackInfo due to invalid state.");
        }
        int _subtitleGetTrackCount = _subtitleGetTrackCount();
        if (_subtitleGetTrackCount <= 0) {
            return null;
        }
        com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] tPMediaTrackInfoArr = new com.tencent.thumbplayer.core.common.TPMediaTrackInfo[_subtitleGetTrackCount];
        for (int i17 = 0; i17 < _subtitleGetTrackCount; i17++) {
            com.tencent.thumbplayer.core.common.TPMediaTrackInfo tPMediaTrackInfo = new com.tencent.thumbplayer.core.common.TPMediaTrackInfo();
            tPMediaTrackInfo.trackType = 3;
            tPMediaTrackInfo.trackName = _subtitleGetTrackName(i17);
            tPMediaTrackInfoArr[i17] = tPMediaTrackInfo;
        }
        return tPMediaTrackInfoArr;
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
        if (str == null || this.mCallback == null) {
            return;
        }
        _subtitleCreateWithUrlHttpHeader(str, com.tencent.thumbplayer.core.player.TPNativePlayerUtils.tpMapStringToStringArray(this.mHttpHeader), this.mCallback, this.mOutputType);
    }

    public void loadAsync() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to loadAsync due to invalid state.");
        }
        _subtitleLoadAsync();
    }

    public void pauseAsync() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to pauseAsync due to invalid state.");
        }
        _subtitlePauseAsync();
    }

    public int selectTrackAsync(int i17, long j17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _subtitleSelectTrackAsync(i17, j17);
        }
        throw new java.lang.IllegalStateException("Failed to selectTrackAsync due to invalid state.");
    }

    public int selectTracksAsync(int[] iArr, long j17) {
        return 0;
    }

    public void setRenderParams(com.tencent.thumbplayer.core.subtitle.TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to setRenderParams due to invalid state.");
        }
        _subtitleSetRenderParams(tPNativeSubtitleRenderParams);
    }

    public void startAsync() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to startAsync due to invalid state.");
        }
        _subtitleStartAsync();
    }

    public void stop() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to stop due to invalid state.");
        }
        _subtitleStop();
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _subtitleDelete();
        }
    }

    public TPSubtitleParser(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback iTPSubtitleParserCallback) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
    }

    public TPSubtitleParser(java.lang.String str, com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback iTPSubtitleParserCallback, int i17) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i17;
    }

    public TPSubtitleParser(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.thumbplayer.core.subtitle.ITPSubtitleParserCallback iTPSubtitleParserCallback, int i17) {
        this.mUrl = null;
        this.mHttpHeader = null;
        this.mOutputType = 0;
        this.mCallback = null;
        this.mInited = false;
        this.mIsLibLoaded = false;
        this.mNativeContext = 0L;
        loadLibrary();
        this.mUrl = str;
        this.mHttpHeader = map;
        this.mCallback = iTPSubtitleParserCallback;
        this.mOutputType = i17;
    }
}

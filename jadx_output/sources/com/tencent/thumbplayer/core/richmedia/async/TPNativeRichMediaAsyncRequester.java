package com.tencent.thumbplayer.core.richmedia.async;

/* loaded from: classes16.dex */
public class TPNativeRichMediaAsyncRequester implements com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester {
    private static final int REQUEST_ID_NATIVE_EXCEPTION_THROW = -100;
    private long mNativeContext = 0;

    public TPNativeRichMediaAsyncRequester(android.content.Context context) {
        com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(context);
        try {
            if (_nativeSetup() == 0) {
            } else {
                throw new java.lang.UnsupportedOperationException("failed to setup rich media");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to create native rich media:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("failed to create rich media");
        }
    }

    private native void _cancelRequest(int i17);

    private native com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] _getFeatures();

    private native int _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _requestFeatureDataAsyncAtTimeMs(int i17, long j17);

    private native int _requestFeatureDataAsyncAtTimeMsArray(int i17, long[] jArr);

    private native int _requestFeatureDataAsyncAtTimeRange(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange tPNativeTimeRange);

    private native int _requestFeatureDataAsyncAtTimeRanges(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] tPNativeTimeRangeArr);

    private native void _setRequesterListener(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener);

    private native int _setRichMediaSource(java.lang.String str);

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void cancelRequest(int i17) {
        try {
            _cancelRequest(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] getFeatures() {
        try {
            return _getFeatures();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[0];
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void prepareAsync() {
        int i17;
        try {
            i17 = _prepareAsync();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            i17 = com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
        if (i17 == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("prepareAsync, ret=" + i17);
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void release() {
        try {
            _release();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMs(int i17, long j17) {
        try {
            return _requestFeatureDataAsyncAtTimeMs(i17, j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMsArray(int i17, long[] jArr) {
        try {
            return _requestFeatureDataAsyncAtTimeMsArray(i17, jArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRange(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange tPNativeTimeRange) {
        try {
            return _requestFeatureDataAsyncAtTimeRange(i17, tPNativeTimeRange);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRanges(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] tPNativeTimeRangeArr) {
        try {
            return _requestFeatureDataAsyncAtTimeRanges(i17, tPNativeTimeRangeArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return -100;
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void setRequesterListener(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener) {
        try {
            _setRequesterListener(iTPNativeRichMediaAsyncRequesterListener);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester
    public void setRichMediaSource(java.lang.String str) {
        int i17;
        try {
            i17 = _setRichMediaSource(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            i17 = com.tencent.thumbplayer.core.common.TPGeneralError.FAILED;
        }
        if (i17 == 0) {
            return;
        }
        if (i17 == 1000012) {
            throw new java.lang.IllegalArgumentException("setRichMediaSource，invalid argument, url=" + str);
        }
        throw new java.lang.IllegalStateException("setRichMediaSource:" + i17);
    }
}

package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public class TPNativeRichMediaProcessor implements com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor {
    private long mNativeContext = 0;

    public TPNativeRichMediaProcessor(android.content.Context context) {
        com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(context.getApplicationContext());
        try {
            _nativeSetup();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "Failed to create native rich media:" + th6.getMessage());
            throw new java.lang.UnsupportedOperationException("Failed to create rich media");
        }
    }

    private native int _deselectFeatureAsync(int i17);

    private native int _getCurrentPositionMsFeatureData(long j17, int[] iArr, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    private native com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] _getFeatures();

    private native void _nativeSetup();

    private native int _prepareAsync();

    private native void _release();

    private native int _reset();

    private native int _seek(long j17);

    private native int _selectFeatureAsync(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    private native void _setInnerProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    private native int _setPlaybackRate(float f17);

    private native void _setProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    private native int _setRichMediaSource(java.lang.String str);

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void deselectFeatureAsync(int i17) {
        try {
            int _deselectFeatureAsync = _deselectFeatureAsync(i17);
            if (_deselectFeatureAsync == 0) {
                return;
            }
            if (_deselectFeatureAsync == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("deSelectAsync:" + _deselectFeatureAsync);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j17, int[] iArr) {
        com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData = new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData();
        try {
            int _getCurrentPositionMsFeatureData = _getCurrentPositionMsFeatureData(j17, iArr, tPNativeRichMediaFeatureData);
            if (_getCurrentPositionMsFeatureData == 0) {
                return tPNativeRichMediaFeatureData;
            }
            if (_getCurrentPositionMsFeatureData == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("getCurrentTimeContent:" + _getCurrentPositionMsFeatureData);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] getFeatures() {
        try {
            return _getFeatures();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[0];
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void prepareAsync() {
        try {
            int _prepareAsync = _prepareAsync();
            if (_prepareAsync == 0) {
                return;
            }
            throw new java.lang.IllegalStateException("prepareAsync:" + _prepareAsync);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void release() {
        try {
            _release();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void reset() {
        try {
            int _reset = _reset();
            if (_reset == 0) {
                return;
            }
            throw new java.lang.IllegalStateException("reset:" + _reset);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void seek(long j17) {
        try {
            int _seek = _seek(j17);
            if (_seek == 0) {
                return;
            }
            if (_seek == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("seek:" + _seek);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void selectFeatureAsync(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo) {
        try {
            int _selectFeatureAsync = _selectFeatureAsync(i17, tPNativeRichMediaRequestExtraInfo);
            if (_selectFeatureAsync == 0) {
                return;
            }
            if (_selectFeatureAsync == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("selectAsync:" + _selectFeatureAsync);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setInnerProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback) {
        try {
            _setInnerProcessorCallback(iTPNativeRichMediaInnerProcessorCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setPlaybackRate(float f17) {
        try {
            int _setPlaybackRate = _setPlaybackRate(f17);
            if (_setPlaybackRate == 0) {
                return;
            }
            if (_setPlaybackRate == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("setPlaybackRate:" + _setPlaybackRate);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback) {
        try {
            _setProcessorCallback(iTPNativeRichMediaProcessorCallback);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }

    @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor
    public void setRichMediaSource(java.lang.String str) {
        try {
            int _setRichMediaSource = _setRichMediaSource(str);
            if (_setRichMediaSource == 0) {
                return;
            }
            if (_setRichMediaSource == 1000012) {
                throw new java.lang.IllegalArgumentException();
            }
            throw new java.lang.IllegalStateException("setRichMediaSource:" + _setRichMediaSource);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
        }
    }
}

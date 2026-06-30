package com.tencent.thumbplayer.richmedia;

/* loaded from: classes16.dex */
public class TPRichMediaSynchronizer implements com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer {
    private com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaInnerProcessCallback mInnerProcessCallback;
    private com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor mNativeRichMediaProcessor;
    private com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaProcessCallback mProcessCallback;
    private com.tencent.thumbplayer.tplayer.plugins.TPPluginManager mTPPluginManager;

    /* loaded from: classes16.dex */
    public class TPRichMediaInnerProcessCallback implements com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback {
        private com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener mInnerSynchronizerListener;

        public TPRichMediaInnerProcessCallback() {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback
        public long onGetCurrentPositionMs(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener = this.mInnerSynchronizerListener;
            if (iTPRichMediaInnerSynchronizerListener == null) {
                return -1L;
            }
            long onGetCurrentPositionMs = iTPRichMediaInnerSynchronizerListener.onGetCurrentPositionMs(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this);
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(311, (int) onGetCurrentPositionMs, 0, null, null);
            return onGetCurrentPositionMs;
        }

        public void setInnerSynchronizerListener(com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
            this.mInnerSynchronizerListener = iTPRichMediaInnerSynchronizerListener;
        }
    }

    /* loaded from: classes16.dex */
    public class TPRichMediaProcessCallback implements com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback {
        private com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener mSynchronizerListener;

        public TPRichMediaProcessCallback() {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onDeselectFeatureSuccess(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17) {
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(305, i17, 0, null, null);
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onDeselectFeatureSuccess(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17);
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaError(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17) {
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR, i17, 0, null, null);
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaError(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17);
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureData(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureData(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17, new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureFailure(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, int i18) {
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(310, i17, i18, null, null);
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureFailure(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17, i18);
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaInfo(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, long j17, long j18, long j19, java.lang.Object obj) {
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaInfo(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17, j17, j18, j19, obj);
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaPrepared(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(301, 0, 0, null, com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.getFeatures());
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaPrepared(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this);
            }
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onSelectFeatureSuccess(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17) {
            com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this.pushEvent(303, i17, 0, null, null);
            com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.mSynchronizerListener;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onSelectFeatureSuccess(com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.this, i17);
            }
        }

        public void setSynchronizerListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
            this.mSynchronizerListener = iTPRichMediaSynchronizerListener;
        }
    }

    public TPRichMediaSynchronizer(android.content.Context context) {
        this.mNativeRichMediaProcessor = new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaProcessor(context);
        com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaInnerProcessCallback tPRichMediaInnerProcessCallback = new com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaInnerProcessCallback();
        this.mInnerProcessCallback = tPRichMediaInnerProcessCallback;
        this.mNativeRichMediaProcessor.setInnerProcessorCallback(tPRichMediaInnerProcessCallback);
        com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaProcessCallback tPRichMediaProcessCallback = new com.tencent.thumbplayer.richmedia.TPRichMediaSynchronizer.TPRichMediaProcessCallback();
        this.mProcessCallback = tPRichMediaProcessCallback;
        this.mNativeRichMediaProcessor.setProcessorCallback(tPRichMediaProcessCallback);
        com.tencent.thumbplayer.tplayer.plugins.TPPluginManager tPPluginManager = new com.tencent.thumbplayer.tplayer.plugins.TPPluginManager();
        this.mTPPluginManager = tPPluginManager;
        tPPluginManager.addPlugin(new com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        this.mTPPluginManager.onEvent(i17, i18, i19, str, obj);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void deselectFeatureAsync(int i17) {
        this.mNativeRichMediaProcessor.deselectFeatureAsync(i17);
        pushEvent(304, i17, 0, null, null);
    }

    public void finalize() {
        this.mNativeRichMediaProcessor.setInnerProcessorCallback(null);
        this.mNativeRichMediaProcessor.setProcessorCallback(null);
        this.mNativeRichMediaProcessor.release();
        this.mProcessCallback.setSynchronizerListener(null);
        this.mInnerProcessCallback.setInnerSynchronizerListener(null);
        super.finalize();
    }

    @Override // com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer
    public com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData getCurrentPositionMsFeatureData(long j17, int[] iArr) {
        return new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData(this.mNativeRichMediaProcessor.getCurrentPositionMsFeatureData(j17, iArr));
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] getFeatures() {
        com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature tPNativeRichMediaFeature;
        com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] features = this.mNativeRichMediaProcessor.getFeatures();
        if (features == null) {
            return new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[0];
        }
        com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] tPRichMediaFeatureArr = new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[features.length];
        for (int i17 = 0; i17 < features.length && (tPNativeRichMediaFeature = features[i17]) != null; i17++) {
            tPRichMediaFeatureArr[i17] = new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature(tPNativeRichMediaFeature);
        }
        return tPRichMediaFeatureArr;
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void prepareAsync() {
        this.mNativeRichMediaProcessor.prepareAsync();
        pushEvent(300, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void release() {
        this.mNativeRichMediaProcessor.setInnerProcessorCallback(null);
        this.mNativeRichMediaProcessor.setProcessorCallback(null);
        this.mNativeRichMediaProcessor.release();
        this.mProcessCallback.setSynchronizerListener(null);
        this.mInnerProcessCallback.setInnerSynchronizerListener(null);
        pushEvent(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, 0, 0, null, null);
        this.mTPPluginManager.release();
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void reset() {
        this.mNativeRichMediaProcessor.reset();
        pushEvent(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer
    public void seek(long j17) {
        this.mNativeRichMediaProcessor.seek(j17);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void selectFeatureAsync(int i17, com.tencent.thumbplayer.api.richmedia.TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo) {
        com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo = new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo();
        tPNativeRichMediaRequestExtraInfo.setActOnOptional(tPRichMediaRequestExtraInfo.getActOnOption());
        this.mNativeRichMediaProcessor.selectFeatureAsync(i17, tPNativeRichMediaRequestExtraInfo);
        pushEvent(302, i17, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer
    public void setInnerListener(com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener) {
        this.mInnerProcessCallback.setInnerSynchronizerListener(iTPRichMediaInnerSynchronizerListener);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void setListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
        this.mProcessCallback.setSynchronizerListener(iTPRichMediaSynchronizerListener);
    }

    @Override // com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer
    public void setPlaybackRate(float f17) {
        this.mNativeRichMediaProcessor.setPlaybackRate(f17);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void setRichMediaSource(java.lang.String str) {
        this.mNativeRichMediaProcessor.setRichMediaSource(str);
        pushEvent(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL, 0, 0, str, null);
    }
}

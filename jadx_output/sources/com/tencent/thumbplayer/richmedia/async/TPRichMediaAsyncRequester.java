package com.tencent.thumbplayer.richmedia.async;

/* loaded from: classes16.dex */
public class TPRichMediaAsyncRequester implements com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester {
    private static final int INVALID_REQUEST_ID = -1;
    private static final java.lang.String TAG = "TPRichMediaAsyncRequester";
    private final com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester mNativeRichMediaAsyncRequester;

    /* loaded from: classes16.dex */
    public class TPNativeRequestListener implements com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener {
        private final com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequesterListener mRichMediaAsyncRequesterListener;

        public TPNativeRequestListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
            this.mRichMediaAsyncRequesterListener = iTPRichMediaAsyncRequesterListener;
        }

        @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestFailure(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17, int i18, int i19) {
            this.mRichMediaAsyncRequesterListener.onFeatureDataRequestFailure(com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester.this, i17, i18, i19);
        }

        @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestSuccess(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17, int i18, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            this.mRichMediaAsyncRequesterListener.onFeatureDataRequestSuccess(com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester.this, i17, i18, new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
        }

        @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterError(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17) {
            this.mRichMediaAsyncRequesterListener.onRequesterError(com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester.this, i17);
        }

        @Override // com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterPrepared(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester) {
            this.mRichMediaAsyncRequesterListener.onRequesterPrepared(com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester.this);
        }
    }

    public TPRichMediaAsyncRequester(android.content.Context context) {
        this.mNativeRichMediaAsyncRequester = new com.tencent.thumbplayer.core.richmedia.async.TPNativeRichMediaAsyncRequester(context);
    }

    private com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] toNativeTimeRanges(com.tencent.thumbplayer.api.TPTimeRange[] tPTimeRangeArr) {
        if (tPTimeRangeArr == null || tPTimeRangeArr.length == 0) {
            return new com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[0];
        }
        com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] tPNativeTimeRangeArr = new com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[tPTimeRangeArr.length];
        for (int i17 = 0; i17 < tPTimeRangeArr.length; i17++) {
            com.tencent.thumbplayer.api.TPTimeRange tPTimeRange = tPTimeRangeArr[i17];
            if (tPTimeRange == null) {
                return new com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[0];
            }
            tPNativeTimeRangeArr[i17] = new com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs());
        }
        return tPNativeTimeRangeArr;
    }

    private com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] toTPFeatureArray(com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] tPNativeRichMediaFeatureArr) {
        if (tPNativeRichMediaFeatureArr == null || tPNativeRichMediaFeatureArr.length == 0) {
            return new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[0];
        }
        com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] tPRichMediaFeatureArr = new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[tPNativeRichMediaFeatureArr.length];
        for (int i17 = 0; i17 < tPNativeRichMediaFeatureArr.length; i17++) {
            tPRichMediaFeatureArr[i17] = new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature(tPNativeRichMediaFeatureArr[i17]);
        }
        return tPRichMediaFeatureArr;
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public void cancelRequest(int i17) {
        this.mNativeRichMediaAsyncRequester.cancelRequest(i17);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] getFeatures() {
        return toTPFeatureArray(this.mNativeRichMediaAsyncRequester.getFeatures());
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public void prepareAsync() {
        this.mNativeRichMediaAsyncRequester.prepareAsync();
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public void release() {
        this.mNativeRichMediaAsyncRequester.release();
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMs(int i17, long j17) {
        return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeMs(i17, j17);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMsArray(int i17, long[] jArr) {
        return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeMsArray(i17, jArr);
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRange(int i17, com.tencent.thumbplayer.api.TPTimeRange tPTimeRange) {
        if (tPTimeRange != null) {
            return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeRange(i17, new com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs()));
        }
        com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "requestFeatureDataAsyncAtTimeRange, timeRange == null");
        return -1;
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRanges(int i17, com.tencent.thumbplayer.api.TPTimeRange[] tPTimeRangeArr) {
        com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] nativeTimeRanges = toNativeTimeRanges(tPTimeRangeArr);
        if (nativeTimeRanges.length != 0) {
            return this.mNativeRichMediaAsyncRequester.requestFeatureDataAsyncAtTimeRanges(i17, nativeTimeRanges);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "requestFeatureDataAsyncAtTimeRanges, toNativeTimeRanges return empty array");
        return -1;
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public void setRequesterListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
        this.mNativeRichMediaAsyncRequester.setRequesterListener(new com.tencent.thumbplayer.richmedia.async.TPRichMediaAsyncRequester.TPNativeRequestListener(iTPRichMediaAsyncRequesterListener));
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester
    public void setRichMediaSource(java.lang.String str) {
        this.mNativeRichMediaAsyncRequester.setRichMediaSource(str);
    }
}

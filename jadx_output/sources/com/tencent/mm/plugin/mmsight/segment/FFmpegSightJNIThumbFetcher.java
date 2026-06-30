package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class FFmpegSightJNIThumbFetcher implements com.tencent.mm.plugin.mmsight.segment.j {
    private static final java.lang.String TAG = "MicroMsg.FFmpegSightJNIThumbFetcher";
    private int mBufId;
    private int mDurationMs;
    private android.graphics.Bitmap mReusedBitmap;
    private int mScaledHeight;
    private int mScaledWidth;

    /* loaded from: classes10.dex */
    public static class ReleaseRunnable implements java.lang.Runnable {
        int mBufId;
        android.graphics.Bitmap mReusedBitmap;

        @Override // java.lang.Runnable
        public void run() {
            android.graphics.Bitmap bitmap = this.mReusedBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.tencent.mm.memory.u.f68981d.n(this.mReusedBitmap);
            }
            com.tencent.mm.plugin.sight.base.SightVideoJNI.freeObj(this.mBufId);
        }

        private ReleaseRunnable(android.graphics.Bitmap bitmap, int i17) {
            this.mReusedBitmap = bitmap;
            this.mBufId = i17;
        }
    }

    private android.graphics.Point calculateScaledLength(int i17, int i18, int i19, int i27, android.graphics.Point point) {
        if (point == null) {
            throw new java.lang.IllegalArgumentException("FFmpegThumbFetcherImpl : Point to calculateScaledLength can not be null.");
        }
        if (i18 <= 0 && i17 <= 0) {
            point.x = i19;
            point.y = i27;
            return point;
        }
        if (i17 <= 0) {
            point.x = (int) ((i18 / i27) * i19);
            point.y = i18;
            return point;
        }
        if (i18 <= 0) {
            point.x = i17;
            point.y = (int) ((i17 / i19) * i27);
            return point;
        }
        float f17 = i18;
        float f18 = i17;
        float f19 = i27;
        float f27 = i19;
        if (f17 / f18 > f19 / f27) {
            point.x = (int) ((f27 * f17) / f19);
            point.y = i18;
        } else {
            point.x = i17;
            point.y = (int) ((f19 * f18) / f27);
        }
        return point;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getDurationMs() {
        com.tencent.mars.xlog.Log.i(TAG, "getDurationMs() returned: " + this.mDurationMs);
        return this.mDurationMs;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public android.graphics.Bitmap getFrameAtTime(long j17) {
        com.tencent.mars.xlog.Log.i(TAG, "getFrameAtTime() called with: timeMs = [%d], mBufId = [%d]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.mBufId));
        int i17 = this.mDurationMs;
        if (j17 > i17) {
            j17 = i17;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        com.tencent.mars.xlog.Log.i(TAG, "getFrameAtTime() seekStream return %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sight.base.SightVideoJNI.seekStreamWithFlag(((float) j17) / 1000.0f, 1, this.mBufId)));
        android.graphics.Bitmap bitmap = this.mReusedBitmap;
        if (bitmap == null || bitmap.isRecycled() || this.mReusedBitmap.getWidth() != this.mScaledWidth || this.mReusedBitmap.getHeight() != this.mScaledHeight) {
            android.graphics.Bitmap bitmap2 = this.mReusedBitmap;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.tencent.mm.memory.u.f68981d.n(this.mReusedBitmap);
            }
            this.mReusedBitmap = com.tencent.mm.memory.u.f68981d.m(new com.tencent.mm.memory.t(this.mScaledWidth, this.mScaledHeight));
        }
        com.tencent.mars.xlog.Log.i(TAG, "getFrameAtTime() dr return %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sight.base.SightVideoJNI.drawScaledFrame(this.mBufId, this.mReusedBitmap, this.mScaledWidth, this.mScaledHeight)));
        android.graphics.Bitmap bitmap3 = this.mReusedBitmap;
        this.mReusedBitmap = null;
        return bitmap3;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getScaledHeight() {
        com.tencent.mars.xlog.Log.i(TAG, "getScaledHeight() returned: " + this.mScaledHeight);
        return this.mScaledHeight;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getScaledWidth() {
        com.tencent.mars.xlog.Log.i(TAG, "getScaledWidth() returned: " + this.mScaledWidth);
        return this.mScaledWidth;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void init(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i(TAG, "init() called with: path = [" + str + "], segment_interval = [" + i17 + "], width = [" + i18 + "], height = [" + i19 + "]");
        int openFileVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.openFileVFS(str, 1, 16, false);
        this.mBufId = openFileVFS;
        if (openFileVFS < 0) {
            throw new com.tencent.mm.plugin.mmsight.segment.m1("open file error.");
        }
        int videoWidth = com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoWidth(openFileVFS);
        int videoHeight = com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoHeight(this.mBufId);
        this.mDurationMs = (int) (com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoDuration(this.mBufId) * 1000.0d);
        android.graphics.Point calculateScaledLength = calculateScaledLength(i18, i19, videoWidth, videoHeight, new android.graphics.Point());
        int i27 = calculateScaledLength.x;
        this.mScaledWidth = i27;
        this.mScaledHeight = calculateScaledLength.y;
        com.tencent.mars.xlog.Log.i(TAG, "FFmpegSightJNIThumbFetcher.init. scaled size is (%d, %d); raw size is (%d, %d)", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.mScaledHeight), java.lang.Integer.valueOf(videoWidth), java.lang.Integer.valueOf(videoHeight));
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void release() {
        com.tencent.mars.xlog.Log.i(TAG, "release() called");
        s75.d.b(new com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher.ReleaseRunnable(this.mReusedBitmap, this.mBufId), "release");
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void reuseBitmap(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(TAG, "reuseBitmap() called with: bitmap = [" + bitmap + "]");
        if (bitmap == null) {
            return;
        }
        this.mReusedBitmap = bitmap;
    }
}

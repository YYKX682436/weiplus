package com.tencent.thumbplayer.tmediacodec.pools;

/* loaded from: classes14.dex */
public final class CodecWrapperManager implements com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation {
    public static final java.lang.String TAG = "CodecWrapperManager";
    private final com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool mKeepCodecPool;
    private final com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool mRunningCodecPool;

    public CodecWrapperManager() {
        com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool codecWrapperPool = new com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool(2, "keep");
        this.mKeepCodecPool = codecWrapperPool;
        this.mRunningCodecPool = new com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool(Integer.MAX_VALUE, "running");
        codecWrapperPool.setActionCallback(new com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback() { // from class: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager.2
            @Override // com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback
            public void onErase(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
                if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager.TAG, "onErase codecWrapper:" + reuseCodecWrapper);
                }
                reuseCodecWrapper.recycle();
            }
        });
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation
    public void clearAndReleaseAll() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "clearAndReleaseAll");
        }
        this.mRunningCodecPool.clear();
        this.mKeepCodecPool.clear();
    }

    public void clearAndReleaseKeepPool() {
        this.mKeepCodecPool.clear();
    }

    public final java.lang.String getDumpInfo() {
        return "runningPool:" + this.mRunningCodecPool + " keepPool:" + this.mKeepCodecPool;
    }

    public boolean isKeepPoolFull() {
        return this.mKeepCodecPool.isFull();
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation
    public com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper obtainCodecWrapper(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper obtain = this.mKeepCodecPool.obtain(formatWrapper);
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "obtainCodecWrapper codecWrapper:" + obtain);
        }
        return obtain;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation
    public void removeFromRunning(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "removeFromRunning codecWrapper:" + reuseCodecWrapper);
        }
        this.mRunningCodecPool.remove(reuseCodecWrapper);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation
    public void transToKeep(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "transTokeep codecWrapper:" + reuseCodecWrapper);
        }
        this.mRunningCodecPool.remove(reuseCodecWrapper);
        this.mKeepCodecPool.put(reuseCodecWrapper);
        com.tencent.thumbplayer.tmediacodec.callback.CodecCallback callback = reuseCodecWrapper.getCallback();
        if (callback != null) {
            callback.onTransToKeepPool();
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperTransformation
    public void transToRunning(final com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "transToRunning codecWrapper:" + reuseCodecWrapper);
        }
        this.mKeepCodecPool.remove(reuseCodecWrapper);
        this.mRunningCodecPool.put(reuseCodecWrapper);
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.postOnSubThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.thumbplayer.tmediacodec.callback.CodecCallback callback = reuseCodecWrapper.getCallback();
                if (callback != null) {
                    callback.onTransToRunningPool();
                }
            }
        });
    }
}

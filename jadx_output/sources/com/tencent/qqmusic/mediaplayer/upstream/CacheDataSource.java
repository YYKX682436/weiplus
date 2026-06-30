package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class CacheDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource, com.tencent.qqmusic.mediaplayer.perf.Collectable {
    private static final int CHUNK_LOAD_BUFFER_SIZE = 8192;
    private static final int DISCONTINUITY_THRESHOLD = 8192;
    static final long NO_RESET_PENDING = Long.MIN_VALUE;
    private static final int PROFILE_ending = 10;
    private static final int PROFILE_isCached = 8;
    private static final int PROFILE_lock = 5;
    private static final int PROFILE_onBufferEnd = 7;
    private static final int PROFILE_onBufferStarted = 4;
    private static final int PROFILE_onBytesTransferred = 9;
    private static final int PROFILE_onBytesTransferring = 3;
    private static final int PROFILE_onReadContinuity = 1;
    private static final int PROFILE_onReadDiscontinuity = 2;
    private static final int PROFILE_readAt = 6;
    private static final int PROFILE_total = 0;
    private static final int READ_WAIT_TIMEOUT = 30000;
    private static final java.lang.String TAG = "CacheDataSource";
    private static final java.lang.String[] profiles = {"total", "onReadContinuity", "onReadDiscontinuity", "onBytesTransferring", "onBufferStarted", "lock", "readAt", "onBufferEnd", "isCached", "onBytesTransferred", "ending"};
    protected final com.tencent.qqmusic.mediaplayer.upstream.IDataSource cacheSource;
    private final com.tencent.qqmusic.mediaplayer.DataRangeTracker cachedDataTracker;
    private long[] costs;
    private long currentLoadStartPosition;
    private com.tencent.qqmusic.mediaplayer.upstream.Chunk currentLoadingChunk;
    private volatile boolean isToReleaseLock;
    private volatile boolean isWaitingForFirstPiece;
    private com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener;
    private boolean loadFinished;
    private final com.tencent.qqmusic.mediaplayer.upstream.Loader loader;
    private com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.LoaderListener loaderListener;
    private long nextContinuousPosition;
    private boolean opened;
    protected long pendingRestartPositionByte;
    protected long pendingStartPositionByte;
    private java.util.TimerTask pendingTask;
    private java.util.Timer restartHandler;

    /* loaded from: classes13.dex */
    public interface Listener extends com.tencent.qqmusic.mediaplayer.upstream.TransferListener {
        void onBufferEnded();

        void onBufferStarted(long j17);

        long onStreamingError(java.io.IOException iOException);

        void onStreamingFinished();

        void onUpStreamTransfer(long j17, long j18);
    }

    /* loaded from: classes13.dex */
    public class LoaderListener implements com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener {
        private long loadedPosition;

        private LoaderListener() {
            this.loadedPosition = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING;
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public synchronized void onLoadCancelled(boolean z17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.TAG, "[onLoadCancelled] enter. terminated: " + z17);
            if (z17) {
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
            } else {
                try {
                    if (!com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.startLoadingIfNeeded()) {
                        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
                    }
                } catch (java.lang.IllegalStateException e17) {
                    onLoadError(new java.io.IOException("failed to start load after cancelling", e17));
                    com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
                }
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadCompleted() {
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadStartPosition = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadingChunk = null;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.loadFinished = true;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
            if (com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.listener != null) {
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.listener.onStreamingFinished();
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadError(java.io.IOException iOException) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.TAG, "[onLoadError] enter.", iOException);
            long j17 = this.loadedPosition;
            long j18 = j17 == com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING ? 0L : j17;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource cacheDataSource = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this;
            cacheDataSource.pendingRestartPositionByte = j17;
            if (cacheDataSource.listener == null) {
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadStartPosition = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING;
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadingChunk = null;
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
                return;
            }
            long onStreamingError = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.listener.onStreamingError(iOException);
            if (onStreamingError >= 0) {
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.scheduleRestart(j18, onStreamingError);
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.pendingRestartPositionByte = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING;
            } else {
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadStartPosition = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.NO_RESET_PENDING;
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.currentLoadingChunk = null;
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.abandonLock();
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
        public void onLoadProgress(long j17, long j18) {
            this.loadedPosition = j18;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.addRange(j17, j18, com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.isWaitingForFirstPiece);
            com.tencent.qqmusic.mediaplayer.upstream.Loader loader = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.loader;
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener = com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.listener;
            if (listener == null || loader == null) {
                return;
            }
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.cachedDataTracker.setFileTotalSize(loader.getUpstreamSize(), true);
            listener.onUpStreamTransfer(j18, loader.getUpstreamSize());
        }
    }

    public CacheDataSource(final com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource2, final com.tencent.qqmusic.mediaplayer.downstream.IDataSink iDataSink, final android.os.Looper looper) {
        this(iDataSource2, new com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.1
            @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory
            public com.tencent.qqmusic.mediaplayer.upstream.Loader createLoader(com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener listener) {
                return new com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader(looper, new com.tencent.qqmusic.mediaplayer.upstream.DummyUriLoader(null), listener) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.1.1
                    @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                    public com.tencent.qqmusic.mediaplayer.downstream.IDataSink createCacheSink(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest) {
                        return iDataSink;
                    }

                    @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                    public com.tencent.qqmusic.mediaplayer.upstream.IDataSource createUpStream(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest) {
                        return iDataSource;
                    }
                };
            }
        });
    }

    private void clearState() {
        this.loadFinished = false;
    }

    private boolean isCached(long j17, int i17) {
        long upstreamSize = this.loader.getUpstreamSize();
        if (upstreamSize > 0 && i17 + j17 > upstreamSize - 1 && (i17 = (int) ((upstreamSize - j17) - 1)) < 0) {
            j17 += i17;
            i17 = 0;
        }
        return this.cachedDataTracker.isCached(j17, i17);
    }

    private void onReadContinuity(long j17) {
    }

    private void onReadDiscontinuity(long j17, boolean z17) {
        long max;
        long j18 = this.currentLoadStartPosition;
        if (j17 == j18) {
            return;
        }
        long j19 = j17 - j18;
        if (j19 < 0 || j19 >= 8192) {
            synchronized (this.cachedDataTracker) {
                max = java.lang.Math.max(j17, this.cachedDataTracker.findStart(j17));
            }
            long j27 = this.currentLoadStartPosition;
            if (j27 == max) {
                return;
            }
            long j28 = max - j27;
            if ((j28 < 0 || j28 >= 8192) && max != getSize()) {
                com.tencent.qqmusic.mediaplayer.upstream.Chunk chunk = this.currentLoadingChunk;
                if (z17 && chunk != null && chunk.contains(max)) {
                    return;
                }
                restartLoading(max);
            }
        }
    }

    private void reportProfiling() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void restartLoading(long j17) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[restartLoading] from: " + j17);
        this.pendingStartPositionByte = j17;
        this.loadFinished = false;
        if (this.loader.isLoading()) {
            this.cachedDataTracker.block();
            this.loader.cancelLoading();
        } else {
            clearState();
            startLoadingIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void scheduleRestart(final long j17, long j18) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, java.lang.String.format("[scheduleRestart] position: %d, delay: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        if (this.restartHandler == null) {
            this.restartHandler = new java.util.Timer("CacheDataSource.Restart");
        }
        java.util.TimerTask timerTask = this.pendingTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.restartHandler.purge();
        }
        java.util.TimerTask timerTask2 = new java.util.TimerTask() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.TAG, "[scheduleRestart] restart loading from position: " + j17);
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.restartLoading(j17);
            }
        };
        this.pendingTask = timerTask2;
        this.restartHandler.schedule(timerTask2, j18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean startLoadingIfNeeded() {
        com.tencent.qqmusic.mediaplayer.upstream.Chunk chunk;
        if (this.loadFinished) {
            return false;
        }
        long j17 = this.pendingStartPositionByte;
        this.pendingStartPositionByte = NO_RESET_PENDING;
        if (this.opened) {
            if (j17 == NO_RESET_PENDING) {
                throw new java.lang.IllegalStateException("pendingStartPositionByte must be set!");
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[startLoadingIfNeeded] restart a pending load: " + j17);
            chunk = new com.tencent.qqmusic.mediaplayer.upstream.Chunk(8192, j17, -1L);
        } else if (j17 == NO_RESET_PENDING) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[startLoadingIfNeeded] start a fresh load");
            chunk = new com.tencent.qqmusic.mediaplayer.upstream.Chunk(8192, 0L, -1L);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[startLoadingIfNeeded] start a pending load: " + j17);
            chunk = new com.tencent.qqmusic.mediaplayer.upstream.Chunk(8192, j17, -1L);
        }
        this.currentLoadingChunk = chunk;
        this.currentLoadStartPosition = chunk.start;
        this.cachedDataTracker.unblock();
        this.loader.startLoading(chunk);
        return true;
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(com.tencent.qqmusic.mediaplayer.perf.ErrorUploadCollector errorUploadCollector) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[close] enter.");
        if (!this.opened) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[close] not opened. return");
            return;
        }
        this.cachedDataTracker.abandonLock();
        try {
            this.loader.shutdown();
        } catch (java.lang.InterruptedException unused) {
        }
        this.cacheSource.close();
        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener = this.listener;
        if (listener != null) {
            listener.onTransferEnd();
        }
        reportProfiling();
        this.opened = false;
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[close] exit");
    }

    public synchronized boolean continueLoadIfNeeded() {
        if (!this.opened) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "[continueLoadIfNeeded] not opened!");
            return false;
        }
        long j17 = this.pendingRestartPositionByte;
        if (j17 == NO_RESET_PENDING) {
            return false;
        }
        if (this.loadFinished) {
            return false;
        }
        this.pendingRestartPositionByte = NO_RESET_PENDING;
        scheduleRestart(j17, 0L);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[continueLoadIfNeeded] schedule restart from: " + j17);
        return true;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector.getAudioFormat((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) this, false);
    }

    public long getBufferTimeout(long j17, int i17) {
        return 30000L;
    }

    public com.tencent.qqmusic.mediaplayer.upstream.Loader getLoader() {
        return this.loader;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        com.tencent.qqmusic.mediaplayer.upstream.Loader loader = this.loader;
        if (loader != null) {
            return loader.getUpstreamSize();
        }
        return 0L;
    }

    public void initDataSourceSize(long j17, long j18) {
        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.LoaderListener loaderListener = this.loaderListener;
        if (loaderListener != null) {
            loaderListener.onLoadProgress(j17, j18);
        }
    }

    public boolean isCacheFileComplete() {
        long continuousStart = this.cachedDataTracker.getContinuousStart();
        long continuousEnd = this.cachedDataTracker.getContinuousEnd();
        return continuousEnd != -1 && continuousEnd == this.loader.getUpstreamSize() - 1 && continuousStart == 0;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[open] enter.");
        if (this.opened) {
            return;
        }
        this.nextContinuousPosition = 0L;
        this.pendingRestartPositionByte = NO_RESET_PENDING;
        this.cacheSource.open();
        this.loader.prepare();
        startLoadingIfNeeded();
        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener = this.listener;
        if (listener != null) {
            listener.onTransferStart();
        }
        this.opened = true;
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[open] opened = true;");
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[open] exit");
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        java.lang.String str;
        try {
            try {
                if (!this.opened) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt] not opened!");
                    this.cachedDataTracker.abandonLock();
                    throw new java.io.IOException("[readAt] not opened!");
                }
                if (j17 < 0) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt] invalid position: " + j17);
                    throw new java.io.IOException("invalid position: " + j17);
                }
                boolean isCached = isCached(j17, i18);
                if (j17 == this.nextContinuousPosition) {
                    onReadContinuity(j17);
                } else {
                    onReadDiscontinuity(j17, isCached);
                }
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener = this.listener;
                if (listener != null) {
                    listener.onBytesTransferring(j17, i18);
                }
                int readAt = isCached ? this.cacheSource.readAt(j17, bArr, i17, i18) : -1;
                if (readAt < 0) {
                    if (this.loader.isLoading()) {
                        str = "[readAt] error occurred: ";
                        com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "[readAt] load has started, lock util data has been downloaded : " + j17 + ", size: " + i18 + ", read: " + readAt);
                        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener2 = this.listener;
                        if (listener2 != null) {
                            listener2.onBufferStarted(j17);
                        }
                        try {
                            this.cachedDataTracker.lock(j17, i18, getBufferTimeout(j17, i18), new com.tencent.qqmusic.mediaplayer.DataRangeTracker.LockJudgerCallback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.2
                                @Override // com.tencent.qqmusic.mediaplayer.DataRangeTracker.LockJudgerCallback
                                public boolean isToAbandonLock() {
                                    return com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.this.isToReleaseLock;
                                }
                            });
                            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener3 = this.listener;
                            if (listener3 != null) {
                                listener3.onBufferEnded();
                            }
                            readAt = this.cacheSource.readAt(j17, bArr, i17, i18);
                        } catch (java.lang.InterruptedException e17) {
                            throw new java.io.IOException("interrupted!", e17);
                        }
                    } else {
                        readAt = this.cacheSource.readAt(j17, bArr, i17, i18);
                        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt] load not started: " + j17 + ", size: " + i18 + ", read: " + readAt);
                    }
                }
                int i19 = readAt;
                if (i19 > 0) {
                    this.nextContinuousPosition = i19 + j17;
                } else if (i19 < 0) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt]: read error! read < 0， read = " + i19);
                    r2 = true;
                } else {
                    r2 = i18 != 0;
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[readAt]: read error! read = 0, hasError = " + r2);
                }
                com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener4 = this.listener;
                if (listener4 != null) {
                    if (r2) {
                        listener4.onBytesTransferError(j17, i18, i19);
                    } else {
                        listener4.onBytesTransferred(j17, i19);
                    }
                }
                return i19;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, str + j17, th);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str = "[readAt] error occurred: ";
        }
    }

    public void releaseLock() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[releaseLock]");
        this.isToReleaseLock = true;
    }

    public void setFileTotalSize(long j17) {
        this.cachedDataTracker.setFileTotalSize(j17, false);
    }

    public void setListener(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener listener) {
        this.listener = listener;
    }

    public boolean waitForFirstPiece(int i17, long j17) {
        this.isWaitingForFirstPiece = true;
        boolean lock = this.cachedDataTracker.lock(0L, i17, j17, null);
        this.isWaitingForFirstPiece = false;
        return lock;
    }

    public CacheDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory factory) {
        this.currentLoadStartPosition = NO_RESET_PENDING;
        this.loaderListener = null;
        this.isWaitingForFirstPiece = false;
        this.costs = new long[profiles.length];
        this.isToReleaseLock = false;
        this.cacheSource = iDataSource;
        this.cachedDataTracker = new com.tencent.qqmusic.mediaplayer.DataRangeTracker();
        this.opened = false;
        this.loadFinished = false;
        com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.LoaderListener loaderListener = new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.LoaderListener();
        this.loaderListener = loaderListener;
        this.loader = factory.createLoader(loaderListener);
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector playerInfoCollector) {
        int i17 = 1;
        long j17 = 0;
        for (int i18 = 1; i18 < profiles.length; i18++) {
            j17 += this.costs[i18];
        }
        long[] jArr = this.costs;
        double length = (jArr[0] - j17) / jArr.length;
        int length2 = jArr.length;
        long[] jArr2 = new long[length2];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        for (int i19 = 1; i19 < length2; i19++) {
            jArr2[i19] = java.lang.Math.max(jArr2[i19] - ((long) length), 0L);
        }
        while (true) {
            java.lang.String[] strArr = profiles;
            if (i17 >= strArr.length) {
                return;
            }
            playerInfoCollector.putLong("CacheDataSource." + strArr[i17], jArr2[i17] / 1000000);
            i17++;
        }
    }

    /* loaded from: classes13.dex */
    public static class Factory {
        private static com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory createDefaultLoaderFactory(final java.io.File file, final com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader) {
            return new com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.2
                @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory
                public com.tencent.qqmusic.mediaplayer.upstream.Loader createLoader(com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener listener) {
                    return new com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader(android.os.Looper.getMainLooper(), com.tencent.qqmusic.mediaplayer.upstream.UriLoader.this, listener) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.2.1
                        @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                        public com.tencent.qqmusic.mediaplayer.downstream.IDataSink createCacheSink(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest) {
                            return new com.tencent.qqmusic.mediaplayer.downstream.FileDataSink(file.getAbsolutePath());
                        }

                        @Override // com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader
                        public com.tencent.qqmusic.mediaplayer.upstream.IDataSource createUpStream(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest) {
                            return new com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource(streamingRequest.uri, streamingRequest.headers, new com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService());
                        }
                    };
                }
            };
        }

        public static com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource createFromLoader(java.io.File file, com.tencent.qqmusic.mediaplayer.upstream.Loader.Factory factory) {
            return new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(file.getAbsolutePath()), factory);
        }

        public static com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource createFromUri(java.io.File file, android.net.Uri uri) {
            return createFromUriLoader(file, new com.tencent.qqmusic.mediaplayer.upstream.DummyUriLoader(uri));
        }

        public static com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource createFromUriLoader(com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader, java.lang.String str) {
            final java.io.File createTempFile;
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp", new java.io.File(str));
                        ensureFile(createTempFile);
                        return new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(createTempFile.getAbsolutePath()) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.1
                            @Override // com.tencent.qqmusic.mediaplayer.upstream.FileDataSource, java.io.Closeable, java.lang.AutoCloseable
                            public void close() {
                                try {
                                    super.close();
                                } catch (java.io.IOException unused) {
                                }
                                if (createTempFile.delete()) {
                                    return;
                                }
                                com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.TAG, "failed to delete buffer file: " + createTempFile);
                            }
                        }, createDefaultLoaderFactory(createTempFile, uriLoader));
                    }
                } catch (java.io.IOException e17) {
                    throw new com.tencent.qqmusic.mediaplayer.upstream.DataSourceException(-8, "failed to ensure buffer file!", e17);
                }
            }
            createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp");
            ensureFile(createTempFile);
            return new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(createTempFile.getAbsolutePath()) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.1
                @Override // com.tencent.qqmusic.mediaplayer.upstream.FileDataSource, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    try {
                        super.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (createTempFile.delete()) {
                        return;
                    }
                    com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.TAG, "failed to delete buffer file: " + createTempFile);
                }
            }, createDefaultLoaderFactory(createTempFile, uriLoader));
        }

        private static void ensureFile(java.io.File file) {
            file.delete();
            if (!file.createNewFile()) {
                throw new java.io.IOException("failed to create file!");
            }
        }

        public static com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource createFromUriLoader(java.io.File file, com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader) {
            return new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(file.getAbsolutePath()), createDefaultLoaderFactory(file, uriLoader));
        }
    }
}

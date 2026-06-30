package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public abstract class DefaultLoader extends java.lang.Thread implements com.tencent.qqmusic.mediaplayer.upstream.Loader {
    private static final int MSG_LOAD_CANCELLED = 5;
    private static final int MSG_LOAD_COMPLETED = 3;
    private static final int MSG_LOAD_ERROR = 4;
    private static final int MSG_LOAD_PROGRESS = 2;
    private static final int MSG_LOAD_STARTED = 1;
    private static final int SIZE_UNSET = -1;
    private static final java.lang.String TAG = "DefaultLoader";
    private com.tencent.qqmusic.mediaplayer.downstream.IDataSink cacheSink;
    private final android.os.Handler eventHandler;
    private volatile boolean shutdown;
    private com.tencent.qqmusic.mediaplayer.upstream.IDataSource upstream;
    private final com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader;
    private final com.tencent.qqmusic.mediaplayer.upstream.Chunk END_OF_QUEUE = new com.tencent.qqmusic.mediaplayer.upstream.Chunk(0, 0, 0);
    private volatile boolean isLoading = false;
    private volatile boolean cancelled = false;
    private long upstreamSize = -1;
    private final java.util.concurrent.BlockingQueue<com.tencent.qqmusic.mediaplayer.upstream.Chunk> chunks = new java.util.concurrent.LinkedBlockingQueue(1);

    public DefaultLoader(android.os.Looper looper, com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader, final com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener listener) {
        this.uriLoader = uriLoader;
        this.eventHandler = new android.os.Handler(looper, new android.os.Handler.Callback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener listener2 = listener;
                if (listener2 == null) {
                    return false;
                }
                if (message.what == 2) {
                    listener2.onLoadProgress(message.arg1, message.arg2);
                    return true;
                }
                com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.isLoading = false;
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.TAG, "[handleMessage] loading = false");
                int i17 = message.what;
                if (i17 == 3) {
                    listener.onLoadCompleted();
                    return true;
                }
                if (i17 == 4) {
                    listener.onLoadError((java.io.IOException) message.obj);
                    return true;
                }
                if (i17 != 5) {
                    return false;
                }
                listener.onLoadCancelled(com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.shutdown);
                return true;
            }
        });
    }

    private boolean loadChunk(com.tencent.qqmusic.mediaplayer.upstream.Chunk chunk) {
        if (this.upstream == null || this.cacheSink == null) {
            throw new java.lang.IllegalStateException("loader must be prepared first!");
        }
        long j17 = chunk.start;
        long j18 = chunk.size;
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "[loadChunk] enter. startPosition: " + j17 + ", chunkSize: " + j18);
        int i17 = chunk.bufferSize;
        byte[] bArr = new byte[i17];
        boolean z17 = j18 == -1;
        if (!z17) {
            i17 = (int) java.lang.Math.min(i17, j18);
        }
        long j19 = 0;
        boolean z18 = false;
        while (true) {
            long j27 = j17 + j19;
            try {
                int readAt = this.upstream.readAt(j27, bArr, 0, i17);
                if (readAt == -1) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[loadChunk] read EOF.");
                    break;
                }
                if (readAt == 0) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "[loadChunk] read none.");
                    break;
                }
                if (readAt < 0) {
                    throw new java.io.IOException(new com.tencent.qqmusic.mediaplayer.upstream.SourceReadException("read error: " + readAt, ""));
                }
                try {
                    j19 += readAt;
                    this.eventHandler.removeMessages(2);
                    this.eventHandler.obtainMessage(2, (int) j17, (int) ((j27 + this.cacheSink.write(j27, bArr, 0, readAt)) - 1)).sendToTarget();
                    z18 = this.cancelled || this.shutdown;
                    if (z18 || (!z17 && j19 >= j18)) {
                        break;
                    }
                } catch (java.io.IOException e17) {
                    throw new java.io.IOException(new com.tencent.qqmusic.mediaplayer.upstream.SinkWriteException(e17));
                }
            } catch (java.io.IOException e18) {
                throw new java.io.IOException(new com.tencent.qqmusic.mediaplayer.upstream.SourceReadException(e18, ""));
            }
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "[loadChunk] exit. startPosition: " + j17 + ", loadedBytes: " + j19 + ", this.cancelled: " + this.cancelled + ", shutdown: " + this.shutdown);
        return !z18;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void cancelLoading() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[cancelLoading] cancel");
        this.uriLoader.cancelLoading();
        this.cancelled = true;
    }

    public abstract com.tencent.qqmusic.mediaplayer.downstream.IDataSink createCacheSink(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest);

    public abstract com.tencent.qqmusic.mediaplayer.upstream.IDataSource createUpStream(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest);

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public long getUpstreamSize() {
        return this.upstreamSize;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public boolean isLoading() {
        if (this.uriLoader.isLoading()) {
            return true;
        }
        return this.isLoading && !this.shutdown;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void prepare() {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.upstream;
        if (iDataSource != null) {
            iDataSource.close();
        }
        com.tencent.qqmusic.mediaplayer.downstream.IDataSink iDataSink = this.cacheSink;
        if (iDataSink != null) {
            iDataSink.close();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            if (this.shutdown) {
                break;
            }
            try {
                com.tencent.qqmusic.mediaplayer.upstream.Chunk take = this.chunks.take();
                if (this.END_OF_QUEUE == take) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[run] end of queue!");
                    break;
                }
                try {
                    if (loadChunk(take)) {
                        this.eventHandler.obtainMessage(3).sendToTarget();
                    } else {
                        this.eventHandler.obtainMessage(5).sendToTarget();
                    }
                } catch (java.io.IOException e17) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[run] got error!", e17);
                    this.eventHandler.obtainMessage(4, e17).sendToTarget();
                }
            } catch (java.lang.InterruptedException unused) {
                com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "[run] interrupted when taking chunk");
            }
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[run] exit. this.cancelled: " + this.cancelled + ", shutdown: " + this.shutdown);
        try {
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.upstream;
            if (iDataSource != null) {
                iDataSource.close();
            }
        } catch (java.io.IOException unused2) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "[shutdown] failed to close upstream");
        }
        try {
            com.tencent.qqmusic.mediaplayer.downstream.IDataSink iDataSink = this.cacheSink;
            if (iDataSink != null) {
                iDataSink.close();
            }
        } catch (java.io.IOException unused3) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "[shutdown] failed to close cacheSink");
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void shutdown() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[shutdown] enter");
        this.shutdown = true;
        this.chunks.offer(this.END_OF_QUEUE);
        cancelLoading();
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[shutdown] exit");
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.Loader
    public void startLoading(com.tencent.qqmusic.mediaplayer.upstream.Chunk chunk) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[startLoading] chunk: " + chunk);
        this.chunks.clear();
        if (!this.chunks.offer(chunk)) {
            throw new java.lang.IllegalStateException("exceeds maximum of queue!");
        }
        this.isLoading = true;
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[handleMessage] loading = true");
        this.cancelled = false;
        if (getState() == java.lang.Thread.State.NEW) {
            this.uriLoader.startLoading(0, java.util.concurrent.TimeUnit.MILLISECONDS, new com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.2
                @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
                public void onCancelled() {
                    com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.eventHandler.obtainMessage(5).sendToTarget();
                }

                @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
                public void onFailed(java.lang.Throwable th6) {
                    com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.eventHandler.obtainMessage(4, new java.io.IOException("failed to load uri", th6)).sendToTarget();
                }

                @Override // com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
                public void onSucceed(com.tencent.qqmusic.mediaplayer.upstream.StreamingRequest streamingRequest) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.TAG, "[startLoading] uriLoader.startLoading onSucceed");
                    com.tencent.qqmusic.mediaplayer.upstream.IDataSource createUpStream = com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.createUpStream(streamingRequest);
                    try {
                        createUpStream.open();
                        com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.upstreamSize = createUpStream.getSize();
                    } catch (java.io.IOException e17) {
                        com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.eventHandler.obtainMessage(4, e17).sendToTarget();
                    }
                    com.tencent.qqmusic.mediaplayer.downstream.IDataSink createCacheSink = com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.createCacheSink(streamingRequest);
                    try {
                        createCacheSink.open();
                    } catch (java.io.IOException e18) {
                        com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.eventHandler.obtainMessage(4, e18).sendToTarget();
                    }
                    com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.cacheSink = createCacheSink;
                    com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.upstream = createUpStream;
                    com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.this.start();
                }
            });
        }
    }
}

package org.chromium.net.impl;

/* loaded from: classes16.dex */
public abstract class JavaUploadDataSinkBase extends org.chromium.net.UploadDataSink {
    public static final int DEFAULT_UPLOAD_BUFFER_SIZE = 8192;
    private java.nio.ByteBuffer mBuffer;
    private final java.util.concurrent.Executor mExecutor;
    private final java.util.concurrent.atomic.AtomicInteger mSinkState = new java.util.concurrent.atomic.AtomicInteger(3);
    private long mTotalBytes;
    private final org.chromium.net.UploadDataProvider mUploadProvider;
    private final java.util.concurrent.Executor mUserUploadExecutor;
    private long mWrittenBytes;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SinkState {
        public static final int AWAITING_READ_RESULT = 0;
        public static final int AWAITING_REWIND_RESULT = 1;
        public static final int NOT_STARTED = 3;
        public static final int UPLOADING = 2;
    }

    public JavaUploadDataSinkBase(final java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.mUserUploadExecutor = new java.util.concurrent.Executor() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.1
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (java.util.concurrent.RejectedExecutionException e17) {
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.processUploadError(e17);
                }
            }
        };
        this.mExecutor = executor2;
        this.mUploadProvider = uploadDataProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnUploadExecutor(org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        try {
            this.mUserUploadExecutor.execute(getUploadErrorSettingRunnable(checkedRunnable));
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            processUploadError(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRead() {
        this.mExecutor.execute(getErrorSettingRunnable(new org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.3
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public void run() {
                org.chromium.net.impl.JavaUploadDataSinkBase.this.initializeRead();
                org.chromium.net.impl.JavaUploadDataSinkBase.this.mSinkState.set(0);
                org.chromium.net.impl.JavaUploadDataSinkBase.this.executeOnUploadExecutor(new org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.3.1
                    @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                    public void run() {
                        org.chromium.net.UploadDataProvider uploadDataProvider = org.chromium.net.impl.JavaUploadDataSinkBase.this.mUploadProvider;
                        org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                        uploadDataProvider.read(javaUploadDataSinkBase, javaUploadDataSinkBase.mBuffer);
                    }
                });
            }
        }));
    }

    public abstract void finish();

    public abstract java.lang.Runnable getErrorSettingRunnable(org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    public abstract java.lang.Runnable getUploadErrorSettingRunnable(org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    public abstract void initializeRead();

    public abstract void initializeStart(long j17);

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(java.lang.Exception exc) {
        processUploadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadSucceeded(final boolean z17) {
        if (this.mSinkState.compareAndSet(0, 2)) {
            this.mExecutor.execute(getErrorSettingRunnable(new org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.2
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public void run() {
                    if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes != -1 && org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes - org.chromium.net.impl.JavaUploadDataSinkBase.this.mWrittenBytes < org.chromium.net.impl.JavaUploadDataSinkBase.this.mBuffer.remaining()) {
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.processUploadError(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(org.chromium.net.impl.JavaUploadDataSinkBase.this.mWrittenBytes + org.chromium.net.impl.JavaUploadDataSinkBase.this.mBuffer.remaining()), java.lang.Long.valueOf(org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes))));
                        return;
                    }
                    org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                    long j17 = javaUploadDataSinkBase.mWrittenBytes;
                    org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase2 = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                    javaUploadDataSinkBase.mWrittenBytes = j17 + javaUploadDataSinkBase2.processSuccessfulRead(javaUploadDataSinkBase2.mBuffer);
                    if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mWrittenBytes < org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes || (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes == -1 && !z17)) {
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.mSinkState.set(0);
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.executeOnUploadExecutor(new org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.2.1
                            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                            public void run() {
                                org.chromium.net.UploadDataProvider uploadDataProvider = org.chromium.net.impl.JavaUploadDataSinkBase.this.mUploadProvider;
                                org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase3 = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                                uploadDataProvider.read(javaUploadDataSinkBase3, javaUploadDataSinkBase3.mBuffer);
                            }
                        });
                    } else if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes == -1) {
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.finish();
                    } else if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes == org.chromium.net.impl.JavaUploadDataSinkBase.this.mWrittenBytes) {
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.finish();
                    } else {
                        org.chromium.net.impl.JavaUploadDataSinkBase.this.processUploadError(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(org.chromium.net.impl.JavaUploadDataSinkBase.this.mWrittenBytes), java.lang.Long.valueOf(org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes))));
                    }
                }
            }));
            return;
        }
        throw new java.lang.IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.mSinkState.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(java.lang.Exception exc) {
        processUploadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        if (this.mSinkState.compareAndSet(1, 2)) {
            startRead();
            return;
        }
        throw new java.lang.IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.mSinkState.get());
    }

    public abstract int processSuccessfulRead(java.nio.ByteBuffer byteBuffer);

    public abstract void processUploadError(java.lang.Throwable th6);

    public void start(final boolean z17) {
        executeOnUploadExecutor(new org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.4
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public void run() {
                org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                javaUploadDataSinkBase.mTotalBytes = javaUploadDataSinkBase.mUploadProvider.getLength();
                if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes == 0) {
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.finish();
                    return;
                }
                if (org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes <= 0 || org.chromium.net.impl.JavaUploadDataSinkBase.this.mTotalBytes >= 8192) {
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.mBuffer = java.nio.ByteBuffer.allocateDirect(8192);
                } else {
                    org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase2 = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                    javaUploadDataSinkBase2.mBuffer = java.nio.ByteBuffer.allocateDirect(((int) javaUploadDataSinkBase2.mTotalBytes) + 1);
                }
                org.chromium.net.impl.JavaUploadDataSinkBase javaUploadDataSinkBase3 = org.chromium.net.impl.JavaUploadDataSinkBase.this;
                javaUploadDataSinkBase3.initializeStart(javaUploadDataSinkBase3.mTotalBytes);
                if (z17) {
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.startRead();
                } else {
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.mSinkState.set(1);
                    org.chromium.net.impl.JavaUploadDataSinkBase.this.mUploadProvider.rewind(org.chromium.net.impl.JavaUploadDataSinkBase.this);
                }
            }
        });
    }
}

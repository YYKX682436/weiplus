package org.chromium.net.impl;

@org.chromium.base.annotations.JNINamespace("cronet")
/* loaded from: classes16.dex */
public final class CronetUploadDataStream extends org.chromium.net.UploadDataSink {
    private static final java.lang.String TAG = "CronetUploadDataStream";
    private java.nio.ByteBuffer mByteBuffer;
    private long mByteBufferLimit;
    private final org.chromium.net.impl.VersionSafeCallbacks.UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed;
    private final java.util.concurrent.Executor mExecutor;
    private long mLength;
    private java.lang.Runnable mOnDestroyedCallbackForTesting;
    private long mRemainingLength;
    private final org.chromium.net.impl.CronetUrlRequest mRequest;
    private long mUploadDataStreamAdapter;
    private final java.lang.Runnable mReadTask = new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.1
        static final /* synthetic */ boolean $assertionsDisabled = false;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (org.chromium.net.impl.CronetUploadDataStream.this.mLock) {
                if (org.chromium.net.impl.CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                    return;
                }
                org.chromium.net.impl.CronetUploadDataStream.this.checkState(3);
                if (org.chromium.net.impl.CronetUploadDataStream.this.mByteBuffer == null) {
                    throw new java.lang.IllegalStateException("Unexpected readData call. Buffer is null");
                }
                org.chromium.net.impl.CronetUploadDataStream.this.mInWhichUserCallback = 0;
                try {
                    org.chromium.net.impl.CronetUploadDataStream.this.checkCallingThread();
                    org.chromium.net.impl.VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = org.chromium.net.impl.CronetUploadDataStream.this.mDataProvider;
                    org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream = org.chromium.net.impl.CronetUploadDataStream.this;
                    uploadDataProviderWrapper.read(cronetUploadDataStream, cronetUploadDataStream.mByteBuffer);
                } catch (java.lang.Exception e17) {
                    org.chromium.net.impl.CronetUploadDataStream.this.onError(e17);
                }
            }
        }
    };
    private final java.lang.Object mLock = new java.lang.Object();
    private int mInWhichUserCallback = 3;

    /* loaded from: classes16.dex */
    public interface Natives {
        long attachUploadDataToRequest(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, long j17, long j18);

        long createAdapterForTesting(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream);

        long createUploadDataStreamForTesting(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, long j17, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetUploadDataStreamAdapter")
        void destroy(long j17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetUploadDataStreamAdapter")
        void onReadSucceeded(long j17, org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, int i17, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetUploadDataStreamAdapter")
        void onRewindSucceeded(long j17, org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface UserCallback {
        public static final int GET_LENGTH = 2;
        public static final int NOT_IN_CALLBACK = 3;
        public static final int READ = 0;
        public static final int REWIND = 1;
    }

    public CronetUploadDataStream(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest) {
        this.mExecutor = executor;
        this.mDataProvider = new org.chromium.net.impl.VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
        this.mRequest = cronetUrlRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCallingThread() {
        this.mRequest.checkCallingThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkState(int i17) {
        if (this.mInWhichUserCallback == i17) {
            return;
        }
        throw new java.lang.IllegalStateException("Expected " + i17 + ", but was " + this.mInWhichUserCallback);
    }

    private void destroyAdapter() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                this.mDestroyAdapterPostponed = true;
                return;
            }
            if (this.mUploadDataStreamAdapter == 0) {
                return;
            }
            org.chromium.net.impl.CronetUploadDataStreamJni.get().destroy(this.mUploadDataStreamAdapter);
            this.mUploadDataStreamAdapter = 0L;
            java.lang.Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        org.chromium.net.impl.CronetUploadDataStream.this.checkCallingThread();
                        org.chromium.net.impl.CronetUploadDataStream.this.mDataProvider.close();
                    } catch (java.lang.Exception e17) {
                        org.chromium.base.Log.e(org.chromium.net.impl.CronetUploadDataStream.TAG, "Exception thrown when closing", (java.lang.Throwable) e17);
                    }
                }
            });
        }
    }

    private void destroyAdapterIfPostponed() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                throw new java.lang.IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.mDestroyAdapterPostponed) {
                destroyAdapter();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(java.lang.Throwable th6) {
        boolean z17;
        synchronized (this.mLock) {
            int i17 = this.mInWhichUserCallback;
            if (i17 == 3) {
                throw new java.lang.IllegalStateException("There is no read or rewind or length check in progress.", th6);
            }
            z17 = i17 == 2;
            this.mInWhichUserCallback = 3;
            this.mByteBuffer = null;
            destroyAdapterIfPostponed();
        }
        if (z17) {
            try {
                this.mDataProvider.close();
            } catch (java.lang.Exception e17) {
                org.chromium.base.Log.e(TAG, "Failure closing data provider", (java.lang.Throwable) e17);
            }
        }
        this.mRequest.onUploadException(th6);
    }

    public void attachNativeAdapterToRequest(long j17) {
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = org.chromium.net.impl.CronetUploadDataStreamJni.get().attachUploadDataToRequest(this, j17, this.mLength);
        }
    }

    public long createUploadDataStreamForTesting() {
        long createUploadDataStreamForTesting;
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = org.chromium.net.impl.CronetUploadDataStreamJni.get().createAdapterForTesting(this);
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
            createUploadDataStreamForTesting = org.chromium.net.impl.CronetUploadDataStreamJni.get().createUploadDataStreamForTesting(this, this.mLength, this.mUploadDataStreamAdapter);
        }
        return createUploadDataStreamForTesting;
    }

    public void initializeWithRequest() {
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 2;
        }
        try {
            this.mRequest.checkCallingThread();
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
        } catch (java.lang.Throwable th6) {
            onError(th6);
        }
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 3;
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(java.lang.Exception exc) {
        synchronized (this.mLock) {
            checkState(0);
            onError(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadSucceeded(boolean z17) {
        synchronized (this.mLock) {
            checkState(0);
            if (this.mByteBufferLimit != this.mByteBuffer.limit()) {
                throw new java.lang.IllegalStateException("ByteBuffer limit changed");
            }
            if (z17 && this.mLength >= 0) {
                throw new java.lang.IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int position = this.mByteBuffer.position();
            long j17 = this.mRemainingLength - position;
            this.mRemainingLength = j17;
            if (j17 < 0 && this.mLength >= 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(this.mLength - this.mRemainingLength), java.lang.Long.valueOf(this.mLength)));
            }
            this.mByteBuffer = null;
            this.mInWhichUserCallback = 3;
            destroyAdapterIfPostponed();
            if (this.mUploadDataStreamAdapter == 0) {
                return;
            }
            org.chromium.net.impl.CronetUploadDataStreamJni.get().onReadSucceeded(this.mUploadDataStreamAdapter, this, position, z17);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(java.lang.Exception exc) {
        synchronized (this.mLock) {
            checkState(1);
            onError(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        synchronized (this.mLock) {
            checkState(1);
            this.mInWhichUserCallback = 3;
            this.mRemainingLength = this.mLength;
            if (this.mUploadDataStreamAdapter == 0) {
                return;
            }
            org.chromium.net.impl.CronetUploadDataStreamJni.get().onRewindSucceeded(this.mUploadDataStreamAdapter, this);
        }
    }

    public void onUploadDataStreamDestroyed() {
        destroyAdapter();
    }

    public void postTaskToExecutor(java.lang.Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (java.lang.Throwable th6) {
            this.mRequest.onUploadException(th6);
        }
    }

    public void readData(java.nio.ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        this.mByteBufferLimit = byteBuffer.limit();
        postTaskToExecutor(this.mReadTask);
    }

    public void rewind() {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.chromium.net.impl.CronetUploadDataStream.this.mLock) {
                    if (org.chromium.net.impl.CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                        return;
                    }
                    org.chromium.net.impl.CronetUploadDataStream.this.checkState(3);
                    org.chromium.net.impl.CronetUploadDataStream.this.mInWhichUserCallback = 1;
                    try {
                        org.chromium.net.impl.CronetUploadDataStream.this.checkCallingThread();
                        org.chromium.net.impl.CronetUploadDataStream.this.mDataProvider.rewind(org.chromium.net.impl.CronetUploadDataStream.this);
                    } catch (java.lang.Exception e17) {
                        org.chromium.net.impl.CronetUploadDataStream.this.onError(e17);
                    }
                }
            }
        });
    }

    public void setOnDestroyedCallbackForTesting(java.lang.Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }
}

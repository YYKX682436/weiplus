package com.tencent.thumbplayer.datatransport.resourceloader;

/* loaded from: classes15.dex */
public class TPAssetResourceLoadingDataRequest implements com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest {
    private static final boolean ENV_DEBUG = false;
    private static final int MAX_ASSET_READ_LEN = 1048576;
    private static final int MSG_RESPOND_WITH_DATA = 256;
    private static java.lang.String TAG = "TPAssetResourceLoadingDataRequest";
    private long mCurrentOffset;
    private java.lang.String mDataWritePath;
    private com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.EventHandler mEventHandler;
    private com.tencent.thumbplayer.utils.TPReadWriteLock mLock = new com.tencent.thumbplayer.utils.TPReadWriteLock();
    private java.io.RandomAccessFile mRandomAccessFile;
    private long mReadyDataTotalSize;
    private long mRealOffset;
    private int mRequestNum;
    private long mRequestedLength;
    private long mRequestedOffset;
    private boolean mRequestsAllDataToEndOfResource;

    /* loaded from: classes15.dex */
    public static class DataWriteParams {
        byte[] data;
        long writeOffset;

        private DataWriteParams() {
        }
    }

    /* loaded from: classes15.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 256) {
                return;
            }
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.DataWriteParams dataWriteParams = (com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.DataWriteParams) message.obj;
            long j17 = dataWriteParams.writeOffset;
            byte[] bArr = dataWriteParams.data;
            int i17 = message.arg1;
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest tPAssetResourceLoadingDataRequest = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.this;
            if (!tPAssetResourceLoadingDataRequest.writeDataToPath(j17, bArr, tPAssetResourceLoadingDataRequest.mDataWritePath)) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG, "write data failed");
                return;
            }
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.this.mLock.writeLock().lock();
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.this.mRealOffset = i17 + j17;
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.this.mLock.writeLock().unlock();
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG, "write data from " + j17 + " , with dataLength" + i17);
        }
    }

    public TPAssetResourceLoadingDataRequest(long j17, long j18, boolean z17) {
        this.mRequestedOffset = j17;
        this.mCurrentOffset = j17;
        this.mRealOffset = j17;
        this.mRequestedLength = j18;
        this.mRequestsAllDataToEndOfResource = z17;
    }

    private void internalMessage(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.mEventHandler.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG, "fail to close mRandomAccessFile");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if (r4 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean writeDataToPath(long r4, byte[] r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r0 = "fail to close mRandomAccessFile"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.lang.String r2 = "rw"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r3.mRandomAccessFile = r1     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r1.seek(r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            r4.write(r6)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 java.io.FileNotFoundException -> L30
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile
            if (r4 == 0) goto L20
            r4.close()     // Catch: java.io.IOException -> L1b
            goto L20
        L1b:
            java.lang.String r4 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG
            com.tencent.thumbplayer.utils.TPLogUtil.e(r4, r0)
        L20:
            r4 = 1
            goto L45
        L22:
            r4 = move-exception
            goto L46
        L24:
            java.lang.String r4 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "fail to write data"
            com.tencent.thumbplayer.utils.TPLogUtil.e(r4, r5)     // Catch: java.lang.Throwable -> L22
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile
            if (r4 == 0) goto L44
            goto L3b
        L30:
            java.lang.String r4 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "file not found"
            com.tencent.thumbplayer.utils.TPLogUtil.e(r4, r5)     // Catch: java.lang.Throwable -> L22
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile
            if (r4 == 0) goto L44
        L3b:
            r4.close()     // Catch: java.io.IOException -> L3f
            goto L44
        L3f:
            java.lang.String r4 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG
            com.tencent.thumbplayer.utils.TPLogUtil.e(r4, r0)
        L44:
            r4 = 0
        L45:
            return r4
        L46:
            java.io.RandomAccessFile r5 = r3.mRandomAccessFile
            if (r5 == 0) goto L53
            r5.close()     // Catch: java.io.IOException -> L4e
            goto L53
        L4e:
            java.lang.String r5 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.TAG
            com.tencent.thumbplayer.utils.TPLogUtil.e(r5, r0)
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.writeDataToPath(long, byte[], java.lang.String):boolean");
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getCurrentOffset() {
        this.mLock.readLock().lock();
        long j17 = this.mCurrentOffset;
        this.mLock.readLock().unlock();
        return j17;
    }

    public int getDataReadyLength(long j17) {
        this.mLock.readLock().lock();
        long j18 = this.mRealOffset;
        this.mLock.readLock().unlock();
        if (j17 >= j18) {
            return -1;
        }
        if (j17 >= this.mRequestedOffset) {
            return (int) (j18 - j17);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Offset less than mRequestedOffset");
        return -1;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public int getRequestNum() {
        return this.mRequestNum;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedLength() {
        return this.mRequestedLength;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedOffset() {
        return this.mRequestedOffset;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void notifyDataReady(long j17, long j18) {
        long j19 = j18 + j17;
        long j27 = this.mRequestedOffset;
        if (j19 > this.mRequestedLength + j27) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "data exceed the max request offset");
            return;
        }
        if (j17 < j27) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "the notify data offset is less than request offset");
        }
        if (j19 < this.mCurrentOffset) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "data not reach current offset");
            return;
        }
        this.mLock.writeLock().lock();
        this.mCurrentOffset = j19;
        this.mRealOffset = j19;
        this.mLock.writeLock().unlock();
    }

    public void release() {
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.mEventHandler = null;
        }
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void respondWithData(byte[] bArr) {
        if (this.mReadyDataTotalSize > this.mRequestedLength) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "respond full data");
            return;
        }
        int length = bArr.length;
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.DataWriteParams dataWriteParams = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.DataWriteParams();
        dataWriteParams.writeOffset = this.mCurrentOffset;
        dataWriteParams.data = bArr;
        internalMessage(256, length, 0, dataWriteParams);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "respond data from:" + this.mCurrentOffset + ", dataLength:" + length);
        this.mLock.writeLock().lock();
        long j17 = (long) length;
        this.mCurrentOffset = this.mCurrentOffset + j17;
        this.mReadyDataTotalSize = this.mReadyDataTotalSize + j17;
        this.mLock.writeLock().unlock();
    }

    public void setDataWritePath(java.lang.String str) {
        this.mDataWritePath = str;
    }

    public void setDataWriteThreadLooper(android.os.Looper looper) {
        this.mEventHandler = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.EventHandler(looper);
    }

    public void setRequestNum(int i17) {
        this.mRequestNum = i17;
    }
}

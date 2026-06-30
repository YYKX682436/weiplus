package com.tencent.thumbplayer.datatransport.resourceloader;

/* loaded from: classes15.dex */
public class TPAssetResourceLoader implements com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader {
    private static final int MSG_ON_START_READ_DATA = 256;
    private static final int MSG_ON_STOP_READ_DATA = 257;
    private static java.lang.String TAG = "TPAssetResourceLoader";
    private static final java.lang.String mCacheDir = "resourceLoader";
    private com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.EventHandler mCallbackForResourceLoaderHandler;
    private com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest mContentInformation;
    private android.content.Context mContext;
    private android.os.HandlerThread mHandlerThread;
    private com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener mTPAssetResourceLoaderListener;
    private android.os.HandlerThread mWriteDataThread;
    private long mDataTotalSize = 0;
    private java.lang.String mContentType = "";
    private java.lang.String mBusinessFilePath = "";
    private java.lang.String mDataCacheFilePath = "";
    private java.lang.String mFileSuffix = ".mp4";
    private int mRequestNum = 0;
    private java.util.ArrayList<com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest> mLoadingRequests = new java.util.ArrayList<>();

    /* loaded from: classes15.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        private boolean handleIsRequestToEnd(long j17, long j18) {
            boolean z17 = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mDataTotalSize > 0 && j18 + j17 >= com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mDataTotalSize;
            if (z17) {
                com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.clearRequestList();
            }
            return z17;
        }

        private void handleRequestToLoad(long j17, long j18, java.lang.String str, java.lang.String str2, int i17, int i18) {
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest(j17, j18, i18, handleIsRequestToEnd(j17, j18));
            tPAssetResourceLoadingRequest.setDataWriteThreadLooper(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mWriteDataThread.getLooper());
            tPAssetResourceLoadingRequest.setDataWritePath(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.getDataFilePath(i17, str, str2));
            tPAssetResourceLoadingRequest.setContentInformation(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mContentInformation);
            if (com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mTPAssetResourceLoaderListener.shouldWaitForLoadingOfRequestedResource(tPAssetResourceLoadingRequest)) {
                com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.addRequest(tPAssetResourceLoadingRequest);
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "add to mLoadingRequests, requestId: " + i18);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.thumbplayer.utils.TPLogUtil.d(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "mCallbackForResourceLoaderHandler msg : " + message.what);
            if (com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.mTPAssetResourceLoaderListener == null) {
                return;
            }
            int i17 = message.what;
            if (i17 != 256) {
                if (i17 != 257) {
                    return;
                }
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "stop read data");
                com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.handleStopReadData(message.arg1);
                return;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "start read data");
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.StartReadDataParams startReadDataParams = (com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.StartReadDataParams) message.obj;
            long j17 = startReadDataParams.requestStart;
            long j18 = startReadDataParams.requestEnd;
            java.lang.String str = startReadDataParams.fileKey;
            java.lang.String str2 = startReadDataParams.fileName;
            int i18 = message.arg1;
            int i19 = message.arg2;
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "start read data, requestStart: " + j17 + " requestEnd:" + j18 + " requestId:" + i19);
            long requestLength = com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.this.getRequestLength(j17, j18);
            if (requestLength <= 0) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.TAG, "requestLength invalid, check requestStart and requestEnd");
            } else {
                handleRequestToLoad(j17, requestLength, str2, str, i18, i19);
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class StartReadDataParams {
        java.lang.String fileKey;
        java.lang.String fileName;
        long requestEnd;
        long requestStart;

        private StartReadDataParams() {
        }
    }

    public TPAssetResourceLoader(android.content.Context context, android.os.Looper looper) {
        this.mContext = context;
        if (looper == null) {
            android.os.HandlerThread obtainShareThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainShareThread();
            this.mHandlerThread = obtainShareThread;
            looper = obtainShareThread.getLooper();
        }
        this.mCallbackForResourceLoaderHandler = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.EventHandler(looper);
        this.mWriteDataThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainHandleThread("TPAssetResourceLoader-dataWriteThread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void addRequest(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest) {
        java.util.ArrayList<com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            arrayList.add(tPAssetResourceLoadingRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void clearRequestList() {
        java.util.ArrayList<com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            java.util.Iterator<com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest> it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest next = it.next();
                next.cancelRequest();
                this.mTPAssetResourceLoaderListener.didCancelLoadingRequest(next);
            }
            this.mLoadingRequests.clear();
        }
    }

    private java.lang.String getBusinessFilePath() {
        return this.mBusinessFilePath;
    }

    private java.lang.String getDataCacheFilePath(android.content.Context context, int i17) {
        if (android.text.TextUtils.isEmpty(this.mDataCacheFilePath)) {
            java.io.File externalCacheFile = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLFileSystem.getExternalCacheFile(context, mCacheDir, new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "-" + i17 + this.mFileSuffix);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil.createFile(externalCacheFile);
            this.mDataCacheFilePath = externalCacheFile.getAbsolutePath();
        }
        return this.mDataCacheFilePath;
    }

    private synchronized int getDataReadyLength(long j17) {
        if (this.mLoadingRequests == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.mLoadingRequests.size(); i18++) {
            i17 = java.lang.Math.max(i17, this.mLoadingRequests.get(i18).getDataReadyLength(j17));
        }
        return i17;
    }

    private synchronized com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest getLoadingRequestWithNum(int i17) {
        if (this.mLoadingRequests == null) {
            return null;
        }
        for (int i18 = 0; i18 < this.mLoadingRequests.size(); i18++) {
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest = this.mLoadingRequests.get(i18);
            if (tPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestNum() == i17) {
                return tPAssetResourceLoadingRequest;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getRequestLength(long j17, long j18) {
        if (j18 > 0) {
            return j18 - j17;
        }
        long j19 = this.mDataTotalSize;
        if (j19 <= 0) {
            return 536870912L;
        }
        return j19 - j17;
    }

    private void handleResourceLoaderCallback(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.EventHandler eventHandler = this.mCallbackForResourceLoaderHandler;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.mCallbackForResourceLoaderHandler.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStopReadData(int i17) {
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest loadingRequestWithNum = getLoadingRequestWithNum(i17);
        if (loadingRequestWithNum == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "TPAssetLoader can't find the request " + i17 + " with current loading requests");
            return;
        }
        loadingRequestWithNum.cancelRequest();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "handleStopReadData, cancel the loading request with id " + i17);
        removeRequest(loadingRequestWithNum);
        this.mTPAssetResourceLoaderListener.didCancelLoadingRequest(loadingRequestWithNum);
    }

    private synchronized void removeRequest(com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest) {
        java.util.ArrayList<com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            arrayList.remove(tPAssetResourceLoadingRequest);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void fillInContentInformation() {
        if (this.mTPAssetResourceLoaderListener == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "listener not set");
            return;
        }
        com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest = new com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest();
        this.mContentInformation = tPAssetResourceLoadingContentInformationRequest;
        this.mTPAssetResourceLoaderListener.fillInContentInformation(tPAssetResourceLoadingContentInformationRequest);
        com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest2 = this.mContentInformation;
        this.mContentType = tPAssetResourceLoadingContentInformationRequest2.contentType;
        this.mDataTotalSize = tPAssetResourceLoadingContentInformationRequest2.dataTotalSize;
        this.mBusinessFilePath = tPAssetResourceLoadingContentInformationRequest2.dataFilePath;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "proxy start, mDataTotalSize: " + this.mDataTotalSize + " businessPath:" + this.mBusinessFilePath);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
        return this.mContentType;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String businessFilePath = getBusinessFilePath();
        return !android.text.TextUtils.isEmpty(businessFilePath) ? businessFilePath : getDataCacheFilePath(this.mContext, i17);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
        return this.mDataTotalSize;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        int min = (int) java.lang.Math.min(getDataReadyLength(j17), j18);
        if (min <= 0) {
            return -1;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "onReadData, fileId: " + i17 + " readOffset: " + j17 + " readLength:" + j18 + " readyLength:" + min);
        return min;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        if (this.mTPAssetResourceLoaderListener == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "listener not set");
            return 0;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStartReadData, fileId:" + i17 + ", fileKey:" + str2 + ", requestStart:" + j17 + ", requestEnd:" + j18);
        int i18 = this.mRequestNum + 1;
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.StartReadDataParams startReadDataParams = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.StartReadDataParams();
        startReadDataParams.requestStart = j17;
        startReadDataParams.requestEnd = j18;
        startReadDataParams.fileKey = str2;
        startReadDataParams.fileName = str;
        handleResourceLoaderCallback(256, i17, i18, startReadDataParams);
        this.mRequestNum = i18;
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
        if (this.mTPAssetResourceLoaderListener == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "listener not set");
            return 0;
        }
        handleResourceLoaderCallback(257, i18, 0, null);
        return 0;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void release() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release start");
        reset();
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mCallbackForResourceLoaderHandler);
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mWriteDataThread, null);
        this.mHandlerThread = null;
        this.mWriteDataThread = null;
        this.mCallbackForResourceLoaderHandler = null;
        this.mLoadingRequests = null;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void reset() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reset start");
        clearRequestList();
        this.mDataTotalSize = 0L;
        this.mContentType = "";
        this.mBusinessFilePath = "";
        if (!android.text.TextUtils.isEmpty(this.mDataCacheFilePath)) {
            try {
                new java.io.File(this.mDataCacheFilePath).deleteOnExit();
                this.mDataCacheFilePath = "";
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "reset, delete cache file has exception:" + e17.toString());
            }
        }
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader.EventHandler eventHandler = this.mCallbackForResourceLoaderHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void setTPAssetResourceLoaderListener(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener) {
        this.mTPAssetResourceLoaderListener = iTPAssetResourceLoaderListener;
    }
}

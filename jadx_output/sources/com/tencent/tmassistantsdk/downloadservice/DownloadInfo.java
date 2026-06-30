package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadInfo {
    public static final java.lang.String CONTENTTYPE = "contentType";
    public static final java.lang.String DOWNLOADFAILEDERRCODE = "downloadFailedErrCode";
    public static final java.lang.String DOWNLOADFAILEDTIME = "downloadFailedTime";
    public static final java.lang.String FILENAME = "fileName";
    public static final java.lang.String FINALURL = "finalUrl";
    public static final java.lang.String HEADERPARAMS = "headerParams";
    public static final java.lang.String NETTYPE = "netType";
    public static final java.lang.String PRIORITY = "priority";
    public static final java.lang.String RECEIVEDBYTES = "receivedBytes";
    public static final java.lang.String REDIRECTCNT = "redirectCnt";
    public static final java.lang.String REQUESTFILESIZE = "requestFileSize";
    public static final java.lang.String RETRYCNT = "retryCnt";
    public static final java.lang.String SECONDARYURL = "secondaryUrl";
    public static final java.lang.String STATUS = "status";
    public static final java.lang.String TAG = "_DownloadInfo";
    public static final java.lang.String TASKID = "taskId";
    public static final java.lang.String TASKURL = "taskUrl";
    public static final java.lang.String TOTALBYTES = "totalBytes";
    public static final java.lang.String UID = "uId";
    private boolean mAutoRetry;
    public java.lang.String mContentType;
    public int mDownloadFailedErrCode;
    public long mDownloadFailedTime;
    public int mDownloadTaskId;
    public java.lang.String mFileName;
    private java.lang.String mHeaderParamString;
    private java.util.HashMap<java.lang.String, java.lang.String> mHeaderParams;
    public java.lang.String mNetType;
    public int mPriority;
    public long mReceivedBytes;
    public int mRedirectCnt;
    public java.lang.Long mRequestFileSize;
    public java.lang.String mRequestURL;
    public int mRetryCnt;
    public java.lang.String mSecondaryUrl;
    public int mStatus;
    boolean mTaskIsRunning;
    protected java.lang.String mTempFileName;
    protected long mTotalBytes;
    public java.lang.String mURL;
    public java.lang.String mUUID;

    public DownloadInfo() {
        this.mAutoRetry = false;
        this.mTaskIsRunning = false;
    }

    public static com.tencent.tmassistantsdk.downloadservice.DownloadInfo readFromCursor(android.database.Cursor cursor) {
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = new com.tencent.tmassistantsdk.downloadservice.DownloadInfo();
        downloadInfo.mDownloadTaskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        downloadInfo.mUUID = cursor.getString(cursor.getColumnIndex(UID));
        downloadInfo.mRequestURL = cursor.getString(cursor.getColumnIndex(FINALURL));
        downloadInfo.mURL = cursor.getString(cursor.getColumnIndex("taskUrl"));
        downloadInfo.mSecondaryUrl = cursor.getString(cursor.getColumnIndex(SECONDARYURL));
        downloadInfo.mRequestFileSize = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(REQUESTFILESIZE)));
        downloadInfo.mFileName = cursor.getString(cursor.getColumnIndex(FILENAME));
        downloadInfo.mContentType = cursor.getString(cursor.getColumnIndex(CONTENTTYPE));
        downloadInfo.mRedirectCnt = cursor.getInt(cursor.getColumnIndex(REDIRECTCNT));
        downloadInfo.mRetryCnt = cursor.getInt(cursor.getColumnIndex(RETRYCNT));
        downloadInfo.mTotalBytes = cursor.getLong(cursor.getColumnIndex(TOTALBYTES));
        downloadInfo.mStatus = cursor.getInt(cursor.getColumnIndex("status"));
        downloadInfo.mReceivedBytes = cursor.getLong(cursor.getColumnIndex(RECEIVEDBYTES));
        downloadInfo.mPriority = cursor.getInt(cursor.getColumnIndex(PRIORITY));
        downloadInfo.mNetType = cursor.getString(cursor.getColumnIndex(NETTYPE));
        downloadInfo.mDownloadFailedErrCode = cursor.getInt(cursor.getColumnIndex(DOWNLOADFAILEDERRCODE));
        downloadInfo.mDownloadFailedTime = cursor.getLong(cursor.getColumnIndex(DOWNLOADFAILEDTIME));
        downloadInfo.mHeaderParamString = cursor.getString(cursor.getColumnIndex(HEADERPARAMS));
        return downloadInfo;
    }

    public static com.tencent.tmassistantsdk.downloadservice.DownloadInfo readFromSimpleCursor(android.database.Cursor cursor) {
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = new com.tencent.tmassistantsdk.downloadservice.DownloadInfo();
        downloadInfo.mDownloadTaskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        downloadInfo.mUUID = cursor.getString(cursor.getColumnIndex(UID));
        downloadInfo.mRequestURL = cursor.getString(cursor.getColumnIndex(FINALURL));
        downloadInfo.mURL = cursor.getString(cursor.getColumnIndex("taskUrl"));
        downloadInfo.mSecondaryUrl = cursor.getString(cursor.getColumnIndex(SECONDARYURL));
        downloadInfo.mRequestFileSize = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex(REQUESTFILESIZE)));
        downloadInfo.mFileName = cursor.getString(cursor.getColumnIndex(FILENAME));
        downloadInfo.mContentType = cursor.getString(cursor.getColumnIndex(CONTENTTYPE));
        downloadInfo.mRedirectCnt = cursor.getInt(cursor.getColumnIndex(REDIRECTCNT));
        downloadInfo.mRetryCnt = cursor.getInt(cursor.getColumnIndex(RETRYCNT));
        downloadInfo.mTotalBytes = cursor.getLong(cursor.getColumnIndex(TOTALBYTES));
        downloadInfo.mStatus = cursor.getInt(cursor.getColumnIndex("status"));
        downloadInfo.mReceivedBytes = cursor.getLong(cursor.getColumnIndex(RECEIVEDBYTES));
        downloadInfo.mPriority = cursor.getInt(cursor.getColumnIndex(PRIORITY));
        downloadInfo.mNetType = null;
        downloadInfo.mDownloadFailedErrCode = 0;
        downloadInfo.mDownloadFailedTime = 0L;
        downloadInfo.mHeaderParamString = null;
        return downloadInfo;
    }

    public static void writeToContentValues(android.content.ContentValues contentValues, com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo) {
        if (downloadInfo == null || contentValues == null) {
            return;
        }
        contentValues.put("taskId", java.lang.Integer.valueOf(downloadInfo.mDownloadTaskId));
        contentValues.put(UID, downloadInfo.mUUID);
        contentValues.put(FINALURL, downloadInfo.mRequestURL);
        contentValues.put("taskUrl", downloadInfo.mURL);
        contentValues.put(SECONDARYURL, downloadInfo.mSecondaryUrl);
        contentValues.put(REQUESTFILESIZE, downloadInfo.mRequestFileSize);
        contentValues.put(FILENAME, downloadInfo.mFileName);
        contentValues.put(CONTENTTYPE, downloadInfo.mContentType);
        contentValues.put(REDIRECTCNT, java.lang.Integer.valueOf(downloadInfo.mRedirectCnt));
        contentValues.put(RETRYCNT, java.lang.Integer.valueOf(downloadInfo.mRetryCnt));
        contentValues.put(TOTALBYTES, java.lang.Long.valueOf(downloadInfo.mTotalBytes));
        contentValues.put("status", java.lang.Integer.valueOf(downloadInfo.mStatus));
        contentValues.put(RECEIVEDBYTES, java.lang.Long.valueOf(downloadInfo.mReceivedBytes));
        contentValues.put(PRIORITY, java.lang.Integer.valueOf(downloadInfo.mPriority));
        contentValues.put(NETTYPE, downloadInfo.mNetType);
        contentValues.put(DOWNLOADFAILEDERRCODE, java.lang.Integer.valueOf(downloadInfo.mDownloadFailedErrCode));
        contentValues.put(DOWNLOADFAILEDTIME, java.lang.Long.valueOf(downloadInfo.mDownloadFailedTime));
        contentValues.put(HEADERPARAMS, downloadInfo.mHeaderParamString);
    }

    public void dump(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(str, "--------dump DownloadInfo-----------");
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mContentType: " + this.mContentType);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mURL: " + this.mURL);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mRequestURL: " + this.mRequestURL);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mSecondaryUrl: " + this.mSecondaryUrl);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mRequestFileSize: " + this.mRequestFileSize);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mRetryCnt: " + this.mRetryCnt);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mRedirectCnt: " + this.mRedirectCnt);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mTotalBytes: " + this.mTotalBytes);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mUUID: " + this.mUUID);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mStatus: " + this.mStatus);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mReceivedBytes: " + this.mReceivedBytes);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mFileName: " + this.mFileName);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mDownloadFailedErrCode: " + this.mDownloadFailedErrCode);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mNetType:" + this.mNetType);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mDownloadFailedTime:" + this.mDownloadFailedTime);
        com.tencent.tmassistantsdk.util.TMLog.i(str, "mHeaderParamString:" + this.mHeaderParamString);
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getHeaderParams() {
        return this.mHeaderParams;
    }

    public long getTotalSize() {
        return this.mTotalBytes;
    }

    public boolean hasFinished() {
        return this.mStatus > 3;
    }

    public boolean hasReceivedAllDataBytes() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mTotalBytes = " + this.mTotalBytes + ", mReceivedBytes = " + this.mReceivedBytes);
        long j17 = this.mTotalBytes;
        return j17 != 0 && this.mReceivedBytes == j17;
    }

    public boolean hasRetryChance() {
        return this.mRetryCnt <= 5;
    }

    public void pauseDownload() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "DownloadInfo::pauseDownload url: " + this.mURL);
        com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
        updateStatus(3, false);
    }

    public void setHeaderParams(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0) {
            return;
        }
        this.mHeaderParams = hashMap;
        this.mHeaderParamString = new org.json.JSONObject(hashMap).toString();
    }

    public void setTotalSize(long j17) {
        if (0 == j17) {
            this.mReceivedBytes = 0L;
        }
        this.mTotalBytes = j17;
        com.tencent.tmassistantsdk.storage.DBManager.getInstance().addDownloadInfo(this);
    }

    public int startDownloadIfReady() {
        return startDownloadIfReady(false);
    }

    public void stopDownload() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "DownloadInfo::stopDownload url: " + this.mURL);
        com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.getInstance().cancelDownloadTask(this.mDownloadTaskId);
        updateStatus(6, false);
    }

    public void updateReceivedSize(long j17) {
        this.mReceivedBytes += j17;
        com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager.getInstance().OnDownloadProgressChanged(this.mURL, this.mReceivedBytes, this.mTotalBytes);
    }

    public synchronized void updateStatus(int i17, boolean z17) {
        if (hasFinished()) {
            return;
        }
        this.mStatus = i17;
        if (i17 != 6) {
            if (i17 == 5) {
                this.mDownloadFailedTime = java.lang.System.currentTimeMillis();
            }
            com.tencent.tmassistantsdk.storage.DBManager.getInstance().addDownloadInfo(this);
            com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager.getInstance().OnDownloadStateChanged(this.mURL, this.mStatus, this.mDownloadFailedErrCode, "", z17, this.mAutoRetry);
        } else {
            com.tencent.tmassistantsdk.storage.DBManager.getInstance().deleteDownloadInfo(this.mURL);
        }
    }

    public int startDownloadIfReady(boolean z17) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "DownloadInfo::startDownloadIfReady url: " + this.mURL);
        if (!android.text.TextUtils.isEmpty(this.mHeaderParamString) && ((hashMap = this.mHeaderParams) == null || hashMap.size() <= 0)) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.mHeaderParamString);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap2.put(next, jSONObject.getString(next));
                }
                if (hashMap2.size() > 0) {
                    this.mHeaderParams = hashMap2;
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        if (this.mTaskIsRunning) {
            return 5;
        }
        this.mAutoRetry = z17;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "autoRetry = " + this.mAutoRetry);
        if (this.mFileName == null) {
            this.mFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
        }
        if (this.mTempFileName == null) {
            this.mTempFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.generateFileNameFromURL(this.mURL, this.mContentType);
        }
        if (this.mTotalBytes == 0) {
            new com.tencent.tmassistantsdk.storage.TMAssistantFile(this.mTempFileName, this.mFileName).deleteTempFile();
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mFileName = " + this.mFileName);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mTempFileName = " + this.mTempFileName);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mTotalBytes = " + this.mTotalBytes + ", mStatus = " + this.mStatus);
        if (this.mStatus == 5) {
            this.mRequestURL = this.mURL;
        }
        if (!android.text.TextUtils.isEmpty(this.mFileName)) {
            com.tencent.tmassistantsdk.storage.TMAssistantFile tMAssistantFile = new com.tencent.tmassistantsdk.storage.TMAssistantFile(this.mTempFileName, this.mFileName);
            long length = tMAssistantFile.length();
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "FileLen: " + length + " filename: " + this.mFileName);
            if (length > this.mTotalBytes) {
                tMAssistantFile.deleteTempFile();
                this.mReceivedBytes = 0L;
            } else {
                this.mReceivedBytes = length;
            }
            if (hasReceivedAllDataBytes()) {
                tMAssistantFile.moveFileToSavaPath();
                updateStatus(4, false);
                return 4;
            }
        }
        if (this.mStatus == 5) {
            this.mRedirectCnt = 0;
            this.mRetryCnt = 0;
            this.mStatus = 0;
            this.mDownloadFailedErrCode = 0;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownloadIfReady...");
        dump(TAG);
        if (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.getInstance().getDownloadTask(this.mURL) == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "dt is null");
            com.tencent.tmassistantsdk.downloadservice.DownloadTask downloadTask = new com.tencent.tmassistantsdk.downloadservice.DownloadTask(this);
            updateStatus(1, false);
            this.mDownloadTaskId = com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.getInstance().addDownloadTask(downloadTask);
        }
        return 0;
    }

    public DownloadInfo(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3) {
        this.mAutoRetry = false;
        this.mURL = str;
        this.mSecondaryUrl = str2;
        this.mRequestURL = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.correctURL(str);
        this.mRequestFileSize = java.lang.Long.valueOf(j17);
        this.mUUID = java.util.UUID.randomUUID().toString();
        this.mPriority = i17;
        this.mStatus = 0;
        this.mDownloadFailedErrCode = 0;
        this.mTaskIsRunning = false;
        this.mContentType = str3;
        this.mNetType = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus();
        this.mDownloadFailedTime = 0L;
    }
}

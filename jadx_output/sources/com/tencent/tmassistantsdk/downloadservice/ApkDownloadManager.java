package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class ApkDownloadManager implements com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver {
    protected static final long INTERVAL = 180000;
    protected static final java.lang.String TAG = "ApkDownloadManager";
    protected static com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager mApkDownloadManager;
    final java.util.Map<java.lang.String, com.tencent.tmassistantsdk.downloadservice.DownloadInfo> mDownloads = new java.util.concurrent.ConcurrentHashMap();

    private ApkDownloadManager() {
    }

    public static com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager getInstance() {
        if (mApkDownloadManager == null) {
            mApkDownloadManager = new com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager();
        }
        return mApkDownloadManager;
    }

    public void AddDownloadListener(com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener iDownloadManagerListener) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call AddDownloadListener, dl: " + iDownloadManagerListener);
        com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager.getInstance().Add(iDownloadManagerListener);
    }

    public void RemoveDownloadListener(com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener iDownloadManagerListener) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call RemoveDownloadListener, dl: " + iDownloadManagerListener);
        com.tencent.tmassistantsdk.downloadservice.DownloadListenerManager.getInstance().Remove(iDownloadManagerListener);
    }

    public void cancelDownload(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call cancelDownload, url: " + str);
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo remove = this.mDownloads.remove(str);
        if (remove != null) {
            remove.stopDownload();
        }
    }

    public void init() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "Start to load DownloadInfo list.");
        this.mDownloads.clear();
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> queryDownloadInfoList = com.tencent.tmassistantsdk.storage.DBManager.getInstance().queryDownloadInfoList();
        if (queryDownloadInfoList != null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "The size of downloadinfo_list: " + queryDownloadInfoList.size());
            java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> it = queryDownloadInfoList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.downloadservice.DownloadInfo next = it.next();
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "---------------load download info---------------");
                next.dump(TAG);
                this.mDownloads.put(next.mURL, next);
                if (!next.hasFinished()) {
                    next.updateStatus(3, false);
                }
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "Add NetworkChangedObserver to NetworkMonitorReceiver");
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(this);
    }

    public java.lang.Boolean isAllDownloadFinished() {
        java.util.Iterator<java.lang.String> it = this.mDownloads.keySet().iterator();
        while (it.hasNext()) {
            if (!this.mDownloads.get(it.next()).hasFinished()) {
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver
    public void onNetworkChanged() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onNetworkChanged");
        if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted() && com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().isAutoDownload()) {
            java.lang.String netStatus = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus();
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "currentNetType = " + netStatus);
            java.util.Iterator<java.lang.String> it = this.mDownloads.keySet().iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloads.get(it.next());
                if (com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().isAutoDownload(downloadInfo.mNetType, netStatus)) {
                    com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onNetworkChanged, errCode = " + downloadInfo.mDownloadFailedErrCode);
                    int i17 = downloadInfo.mDownloadFailedErrCode;
                    if (i17 == 601 || i17 == 602 || i17 == 605 || i17 == 603 || i17 == 606) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onNetworkChanged, currentTime = " + currentTimeMillis + ", DownloadFailedTime = " + downloadInfo.mDownloadFailedTime);
                        if (currentTimeMillis - downloadInfo.mDownloadFailedTime < INTERVAL) {
                            downloadInfo.startDownloadIfReady(true);
                        }
                    }
                }
            }
        }
    }

    public void pauseDownload(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call pauseDownload, url: " + str);
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloads.get(str);
        if (downloadInfo != null) {
            downloadInfo.pauseDownload();
        }
    }

    public com.tencent.tmassistantsdk.downloadservice.DownloadInfo queryDownloadInfo(java.lang.String str) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call queryDownloadInfo, url: " + str);
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloads.get(str);
        if (downloadInfo == null) {
            downloadInfo = com.tencent.tmassistantsdk.storage.DBManager.getInstance().queryDownloadInfoByUrl(str);
        }
        boolean isDownloadFileExisted = downloadInfo != null ? downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str, downloadInfo.mContentType) : com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName) : false;
        if (downloadInfo == null || !downloadInfo.hasReceivedAllDataBytes() || isDownloadFileExisted) {
            return downloadInfo;
        }
        this.mDownloads.remove(str);
        com.tencent.tmassistantsdk.storage.DBManager.getInstance().deleteDownloadInfo(str);
        return null;
    }

    public int startDownload(java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, url: " + str + "priority: " + i17);
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: 1");
            return 1;
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus().equalsIgnoreCase("wifi") && com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().getIsDownloadWifiOnly()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: 2");
            return 2;
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isValidURL(str)) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: 3");
            return 3;
        }
        if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str, str3)) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: 4");
            return 4;
        }
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloads.get(str);
        if (downloadInfo == null) {
            downloadInfo = com.tencent.tmassistantsdk.storage.DBManager.getInstance().queryDownloadInfoByUrl(str);
            if (downloadInfo == null) {
                com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo2 = new com.tencent.tmassistantsdk.downloadservice.DownloadInfo(str, str2, j17, i17, str3);
                if (downloadInfo2.mContentType.equals("resource/tm.android.unknown")) {
                    downloadInfo2.mFileName = str4;
                }
                downloadInfo = downloadInfo2;
            } else {
                if (downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str, downloadInfo.mContentType) : com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName)) {
                    com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: 4");
                    return 4;
                }
            }
            this.mDownloads.put(str, downloadInfo);
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = (java.util.HashMap) map;
        downloadInfo.setHeaderParams(hashMap);
        boolean isDownloadFileExisted = downloadInfo.mContentType.equals("application/tm.android.apkdiff") ? com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str, downloadInfo.mContentType) : com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(downloadInfo.mFileName);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "fileExited = " + isDownloadFileExisted);
        if (isDownloadFileExisted) {
            return 4;
        }
        if (downloadInfo.hasReceivedAllDataBytes() && !isDownloadFileExisted) {
            this.mDownloads.remove(str);
            com.tencent.tmassistantsdk.storage.DBManager.getInstance().deleteDownloadInfo(str);
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo3 = new com.tencent.tmassistantsdk.downloadservice.DownloadInfo(str, str2, j17, i17, str3);
            if (downloadInfo3.mContentType.equals("resource/tm.android.unknown")) {
                downloadInfo3.mFileName = str4;
            }
            downloadInfo3.setHeaderParams(hashMap);
            this.mDownloads.put(str, downloadInfo3);
            downloadInfo = downloadInfo3;
        }
        int startDownloadIfReady = downloadInfo.startDownloadIfReady();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "call startDownload, return errCode: " + startDownloadIfReady);
        return startDownloadIfReady;
    }

    public void uninit() {
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this);
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> arrayList = new java.util.ArrayList<>();
        if (!this.mDownloads.isEmpty()) {
            java.util.Iterator<java.lang.String> it = this.mDownloads.keySet().iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloads.get(it.next());
                if (downloadInfo.mStatus == 2) {
                    pauseDownload(downloadInfo.mURL);
                }
                arrayList.add(downloadInfo);
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "Start to save DownloadInfo list.");
        com.tencent.tmassistantsdk.storage.DBManager.getInstance().saveDownloadInfoList(arrayList);
    }
}

package com.tencent.tmassistantsdk.downloadservice.taskmanager;

/* loaded from: classes13.dex */
public class ServiceDownloadTaskManager implements com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener {
    protected static final java.lang.String TAG = "ServiceDownloadTaskManager";
    protected java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> mServiceTaskList = new java.util.ArrayList<>();
    protected com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener mListener = null;

    public ServiceDownloadTaskManager(java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.mServiceTaskList.addAll(arrayList);
    }

    @Override // com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener
    public void OnDownloadProgressChanged(java.lang.String str, long j17, long j18) {
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask;
        if (this.mListener == null || (findDownloadTask = findDownloadTask(str)) == null || findDownloadTask.size() <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = findDownloadTask.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask next = it.next();
            if (next.checkIsNeedUpdateProgress(j17, j18, currentTimeMillis)) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "OnDownloadProgressChanged,clientKey:" + next.mClientKey + ",receivedLen:" + j17 + ",url:" + str.hashCode());
                this.mListener.OnDownloadProgressChanged(next.mClientKey, str, j17, j18);
            }
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadservice.IDownloadManagerListener
    public void OnDownloadStateChanged(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask;
        if (this.mListener == null || (findDownloadTask = findDownloadTask(str)) == null || findDownloadTask.size() <= 0) {
            return;
        }
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = findDownloadTask.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask next = it.next();
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "OnDownloadStateChanged,clientKey:" + next.mClientKey + ",state:" + i17 + ",errorcode:" + i18 + ",url:" + str.hashCode());
            next.mState = i17;
            this.mListener.OnDownloadStateChanged(next.mClientKey, str, i17, i18, str2, z17, z18);
        }
    }

    public void cancelDownload(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "cancelDownload,clientKey:".concat(str));
        com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask findDownloadTask = findDownloadTask(str, str2);
        if (findDownloadTask != null) {
            this.mServiceTaskList.remove(findDownloadTask);
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "cancelDownload,clientKey:" + str + ",remove taskItem");
        } else {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, "cancelDownload,clientKey:" + str + ",taskItem is null");
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask2 = findDownloadTask(str2);
        if (findDownloadTask2 == null || findDownloadTask2.size() == 0) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "cancelDownload,clientKey:" + str + ",taskItem is the only on cancelAll");
            com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().cancelDownload(str2);
        }
    }

    public synchronized com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask findDownloadTask(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = this.mServiceTaskList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask next = it.next();
            java.lang.String str3 = next.mClientKey;
            if (str3 != null && str3.equals(str) && next.mUrl.equals(str2)) {
                return next;
            }
        }
        return null;
    }

    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskInfo(java.lang.String str, java.lang.String str2) {
        com.tencent.tmassistantsdk.downloadservice.DownloadInfo queryDownloadInfo = com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().queryDownloadInfo(str2);
        if (queryDownloadInfo != null) {
            return new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo(queryDownloadInfo.mURL, com.tencent.tmassistantsdk.storage.TMAssistantFile.getSaveFilePath(queryDownloadInfo.mFileName), queryDownloadInfo.mStatus, queryDownloadInfo.mReceivedBytes, queryDownloadInfo.getTotalSize(), queryDownloadInfo.mContentType);
        }
        if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str2, "application/vnd.android.package-archive")) {
            java.lang.String generateFileNameFromURL = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.generateFileNameFromURL(str2, "application/vnd.android.package-archive");
            java.lang.String saveFilePath = com.tencent.tmassistantsdk.storage.TMAssistantFile.getSaveFilePath(generateFileNameFromURL);
            com.tencent.tmassistantsdk.storage.TMAssistantFile tMAssistantFile = new com.tencent.tmassistantsdk.storage.TMAssistantFile(generateFileNameFromURL, generateFileNameFromURL);
            return new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo(str2, saveFilePath, 4, tMAssistantFile.length(), tMAssistantFile.length(), "application/vnd.android.package-archive");
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isDownloadFileExisted(str2, "application/tm.android.apkdiff")) {
            removeDownloadTask(str2);
            return null;
        }
        java.lang.String generateFileNameFromURL2 = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.generateFileNameFromURL(str2, "application/tm.android.apkdiff");
        java.lang.String saveFilePath2 = com.tencent.tmassistantsdk.storage.TMAssistantFile.getSaveFilePath(generateFileNameFromURL2);
        com.tencent.tmassistantsdk.storage.TMAssistantFile tMAssistantFile2 = new com.tencent.tmassistantsdk.storage.TMAssistantFile(generateFileNameFromURL2, generateFileNameFromURL2);
        return new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo(str2, saveFilePath2, 4, tMAssistantFile2.length(), tMAssistantFile2.length(), "application/tm.android.apkdiff");
    }

    public void pauseDownload(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownload,clientKey:".concat(str));
        com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask findDownloadTask = findDownloadTask(str, str2);
        if (findDownloadTask != null) {
            findDownloadTask.mState = 3;
            this.mServiceTaskList.remove(findDownloadTask);
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownload,clientKey:" + str + ",remove taskItem");
            java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask2 = findDownloadTask(str2);
            if (findDownloadTask2 == null || findDownloadTask2.size() == 0) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownload,clientKey:" + str + ",taskItem is the only on pauseAll");
                com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().pauseDownload(str2);
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownload end,clientKey:" + str + ",taskItem is the only on pauseAll");
            }
            com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener = this.mListener;
            if (iServiceDownloadTaskManagerListener != null) {
                iServiceDownloadTaskManagerListener.OnDownloadStateChanged(str, str2, findDownloadTask.mState, 0, null, false, false);
            }
        } else {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, "pauseDownload,clientKey:" + str + ",taskItem is null");
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "pauseDownload end,clientKey:".concat(str));
    }

    public void registerApkDownloadManagerListener() {
        com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().AddDownloadListener(this);
    }

    public synchronized void removeDownloadTask(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = this.mServiceTaskList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask next = it.next();
            if (next.mUrl.equals(str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            this.mServiceTaskList.removeAll(arrayList);
        }
    }

    public void setListener(com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener) {
        this.mListener = iServiceDownloadTaskManagerListener;
    }

    public int startDownload(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        if (str == null || str2 == null) {
            return 3;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownload,clientKey:".concat(str));
        if (findDownloadTask(str, str2) != null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownload,clientKey:" + str + ",taskItem isn't null");
            return com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().startDownload(str2, str3, j17, i17, str4, str5, map);
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask = findDownloadTask(str2);
        com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask serviceDownloadTask = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask(str, str2);
        serviceDownloadTask.mState = 1;
        this.mServiceTaskList.add(serviceDownloadTask);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownload,clientKey:" + str + ",add newTask");
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = findDownloadTask.iterator();
        boolean z17 = false;
        boolean z18 = false;
        while (it.hasNext()) {
            int i18 = it.next().mState;
            if (i18 == 2) {
                z17 = true;
            } else if (i18 == 1) {
                z18 = true;
            }
        }
        if (!z17 && !z18) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownload,clientKey:" + str + ",start newTask download");
            return com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().startDownload(str2, str3, j17, i17, str4, str5, map);
        }
        if (z17) {
            serviceDownloadTask.mState = 2;
        } else if (z18) {
            serviceDownloadTask.mState = 1;
        }
        com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener iServiceDownloadTaskManagerListener = this.mListener;
        if (iServiceDownloadTaskManagerListener != null) {
            iServiceDownloadTaskManagerListener.OnDownloadStateChanged(str, str2, serviceDownloadTask.mState, 0, null, false, false);
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startDownload,clientKey:" + str + ",newTask is downloading, state = " + serviceDownloadTask.mState);
        return 0;
    }

    public void unRegisterApkDownloadManagerListener() {
        com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().RemoveDownloadListener(this);
    }

    public synchronized java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> findDownloadTask(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> it = this.mServiceTaskList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask next = it.next();
            if (next.mUrl.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}

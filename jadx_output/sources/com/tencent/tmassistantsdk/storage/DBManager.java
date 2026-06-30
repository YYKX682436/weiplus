package com.tencent.tmassistantsdk.storage;

/* loaded from: classes13.dex */
public class DBManager {
    protected static com.tencent.tmassistantsdk.storage.DBManager mInstance;

    public static synchronized com.tencent.tmassistantsdk.storage.DBManager getInstance() {
        com.tencent.tmassistantsdk.storage.DBManager dBManager;
        synchronized (com.tencent.tmassistantsdk.storage.DBManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.storage.DBManager();
            }
            dBManager = mInstance;
        }
        return dBManager;
    }

    public void addDownloadInfo(com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo) {
        com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.add(downloadInfo);
    }

    public void deleteDownloadInfo(java.lang.String str) {
        com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.del(str);
        com.tencent.tmassistantsdk.storage.table.ClientInfoTable.deleteItemsByURL(str);
    }

    public com.tencent.tmassistantsdk.downloadservice.DownloadInfo queryDownloadInfoByUrl(java.lang.String str) {
        return com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query(str);
    }

    public java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> queryDownloadInfoList() {
        return com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.load();
    }

    public java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> queryWaitingAndDownloadingTaskList() {
        return com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query();
    }

    public void saveClientInfo(java.lang.String str, java.lang.String str2) {
        com.tencent.tmassistantsdk.storage.table.ClientInfoTable.save(str, str2);
    }

    public void saveDownloadInfoList(java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> arrayList) {
        com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.save(arrayList);
    }
}

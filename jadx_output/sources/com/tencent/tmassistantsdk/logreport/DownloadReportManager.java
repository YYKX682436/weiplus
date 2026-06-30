package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class DownloadReportManager extends com.tencent.tmassistantsdk.logreport.BaseReportManager {
    protected static final java.lang.String TAG = "DownloadReportManager";
    protected static com.tencent.tmassistantsdk.logreport.DownloadReportManager mInstance;

    public static synchronized com.tencent.tmassistantsdk.logreport.DownloadReportManager getInstance() {
        com.tencent.tmassistantsdk.logreport.DownloadReportManager downloadReportManager;
        synchronized (com.tencent.tmassistantsdk.logreport.DownloadReportManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.logreport.DownloadReportManager();
            }
            downloadReportManager = mInstance;
        }
        return downloadReportManager;
    }

    public com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo(byte b17) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "createNewChunkLogInfo");
        com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo downloadChunkLogInfo = new com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo();
        downloadChunkLogInfo.type = b17;
        downloadChunkLogInfo.networkOperator = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getNetworkOperator();
        downloadChunkLogInfo.networkType = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getNetworkType();
        downloadChunkLogInfo.isWap = (byte) (!android.text.TextUtils.isEmpty(android.net.Proxy.getDefaultHost()) ? 1 : 0);
        downloadChunkLogInfo.startTime = java.lang.System.currentTimeMillis();
        return downloadChunkLogInfo;
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public com.tencent.tmassistantsdk.storage.table.BaseLogTable getLogTable() {
        return com.tencent.tmassistantsdk.storage.table.DownloadLogTable.getInstance();
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public byte getReportType() {
        return (byte) 0;
    }
}

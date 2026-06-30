package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class UpdateInfoReportManager extends com.tencent.tmassistantsdk.logreport.BaseReportManager {
    protected static final java.lang.String TAG = "UpdateInfoReportManager";
    protected static com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager mInstance;

    /* loaded from: classes6.dex */
    public class UpdateLogConst {
        public static final int ACTION_CHECKYYB_INSTALLED = 100;
        public static final int ACTION_DOWNLOAD_SUCCESS = 102;
        public static final int ACTION_INSTALL_SUCCESS = 103;
        public static final int ACTION_POP_INSTALL_DIALOG = 104;
        public static final int ACTION_START_DOWNLOAD = 101;
        public static final byte UPDATE_TYPE_NORMAL = 1;
        public static final byte UPDATE_TYPE_SAVE_NETWORK_TRAFFIC = 2;
        public static final byte UPDATE_TYPE_UNKNOWN = 0;
        public static final int YYB_IGNORE = 0;
        public static final int YYB_INSTALLED = 1;
        public static final int YYB_NOT_INSTALL = 2;

        public UpdateLogConst() {
        }
    }

    private UpdateInfoReportManager() {
    }

    public static synchronized com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager getInstance() {
        com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager updateInfoReportManager;
        synchronized (com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager();
            }
            updateInfoReportManager = mInstance;
        }
        return updateInfoReportManager;
    }

    public com.tencent.tmassistantsdk.protocol.jce.UpdateInfoLog createUpdateInfoLog(java.lang.String str, long j17) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "createUpdateInfoLog");
        com.tencent.tmassistantsdk.protocol.jce.UpdateInfoLog updateInfoLog = new com.tencent.tmassistantsdk.protocol.jce.UpdateInfoLog();
        updateInfoLog.packageName = str;
        updateInfoLog.appid = j17;
        return updateInfoLog;
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public com.tencent.tmassistantsdk.storage.table.BaseLogTable getLogTable() {
        return com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable.getInstance();
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public byte getReportType() {
        return (byte) 2;
    }
}

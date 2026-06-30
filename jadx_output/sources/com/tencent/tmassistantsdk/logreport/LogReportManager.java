package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class LogReportManager {
    private static final java.lang.Class<?>[] REPORT_MANAGERS = {com.tencent.tmassistantsdk.logreport.DownloadReportManager.class, com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class, com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager.class};
    private static final java.lang.String TAG = "LogReportManager";
    private static com.tencent.tmassistantsdk.logreport.LogReportManager mInstance;
    private final com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver mNetworkChangedObserver;

    private LogReportManager() {
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver iNetworkChangedObserver = new com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver() { // from class: com.tencent.tmassistantsdk.logreport.LogReportManager.1
            @Override // com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.INetworkChangedObserver
            public void onNetworkChanged() {
                com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.logreport.LogReportManager.TAG, "onNetworkChanged,netState:" + com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus());
                for (java.lang.Class cls : com.tencent.tmassistantsdk.logreport.LogReportManager.REPORT_MANAGERS) {
                    try {
                        if (cls.equals(com.tencent.tmassistantsdk.logreport.DownloadReportManager.class)) {
                            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().resetMaxReportCount();
                        } else if (cls.equals(com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class)) {
                            com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().resetMaxReportCount();
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.logreport.LogReportManager.TAG, e17, "", new java.lang.Object[0]);
                    }
                }
                if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted()) {
                    com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus().equalsIgnoreCase("wifi");
                }
            }
        };
        this.mNetworkChangedObserver = iNetworkChangedObserver;
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(iNetworkChangedObserver);
    }

    public static synchronized com.tencent.tmassistantsdk.logreport.LogReportManager getInstance() {
        com.tencent.tmassistantsdk.logreport.LogReportManager logReportManager;
        synchronized (com.tencent.tmassistantsdk.logreport.LogReportManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.logreport.LogReportManager();
            }
            logReportManager = mInstance;
        }
        return logReportManager;
    }

    public void cancleReport() {
        for (java.lang.Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(com.tencent.tmassistantsdk.logreport.DownloadReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().cancleRequest();
                } else if (cls.equals(com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().cancleRequest();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void destory() {
        for (java.lang.Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(com.tencent.tmassistantsdk.logreport.DownloadReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().destroy();
                } else if (cls.equals(com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().destroy();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this.mNetworkChangedObserver);
    }

    public void reportLog() {
        for (java.lang.Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(com.tencent.tmassistantsdk.logreport.DownloadReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().reportLogData();
                } else if (cls.equals(com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().reportLogData();
                } else if (cls.equals(com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager.class)) {
                    com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager.getInstance().reportLogData();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
    }
}

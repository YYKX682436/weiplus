package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKService extends android.app.Service implements com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener {
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKService";
    private byte _hellAccFlag_;
    protected final com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TMAssistantDownloadSDKServiceImpl downloadSDKServiceImpl = new com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TMAssistantDownloadSDKServiceImpl();
    protected final android.os.RemoteCallbackList<com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback> mCallbacks = new android.os.RemoteCallbackList<>();
    protected final java.util.HashMap<com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback, java.lang.String> mCallbackHashMap = new java.util.HashMap<>();
    com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager mServiceDownloadTaskManager = null;

    /* loaded from: classes13.dex */
    public class TMAssistantDownloadSDKServiceImpl extends com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub {
        public TMAssistantDownloadSDKServiceImpl() {
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void cancelDownloadTask(java.lang.String str, java.lang.String str2) {
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager serviceDownloadTaskManager = com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
            if (serviceDownloadTaskManager != null) {
                serviceDownloadTaskManager.cancelDownload(str, str2);
            }
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskInfo(java.lang.String str, java.lang.String str2) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, "getDownloadTaskInfo");
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager serviceDownloadTaskManager = com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
            if (serviceDownloadTaskManager != null) {
                return serviceDownloadTaskManager.getDownloadTaskInfo(str, str2);
            }
            return null;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public int getServiceVersion() {
            return 1;
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public boolean isAllDownloadFinished() {
            return com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().isAllDownloadFinished().booleanValue();
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void pauseDownloadTask(java.lang.String str, java.lang.String str2) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME);
            try {
                com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager serviceDownloadTaskManager = com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
                if (serviceDownloadTaskManager != null) {
                    serviceDownloadTaskManager.pauseDownload(str, str2);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, e17, "", new java.lang.Object[0]);
            }
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, "pauseDownloadTask end");
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void registerDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, "registerDownloadTaskCallback,clientKey:" + str);
            if (str == null || iTMAssistantDownloadSDKServiceCallback == null) {
                return;
            }
            com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mCallbacks.register(iTMAssistantDownloadSDKServiceCallback);
            synchronized (this) {
                com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mCallbackHashMap.put(iTMAssistantDownloadSDKServiceCallback, str);
            }
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingIsDownloadWifiOnly(boolean z17) {
            com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().setIsDownloadWifiOnly(z17);
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingIsTaskAutoResume(boolean z17) {
            com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().setIsTaskAutoResume(z17);
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void setServiceSetingMaxTaskNum(int i17) {
            com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().setMaxTaskNum(i17);
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public int startDownloadTask(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, "startDownloadTask，clientkey:" + str + ",url:" + str2 + ",manager:" + com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager + ",fileName:" + str5);
            if (com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager == null) {
                return 3;
            }
            com.tencent.tmassistantsdk.storage.DBManager.getInstance().saveClientInfo(str, str2);
            return com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager.startDownload(str, str2, str3, j17, i17, str4, str5, map);
        }

        @Override // com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface
        public void unregisterDownloadTaskCallback(java.lang.String str, com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.TAG, "unregisterDownloadTaskCallback,clientKey:" + str);
            if (str == null || iTMAssistantDownloadSDKServiceCallback == null) {
                return;
            }
            com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mCallbacks.unregister(iTMAssistantDownloadSDKServiceCallback);
            synchronized (this) {
                com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.this.mCallbackHashMap.remove(iTMAssistantDownloadSDKServiceCallback);
            }
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener
    public void OnDownloadProgressChanged(java.lang.String str, java.lang.String str2, long j17, long j18) {
        try {
            int beginBroadcast = this.mCallbacks.beginBroadcast();
            for (int i17 = 0; i17 < beginBroadcast; i17++) {
                try {
                    com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback broadcastItem = this.mCallbacks.getBroadcastItem(i17);
                    java.lang.String str3 = this.mCallbackHashMap.get(broadcastItem);
                    if (str3 != null && str3.equals(str)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("OnDownloadProgressChanged,clientKey:");
                        sb6.append(str);
                        sb6.append(",receivedLen:");
                        try {
                            sb6.append(j17);
                            sb6.append(",url:");
                            try {
                                sb6.append(str2);
                                com.tencent.tmassistantsdk.util.TMLog.i(TAG, sb6.toString());
                                broadcastItem.OnDownloadSDKServiceTaskProgressChanged(str, str2, j17, j18);
                                break;
                            } catch (android.os.RemoteException unused) {
                                continue;
                            }
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                } catch (android.os.RemoteException unused3) {
                }
            }
            this.mCallbacks.finishBroadcast();
        } catch (java.lang.Throwable unused4) {
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener
    public void OnDownloadStateChanged(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
        try {
            int beginBroadcast = this.mCallbacks.beginBroadcast();
            for (int i19 = 0; i19 < beginBroadcast; i19++) {
                try {
                    com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback broadcastItem = this.mCallbacks.getBroadcastItem(i19);
                    java.lang.String str4 = this.mCallbackHashMap.get(broadcastItem);
                    if (str4 != null && str4.equals(str)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("OnDownloadStateChanged,clientKey:");
                        sb6.append(str);
                        sb6.append(",state:");
                        try {
                            sb6.append(i17);
                            sb6.append(",url:");
                            try {
                                sb6.append(str2);
                                com.tencent.tmassistantsdk.util.TMLog.i(TAG, sb6.toString());
                                broadcastItem.OnDownloadSDKServiceTaskStateChanged(str, str2, i17, i18, str3, z17, z18);
                                break;
                            } catch (android.os.RemoteException unused) {
                                continue;
                            }
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                } catch (android.os.RemoteException unused3) {
                }
            }
            this.mCallbacks.finishBroadcast();
        } catch (java.lang.Throwable unused4) {
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onBind ,intent:" + intent);
        return this.downloadSDKServiceImpl;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().setContext(this);
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().registerReceiver();
        com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager serviceDownloadTaskManager = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager(com.tencent.tmassistantsdk.storage.DBManager.getInstance().queryWaitingAndDownloadingTaskList());
        this.mServiceDownloadTaskManager = serviceDownloadTaskManager;
        serviceDownloadTaskManager.setListener(this);
        this.mServiceDownloadTaskManager.registerApkDownloadManagerListener();
        com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().init();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onDestroy");
        super.onDestroy();
        com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager.getInstance().uninit();
        com.tencent.tmassistantsdk.logreport.GetSettingEngine.getInstance().cancleRequest();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().cancleReport();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().destory();
        this.mServiceDownloadTaskManager.unRegisterApkDownloadManagerListener();
        this.mServiceDownloadTaskManager.setListener(null);
        this.mServiceDownloadTaskManager = null;
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().unregisterReceiver();
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().destroy();
        android.os.SystemClock.sleep(300L);
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onUnbind ,intent:" + intent);
        return super.onUnbind(intent);
    }
}

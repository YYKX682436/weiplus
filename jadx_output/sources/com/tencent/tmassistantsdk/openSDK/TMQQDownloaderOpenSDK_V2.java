package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class TMQQDownloaderOpenSDK_V2 extends com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK implements com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener, com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.IQQDownloaderInstalled {
    protected static final java.lang.String TAG = "QQDownloaderOpenSDK";
    protected static com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2 mInstance;
    protected java.util.concurrent.CopyOnWriteArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> mTaskList;

    public TMQQDownloaderOpenSDK_V2() {
        this.mTaskList = null;
        this.mTaskList = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public static java.lang.String about() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    private synchronized void addToTaskList(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        boolean z17;
        if (tMQQDownloaderOpenSDKParam != null) {
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> copyOnWriteArrayList = this.mTaskList;
            if (copyOnWriteArrayList != null) {
                java.util.Iterator<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam next = it.next();
                    java.lang.String str = next.taskAppId;
                    z17 = true;
                    if (str == null) {
                        java.lang.String str2 = next.taskPackageName;
                        if (str2 != null && str2.equals(tMQQDownloaderOpenSDKParam.taskPackageName)) {
                            break;
                        }
                    } else if (str.equals(tMQQDownloaderOpenSDKParam.taskAppId)) {
                        java.lang.String str3 = next.taskPackageName;
                        if (str3 == null || str3.equals(tMQQDownloaderOpenSDKParam.taskPackageName)) {
                            break;
                        }
                    }
                }
                if (!z17) {
                    this.mTaskList.add(tMQQDownloaderOpenSDKParam);
                }
            }
        }
    }

    private int getBatchRequestType(boolean z17, int i17) {
        if (z17) {
            if (i17 != 0) {
                if (i17 == 1) {
                    return 1;
                }
                if (i17 == 2) {
                    return 6;
                }
                if (i17 == 3) {
                    return 5;
                }
            }
        } else {
            if (i17 == 0 || i17 == 1) {
                return 4;
            }
            if (i17 == 2) {
                return 8;
            }
            if (i17 == 3) {
                return 7;
            }
        }
        return 2;
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2 getInstance() {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2 tMQQDownloaderOpenSDK_V2;
        synchronized (com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK_V2();
            }
            tMQQDownloaderOpenSDK_V2 = mInstance;
        }
        return tMQQDownloaderOpenSDK_V2;
    }

    private void onProgressChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, long j17, long j18) {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onDownloadStateChanged listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnDownloadTaskProgressChanged(tMQQDownloaderOpenSDKParam, j17, j18);
            }
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener
    public void OnDownloadTaskProgressChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, long j17, long j18) {
        if (tMQQDownloaderOpenSDKParam != null) {
            onProgressChanged(tMQQDownloaderOpenSDKParam, j17, j18);
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener
    public void OnDownloadTaskStateChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i17, int i18, java.lang.String str) {
        if (tMQQDownloaderOpenSDKParam != null) {
            onStateChanged(tMQQDownloaderOpenSDKParam, i17, i18, str);
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener
    public void OnQQDownloaderInvalid() {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "OnQQDownloaderInvalid listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnQQDownloaderInvalid();
            }
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener
    public void OnServiceFree() {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "OnQQDownloaderInvalid listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnServiceFree();
            }
        }
    }

    public long addBatchUpdateOperationToDB(java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> arrayList, boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] buildSendData;
        boolean z18 = arrayList == null || arrayList.size() == 0;
        int batchRequestType = getBatchRequestType(z18, i17);
        if (batchRequestType != 3 && !z18) {
            java.util.Iterator<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam next = it.next();
                if (next != null) {
                    addToTaskList(next);
                }
            }
        }
        com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest buildBatchActionRequest = com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.buildBatchActionRequest(batchRequestType, arrayList, str, str2, str3);
        if (buildBatchActionRequest == null || (buildSendData = com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.buildSendData(buildBatchActionRequest)) == null) {
            return -1L;
        }
        return buildAddDBData(buildSendData);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK
    public long addDownloadTaskFromAppDetail(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z17, z18, tMQQDownloaderOpenSDKParam.actionFlag, null, 2);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public long addDownloadTaskFromAuthorize(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, true, true, tMQQDownloaderOpenSDKParam.actionFlag, str, 3);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public long addDownloadTaskFromTaskList(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        addToTaskList(tMQQDownloaderOpenSDKParam);
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z17, z18, tMQQDownloaderOpenSDKParam.actionFlag, null, 1);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void destroyQQDownloaderOpenSDK() {
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().unregisterReceiver();
        com.tencent.tmassistantsdk.logreport.GetSettingEngine.getInstance().cancleRequest();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().cancleReport();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().destory();
        android.content.Context context = this.mContext;
        if (context != null) {
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context).unregisterIQQDownloaderOpenSDKListener();
            com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.getInstance().unregisteListener();
            com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.getInstance().unRegisteReceiver(this.mContext);
        }
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().destroy();
        this.mContext = null;
    }

    public java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo> getBatchTaskState(java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.mContext == null) {
            throw new java.lang.Exception("mContext shouldn't be null !");
        }
        if (arrayList == null || arrayList.size() <= 0) {
            throw new java.lang.Exception("ArrayList<TMQQDownloaderOpenSDKParam> appList cann't be null or empty!");
        }
        int qQDownloadApiLevel = com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK.getQQDownloadApiLevel(this.mContext);
        if (qQDownloadApiLevel <= 1) {
            return null;
        }
        if (qQDownloadApiLevel >= 4) {
            return com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).getBatchTaskInfos(arrayList, str, str2, str3);
        }
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTask = com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).getDownloadTask(arrayList.get(0));
        if (downloadTask == null) {
            return null;
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo> arrayList2 = new java.util.ArrayList<>();
        arrayList2.add(downloadTask);
        return arrayList2;
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        android.content.Context context = this.mContext;
        if (context == null) {
            throw new java.lang.Exception("Context shouldn't be null !");
        }
        if (tMQQDownloaderOpenSDKParam != null) {
            return com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context).getDownloadTask(tMQQDownloaderOpenSDKParam);
        }
        throw new java.lang.Exception("TMQQDownloaderOpenSDKParam param cann't is null!");
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void initQQDownloaderOpenSDK(android.content.Context context) {
        this.mContext = context;
        this.hostPackageName = context.getPackageName();
        this.hostVersionCode = com.tencent.tmassistantsdk.util.GlobalUtil.getAppVersionCode(this.mContext);
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().setContext(this.mContext);
        this.sdkAPILevel = 2;
        android.content.Context context2 = this.mContext;
        if (context2 != null) {
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).registerIQQDownloaderOpenSDKListener(this);
            com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.getInstance().registeReceiver(this.mContext);
            com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.getInstance().registeListener(this);
        }
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().registerReceiver();
        com.tencent.tmassistantsdk.logreport.GetSettingEngine.getInstance().sendRequest();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().reportLog();
    }

    @Override // com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.IQQDownloaderInstalled
    public synchronized void onQQDownloaderInstalled(android.content.Context context) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "received qqdownload install broadcase!");
        java.util.concurrent.CopyOnWriteArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> copyOnWriteArrayList = this.mTaskList;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam next = it.next();
                if (next != null) {
                    try {
                        getDownloadTaskState(next);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                    }
                    this.mTaskList.remove(next);
                }
            }
        }
    }

    public void releaseIPCConnected() {
        android.content.Context context = this.mContext;
        if (context != null) {
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context).releaseIPCClient();
        }
    }

    public void startToAppDetail(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18, int i17) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        if (z17) {
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
        }
        if (tMQQDownloaderOpenSDKParam != null) {
            java.lang.String formatOplist = super.formatOplist(z17, z18);
            int i18 = 1 != i17 ? 4 : 1;
            addToTaskList(tMQQDownloaderOpenSDKParam);
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam, i18, formatOplist, tMQQDownloaderOpenSDKParam.actionFlag, null);
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void startToAuthorized(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (tMQQDownloaderOpenSDKParam != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            addToTaskList(tMQQDownloaderOpenSDKParam);
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam, 3, super.formatOplist(true, true), tMQQDownloaderOpenSDKParam.actionFlag, str);
            return;
        }
        throw new java.lang.Exception("QQDownloaderParam param cann't be null!");
    }

    public int startToBatchUpdateOperation(android.content.Context context, java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> arrayList, boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        int qQDownloadApiLevel = com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK.getQQDownloadApiLevel(context);
        boolean z18 = true;
        if (qQDownloadApiLevel <= 0) {
            return 1;
        }
        if (qQDownloadApiLevel < 4) {
            return 2;
        }
        if (arrayList != null && arrayList.size() != 0) {
            z18 = false;
        }
        int batchRequestType = getBatchRequestType(z18, i17);
        if (!com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleBatchRequestAction(batchRequestType, arrayList, str, str2, str3)) {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, "handleBatchRequestAction return false with batchRequestType=" + batchRequestType);
        }
        return 0;
    }

    public void startToDownloadTaskList(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18, int i17) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (tMQQDownloaderOpenSDKParam == null) {
            return;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        if (z17) {
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.requestUrl = "";
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
        }
        if (tMQQDownloaderOpenSDKParam != null) {
            java.lang.String formatOplist = super.formatOplist(z17, z18);
            int i18 = 1 == i17 ? 2 : 5;
            addToTaskList(tMQQDownloaderOpenSDKParam);
            com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(this.mContext).handleDownloadTask(tMQQDownloaderOpenSDKParam, i18, formatOplist, tMQQDownloaderOpenSDKParam.actionFlag, null);
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK
    public void startToWebView(android.content.Context context, java.lang.String str) {
        android.content.Context context2;
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception("param url shouldn't be null!");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        java.lang.String formatIntentUriPath = super.formatIntentUriPath(5, hashMap);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "startToWebView finalPath:" + formatIntentUriPath);
        if (android.text.TextUtils.isEmpty(str) || (context2 = this.mContext) == null) {
            return;
        }
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).handleUriAction(formatIntentUriPath);
    }

    public void startToAuthorized(android.content.Context context, java.lang.String str) {
        android.content.Context context2;
        java.lang.String formatEncryptUrl = super.formatEncryptUrl(str);
        if (android.text.TextUtils.isEmpty(str) || (context2 = this.mContext) == null) {
            return;
        }
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getInstance(context2).handleUriAction(formatEncryptUrl);
    }
}

package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class TMQQDownloaderOpenSDK extends com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK implements com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK {
    public static final java.lang.String AUTHORITY = "com.tencent.android.qqdownloader.provider";
    public static final android.net.Uri CONTENT_URI = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.CONTENT_URI;
    protected static final java.lang.String TAG = "QQDownloaderOpenSDK";
    protected static com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK mInstance;
    private byte _hellAccFlag_;
    java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> mDownloadParams;
    protected int sdkAPILevel = 1;

    private TMQQDownloaderOpenSDK() {
        this.mDownloadParams = null;
        this.mDownloadParams = new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.lang.String about() {
        return "TMQQDownloaderOpenSDK_2014_05_13_17_36_release_35169";
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK getInstance() {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK;
        synchronized (com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK();
            }
            tMQQDownloaderOpenSDK = mInstance;
        }
        return tMQQDownloaderOpenSDK;
    }

    public static boolean isExistActoin(long j17) {
        java.util.ArrayList<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> channelDataItemList;
        if (j17 >= 0 && (channelDataItemList = new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel().getChannelDataItemList()) != null && channelDataItemList.size() > 0) {
            java.util.Iterator<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> it = channelDataItemList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem next = it.next();
                if (next.mDBIdentity == j17 && next.mDataItemEndTime - next.mDataItemStartTime <= 300000) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFileExist(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return !m17.a() ? false : m17.f213266a.F(m17.f213267b);
    }

    private void relateToQQDownloader(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, false, false);
        formatMapParams.put("taskid", str);
        java.lang.String formatIntentUriPath = super.formatIntentUriPath(4, formatMapParams);
        android.content.Intent intent = new android.content.Intent("com.tencent.android.qqdownloader.action.RELATED");
        intent.setPackage("com.tencent.android.qqdownloader");
        intent.putExtra("command", "cmd_updatedownload");
        intent.putExtra("relatedurl", formatIntentUriPath);
        context.sendBroadcast(intent);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK
    public long addDownloadTaskFromAppDetail(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        if (this.mDownloadParams != null && tMQQDownloaderOpenSDKParam != null) {
            this.mDownloadParams.put(java.util.UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z17, z18, tMQQDownloaderOpenSDKParam.actionFlag, null, 2);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public long addDownloadTaskFromAuthorize(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str) {
        if (this.mDownloadParams != null && tMQQDownloaderOpenSDKParam != null) {
            this.mDownloadParams.put(java.util.UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, true, true, tMQQDownloaderOpenSDKParam.actionFlag, str, 3);
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public long addDownloadTaskFromTaskList(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        if (this.mDownloadParams != null && tMQQDownloaderOpenSDKParam != null) {
            this.mDownloadParams.put(java.util.UUID.randomUUID().toString(), tMQQDownloaderOpenSDKParam);
        }
        return super.buildAddDBData(tMQQDownloaderOpenSDKParam, z17, z18, tMQQDownloaderOpenSDKParam.actionFlag, null, 1);
    }

    public int checkQQDownloaderInstalled(int i17) {
        android.content.Context context = this.mContext;
        if (context == null) {
            throw new java.lang.Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
                    return 1;
                }
                return (this.sdkAPILevel <= com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getQQDownloaderAPILevel() && i17 <= com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getQQDownloaderVersionCode()) ? 0 : 2;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 1;
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void destroyQQDownloaderOpenSDK() {
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().unregisterReceiver();
        com.tencent.tmassistantsdk.logreport.GetSettingEngine.getInstance().cancleRequest();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().cancleReport();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().destory();
        if (this.mContext != null) {
            com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.getInstance().unRegisteReceiver(this.mContext);
            com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.getInstance().removeDownloadStateChangedListener(this);
        }
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().destroy();
        this.mContext = null;
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo;
        boolean z17;
        android.database.Cursor query;
        android.content.Context context = this.mContext;
        if (context == null) {
            throw new java.lang.Exception("Context shouldn't be null !");
        }
        if (tMQQDownloaderOpenSDKParam == null) {
            throw new java.lang.Exception("QQDownloaderParam param cann't is null!");
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.database.Cursor cursor = null;
        r6 = null;
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo2 = null;
        cursor = null;
        try {
            try {
                z17 = true;
                query = contentResolver.query(CONTENT_URI, null, "packageName=? and versionCode=? and channelId=?", new java.lang.String[]{tMQQDownloaderOpenSDKParam.taskPackageName, java.lang.String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion), tMQQDownloaderOpenSDKParam.channelId}, null);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                try {
                    com.tencent.tmassistantsdk.util.TMLog.d(TAG, "getDownloadTaskState from qqdownloader , taskPackageName = " + tMQQDownloaderOpenSDKParam.taskPackageName + ", taskVersion=" + java.lang.String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion) + ", channelId=" + tMQQDownloaderOpenSDKParam.channelId);
                    if (query != null && query.moveToFirst()) {
                        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "relate to qqdownloader , packageName = " + tMQQDownloaderOpenSDKParam.taskPackageName);
                        long j17 = query.getLong(query.getColumnIndex(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.APKID));
                        java.lang.String str = com.tencent.tmassistantsdk.util.GlobalUtil.String2List(query.getString(query.getColumnIndex(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.APPURLS))).get(0);
                        java.lang.String string = query.getString(query.getColumnIndex(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH));
                        long j18 = query.getLong(query.getColumnIndex(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.RECEIVEDLENGTH));
                        long j19 = query.getLong(query.getColumnIndex(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.TOTALLENGTH));
                        int assistantState2SDKState = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(query.getInt(query.getColumnIndex("state")));
                        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "getDownloadTaskState state = " + assistantState2SDKState);
                        if (4 == assistantState2SDKState && !isFileExist(string)) {
                            query.close();
                            return null;
                        }
                        tMAssistantDownloadTaskInfo = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo(str, string, assistantState2SDKState, j18, j19, "application/vnd.android.package-archive");
                        if (assistantState2SDKState == 5 || assistantState2SDKState == 4 || assistantState2SDKState == 3) {
                            try {
                                com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
                                createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
                                createNewChunkLogInfo.appId = java.lang.String.valueOf(j17);
                                createNewChunkLogInfo.resultState = assistantState2SDKState;
                                createNewChunkLogInfo.requestUrl = str;
                                com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                cursor = query;
                                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e, "", new java.lang.Object[0]);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return tMAssistantDownloadTaskInfo;
                            }
                        }
                        java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
                        if (map != null) {
                            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam>> it = map.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                }
                                com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam value = it.next().getValue();
                                if (value != null && value.taskPackageName.equals(tMQQDownloaderOpenSDKParam.taskPackageName) && value.taskVersion == tMQQDownloaderOpenSDKParam.taskVersion) {
                                    break;
                                }
                            }
                            if (!z17) {
                                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "relate to qqdownloader , packageName = " + tMQQDownloaderOpenSDKParam.taskPackageName);
                                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                                tMQQDownloaderOpenSDKParam.taskApkId = java.lang.String.valueOf(j17);
                                this.mDownloadParams.put(uuid, tMQQDownloaderOpenSDKParam);
                                relateToQQDownloader(this.mContext, tMQQDownloaderOpenSDKParam, uuid);
                            }
                        }
                        tMAssistantDownloadTaskInfo2 = tMAssistantDownloadTaskInfo;
                    }
                    if (query == null) {
                        return tMAssistantDownloadTaskInfo2;
                    }
                    query.close();
                    return tMAssistantDownloadTaskInfo2;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    tMAssistantDownloadTaskInfo = null;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            tMAssistantDownloadTaskInfo = null;
        }
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void initQQDownloaderOpenSDK(android.content.Context context) {
        this.mContext = context;
        this.hostPackageName = context.getPackageName();
        this.hostVersionCode = com.tencent.tmassistantsdk.util.GlobalUtil.getAppVersionCode(this.mContext);
        com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().setContext(this.mContext);
        this.sdkAPILevel = 1;
        com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.getInstance().registeReceiver(this.mContext);
        com.tencent.tmassistantsdk.openSDK.DownloadStateChangedReceiver.getInstance().addDownloadStateChangedListener(this);
        com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver.getInstance().registerReceiver();
        com.tencent.tmassistantsdk.logreport.GetSettingEngine.getInstance().sendRequest();
        com.tencent.tmassistantsdk.logreport.LogReportManager.getInstance().reportLog();
    }

    @Override // com.tencent.tmassistantsdk.openSDK.IDownloadStateChangedListener
    public void onDownloadStateChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderStateChangeParam tMQQDownloaderStateChangeParam) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = tMQQDownloaderStateChangeParam.param;
        int assistantState2SDKState = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(tMQQDownloaderStateChangeParam.state);
        int assistantErrorCode2SDKErrorCode = com.tencent.tmassistantsdk.util.GlobalUtil.assistantErrorCode2SDKErrorCode(tMQQDownloaderStateChangeParam.errorCode);
        java.lang.String str = tMQQDownloaderStateChangeParam.errorMsg;
        java.lang.String str2 = tMQQDownloaderStateChangeParam.taskId;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onDownloadStateChanged state = " + assistantState2SDKState);
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam2 = (str2 == null || str2.trim().length() <= 0) ? null : this.mDownloadParams.get(str2);
        if (tMQQDownloaderOpenSDKParam2 != null) {
            onStateChanged(tMQQDownloaderOpenSDKParam2, assistantState2SDKState, assistantErrorCode2SDKErrorCode, str);
        } else {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onDownloadStateChanged storeParam = null");
        }
        if (6 == assistantState2SDKState) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> entry : this.mDownloadParams.entrySet()) {
                com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam value = entry.getValue();
                java.lang.String key = entry.getKey();
                if (value != null && !android.text.TextUtils.isEmpty(tMQQDownloaderOpenSDKParam.taskPackageName) && value.taskPackageName.equals(tMQQDownloaderOpenSDKParam.taskPackageName) && value.taskVersion == tMQQDownloaderOpenSDKParam.taskVersion) {
                    arrayList.add(key);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.mDownloadParams.remove((java.lang.String) it.next());
            }
        }
    }

    public void startQQDownloader(android.content.Context context) {
        if (context != null) {
            android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.android.qqdownloader");
            if (context instanceof android.app.Application) {
                launchIntentForPackage.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(launchIntentForPackage);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startQQDownloader", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void startToAppDetail(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
        if (map != null) {
            map.put(uuid, tMQQDownloaderOpenSDKParam);
        }
        if (z17) {
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
        }
        java.util.Map<java.lang.String, java.lang.String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, z17, z18);
        formatMapParams.put("taskid", uuid);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.formatIntentUriPath(2, formatMapParams)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAppDetail", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK, com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void startToAuthorized(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (tMQQDownloaderOpenSDKParam != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
            if (map != null) {
                map.put(uuid, tMQQDownloaderOpenSDKParam);
            }
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            createNewChunkLogInfo.resultState = 1;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
            java.util.Map<java.lang.String, java.lang.String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, true, true);
            formatMapParams.put("verifytype", str);
            formatMapParams.put("taskid", uuid);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.formatIntentUriPath(3, formatMapParams)));
            if (context instanceof android.app.Application) {
                intent.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        throw new java.lang.Exception("QQDownloaderParam param cann't be null!");
    }

    @Override // com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK
    public void startToDownloadTaskList(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        if (tMQQDownloaderOpenSDKParam == null) {
            return;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        java.util.Map<java.lang.String, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> map = this.mDownloadParams;
        if (map != null) {
            map.put(uuid, tMQQDownloaderOpenSDKParam);
        }
        if (z17) {
            com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo createNewChunkLogInfo = com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().createNewChunkLogInfo((byte) 1);
            createNewChunkLogInfo.UUID = uuid;
            createNewChunkLogInfo.requestUrl = "";
            createNewChunkLogInfo.via = tMQQDownloaderOpenSDKParam.via;
            createNewChunkLogInfo.appId = tMQQDownloaderOpenSDKParam.taskAppId;
            com.tencent.tmassistantsdk.logreport.DownloadReportManager.getInstance().addLogData(createNewChunkLogInfo);
        }
        java.util.Map<java.lang.String, java.lang.String> formatMapParams = super.formatMapParams(tMQQDownloaderOpenSDKParam, z17, z18);
        formatMapParams.put("taskid", uuid);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(super.formatIntentUriPath(1, formatMapParams)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDKParam;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.tmassistantsdk.openSDK.BaseQQDownloaderOpenSDK
    public void startToWebView(android.content.Context context, java.lang.String str) {
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
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(formatIntentUriPath));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToWebView", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public long addDownloadTaskFromAuthorize(java.lang.String str) {
        java.lang.String formatEncryptUrl = super.formatEncryptUrl(str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatEncryptUrl, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    public void startToAuthorized(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(formatEncryptUrl(str)));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK", "startToAuthorized", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

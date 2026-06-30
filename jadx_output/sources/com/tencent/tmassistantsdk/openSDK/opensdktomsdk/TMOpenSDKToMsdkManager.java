package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

/* loaded from: classes13.dex */
public class TMOpenSDKToMsdkManager {
    protected static final java.lang.String CLIENT_NAME = "downloadSDKClient";
    protected static final java.lang.String TAG = "OpensdkToMsdkManager";
    protected static com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager mInstance;
    protected android.content.Context mContext;
    protected com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest mHttpRequest = null;
    protected com.tencent.tmassistantsdk.openSDK.opensdktomsdk.ITMOpenSDKToMsdkListener mToMsdkListener = null;
    protected com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo mAuthorizedInfo = null;
    protected java.lang.String mDownloadUrl = null;
    protected int mSupportVersionCode = 0;
    protected int authorizedState = 0;
    protected boolean hasNotify = false;
    protected boolean isInstallFinished = false;
    protected long insertActionId = -1;
    protected com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel sdkChannel = null;
    protected com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog dialog = null;
    protected com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK mOpenSDK = null;
    protected android.os.HandlerThread mSubMessagehandlerThread = null;
    protected com.tencent.mm.sdk.platformtools.n3 mSubMessageHandler = null;
    protected com.tencent.mm.sdk.platformtools.n3 mMainMessageHandler = null;
    protected com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient mClient = null;
    protected com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner mRequestListener = new com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.2
        @Override // com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner
        public void onGetAuthorizedRequestFinished(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult authorizedResult, int i17) {
            android.os.Message message = new android.os.Message();
            if (i17 != 0) {
                message.what = 5;
                message.obj = java.lang.Integer.valueOf(i17);
            } else {
                if (authorizedResult == null) {
                    return;
                }
                message.what = 4;
                message.obj = authorizedResult;
            }
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
        }
    };
    protected android.view.View.OnClickListener retryBtnListener = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.4
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo = tMOpenSDKToMsdkManager.mAuthorizedInfo;
            if (tMOpenSDKAuthorizedInfo == null) {
                return;
            }
            android.content.Context context = tMOpenSDKToMsdkManager.mContext;
            if (context != null) {
                tMOpenSDKToMsdkManager.getUserAuthorizedInfo(tMOpenSDKAuthorizedInfo, context);
            }
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.dialog.dismiss();
        }
    };
    protected android.view.View.OnClickListener negativeBtnListenner = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.5
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.dialog.isShowing()) {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.dialog.dismiss();
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mHttpRequest = null;
            }
            com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
            createTipsInfoLog.cancelBtnClickCount++;
            com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
            try {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                if (tMOpenSDKToMsdkManager.mClient != null) {
                    tMOpenSDKToMsdkManager.pauseDownloadTask(tMOpenSDKToMsdkManager.mDownloadUrl);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
            }
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
            if (tMOpenSDKToMsdkManager2.authorizedState == 2) {
                tMOpenSDKToMsdkManager2.notifyAuthorizedFinished(true, tMOpenSDKToMsdkManager2.mAuthorizedInfo);
            } else {
                tMOpenSDKToMsdkManager2.notifyAuthorizedFinished(false, tMOpenSDKToMsdkManager2.mAuthorizedInfo);
            }
        }
    };
    protected android.view.View.OnClickListener positiveBtnListener = new android.view.View.OnClickListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.6
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mContext == null) {
                return;
            }
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton = (com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton) view.getTag();
            try {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                int checkQQDownloaderInstalled = tMOpenSDKToMsdkManager.mOpenSDK.checkQQDownloaderInstalled(tMOpenSDKToMsdkManager.mSupportVersionCode);
                if (checkQQDownloaderInstalled == 0) {
                    try {
                        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.startToQQDownloaderAuthorized(actionButton.jumpUrl);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
                    }
                } else if (checkQQDownloaderInstalled == 1) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                    tMOpenSDKToMsdkManager2.startDownloadTask(tMOpenSDKToMsdkManager2.mDownloadUrl, actionButton.jumpUrl);
                } else if (checkQQDownloaderInstalled == 2) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager3 = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                    tMOpenSDKToMsdkManager3.startDownloadTask(tMOpenSDKToMsdkManager3.mDownloadUrl, actionButton.jumpUrl);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e18, "", new java.lang.Object[0]);
            }
        }
    };
    protected com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener mDownloadSDKListener = new com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9
        @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
        public void OnDownloadSDKTaskProgressChanged(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, java.lang.String str, long j17, long j18) {
            android.os.Message message = new android.os.Message();
            message.what = 1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("receiveDataLen", j17);
            bundle.putLong("totalDataLen", j18);
            message.setData(bundle);
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
        }

        @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
        public void OnDownloadSDKTaskStateChanged(final com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, final java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, "OnDownloadSDKTaskStateChanged client:" + tMAssistantDownloadSDKClient + " | state:" + i17 + " | errorcode:" + i18 + " | errorMsg:" + str2);
            if (tMAssistantDownloadSDKClient == null || android.text.TextUtils.isEmpty(str)) {
                return;
            }
            if (4 == i17) {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mSubMessageHandler.post(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            java.lang.String str3 = tMAssistantDownloadSDKClient.getDownloadTaskState(str).mSavePath;
                            if (android.text.TextUtils.isEmpty(str3)) {
                                return;
                            }
                            android.os.Message message = new android.os.Message();
                            message.what = 0;
                            message.obj = str3;
                            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
                        }
                    }
                });
            } else if (5 == i17) {
                android.os.Message message = new android.os.Message();
                message.what = 3;
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
            }
        }

        @Override // com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener
        public void OnDwonloadSDKServiceInvalid(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient) {
        }
    };

    private TMOpenSDKToMsdkManager(android.content.Context context) {
        this.mContext = null;
        this.mContext = context;
    }

    public static java.lang.String about() {
        return "TMOpenSDKToMsdkManager_2014_04_01_19_51_release_25434";
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager getInstance(android.content.Context context) {
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager;
        synchronized (com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager(context);
            }
            tMOpenSDKToMsdkManager = mInstance;
        }
        return tMOpenSDKToMsdkManager;
    }

    public void continueDownload() {
        this.mSubMessageHandler.post(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.getClient().getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mDownloadUrl);
                    if (downloadTaskState != null) {
                        int i17 = downloadTaskState.mState;
                        if (i17 == 3) {
                            android.os.Message message = new android.os.Message();
                            message.what = 6;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putLong("receiveDataLen", downloadTaskState.mReceiveDataLen);
                            bundle.putLong("totalDataLen", downloadTaskState.mTotalDataLen);
                            message.setData(bundle);
                            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                        } else if (i17 == 4) {
                            android.os.Message message2 = new android.os.Message();
                            message2.what = 0;
                            message2.arg1 = 1;
                            message2.obj = downloadTaskState.mSavePath;
                            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message2);
                        }
                    }
                    if (downloadTaskState == null || downloadTaskState.mState != 4) {
                        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                        createTipsInfoLog.downloadTipsCount++;
                        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                    } else {
                        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog2 = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                        createTipsInfoLog2.installTipsCount++;
                        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog2);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient getClient() {
        android.content.Context context = this.mContext;
        if (context == null) {
            return null;
        }
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = this.mClient;
        if (tMAssistantDownloadSDKClient != null) {
            return tMAssistantDownloadSDKClient;
        }
        com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient downloadSDKClient = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).getDownloadSDKClient(CLIENT_NAME);
        downloadSDKClient.registerDownloadTaskListener(this.mDownloadSDKListener);
        this.mClient = downloadSDKClient;
        return downloadSDKClient;
    }

    public void getUserAuthorizedInfo(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo, android.content.Context context) {
        if (context != null) {
            this.mContext = context;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "getUserAuthorizedInfo method called!");
        this.hasNotify = false;
        com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest getAuthorizedHttpRequest = this.mHttpRequest;
        if (getAuthorizedHttpRequest != null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mHttpRequest != null, request didn't finish!");
            return;
        }
        if (tMOpenSDKAuthorizedInfo == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "AuthorizedInfo object is null!");
            return;
        }
        this.mAuthorizedInfo = tMOpenSDKAuthorizedInfo;
        if (getAuthorizedHttpRequest == null) {
            this.authorizedState = 1;
            com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest getAuthorizedHttpRequest2 = new com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest();
            this.mHttpRequest = getAuthorizedHttpRequest2;
            getAuthorizedHttpRequest2.setListenner(this.mRequestListener);
            this.mHttpRequest.sendRequest(tMOpenSDKAuthorizedInfo);
        }
    }

    public void handleDownloadContinue(long j17, long j18) {
        android.content.Context context = this.mContext;
        if (context == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloading context = null!");
            return;
        }
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(context);
        java.lang.String string = this.mContext.getString(res.string("white_list_positive_continue"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        float f17 = (float) j18;
        sb6.append((int) ((((float) (100 * j17)) + 0.0f) / f17));
        sb6.append("%)");
        java.lang.String sb7 = sb6.toString();
        this.dialog.downloadText.setText(string + sb7);
        android.widget.ProgressBar progressBar = this.dialog.downloadProgressBar;
        progressBar.setProgress((int) (((((float) j17) + 0.0f) / f17) * ((float) progressBar.getMax())));
        if (this.dialog.downloadProgressBar.getProgress() > 0) {
            this.dialog.setPositiveBtnBgResource(res.drawable("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    public void handleDownloadFailed() {
        android.content.Context context = this.mContext;
        if (context == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloading context = null!");
            return;
        }
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(context);
        this.dialog.setPositiveBtnEnable(true);
        this.dialog.downloadText.setText(this.mContext.getString(res.string("white_list_positive_retry")));
        if (this.dialog.downloadProgressBar.getProgress() > 0) {
            this.dialog.setPositiveBtnBgResource(res.drawable("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    public void handleDownloading(long j17, long j18) {
        android.content.Context context = this.mContext;
        if (context == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloading context = null!");
            return;
        }
        java.lang.String string = this.mContext.getString(new com.tencent.tmassistantsdk.util.Res(context).string("white_list_positive_downloading"));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        float f17 = (float) j18;
        sb6.append((int) ((((float) (100 * j17)) + 0.0f) / f17));
        sb6.append("%)");
        java.lang.String sb7 = sb6.toString();
        this.dialog.downloadText.setText(string + sb7);
        android.widget.ProgressBar progressBar = this.dialog.downloadProgressBar;
        progressBar.setProgress((int) (((((float) j17) + 0.0f) / f17) * ((float) progressBar.getMax())));
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloading : receivedlen:" + j17 + " | totalLen:" + j18);
    }

    public void handleInstall(java.lang.String str, int i17) {
        android.content.Context context = this.mContext;
        if (context == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(context);
        this.dialog.setPositiveBtnEnable(true);
        this.dialog.downloadText.setText(this.mContext.getString(res.string("white_list_positive_install")));
        android.content.Context context2 = this.mContext;
        if (context2 == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloading context = null!");
            return;
        }
        this.isInstallFinished = true;
        if (i17 == 1) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.n1.d(context2, str, null, false);
    }

    public void initOpenSDK(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.ITMOpenSDKToMsdkListener iTMOpenSDKToMsdkListener) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK.getInstance();
        this.mOpenSDK = tMQQDownloaderOpenSDK;
        tMQQDownloaderOpenSDK.initQQDownloaderOpenSDK(this.mContext);
        this.mToMsdkListener = iTMOpenSDKToMsdkListener;
        this.sdkChannel = new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel();
        this.mSubMessageHandler = new com.tencent.mm.sdk.platformtools.n3("OpenSDKToMsdkManager");
        this.mMainMessageHandler = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.sdk.platformtools.k3() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                android.os.Bundle data;
                int i17 = message.what;
                if (i17 == 0) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.handleInstall(message.obj.toString(), message.arg1);
                    return false;
                }
                if (i17 == 1) {
                    android.os.Bundle data2 = message.getData();
                    if (data2 == null) {
                        return false;
                    }
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.handleDownloading(data2.getLong("receiveDataLen"), data2.getLong("totalDataLen"));
                    return false;
                }
                if (i17 == 3) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.handleDownloadFailed();
                    return false;
                }
                if (i17 == 4) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult authorizedResult = (com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult) message.obj;
                    if (authorizedResult == null) {
                        return false;
                    }
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.onNetworkFinishedSuccess(authorizedResult);
                    return false;
                }
                if (i17 == 5) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.onNetworkFinishedFailed(((java.lang.Integer) message.obj).intValue());
                    return false;
                }
                if (i17 != 6 || (data = message.getData()) == null) {
                    return false;
                }
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.handleDownloadContinue(data.getLong("receiveDataLen"), data.getLong("totalDataLen"));
                return false;
            }
        });
    }

    public boolean isExitsAction(long j17) {
        com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel tMAssistantSDKChannel;
        if (j17 < 0 || (tMAssistantSDKChannel = this.sdkChannel) == null) {
            return false;
        }
        java.util.Iterator<com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem> it = tMAssistantSDKChannel.getChannelDataItemList().iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem next = it.next();
            if (next.mDBIdentity == j17 && next.mDataItemEndTime - next.mDataItemStartTime <= 300000) {
                return true;
            }
        }
        return false;
    }

    public void notifyAuthorizedFinished(boolean z17, com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "before realy notifyAuthorizedFinished: TMOpenSDKAuthorizedInfo:" + this.mAuthorizedInfo);
        if (this.mToMsdkListener == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "before notifyAuthorizedFinished: mToMsdkListener = null !");
        }
        if (this.mToMsdkListener == null || this.mAuthorizedInfo == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "notifyAuthorizedFinished: result:" + z17);
        this.mToMsdkListener.onAuthorizedFinished(z17, this.mAuthorizedInfo);
        this.mHttpRequest = null;
        this.hasNotify = true;
    }

    public void onDestroy() {
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog popDialog = this.dialog;
        if (popDialog != null && popDialog.isShowing()) {
            this.dialog.dismiss();
        }
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = this.mOpenSDK;
        if (tMQQDownloaderOpenSDK != null) {
            tMQQDownloaderOpenSDK.destroyQQDownloaderOpenSDK();
        }
        this.mToMsdkListener = null;
        this.hasNotify = false;
        this.isInstallFinished = false;
        this.authorizedState = 0;
        this.mHttpRequest = null;
        this.mAuthorizedInfo = null;
        this.sdkChannel = null;
        this.insertActionId = -1L;
        android.content.Context context = this.mContext;
        if (context != null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.closeAllService(context);
        }
        this.mClient = null;
    }

    public void onNetworkException(int i17) {
        android.content.Context context = this.mContext;
        if (context == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(context);
        java.lang.String string = 1 == i17 ? this.mContext.getString(res.string("white_list_network_not_connected")) : this.mContext.getString(res.string("white_list_network_error"));
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo();
        tipsInfo.title = this.mContext.getString(res.string("white_list_dlg_title"));
        tipsInfo.content = string;
        java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton> arrayList = new java.util.ArrayList<>();
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton();
        actionButton.jumpType = 3;
        arrayList.add(actionButton);
        java.lang.String string2 = this.mContext.getString(res.string("white_list_negtive_known"));
        actionButton.textInstalled = string2;
        actionButton.textUninstalled = string2;
        tipsInfo.actionButton = arrayList;
        showDialog(tipsInfo);
        this.mHttpRequest = null;
        this.mDownloadUrl = "";
        this.authorizedState = 3;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "network error happened!");
        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
        createTipsInfoLog.networkErrorTipsCount++;
        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
    }

    public void onNetworkFinishedFailed(int i17) {
        if (i17 == 606 || i17 == 602 || i17 == 601 || i17 == 704) {
            onServerException(i17);
        } else {
            onNetworkException(i17);
        }
    }

    public void onNetworkFinishedSuccess(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult authorizedResult) {
        this.mDownloadUrl = authorizedResult.downloadUrl;
        this.mSupportVersionCode = authorizedResult.versionCode;
        this.mHttpRequest = null;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onNetworkFinishedSuccess! authorizedResult.hasAuthoried=" + authorizedResult.hasAuthoried + "  listenner:" + this.mToMsdkListener + "  authroizedinfo:" + this.mAuthorizedInfo);
        if (authorizedResult.hasAuthoried == 1) {
            this.authorizedState = 2;
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo = authorizedResult.tipsInfo;
            if (tipsInfo != null) {
                showDialog(tipsInfo);
                return;
            } else {
                notifyAuthorizedFinished(true, this.mAuthorizedInfo);
                return;
            }
        }
        this.authorizedState = 3;
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo2 = authorizedResult.tipsInfo;
        if (tipsInfo2 != null) {
            showDialog(tipsInfo2);
        } else {
            onServerException(authorizedResult.errorCode);
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "not in white list and no tips!");
        }
    }

    public void onResume() {
        int i17;
        android.content.Context context;
        tryToCloseDialog();
        if (this.hasNotify || (i17 = this.authorizedState) == 2) {
            return;
        }
        if ((i17 == 3 || i17 == 0) && (context = this.mContext) != null) {
            getUserAuthorizedInfo(this.mAuthorizedInfo, context);
        }
    }

    public void onServerException(int i17) {
        android.content.Context context = this.mContext;
        if (context == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(context);
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo();
        tipsInfo.title = this.mContext.getString(res.string("white_list_dlg_title"));
        if (i17 == 602 || i17 == 601) {
            tipsInfo.content = this.mContext.getString(res.string("white_list_network_error"));
        } else {
            tipsInfo.content = this.mContext.getString(res.string("white_list_server_error"));
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton> arrayList = new java.util.ArrayList<>();
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton();
        actionButton.jumpType = 4;
        java.lang.String string = this.mContext.getString(res.string("white_list_positive_retry_again"));
        actionButton.textInstalled = string;
        actionButton.textUninstalled = string;
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton2 = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton();
        actionButton2.jumpType = 3;
        java.lang.String string2 = this.mContext.getString(res.string("white_list_negtive"));
        actionButton2.textInstalled = string2;
        actionButton2.textUninstalled = string2;
        arrayList.add(actionButton);
        arrayList.add(actionButton2);
        tipsInfo.actionButton = arrayList;
        showDialog(tipsInfo);
        this.mHttpRequest = null;
        this.mDownloadUrl = "";
        this.authorizedState = 3;
        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
        createTipsInfoLog.networkErrorTipsCount++;
        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
    }

    public void pauseDownloadTask(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || this.mAuthorizedInfo == null) {
            return;
        }
        this.mSubMessageHandler.post(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.8
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient client = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.getClient();
                try {
                    if (client.getDownloadTaskState(str) != null) {
                        client.pauseDownloadTask(str);
                    } else {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, "getDownloadTaskState taskinfo is null!");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    public void showDialog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo) {
        java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton> arrayList;
        if (this.mContext == null) {
            return;
        }
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog popDialog = this.dialog;
        if (popDialog == null || !popDialog.isShowing()) {
            android.content.Context context = this.mContext;
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "context is finishing!  context" + this.mContext);
                return;
            }
            com.tencent.tmassistantsdk.util.Res res = new com.tencent.tmassistantsdk.util.Res(this.mContext);
            if (tipsInfo == null || (arrayList = tipsInfo.actionButton) == null || arrayList.size() <= 0) {
                return;
            }
            com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog popDialog2 = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog(this.mContext, res.style("while_list_dialog"), arrayList.size());
            this.dialog = popDialog2;
            popDialog2.show();
            this.dialog.setTitle(tipsInfo.title);
            this.dialog.setContent(tipsInfo.content);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton = arrayList.get(i17);
                int i18 = actionButton.jumpType;
                if (i18 == 3) {
                    this.dialog.setNegativeBtnText(actionButton.textInstalled);
                    this.dialog.setNegativeBtnClickListener(this.negativeBtnListenner);
                } else if (i18 == 4) {
                    this.dialog.setPositiveBtnText(actionButton.textUninstalled);
                    this.dialog.setPositiveBtnClickListener(this.retryBtnListener);
                } else {
                    try {
                        int checkQQDownloaderInstalled = this.mOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
                        if (checkQQDownloaderInstalled == 0) {
                            this.dialog.setPositiveBtnText(actionButton.textInstalled);
                            com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
                            createTipsInfoLog.authorizedTipsCount++;
                            com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                        } else if (checkQQDownloaderInstalled == 1) {
                            this.dialog.setPositiveBtnText(actionButton.textUninstalled);
                            continueDownload();
                        } else if (checkQQDownloaderInstalled == 2) {
                            this.dialog.setPositiveBtnText(this.mContext.getString(res.string("white_list_positive_update")));
                            continueDownload();
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                    }
                    this.dialog.setPositiveBtnTag(actionButton);
                    this.dialog.setPositiveBtnClickListener(this.positiveBtnListener);
                }
            }
        }
    }

    public void startDownloadTask(final java.lang.String str, final java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.dialog.setPositiveBtnEnable(false);
        this.mSubMessageHandler.post(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.7
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                if (tMOpenSDKToMsdkManager.mContext != null && tMOpenSDKToMsdkManager.mOpenSDK != null && !android.text.TextUtils.isEmpty(str2)) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this;
                    tMOpenSDKToMsdkManager2.insertActionId = tMOpenSDKToMsdkManager2.mOpenSDK.addDownloadTaskFromAuthorize(str2);
                }
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient client = com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.getClient();
                if (client == null) {
                    return;
                }
                try {
                    int startDownloadTask = client.startDownloadTask(str, "application/vnd.android.package-archive");
                    if (4 == startDownloadTask) {
                        java.lang.String str3 = client.getDownloadTaskState(str).mSavePath;
                        android.os.Message message = new android.os.Message();
                        message.what = 0;
                        message.obj = str3;
                        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                    } else if (startDownloadTask == 0) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, "start success!");
                    } else if (1 == startDownloadTask) {
                        android.os.Message message2 = new android.os.Message();
                        message2.what = 5;
                        message2.obj = 1;
                        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message2);
                    } else {
                        android.os.Message message3 = new android.os.Message();
                        message3.what = 3;
                        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message3);
                    }
                    if (startDownloadTask == 4) {
                        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                        createTipsInfoLog.installBtnClickCount++;
                        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                    } else {
                        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog2 = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                        createTipsInfoLog2.downloadBtnClickCount++;
                        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog2);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.TAG, e17, "", new java.lang.Object[0]);
                }
            }
        });
    }

    public void startToQQDownloaderAuthorized(java.lang.String str) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK;
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.mHttpRequest = null;
        this.isInstallFinished = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog = com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
        createTipsInfoLog.authorizedBtnClickCount++;
        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
        android.content.Context context = this.mContext;
        if (context == null || (tMQQDownloaderOpenSDK = this.mOpenSDK) == null) {
            return;
        }
        tMQQDownloaderOpenSDK.startToAuthorized(context, str);
    }

    public void tryToCloseDialog() {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = this.mOpenSDK;
        if (tMQQDownloaderOpenSDK == null || this.mContext == null) {
            return;
        }
        try {
            int checkQQDownloaderInstalled = tMQQDownloaderOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
            if (this.isInstallFinished && checkQQDownloaderInstalled == 0) {
                this.mHttpRequest = null;
                this.isInstallFinished = false;
                this.mDownloadUrl = null;
                if (this.dialog.isShowing()) {
                    this.dialog.dismiss();
                }
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.closeAllService(this.mContext);
                this.mClient = null;
                if (isExitsAction(this.insertActionId)) {
                    this.mOpenSDK.startQQDownloader(this.mContext);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }
}

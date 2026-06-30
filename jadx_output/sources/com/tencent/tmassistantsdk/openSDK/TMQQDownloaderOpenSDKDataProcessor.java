package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class TMQQDownloaderOpenSDKDataProcessor implements com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener {
    protected static final java.lang.String TAG = "QQDownloaderOpenSDKDataProcessor";
    protected static com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor mOpenSDKDataProcessor;
    protected com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient openSDKClient = null;
    protected com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener callback = null;
    java.lang.String clientKey = java.util.UUID.randomUUID().toString();

    public TMQQDownloaderOpenSDKDataProcessor() {
    }

    private static com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam QQParam2BasePram(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam) {
        if (tMQQDownloaderOpenSDKParam == null) {
            return null;
        }
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam iPCBaseParam = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam();
        iPCBaseParam.hostAppId = tMQQDownloaderOpenSDKParam.SNGAppId;
        iPCBaseParam.taskAppId = tMQQDownloaderOpenSDKParam.taskAppId;
        iPCBaseParam.taskPackageName = tMQQDownloaderOpenSDKParam.taskPackageName;
        iPCBaseParam.taskVersion = java.lang.String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion);
        iPCBaseParam.uin = tMQQDownloaderOpenSDKParam.uin;
        iPCBaseParam.uinType = tMQQDownloaderOpenSDKParam.uinType;
        iPCBaseParam.via = tMQQDownloaderOpenSDKParam.via;
        iPCBaseParam.channelId = tMQQDownloaderOpenSDKParam.channelId;
        return iPCBaseParam;
    }

    private com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam baseParam2QQParam(com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam iPCBaseParam) {
        if (iPCBaseParam == null) {
            return null;
        }
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam();
        tMQQDownloaderOpenSDKParam.SNGAppId = iPCBaseParam.hostAppId;
        tMQQDownloaderOpenSDKParam.taskAppId = iPCBaseParam.taskAppId;
        tMQQDownloaderOpenSDKParam.taskPackageName = iPCBaseParam.taskPackageName;
        try {
            tMQQDownloaderOpenSDKParam.taskVersion = java.lang.Integer.valueOf(iPCBaseParam.taskVersion).intValue();
        } catch (java.lang.Exception unused) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "baseParam2QQParam Integer.valueOf(baseParam.taskVersion) NumberFormatException occur");
        }
        tMQQDownloaderOpenSDKParam.uin = iPCBaseParam.uin;
        tMQQDownloaderOpenSDKParam.uinType = iPCBaseParam.uinType;
        tMQQDownloaderOpenSDKParam.via = iPCBaseParam.via;
        tMQQDownloaderOpenSDKParam.channelId = iPCBaseParam.channelId;
        return tMQQDownloaderOpenSDKParam;
    }

    public static com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest buildBatchActionRequest(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest batchDownloadActionRequest = new com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest();
        batchDownloadActionRequest.batchRequestType = i17;
        if (str != null) {
            batchDownloadActionRequest.via = str;
        }
        if (str2 != null) {
            batchDownloadActionRequest.uin = str2;
        }
        if (str3 != null) {
            batchDownloadActionRequest.uinType = str3;
        }
        batchDownloadActionRequest.batchData = new java.util.ArrayList<>();
        if (arrayList != null) {
            str4 = "appList {appList.size=" + arrayList.size() + "\n";
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam QQParam2BasePram = QQParam2BasePram(arrayList.get(i18));
                com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam iPCDownloadParam = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam();
                iPCDownloadParam.baseParam = QQParam2BasePram;
                batchDownloadActionRequest.batchData.add(iPCDownloadParam);
                str4 = str4 + "element:" + i18 + "IPCDownloadParam {IPCBaseParam {hostAppId:" + iPCDownloadParam.baseParam.hostAppId + "|taskAppId:" + iPCDownloadParam.baseParam.taskAppId + "|taskPackageName:" + iPCDownloadParam.baseParam.taskPackageName + "|taskVersion:" + iPCDownloadParam.baseParam.taskVersion + "}|actionFlag:" + iPCDownloadParam.actionFlag + "|verifyType:" + iPCDownloadParam.verifyType + "}\n";
            }
        } else {
            str4 = "appList {";
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, str4 + "}");
        return batchDownloadActionRequest;
    }

    public static byte[] buildSendData(com.qq.taf.jce.JceStruct jceStruct) {
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest buildIpcRequest = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.buildIpcRequest(jceStruct);
        if (buildIpcRequest == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleUriAction IPCRequest = null");
            return null;
        }
        byte[] buildPostData = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.buildPostData(buildIpcRequest);
        if (buildPostData != null && buildPostData.length > 0) {
            return buildPostData;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleUriAction sendData = null");
        return null;
    }

    public static synchronized com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor getInstance(android.content.Context context) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor tMQQDownloaderOpenSDKDataProcessor;
        synchronized (com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.class) {
            if (mOpenSDKDataProcessor == null) {
                mOpenSDKDataProcessor = new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor(context);
            }
            tMQQDownloaderOpenSDKDataProcessor = mOpenSDKDataProcessor;
        }
        return tMQQDownloaderOpenSDKDataProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo> getBatchTaskInfos(java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBatchTaskInfos appList.size:"
            r3.<init>(r4)
            int r4 = r18.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "QQDownloaderOpenSDKDataProcessor"
            com.tencent.tmassistantsdk.util.TMLog.i(r4, r3)
            r3 = 3
            r5 = r19
            r6 = r20
            r7 = r21
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest r0 = buildBatchActionRequest(r3, r0, r5, r6, r7)
            byte[] r0 = buildSendData(r0)
            r3 = 0
            if (r0 == 0) goto L51
            int r5 = r0.length
            if (r5 <= 0) goto L51
            com.tencent.tmassistantsdk.util.GlobalUtil r5 = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance()     // Catch: java.lang.Throwable -> L48
            android.content.Context r5 = r5.getContext()     // Catch: java.lang.Throwable -> L48
            r1.getOpenSDKClient(r5)     // Catch: java.lang.Throwable -> L48
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r5 = r1.openSDKClient     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L56
            byte[] r0 = r5.sendSyncData(r0)     // Catch: java.lang.Throwable -> L48
            goto L57
        L48:
            r0 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r5, r3)
            return r2
        L51:
            java.lang.String r0 = "getBatchTaskInfos sendData = null or length = 0"
            com.tencent.tmassistantsdk.util.TMLog.i(r4, r0)
        L56:
            r0 = r2
        L57:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r0 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackPackage(r0)
            if (r0 == 0) goto Le2
            com.qq.taf.jce.JceStruct r0 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackBodyStruct(r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse r0 = (com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse) r0
            if (r0 == 0) goto Ldc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getBatchTaskInfos BatchDownloadActionResponse batchRequestType:"
            r5.<init>(r6)
            int r6 = r0.batchRequestType
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            if (r6 == 0) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "response.batchData.size:"
            r2.append(r5)
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r5 = r0.batchData
            int r5 = r5.size()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L98:
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            int r6 = r6.size()
            if (r3 >= r6) goto Ld7
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.batchData
            java.lang.Object r6 = r6.get(r3)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo r6 = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo) r6
            int r7 = r6.state
            int r11 = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(r7)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r7 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r9 = r6.url
            java.lang.String r10 = r6.savePath
            long r12 = r6.receivedLen
            long r14 = r6.totalLen
            java.lang.String r16 = "application/vnd.android.package-archive"
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r14, r16)
            r5.add(r7)
            int r3 = r3 + 1
            goto L98
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r3 = "response.batchData = null"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5 = r2
            r2 = r0
        Ld7:
            com.tencent.tmassistantsdk.util.TMLog.i(r4, r2)
            r2 = r5
            goto Le7
        Ldc:
            java.lang.String r0 = "getBatchTaskInfos BatchDownloadActionResponse response = null"
            com.tencent.tmassistantsdk.util.TMLog.i(r4, r0)
            goto Le7
        Le2:
            java.lang.String r0 = "getBatchTaskInfos IPCResponse resp = null"
            com.tencent.tmassistantsdk.util.TMLog.i(r4, r0)
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getBatchTaskInfos(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTask(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDownloadTask param.sngAppid:"
            r0.<init>(r1)
            java.lang.String r1 = r11.SNGAppId
            r0.append(r1)
            java.lang.String r1 = "|param.appid:"
            r0.append(r1)
            java.lang.String r1 = r11.taskAppId
            r0.append(r1)
            java.lang.String r1 = "| param.taskPackageName:"
            r0.append(r1)
            java.lang.String r1 = r11.taskPackageName
            r0.append(r1)
            java.lang.String r1 = "|param.taskVersion:"
            r0.append(r1)
            int r1 = r11.taskVersion
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QQDownloaderOpenSDKDataProcessor"
            com.tencent.tmassistantsdk.util.TMLog.i(r1, r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam r11 = QQParam2BasePram(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest r0 = new com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest
            r0.<init>()
            r0.baseParam = r11
            byte[] r11 = buildSendData(r0)
            r0 = 0
            if (r11 == 0) goto L69
            int r2 = r11.length
            if (r2 <= 0) goto L69
            com.tencent.tmassistantsdk.util.GlobalUtil r2 = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance()     // Catch: java.lang.Throwable -> L5f
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L5f
            r10.getOpenSDKClient(r2)     // Catch: java.lang.Throwable -> L5f
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r2 = r10.openSDKClient     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L6e
            byte[] r11 = r2.sendSyncData(r11)     // Catch: java.lang.Throwable -> L5f
            goto L6f
        L5f:
            r11 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r11, r3, r2)
            return r0
        L69:
            java.lang.String r11 = "getDownloadTask sendData = null"
            com.tencent.tmassistantsdk.util.TMLog.i(r1, r11)
        L6e:
            r11 = r0
        L6f:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r11 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackPackage(r11)
            if (r11 == 0) goto La3
            com.qq.taf.jce.JceStruct r11 = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackBodyStruct(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse r11 = (com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "QueryDownloadTaskResponse downloadTask:"
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.tmassistantsdk.util.TMLog.i(r1, r0)
            int r0 = r11.state
            int r4 = com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(r0)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r0 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r2 = r11.url
            java.lang.String r3 = r11.savePath
            long r5 = r11.receivedLen
            long r7 = r11.totalLen
            java.lang.String r9 = "application/vnd.android.package-archive"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r7, r9)
            return r0
        La3:
            java.lang.String r11 = "getDownloadTask IPCResponse = null"
            com.tencent.tmassistantsdk.util.TMLog.i(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor.getDownloadTask(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam):com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo");
    }

    public synchronized void getOpenSDKClient(android.content.Context context) {
        if (this.openSDKClient == null && context != null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient downloadOpenSDKClient = com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).getDownloadOpenSDKClient(this.clientKey);
            this.openSDKClient = downloadOpenSDKClient;
            if (downloadOpenSDKClient != null) {
                downloadOpenSDKClient.addAssistantOnActionListener(this);
            }
        }
    }

    public boolean handleBatchRequestAction(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleBatchUpdateAction batchRequestType:" + i17 + "|appList:" + arrayList);
        byte[] buildSendData = buildSendData(buildBatchActionRequest(i17, arrayList, str, str2, str3));
        if (buildSendData == null || buildSendData.length <= 0) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleBatchUpdateAction sendData = null or length = 0");
            return false;
        }
        try {
            getOpenSDKClient(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext());
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient == null) {
                return false;
            }
            tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean handleDownloadTask(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloadTask requestType:" + i17 + "  param.sngAppid:" + tMQQDownloaderOpenSDKParam.SNGAppId + "|param.appid:" + tMQQDownloaderOpenSDKParam.taskAppId + "| param.taskPackageName:" + tMQQDownloaderOpenSDKParam.taskPackageName + "|param.taskVersion:" + tMQQDownloaderOpenSDKParam.taskVersion + "| param.actionFlag:" + str2 + " | verifyType:" + str3);
        com.tencent.tmassistantsdk.openSDK.param.jce.OperateDownloadTaskRequest operateDownloadTaskRequest = new com.tencent.tmassistantsdk.openSDK.param.jce.OperateDownloadTaskRequest();
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam QQParam2BasePram = QQParam2BasePram(tMQQDownloaderOpenSDKParam);
        operateDownloadTaskRequest.requestType = i17;
        operateDownloadTaskRequest.baseParam = QQParam2BasePram;
        operateDownloadTaskRequest.actionFlag = str2;
        operateDownloadTaskRequest.verifyType = str3;
        operateDownloadTaskRequest.opList = str;
        byte[] buildSendData = buildSendData(operateDownloadTaskRequest);
        if (buildSendData == null || buildSendData.length <= 0) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleDownloadTask sendData = null");
            return false;
        }
        try {
            getOpenSDKClient(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext());
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient == null) {
                return false;
            }
            tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean handleUriAction(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] buildSendData = buildSendData(new com.tencent.tmassistantsdk.openSDK.param.jce.URIActionRequest(str));
        if (buildSendData == null || buildSendData.length <= 0) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "handleUriAction sendData = null");
            return false;
        }
        try {
            getOpenSDKClient(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext());
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = this.openSDKClient;
            if (tMAssistantDownloadOpenSDKClient != null) {
                tMAssistantDownloadOpenSDKClient.sendAsyncData(buildSendData);
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener
    public void onActionResult(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onActionResult reponseData = null");
            return;
        }
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse unpackPackage = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackPackage(bArr);
        com.qq.taf.jce.JceStruct unpackBodyStruct = com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.unpackBodyStruct(unpackPackage);
        int i17 = unpackPackage.head.cmdId;
        if (i17 == 2) {
            if (unpackBodyStruct != null) {
                onStateChanged((com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadStateResponse) unpackBodyStruct);
            }
        } else if (i17 != 3) {
            if (i17 != 8) {
                return;
            }
            onServiceFreed();
        } else if (unpackBodyStruct != null) {
            onProgressChanged((com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse) unpackBodyStruct);
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.IAssistantOnActionListener
    public void onDownloadSDKServiceInvalid() {
        com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = this.callback;
        if (iTMQQDownloaderOpenSDKListener != null) {
            iTMQQDownloaderOpenSDKListener.OnQQDownloaderInvalid();
        }
        android.content.Context context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext();
        if (context != null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
        }
        this.openSDKClient = null;
    }

    public void onProgressChanged(com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse getDownloadProgressResponse) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam baseParam2QQParam = baseParam2QQParam(getDownloadProgressResponse.requestParam);
        if (baseParam2QQParam == null || this.callback == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "进度回调：GetDownloadProgressResponse response.receivedLen:" + getDownloadProgressResponse.receivedLen + ",response.totalLen" + getDownloadProgressResponse.totalLen);
        this.callback.OnDownloadTaskProgressChanged(baseParam2QQParam, getDownloadProgressResponse.receivedLen, getDownloadProgressResponse.totalLen);
    }

    public void onServiceFreed() {
        com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = this.callback;
        if (iTMQQDownloaderOpenSDKListener != null) {
            iTMQQDownloaderOpenSDKListener.OnServiceFree();
        }
    }

    public void onStateChanged(com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadStateResponse getDownloadStateResponse) {
        com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam baseParam2QQParam = baseParam2QQParam(getDownloadStateResponse.requestParam);
        if (baseParam2QQParam == null || this.callback == null) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "状态回调：GetDownloadStateResponse param.taskAppId:" + baseParam2QQParam.taskAppId + ",param.taskPackageName:" + baseParam2QQParam.taskPackageName + ",state:" + getDownloadStateResponse.state + ",response.errorCode" + getDownloadStateResponse.errorCode);
        this.callback.OnDownloadTaskStateChanged(baseParam2QQParam, com.tencent.tmassistantsdk.util.GlobalUtil.assistantState2SDKState(getDownloadStateResponse.state), com.tencent.tmassistantsdk.util.GlobalUtil.assistantErrorCode2SDKErrorCode(getDownloadStateResponse.errorCode), getDownloadStateResponse.errorMsg);
    }

    public void registerIQQDownloaderOpenSDKListener(com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        this.callback = iTMQQDownloaderOpenSDKListener;
    }

    public void releaseIPCClient() {
        if (this.openSDKClient != null) {
            android.content.Context context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext();
            if (context != null) {
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
            }
            this.openSDKClient = null;
        }
    }

    public void unregisterIQQDownloaderOpenSDKListener() {
        this.callback = null;
        android.content.Context context = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext();
        if (context != null) {
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient(this.clientKey);
        }
        this.openSDKClient = null;
    }

    private TMQQDownloaderOpenSDKDataProcessor(android.content.Context context) {
        if (context != null) {
            getOpenSDKClient(context);
        }
    }
}

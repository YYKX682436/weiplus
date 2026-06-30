package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPPlayerMgr {
    public static final java.lang.String BEACON_LOG_HOST_KEY = "beacon_log_host";
    public static final java.lang.String BEACON_POLICY_HOST_KEY = "beacon_policy_host";
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int INVALID_CELLULAR_FLOW = -1;
    public static final int INVALID_SUGGEST_BITRATE = -1;
    public static final java.lang.String PLYAER_HOST_KEY = "player_host_config";
    public static final java.lang.String PROPERTY_AB_USER_ID = "PROPERTY_AbUserId";
    public static final java.lang.String PROPERTY_ENABLE_DATA_REPORT = "PROPERTY_EnableDataReport";
    public static final java.lang.String PROPERTY_ENABLE_NEW_REPORT = "PROPERTY_EnableNewReport";
    public static final java.lang.String PROPERTY_ENABLE_PLAYER_REPORT = "PROPERTY_EnablePlayerReport";
    public static final java.lang.String PROPERTY_MEDIA_DRM_REUSE = "PROPERTY_MediaDrmReuse";
    public static final java.lang.String PROPERTY_PROXY_MAX_USE_MEMORY_MB = "PROPERTY_ProxyMaxUseMemoryMB";
    public static final java.lang.String PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT = "PROPERTY_VideoMediaCodecCoexistMaxCnt";
    public static final java.lang.String PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL = "PROPERTY_WidevineProvisioningServerUrl";
    public static final java.lang.String PROXY_HOST_KEY = "httpproxy_config";
    private static final java.lang.String TAG = "TPThumbPlayer[TPPlayerMgr.java]";
    public static final java.lang.String TP_DOWNLOAD_PROXY_MODULE_NAME = "DownloadProxy";
    public static final java.lang.String TP_PLAYERCORE_MODULE_NAME = "TPCore";
    private static android.content.Context mAppContext;
    private static final java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>> mBooleanPropertyNameToPropertyHandlerTables;
    private static final java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Integer>> mIntegerPropertyNameToPropertyHandlerTables;
    private static boolean mIsInit;
    private static final java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Long>> mLongPropertyNameToPropertyHandlerTables;
    private static final java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String>> mStringPropertyNameToPropertyHandlerTables;
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> mBoolPropertyNameToValueCache = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> mIntegerPropertyNameToValueCache = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.String> mStringPropertyNameToValueCache = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> mLongPropertyNameToValueCache = new java.util.HashMap<>();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface BooleanProperty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface EventId {
    }

    /* loaded from: classes16.dex */
    public interface ITPPropertyHandler<T> {
        T getPropertyValue();

        void setPropertyValue(T t17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface IntegerProperty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LongProperty {
    }

    /* loaded from: classes13.dex */
    public interface OnLogListener {
        int d(java.lang.String str, java.lang.String str2);

        int e(java.lang.String str, java.lang.String str2);

        int i(java.lang.String str, java.lang.String str2);

        int v(java.lang.String str, java.lang.String str2);

        int w(java.lang.String str, java.lang.String str2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface StringProperty {
    }

    static {
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>> hashMap = new java.util.HashMap<>();
        mBooleanPropertyNameToPropertyHandlerTables = hashMap;
        hashMap.put(PROPERTY_MEDIA_DRM_REUSE, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Boolean getPropertyValue() {
                return java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getMediaDrmReuseEnable());
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Boolean bool) {
                com.tencent.thumbplayer.config.TPPlayerConfig.setMediaDrmReuseEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_DATA_REPORT, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Boolean getPropertyValue() {
                return java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.isDataReportEnable());
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Boolean bool) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, "set data report enable : " + bool);
                com.tencent.thumbplayer.config.TPPlayerConfig.setDataReportEnable(bool.booleanValue());
                com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().updateDataReportEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_PLAYER_REPORT, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Boolean getPropertyValue() {
                return java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.isPlayerReportEnable());
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Boolean bool) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, "set player report enable : " + bool);
                com.tencent.thumbplayer.config.TPPlayerConfig.setPlayerReportEnable(bool.booleanValue());
            }
        });
        hashMap.put(PROPERTY_ENABLE_NEW_REPORT, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Boolean getPropertyValue() {
                return java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getNewReportEnable());
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Boolean bool) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, "set new report enable : " + bool);
                com.tencent.thumbplayer.config.TPPlayerConfig.setNewReportEnable(bool.booleanValue());
            }
        });
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String>> hashMap2 = new java.util.HashMap<>();
        mStringPropertyNameToPropertyHandlerTables = hashMap2;
        hashMap2.put(PROPERTY_AB_USER_ID, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.10
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.String getPropertyValue() {
                return com.tencent.thumbplayer.config.TPPlayerConfig.getAbUserId();
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.String str) {
                com.tencent.thumbplayer.config.TPPlayerConfig.setAbUserId(str);
            }
        });
        hashMap2.put(PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.11
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.String getPropertyValue() {
                return com.tencent.thumbplayer.config.TPPlayerConfig.getWidevineProvisioningServerUrl();
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.String str) {
                com.tencent.thumbplayer.config.TPPlayerConfig.setWidevineProvisioningServerUrl(str);
            }
        });
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Integer>> hashMap3 = new java.util.HashMap<>();
        mIntegerPropertyNameToPropertyHandlerTables = hashMap3;
        hashMap3.put(PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Integer>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Integer getPropertyValue() {
                return java.lang.Integer.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getVideoMediaCodecCoexistMaxCnt());
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Integer num) {
                com.tencent.thumbplayer.config.TPPlayerConfig.setVideoMediaCodecCoexistMaxCnt(num.intValue());
            }
        });
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Long>> hashMap4 = new java.util.HashMap<>();
        mLongPropertyNameToPropertyHandlerTables = hashMap4;
        hashMap4.put(PROPERTY_PROXY_MAX_USE_MEMORY_MB, new com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Long>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public java.lang.Long getPropertyValue() {
                return java.lang.Long.valueOf(com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getProxyConfig(com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getDefaultServiceType()).maxUseMemoryMB);
            }

            @Override // com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler
            public void setPropertyValue(java.lang.Long l17) {
                com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setMaxUseMemoryMB(l17.longValue());
                com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().updateMaxUseMemoryMB(l17.longValue());
            }
        });
    }

    private static void dumpStackTrace() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Current stack trace: ");
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, stackTraceElement.toString());
        }
    }

    public static android.content.Context getAppContext() {
        return mAppContext;
    }

    public static int getCellularDataCost() {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy;
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter playerProxy = com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().getPlayerProxy(com.tencent.thumbplayer.config.TPPlayerConfig.getProxyServiceType());
        if (playerProxy == null || (downloadProxy = playerProxy.getDownloadProxy()) == null) {
            return -1;
        }
        return com.tencent.thumbplayer.utils.TPCommonUtils.optInt(downloadProxy.getNativeInfo(2), -1);
    }

    public static java.lang.String getLibVersion(java.lang.String str) {
        if (!mIsInit) {
            throw new java.lang.IllegalStateException("player not initialized");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.equals("DownloadProxy")) {
                return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getNativeLibVersion();
            }
            if (str.equals(TP_PLAYERCORE_MODULE_NAME)) {
                return com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.getLibVersion();
            }
        }
        throw new java.lang.IllegalArgumentException("libName:" + str);
    }

    public static int getOfflineRecordDurationMs(java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getRecordDuration(str, str2);
    }

    public static java.lang.String getOfflineRecordVinfo(java.lang.String str, java.lang.String str2) {
        return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.checkVideoStatus(str, str2);
    }

    public static synchronized boolean getPropertyBoolean(java.lang.String str, boolean z17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            java.lang.Boolean bool = mBoolPropertyNameToValueCache.get(str);
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        }
        return z17;
    }

    public static synchronized int getPropertyInteger(java.lang.String str, int i17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            java.lang.Integer num = mIntegerPropertyNameToValueCache.get(str);
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return i17;
    }

    public static synchronized long getPropertyLong(java.lang.String str, long j17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            java.lang.Long l17 = mLongPropertyNameToValueCache.get(str);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        }
        return j17;
    }

    public static synchronized java.lang.String getPropertyString(java.lang.String str, java.lang.String str2) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            java.lang.String str3 = mStringPropertyNameToValueCache.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public static int getSuggestedBitrate() {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy;
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter playerProxy = com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().getPlayerProxy(com.tencent.thumbplayer.config.TPPlayerConfig.getProxyServiceType());
        if (playerProxy == null || (downloadProxy = playerProxy.getDownloadProxy()) == null) {
            return -1;
        }
        return com.tencent.thumbplayer.utils.TPCommonUtils.optInt(downloadProxy.getNativeInfo(0), -1);
    }

    public static java.lang.String getThumbPlayerVersion() {
        return com.tencent.thumbplayer.config.TPPlayerConfig.VERSION;
    }

    private static java.util.concurrent.Future<java.lang.Boolean> initAsyncWithWait() {
        return com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainSingleThreadExecutor().submit(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Boolean call() {
                com.tencent.thumbplayer.api.TPPlayerMgr.initInAsyncThread();
                return java.lang.Boolean.TRUE;
            }
        });
    }

    private static void initAsyncWithoutWait() {
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.thumbplayer.utils.TPElapsedTimeStatistics tPElapsedTimeStatistics = new com.tencent.thumbplayer.utils.TPElapsedTimeStatistics();
                tPElapsedTimeStatistics.startPoint();
                com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.init();
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait  nativeKeyMap init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
                com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getInstance().init(com.tencent.thumbplayer.api.TPPlayerMgr.mAppContext);
                com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.init();
                new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager().reportSync();
                com.tencent.thumbplayer.api.TPPlayerMgr.setExternalProperties();
                com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, "Init SDK, initAsyncWithoutWait all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initInAsyncThread() {
        com.tencent.thumbplayer.utils.TPElapsedTimeStatistics tPElapsedTimeStatistics = new com.tencent.thumbplayer.utils.TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.init(mAppContext.getApplicationContext());
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait  TPBeaconReportWrapper init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPointAndPoint());
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.init(mAppContext);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait  TPDrmCapability init, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPointAndPoint());
        com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.init(mAppContext, true);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, initAsyncWithWait all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static synchronized void initSdk(android.content.Context context, java.lang.String str, int i17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            dumpStackTrace();
            if (mIsInit) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, has init sdk");
                return;
            }
            mIsInit = true;
            com.tencent.thumbplayer.utils.TPElapsedTimeStatistics tPElapsedTimeStatistics = new com.tencent.thumbplayer.utils.TPElapsedTimeStatistics();
            tPElapsedTimeStatistics.startPoint();
            preInitSync(context, str, i17);
            java.util.concurrent.Future<java.lang.Boolean> initAsyncWithWait = initAsyncWithWait();
            initSync();
            initAsyncWithoutWait();
            tPElapsedTimeStatistics.point();
            try {
                try {
                    if (initAsyncWithWait.get().booleanValue()) {
                        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, TPPlayer  wait initSync finish, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
                    }
                } catch (java.util.concurrent.ExecutionException unused) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Init SDK, TPPlayer wait initSync ExecutionException, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
                }
            } catch (java.lang.InterruptedException unused2) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Init SDK, TPPlayer wait initSync InterruptedException, times: " + tPElapsedTimeStatistics.costTimeMsFromLastPoint());
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, TPPlayer all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
        }
    }

    private static void initSync() {
        com.tencent.thumbplayer.utils.TPElapsedTimeStatistics tPElapsedTimeStatistics = new com.tencent.thumbplayer.utils.TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(mAppContext);
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, initSync so load times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static boolean isProxyEnable() {
        return com.tencent.thumbplayer.datatransport.config.TPProxyConfig.isProxyEnable() && com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.isReadyForPlay();
    }

    public static boolean isThumbPlayerEnable() {
        return com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }

    public static void postEvent(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.postGlobalEvent(i17, i18, i19, obj);
    }

    private static void preInitSync(android.content.Context context, java.lang.String str, int i17) {
        com.tencent.thumbplayer.utils.TPElapsedTimeStatistics tPElapsedTimeStatistics = new com.tencent.thumbplayer.utils.TPElapsedTimeStatistics();
        tPElapsedTimeStatistics.startPoint();
        mAppContext = context.getApplicationContext();
        com.tencent.thumbplayer.config.TPPlayerConfig.setGuid(str);
        com.tencent.thumbplayer.config.TPPlayerConfig.setPlatform(i17);
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setDefaultServiceType(i17);
        com.tencent.thumbplayer.core.common.TPNativeLog.setLogCallback(new com.tencent.thumbplayer.core.common.ITPNativeLogCallback() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.1
            @Override // com.tencent.thumbplayer.core.common.ITPNativeLogCallback
            public void onPrintLog(int i18, java.lang.String str2, java.lang.String str3) {
                if (i18 == 0) {
                    com.tencent.thumbplayer.utils.TPLogUtil.v(str2, str3);
                    return;
                }
                if (i18 == 1) {
                    com.tencent.thumbplayer.utils.TPLogUtil.d(str2, str3);
                    return;
                }
                if (i18 == 2) {
                    com.tencent.thumbplayer.utils.TPLogUtil.i(str2, str3);
                } else if (i18 == 3) {
                    com.tencent.thumbplayer.utils.TPLogUtil.w(str2, str3);
                } else {
                    if (i18 != 4) {
                        return;
                    }
                    com.tencent.thumbplayer.utils.TPLogUtil.e(str2, str3);
                }
            }
        });
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Init SDK, preInitSync all times: " + tPElapsedTimeStatistics.costTimeMsFromStartPoint());
    }

    public static void setDebugEnable(boolean z17) {
        com.tencent.thumbplayer.config.TPPlayerConfig.setDebugEnable(z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setExternalProperties() {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : mBoolPropertyNameToValueCache.entrySet()) {
                com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(entry.getKey());
                if (iTPPropertyHandler != null) {
                    iTPPropertyHandler.setPropertyValue(entry.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry2 : mIntegerPropertyNameToValueCache.entrySet()) {
                com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Integer> iTPPropertyHandler2 = mIntegerPropertyNameToPropertyHandlerTables.get(entry2.getKey());
                if (iTPPropertyHandler2 != null) {
                    iTPPropertyHandler2.setPropertyValue(entry2.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : mStringPropertyNameToValueCache.entrySet()) {
                com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String> iTPPropertyHandler3 = mStringPropertyNameToPropertyHandlerTables.get(entry3.getKey());
                if (iTPPropertyHandler3 != null) {
                    iTPPropertyHandler3.setPropertyValue(entry3.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry4 : mLongPropertyNameToValueCache.entrySet()) {
                com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Long> iTPPropertyHandler4 = mLongPropertyNameToPropertyHandlerTables.get(entry4.getKey());
                if (iTPPropertyHandler4 != null) {
                    iTPPropertyHandler4.setPropertyValue(entry4.getValue());
                }
            }
        }
    }

    public static void setHost(java.lang.String str) {
        com.tencent.thumbplayer.config.TPPlayerConfig.parseHostConfig(str);
    }

    public static void setLibLoader(final com.tencent.thumbplayer.api.ITPModuleLoader iTPModuleLoader) {
        if (mIsInit) {
            throw new java.lang.IllegalStateException("player has init");
        }
        com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.setLibLoader(new com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.4
            @Override // com.tencent.thumbplayer.core.common.ITPNativeLibraryExternalLoader
            public boolean loadLib(java.lang.String str, java.lang.String str2) {
                com.tencent.thumbplayer.api.ITPModuleLoader iTPModuleLoader2 = com.tencent.thumbplayer.api.ITPModuleLoader.this;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, th6);
                    return false;
                }
            }
        });
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.setNativeLibLoader(new com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.5
            @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader
            public boolean loadLib(java.lang.String str, java.lang.String str2) {
                com.tencent.thumbplayer.api.ITPModuleLoader iTPModuleLoader2 = com.tencent.thumbplayer.api.ITPModuleLoader.this;
                if (iTPModuleLoader2 == null) {
                    return false;
                }
                try {
                    iTPModuleLoader2.loadLibrary(str, str2);
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.api.TPPlayerMgr.TAG, th6);
                    return false;
                }
            }
        });
    }

    public static void setOnLogListener(com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener onLogListener) {
        com.tencent.thumbplayer.utils.TPLogUtil.setOnLogListener(onLogListener);
    }

    public static void setOutNetIP(java.lang.String str) {
        com.tencent.thumbplayer.config.TPPlayerConfig.setOutNetIp(str);
    }

    public static synchronized void setPropertyBool(java.lang.String str, boolean z17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            if (!mIsInit) {
                mBoolPropertyNameToValueCache.put(str, java.lang.Boolean.valueOf(z17));
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Boolean> iTPPropertyHandler = mBooleanPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.setPropertyValue(java.lang.Boolean.valueOf(z17));
                mBoolPropertyNameToValueCache.put(str, java.lang.Boolean.valueOf(z17));
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    public static synchronized void setPropertyInteger(java.lang.String str, int i17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            if (!mIsInit) {
                mIntegerPropertyNameToValueCache.put(str, java.lang.Integer.valueOf(i17));
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Integer> iTPPropertyHandler = mIntegerPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.setPropertyValue(java.lang.Integer.valueOf(i17));
                mIntegerPropertyNameToValueCache.put(str, java.lang.Integer.valueOf(i17));
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    public static synchronized void setPropertyLong(java.lang.String str, long j17) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            if (!mIsInit) {
                mLongPropertyNameToValueCache.put(str, java.lang.Long.valueOf(j17));
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.Long> iTPPropertyHandler = mLongPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.setPropertyValue(java.lang.Long.valueOf(j17));
                mLongPropertyNameToValueCache.put(str, java.lang.Long.valueOf(j17));
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    public static synchronized void setPropertyString(java.lang.String str, java.lang.String str2) {
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            if (!mIsInit) {
                mStringPropertyNameToValueCache.put(str, str2);
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMgr.ITPPropertyHandler<java.lang.String> iTPPropertyHandler = mStringPropertyNameToPropertyHandlerTables.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.setPropertyValue(str2);
                mStringPropertyNameToValueCache.put(str, str2);
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    public static void setProxyConfig(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setProxyConfig(i17, str, str2);
    }

    public static void setProxyEnable(boolean z17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setProxyEnable(z17);
    }

    public static void setProxyMaxStorageSizeMB(long j17) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setProxyMaxStorageSize: " + j17 + " MB.");
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setMaxUseStorageMB(j17);
        com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().updateMaxStorageSizeMB(j17);
    }

    public static void setProxyServiceType(int i17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setDefaultServiceType(i17);
    }

    public static void setProxyVodCachedEnable(int i17, boolean z17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setVodCachedEnable(i17, z17);
        com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().updateVodCachedEnable(i17, z17);
    }

    public static void setTPProxyAdapter(com.tencent.thumbplayer.core.downloadproxy.api.ITPProxyAdapter iTPProxyAdapter) {
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.setTPProxyAdapter(iTPProxyAdapter);
    }

    public static void setUpcInfo(java.lang.String str, int i17) {
        com.tencent.thumbplayer.config.TPPlayerConfig.setUserUpc(str);
        com.tencent.thumbplayer.config.TPPlayerConfig.setUserUpcState(i17);
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.postGlobalEvent(com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED, i17, 0, str);
    }

    public static void setUserInfo(java.lang.String str, boolean z17) {
        com.tencent.thumbplayer.config.TPPlayerConfig.setUserUin(str);
        com.tencent.thumbplayer.config.TPPlayerConfig.setUserIsVip(z17);
    }

    @java.lang.Deprecated
    public static synchronized boolean getPropertyBoolean(java.lang.String str) {
        boolean propertyBoolean;
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            propertyBoolean = getPropertyBoolean(str, false);
        }
        return propertyBoolean;
    }

    @java.lang.Deprecated
    public static synchronized int getPropertyInteger(java.lang.String str) {
        int propertyInteger;
        synchronized (com.tencent.thumbplayer.api.TPPlayerMgr.class) {
            propertyInteger = getPropertyInteger(str, 0);
        }
        return propertyInteger;
    }

    @java.lang.Deprecated
    public static long getPropertyLong(java.lang.String str) {
        return getPropertyLong(str, 0L);
    }

    @java.lang.Deprecated
    public static java.lang.String getPropertyString(java.lang.String str) {
        return getPropertyString(str, "");
    }

    public static void setProxyMaxStorageSizeMB(int i17, long j17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setMaxUseStorageMB(i17, j17);
        com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().updateMaxStorageSizeMB(i17, j17);
    }

    public static void initSdk(android.content.Context context, com.tencent.thumbplayer.api.TPInitParams tPInitParams) {
        com.tencent.thumbplayer.core.common.TPSystemInfo.setDeviceName(tPInitParams.getDeviceName());
        initSdk(context, tPInitParams.getGuid(), tPInitParams.getPlatform());
    }
}

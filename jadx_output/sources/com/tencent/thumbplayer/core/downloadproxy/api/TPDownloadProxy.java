package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public class TPDownloadProxy implements com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy {
    private static final java.lang.String FILE_NAME = "TPDownloadProxy";
    private android.net.ConnectivityManager mConnectivityManager;
    private java.lang.String mCurrentStoragePath = "";
    private boolean mIsInit = false;
    private android.net.ConnectivityManager.NetworkCallback mNetworkCallback;
    private int mServiceType;

    public TPDownloadProxy(int i17) {
        this.mServiceType = i17;
    }

    private void registerNetworkConnectivity(android.content.Context context) {
        if (context == null) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, context is null, can not set interface 4g");
            return;
        }
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.mConnectivityManager = connectivityManager;
        if (connectivityManager == null) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, connectivityManager is null, can not set interface 4g");
            return;
        }
        android.net.NetworkRequest build = builder.build();
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                super.onAvailable(network);
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setNetwork(network);
                long networkHandle = network.getNetworkHandle();
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, net_id_t: " + networkHandle);
                com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.this.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, java.lang.Long.valueOf(networkHandle));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                super.onLost(network);
                com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.this.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, 0);
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network failed");
            }
        };
        this.mNetworkCallback = networkCallback;
        this.mConnectivityManager.requestNetwork(build, networkCallback);
    }

    private void unregisterNetworkConnectivity() {
        android.net.ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().checkResourceStatus(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(java.lang.String str, java.lang.String str2, int i17) {
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().clearCache(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            this.mIsInit = false;
            unregisterNetworkConnectivity();
            return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().deInitService(this.mServiceType);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "deinit failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getClipPlayUrl(int i17, int i18, int i19) {
        java.lang.String str = "";
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                str = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getClipPlayUrl(i17, i18, i19));
                if (i19 != 2) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().startDownload(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th6.toString());
            }
        }
        return str;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getNativeInfo(int i17) {
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getNativeInfo(i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getPlayErrorCodeStr(int i17) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getErrorCodeStr(i17));
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th6.toString());
            }
        }
        return "";
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getPlayUrl(int i17, int i18) {
        java.lang.String str = "";
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                str = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString(com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getClipPlayUrl(i17, 1, i18));
                if (i18 != 2) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().startDownload(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th6.toString());
            }
        }
        return str;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(java.lang.String str, java.lang.String str2) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().getResourceSize(str, str2);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th6.toString());
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public synchronized int init(android.content.Context context, com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam tPDLProxyInitParam) {
        int initService;
        if (this.mIsInit) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "download already init");
            return 0;
        }
        com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setAppContext(context);
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (!android.text.TextUtils.isEmpty(tPDLProxyInitParam.getAppVer())) {
                    setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION, tPDLProxyInitParam.getAppVer());
                }
                if (tPDLProxyInitParam.getPlatform() > 0) {
                    setUserData("platform", java.lang.Integer.valueOf(tPDLProxyInitParam.getPlatform()));
                }
                if (!android.text.TextUtils.isEmpty(tPDLProxyInitParam.getGuid())) {
                    setUserData("guid", tPDLProxyInitParam.getGuid());
                }
                java.lang.String cacheDir = tPDLProxyInitParam.getCacheDir();
                if (android.text.TextUtils.isEmpty(cacheDir) && context != null) {
                    try {
                        java.io.File properCacheDirectory = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLFileSystem.getProperCacheDirectory(context, "download");
                        if (properCacheDirectory != null) {
                            cacheDir = properCacheDirectory.getAbsolutePath();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "init get cache dir failed, error:" + th6.toString());
                    }
                }
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().initHandler();
                if (!android.text.TextUtils.isEmpty(tPDLProxyInitParam.getDataDir()) || android.text.TextUtils.isEmpty(this.mCurrentStoragePath)) {
                    if (!android.text.TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                        this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                    }
                    initService = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
                } else {
                    initService = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, this.mCurrentStoragePath, tPDLProxyInitParam.getConfigStr());
                }
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        java.lang.String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.this.pushEvent(20);
                        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                            com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.this.pushEvent(19);
                        }
                    }
                };
                if (context != null) {
                    context.registerReceiver(broadcastReceiver, intentFilter);
                }
                if (initService == 0) {
                    this.mIsInit = true;
                }
                registerNetworkConnectivity(context);
                return initService;
            } catch (java.lang.Throwable th7) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th7.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().pauseDownload(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i17) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().pushEvent(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network pushEvent failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().deleteCache(this.mCurrentStoragePath, str);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "deleteCache failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().resumeDownload(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam) {
        int dlType = tPDownloadParam.getDlType();
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i19 = dlType;
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return false;
        }
        try {
            return com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setClipInfo(i17, i18, str, i19, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo()) >= 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th6.toString());
            return false;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.setLogListener(this.mServiceType, iTPDLProxyLogListener);
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j17) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setMaxStorageSizeMB(this.mServiceType, j17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i17, int i18) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setPlayerState(i17, i18);
                if (i18 == 1) {
                    long currentPlayOffset = com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().getPlaylistener(i17).getCurrentPlayOffset();
                    int currentPosition = (int) (com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().getPlaylistener(i17).getCurrentPosition() / 1000);
                    int playerBufferLength = (int) (com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().getPlaylistener(i17).getPlayerBufferLength() / 1000);
                    int advRemainTime = (int) (com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().getPlaylistener(i17).getAdvRemainTime() / 1000);
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updateTaskInfo(i17, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, java.lang.String.valueOf(currentPlayOffset));
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(i17, currentPosition, playerBufferLength, advRemainTime);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(java.lang.String str, java.lang.Object obj) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION, (java.lang.String) obj);
                } else if (str.equalsIgnoreCase("platform")) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData("platform", obj.toString());
                } else if (str.equalsIgnoreCase("guid")) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData("guid", (java.lang.String) obj);
                } else if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_IS_VIP)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_IS_VIP, ((java.lang.Boolean) obj).booleanValue() ? "1" : "0");
                } else if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC, (java.lang.String) obj);
                } else if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE, obj.toString());
                } else if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG, obj.toString());
                } else if (str.equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SERVICE_CONFIG)) {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setServiceConfig(this.mServiceType, obj.toString());
                } else {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int i18 = -1;
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i18 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 102, i17);
            com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setOfflineDownloadListener(i18, iTPOfflineDownloadListener);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startClipOfflineDownload failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        int i18 = -1;
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i18 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 2, i17);
            com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setPlayListener(i18, iTPPlayListener);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener) {
        int i18 = -1;
        if (!com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i18 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 202, i17);
            com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setPreLoadListener(i18, iTPPreLoadListener);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int i17 = -1;
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 100;
                i17 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setOfflineDownloadListener(i17, iTPOfflineDownloadListener);
                if (!android.text.TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setClipInfo(i17, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        int dlType = tPDownloadParam.getDlType();
        if (iTPPlayListener != null) {
            tPDownloadParam.getExtInfoMap().put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ADV_REMAIN_TIME, java.lang.Long.valueOf(iTPPlayListener.getAdvRemainTime() / 1000));
        }
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i17 = -1;
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (tPDownloadParam.isAdaptive() && (dlType == 3 || dlType == 5)) {
                    dlType += 400;
                }
                int i18 = dlType;
                i17 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, i18, tPDownloadParam.getClipCount());
                if (!android.text.TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setClipInfo(i17, tPDownloadParam.getClipNo(), str, i18, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setPlayListener(i17, iTPPlayListener);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener) {
        int i17 = -1;
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 200;
                i17 = com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().setPreLoadListener(i17, iTPPreLoadListener);
                if (!android.text.TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setClipInfo(i17, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().startDownload(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().startDownload(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().stopDownload(i17);
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().removeOfflineDownloadListener(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().stopDownload(i17);
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().removePlayListener(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i17) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().stopDownload(i17);
                com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().removePreLoadListener(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mCurrentStoragePath = str;
            com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updateStoragePath(this.mServiceType, str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "updateStoragePath failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i17, java.lang.String str, java.lang.Object obj) {
        if (i17 > 0 && com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updateTaskInfo(i17, str, obj.toString());
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th6.toString());
            }
        }
    }
}

package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPProxyGlobalManager implements com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener, com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener {
    private static final java.lang.String TAG = "TPProxyGlobalManager";
    private int mAppBackOrFront;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter> mServiceTypeDownloadProxyMap;
    private java.lang.String mUpc;
    private int mUpcState;

    /* loaded from: classes16.dex */
    public static class InstanceHolder {
        private static com.tencent.thumbplayer.datatransport.TPProxyGlobalManager instance = new com.tencent.thumbplayer.datatransport.TPProxyGlobalManager();

        private InstanceHolder() {
        }
    }

    public static com.tencent.thumbplayer.datatransport.TPProxyGlobalManager getInstance() {
        return com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.InstanceHolder.instance;
    }

    private void pushAllProxyManagerEvent(int i17) {
        java.util.Iterator<com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter> it = this.mServiceTypeDownloadProxyMap.values().iterator();
        while (it.hasNext()) {
            it.next().pushEvent(i17);
        }
    }

    private void pushAllProxyManagerUpcChanged(java.lang.String str, int i17) {
        this.mUpc = str;
        this.mUpcState = i17;
        for (com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter : this.mServiceTypeDownloadProxyMap.values()) {
            iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC, str);
            iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE, java.lang.Integer.valueOf(i17));
        }
    }

    public com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter getPlayerProxy(int i17) {
        if (i17 < 0) {
            return null;
        }
        if (this.mServiceTypeDownloadProxyMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return this.mServiceTypeDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
        }
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy tPDownloadProxy = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.getTPDownloadProxy(i17);
        if (tPDownloadProxy != null) {
            try {
                int init = tPDownloadProxy.init(com.tencent.thumbplayer.api.TPPlayerMgr.getAppContext(), com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getProxyInitParam(i17));
                if (init < 0) {
                    com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "downloadProxy init failed with status:" + init + " downloadProxy:" + tPDownloadProxy);
                    return null;
                }
                tPDownloadProxy.setLogListener(new com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener() { // from class: com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.1
                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
                    public int d(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.tencent.thumbplayer.utils.TPLogUtil.d(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
                    public int e(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.tencent.thumbplayer.utils.TPLogUtil.e(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
                    public int i(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.tencent.thumbplayer.utils.TPLogUtil.i(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
                    public int w(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.tencent.thumbplayer.utils.TPLogUtil.w(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }
                });
                com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig proxyConfig = com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getProxyConfig(i17);
                int networkStatus = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getNetworkStatus();
                if (networkStatus == 1) {
                    tPDownloadProxy.pushEvent(1);
                    tPDownloadProxy.pushEvent(10);
                } else if (networkStatus == 2) {
                    tPDownloadProxy.pushEvent(2);
                    tPDownloadProxy.pushEvent(9);
                } else if (networkStatus == 3) {
                    tPDownloadProxy.pushEvent(2);
                    tPDownloadProxy.pushEvent(10);
                }
                tPDownloadProxy.pushEvent(this.mAppBackOrFront);
                tPDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC, this.mUpc);
                tPDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE, java.lang.Integer.valueOf(this.mUpcState));
                long j17 = proxyConfig.maxUseStorageMB;
                if (j17 > 0) {
                    tPDownloadProxy.setMaxStorageSizeMB(j17);
                }
                com.tencent.thumbplayer.datatransport.TPProxyManagerAdapterImpl tPProxyManagerAdapterImpl = new com.tencent.thumbplayer.datatransport.TPProxyManagerAdapterImpl(tPDownloadProxy);
                this.mServiceTypeDownloadProxyMap.put(java.lang.Integer.valueOf(i17), tPProxyManagerAdapterImpl);
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "getPlayerProxy, init proxy succeeded, serviceType:" + i17);
                return tPProxyManagerAdapterImpl;
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "init proxy failed:" + th6);
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener
    public void onEvent(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onEvent eventId: " + i17 + ", arg1: " + i18 + ", arg2: " + i19 + ", object" + obj);
        switch (i17) {
            case 100001:
                this.mAppBackOrFront = 13;
                pushAllProxyManagerEvent(13);
                return;
            case 100002:
                this.mAppBackOrFront = 14;
                pushAllProxyManagerEvent(14);
                return;
            case com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED /* 100003 */:
                pushAllProxyManagerUpcChanged((java.lang.String) obj, i18);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener
    public void onStatusChanged(int i17, int i18, int i19, int i27) {
        if (i18 == 1) {
            pushAllProxyManagerEvent(1);
            pushAllProxyManagerEvent(10);
        } else if (i18 == 2) {
            pushAllProxyManagerEvent(2);
            pushAllProxyManagerEvent(9);
        } else if (i18 == 3) {
            pushAllProxyManagerEvent(2);
            pushAllProxyManagerEvent(10);
        }
    }

    public void proxyInit() {
        getInstance().getPlayerProxy(com.tencent.thumbplayer.config.TPPlayerConfig.getProxyServiceType());
    }

    public void updateDataReportEnable(boolean z17) {
        java.util.Iterator<com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter> it = this.mServiceTypeDownloadProxyMap.values().iterator();
        while (it.hasNext()) {
            it.next().getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.reportEnableJsonConfig(z17));
        }
    }

    public void updateMaxStorageSizeMB(long j17) {
        java.util.Iterator<com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter> it = this.mServiceTypeDownloadProxyMap.values().iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy = it.next().getDownloadProxy();
            if (downloadProxy != null && j17 > 0) {
                downloadProxy.setMaxStorageSizeMB(j17);
            }
        }
    }

    public void updateMaxUseMemoryMB(long j17) {
        for (com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter : this.mServiceTypeDownloadProxyMap.values()) {
            if (iTPProxyManagerAdapter.getDownloadProxy() != null && j17 > 0) {
                iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.maxUseMemoryMBJsonConfig(j17));
            }
        }
    }

    public void updateVodCachedEnable(boolean z17) {
        for (com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter : this.mServiceTypeDownloadProxyMap.values()) {
            if (iTPProxyManagerAdapter.getDownloadProxy() != null) {
                iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SERVICE_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.vodCachedEnableJsonConfig(z17));
            }
        }
    }

    private TPProxyGlobalManager() {
        this.mAppBackOrFront = 0;
        this.mUpc = "";
        this.mUpcState = 0;
        if (this.mServiceTypeDownloadProxyMap == null) {
            this.mServiceTypeDownloadProxyMap = new java.util.concurrent.ConcurrentHashMap<>();
        }
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.addEventListener(this);
        com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
    }

    public void updateMaxStorageSizeMB(int i17, long j17) {
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
        if (iTPProxyManagerAdapter == null || iTPProxyManagerAdapter.getDownloadProxy() == null || j17 <= 0) {
            return;
        }
        iTPProxyManagerAdapter.getDownloadProxy().setMaxStorageSizeMB(j17);
    }

    public void updateDataReportEnable(int i17, boolean z17) {
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
        if (iTPProxyManagerAdapter == null || iTPProxyManagerAdapter.getDownloadProxy() == null) {
            return;
        }
        iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.reportEnableJsonConfig(z17));
    }

    public void updateMaxUseMemoryMB(int i17, long j17) {
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
        if (iTPProxyManagerAdapter == null || iTPProxyManagerAdapter.getDownloadProxy() == null || j17 <= 0) {
            return;
        }
        iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_PROXY_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.maxUseMemoryMBJsonConfig(j17));
    }

    public void updateVodCachedEnable(int i17, boolean z17) {
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
        if (iTPProxyManagerAdapter == null || iTPProxyManagerAdapter.getDownloadProxy() == null) {
            return;
        }
        iTPProxyManagerAdapter.getDownloadProxy().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SERVICE_CONFIG, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.vodCachedEnableJsonConfig(z17));
    }
}

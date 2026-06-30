package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPPreloadProxyImpl implements com.tencent.thumbplayer.api.proxy.ITPPreloadProxy {
    private static final int LOD_P2P_TIMES = 3;
    private static final int PRELOAD_ID_INVALID = -1;
    private static final java.lang.String TAG = "TPPreloadProxyImpl";
    private android.content.Context mContext;
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy mDownloadProxy;
    private int mServiceType;
    private boolean loadProxySucc = false;
    private com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl.InnerProxyListener mInnerProxyListener = new com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl.InnerProxyListener();
    private com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener mPreloadListener = new com.tencent.thumbplayer.datatransport.TPPlayProxyListenerEmptyImpl(TAG);

    /* loaded from: classes15.dex */
    public class InnerProxyListener implements com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener {
        private InnerProxyListener() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.tencent.thumbplayer.utils.TPLogUtil.d(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int e(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int i(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl.this.mPreloadListener.onPrepareDownloadProgressUpdate(i17, i18, j17, j18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareError(int i17, int i18, java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl.this.mPreloadListener.onPrepareError();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareOK() {
            com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl.this.mPreloadListener.onPrepareSuccess();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener
        public int w(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }
    }

    public TPPreloadProxyImpl(android.content.Context context, int i17) {
        this.mContext = context;
        this.mServiceType = i17;
        initProxy();
    }

    private void initProxy() {
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter playerProxy;
        int i17 = 3;
        while (i17 > 0 && !this.loadProxySucc) {
            try {
                playerProxy = com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().getPlayerProxy(this.mServiceType);
            } catch (java.lang.Exception e17) {
                i17--;
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
            if (playerProxy != null && playerProxy.getDownloadProxy() != null) {
                com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy = playerProxy.getDownloadProxy();
                this.mDownloadProxy = downloadProxy;
                downloadProxy.setLogListener(this.mInnerProxyListener);
                this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_IS_VIP, java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.isUserIsVip()));
                if (!android.text.TextUtils.isEmpty(com.tencent.thumbplayer.config.TPPlayerConfig.getUserUin())) {
                    this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UIN, com.tencent.thumbplayer.config.TPPlayerConfig.getUserUin());
                }
                if (!android.text.TextUtils.isEmpty(com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext))) {
                    this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION, com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext));
                }
                if (com.tencent.thumbplayer.config.TPPlayerConfig.getBuildNumber(this.mContext) != -1) {
                    this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION_CODE, java.lang.String.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getBuildNumber(this.mContext)));
                }
                this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC, com.tencent.thumbplayer.config.TPPlayerConfig.getUserUpc());
                this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE, java.lang.Integer.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getUserUpcState()));
                this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, com.tencent.thumbplayer.config.TPPlayerConfig.getOutNetIp());
                this.loadProxySucc = true;
                return;
            }
            i17--;
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p so load failed");
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public java.lang.String getPlayErrorCodeStr(int i17) {
        return null;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public boolean isAvailable() {
        return this.mDownloadProxy != null && this.loadProxySucc;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void pushEvent(int i17) {
        if (isAvailable()) {
            try {
                this.mDownloadProxy.pushEvent(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
            }
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void setPreloadListener(com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener iPreloadListener) {
        if (iPreloadListener == null) {
            this.mPreloadListener = new com.tencent.thumbplayer.datatransport.TPPlayProxyListenerEmptyImpl(TAG);
        } else {
            this.mPreloadListener = iPreloadListener;
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startClipPreload(java.lang.String str, java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> arrayList) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "[startClipPreload] Preloading clips.");
        if (arrayList == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "[startClipPreload] Fail to start clip preload: null download parameter list.");
            return -1;
        }
        if (!isAvailable()) {
            initProxy();
            if (!isAvailable()) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "[startClipPreload] Fail to initialize proxy.");
                return -1;
            }
        }
        int startClipPreload = this.mDownloadProxy.startClipPreload(str, arrayList.size(), this.mInnerProxyListener);
        if (startClipPreload <= 0) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "[startClipPreload] Fail to start clip preload: invalid preload ID.");
            stopPreload(startClipPreload);
            return -1;
        }
        java.util.Iterator<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> it = arrayList.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData next = it.next();
            if (!this.mDownloadProxy.setClipInfo(startClipPreload, i17, next.getDownloadFileID(), com.tencent.thumbplayer.datatransport.TPProxyUtils.convertProxyDownloadParams(next.getUrl(), next, null, null))) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "[startClipPreload] Fail to set clip info.");
                stopPreload(startClipPreload);
                return -1;
            }
            i17++;
        }
        try {
            this.mDownloadProxy.startTask(startClipPreload);
            return startClipPreload;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "[startClipPreload] Fail to start task: " + th6.toString());
            stopPreload(startClipPreload);
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startPreload(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        return startPreload(str, tPDownloadParamData, null);
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public void stopPreload(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy iTPDownloadProxy = this.mDownloadProxy;
        if (iTPDownloadProxy == null) {
            return;
        }
        try {
            iTPDownloadProxy.stopPreload(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy
    public int startPreload(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!isAvailable()) {
            initProxy();
            if (!isAvailable()) {
                return -1;
            }
        }
        if (tPDownloadParamData != null) {
            try {
                return this.mDownloadProxy.startPreload(str, com.tencent.thumbplayer.datatransport.TPProxyUtils.convertProxyDownloadParams(null, tPDownloadParamData, map, null), this.mInnerProxyListener);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
            }
        }
        return -1;
    }
}

package com.tencent.thumbplayer.core.downloadproxy.client;

/* loaded from: classes16.dex */
public class TPDownloadProxyClient implements com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy {
    private static final java.lang.String FILE_NAME = "TPDownloadProxyClient";
    private com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl downloadProxyAidl;

    public TPDownloadProxyClient(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return this.downloadProxyAidl.checkResourceStatus(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int clearCache(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return this.downloadProxyAidl.clearCache(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int deinit() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getClipPlayUrl(int i17, int i18, int i19) {
        try {
            return this.downloadProxyAidl.getClipPlayUrl(i17, i18, i19);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getNativeInfo(int i17) {
        try {
            return this.downloadProxyAidl.getNativeInfo(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getPlayErrorCodeStr(int i17) {
        try {
            return this.downloadProxyAidl.getPlayErrorCodeStr(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public java.lang.String getPlayUrl(int i17, int i18) {
        try {
            return this.downloadProxyAidl.getPlayUrl(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public long getResourceSize(java.lang.String str, java.lang.String str2) {
        try {
            return this.downloadProxyAidl.getResourceSize(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th6.toString());
            return -1L;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int init(android.content.Context context, com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam tPDLProxyInitParam) {
        java.lang.String serialize = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.serialize(tPDLProxyInitParam);
        if (android.text.TextUtils.isEmpty(serialize)) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "param is null");
            return -1;
        }
        try {
            return this.downloadProxyAidl.init(serialize);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th6.toString());
            return -2;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int pauseDownload(int i17) {
        try {
            return this.downloadProxyAidl.pauseDownload(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void pushEvent(int i17) {
        try {
            this.downloadProxyAidl.pushEvent(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "pushEvent failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int removeStorageCache(java.lang.String str) {
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int resumeDownload(int i17) {
        try {
            return this.downloadProxyAidl.resumeDownload(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam) {
        try {
            return this.downloadProxyAidl.setClipInfo(i17, i18, str, new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th6.toString());
            return false;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setLogListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.setLogListener(10303, iTPDLProxyLogListener);
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setMaxStorageSizeMB(long j17) {
        try {
            this.downloadProxyAidl.setMaxStorageSizeMB(j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setPlayState(int i17, int i18) {
        try {
            this.downloadProxyAidl.setPlayState(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void setUserData(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(str, obj);
        try {
            this.downloadProxyAidl.setUserData(hashMap);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipOfflineDownload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPlay(java.lang.String str, int i17, final com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        try {
            if (iTPPlayListener == null) {
                return this.downloadProxyAidl.startClipPlay(str, i17, null);
            }
            return this.downloadProxyAidl.startClipPlay(str, i17, new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.2
                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getAdvRemainTime() {
                    return iTPPlayListener.getAdvRemainTime();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public java.lang.String getContentType(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int getCurrentPlayClipNo() {
                    return iTPPlayListener.getCurrentPlayClipNo();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getCurrentPlayOffset() {
                    return iTPPlayListener.getCurrentPlayOffset();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getCurrentPosition() {
                    return iTPPlayListener.getCurrentPosition();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public java.lang.String getDataFilePath(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getDataTotalSize(int i18, java.lang.String str2, java.lang.String str3) {
                    return 0L;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public java.lang.String getM3U8Content(int i18, java.lang.String str2, java.lang.String str3) {
                    return null;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public java.lang.String getPlayInfo(java.lang.String str2) {
                    java.lang.Object playInfo = iTPPlayListener.getPlayInfo(str2);
                    if (playInfo == null || playInfo.getClass() != java.lang.String.class) {
                        return null;
                    }
                    if (playInfo.getClass() == java.lang.String.class) {
                        return (java.lang.String) playInfo;
                    }
                    if (playInfo.getClass() == java.lang.Integer.class) {
                        return java.lang.Integer.toString(((java.lang.Integer) playInfo).intValue());
                    }
                    return null;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public long getPlayerBufferLength() {
                    return iTPPlayListener.getPlayerBufferLength();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlExpired(java.util.Map map) {
                    iTPPlayListener.onDownloadCdnUrlExpired(map);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlInfoUpdate(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                    iTPPlayListener.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadCdnUrlUpdate(java.lang.String str2) {
                    iTPPlayListener.onDownloadCdnUrlUpdate(str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadError(int i18, int i19, java.lang.String str2) {
                    iTPPlayListener.onDownloadError(i18, i19, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadFinish() {
                    iTPPlayListener.onDownloadFinish();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadProgressUpdate(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    iTPPlayListener.onDownloadProgressUpdate(i18, i19, j17, j18, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadProtocolUpdate(java.lang.String str2, java.lang.String str3) {
                    iTPPlayListener.onDownloadProtocolUpdate(str2, str3);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public void onDownloadStatusUpdate(int i18) {
                    iTPPlayListener.onDownloadStatusUpdate(i18);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onPlayCallback(int i18, java.util.List list) {
                    java.lang.Object obj = 0;
                    if (list != null && !list.isEmpty()) {
                        if (list.size() == 1) {
                            obj = iTPPlayListener.onPlayCallback(i18, list.get(0), null, null, null);
                        } else if (list.size() == 2) {
                            obj = iTPPlayListener.onPlayCallback(i18, list.get(0), list.get(1), null, null);
                        } else if (list.size() == 3) {
                            obj = iTPPlayListener.onPlayCallback(i18, list.get(0), list.get(1), list.get(2), null);
                        }
                    }
                    if (obj == null || obj.getClass() != java.lang.Integer.class) {
                        return -1;
                    }
                    return ((java.lang.Integer) obj).intValue();
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onReadData(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    return 0;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onStartReadData(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    return 0;
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                public int onStopReadData(int i18, java.lang.String str2, java.lang.String str3, int i19) {
                    return 0;
                }
            });
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startClipPreload(java.lang.String str, int i17, final com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startClipPreload(str, i17, new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.4
                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareDownloadProgressUpdate(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i18, i19, j17, j18, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareError(int i18, int i19, java.lang.String str2) {
                    iTPPreLoadListener.onPrepareError(i18, i19, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startOfflineDownload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, final com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        if (this.downloadProxyAidl != null && tPDownloadParam != null) {
            com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl = new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap());
            try {
                if (iTPPlayListener == null) {
                    return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, null);
                }
                return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.1
                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getAdvRemainTime() {
                        return iTPPlayListener.getAdvRemainTime();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public java.lang.String getContentType(int i17, java.lang.String str2, java.lang.String str3) {
                        return iTPPlayListener.getContentType(i17, str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int getCurrentPlayClipNo() {
                        return iTPPlayListener.getCurrentPlayClipNo();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getCurrentPlayOffset() {
                        return iTPPlayListener.getCurrentPlayOffset();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getCurrentPosition() {
                        return iTPPlayListener.getCurrentPosition();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public java.lang.String getDataFilePath(int i17, java.lang.String str2, java.lang.String str3) {
                        return iTPPlayListener.getDataFilePath(i17, str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getDataTotalSize(int i17, java.lang.String str2, java.lang.String str3) {
                        return iTPPlayListener.getDataTotalSize(i17, str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public java.lang.String getM3U8Content(int i17, java.lang.String str2, java.lang.String str3) {
                        return iTPPlayListener.getM3U8Content(i17, str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public java.lang.String getPlayInfo(java.lang.String str2) {
                        java.lang.Object playInfo = iTPPlayListener.getPlayInfo(str2);
                        if (playInfo == null || playInfo.getClass() != java.lang.String.class) {
                            return null;
                        }
                        if (playInfo.getClass() == java.lang.String.class) {
                            return (java.lang.String) playInfo;
                        }
                        if (playInfo.getClass() == java.lang.Integer.class) {
                            return java.lang.Integer.toString(((java.lang.Integer) playInfo).intValue());
                        }
                        return null;
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public long getPlayerBufferLength() {
                        return iTPPlayListener.getPlayerBufferLength();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlExpired(java.util.Map map) {
                        iTPPlayListener.onDownloadCdnUrlExpired(map);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlInfoUpdate(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                        iTPPlayListener.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadCdnUrlUpdate(java.lang.String str2) {
                        iTPPlayListener.onDownloadCdnUrlUpdate(str2);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadError(int i17, int i18, java.lang.String str2) {
                        iTPPlayListener.onDownloadError(i17, i18, str2);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadFinish() {
                        iTPPlayListener.onDownloadFinish();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str2) {
                        iTPPlayListener.onDownloadProgressUpdate(i17, i18, j17, j18, str2);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadProtocolUpdate(java.lang.String str2, java.lang.String str3) {
                        iTPPlayListener.onDownloadProtocolUpdate(str2, str3);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public void onDownloadStatusUpdate(int i17) {
                        iTPPlayListener.onDownloadStatusUpdate(i17);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onPlayCallback(int i17, java.util.List list) {
                        java.lang.Object obj = 0;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                obj = iTPPlayListener.onPlayCallback(i17, list.get(0), null, null, null);
                            } else if (list.size() == 2) {
                                obj = iTPPlayListener.onPlayCallback(i17, list.get(0), list.get(1), null, null);
                            } else if (list.size() == 3) {
                                obj = iTPPlayListener.onPlayCallback(i17, list.get(0), list.get(1), list.get(2), null);
                            }
                        }
                        if (obj == null || obj.getClass() != java.lang.Integer.class) {
                            return -1;
                        }
                        return ((java.lang.Integer) obj).intValue();
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onReadData(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        return iTPPlayListener.onReadData(i17, str2, str3, j17, j18);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onStartReadData(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        return iTPPlayListener.onStartReadData(i17, str2, str3, j17, j18);
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
                    public int onStopReadData(int i17, java.lang.String str2, java.lang.String str3, int i18) {
                        return iTPPlayListener.onStopReadData(i17, str2, str3, i18);
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, final com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startPreload(str, new com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()), new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub() { // from class: com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient.3
                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str2) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i17, i18, j17, j18, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareError(int i17, int i18, java.lang.String str2) {
                    iTPPreLoadListener.onPrepareError(i17, i18, str2);
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl
                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void startTask(int i17) {
        try {
            this.downloadProxyAidl.startTask(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopOfflineDownload(int i17) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPlay(int i17) {
        try {
            this.downloadProxyAidl.stopPlay(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th6.toString());
        }
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void stopPreload(int i17) {
        try {
            this.downloadProxyAidl.stopPreload(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th6.toString());
        }
    }

    public void updateAidl(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateStoragePath(java.lang.String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy
    public void updateTaskInfo(int i17, java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(str, obj);
        try {
            this.downloadProxyAidl.updateTaskInfo(i17, hashMap);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th6.toString());
        }
    }
}

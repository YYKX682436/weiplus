package com.tencent.thumbplayer.core.downloadproxy.apiinner;

/* loaded from: classes16.dex */
public class TPListenerManager {
    private static final java.lang.String FILE_NAME = "TPListenerManager";
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_CURRENT_CDN_URL = 5;
    private static final int MSG_CURRENT_CDN_URL_INFO = 6;
    private static final int MSG_DID_RELEASE_MEMORY = 2016;
    private static final int MSG_DOWNLOAD_PROTOCOL = 9;
    private static final int MSG_DOWNLOAD_STATUS = 8;
    private static final int MSG_ERROR = 4;
    private static final int MSG_FINISH = 3;
    private static final int MSG_M3U8_REFRESH = 2017;
    private static final int MSG_MULTI_NETWORK_LOW_SPEED = 2020;
    private static final int MSG_MULTI_NETWORK_STATUS = 2021;
    private static final int MSG_NOTIFY_FLV_PRELOAD_STATUS = 2009;
    private static final int MSG_NOTIFY_HTTP_HEADER = 2006;
    private static final int MSG_NOTIFY_LOSE_PACKAGE_CEHCK = 2004;
    private static final int MSG_NOTIFY_M3U8_CONTENT = 2007;
    private static final int MSG_NOTIFY_PLAYER_SWITCH_DEFINITION = 2003;
    private static final int MSG_NOTIFY_SOCKET_FD = 2008;
    private static final int MSG_PLAY_VIDEO_NOT_FOUND = 101;
    private static final int MSG_PREPARE_FINISH = 50;
    private static final int MSG_PROGRESS = 2;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 202;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 205;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 204;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 203;
    private static final int MSG_PROXY_GET_M3U8_CONTENT = 206;
    private static final int MSG_PROXY_READ_DATA = 201;
    private static final int MSG_PROXY_START_READ_DATA = 200;
    private static final int MSG_QUIC_DOWNLOAD_STATUS = 3001;
    private static final int MSG_REPORT_QUIC_QUALITY = 3002;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_TAB_TESTID = 2014;
    private static final int MSG_URL_EXPIRED = 7;
    private static final int MSG_WILL_RELEASE_MEMORY = 2015;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final java.lang.String THREAD_NAME = "TVKDL-Listener";
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadListener mITPDownloadListener;
    private android.os.Handler mMsgHandler;
    private android.os.HandlerThread mMsgHandlerThread;
    private android.net.Network mNetwork;
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener> mOfflineDownloadListenerMap;
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener> mPlayListenerMap;
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener> mPreLoadListenerMap;
    private java.lang.Runnable updatePlayerInfo;
    private static final java.lang.Object PLAY_LISTENER_MAP_MUTEX = new java.lang.Object();
    private static final java.lang.Object PRELOAD_LISTENER_MAP_MUTEX = new java.lang.Object();
    private static final java.lang.Object OFFLINE_LISTENER_MAP_MUTEX = new java.lang.Object();

    /* loaded from: classes16.dex */
    public static class SingletonHolder {
        private static final com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager INSTANCE = new com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager();

        private SingletonHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCallbackMessage(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener playlistener = getPlaylistener(i18);
        if (playlistener != null) {
            dispatchPlayMessage(playlistener, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener preLoadListener = getPreLoadListener(i18);
        if (preLoadListener != null) {
            dispatchPreLoadMessage(preLoadListener, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener offlineDownloadListener = getOfflineDownloadListener(i18);
        if (offlineDownloadListener != null) {
            dispatchOfflineDownloadMessage(offlineDownloadListener, i17, i18, obj, obj2, obj3, obj4, obj5);
            return;
        }
        if (this.mITPDownloadListener != null) {
            if (i17 == 2015) {
                this.mITPDownloadListener.willReleaseMemory(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else if (i17 == MSG_DID_RELEASE_MEMORY) {
                this.mITPDownloadListener.didReleaseMemory(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else {
                if (i17 != 3002) {
                    return;
                }
                this.mITPDownloadListener.onQuicQualityReportUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
        }
    }

    private void dispatchOfflineDownloadMessage(com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (iTPOfflineDownloadListener == null) {
            return;
        }
        switch (i17) {
            case 2:
                iTPOfflineDownloadListener.onDownloadProgressUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj2, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj3, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj4, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj5));
                return;
            case 3:
                iTPOfflineDownloadListener.onDownloadFinish();
                return;
            case 4:
                iTPOfflineDownloadListener.onDownloadError(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3));
                return;
            case 5:
                iTPOfflineDownloadListener.onDownloadCdnUrlUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj));
                return;
            case 6:
                iTPOfflineDownloadListener.onDownloadCdnUrlInfoUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj4));
                return;
            case 7:
                java.lang.String byteArrayToString = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
                long objectToLong = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj2, 0L);
                java.util.HashMap hashMap = new java.util.HashMap();
                if (!android.text.TextUtils.isEmpty(byteArrayToString)) {
                    hashMap.put("exttag", byteArrayToString);
                    hashMap.put("randnum", java.lang.String.valueOf(objectToLong));
                }
                iTPOfflineDownloadListener.onDownloadCdnUrlExpired(hashMap);
                return;
            case 8:
                iTPOfflineDownloadListener.onDownloadStatusUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0));
                return;
            case 9:
                iTPOfflineDownloadListener.onDownloadProtocolUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2));
                return;
            default:
                return;
        }
    }

    private void dispatchPlayMessage(com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (iTPPlayListener == null) {
            return;
        }
        if (i17 == 2) {
            iTPPlayListener.onDownloadProgressUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj2, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj3, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj4, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj5));
            return;
        }
        if (i17 == 3) {
            iTPPlayListener.onDownloadFinish();
            return;
        }
        if (i17 == 101) {
            java.lang.String byteArrayToString = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
            long objectToLong = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj2, 0L);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(byteArrayToString)) {
                hashMap.put("exttag", byteArrayToString);
                hashMap.put("randnum", java.lang.String.valueOf(objectToLong));
            }
            iTPPlayListener.onPlayCallback(1, hashMap, null, null, null);
            return;
        }
        if (i17 == 2009) {
            iTPPlayListener.onPlayCallback(5, java.lang.Integer.valueOf(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0)), obj2 == null ? null : (byte[]) obj2, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3), java.lang.Integer.valueOf(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj4, 0)));
            return;
        }
        if (i17 == 2014) {
            java.lang.Object byteArrayToString2 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
            java.lang.String byteArrayToString3 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2);
            iTPPlayListener.onPlayCallback(8, byteArrayToString2, byteArrayToString3, null, null);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "MSG_TAB_TESTID: " + byteArrayToString3);
            return;
        }
        if (i17 == MSG_M3U8_REFRESH) {
            iTPPlayListener.onPlayCallback(9, null, null, null, null);
            return;
        }
        if (i17 == 3001) {
            iTPPlayListener.onPlayCallback(6, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
            return;
        }
        if (i17 == 2003) {
            iTPPlayListener.onPlayCallback(2, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2), java.lang.Integer.valueOf(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj3, 0)), null);
            return;
        }
        if (i17 == 2004) {
            final int objectToInt = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj2, 0);
            com.tencent.thumbplayer.core.downloadproxy.utils.TVKThreadUtil.getScheduledExecutorServiceInstance().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_LOSS_PACKAGE_INFO, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.losePackageCheck(objectToInt));
                }
            });
            return;
        }
        if (i17 == 2006) {
            iTPPlayListener.onPlayCallback(3, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
        } else if (i17 == 2007) {
            iTPPlayListener.onPlayCallback(4, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), null, null, null);
        } else if (i17 == MSG_MULTI_NETWORK_LOW_SPEED) {
            java.lang.String byteArrayToString4 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
            iTPPlayListener.onPlayCallback(10, byteArrayToString4, null, null, null);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i17 + ", info: " + byteArrayToString4);
        } else if (i17 != MSG_MULTI_NETWORK_STATUS) {
            switch (i17) {
                case 5:
                    iTPPlayListener.onDownloadCdnUrlUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj));
                    break;
                case 6:
                    iTPPlayListener.onDownloadCdnUrlInfoUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj4));
                    break;
                case 7:
                    java.lang.String byteArrayToString5 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
                    long objectToLong2 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj2, 0L);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    if (!android.text.TextUtils.isEmpty(byteArrayToString5)) {
                        hashMap2.put("exttag", byteArrayToString5);
                        hashMap2.put("randnum", java.lang.String.valueOf(objectToLong2));
                    }
                    iTPPlayListener.onDownloadCdnUrlExpired(hashMap2);
                    break;
                case 8:
                    iTPPlayListener.onDownloadStatusUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0));
                    break;
                case 9:
                    iTPPlayListener.onDownloadProtocolUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2));
                    break;
            }
        } else {
            java.lang.String byteArrayToString6 = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
            iTPPlayListener.onPlayCallback(11, byteArrayToString6, null, null, null);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i17 + ", info: " + byteArrayToString6);
        }
    }

    private void dispatchPreLoadMessage(com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener, int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (iTPPreLoadListener == null) {
            return;
        }
        if (i17 == 2) {
            iTPPreLoadListener.onPrepareDownloadProgressUpdate(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj2, 0), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj3, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj4, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj5));
        } else if (i17 == 4) {
            iTPPreLoadListener.onPrepareError(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3));
        } else {
            if (i17 != 50) {
                return;
            }
            iTPPreLoadListener.onPrepareOK();
        }
    }

    public static com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager getInstance() {
        return com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.SingletonHolder.INSTANCE;
    }

    public com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener getOfflineDownloadListener(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener;
        synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
            iTPOfflineDownloadListener = this.mOfflineDownloadListenerMap.get(java.lang.Integer.valueOf(i17));
        }
        return iTPOfflineDownloadListener;
    }

    public com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener getPlaylistener(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener;
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            iTPPlayListener = this.mPlayListenerMap.get(java.lang.Integer.valueOf(i17));
        }
        return iTPPlayListener;
    }

    public com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener getPreLoadListener(int i17) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener;
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            iTPPreLoadListener = this.mPreLoadListenerMap.get(java.lang.Integer.valueOf(i17));
        }
        return iTPPreLoadListener;
    }

    public synchronized void handleCallbackMessage(final int i17, final int i18, final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, final java.lang.Object obj4, final java.lang.Object obj5) {
        if (2008 != i17) {
            if (i17 != 2010 && i17 != 2011 && i17 != 2013) {
                this.mMsgHandler.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.this.dispatchCallbackMessage(i17, i18, obj, obj2, obj3, obj4, obj5);
                    }
                });
                return;
            } else {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.getInstance().addRequestItem(com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), i17);
                return;
            }
        }
        if (this.mNetwork == null) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, network is null");
            return;
        }
        java.lang.String byteArrayToString = com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj);
        int parseInt = java.lang.Integer.parseInt(byteArrayToString);
        try {
            java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, parseInt);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind begin, sock fd: " + parseInt);
            this.mNetwork.bindSocket(fileDescriptor);
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket success, sock fd: " + parseInt);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, "-1");
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket failed: " + th6.toString());
        }
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, sock call back end, sock fd: " + parseInt + ", str_sock: " + byteArrayToString);
    }

    public int handleIntCallbackMessage(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener playlistener = getPlaylistener(i18);
        if (playlistener == null) {
            return 0;
        }
        if (i17 == 200) {
            return playlistener.onStartReadData(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj4), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj2, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj3, -1L));
        }
        if (i17 == 202) {
            return playlistener.onStopReadData(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj3), i18);
        }
        if (i17 == 201) {
            return playlistener.onReadData(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj4), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToLong(obj2, 0L), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.objectToInt(obj3, 0));
        }
        return 0;
    }

    public java.lang.String handleStringCallbackMessage(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener playlistener = getPlaylistener(i18);
        if (playlistener != null) {
            if (i17 == 205) {
                return playlistener.getContentType(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2));
            }
            if (i17 == 203) {
                return java.lang.String.valueOf(playlistener.getDataTotalSize(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2)));
            }
            if (i17 == 204) {
                return playlistener.getDataFilePath(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2));
            }
            if (i17 == 206) {
                return playlistener.getM3U8Content(i18, com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj), com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.byteArrayToString((byte[]) obj2));
            }
        }
        return "";
    }

    public void initHandler() {
        if (this.mMsgHandlerThread == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(THREAD_NAME);
            this.mMsgHandlerThread = handlerThread;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(this.mMsgHandlerThread.getLooper());
            this.mMsgHandler = handler;
            handler.postDelayed(this.updatePlayerInfo, 1000L);
        }
    }

    public void removeAllPlayListener() {
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            this.mPlayListenerMap.clear();
        }
    }

    public void removeAllPreLoadListener() {
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            this.mPreLoadListenerMap.clear();
        }
    }

    public void removeOfflineDownloadListener(int i17) {
        if (i17 > 0) {
            synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
                this.mOfflineDownloadListenerMap.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public void removePlayListener(int i17) {
        if (i17 > 0) {
            synchronized (PLAY_LISTENER_MAP_MUTEX) {
                this.mPlayListenerMap.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public void removePreLoadListener(int i17) {
        if (i17 > 0) {
            synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
                this.mPreLoadListenerMap.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public void setITPDownloadListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadListener iTPDownloadListener) {
        this.mITPDownloadListener = iTPDownloadListener;
    }

    public void setNetwork(android.net.Network network) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "cellular_network, set network");
        this.mNetwork = network;
    }

    public void setOfflineDownloadListener(int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        if (i17 <= 0 || iTPOfflineDownloadListener == null) {
            return;
        }
        synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
            this.mOfflineDownloadListenerMap.put(java.lang.Integer.valueOf(i17), iTPOfflineDownloadListener);
        }
    }

    public void setPlayListener(int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        if (i17 <= 0 || iTPPlayListener == null) {
            return;
        }
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            this.mPlayListenerMap.put(java.lang.Integer.valueOf(i17), iTPPlayListener);
        }
    }

    public void setPreLoadListener(int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener) {
        if (i17 <= 0 || iTPPreLoadListener == null) {
            return;
        }
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            this.mPreLoadListenerMap.put(java.lang.Integer.valueOf(i17), iTPPreLoadListener);
        }
    }

    private TPListenerManager() {
        this.mNetwork = null;
        this.mITPDownloadListener = null;
        this.mPlayListenerMap = new java.util.HashMap();
        this.mPreLoadListenerMap = new java.util.HashMap();
        this.mOfflineDownloadListenerMap = new java.util.HashMap();
        this.updatePlayerInfo = new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.1
            @Override // java.lang.Runnable
            public void run() {
                java.util.Map map;
                synchronized (com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.PLAY_LISTENER_MAP_MUTEX) {
                    map = com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.this.mPlayListenerMap;
                }
                try {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                        com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener = (com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener) entry.getValue();
                        int currentPosition = (int) (iTPPlayListener.getCurrentPosition() / 1000);
                        int playerBufferLength = (int) (iTPPlayListener.getPlayerBufferLength() / 1000);
                        int advRemainTime = (int) (iTPPlayListener.getAdvRemainTime() / 1000);
                        com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updateTaskInfo(intValue, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, java.lang.String.valueOf(iTPPlayListener.getCurrentPlayOffset()));
                        com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(intValue, currentPosition, playerBufferLength, advRemainTime);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        };
    }
}

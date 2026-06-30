package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPDataTransportManagerProxy implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String METHOD_NAME_SET_PLAYER_LISTENER = "setPlayListener";
    private static final java.lang.String METHOD_NAME_START_DOWNLOAD_PLAY = "startDownloadPlay";
    private static final java.lang.String METHOD_NAME_START_DOWNLOAD_PLAY_BY_ASSET = "startDownloadPlayByAsset";
    private static final java.lang.String TAG = "TPDataTransportManagerProxy";
    private com.tencent.thumbplayer.datatransport.TPPlayManagerImpl mPlayManagerImpl;
    private java.lang.Object mPlayManagerImplInterfaceProxy;
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener mPlayManagerImplListener;
    private com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.TPPlayManagerImplProxyListener mPlayManagerImplProxyListener = new com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.TPPlayManagerImplProxyListener();
    private com.tencent.thumbplayer.tplayer.TPContext mPlayerContext;

    /* loaded from: classes16.dex */
    public class TPPlayManagerImplProxyListener implements com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener {
        private TPPlayManagerImplProxyListener() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getContentType(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPlayOffset() {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getDataFilePath(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getDataTotalSize(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getContentType(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(long j17) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayInfo(j17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlExpired(map);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.DTCdnUrlUpdataEventInfo();
            dTCdnUrlUpdataEventInfo.setCdnIp(str2);
            dTCdnUrlUpdataEventInfo.setUserIp(str3);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTCdnUrlUpdataEventInfo);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlUpdate(str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i17, int i18, java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadError(i17, i18, str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadFinish();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo dTDownloadProgressUpdataEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo();
            dTDownloadProgressUpdataEventInfo.setDownloadSpeedKbps(i18 * 8);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTDownloadProgressUpdataEventInfo);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadProgressUpdate(i17, i18, j17, j18, str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.DTProtocalUpdateEventInfo dTProtocalUpdateEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.DTProtocalUpdateEventInfo();
            dTProtocalUpdateEventInfo.setProtocol(str);
            dTProtocalUpdateEventInfo.setProtocolVer(str2);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTProtocalUpdateEventInfo);
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadProtocolUpdate(str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i17) {
            com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadStatusUpdate(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onPlayCallback(i17, obj, obj2, obj3, obj4);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onReadData(i17, str, str2, j17, j18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onStartReadData(i17, str, str2, j17, j18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.onStopReadData(i17, str, str2, i18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(java.lang.String str) {
            return com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayInfo(str);
        }
    }

    public TPDataTransportManagerProxy(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl tPPlayManagerImpl, com.tencent.thumbplayer.tplayer.TPContext tPContext) {
        this.mPlayManagerImpl = tPPlayManagerImpl;
        this.mPlayerContext = tPContext;
    }

    private static java.lang.Object dealReturn(java.lang.reflect.Method method) {
        java.lang.String name = method.getReturnType().getName();
        if (name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    private void hookListenerIfNeed(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (method.getName().equals(METHOD_NAME_SET_PLAYER_LISTENER)) {
            this.mPlayManagerImplListener = (com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener) objArr[0];
            objArr[0] = this.mPlayManagerImplProxyListener;
        }
    }

    private void publishEventAfterMethodInvokeIfNeed(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        name.getClass();
        if (name.equals(METHOD_NAME_START_DOWNLOAD_PLAY_BY_ASSET) || name.equals(METHOD_NAME_START_DOWNLOAD_PLAY)) {
            publishReturnConvertedUrlEvent(objArr);
        }
    }

    private void publishReturnConvertedUrlEvent(java.lang.Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.DTReturnConvertedUrlEventInfo());
    }

    public synchronized java.lang.Object getProxyInstance() {
        if (this.mPlayManagerImplInterfaceProxy == null) {
            this.mPlayManagerImplInterfaceProxy = java.lang.reflect.Proxy.newProxyInstance(this.mPlayManagerImpl.getClass().getClassLoader(), this.mPlayManagerImpl.getClass().getInterfaces(), this);
        }
        return this.mPlayManagerImplInterfaceProxy;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        hookListenerIfNeed(method, objArr);
        try {
            java.lang.Object invoke = method.invoke(this.mPlayManagerImpl, objArr);
            publishEventAfterMethodInvokeIfNeed(method, objArr);
            return invoke;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            if (e17.getTargetException() != null) {
                throw e17.getTargetException();
            }
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + e17.toString());
            return dealReturn(method);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + th6.toString());
            return dealReturn(method);
        }
    }
}

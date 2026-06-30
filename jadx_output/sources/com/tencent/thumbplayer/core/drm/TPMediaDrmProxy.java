package com.tencent.thumbplayer.core.drm;

/* loaded from: classes16.dex */
public class TPMediaDrmProxy {
    private static final long CREATE_MEDIA_DRM_SLICE_WAIT_TIME_MS = 100;
    private static final long CREATE_MEDIA_DRM_TIMEOUT_MS = 5000;
    private static final int ERR_API_LOW_LEVEL = 2;
    private static final int ERR_CREATE_MEDIA_DRM_FAILED = 5;
    private static final int ERR_ILLEGAL_ARGUMENT = 1;
    private static final int ERR_INTERRUPT = 3;
    private static final int ERR_NONE = 0;
    private static final int ERR_UNSUPPORTED_SCHEME = 4;
    private static final java.lang.String TAG = "[PlayerCore][TPMediaDrmProxy]";
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm mMediaDrm;
    private long mNativeContext;
    private java.util.UUID mUUID;

    /* loaded from: classes16.dex */
    public static final class DrmSessionId {
        byte[] mSessionId;
        int mStatus;

        public DrmSessionId(int i17, byte[] bArr) {
            this.mStatus = i17;
            this.mSessionId = bArr;
        }
    }

    /* loaded from: classes16.dex */
    public static final class KeyRequest {
        byte[] mData;
        int mRequestType;
        int mStatus;

        public KeyRequest(int i17, byte[] bArr, int i18) {
            this.mRequestType = i17;
            this.mData = bArr;
            this.mStatus = i18;
        }
    }

    /* loaded from: classes16.dex */
    public static final class MediaDrmProxyCreateResult {
        int mErrorCode;
        com.tencent.thumbplayer.core.drm.TPMediaDrmProxy mMediaDrmProxy;

        public MediaDrmProxyCreateResult(com.tencent.thumbplayer.core.drm.TPMediaDrmProxy tPMediaDrmProxy, int i17) {
            this.mMediaDrmProxy = tPMediaDrmProxy;
            this.mErrorCode = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static final class ProvisionRequest {
        byte[] mData;
        java.lang.String mDefaultUrl;

        public ProvisionRequest(java.lang.String str, byte[] bArr) {
            this.mDefaultUrl = str;
            this.mData = bArr;
        }
    }

    private static void checkInterrupt(com.tencent.thumbplayer.core.drm.ITPDrmInterruptCallback iTPDrmInterruptCallback) {
        if (iTPDrmInterruptCallback != null && iTPDrmInterruptCallback.isInterrupted()) {
            throw new java.lang.InterruptedException();
        }
    }

    private static com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult createMediaDrmProxyByUUID(java.lang.String str, boolean z17, com.tencent.thumbplayer.core.drm.TPDrmInterruptCallbackProxy tPDrmInterruptCallbackProxy) {
        if (str == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "illegal argument.");
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult(null, 1);
        }
        try {
            try {
                com.tencent.thumbplayer.core.drm.TPMediaDrmProxy createMediaDrmProxyWithAsyncTimeout = createMediaDrmProxyWithAsyncTimeout(java.util.UUID.fromString(str), z17, tPDrmInterruptCallbackProxy);
                return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult(createMediaDrmProxyWithAsyncTimeout, createMediaDrmProxyWithAsyncTimeout != null ? 0 : 5);
            } catch (android.media.UnsupportedSchemeException e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
                return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult(null, 4);
            } catch (java.lang.InterruptedException e18) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e18.getMessage());
                return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult(null, 3);
            }
        } catch (java.lang.IllegalArgumentException e19) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e19.getMessage());
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.MediaDrmProxyCreateResult(null, 1);
        }
    }

    private static com.tencent.thumbplayer.core.drm.TPMediaDrmProxy createMediaDrmProxyWithAsyncTimeout(final java.util.UUID uuid, final boolean z17, com.tencent.thumbplayer.core.drm.ITPDrmInterruptCallback iTPDrmInterruptCallback) {
        com.tencent.thumbplayer.core.drm.TPMediaDrmProxy tPMediaDrmProxy;
        final java.lang.Object obj = new java.lang.Object();
        final com.tencent.thumbplayer.core.drm.TPMediaDrmProxy[] tPMediaDrmProxyArr = {null};
        final android.media.UnsupportedSchemeException[] unsupportedSchemeExceptionArr = {null};
        final boolean[] zArr = {false};
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "async create mediaDrm proxy start.");
        com.tencent.thumbplayer.core.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z18;
                com.tencent.thumbplayer.core.drm.TPMediaDrmProxy tPMediaDrmProxy2;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "create system mediaDrm proxy start.");
                try {
                    tPMediaDrmProxyArr[0] = new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy(uuid, z17);
                } catch (android.media.UnsupportedSchemeException e17) {
                    unsupportedSchemeExceptionArr[0] = e17;
                }
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "create system mediaDrm proxy end.");
                synchronized (obj) {
                    z18 = zArr[0];
                    obj.notify();
                }
                if (!z18 || (tPMediaDrmProxy2 = tPMediaDrmProxyArr[0]) == null) {
                    return;
                }
                tPMediaDrmProxy2.release();
            }
        });
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (tPMediaDrmProxyArr[0] == null) {
            synchronized (obj) {
                try {
                    checkInterrupt(iTPDrmInterruptCallback);
                } catch (java.lang.InterruptedException e17) {
                    zArr[0] = true;
                    throw e17;
                }
            }
            long elapsedRealtime2 = CREATE_MEDIA_DRM_TIMEOUT_MS - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            if (elapsedRealtime2 <= 0) {
                break;
            }
            synchronized (obj) {
                try {
                    try {
                        obj.wait(java.lang.Math.min(elapsedRealtime2, 100L));
                    } catch (java.lang.InterruptedException e18) {
                        zArr[0] = true;
                        throw e18;
                    }
                } finally {
                }
            }
        }
        android.media.UnsupportedSchemeException unsupportedSchemeException = unsupportedSchemeExceptionArr[0];
        if (unsupportedSchemeException != null) {
            throw unsupportedSchemeException;
        }
        synchronized (obj) {
            com.tencent.thumbplayer.core.drm.TPMediaDrmProxy tPMediaDrmProxy2 = tPMediaDrmProxyArr[0];
            if (tPMediaDrmProxy2 == null) {
                zArr[0] = true;
                tPMediaDrmProxy = null;
            } else {
                tPMediaDrmProxy = tPMediaDrmProxy2;
            }
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "async create mediaDrm proxy end.");
        return tPMediaDrmProxy;
    }

    public static boolean isCryptoSchemeSupported(java.lang.String str) {
        if (str == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "isCryptoSchemeSupported, illegal argument.");
            return false;
        }
        try {
            boolean isCryptoSchemeSupported = android.media.MediaDrm.isCryptoSchemeSupported(java.util.UUID.fromString(str));
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "isCryptoSchemeSupported, supported:" + isCryptoSchemeSupported);
            return isCryptoSchemeSupported;
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void native_mediaDrmOnEvent(byte[] bArr, int i17, int i18, byte[] bArr2);

    public static void setMediaDrmReuseEnable(boolean z17) {
        com.tencent.thumbplayer.core.drm.TPMediaDrmPool.getInstance().setMediaDrmReuseEnable(z17);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "setMediaDrmReuseEnable, reuse:".concat(z17 ? "true" : "false"));
    }

    public void closeSession(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.mMediaDrm.closeSession(bArr);
    }

    public com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, java.lang.String str, int i17) {
        try {
            android.media.MediaDrm.KeyRequest keyRequest = this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i17, null);
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.KeyRequest(keyRequest.getRequestType(), keyRequest.getData(), 0);
        } catch (android.media.NotProvisionedException | com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException unused) {
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.KeyRequest(-1, null, -1);
        }
    }

    public android.media.MediaCrypto getMediaCrypto(byte[] bArr) {
        try {
            return new android.media.MediaCrypto(this.mUUID, bArr);
        } catch (android.media.MediaCryptoException unused) {
            return null;
        }
    }

    public java.lang.String getPropertyString(java.lang.String str) {
        return this.mMediaDrm.getPropertyString(str);
    }

    public com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.ProvisionRequest getProvisionRequest() {
        try {
            android.media.MediaDrm.ProvisionRequest provisionRequest = this.mMediaDrm.getProvisionRequest();
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.ProvisionRequest(provisionRequest.getDefaultUrl(), provisionRequest.getData());
        } catch (com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException unused) {
            return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.ProvisionRequest("", new byte[0]);
        }
    }

    public com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.DrmSessionId openSession() {
        int i17;
        byte[] bArr = null;
        try {
            bArr = this.mMediaDrm.openSession();
            i17 = 0;
        } catch (android.media.NotProvisionedException unused) {
            i17 = -1;
        } catch (java.lang.Exception unused2) {
            i17 = -2;
        }
        return new com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.DrmSessionId(i17, bArr);
    }

    public int provideKeyResponse(byte[] bArr, byte[] bArr2) {
        try {
            this.mMediaDrm.provideKeyResponse(bArr, bArr2);
            return 0;
        } catch (android.media.DeniedByServerException | com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException unused) {
            return -2;
        } catch (android.media.NotProvisionedException unused2) {
            return -1;
        }
    }

    public int provideProvisionResponse(byte[] bArr) {
        try {
            this.mMediaDrm.provideProvisionResponse(bArr);
            return 0;
        } catch (android.media.DeniedByServerException unused) {
            return -1;
        }
    }

    public void release() {
        this.mMediaDrm.close();
    }

    public void setPropertyString(java.lang.String str, java.lang.String str2) {
        this.mMediaDrm.setPropertyString(str, str2);
    }

    private TPMediaDrmProxy(java.util.UUID uuid, boolean z17) {
        com.tencent.thumbplayer.core.drm.ITPMediaDrm createTPDirectMediaDrm;
        if (z17) {
            createTPDirectMediaDrm = com.tencent.thumbplayer.core.drm.TPMediaDrmPool.getInstance().createTPMediaDrm(uuid);
        } else {
            createTPDirectMediaDrm = com.tencent.thumbplayer.core.drm.TPMediaDrmPool.getInstance().createTPDirectMediaDrm(uuid);
        }
        new com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnEventListener() { // from class: com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.1
            @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnEventListener
            public void onEvent(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, int i17, int i18, byte[] bArr2) {
                if (iTPMediaDrm == com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.this.mMediaDrm) {
                    com.tencent.thumbplayer.core.drm.TPMediaDrmProxy.this.native_mediaDrmOnEvent(bArr, i17, i18, bArr2);
                }
            }
        };
        this.mMediaDrm = createTPDirectMediaDrm;
        this.mUUID = uuid;
    }
}

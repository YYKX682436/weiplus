package com.tencent.thumbplayer.core.drm;

/* loaded from: classes16.dex */
public class TPDirectMediaDrm implements com.tencent.thumbplayer.core.drm.ITPMediaDrm {
    private static final java.lang.String TAG = "TPDirectMediaDrm";
    private android.media.MediaDrm mMediaDrm;
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnEventListener mOnEventListener;
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private boolean mReleased;

    public TPDirectMediaDrm(java.util.UUID uuid) {
        this.mReleased = false;
        try {
            this.mMediaDrm = new android.media.MediaDrm(uuid);
        } catch (android.media.UnsupportedSchemeException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            this.mReleased = true;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "new MediaDrm failed, e:" + th6);
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPDirectMediaDrm constructor");
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void close() {
        if (this.mReleased) {
            return;
        }
        this.mMediaDrm.setOnEventListener(null);
        this.mOnEventListener = null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.mMediaDrm.setOnExpirationUpdateListener((android.media.MediaDrm.OnExpirationUpdateListener) null, (android.os.Handler) null);
        this.mOnExpirationUpdateListener = null;
        this.mMediaDrm.setOnKeyStatusChangeListener((android.media.MediaDrm.OnKeyStatusChangeListener) null, (android.os.Handler) null);
        this.mOnKeyStatusChangeListener = null;
        try {
            if (i17 >= 28) {
                this.mMediaDrm.release();
            } else {
                this.mMediaDrm.release();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
        }
        this.mMediaDrm = null;
        this.mReleased = true;
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void closeSession(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.closeSession(bArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized android.media.MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        if (this.mReleased) {
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException(th6.getMessage());
        }
        return this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i17, hashMap);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized java.lang.String getPropertyString(java.lang.String str) {
        if (this.mReleased) {
            return "";
        }
        try {
            return this.mMediaDrm.getPropertyString(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized android.media.MediaDrm.ProvisionRequest getProvisionRequest() {
        if (this.mReleased) {
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException("released");
        }
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException(th6.getMessage());
        }
        return this.mMediaDrm.getProvisionRequest();
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized byte[] openSession() {
        if (this.mReleased) {
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException(th6.getMessage());
        }
        return this.mMediaDrm.openSession();
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (this.mReleased) {
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException("released");
        }
        try {
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            throw new com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException(th6.getMessage());
        }
        return this.mMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void provideProvisionResponse(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.provideProvisionResponse(bArr);
        } catch (android.media.MediaDrmException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized java.util.HashMap<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        if (this.mReleased) {
            return new java.util.HashMap<>();
        }
        try {
            return this.mMediaDrm.queryKeyStatus(bArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
            return new java.util.HashMap<>();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void removeKeys(byte[] bArr) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.removeKeys(bArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void restoreKeys(byte[] bArr, byte[] bArr2) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.restoreKeys(bArr, bArr2);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void setOnExpirationUpdateListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler) {
        if (this.mReleased) {
            return;
        }
        this.mOnExpirationUpdateListener = onExpirationUpdateListener;
        this.mMediaDrm.setOnExpirationUpdateListener(new android.media.MediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.2
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(android.media.MediaDrm mediaDrm, byte[] bArr, long j17) {
                com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener2 = com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.this.mOnExpirationUpdateListener;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.onExpirationUpdate(com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.this, bArr, j17);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void setOnKeyStatusChangeListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler) {
        if (this.mReleased) {
            return;
        }
        this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
        this.mMediaDrm.setOnKeyStatusChangeListener(new android.media.MediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.1
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17) {
                com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener2 = com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.this.mOnKeyStatusChangeListener;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.onKeyStatusChange(com.tencent.thumbplayer.core.drm.TPDirectMediaDrm.this, bArr, list, z17);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void setPropertyString(java.lang.String str, java.lang.String str2) {
        if (this.mReleased) {
            return;
        }
        try {
            this.mMediaDrm.setPropertyString(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, th6.toString());
            close();
        }
    }
}

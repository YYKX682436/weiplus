package com.tencent.thumbplayer.core.drm;

/* loaded from: classes16.dex */
public interface ITPMediaDrm {

    /* loaded from: classes16.dex */
    public interface OnEventListener {
        void onEvent(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, int i17, int i18, byte[] bArr2);
    }

    /* loaded from: classes16.dex */
    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, long j17);
    }

    /* loaded from: classes16.dex */
    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17);
    }

    void close();

    void closeSession(byte[] bArr);

    android.media.MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    java.lang.String getPropertyString(java.lang.String str);

    android.media.MediaDrm.ProvisionRequest getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    java.util.HashMap<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr);

    void removeKeys(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnExpirationUpdateListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler);

    void setOnKeyStatusChangeListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler);

    void setPropertyString(java.lang.String str, java.lang.String str2);
}

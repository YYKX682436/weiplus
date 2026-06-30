package com.tencent.thumbplayer.core.drm;

/* loaded from: classes16.dex */
public final class TPMediaDrmPool {
    private static final java.lang.String TAG = "TPMediaDrmManager";
    private static final com.tencent.thumbplayer.core.drm.TPMediaDrmPool sInstance = new com.tencent.thumbplayer.core.drm.TPMediaDrmPool();
    private boolean mIsMediaDrmReuse = false;

    private TPMediaDrmPool() {
    }

    public static com.tencent.thumbplayer.core.drm.TPMediaDrmPool getInstance() {
        return sInstance;
    }

    public com.tencent.thumbplayer.core.drm.ITPMediaDrm createTPDirectMediaDrm(java.util.UUID uuid) {
        return new com.tencent.thumbplayer.core.drm.TPDirectMediaDrm(uuid);
    }

    public com.tencent.thumbplayer.core.drm.ITPMediaDrm createTPMediaDrm(java.util.UUID uuid) {
        if (this.mIsMediaDrmReuse) {
            try {
                return new com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm(uuid);
            } catch (android.media.MediaDrmException | com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "reset error:" + e17);
            }
        }
        return new com.tencent.thumbplayer.core.drm.TPDirectMediaDrm(uuid);
    }

    public void preload() {
        com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.preloadAsync();
    }

    public void setMediaDrmReuseEnable(boolean z17) {
        this.mIsMediaDrmReuse = z17;
        if (z17) {
            preload();
        }
    }
}

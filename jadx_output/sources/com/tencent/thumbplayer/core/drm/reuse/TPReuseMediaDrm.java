package com.tencent.thumbplayer.core.drm.reuse;

/* loaded from: classes16.dex */
public class TPReuseMediaDrm implements com.tencent.thumbplayer.core.drm.ITPMediaDrm {
    private static final int INIT_POOL_SIZE = 1;
    private static final int KEEP_POOL_SIZE = 2;
    private static final java.lang.String TAG = "[PlayerCore][TPReuseMediaDrm]";
    private static final java.util.UUID WIDEVINE_UUID = new java.util.UUID(-1301668207276963122L, -6645017420763422227L);
    private static java.util.HashMap<java.util.UUID, com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo>> mMediaDrmCachedPoolMap = null;
    private final boolean mCanReUse;
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    private com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private final com.tencent.thumbplayer.core.drm.ITPMediaDrm mTPMediaDrm;
    private boolean mTPMediaDrmError = false;
    private final com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo mTPMediaDrmInfo;
    private final java.util.UUID mUUID;

    /* loaded from: classes16.dex */
    public static class TPMediaDrmInfo {
        byte[] sessionId;
        final com.tencent.thumbplayer.core.drm.ITPMediaDrm tpMediaDrm;

        public TPMediaDrmInfo(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr) {
            this.tpMediaDrm = iTPMediaDrm;
            this.sessionId = bArr;
        }
    }

    /* loaded from: classes16.dex */
    public static class TPObjectLifecycleMgr implements com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> {
        private final java.util.UUID mUUID;

        public TPObjectLifecycleMgr(java.util.UUID uuid) {
            this.mUUID = uuid;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo create(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool) {
            try {
                com.tencent.thumbplayer.core.drm.TPDirectMediaDrm tPDirectMediaDrm = new com.tencent.thumbplayer.core.drm.TPDirectMediaDrm(this.mUUID);
                return new com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
            } catch (android.media.MediaDrmException | com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TAG, "createObject error:" + e17);
                return null;
            }
        }

        @Override // com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public void release(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.close();
        }

        @Override // com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr
        public boolean reset(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.closeSession(tPMediaDrmInfo.sessionId);
            try {
                tPMediaDrmInfo.sessionId = tPMediaDrmInfo.tpMediaDrm.openSession();
                return true;
            } catch (android.media.MediaDrmException | com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TAG, "reset error:" + e17);
                return false;
            }
        }
    }

    public TPReuseMediaDrm(java.util.UUID uuid) {
        preload();
        com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo allocTPMediaDrm = allocTPMediaDrm(uuid);
        this.mCanReUse = allocTPMediaDrm != null;
        if (allocTPMediaDrm == null) {
            com.tencent.thumbplayer.core.drm.TPDirectMediaDrm tPDirectMediaDrm = new com.tencent.thumbplayer.core.drm.TPDirectMediaDrm(uuid);
            allocTPMediaDrm = new com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
        }
        this.mTPMediaDrmInfo = allocTPMediaDrm;
        this.mTPMediaDrm = allocTPMediaDrm.tpMediaDrm;
        this.mUUID = uuid;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPReuseMediaDrm constructor");
    }

    private com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo allocTPMediaDrm(java.util.UUID uuid) {
        com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool != null) {
            return tPDoubleQueueCachedPool.allocObject();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "allocTPMediaDrm error, this UUID DRM is not cached");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freeTPMediaDrm(java.util.UUID uuid, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo tPMediaDrmInfo, boolean z17) {
        com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool == null) {
            tPMediaDrmInfo.tpMediaDrm.close();
        } else if (z17) {
            tPDoubleQueueCachedPool.freeObject(tPMediaDrmInfo);
        } else {
            tPDoubleQueueCachedPool.recycleObject(tPMediaDrmInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preload() {
        if (mMediaDrmCachedPoolMap != null) {
            return;
        }
        java.util.UUID uuid = WIDEVINE_UUID;
        com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo> tPDoubleQueueCachedPool = new com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<>(1, 2, new com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPObjectLifecycleMgr(uuid));
        synchronized (com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.class) {
            if (mMediaDrmCachedPoolMap == null) {
                java.util.HashMap<java.util.UUID, com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.TPMediaDrmInfo>> hashMap = new java.util.HashMap<>();
                mMediaDrmCachedPoolMap = hashMap;
                hashMap.put(uuid, tPDoubleQueueCachedPool);
                tPDoubleQueueCachedPool = null;
            }
        }
        if (tPDoubleQueueCachedPool != null) {
            tPDoubleQueueCachedPool.release();
        }
    }

    public static void preloadAsync() {
        com.tencent.thumbplayer.core.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.preload();
            }
        });
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void close() {
        this.mTPMediaDrm.setOnExpirationUpdateListener(null, null);
        this.mOnExpirationUpdateListener = null;
        this.mTPMediaDrm.setOnKeyStatusChangeListener(null, null);
        this.mOnKeyStatusChangeListener = null;
        if (this.mCanReUse) {
            com.tencent.thumbplayer.core.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm tPReuseMediaDrm = com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this;
                    tPReuseMediaDrm.freeTPMediaDrm(tPReuseMediaDrm.mUUID, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this.mTPMediaDrmInfo, com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this.mTPMediaDrmError);
                }
            });
        } else {
            this.mTPMediaDrm.close();
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized void closeSession(byte[] bArr) {
        if (!java.util.Arrays.equals(bArr, this.mTPMediaDrmInfo.sessionId)) {
            this.mTPMediaDrmError = true;
        }
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public android.media.MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, java.lang.String str, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        return this.mTPMediaDrm.getKeyRequest(bArr, bArr2, str, i17, hashMap);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public java.lang.String getPropertyString(java.lang.String str) {
        return this.mTPMediaDrm.getPropertyString(str);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public android.media.MediaDrm.ProvisionRequest getProvisionRequest() {
        return this.mTPMediaDrm.getProvisionRequest();
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public synchronized byte[] openSession() {
        return this.mTPMediaDrmInfo.sessionId;
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        return this.mTPMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        this.mTPMediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public java.util.HashMap<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        return this.mTPMediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void removeKeys(byte[] bArr) {
        this.mTPMediaDrm.removeKeys(bArr);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mTPMediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void setOnExpirationUpdateListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.os.Handler handler) {
        this.mOnExpirationUpdateListener = onExpirationUpdateListener;
        this.mTPMediaDrm.setOnExpirationUpdateListener(new com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.3
            @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener
            public void onExpirationUpdate(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, long j17) {
                com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener2 = com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this.mOnExpirationUpdateListener;
                if (onExpirationUpdateListener2 != null) {
                    onExpirationUpdateListener2.onExpirationUpdate(com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this, bArr, j17);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void setOnKeyStatusChangeListener(com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.os.Handler handler) {
        this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
        this.mTPMediaDrm.setOnKeyStatusChangeListener(new com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener() { // from class: com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.2
            @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(com.tencent.thumbplayer.core.drm.ITPMediaDrm iTPMediaDrm, byte[] bArr, java.util.List<android.media.MediaDrm.KeyStatus> list, boolean z17) {
                com.tencent.thumbplayer.core.drm.ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener2 = com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this.mOnKeyStatusChangeListener;
                if (onKeyStatusChangeListener2 != null) {
                    onKeyStatusChangeListener2.onKeyStatusChange(com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm.this, bArr, list, z17);
                }
            }
        }, handler);
    }

    @Override // com.tencent.thumbplayer.core.drm.ITPMediaDrm
    public void setPropertyString(java.lang.String str, java.lang.String str2) {
        this.mTPMediaDrm.setPropertyString(str, str2);
    }
}

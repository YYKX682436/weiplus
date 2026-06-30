package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public final class SkylineResourceLoader {
    private static final java.lang.String TAG = "SkylineResourceLoader";
    public boolean isInit = true;
    private com.tencent.skyline.jni.ISkylineResourceLoader mDelegate;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyBitmapLoad(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyResourceLoad(long j17, byte[] bArr);

    public void init() {
        com.tencent.skyline.SkylineLog.i(TAG, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        synchronized (this) {
            this.isInit = true;
        }
    }

    public void initResourceLoader(com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader) {
        this.mDelegate = iSkylineResourceLoader;
    }

    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        if (iSkylineResourceLoader != null) {
            return iSkylineResourceLoader.loadBitmap(str);
        }
        return null;
    }

    public void loadBitmapAsync(final int i17, java.lang.String str) {
        com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        if (iSkylineResourceLoader != null) {
            iSkylineResourceLoader.loadBitmapAsync(str, new com.tencent.skyline.jni.ISkylineResourceLoader.BitmapLoadCallback() { // from class: com.tencent.skyline.jni.SkylineResourceLoader.2
                @Override // com.tencent.skyline.jni.ISkylineResourceLoader.BitmapLoadCallback
                public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
                    if (bitmap != null) {
                        com.tencent.skyline.jni.SkylineResourceLoader.this.nativeNotifyBitmapLoad(i17, bitmap, bitmap.getWidth(), bitmap.getHeight());
                        return;
                    }
                    com.tencent.skyline.SkylineLog skylineLog = com.tencent.skyline.SkylineLog.INSTANCE;
                    com.tencent.skyline.SkylineLog.e(com.tencent.skyline.jni.SkylineResourceLoader.TAG, "requestId:" + i17 + " resource is null, return");
                    com.tencent.skyline.jni.SkylineResourceLoader.this.nativeNotifyBitmapLoad(i17, null, 0, 0);
                }
            });
        } else {
            nativeNotifyBitmapLoad(i17, null, 0, 0);
        }
    }

    public byte[] loadResource(java.lang.String str) {
        com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        return iSkylineResourceLoader != null ? iSkylineResourceLoader.loadResource(str) : new byte[0];
    }

    public void loadResourceAsync(final long j17, java.lang.String str) {
        synchronized (this) {
            if (!this.isInit) {
                com.tencent.skyline.SkylineLog.w(TAG, "isInit is false, ignore");
                return;
            }
            com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
            if (iSkylineResourceLoader != null) {
                iSkylineResourceLoader.loadResourceAsync(str, new com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback() { // from class: com.tencent.skyline.jni.SkylineResourceLoader.1
                    @Override // com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback
                    public void onResourceLoaded(byte[] bArr) {
                        synchronized (com.tencent.skyline.jni.SkylineResourceLoader.this) {
                            com.tencent.skyline.jni.SkylineResourceLoader skylineResourceLoader = com.tencent.skyline.jni.SkylineResourceLoader.this;
                            if (!skylineResourceLoader.isInit) {
                                com.tencent.skyline.SkylineLog.w(com.tencent.skyline.jni.SkylineResourceLoader.TAG, "isInit is false, ignore");
                                return;
                            }
                            if (bArr == null) {
                                com.tencent.skyline.SkylineLog.e(com.tencent.skyline.jni.SkylineResourceLoader.TAG, "resource is null, return");
                                com.tencent.skyline.jni.SkylineResourceLoader.this.nativeNotifyResourceLoad(j17, new byte[0]);
                            } else {
                                skylineResourceLoader.nativeNotifyResourceLoad(j17, bArr);
                            }
                        }
                    }
                });
            } else {
                nativeNotifyResourceLoad(j17, new byte[0]);
            }
        }
    }

    public void release() {
        com.tencent.skyline.SkylineLog.i(TAG, "release");
        synchronized (this) {
            this.isInit = false;
        }
    }
}

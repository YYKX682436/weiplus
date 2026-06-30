package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public final class SkylineFileSystem {
    private static final java.lang.String TAG = "SkylineFileSystem";
    public boolean isInit = true;
    private com.tencent.skyline.jni.ISkylineFileSystem mDelegate;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyWriteTempFile(long j17, int i17, java.lang.String str);

    public void init() {
        com.tencent.skyline.SkylineLog.i(TAG, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        synchronized (this) {
            this.isInit = true;
        }
    }

    public void initFileSystem(com.tencent.skyline.jni.ISkylineFileSystem iSkylineFileSystem) {
        this.mDelegate = iSkylineFileSystem;
    }

    public void release() {
        com.tencent.skyline.SkylineLog.i(TAG, "release");
        synchronized (this) {
            this.isInit = false;
        }
    }

    public void writeTempFileAsync(final long j17, byte[] bArr, java.lang.String str) {
        if (bArr == null || bArr.length <= 0) {
            com.tencent.skyline.SkylineLog skylineLog = com.tencent.skyline.SkylineLog.INSTANCE;
            com.tencent.skyline.SkylineLog.e(TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d fail, bytes is null", java.lang.Long.valueOf(j17)));
            nativeNotifyWriteTempFile(j17, -1, "");
            return;
        }
        com.tencent.skyline.SkylineLog skylineLog2 = com.tencent.skyline.SkylineLog.INSTANCE;
        com.tencent.skyline.SkylineLog.i(TAG, java.lang.String.format("writeTempFileAsync callbackPtr:%d bytes:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(bArr.length)));
        com.tencent.skyline.jni.ISkylineFileSystem iSkylineFileSystem = this.mDelegate;
        if (iSkylineFileSystem != null) {
            iSkylineFileSystem.writeTempFileAsync(bArr, str, new com.tencent.skyline.jni.ISkylineFileSystemCallback() { // from class: com.tencent.skyline.jni.SkylineFileSystem.1
                @Override // com.tencent.skyline.jni.ISkylineFileSystemCallback
                public void onWriteTempFile(int i17, java.lang.String str2) {
                    com.tencent.skyline.SkylineLog skylineLog3 = com.tencent.skyline.SkylineLog.INSTANCE;
                    com.tencent.skyline.SkylineLog.i(com.tencent.skyline.jni.SkylineFileSystem.TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d path:%s", java.lang.Long.valueOf(j17), str2));
                    com.tencent.skyline.jni.SkylineFileSystem.this.nativeNotifyWriteTempFile(j17, i17, str2);
                }
            });
        } else {
            com.tencent.skyline.SkylineLog.i(TAG, java.lang.String.format("writeTempFileAsync onWriteTempFile callbackPtr:%d fail", java.lang.Long.valueOf(j17)));
            nativeNotifyWriteTempFile(j17, -1, "");
        }
    }
}

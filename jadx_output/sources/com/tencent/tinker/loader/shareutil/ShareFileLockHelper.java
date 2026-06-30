package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareFileLockHelper implements java.io.Closeable {
    public static final int LOCK_WAIT_EACH_TIME = 10;
    public static final int MAX_LOCK_ATTEMPTS = 3;
    private static final java.lang.String TAG = "Tinker.FileLockHelper";
    private final java.nio.channels.FileLock fileLock;
    private final java.io.FileOutputStream outputStream;

    private ShareFileLockHelper(java.io.File file) {
        this.outputStream = new java.io.FileOutputStream(file);
        java.nio.channels.FileLock fileLock = null;
        int i17 = 0;
        java.lang.Exception e17 = null;
        while (i17 < 3) {
            i17++;
            try {
                fileLock = this.outputStream.getChannel().lock();
                if (fileLock != null) {
                    break;
                }
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "getInfoLock Thread failed time:10", new java.lang.Object[0]);
            }
            try {
                java.lang.Thread.sleep(10L);
            } catch (java.lang.Exception e19) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "getInfoLock Thread sleep exception", e19);
            }
        }
        if (fileLock != null) {
            this.fileLock = fileLock;
        } else {
            throw new java.io.IOException("Tinker Exception:FileLockHelper lock file failed: " + file.getAbsolutePath(), e17);
        }
    }

    public static com.tencent.tinker.loader.shareutil.ShareFileLockHelper getFileLock(java.io.File file) {
        return new com.tencent.tinker.loader.shareutil.ShareFileLockHelper(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            java.nio.channels.FileLock fileLock = this.fileLock;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            java.io.FileOutputStream fileOutputStream = this.outputStream;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}

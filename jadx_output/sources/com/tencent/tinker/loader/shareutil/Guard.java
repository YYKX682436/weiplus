package com.tencent.tinker.loader.shareutil;

/* loaded from: classes12.dex */
public class Guard implements java.io.Closeable {
    private static final int CLEANING_FLAG = 1;
    private final java.nio.channels.FileLock mLock;
    private final java.io.Closeable mStream;

    private Guard(java.io.Closeable closeable, java.nio.channels.FileLock fileLock) {
        if (closeable == null) {
            throw new java.lang.IllegalArgumentException("stream should not be null");
        }
        if (fileLock == null) {
            throw new java.lang.IllegalArgumentException("lock should not be null");
        }
        this.mStream = closeable;
        this.mLock = fileLock;
    }

    public static com.tencent.tinker.loader.shareutil.Guard acquireClean(java.io.File file) {
        java.io.FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
        } catch (java.io.IOException unused) {
        }
        try {
            java.nio.channels.FileLock tryLock = fileOutputStream.getChannel().tryLock();
            if (tryLock == null) {
                closeSilence(fileOutputStream);
                return null;
            }
            try {
                fileOutputStream.write(1);
                return new com.tencent.tinker.loader.shareutil.Guard(fileOutputStream, tryLock);
            } catch (java.io.IOException unused2) {
                releaseSilence(tryLock);
                closeSilence(fileOutputStream);
                return null;
            }
        } catch (java.io.IOException unused3) {
            closeSilence(fileOutputStream);
            return null;
        } catch (java.nio.channels.OverlappingFileLockException unused4) {
            closeSilence(fileOutputStream);
            return null;
        }
    }

    public static com.tencent.tinker.loader.shareutil.Guard acquireUse(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        try {
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.io.IOException unused) {
        }
        try {
            java.nio.channels.FileLock tryLock = fileInputStream.getChannel().tryLock(0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue, true);
            if (tryLock == null) {
                closeSilence(fileInputStream);
                return null;
            }
            try {
                if (fileInputStream.read() != 1) {
                    return new com.tencent.tinker.loader.shareutil.Guard(fileInputStream, tryLock);
                }
                releaseSilence(tryLock);
                closeSilence(fileInputStream);
                return null;
            } catch (java.io.IOException unused2) {
                releaseSilence(tryLock);
                closeSilence(fileInputStream);
                return null;
            }
        } catch (java.io.IOException unused3) {
            closeSilence(fileInputStream);
            return null;
        } catch (java.nio.channels.OverlappingFileLockException unused4) {
            closeSilence(fileInputStream);
            return null;
        }
    }

    private static void closeSilence(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    private static void releaseSilence(java.nio.channels.FileLock fileLock) {
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseSilence(this.mLock);
        closeSilence(this.mStream);
    }
}

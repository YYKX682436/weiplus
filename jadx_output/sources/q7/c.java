package q7;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f360290a = new java.util.concurrent.atomic.AtomicReference();

    public static java.nio.ByteBuffer a(java.io.File file) {
        java.io.RandomAccessFile randomAccessFile;
        java.nio.channels.FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.io.IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new java.io.IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new java.io.RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                java.nio.MappedByteBuffer load = fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (java.io.IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused2) {
                }
                return load;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (java.io.IOException unused4) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            randomAccessFile = null;
        }
    }

    public static void b(java.nio.ByteBuffer byteBuffer, java.io.File file) {
        java.io.RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        java.nio.channels.FileChannel fileChannel = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (java.io.IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (java.io.IOException unused4) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            randomAccessFile = null;
        }
    }
}

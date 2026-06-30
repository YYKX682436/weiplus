package e3;

/* loaded from: classes13.dex */
public abstract class r {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean b(java.io.File file, android.content.res.Resources resources, int i17) {
        java.io.InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i17);
            try {
                boolean c17 = c(file, inputStream);
                a(inputStream);
                return c17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                a(inputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    public static boolean c(java.io.File file, java.io.InputStream inputStream) {
        java.io.FileOutputStream fileOutputStream;
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    a(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException e18) {
            e = e18;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            a(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static java.io.File d(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i17 = 0; i17 < 100; i17++) {
            java.io.File file = new java.io.File(cacheDir, str + i17);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static java.nio.ByteBuffer e(android.content.Context context, android.os.CancellationSignal cancellationSignal, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor a17 = e3.q.a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a17 == null) {
                if (a17 != null) {
                    a17.close();
                }
                return null;
            }
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(a17.getFileDescriptor());
                try {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a17.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}

package vi;

/* loaded from: classes12.dex */
public abstract class c {
    public static void a(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else if (obj instanceof java.util.zip.ZipFile) {
                ((java.util.zip.ZipFile) obj).close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void b(java.io.File file, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            while (true) {
                try {
                    int read = bufferedInputStream2.read(bArr);
                    if (read <= 0) {
                        outputStream.flush();
                        a(bufferedInputStream2);
                        return;
                    }
                    outputStream.write(bArr, 0, read);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedInputStream = bufferedInputStream2;
                    a(bufferedInputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}

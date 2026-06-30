package org.chromium.base;

/* loaded from: classes7.dex */
public class StreamUtil {
    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static void closeQuietly(java.util.zip.ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (java.io.IOException unused) {
        }
    }
}

package lv5;

/* loaded from: classes12.dex */
public abstract class a {
    public static void a(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else if (obj instanceof java.lang.AutoCloseable) {
                ((java.lang.AutoCloseable) obj).close();
            } else if (obj instanceof java.util.zip.ZipFile) {
                ((java.util.zip.ZipFile) obj).close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}

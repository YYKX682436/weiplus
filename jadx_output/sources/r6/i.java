package r6;

/* loaded from: classes12.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f392777a = java.nio.charset.Charset.forName("US-ASCII");

    static {
        java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
    }

    public static void a(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new java.io.IOException("not a readable directory: " + file);
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: " + file2);
            }
        }
    }
}

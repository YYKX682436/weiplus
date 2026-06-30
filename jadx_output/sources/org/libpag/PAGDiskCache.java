package org.libpag;

/* loaded from: classes12.dex */
public class PAGDiskCache {
    static {
        b56.a.a("pag");
    }

    private static java.lang.String GetCacheDir() {
        android.content.Context context = b56.a.f18113a;
        if (context == null) {
            return "";
        }
        java.io.File externalCacheDir = ("mounted".equals(android.os.Environment.getExternalStorageState()) || !android.os.Environment.isExternalStorageRemovable()) ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir == null ? "" : externalCacheDir.getPath();
    }

    public static native long MaxDiskSize();

    public static native byte[] ReadFile(java.lang.String str);

    public static native void RemoveAll();

    public static native void SetMaxDiskSize(long j17);

    public static native boolean WriteFile(java.lang.String str, byte[] bArr);
}

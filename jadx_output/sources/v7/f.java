package v7;

/* loaded from: classes7.dex */
public abstract class f {
    public static void a(java.io.File file) {
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new java.io.IOException(java.lang.String.format("Directory %s can't be created", file.getAbsolutePath()));
            }
        } else {
            if (file.isDirectory()) {
                return;
            }
            throw new java.io.IOException("File " + file + " is not directory!");
        }
    }
}

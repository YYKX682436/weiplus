package t9;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f416494a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f416495b;

    public c(java.io.File file) {
        this.f416494a = file;
        this.f416495b = new java.io.File(file.getPath() + ".bak");
    }

    public java.io.InputStream a() {
        java.io.File file = this.f416495b;
        boolean exists = file.exists();
        java.io.File file2 = this.f416494a;
        if (exists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new java.io.FileInputStream(file2);
    }

    public java.io.OutputStream b() {
        java.io.File file = this.f416494a;
        if (file.exists()) {
            java.io.File file2 = this.f416495b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                java.util.Objects.toString(file);
                java.util.Objects.toString(file2);
            }
        }
        try {
            return new t9.b(file);
        } catch (java.io.FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new java.io.IOException("Couldn't create directory " + file);
            }
            try {
                return new t9.b(file);
            } catch (java.io.FileNotFoundException unused2) {
                throw new java.io.IOException("Couldn't create " + file);
            }
        }
    }
}

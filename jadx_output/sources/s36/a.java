package s36;

/* loaded from: classes13.dex */
public class a implements s36.b {
    public void a(java.io.File file) {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new java.io.IOException("failed to delete " + file);
    }

    public void b(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new java.io.IOException("not a readable directory: " + file);
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete " + file2);
            }
        }
    }

    public void c(java.io.File file, java.io.File file2) {
        a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new java.io.IOException("failed to rename " + file + " to " + file2);
    }
}

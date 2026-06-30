package d55;

/* loaded from: classes12.dex */
public abstract class m0 {
    public static void a(java.io.File file) {
        if (file == null) {
            throw new java.io.IOException("Dir is null.");
        }
        if (!file.exists()) {
            file.mkdirs();
        } else {
            if (file.isDirectory()) {
                return;
            }
            if (!d(file)) {
                throw new java.io.IOException("Fail to delete existing file, file = " + file.getAbsolutePath());
            }
            file.mkdir();
        }
        if (file.exists() && file.isDirectory()) {
            return;
        }
        throw new java.io.IOException("Fail to create dir, dir = " + file.getAbsolutePath());
    }

    public static void b(java.io.File file) {
        if (file == null) {
            throw new java.io.IOException("File is null.");
        }
        if (file.exists()) {
            d(file);
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new java.io.IOException("Can not create parent for current file, path = " + file.getAbsolutePath());
        }
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (!file.createNewFile()) {
            throw new java.io.IOException("Create file fail, file already exists.");
        }
        if (d55.a0.f226554i) {
            d55.o0.a(4, "MicroMsg.recovery.fileUtils", "checkCreateFile, create path: " + file.getPath());
        }
    }

    public static void c(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else if (!(obj instanceof java.lang.AutoCloseable)) {
            } else {
                ((java.lang.AutoCloseable) obj).close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean d(java.io.File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? e(file) : f(file);
    }

    public static boolean e(java.io.File file) {
        java.io.File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            f(file);
            return true;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        }
        for (java.io.File file2 : listFiles) {
            e(file2);
        }
        f(file);
        return true;
    }

    public static boolean f(java.io.File file) {
        boolean z17 = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            if (d55.a0.f226554i) {
                d55.o0.a(4, "MicroMsg.recovery.fileUtils", "safeDeleteFile, try to delete path: " + file.getPath());
            }
            z17 = file.delete();
            if (!z17) {
                d55.o0.a(5, "MicroMsg.recovery.fileUtils", "Failed to delete file, try to delete when exit. path: " + file.getPath());
                file.deleteOnExit();
            }
        }
        return z17;
    }
}

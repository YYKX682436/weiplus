package dy5;

/* loaded from: classes12.dex */
public abstract class b {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipFile zipFile;
        by5.c4.f("XWebDecompressor", "decompressDownloadZip, zipFile:" + str + ", destDir:" + str2);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new java.util.zip.ZipFile(str);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.io.IOException e17) {
            e = e17;
        }
        try {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                java.util.zip.ZipEntry nextElement = entries.nextElement();
                java.lang.String encode = java.net.URLEncoder.encode(nextElement.getName(), com.tencent.mapsdk.internal.rv.f51270c);
                if (!encode.contains("../") && !encode.contains("..\\") && !nextElement.isDirectory()) {
                    java.io.File file = new java.io.File(str2, encode);
                    if (file.exists()) {
                        file.delete();
                    } else {
                        java.io.File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                    }
                    by5.u.f(zipFile.getInputStream(nextElement), file);
                    by5.c4.f("XWebDecompressor", "decompress " + encode + " to " + file.getAbsolutePath());
                }
            }
            by5.u.l(zipFile);
            java.lang.System.gc();
            by5.c4.f("XWebDecompressor", "decompressDownloadZip, costTime:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + " ms");
            return true;
        } catch (java.io.IOException e18) {
            e = e18;
            zipFile2 = zipFile;
            by5.c4.d("XWebDecompressor", "decompressDownloadZip, error", e);
            by5.u.l(zipFile2);
            return false;
        } catch (java.lang.Throwable th7) {
            th = th7;
            zipFile2 = zipFile;
            by5.u.l(zipFile2);
            throw th;
        }
    }
}

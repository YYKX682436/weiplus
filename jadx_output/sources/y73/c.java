package y73;

/* loaded from: classes12.dex */
public abstract class c {
    public static final void a(android.content.Context context, java.io.File patchDir) {
        kotlin.jvm.internal.o.g(context, "<this>");
        kotlin.jvm.internal.o.g(patchDir, "patchDir");
        java.io.File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.o.f(cacheDir, "getCacheDir(...)");
        java.io.File f17 = vz5.q.f(vz5.q.f(cacheDir, "broken-tinker"), "broken.archive");
        java.io.File parentFile = f17.getParentFile();
        if (parentFile != null) {
            if (!parentFile.isDirectory()) {
                parentFile.delete();
            }
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(f17));
        try {
            q26.h hVar = new q26.h((q26.i) q26.h0.i(new vz5.l(patchDir, vz5.m.f441800d), y73.b.f459701d));
            while (hVar.hasNext()) {
                java.io.File file = (java.io.File) hVar.next();
                java.lang.String g17 = vz5.q.g(file, patchDir);
                java.lang.String separator = java.io.File.separator;
                kotlin.jvm.internal.o.f(separator, "separator");
                zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(patchDir.getName() + '/' + r26.i0.t(g17, separator, "/", false)));
                java.io.InputStream fileInputStream = new java.io.FileInputStream(file);
                java.io.BufferedInputStream bufferedInputStream = fileInputStream instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) fileInputStream : new java.io.BufferedInputStream(fileInputStream, 8192);
                try {
                    vz5.a.b(bufferedInputStream, zipOutputStream, 0, 2, null);
                    vz5.b.a(bufferedInputStream, null);
                    zipOutputStream.closeEntry();
                } finally {
                }
            }
            vz5.b.a(zipOutputStream, null);
        } finally {
        }
    }
}

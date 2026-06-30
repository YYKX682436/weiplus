package wl2;

/* loaded from: classes5.dex */
public abstract class e {
    public static final void a(java.lang.String zipFilePath, java.lang.String unzipFolder) {
        kotlin.jvm.internal.o.g(zipFilePath, "zipFilePath");
        kotlin.jvm.internal.o.g(unzipFolder, "unzipFolder");
        if (!(zipFilePath.length() == 0)) {
            if (!(unzipFolder.length() == 0)) {
                com.tencent.mars.xlog.Log.i("LiveUnZip", "checkAndUnzip zipFilePath:" + zipFilePath + " unzipFolder: " + unzipFolder);
                if ((zipFilePath.length() == 0) || !com.tencent.mm.vfs.w6.j(zipFilePath)) {
                    return;
                }
                java.lang.String concat = unzipFolder.concat("_temp");
                com.tencent.mm.vfs.w6.f(concat);
                com.tencent.mm.vfs.w6.f(unzipFolder);
                com.tencent.mm.vfs.w6.u(concat);
                com.tencent.mars.xlog.Log.i("LiveUnZip", "unZip result unzipStatus: " + com.tencent.mm.vfs.w6.Q(zipFilePath, concat) + " moveDirStatus: " + com.tencent.mm.vfs.w6.v(concat, unzipFolder));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("LiveUnZip", "unZip fail path empty, zipFilePath: " + zipFilePath + " unzipFolder: " + unzipFolder);
    }
}

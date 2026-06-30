package w73;

/* loaded from: classes11.dex */
public abstract class e {
    public static int a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i17;
        uk.b b17;
        uk.a aVar;
        if (str != null && str2 != null && str3 != null) {
            try {
                java.io.File file = new java.io.File(str);
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
                java.io.File file2 = new java.io.File(str3);
                com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str3));
                java.io.File file3 = new java.io.File(str2);
                if (!file.exists() || !file3.exists()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file2.exists()), java.lang.Boolean.valueOf(file3.exists()));
                    randomAccessFile.close();
                    return -1;
                }
                if (com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion > 29 || (b17 = uk.b.b(str)) == null || (aVar = b17.f428481a) == null) {
                    i17 = 0;
                } else {
                    i17 = aVar.f428480a + 8;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", java.lang.Integer.valueOf(i17));
                }
                if (uk.g.b(randomAccessFile, file2, file3, i17) != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                    randomAccessFile.close();
                    return -1;
                }
                randomAccessFile.close();
                if (str4.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(str3))) {
                    return 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, com.tencent.mm.vfs.w6.p(str3));
                return -2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", e17, "merge apk failed.", new java.lang.Object[0]);
            }
        }
        return -1;
    }

    public static int b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i17;
        uk.b b17;
        uk.a aVar;
        if (str == null || str2 == null || str3 == null) {
            return -5;
        }
        try {
            java.io.File file = new java.io.File(str);
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
            java.io.File file2 = new java.io.File(str3);
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str3));
            java.io.File file3 = new java.io.File(str2);
            if (!file.exists() || !file3.exists()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file2.exists()), java.lang.Boolean.valueOf(file3.exists()));
                randomAccessFile.close();
                return -1;
            }
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion > 29 || (b17 = uk.b.b(str)) == null || (aVar = b17.f428481a) == null) {
                i17 = 0;
            } else {
                i17 = aVar.f428480a + 8;
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", java.lang.Integer.valueOf(i17));
            }
            if (uk.g.b(randomAccessFile, file2, file3, i17) != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                randomAccessFile.close();
                return -2;
            }
            randomAccessFile.close();
            if (str4.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(str3))) {
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, com.tencent.mm.vfs.w6.p(str3));
            return -3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", e17, "merge apk failed.", new java.lang.Object[0]);
            return -4;
        }
    }
}

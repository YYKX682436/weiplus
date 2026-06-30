package qv5;

/* loaded from: classes13.dex */
public abstract class c {
    public static boolean a(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.io.File file, java.lang.String str, boolean z17) {
        java.io.BufferedInputStream bufferedInputStream;
        int i17 = 0;
        boolean z18 = false;
        while (i17 < 2 && !z18) {
            i17++;
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.BasePatchInternal", "try Extracting " + file.getPath(), new java.lang.Object[0]);
            java.io.BufferedOutputStream bufferedOutputStream = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                bufferedInputStream = new java.io.BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                    try {
                        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(33, true)) {
                            file.setReadOnly();
                        }
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            bufferedOutputStream2.write(bArr, 0, read);
                        }
                        lv5.a.a(bufferedOutputStream2);
                        lv5.a.a(bufferedInputStream);
                        z18 = str != null ? z17 ? com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(file, str) : com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyFileMd5(file, str) : true;
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.BasePatchInternal", "isExtractionSuccessful: %b", java.lang.Boolean.valueOf(z18));
                        if (!z18 && (!file.delete() || file.exists())) {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.BasePatchInternal", "Failed to delete corrupted dex " + file.getPath(), new java.lang.Object[0]);
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedOutputStream = bufferedOutputStream2;
                        lv5.a.a(bufferedOutputStream);
                        lv5.a.a(bufferedInputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedInputStream = null;
            }
        }
        return z18;
    }

    public static int b(int i17) {
        if (i17 == 3) {
            return -3;
        }
        if (i17 == 5) {
            return -4;
        }
        return i17 == 6 ? -8 : 0;
    }
}

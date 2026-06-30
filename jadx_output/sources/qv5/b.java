package qv5;

/* loaded from: classes13.dex */
public abstract class b extends qv5.c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f367042a = new java.util.ArrayList();

    public static boolean c(tv5.b bVar, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck, android.content.Context context, java.lang.String str, java.io.File file) {
        java.util.zip.ZipFile zipFile;
        java.lang.String str2;
        java.lang.String str3 = shareSecurityCheck.getMetaContentMap().get(com.tencent.tinker.loader.shareutil.ShareConstants.ARKHOT_META_FILE);
        if (str3 == null) {
            return true;
        }
        java.lang.String str4 = str + "/arkHot/";
        java.util.ArrayList arrayList = f367042a;
        arrayList.clear();
        com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo.parseDiffPatchInfo(str3, arrayList);
        tv5.b b17 = tv5.b.b(context);
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new java.util.zip.ZipFile(file);
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            zipFile = zipFile2;
        }
        try {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo shareArkHotDiffPatchInfo = (com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo) it.next();
                java.lang.String str5 = shareArkHotDiffPatchInfo.path;
                if (str5.equals("")) {
                    str2 = shareArkHotDiffPatchInfo.name;
                } else {
                    str2 = str5 + "/" + shareArkHotDiffPatchInfo.name;
                }
                java.lang.String str6 = shareArkHotDiffPatchInfo.patchMd5;
                if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(str6)) {
                    b17.f422372e.c(file, qv5.c.b(8));
                    break;
                }
                java.io.File file2 = new java.io.File(str4 + shareArkHotDiffPatchInfo.name);
                if (!file2.exists()) {
                    file2.getParentFile().mkdirs();
                } else if (!str6.equals(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(file2))) {
                    file2.delete();
                }
                if (!qv5.c.a(zipFile, zipFile.getEntry(str2), file2, str6, false)) {
                    b17.f422372e.a(file, file2, shareArkHotDiffPatchInfo.name, 8);
                    break;
                }
            }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile);
            return true;
        } catch (java.io.IOException e18) {
            e = e18;
            zipFile2 = zipFile;
            throw new com.tencent.tinker.loader.TinkerRuntimeException("patch " + com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(8) + " extract failed (" + e.getMessage() + ").", e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile);
            throw th;
        }
    }
}

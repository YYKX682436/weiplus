package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerArkHotLoader {
    private static final java.lang.String ARKHOT_PATH = "arkHot";
    private static final java.lang.String ARK_MEAT_FILE = "assets/arkHot_meta.txt";
    private static final java.lang.String TAG = "Tinker.TinkerArkHotLoader";
    private static java.util.HashSet<com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo> arkHotApkInfo = new java.util.HashSet<>();
    private static boolean isArkHotRuning = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isArkHotRuning();

    private TinkerArkHotLoader() {
    }

    public static boolean checkComplete(java.lang.String str, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck, android.content.Intent intent) {
        java.lang.String str2 = shareSecurityCheck.getMetaContentMap().get("assets/arkHot_meta.txt");
        if (str2 == null) {
            return true;
        }
        arkHotApkInfo.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo.parseDiffPatchInfo(str2, arrayList);
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo shareArkHotDiffPatchInfo = (com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo) it.next();
            if (!com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo.checkDiffPatchInfo(shareArkHotDiffPatchInfo)) {
                intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_PACKAGE_PATCH_CHECK, -3);
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -8);
                return false;
            }
            if (isArkHotRuning && com.tencent.tinker.loader.shareutil.ShareConstants.ARKHOT_PATCH_NAME.equals(shareArkHotDiffPatchInfo.name)) {
                arkHotApkInfo.add(shareArkHotDiffPatchInfo);
            }
        }
        if (isArkHotRuning && !arkHotApkInfo.isEmpty()) {
            hashMap.put(com.tencent.tinker.loader.shareutil.ShareConstants.ARKHOT_PATCH_NAME, "");
        }
        java.lang.String str3 = str + "/arkHot/";
        java.io.File file = new java.io.File(str3);
        if (!file.exists() || !file.isDirectory()) {
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -9);
            return false;
        }
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            java.io.File file2 = new java.io.File(str3 + ((java.lang.String) it6.next()));
            if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file2)) {
                try {
                    intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_MISSING_DEX_PATH, file2.getCanonicalPath());
                } catch (java.io.IOException unused) {
                }
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -10);
                return false;
            }
        }
        intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_DEXES_PATH, hashMap);
        return true;
    }

    public static boolean loadTinkerArkHot(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication, java.lang.String str, android.content.Intent intent) {
        if (arkHotApkInfo.isEmpty()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "there is no apk to load", new java.lang.Object[0]);
            return true;
        }
        dalvik.system.PathClassLoader pathClassLoader = (dalvik.system.PathClassLoader) com.tencent.tinker.loader.TinkerArkHotLoader.class.getClassLoader();
        if (pathClassLoader == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "classloader is null", new java.lang.Object[0]);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -12);
            return false;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "classloader: " + pathClassLoader.toString(), new java.lang.Object[0]);
        java.lang.String str2 = str + "/arkHot/";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (isArkHotRuning && !arkHotApkInfo.isEmpty()) {
            arrayList.add(new java.io.File(str2 + com.tencent.tinker.loader.shareutil.ShareConstants.ARKHOT_PATCH_NAME));
        }
        try {
            com.tencent.tinker.loader.SystemClassLoaderAdder.installApk(pathClassLoader, arrayList);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "install dexes failed", new java.lang.Object[0]);
            intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_EXCEPTION, th6);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -14);
            return false;
        }
    }
}

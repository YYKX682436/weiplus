package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerResourceLoader {
    protected static final java.lang.String RESOURCE_FILE = "resources.apk";
    protected static final java.lang.String RESOURCE_META_FILE = "assets/res_meta.txt";
    protected static final java.lang.String RESOURCE_PATH = "res";
    private static final java.lang.String TAG = "Tinker.ResourceLoader";
    private static com.tencent.tinker.loader.shareutil.ShareResPatchInfo resPatchInfo = new com.tencent.tinker.loader.shareutil.ShareResPatchInfo();

    private TinkerResourceLoader() {
    }

    public static boolean checkComplete(android.content.Context context, java.lang.String str, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck, android.content.Intent intent) {
        java.lang.String str2 = shareSecurityCheck.getMetaContentMap().get("assets/res_meta.txt");
        if (str2 == null) {
            return true;
        }
        com.tencent.tinker.loader.shareutil.ShareResPatchInfo.parseResPatchInfoFirstLine(str2, resPatchInfo);
        com.tencent.tinker.loader.shareutil.ShareResPatchInfo shareResPatchInfo = resPatchInfo;
        if (shareResPatchInfo.resArscMd5 == null) {
            return true;
        }
        if (!com.tencent.tinker.loader.shareutil.ShareResPatchInfo.checkResPatchInfo(shareResPatchInfo)) {
            intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_PACKAGE_PATCH_CHECK, -8);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -8);
            return false;
        }
        java.lang.String str3 = str + "/res/";
        java.io.File file = new java.io.File(str3);
        if (!file.exists() || !file.isDirectory()) {
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -21);
            return false;
        }
        if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(new java.io.File(str3 + "resources.apk"))) {
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -22);
            return false;
        }
        try {
            com.tencent.tinker.loader.TinkerResourcePatcher.isResourceCanPatch(context);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "resource hook check failed.", th6);
            intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_EXCEPTION, th6);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -23);
            return false;
        }
    }

    public static boolean loadTinkerResources(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication, java.lang.String str, android.content.Intent intent) {
        com.tencent.tinker.loader.shareutil.ShareResPatchInfo shareResPatchInfo = resPatchInfo;
        if (shareResPatchInfo == null || shareResPatchInfo.resArscMd5 == null) {
            return true;
        }
        java.lang.String str2 = str + "/res/resources.apk";
        java.io.File file = new java.io.File(str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (tinkerApplication.isTinkerLoadVerifyFlag()) {
            if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkResourceArscMd5(file, resPatchInfo.resArscMd5)) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Failed to load resource file, path: " + file.getPath() + ", expect md5: " + resPatchInfo.resArscMd5, new java.lang.Object[0]);
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -24);
                return false;
            }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "verify resource file:" + file.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        }
        try {
            com.tencent.tinker.loader.TinkerResourcePatcher.monkeyPatchExistingResources(tinkerApplication, str2, false);
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "monkeyPatchExistingResources resource file:" + str2 + ", use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "install resources failed", new java.lang.Object[0]);
            try {
                com.tencent.tinker.loader.SystemClassLoaderAdder.uninstallPatchDex(tinkerApplication.getClassLoader());
            } catch (java.lang.Throwable unused) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "uninstallPatchDex failed", th6);
            }
            intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_EXCEPTION, th6);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -23);
            return false;
        }
    }
}

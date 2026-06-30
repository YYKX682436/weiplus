package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerDexLoader {
    private static final java.lang.String DEFAULT_DEX_OPTIMIZE_PATH = "odex";
    private static final java.lang.String DEX_MEAT_FILE = "assets/dex_meta.txt";
    private static final java.lang.String DEX_PATH = "dex";
    private static final java.lang.String INTERPRET_DEX_OPTIMIZE_PATH = "interpet";
    private static final java.lang.String TAG = "Tinker.TinkerDexLoader";
    private static final java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> LOAD_DEX_LIST = new java.util.ArrayList<>();
    private static java.util.HashSet<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> classNDexInfo = new java.util.HashSet<>();
    private static boolean isVmArt = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isVmArt();

    private TinkerDexLoader() {
    }

    public static boolean checkComplete(java.lang.String str, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck, java.lang.String str2, android.content.Intent intent) {
        java.lang.String str3 = shareSecurityCheck.getMetaContentMap().get("assets/dex_meta.txt");
        if (str3 == null) {
            return true;
        }
        LOAD_DEX_LIST.clear();
        classNDexInfo.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo.parseDexDiffPatchInfo(str3, arrayList);
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo = null;
        while (it.hasNext()) {
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo2 = (com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo) it.next();
            if (!isJustArtSupportDex(shareDexDiffPatchInfo2)) {
                if (!com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo.checkDexDiffPatchInfo(shareDexDiffPatchInfo2)) {
                    intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_PACKAGE_PATCH_CHECK, -3);
                    com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -8);
                    return false;
                }
                if (isVmArt && shareDexDiffPatchInfo2.rawName.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.TEST_DEX_NAME)) {
                    shareDexDiffPatchInfo = shareDexDiffPatchInfo2;
                } else if (isVmArt && com.tencent.tinker.loader.shareutil.ShareConstants.CLASS_N_PATTERN.matcher(shareDexDiffPatchInfo2.realName).matches()) {
                    classNDexInfo.add(shareDexDiffPatchInfo2);
                } else {
                    hashMap.put(shareDexDiffPatchInfo2.realName, getInfoMd5(shareDexDiffPatchInfo2));
                    LOAD_DEX_LIST.add(shareDexDiffPatchInfo2);
                }
            }
        }
        if (isVmArt && (shareDexDiffPatchInfo != null || !classNDexInfo.isEmpty())) {
            if (shareDexDiffPatchInfo != null) {
                java.util.HashSet<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> hashSet = classNDexInfo;
                hashSet.add(com.tencent.tinker.loader.shareutil.ShareTinkerInternals.changeTestDexToClassN(shareDexDiffPatchInfo, hashSet.size() + 1));
            }
            hashMap.put(com.tencent.tinker.loader.shareutil.ShareConstants.CLASS_N_APK_NAME, "");
        }
        java.lang.String str4 = str + "/dex/";
        java.io.File file = new java.io.File(str4);
        if (!file.exists() || !file.isDirectory()) {
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -9);
            return false;
        }
        java.io.File file2 = new java.io.File(str + "/" + str2 + "/");
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            java.io.File file3 = new java.io.File(str4 + ((java.lang.String) it6.next()));
            if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file3)) {
                intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_MISSING_DEX_PATH, file3.getAbsolutePath());
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -10);
                return false;
            }
            java.io.File file4 = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.optimizedPathFor(file3, file2));
            if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file4) && !com.tencent.tinker.loader.shareutil.SharePatchFileUtil.shouldAcceptEvenIfIllegal(file4)) {
                intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_MISSING_DEX_PATH, file4.getAbsolutePath());
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -11);
                return false;
            }
        }
        intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_DEXES_PATH, hashMap);
        return true;
    }

    private static void deleteOutOfDateOATFile(java.lang.String str) {
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(str + "/odex/");
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isAfterAndroidO()) {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(str + "/dex/oat/");
        }
    }

    private static java.lang.String getInfoMd5(com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
        return isVmArt ? shareDexDiffPatchInfo.destMd5InArt : shareDexDiffPatchInfo.destMd5InDvm;
    }

    private static boolean isJustArtSupportDex(com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
        return !isVmArt && shareDexDiffPatchInfo.destMd5InDvm.equals("0");
    }

    public static boolean loadTinkerJars(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, boolean z18) {
        java.io.File file;
        java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> arrayList = LOAD_DEX_LIST;
        int i17 = 0;
        if (arrayList.isEmpty() && classNDexInfo.isEmpty()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "there is no dex to load", new java.lang.Object[0]);
            return true;
        }
        java.lang.ClassLoader classLoader = com.tencent.tinker.loader.TinkerDexLoader.class.getClassLoader();
        if (classLoader == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "classloader is null", new java.lang.Object[0]);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -12);
            return false;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "classloader: " + classLoader.toString(), new java.lang.Object[0]);
        java.lang.String str3 = str + "/dex/";
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo next = it.next();
            if (!isJustArtSupportDex(next)) {
                java.io.File file2 = new java.io.File(str3 + next.realName);
                if (tinkerApplication.isTinkerLoadVerifyFlag()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(file2, getInfoMd5(next))) {
                        com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -13);
                        intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_MISMATCH_DEX_PATH, file2.getAbsolutePath());
                        return false;
                    }
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "verify dex file:" + file2.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
                }
                arrayList2.add(file2);
            }
        }
        if (isVmArt && !classNDexInfo.isEmpty()) {
            java.io.File file3 = new java.io.File(str3 + com.tencent.tinker.loader.shareutil.ShareConstants.CLASS_N_APK_NAME);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (tinkerApplication.isTinkerLoadVerifyFlag()) {
                java.util.Iterator<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> it6 = classNDexInfo.iterator();
                while (it6.hasNext()) {
                    com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo next2 = it6.next();
                    if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(file3, next2.rawName, next2.destMd5InArt)) {
                        com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -13);
                        intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_MISMATCH_DEX_PATH, file3.getAbsolutePath());
                        return false;
                    }
                    i17 = 0;
                }
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "verify dex file:" + file3.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis2), new java.lang.Object[i17]);
            }
            arrayList2.add(file3);
        }
        java.io.File file4 = new java.io.File(str + "/" + str2);
        if (z17) {
            final boolean[] zArr = {true};
            final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
            try {
                java.lang.String currentInstructionSet = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getCurrentInstructionSet();
                deleteOutOfDateOATFile(str);
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "systemOTA, try parallel oat dexes, targetISA:" + currentInstructionSet, new java.lang.Object[0]);
                java.io.File file5 = new java.io.File(str + "/interpet");
                com.tencent.tinker.loader.TinkerDexOptimizer.optimizeAll(tinkerApplication, arrayList2, file5, true, tinkerApplication.isUseDelegateLastClassLoader(), currentInstructionSet, false, new com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback() { // from class: com.tencent.tinker.loader.TinkerDexLoader.1
                    long start;

                    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
                    public void onFailed(java.io.File file6, java.io.File file7, java.lang.Throwable th6) {
                        zArr[0] = false;
                        thArr[0] = th6;
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(com.tencent.tinker.loader.TinkerDexLoader.TAG, "fail to optimize dex " + file6.getPath() + ", use time " + (java.lang.System.currentTimeMillis() - this.start), new java.lang.Object[0]);
                    }

                    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
                    public void onStart(java.io.File file6, java.io.File file7) {
                        this.start = java.lang.System.currentTimeMillis();
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(com.tencent.tinker.loader.TinkerDexLoader.TAG, "start to optimize dex:" + file6.getPath(), new java.lang.Object[0]);
                    }

                    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
                    public void onSuccess(java.io.File file6, java.io.File file7, java.io.File file8) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(com.tencent.tinker.loader.TinkerDexLoader.TAG, "success to optimize dex " + file6.getPath() + ", use time " + (java.lang.System.currentTimeMillis() - this.start), new java.lang.Object[0]);
                    }
                });
                if (!zArr[0]) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "parallel oat dexes failed", new java.lang.Object[0]);
                    intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_INTERPRET_EXCEPTION, thArr[0]);
                    com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -16);
                    return false;
                }
                file = file5;
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "getCurrentInstructionSet fail:" + th6, new java.lang.Object[0]);
                deleteOutOfDateOATFile(str);
                intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_INTERPRET_EXCEPTION, th6);
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -15);
                return false;
            }
        } else {
            file = file4;
        }
        try {
            com.tencent.tinker.loader.SystemClassLoaderAdder.installDexes(tinkerApplication, classLoader, file, arrayList2, z18, tinkerApplication.isUseDelegateLastClassLoader());
            return true;
        } catch (java.lang.Throwable th7) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "install dexes failed", new java.lang.Object[0]);
            intent.putExtra(com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_EXCEPTION, th7);
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -14);
            return false;
        }
    }
}

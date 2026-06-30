package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerLoader extends com.tencent.tinker.loader.AbstractTinkerLoader {
    private static final java.lang.String TAG = "Tinker.TinkerLoader";
    private static com.tencent.tinker.loader.shareutil.Guard sProcessGuardRef;

    private boolean checkSafeModeCount(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication) {
        int safeModeCount = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getSafeModeCount(tinkerApplication);
        if (safeModeCount >= 2) {
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setSafeModeCount(tinkerApplication, 0);
            return false;
        }
        tinkerApplication.setUseSafeMode(true);
        com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setSafeModeCount(tinkerApplication, safeModeCount + 1);
        return true;
    }

    private void tryCleanObsoletePatches(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "try clean obsolete patches", new java.lang.Object[0]);
        java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(tinkerApplication);
        if (patchDirectory == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "tryCleanObsoletePatches:getPatchDirectory == null", new java.lang.Object[0]);
        } else {
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.cleanPatchDirectoryWithGuard(patchDirectory, null);
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "tryCleanObsoletePatches: clean end, ok!", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x03c9, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void tryLoadPatchFilesInternal(com.tencent.tinker.loader.app.TinkerApplication r28, android.content.Intent r29, com.tencent.tinker.loader.shareutil.Guard[] r30) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.TinkerLoader.tryLoadPatchFilesInternal(com.tencent.tinker.loader.app.TinkerApplication, android.content.Intent, com.tencent.tinker.loader.shareutil.Guard[]):void");
    }

    @Override // com.tencent.tinker.loader.AbstractTinkerLoader
    public android.content.Intent tryLoad(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication) {
        com.tencent.tinker.loader.shareutil.Guard guard;
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "tryLoad test test", new java.lang.Object[0]);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.tinker.loader.shareutil.Guard[] guardArr = new com.tencent.tinker.loader.shareutil.Guard[1];
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        tryLoadPatchFilesInternal(tinkerApplication, intent, guardArr);
        com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentPatchCostTime(intent, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        if (com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentReturnCode(intent) != 0 && (guard = guardArr[0]) != null) {
            guard.close();
        }
        sProcessGuardRef = guardArr[0];
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isInMainProcess(tinkerApplication)) {
            tryCleanObsoletePatches(tinkerApplication);
        }
        return intent;
    }
}

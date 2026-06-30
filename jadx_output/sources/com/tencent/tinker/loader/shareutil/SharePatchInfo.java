package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class SharePatchInfo {
    public static final java.lang.String DEFAULT_DIR = "odex";
    public static final java.lang.String FINGER_PRINT = "print";
    public static final java.lang.String IS_PROTECTED_APP = "is_protected_app";
    public static final java.lang.String IS_REMOVE_INTERPRET_OAT_DIR = "is_remove_interpret_oat_dir";
    public static final int MAX_EXTRACT_ATTEMPTS = 2;
    public static final java.lang.String NEW_VERSION = "new";
    public static final java.lang.String OAT_DIR = "dir";
    public static final java.lang.String OLD_VERSION = "old";
    private static final java.lang.String TAG = "Tinker.PatchInfo";
    public static final java.lang.String USE_CUSTOM_FILE_PATCH = "use_custom_file_patch";
    public static final java.lang.String VERSION_TO_REMOVE = "version_to_remove";
    public java.lang.String fingerPrint;
    public boolean isProtectedApp;
    public boolean isRemoveInterpretOATDir;
    public java.lang.String newVersion;
    public java.lang.String oatDir;
    public java.lang.String oldVersion;
    public boolean useCustomPatch;

    @java.lang.Deprecated
    public java.lang.String versionToRemove;

    public SharePatchInfo(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z19) {
        this.oldVersion = str;
        this.newVersion = str2;
        this.isProtectedApp = z17;
        this.versionToRemove = str3;
        this.fingerPrint = str4;
        this.oatDir = str5;
        this.isRemoveInterpretOATDir = z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckProperty(java.io.File r17) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckProperty(java.io.File):com.tencent.tinker.loader.shareutil.SharePatchInfo");
    }

    public static com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckPropertyWithLock(java.io.File file, java.io.File file2) {
        com.tencent.tinker.loader.shareutil.ShareFileLockHelper shareFileLockHelper = null;
        if (file == null || file2 == null) {
            return null;
        }
        java.io.File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                shareFileLockHelper = com.tencent.tinker.loader.shareutil.ShareFileLockHelper.getFileLock(file2);
                return readAndCheckProperty(file);
            } catch (java.lang.Exception e17) {
                throw new com.tencent.tinker.loader.TinkerRuntimeException("readAndCheckPropertyWithLock fail", e17);
            }
        } finally {
            if (shareFileLockHelper != null) {
                try {
                    shareFileLockHelper.close();
                } catch (java.io.IOException e18) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "releaseInfoLock error", e18);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean rewritePatchInfoFile(java.io.File r8, com.tencent.tinker.loader.shareutil.SharePatchInfo r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.SharePatchInfo.rewritePatchInfoFile(java.io.File, com.tencent.tinker.loader.shareutil.SharePatchInfo):boolean");
    }

    public static boolean rewritePatchInfoFileWithLock(java.io.File file, com.tencent.tinker.loader.shareutil.SharePatchInfo sharePatchInfo, java.io.File file2) {
        if (file == null || sharePatchInfo == null || file2 == null) {
            return false;
        }
        java.io.File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        com.tencent.tinker.loader.shareutil.ShareFileLockHelper shareFileLockHelper = null;
        try {
            try {
                shareFileLockHelper = com.tencent.tinker.loader.shareutil.ShareFileLockHelper.getFileLock(file2);
                return rewritePatchInfoFile(file, sharePatchInfo);
            } finally {
                if (shareFileLockHelper != null) {
                    try {
                        shareFileLockHelper.close();
                    } catch (java.io.IOException e17) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "releaseInfoLock error", e17);
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("rewritePatchInfoFileWithLock fail", e18);
        }
    }
}

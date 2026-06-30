package com.tencent.shadow.dynamic.host;

/* loaded from: classes7.dex */
public class AppCacheFolderManager {
    public static java.io.File getAppDir(java.io.File file, java.lang.String str) {
        return new java.io.File(file, str);
    }

    public static java.io.File getLibCopiedFile(java.io.File file, java.lang.String str) {
        return new java.io.File(file, str + "_copied");
    }

    public static java.io.File getLibRootDir(java.io.File file) {
        return new java.io.File(file, com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH);
    }
}

package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareDexDiffPatchInfo {
    public final java.lang.String destMd5InArt;
    public final java.lang.String destMd5InDvm;
    public final java.lang.String dexDiffMd5;
    public final java.lang.String dexMode;
    public final boolean isJarMode;
    public final java.lang.String newOrPatchedDexCrC;
    public final java.lang.String oldDexCrC;
    public final java.lang.String path;
    public final java.lang.String rawName;
    public final java.lang.String realName;

    public ShareDexDiffPatchInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.rawName = str;
        this.path = str2;
        this.destMd5InDvm = str3;
        this.destMd5InArt = str4;
        this.dexDiffMd5 = str5;
        this.oldDexCrC = str6;
        this.newOrPatchedDexCrC = str7;
        this.dexMode = str8;
        if (!str8.equals(com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_JAR)) {
            if (!str8.equals(com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW)) {
                throw new com.tencent.tinker.loader.TinkerRuntimeException("can't recognize dex mode:".concat(str8));
            }
            this.isJarMode = false;
            this.realName = str;
            return;
        }
        this.isJarMode = true;
        if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isRawDexFile(str)) {
            this.realName = str;
            return;
        }
        this.realName = str + com.tencent.tinker.loader.shareutil.ShareConstants.JAR_SUFFIX;
    }

    public static boolean checkDexDiffPatchInfo(com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
        if (shareDexDiffPatchInfo == null) {
            return false;
        }
        java.lang.String str = shareDexDiffPatchInfo.rawName;
        java.lang.String str2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isVmArt() ? shareDexDiffPatchInfo.destMd5InArt : shareDexDiffPatchInfo.destMd5InDvm;
        return str != null && str.length() > 0 && str2 != null && str2.length() == 32;
    }

    public static void parseDexDiffPatchInfo(java.lang.String str, java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> arrayList) {
        java.lang.String[] split;
        if (str == null || str.length() == 0) {
            return;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.split(",", 8)) != null && split.length >= 8) {
                arrayList.add(new com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo(split[0].trim(), split[1].trim(), split[2].trim(), split[3].trim(), split[4].trim(), split[5].trim(), split[6].trim(), split[7].trim()));
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.rawName);
        stringBuffer.append(",");
        stringBuffer.append(this.path);
        stringBuffer.append(",");
        stringBuffer.append(this.destMd5InDvm);
        stringBuffer.append(",");
        stringBuffer.append(this.destMd5InArt);
        stringBuffer.append(",");
        stringBuffer.append(this.oldDexCrC);
        stringBuffer.append(",");
        stringBuffer.append(this.newOrPatchedDexCrC);
        stringBuffer.append(",");
        stringBuffer.append(this.dexDiffMd5);
        stringBuffer.append(",");
        stringBuffer.append(this.dexMode);
        return stringBuffer.toString();
    }
}

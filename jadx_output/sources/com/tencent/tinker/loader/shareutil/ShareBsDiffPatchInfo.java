package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareBsDiffPatchInfo {

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f215549md5;
    public java.lang.String name;
    public java.lang.String patchMd5;
    public java.lang.String path;
    public java.lang.String rawCrc;

    public ShareBsDiffPatchInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.name = str;
        this.f215549md5 = str2;
        this.rawCrc = str4;
        this.patchMd5 = str5;
        this.path = str3;
    }

    public static boolean checkDiffPatchInfo(com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo shareBsDiffPatchInfo) {
        if (shareBsDiffPatchInfo == null) {
            return false;
        }
        java.lang.String str = shareBsDiffPatchInfo.name;
        java.lang.String str2 = shareBsDiffPatchInfo.f215549md5;
        return str != null && str.length() > 0 && str2 != null && str2.length() == 32;
    }

    public static void parseDiffPatchInfo(java.lang.String str, java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo> arrayList) {
        java.lang.String[] split;
        if (str == null || str.length() == 0) {
            return;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.split(",", 5)) != null && split.length >= 5) {
                arrayList.add(new com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo(split[0].trim(), split[2].trim(), split[1].trim(), split[3].trim(), split[4].trim()));
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.name);
        stringBuffer.append(",");
        stringBuffer.append(this.path);
        stringBuffer.append(",");
        stringBuffer.append(this.f215549md5);
        stringBuffer.append(",");
        stringBuffer.append(this.rawCrc);
        stringBuffer.append(",");
        stringBuffer.append(this.patchMd5);
        return stringBuffer.toString();
    }
}

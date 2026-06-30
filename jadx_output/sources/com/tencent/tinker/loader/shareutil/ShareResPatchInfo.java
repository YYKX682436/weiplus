package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareResPatchInfo {
    public java.lang.String arscBaseCrc = null;
    public java.lang.String resArscMd5 = null;
    public java.util.ArrayList<java.lang.String> addRes = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> deleteRes = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> modRes = new java.util.ArrayList<>();
    public java.util.HashMap<java.lang.String, java.io.File> storeRes = new java.util.HashMap<>();
    public java.util.ArrayList<java.lang.String> largeModRes = new java.util.ArrayList<>();
    public java.util.HashMap<java.lang.String, com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo> largeModMap = new java.util.HashMap<>();
    public java.util.HashSet<java.util.regex.Pattern> patterns = new java.util.HashSet<>();

    /* loaded from: classes13.dex */
    public static class LargeModeInfo {
        public long crc;

        /* renamed from: md5, reason: collision with root package name */
        public java.lang.String f215550md5 = null;
        public java.io.File file = null;
    }

    public static boolean checkFileInPattern(java.util.HashSet<java.util.regex.Pattern> hashSet, java.lang.String str) {
        if (hashSet.isEmpty()) {
            return false;
        }
        java.util.Iterator<java.util.regex.Pattern> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkResPatchInfo(com.tencent.tinker.loader.shareutil.ShareResPatchInfo shareResPatchInfo) {
        java.lang.String str;
        return (shareResPatchInfo == null || (str = shareResPatchInfo.resArscMd5) == null || str.length() != 32) ? false : true;
    }

    private static java.util.regex.Pattern convertToPatternString(java.lang.String str) {
        if (str.contains(".")) {
            str = str.replaceAll("\\.", "\\\\.");
        }
        if (str.contains("?")) {
            str = str.replaceAll("\\?", "\\.");
        }
        if (str.contains("*")) {
            str = str.replace("*", ".*");
        }
        return java.util.regex.Pattern.compile(str);
    }

    public static void parseAllResPatchInfo(java.lang.String str, com.tencent.tinker.loader.shareutil.ShareResPatchInfo shareResPatchInfo) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String[] split = str.split("\n");
        int i17 = 0;
        while (i17 < split.length) {
            java.lang.String str2 = split[i17];
            if (str2 != null && str2.length() > 0) {
                if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_TITLE)) {
                    java.lang.String[] split2 = str2.split(",", 3);
                    shareResPatchInfo.arscBaseCrc = split2[1];
                    shareResPatchInfo.resArscMd5 = split2[2];
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATTERN_TITLE)) {
                    for (int parseInt = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt > 0; parseInt--) {
                        i17++;
                        shareResPatchInfo.patterns.add(convertToPatternString(split[i17]));
                    }
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_ADD_TITLE)) {
                    for (int parseInt2 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt2 > 0; parseInt2--) {
                        i17++;
                        shareResPatchInfo.addRes.add(split[i17]);
                    }
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_MOD_TITLE)) {
                    for (int parseInt3 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt3 > 0; parseInt3--) {
                        i17++;
                        shareResPatchInfo.modRes.add(split[i17]);
                    }
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_LARGE_MOD_TITLE)) {
                    for (int parseInt4 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt4 > 0; parseInt4--) {
                        i17++;
                        java.lang.String[] split3 = split[i17].split(",", 3);
                        java.lang.String str3 = split3[0];
                        com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo largeModeInfo = new com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo();
                        largeModeInfo.f215550md5 = split3[1];
                        largeModeInfo.crc = java.lang.Long.parseLong(split3[2]);
                        shareResPatchInfo.largeModRes.add(str3);
                        shareResPatchInfo.largeModMap.put(str3, largeModeInfo);
                    }
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_DEL_TITLE)) {
                    for (int parseInt5 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt5 > 0; parseInt5--) {
                        i17++;
                        shareResPatchInfo.deleteRes.add(split[i17]);
                    }
                } else if (str2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.RES_STORE_TITLE)) {
                    for (int parseInt6 = java.lang.Integer.parseInt(str2.split(":", 2)[1]); parseInt6 > 0; parseInt6--) {
                        i17++;
                        shareResPatchInfo.storeRes.put(split[i17], null);
                    }
                }
            }
            i17++;
        }
    }

    public static void parseResPatchInfoFirstLine(java.lang.String str, com.tencent.tinker.loader.shareutil.ShareResPatchInfo shareResPatchInfo) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.String str2 = str.split("\n")[0];
        if (str2 == null || str2.length() <= 0) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("res meta Corrupted:".concat(str));
        }
        java.lang.String[] split = str2.split(",", 3);
        shareResPatchInfo.arscBaseCrc = split[1];
        shareResPatchInfo.resArscMd5 = split[2];
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("resArscMd5:" + this.resArscMd5 + "\n");
        stringBuffer.append("arscBaseCrc:" + this.arscBaseCrc + "\n");
        java.util.Iterator<java.util.regex.Pattern> it = this.patterns.iterator();
        while (it.hasNext()) {
            stringBuffer.append(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATTERN_TITLE + it.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it6 = this.addRes.iterator();
        while (it6.hasNext()) {
            stringBuffer.append("addedSet:" + it6.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it7 = this.modRes.iterator();
        while (it7.hasNext()) {
            stringBuffer.append("modifiedSet:" + it7.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it8 = this.largeModRes.iterator();
        while (it8.hasNext()) {
            stringBuffer.append("largeModifiedSet:" + it8.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it9 = this.deleteRes.iterator();
        while (it9.hasNext()) {
            stringBuffer.append("deletedSet:" + it9.next() + "\n");
        }
        java.util.Iterator<java.lang.String> it10 = this.storeRes.keySet().iterator();
        while (it10.hasNext()) {
            stringBuffer.append("storeSet:" + it10.next() + "\n");
        }
        return stringBuffer.toString();
    }
}

package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class b2 {
    public static java.util.Map a(java.lang.String str) {
        java.lang.String[] split;
        if (str == null || str.length() <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && (split = str2.trim().split("=", 2)) != null && split.length >= 2) {
                java.lang.String str3 = split[0];
                java.lang.String str4 = split[1];
                if (str3 != null && str3.length() > 0 && str3.matches("^[a-zA-Z0-9_.]*")) {
                    hashMap.put(str3, str4);
                }
            }
        }
        return hashMap;
    }
}

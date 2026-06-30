package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public abstract class p7 {
    public static java.util.Map a(java.lang.String str) {
        if (str == null || !str.startsWith("~SEMI_XML~")) {
            return null;
        }
        java.lang.String substring = str.substring(10);
        java.util.HashMap hashMap = new java.util.HashMap();
        int length = substring.length() - 4;
        int i17 = 0;
        while (i17 < length) {
            int i18 = i17 + 1;
            try {
                int i19 = i18 + 1;
                int charAt = (substring.charAt(i17) << 16) + substring.charAt(i18) + i19;
                java.lang.String substring2 = substring.substring(i19, charAt);
                int i27 = charAt + 1;
                int i28 = i27 + 1;
                i17 = (substring.charAt(charAt) << 16) + substring.charAt(i27) + i28;
                hashMap.put(substring2, substring.substring(i28, i17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SemiXml", e17, "", new java.lang.Object[0]);
            }
        }
        return hashMap;
    }

    public static java.lang.String b(java.util.Map map) {
        if (map == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("~SEMI_XML~");
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            if (str2 != null) {
                int length = str.length();
                int length2 = str2.length();
                sb6.append((char) (length >> 16));
                sb6.append((char) length);
                sb6.append(str);
                sb6.append((char) (length2 >> 16));
                sb6.append((char) length2);
                sb6.append(str2);
            }
        }
        return sb6.toString();
    }
}

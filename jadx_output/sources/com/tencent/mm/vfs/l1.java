package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public abstract class l1 {
    public static java.util.Map a(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null || (value instanceof java.lang.String)) {
                hashMap.put(str, value);
            } else if (value instanceof java.lang.String[]) {
                java.lang.String[] strArr = (java.lang.String[]) value;
                int length = strArr.length;
                if (length == 0) {
                    hashMap.put(str, null);
                } else if (length != 1) {
                    hashMap.put(str, value);
                } else {
                    hashMap.put(str, strArr[0]);
                }
            }
        }
        return hashMap;
    }
}

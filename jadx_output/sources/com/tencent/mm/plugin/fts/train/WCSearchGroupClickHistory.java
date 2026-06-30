package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public final class WCSearchGroupClickHistory {
    static final int MAX_RETAIN_DAYS = 30;
    static final int MAX_TIMESTAMPS_PER_KEY = 64;
    static final java.lang.String MMKV_NAME = "group_search_click";
    private static final long ONE_DAY_SECONDS = 86400;
    private static final java.lang.String TAG = "MicroMsg.FTS.GroupClickHistory";

    private WCSearchGroupClickHistory() {
    }

    public static void clearAllForTest() {
        mmkv().clear();
    }

    public static com.tencent.mm.plugin.fts.train.a computeStats(java.util.List<java.lang.Long> list, long j17) {
        long j18 = j17 - 604800;
        long j19 = j17 - 1209600;
        long j27 = j17 - 2592000;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        int i17 = 0;
        long j28 = 0;
        int i18 = 0;
        int i19 = 0;
        long j29 = 0;
        for (java.lang.Long l17 : list) {
            if (l17 != null && l17.longValue() > j28) {
                if (l17.longValue() > j29) {
                    j29 = l17.longValue();
                }
                if (l17.longValue() >= j27) {
                    i19++;
                    hashMap3.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
                if (l17.longValue() >= j19) {
                    i18++;
                    hashMap2.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
                if (l17.longValue() >= j18) {
                    i17++;
                    hashMap.put(java.lang.Long.valueOf(l17.longValue() / 86400), java.lang.Boolean.TRUE);
                }
            }
            j28 = 0;
        }
        com.tencent.mm.plugin.fts.train.a aVar = new com.tencent.mm.plugin.fts.train.a();
        aVar.f137787a = i17;
        aVar.f137788b = i18;
        aVar.f137789c = i19;
        aVar.f137790d = hashMap.size();
        aVar.f137791e = hashMap2.size();
        aVar.f137792f = hashMap3.size();
        aVar.f137793g = (int) (io.flutter.embedding.android.KeyboardMap.kValueMask & j29);
        return aVar;
    }

    public static java.lang.String encodeTimestamps(java.util.List<java.lang.Long> list) {
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(list.size() * 11);
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 > 0) {
                sb6.append(',');
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    public static com.tencent.mm.plugin.fts.train.a getStats(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.fts.train.a aVar = com.tencent.mm.plugin.fts.train.a.f137786h;
        if (K0) {
            return aVar;
        }
        try {
            java.lang.String u17 = mmkv().u(str, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                return aVar;
            }
            java.util.List<java.lang.Long> parseTimestamps = parseTimestamps(u17);
            return parseTimestamps.isEmpty() ? aVar : computeStats(parseTimestamps, java.lang.System.currentTimeMillis() / 1000);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(TAG, "getStats failed for %s: %s", str, th6.getMessage());
            return aVar;
        }
    }

    private static com.tencent.mm.sdk.platformtools.o4 mmkv() {
        return com.tencent.mm.sdk.platformtools.o4.N(MMKV_NAME, 1, null);
    }

    public static java.util.List<java.lang.Long> parseTimestamps(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return arrayList;
        }
        for (java.lang.String str2 : str.split(",")) {
            if (str2 != null && !str2.isEmpty()) {
                try {
                    long parseLong = java.lang.Long.parseLong(str2.trim());
                    if (parseLong > 0) {
                        arrayList.add(java.lang.Long.valueOf(parseLong));
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    public static void recordClick(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            java.util.List<java.lang.Long> parseTimestamps = parseTimestamps(mmkv().u(str, ""));
            parseTimestamps.add(java.lang.Long.valueOf(currentTimeMillis));
            mmkv().D(str, encodeTimestamps(trimAndExpire(parseTimestamps, currentTimeMillis)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(TAG, "recordClick failed for %s: %s", str, th6.getMessage());
        }
    }

    public static java.util.List<java.lang.Long> trimAndExpire(java.util.List<java.lang.Long> list, long j17) {
        long j18 = j17 - 2592000;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.Long l17 : list) {
            if (l17 != null && l17.longValue() >= j18) {
                arrayList.add(l17);
            }
        }
        return arrayList.size() > 64 ? new java.util.ArrayList(arrayList.subList(arrayList.size() - 64, arrayList.size())) : arrayList;
    }
}

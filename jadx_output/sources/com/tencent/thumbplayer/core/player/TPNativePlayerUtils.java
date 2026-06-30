package com.tencent.thumbplayer.core.player;

/* loaded from: classes13.dex */
public class TPNativePlayerUtils {
    public static boolean isTPNativePlayerSurface(android.view.Surface surface) {
        return surface instanceof com.tencent.thumbplayer.core.player.TPNativePlayerSurface;
    }

    public static java.lang.String[] tpMapStringToStringArray(java.util.Map<java.lang.String, java.lang.String> map) {
        int i17 = 0;
        if (map == null || map.isEmpty()) {
            return new java.lang.String[0];
        }
        java.lang.String[] strArr = new java.lang.String[map.size() * 2];
        for (java.lang.String str : map.keySet()) {
            int i18 = i17 * 2;
            strArr[i18] = str;
            strArr[i18 + 1] = map.get(str);
            i17++;
        }
        return strArr;
    }
}

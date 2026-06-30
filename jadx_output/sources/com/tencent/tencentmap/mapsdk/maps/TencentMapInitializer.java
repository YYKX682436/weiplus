package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public final class TencentMapInitializer {
    private static final java.util.Map<java.lang.String, java.lang.String> EXTRA_MAP = new java.util.concurrent.ConcurrentHashMap();
    public static final java.lang.String KEY_AGREE_PRIVACY = "privacy";

    /* loaded from: classes6.dex */
    public enum LibraryName {
        TENCENT_MAP_ENGINE(com.tencent.mapsdk.internal.hm.b.MAP_ENGINE),
        TENCENT_MAP_VISUALIZATION(com.tencent.mapsdk.internal.hm.b.MAP_VIS);

        final com.tencent.mapsdk.internal.hm.b lib;

        LibraryName(com.tencent.mapsdk.internal.hm.b bVar) {
            this.lib = bVar;
        }
    }

    public static synchronized void addExtra(java.lang.String str, java.lang.String str2) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            if (KEY_AGREE_PRIVACY.equals(str) && !android.text.TextUtils.isEmpty(str2)) {
                EXTRA_MAP.put(KEY_AGREE_PRIVACY, str2);
            } else if (isAgreePrivacy()) {
                if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                    EXTRA_MAP.put(str, str2);
                    com.tencent.mapsdk.internal.hs.a(str, str2);
                }
            }
        }
    }

    public static synchronized boolean getAgreePrivacy() {
        boolean isAgreePrivacy;
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            isAgreePrivacy = isAgreePrivacy();
            if (!isAgreePrivacy) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d("请设置同意隐私协议, 需要在初始化地图之前完成");
            }
        }
        return isAgreePrivacy;
    }

    public static synchronized java.lang.String getDuid(android.content.Context context) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            if (!isAgreePrivacy()) {
                return "undefined";
            }
            return com.tencent.mapsdk.internal.hs.g(context);
        }
    }

    public static synchronized java.lang.String getExtra(java.lang.String str) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            if (isAgreePrivacy() && !android.text.TextUtils.isEmpty(str)) {
                return EXTRA_MAP.get(str);
            }
            return null;
        }
    }

    public static synchronized java.lang.String getSuid(android.content.Context context) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            if (!isAgreePrivacy()) {
                return "undefined";
            }
            return com.tencent.mapsdk.internal.hs.f(context);
        }
    }

    private static boolean isAgreePrivacy() {
        return java.lang.Boolean.parseBoolean(EXTRA_MAP.get(KEY_AGREE_PRIVACY));
    }

    public static boolean isPreLoadLibrarySuccess(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName libraryName) {
        com.tencent.mapsdk.internal.hm.a aVar = com.tencent.mapsdk.internal.hm.a().f49780a.get(libraryName.lib);
        return aVar != null && aVar.f49786f == com.tencent.mapsdk.internal.hm.c.SUCCESS;
    }

    public static void preLoadLibrary(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName libraryName, java.lang.String str) {
        com.tencent.mapsdk.internal.hm.a().a(libraryName.lib, str, "", "");
    }

    public static synchronized void setAgreePrivacy(boolean z17) {
        synchronized (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.class) {
            EXTRA_MAP.put(KEY_AGREE_PRIVACY, java.lang.String.valueOf(z17));
        }
    }

    public static void preLoadLibrary(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName libraryName, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mapsdk.internal.hm.a().a(libraryName.lib, str, str2, str3);
    }

    public static void preLoadLibrary(java.util.Map<com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName, java.lang.String> map) {
        for (com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.LibraryName libraryName : map.keySet()) {
            preLoadLibrary(libraryName, map.get(libraryName));
        }
    }
}

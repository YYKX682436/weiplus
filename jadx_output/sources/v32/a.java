package v32;

/* loaded from: classes13.dex */
public abstract class a {
    public static boolean a(java.lang.String str, long j17) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addToSharedPreferences, key = %s, deviceId = %d", str, java.lang.Long.valueOf(j17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        e(sharedPreferences);
        java.lang.String str3 = j17 + "";
        java.lang.String string = sharedPreferences.getString(str, new java.lang.String());
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "addDeviceToDeviceList, device = %s, device list = %s", str3, string);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || string == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "Error parameters!!!");
            str2 = null;
        } else {
            str2 = (new java.lang.String().concat(string) + str3) + "|";
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", str2);
        }
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addDeviceToDeviceList failed!!!");
            return false;
        }
        if (sharedPreferences.edit().putString(str, str2).commit()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "add to sharepreference successful, new device list is %s", str2);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit() Failed!!!");
        return false;
    }

    public static long[] b(java.lang.String str) {
        int i17;
        java.lang.Exception e17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "getListFromSharedPreferences, key = %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return null;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return null;
        }
        e(sharedPreferences);
        try {
            java.lang.String[] split = sharedPreferences.getString(str, new java.lang.String()).split("\\|");
            if (split == null || split.length == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == strDeviceList || 0 == strDeviceList.length");
                return null;
            }
            long[] jArr = new long[split.length];
            int i18 = 0;
            for (java.lang.String str2 : split) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "parse %s to long", str2);
                } catch (java.lang.Exception e18) {
                    i17 = i18;
                    e17 = e18;
                }
                if (str2.length() != 0) {
                    i17 = i18 + 1;
                    try {
                        jArr[i18] = com.tencent.mm.sdk.platformtools.t8.V(str2, 0L);
                    } catch (java.lang.Exception e19) {
                        e17 = e19;
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "try pase string device id to long failed : " + e17.getMessage());
                        i18 = i17;
                    }
                    i18 = i17;
                }
            }
            if (i18 == 0) {
                return null;
            }
            return jArr;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "split failed!!!, %s", e27.getMessage());
            return null;
        }
    }

    public static boolean c(java.lang.String str, long j17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "isItemInSharedPreferences, key = %s, device id = %d", str, java.lang.Long.valueOf(j17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        e(sharedPreferences);
        java.lang.String str2 = j17 + "";
        java.lang.String string = sharedPreferences.getString(str, new java.lang.String());
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "isDeviceInDeviceList, device = %s, device list = %s", str2, string);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            try {
                java.lang.String[] split = string.split("\\|");
                if (split == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "null == deviceArray");
                } else {
                    for (java.lang.String str3 : split) {
                        if (str3.equalsIgnoreCase(str2)) {
                            z17 = true;
                            break;
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "aDeviceList.split failed, %s", e17.getMessage());
            }
        }
        z17 = false;
        return z17;
    }

    public static boolean d(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "removeFromSharedPreferences, key = %s, deviceId = %d", str, java.lang.Long.valueOf(j17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
            return false;
        }
        e(sharedPreferences);
        java.lang.String str2 = j17 + "";
        java.lang.String string = sharedPreferences.getString(str, new java.lang.String());
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "moveDevicefromDeviceList, device = %s, device list = %s", str2, string);
        java.lang.String str3 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.Util", "parameters is null or nil");
        } else {
            try {
                java.lang.String[] split = string.split("\\|");
                if (split == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "null == strArray");
                } else {
                    java.lang.String str4 = new java.lang.String();
                    boolean z17 = false;
                    for (java.lang.String str5 : split) {
                        if (str5.equalsIgnoreCase(str2)) {
                            z17 = true;
                        } else {
                            str4 = (str4 + str5) + "|";
                        }
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", string);
                        str3 = str4;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "remove failed!!!, this device is not in the list");
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "aDeviceList.split failed!!!, %s", e17.getMessage());
            }
        }
        if (str3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove device from device list failed!!!");
            return false;
        }
        if (str3.length() == 0 ? sharedPreferences.edit().remove(str).commit() : sharedPreferences.edit().putString(str, str3).commit()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove from sharepreference successful, new device list is %s", str3);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit()");
        return false;
    }

    public static void e(android.content.SharedPreferences sharedPreferences) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "tryToClearDirtyData");
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == aSP");
            return;
        }
        java.lang.String[] strArr = {"conneted_device", "shut_down_device"};
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str = strArr[i17];
            try {
                if (sharedPreferences.getStringSet(str, null) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "find dirty data, remove it, key = %s", str);
                    if (!sharedPreferences.edit().remove(str).commit()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove dirty data failed!!!");
                    }
                }
            } catch (java.lang.ClassCastException | java.lang.Exception unused) {
            }
        }
    }
}

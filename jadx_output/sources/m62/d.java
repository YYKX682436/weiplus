package m62;

/* loaded from: classes5.dex */
public class d implements m62.c {
    @Override // m62.c
    public void a() {
        java.util.Map d17;
        android.content.SharedPreferences v17 = gm0.m.v();
        v17.edit().putBoolean("keepaliveserviceswitch", false).commit();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_specialscenesetingsswitch, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSpecialSingleton", "iniNotificationSpecialSceneSwitchEnable() enable:%s", java.lang.Integer.valueOf(Ni));
        if (!(Ni == 1)) {
            if (Ni == 0) {
                b(v17, false);
                return;
            }
            if (Ni == 2) {
                b(v17, true);
                return;
            }
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_specialscenesetingsswitchdetail, "", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSpecialSingleton", "specialSceneDetail %s", Zi);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(Zi, "manufacturerlist", null)) != null) {
            int P = d17.containsKey(".manufacturerlist.size") ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".manufacturerlist.size"), 0) : 0;
            int i17 = android.os.Build.VERSION.SDK_INT;
            int i18 = 0;
            while (true) {
                if (i18 >= P) {
                    break;
                }
                if (i18 == 0) {
                    java.lang.String str = (java.lang.String) d17.get(".manufacturerlist.manufacturer.name");
                    if (str == null) {
                        str = "";
                    }
                    if (str.equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                        java.lang.String str2 = (java.lang.String) d17.get(".manufacturerlist.manufacturer.sdkversionmin");
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.String str3 = (java.lang.String) d17.get(".manufacturerlist.manufacturer.sdkversionmax");
                        if (str3 == null) {
                            str3 = "";
                        }
                        java.lang.String str4 = (java.lang.String) d17.get(".manufacturerlist.manufacturer.versintime");
                        r3 = u75.d.b(i17, str2, str3, str4 != null ? str4 : "");
                    } else {
                        i18++;
                    }
                } else {
                    java.lang.String str5 = (java.lang.String) d17.get(".manufacturerlist.manufacturer" + i18 + ".name");
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (str5.equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                        java.lang.String str6 = (java.lang.String) d17.get(".manufacturerlist.manufacturer" + i18 + ".sdkversionmin");
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = (java.lang.String) d17.get(".manufacturerlist.manufacturer" + i18 + ".sdkversionmax");
                        if (str7 == null) {
                            str7 = "";
                        }
                        java.lang.String str8 = (java.lang.String) d17.get(".manufacturerlist.manufacturer" + i18 + ".versintime");
                        r3 = u75.d.b(i17, str6, str7, str8 != null ? str8 : "");
                    } else {
                        i18++;
                    }
                }
            }
        }
        b(v17, r3);
    }

    public final void b(android.content.SharedPreferences sharedPreferences, boolean z17) {
        sharedPreferences.edit().putInt("special_scene_enable", z17 ? 1 : 0).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSpecialSingleton", "setSpecialSceneEnable() enable: %s", java.lang.Boolean.valueOf(z17));
    }
}

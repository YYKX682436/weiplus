package re4;

/* loaded from: classes9.dex */
public abstract class u {
    public static re4.v a() {
        c();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
        if (M == null) {
            return new re4.v();
        }
        java.lang.String string = M.getString("cpu_id", "");
        java.lang.String string2 = M.getString("uid", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && !com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterDeviceInfoManager", "hy:device info exists in preference. directly return");
            return new re4.v(string, string2);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SoterDeviceInfoManager", "hy: no cpu id and uid retrieved. load again");
        zt5.r c17 = wt5.a.c();
        if (c17 != null) {
            java.lang.String str = c17.f475615c;
            java.lang.String valueOf = java.lang.String.valueOf(c17.f475614b);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
                b(str, valueOf);
                return new re4.v(str, valueOf);
            }
        }
        return new re4.v();
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
        if (M == null) {
            return;
        }
        M.putString("cpu_id", str);
        M.putString("uid", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterDeviceInfoManager", "hy: save device info");
    }

    public static void c() {
        android.content.SharedPreferences d17;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
        java.lang.String string = M.getString("cpu_id", null);
        java.lang.String string2 = M.getString("uid", null);
        if ((com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(string2)) && (d17 = com.tencent.mm.sdk.platformtools.x2.d()) != null) {
            java.lang.String string3 = d17.getString("cpu_id", null);
            java.lang.String string4 = d17.getString("uid", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterDeviceInfoManager", "transfer old cpuId: %s, old uid: %s", string, string2);
            M.putString("cpu_id", string3);
            M.putString("uid", string4);
        }
    }
}

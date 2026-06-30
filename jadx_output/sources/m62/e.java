package m62;

/* loaded from: classes5.dex */
public class e implements m62.c {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m62.c
    public void a() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_target26_start_service_switch, -1);
        boolean z17 = true;
        boolean z18 = false;
        if ((Ni == 0) == true) {
            com.tencent.mm.booter.o.h(false);
        } else {
            if ((Ni == 2) == true) {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_target26_start_service_manu_exclusive, "", true);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = Zi != null ? Zi : "null";
                com.tencent.mars.xlog.Log.i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", objArr);
                if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                    com.tencent.mm.booter.o.h(true);
                } else {
                    java.lang.String[] split = Zi.split(",");
                    int i17 = 0;
                    while (true) {
                        if (i17 >= split.length) {
                            break;
                        }
                        if (("" + split[i17]).equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                            com.tencent.mm.booter.o.h(false);
                            z18 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z18) {
                        com.tencent.mm.booter.o.h(true);
                    }
                }
            } else {
                if ((Ni == 1) != false) {
                    java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_target26_start_service_manufacturer, "", true);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = Zi2 != null ? Zi2 : "null";
                    com.tencent.mars.xlog.Log.i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", objArr2);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(Zi2)) {
                        com.tencent.mm.booter.o.h(false);
                    } else {
                        java.lang.String[] split2 = Zi2.split(",");
                        int i18 = 0;
                        while (true) {
                            if (i18 >= split2.length) {
                                z17 = false;
                                break;
                            }
                            if (("" + split2[i18]).equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                                com.tencent.mm.booter.o.h(true);
                                break;
                            }
                            i18++;
                        }
                        if (!z17) {
                            com.tencent.mm.booter.o.h(false);
                        }
                    }
                }
            }
        }
        boolean c17 = com.tencent.mm.booter.o.c();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("service_launch_way", 4).edit().putInt("huawei_switch", c17 ? 1 : 0).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "setTarget26StartServiceHuawei() enable: %s", java.lang.Integer.valueOf(c17 ? 1 : 0));
    }
}

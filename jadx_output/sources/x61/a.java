package x61;

/* loaded from: classes.dex */
public class a implements vg3.r4 {
    public static void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChangeLaunchImageNewXmlListener", "filePath: %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        java.lang.String str2 = lp0.b.e() + "splashWelcomeImg";
        if (com.tencent.mm.vfs.w6.h(str2)) {
            com.tencent.mm.vfs.w6.c(str, str2);
        }
    }

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("ChangeLaunchImage") || map == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.BeginTime");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.EndTime");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.ChangeLaunchImage.ResId.SubType");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChangeLaunchImageNewXmlListener", "beginTime:%s,endTime:%s,subtype:%s", str2, str3, str4);
        if (com.tencent.mm.sdk.platformtools.t8.N0(str2, str3, str4)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(723L, 5L, 1L, false);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str4, 0);
        if (D1 > 0) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0);
            sharedPreferences.edit().putLong("new_launch_image_begin_time", com.tencent.mm.sdk.platformtools.t8.E1(str2)).apply();
            sharedPreferences.edit().putInt("new_launch_image_sub_type", D1).apply();
            sharedPreferences.edit().putLong("new_launch_image_end_time", com.tencent.mm.sdk.platformtools.t8.E1(str3)).commit();
            b(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(43, D1));
        }
    }
}

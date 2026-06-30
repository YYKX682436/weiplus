package iq3;

/* loaded from: classes12.dex */
public abstract class a {
    public static final boolean a() {
        return (d11.b.c() ^ true) && b();
    }

    public static final boolean b() {
        boolean isWifi;
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownload"), 1);
        if (P == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "settings is not auto download C2C image. ChatImgAutoDownload : " + P);
            return false;
        }
        if ((P == 2 && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) || P != 1) {
            return false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi) {
            return true;
        }
        long P2 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownloadMax"), 0);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
        long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c17.m(u3Var, null), 0L);
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) android.text.format.DateFormat.format("M", java.lang.System.currentTimeMillis()));
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG;
        if (E1 != com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c18.m(u3Var2, null), 0L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "update month %d ", java.lang.Long.valueOf(E1));
            gm0.j1.u().c().x(u3Var, 0L);
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(E1));
            k17 = 0;
        }
        if (k17 <= P2 || P2 <= 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "this month had auto download " + k17 + " C2C image, can not auto download.");
        return false;
    }

    public static final boolean c(java.lang.String str) {
        return (c01.e2.J(str) && c01.e2.Q(str)) || (com.tencent.mm.storage.z3.R4(str) && !c01.e2.I(str));
    }
}

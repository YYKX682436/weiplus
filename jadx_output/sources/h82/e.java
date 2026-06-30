package h82;

/* loaded from: classes8.dex */
public abstract class e {
    public static void a(long j17, long j18) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, java.lang.Long.valueOf(f() + (j18 - j17)));
    }

    public static void b() {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((e82.e) i95.n0.c(e82.e.class)).Ai().y0();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((e82.e) i95.n0.c(e82.e.class)).Ai().delete(((i82.a) it.next()).systemRowid)) {
                i17++;
            }
        }
        com.tencent.mm.vfs.w6.f("wcf://favoffline");
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "cleanAllCache maxSize:%s allSize:%s allNum:%s deleteResult:%s", java.lang.Long.valueOf(d()), java.lang.Long.valueOf(f()), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, 0L);
    }

    public static boolean c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean z17;
        int i17;
        long e17 = e(str2);
        boolean h17 = com.tencent.mm.vfs.w6.h(str2);
        if (h17) {
            a(e17, 0L);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            z17 = true;
        } else {
            long e18 = e(str3);
            z17 = com.tencent.mm.vfs.w6.g(str3, true);
            if (z17) {
                a(e18, 0L);
            }
        }
        if (!h17 || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline deleteHtml:%s deleteImg:%s", java.lang.Boolean.valueOf(h17), java.lang.Boolean.valueOf(z17));
            return false;
        }
        i82.b Ai = ((e82.e) i95.n0.c(e82.e.class)).Ai();
        Ai.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineStorage", "url is null!");
            return true;
        }
        try {
            i17 = Ai.f289632d.delete("FavOffline", "url=?", new java.lang.String[]{str});
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.offline.FavOfflineStorage", "deleteByUrl url:%s Exception:%s %s", str, e19.getClass().getSimpleName(), e19.getMessage());
            i17 = 0;
        }
        return i17 > 0;
    }

    public static long d() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_fav_web_cache_max_total_size, 1073741824);
    }

    public static long e(java.lang.String str) {
        long j17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0L;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.A()) {
            return r6Var.C();
        }
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(str, true);
        if (s17 == null) {
            return 0L;
        }
        for (com.tencent.mm.vfs.x1 x1Var : s17) {
            if (x1Var != null) {
                j17 += x1Var.f213233c;
            }
        }
        return j17;
    }

    public static long f() {
        return gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, 0L);
    }

    public static boolean g(i82.a aVar, int i17, int i18) {
        com.tencent.mm.vfs.x1 m17;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "report: favOffline is null!");
            return false;
        }
        if (aVar.field_isReport == 1) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.FavCacheStruct favCacheStruct = new com.tencent.mm.autogen.mmdata.rpt.FavCacheStruct();
        favCacheStruct.f56239d = aVar.systemRowid;
        if (i17 == 0) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(aVar.field_path);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213233c;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_imgDirPath)) {
                j17 += e(aVar.field_imgDirPath);
            }
            favCacheStruct.f56240e = j17;
        } else {
            favCacheStruct.f56240e = i17;
        }
        favCacheStruct.f56241f = ((java.util.ArrayList) ((e82.e) i95.n0.c(e82.e.class)).Ai().y0()).size();
        favCacheStruct.f56242g = f();
        favCacheStruct.f56243h = i18;
        favCacheStruct.k();
        return true;
    }

    public static boolean h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        boolean z17;
        long j17;
        com.tencent.mm.vfs.x1 m17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "updateFavOffline: url is null!");
            return false;
        }
        i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "updateFavOffline: favOffline(%s) is null!", str);
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        long j18 = (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            j18 += e(str3);
        }
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_fav_web_cache_max_size;
        if (j18 > ((h62.d) e0Var).Ui(d0Var, 20971520L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "url(%s) bytelength(%s) exceed %s", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(d0Var, 20971520L)));
            if (i17 == 0) {
                g(z07, (int) j18, 0);
            }
            return c(str, str2, str3);
        }
        int i18 = z07.field_status;
        a(z07.field_size, j18);
        z07.field_path = str2;
        z07.field_size = j18;
        z07.field_updateTime = c01.id.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && com.tencent.mm.sdk.platformtools.t8.K0(z07.field_imgDirPath)) {
            z07.field_imgDirPath = str3;
        }
        z07.field_status = i17;
        boolean J0 = ((e82.e) i95.n0.c(e82.e.class)).Ai().J0(z07);
        boolean z18 = true;
        if (i18 != 1 && i17 == 2 && g(z07, 0, 1)) {
            z07.field_isReport = 1;
            ((e82.e) i95.n0.c(e82.e.class)).Ai().J0(z07);
        }
        long f17 = f();
        if (f17 > d()) {
            java.util.List y07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().y0();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) y07;
            java.util.Iterator it = arrayList2.iterator();
            long j19 = 0;
            while (it.hasNext()) {
                i82.a aVar = (i82.a) it.next();
                if (j19 >= d() / 2) {
                    break;
                }
                j19 += aVar.field_size;
                arrayList.add(aVar);
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i19 = 0;
            while (it6.hasNext()) {
                i82.a aVar2 = (i82.a) it6.next();
                boolean h17 = com.tencent.mm.vfs.w6.h(aVar2.field_path);
                long e17 = e(aVar2.field_path);
                boolean g17 = com.tencent.mm.vfs.w6.g(aVar2.field_imgDirPath, z18);
                boolean z19 = J0;
                long e18 = e(aVar2.field_imgDirPath);
                if (h17 && g17) {
                    a(e17 + e18, 0L);
                    if (((e82.e) i95.n0.c(e82.e.class)).Ai().delete(aVar2.systemRowid)) {
                        i19++;
                    }
                } else {
                    if (h17) {
                        j17 = 0;
                        a(e17, 0L);
                    } else {
                        j17 = 0;
                    }
                    if (g17) {
                        a(e18, j17);
                    }
                }
                J0 = z19;
                z18 = true;
            }
            z17 = J0;
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "cleanHalfCache maxSize:%s allSize:%s allNum:%s deleteSize:%s deleteNum:%s deleteResult:%s", java.lang.Long.valueOf(d()), java.lang.Long.valueOf(f17), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i19));
        } else {
            z17 = J0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "allFavOffline size:%s, url(%s) status(%s) size:%s", java.lang.Long.valueOf(f()), str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18));
        return z17;
    }

    public static int i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum: url is null!");
            return -1;
        }
        i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum: favOffline(%s) is null!", str);
            return -1;
        }
        z07.field_failNum++;
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum result:%s", java.lang.Boolean.valueOf(((e82.e) i95.n0.c(e82.e.class)).Ai().J0(z07)));
        if (z07.field_failNum >= 5 && g(z07, 0, 0)) {
            z07.field_isReport = 1;
            ((e82.e) i95.n0.c(e82.e.class)).Ai().J0(z07);
        }
        return z07.field_failNum;
    }
}

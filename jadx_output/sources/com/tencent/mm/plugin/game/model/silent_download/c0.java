package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class c0 {
    public c0(com.tencent.mm.plugin.game.model.silent_download.w wVar) {
    }

    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
        nVar.field_appId = str;
        boolean delete = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().delete(nVar, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "remove SilentDownload DB, appid:%s, ret:%b", str, java.lang.Boolean.valueOf(delete));
        if (!delete || (a17 = com.tencent.mm.plugin.game.model.silent_download.k.a(str)) == null) {
            return;
        }
        long j17 = a17.f96961d;
        if (j17 > 0) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "remove download task, appid:%s", a17.f96966i);
        }
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.game.model.silent_download.v Zi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
        Zi.getClass();
        android.database.Cursor rawQuery = Zi.rawQuery(java.lang.String.format("select * from %s where %s=1 limit 1", "GameSilentDownload", "isRunning"), new java.lang.String[0]);
        com.tencent.mm.plugin.game.model.silent_download.n nVar = null;
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "first cursor is null");
        } else if (rawQuery.moveToFirst()) {
            nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
            nVar.convertFrom(rawQuery);
            rawQuery.close();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "no running task");
            rawQuery.close();
            android.database.Cursor rawQuery2 = Zi.rawQuery(java.lang.String.format("select * from %s where %s < ? limit 1", "GameSilentDownload", "nextCheckTime"), java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            if (rawQuery2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "second cursor is null");
            } else if (rawQuery2.moveToFirst()) {
                nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
                nVar.convertFrom(rawQuery2);
                rawQuery2.close();
            } else {
                rawQuery2.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "no record");
            }
        }
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, checkDownload task check is empty, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, task:[appid:%s] in DB to check download", nVar.field_appId);
        if (nVar.field_expireTime <= com.tencent.mm.sdk.platformtools.t8.i1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "task expire time, appId:%s", nVar.field_appId);
            com.tencent.mm.plugin.game.model.silent_download.u.d(nVar.field_appId);
            jj0.a.a().b(15, nVar.field_appId, "task_has_expired", 0L);
            a(nVar.field_appId);
            b(false);
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "NetType is not WIFI");
            jj0.a.a().b(12, nVar.field_appId, "not_wifi", 0L);
            return;
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().b1(nVar.field_appId);
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "sdcard isnt available");
            jj0.a.a().b(12, nVar.field_appId, "sdcard_not_available", 0L);
            return;
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().P0(nVar.field_appId);
        if (nVar.field_size > 0) {
            vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
            long j17 = nVar.field_size;
            ((uz.t1) u1Var).getClass();
            if (!com.tencent.mm.plugin.downloader.model.u0.a(j17)) {
                vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
                long j18 = nVar.field_size;
                ((uz.t1) u1Var2).getClass();
                if (!com.tencent.mm.plugin.downloader.model.u0.c(j18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
                    jj0.a.a().b(12, nVar.field_appId, "space_not_enough", 0L);
                    return;
                }
            }
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().W0(nVar.field_appId);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "fromBattery：%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().z0(nVar.field_appId);
        } else {
            com.tencent.mm.plugin.game.model.silent_download.a a17 = com.tencent.mm.plugin.game.model.silent_download.b.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "battery isCharging:%b  percent:%f", java.lang.Boolean.valueOf(a17.f140442a), java.lang.Float.valueOf(a17.f140443b));
            if (!a17.f140442a && a17.f140443b < 0.2d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "battery is low");
                jj0.a.a().b(12, nVar.field_appId, "battery_is_low", 0L);
                return;
            }
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().z0(nVar.field_appId);
        }
        p95.a.a(new com.tencent.mm.plugin.game.model.silent_download.z(this, nVar));
    }

    public void c() {
        com.tencent.mm.plugin.game.model.silent_download.v Zi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
        Zi.getClass();
        android.database.Cursor rawQuery = Zi.rawQuery(java.lang.String.format("select * from %s", "GameSilentDownload"), new java.lang.String[0]);
        java.util.ArrayList<com.tencent.mm.plugin.game.model.silent_download.n> arrayList = null;
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
        } else if (rawQuery.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
                nVar.convertFrom(rawQuery);
                arrayList2.add(nVar);
            } while (rawQuery.moveToNext());
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList size:%s", java.lang.Integer.valueOf(arrayList2.size()));
            arrayList = arrayList2;
        } else {
            rawQuery.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList no record");
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return;
        }
        for (com.tencent.mm.plugin.game.model.silent_download.n nVar2 : arrayList) {
            if (nVar2 != null) {
                if (nVar2.field_expireTime <= com.tencent.mm.sdk.platformtools.t8.i1()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "pauseDownload, task expire time, appId:%s", nVar2.field_appId);
                    com.tencent.mm.plugin.game.model.silent_download.u.d(nVar2.field_appId);
                    a(nVar2.field_appId);
                } else {
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo a17 = com.tencent.mm.plugin.game.model.silent_download.k.a(nVar2.field_appId);
                    if (a17 != null) {
                        long j17 = a17.f96961d;
                        if (j17 > 0 && a17.f96963f == 1) {
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.tencent.mm.plugin.downloader.model.r0.i().f97132g = true;
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "pauseDownload, appid:%s, ret:%b", a17.f96966i, java.lang.Boolean.valueOf(com.tencent.mm.plugin.downloader.model.r0.i().o(j17)));
                        }
                    }
                }
            }
        }
    }
}

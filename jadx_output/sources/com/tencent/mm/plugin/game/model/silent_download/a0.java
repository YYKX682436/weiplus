package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class a0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.silent_download.c0 f140445e;

    public a0(com.tencent.mm.plugin.game.model.silent_download.c0 c0Var, java.lang.String str) {
        this.f140445e = c0Var;
        this.f140444d = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        d02.c cVar;
        com.tencent.mm.plugin.game.model.silent_download.c0 c0Var;
        n33.b bVar;
        int i19;
        java.lang.String str2 = this.f140444d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSilentDownloader", "Check Error, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.d(str2, 18L, 1L);
            return 0;
        }
        n33.b bVar2 = (n33.b) oVar.f70711b.f70700a;
        if (bVar2 == null) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, query quota, ret op:%d", java.lang.Integer.valueOf(bVar2.f334481d));
        int i27 = bVar2.f334481d;
        com.tencent.mm.plugin.game.model.silent_download.c0 c0Var2 = this.f140445e;
        if (i27 != 1) {
            if (i27 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "delay, nextInterval:%d", java.lang.Long.valueOf(bVar2.f334482e));
                com.tencent.mm.plugin.game.model.silent_download.v Zi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
                long i110 = com.tencent.mm.sdk.platformtools.t8.i1() + bVar2.f334482e;
                Zi.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || i110 < 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime: appid is null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime ret:%b", java.lang.Boolean.valueOf(Zi.execSQL("GameSilentDownload", java.lang.String.format("update %s set %s=%s where %s='%s'", "GameSilentDownload", "nextCheckTime", java.lang.String.valueOf(i110), "appId", str2))));
                }
                long j17 = bVar2.f334482e + 5;
                c0Var2.getClass();
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.game.model.silent_download.w(c0Var2, j17), j17 * 1000);
            } else if (i27 != 3) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.d(str2, 19L, 1L);
            } else {
                com.tencent.mm.plugin.game.model.silent_download.u.a(str2, 5, 0);
                jj0.a.a().b(15, this.f140444d, "server_cancel", 0L);
                c0Var2.a(str2);
                c0Var2.b(false);
            }
            return 0;
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().D0(str2);
        d02.g gVar = bVar2.f334483f;
        if (gVar == null || (cVar = gVar.f225313d) == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar.f225276d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.d(str2, 20L, 1L);
            return 0;
        }
        com.tencent.mm.plugin.game.model.silent_download.n y07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(str2);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "local SilentDownloadTask is deleted");
            return 0;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m j18 = com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false);
        if (j18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "local appInfo is null, appid:%s", str2);
            return 0;
        }
        long j19 = bVar2.f334483f.f225313d.f225281i;
        long j27 = r53.f.j(j18.field_packageName);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "serverVersionCode: %d, localVersionCode:%d", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
        if (j19 <= 0 || j19 <= j27) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((kt.c) i0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.q(context, j18)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, push_download, app is installed, appid = %s", str2);
                com.tencent.mm.plugin.game.model.silent_download.u.a(y07.field_appId, 4, 0);
                jj0.a.a().b(15, j18.field_appId, "app_has_installed", 0L);
                c0Var2.a(y07.field_appId);
                c0Var2.b(false);
                return 0;
            }
            c0Var = c0Var2;
            bVar = bVar2;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "force update, serverVersionCode(%d) > localVersionCode(%d)", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27));
            if (j27 == 0) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 2);
            } else {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 1);
            }
            bVar = bVar2;
            c0Var = c0Var2;
        }
        java.lang.String str3 = bVar.f334483f.f225313d.f225276d;
        java.lang.String str4 = y07.field_downloadUrl;
        if (str4 == null) {
            str4 = "";
        }
        if (!str3.equals(str4)) {
            java.lang.String str5 = y07.field_downloadUrl;
            d02.c cVar2 = bVar.f334483f.f225313d;
            java.lang.String str6 = cVar2.f225276d;
            java.lang.Long valueOf = java.lang.Long.valueOf(cVar2.f225278f);
            d02.c cVar3 = bVar.f334483f.f225313d;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "update downloadInfo. [oldDownloadUrl]:%s, [newDownloadUrl]:%s, [size]:%d, [md5]:%s, [SecondaryUrl]:%s", str5, str6, valueOf, cVar3.f225279g, cVar3.f225284o);
            if (com.tencent.mm.sdk.platformtools.t8.K0(y07.field_downloadUrl)) {
                java.lang.String str7 = bVar.f334483f.f225313d.f225276d;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r17 = com.tencent.mm.plugin.downloader.model.r0.i().r(str7);
                if (r17 != null && r17.f96961d > 0 && (i19 = r17.f96963f) != 4 && i19 != 5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "download task already exists");
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().J0(str2, 3);
                    com.tencent.mm.plugin.game.model.silent_download.u.a(str2, 6, 0);
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().delete(y07, new java.lang.String[0]);
                    c0Var.b(false);
                    return 0;
                }
            }
            d02.c cVar4 = bVar.f334483f.f225313d;
            y07.field_downloadUrl = cVar4.f225276d;
            y07.field_size = cVar4.f225278f;
            y07.field_md5 = cVar4.f225279g;
            y07.field_SecondaryUrl = cVar4.f225284o;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar4.f225277e)) {
                y07.field_packageName = bVar.f334483f.f225313d.f225277e;
            }
            d02.g gVar2 = bVar.f334483f;
            y07.field_downloadInWidget = gVar2.f225317h;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(gVar2.f225313d.f225287r)) {
                d02.q qVar = new d02.q();
                qVar.f225356d = bVar.f334483f.f225313d.f225287r;
                try {
                    y07.field_sectionMd5Byte = qVar.toByteArray();
                } catch (java.io.IOException unused) {
                }
            }
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().update(y07, new java.lang.String[0]);
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            if (y07.field_size > 0) {
                vz.u1 u1Var = (vz.u1) i95.n0.c(vz.u1.class);
                long j28 = y07.field_size;
                ((uz.t1) u1Var).getClass();
                if (!com.tencent.mm.plugin.downloader.model.u0.a(j28)) {
                    vz.u1 u1Var2 = (vz.u1) i95.n0.c(vz.u1.class);
                    long j29 = y07.field_size;
                    ((uz.t1) u1Var2).getClass();
                    if (!com.tencent.mm.plugin.downloader.model.u0.c(j29)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
                        jj0.a.a().b(12, this.f140444d, "space_not_enough", 0L);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, quota check pass, start download");
            jj0.a.a().b(12, this.f140444d, "ok", 0L);
            int i28 = bVar.f334483f.f225313d.f225280h;
            c0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(y07.field_downloadUrl)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "startDownload, appId:%s, url:%s, size:%d, md5:%s, packageName:%s, expireTime:%d, isFirst:%b, nextCheckTime:%d, isRunning:%b", y07.field_appId, y07.field_downloadUrl, java.lang.Long.valueOf(y07.field_size), y07.field_md5, y07.field_packageName, java.lang.Long.valueOf(y07.field_expireTime), java.lang.Boolean.valueOf(y07.field_isFirst), java.lang.Long.valueOf(y07.field_nextCheckTime), java.lang.Boolean.valueOf(y07.field_isRunning));
                if (com.tencent.mm.plugin.webview.luggage.util.a.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GameSilentDownloader", "startDownload isTeenMode and ignore");
                } else {
                    java.lang.String str8 = y07.field_downloadUrl;
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r18 = com.tencent.mm.plugin.downloader.model.r0.i().r(str8);
                    if (r18 == null || r18.f96961d <= 0 || r18.f96963f != 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, all check pass, addDownloadTask, appid:%s", r18.f96966i);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 9L, 1L, false);
                        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
                        aVar.f97237d = y07.field_appId;
                        aVar.f97234a = y07.field_downloadUrl;
                        aVar.f97235b = y07.field_SecondaryUrl;
                        aVar.f97239f = y07.field_packageName;
                        aVar.f97240g = y07.field_size;
                        aVar.f97241h = y07.field_md5;
                        if (y07.field_downloadScene == 3) {
                            aVar.f97244k = com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_HOWLING_DETECTED;
                            aVar.f97246m = true;
                        } else {
                            aVar.f97244k = com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL;
                            aVar.f97246m = false;
                            aVar.f97252s = true;
                        }
                        if (y07.field_sectionMd5Byte != null) {
                            try {
                                d02.q qVar2 = new d02.q();
                                qVar2.parseFrom(y07.field_sectionMd5Byte);
                                aVar.f97253t = qVar2.f225356d;
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                        java.lang.String str9 = y07.field_appId;
                        ((kt.c) i0Var3).getClass();
                        aVar.f97236c = ((kt.c) i0Var2).Ui(context2, com.tencent.mm.pluginsdk.model.app.w.h(str9));
                        aVar.f97242i = i28;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mm.plugin.downloader.model.r0.i().f97132g = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "add downloadTask id:%d, downloaderType:%d", java.lang.Long.valueOf(((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, null)), java.lang.Integer.valueOf(i28));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download; push_download, all check pass, resume downloadTask, appid:%s", r18.f96966i);
                        long j37 = r18.f96961d;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mm.plugin.downloader.model.r0.i().f97132g = true;
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mm.plugin.downloader.model.r0.i().w(j37);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "cgi response back, but not in wifi");
        }
        return 0;
    }
}

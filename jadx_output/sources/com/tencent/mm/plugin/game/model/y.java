package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f140522d;

    public y(long j17) {
        this.f140522d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.ApplicationInfo applicationInfo;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        long j17 = this.f140522d;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadEventBus", "fInfo is null");
            return;
        }
        if (c17.field_status == 3) {
            if (com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "onInstallFinish, delete file: %s", c17.field_filePath);
                com.tencent.mm.vfs.w6.h(c17.field_filePath);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "removeDownloadInfo, appId=" + c17.field_appId);
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.i(j17);
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = c17.field_appId;
            ((uz.p1) q1Var).getClass();
            com.tencent.mm.plugin.downloader.model.m0.j(str);
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str2 = c17.field_downloadUrl;
            ((uz.p1) q1Var2).getClass();
            com.tencent.mm.plugin.downloader.model.m0.k(str2);
            android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, c17.field_packageName);
            if (a17 != null && (applicationInfo = a17.applicationInfo) != null) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(applicationInfo.sourceDir);
                ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
                java.lang.String a18 = e02.k.a(r6Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "gamelog.download , onInstallFinish, channelId =" + a18);
                c17.field_channelId = a18;
            }
            g02.c cVar = new g02.c();
            cVar.a(c17);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(5, cVar);
            vz.t1 t1Var = (vz.t1) i95.n0.c(vz.t1.class);
            java.lang.String str3 = c17.field_appId;
            ((uz.r1) t1Var).getClass();
            g02.b.d(str3, 8L, 1L);
            com.tencent.mm.plugin.game.model.a0 a0Var = (com.tencent.mm.plugin.game.model.a0) com.tencent.mm.plugin.game.model.b0.f140226c.get(c17.field_downloadUrl);
            if (a0Var == null) {
                vz.t1 t1Var2 = (vz.t1) i95.n0.c(vz.t1.class);
                java.lang.String str4 = c17.field_appId;
                int i17 = c17.field_scene;
                java.lang.String str5 = c17.field_md5;
                java.lang.String str6 = c17.field_downloadUrl;
                java.lang.String str7 = c17.field_extInfo;
                ((uz.r1) t1Var2).getClass();
                g02.b.b(str4, i17, 5, str5, str6, "", str7);
                return;
            }
            vz.t1 t1Var3 = (vz.t1) i95.n0.c(vz.t1.class);
            java.lang.String str8 = a0Var.f140193c;
            int i18 = a0Var.f140192b;
            java.lang.String str9 = a0Var.f140191a;
            java.lang.String str10 = c17.field_downloadUrl;
            java.lang.String str11 = a0Var.f140194d;
            java.lang.String str12 = a0Var.f140195e;
            ((uz.r1) t1Var3).getClass();
            g02.b.b(str8, i18, 5, str9, str10, str11, str12);
            vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
            java.lang.String str13 = c17.field_packageName;
            ((uz.a) f1Var).getClass();
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("install_begin_time", 0);
            if (java.lang.System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong(str13, 0L) : 0L) <= 600000) {
                ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
                g02.b.c(17, cVar);
            }
        }
    }
}

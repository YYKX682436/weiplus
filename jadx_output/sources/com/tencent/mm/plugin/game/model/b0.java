package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.model.b0 f140224a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f140225b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f140226c = new java.util.HashMap();

    public static com.tencent.mm.plugin.game.model.b0 b() {
        if (f140224a == null) {
            f140224a = new com.tencent.mm.plugin.game.model.b0();
        }
        return f140224a;
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        f140226c.put(str, new com.tencent.mm.plugin.game.model.a0(str2, i17, str3, str4, str5));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, int r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.b0.a(long, int):void");
    }

    public void c(long j17, int i17, boolean z17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && c17.field_downloadInWifi && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "wifi pause, return");
            c17.field_status = 2;
            c17.field_errCode = 0;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            g02.c cVar = new g02.c();
            cVar.a(c17);
            ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
            g02.b.c(13, cVar);
            return;
        }
        a(j17, 5);
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c18 != null) {
            java.lang.String str = null;
            if (i17 == 802) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("ChannelId", c18.field_channelId);
                    jSONObject.put("DownloadSize", c18.field_downloadedSize);
                    str = n53.a.e(jSONObject.toString());
                    jSONObject.toString();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadEventBus", "reportDownloadFailed, e = " + e17.getMessage());
                }
            }
            e(c18.field_appId, i17, z17, str);
        }
        d(j17);
        f(j17);
        ((uz.g) ((vz.m1) i95.n0.c(vz.m1.class))).getClass();
        java.util.HashMap hashMap = com.tencent.mm.plugin.downloader.model.q.f97116a;
        int j18 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17)), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask ,retry downloadId =  %d, retryCount = %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(j18));
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            if (java.lang.System.currentTimeMillis() - j17 <= 259200000) {
                if (!hashMap.containsKey(java.lang.Long.valueOf(j17)) || ((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17))).intValue() < 2) {
                    ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.downloader.model.p(j17, j18), j18 * 60000);
                }
            }
        }
    }

    public final void d(long j17) {
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDownloadAppState", "report, info is null");
            return;
        }
        if (!c17.field_fromWeApp) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDownloadAppState", "report,not from weApp, return");
            return;
        }
        if (c17.field_status == 3 && !com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDownloadAppState", "download success, but file not exist");
            return;
        }
        n33.h hVar = new n33.h();
        hVar.f334519d = c17.field_appId;
        int i17 = c17.field_status;
        if (i17 == 3) {
            hVar.f334520e = 1;
        } else if (i17 == 4) {
            hVar.f334520e = 2;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2683;
        lVar.f70666c = "/cgi-bin/mmgame-bin/reportappdownloadstatus";
        lVar.f70664a = hVar;
        lVar.f70665b = new n33.i();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new q43.k(), false);
    }

    public void e(java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        if (i17 == 710 || i17 == 711) {
            i17 = 804;
        }
        int i18 = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadEventBus", "appid = %s, errCode = %d", str, java.lang.Integer.valueOf(i18));
        if (z17) {
            jj0.a.a().c(str, 4, i18, null, str2);
        } else {
            jj0.a.a().c(str, 2, i18, null, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r18) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.b0.f(long):void");
    }
}

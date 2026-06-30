package n02;

/* loaded from: classes8.dex */
public class a implements vz.k1 {
    @Override // vz.k1
    public void Z(int i17, long j17) {
        boolean z17;
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.x.f97332a;
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && (z17 = c17.field_fromDownloadApp) && i17 != 9) {
            java.util.Map map = com.tencent.mm.plugin.downloader_app.model.b.f97255a;
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadNotificationManager", "updateNotification not from download app");
            } else if (!c17.field_autoDownload || c17.field_status == 3) {
                long j18 = c17.field_totalSize;
                int i18 = j18 > 0 ? (int) ((c17.field_downloadedSize * 100) / j18) : 0;
                z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
                java.util.Map map2 = com.tencent.mm.plugin.downloader_app.model.b.f97255a;
                java.util.HashMap hashMap = (java.util.HashMap) map2;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(c17.field_downloadUrl);
                if (l17 == null) {
                    l17 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    hashMap.put(c17.field_downloadUrl, l17);
                }
                k0Var.D.when = l17.longValue();
                if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_notificationTitle)) {
                    k0Var.f(c17.field_fileName);
                } else {
                    k0Var.f(c17.field_notificationTitle);
                }
                int i19 = c17.field_status;
                if (i19 == 1) {
                    k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    boolean z18 = i18 == 0;
                    k0Var.f469470n = 100;
                    k0Var.f469471o = i18;
                    k0Var.f469472p = z18;
                    if (c17.field_reserveInWifi) {
                        k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cem) + "·" + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cek));
                    } else {
                        k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cek));
                    }
                    k0Var.h(2, true);
                    k0Var.f469463g = com.tencent.mm.plugin.downloader_app.model.b.b(c17.field_appId);
                } else if (i19 == 2) {
                    com.tencent.mm.plugin.downloader_app.model.b.a(c17.field_downloadUrl);
                } else if (i19 == 3) {
                    com.tencent.mm.plugin.downloader_app.model.b.a(c17.field_downloadUrl);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_notificationTitle)) {
                        k0Var2.f(c17.field_fileName);
                    } else {
                        k0Var2.f(c17.field_notificationTitle);
                    }
                    k0Var2.D.icon = com.tencent.mm.R.drawable.c7v;
                    k0Var2.d(true);
                    android.content.Intent intent = new android.content.Intent();
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    intent.setClass(context2, com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive.class);
                    intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 3);
                    intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96958o, c17.field_filePath);
                    intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96959p, c17.field_md5);
                    intent.putExtra("downloadId", c17.field_downloadId);
                    k0Var2.f469463g = android.app.PendingIntent.getBroadcast(context2, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
                    if (c17.field_reserveInWifi) {
                        k0Var2.e(context.getString(com.tencent.mm.R.string.bri));
                    } else if (c17.field_autoDownload) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_notificationTitle)) {
                            k0Var2.f(c17.field_fileName + " · " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cef));
                        } else {
                            k0Var2.f(c17.field_notificationTitle + " · " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cef));
                        }
                        k0Var2.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cee));
                    } else {
                        k0Var2.e(context.getString(com.tencent.mm.R.string.cej));
                    }
                    ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(k0Var2.b(), true);
                } else if (i19 == 4) {
                    k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
                    k0Var.d(true);
                    k0Var.f469463g = com.tencent.mm.plugin.downloader_app.model.b.b(c17.field_appId);
                    int i27 = c17.field_errCode;
                    if (i27 == 806 || i27 == 802) {
                        k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.haw));
                    } else {
                        long j19 = c17.field_downloadId;
                        java.util.HashMap hashMap2 = com.tencent.mm.plugin.downloader.model.q.f97116a;
                        if (!(java.lang.System.currentTimeMillis() - j19 <= 259200000)) {
                            k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hat));
                        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                            k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hau));
                        } else {
                            k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hav));
                        }
                    }
                    k0Var.f469463g = com.tencent.mm.plugin.downloader_app.model.b.b(c17.field_appId);
                } else if (i19 != 5) {
                    com.tencent.mm.plugin.downloader_app.model.b.a(c17.field_downloadUrl);
                } else {
                    com.tencent.mm.plugin.downloader_app.model.b.a(c17.field_downloadUrl);
                }
                synchronized (com.tencent.mm.plugin.downloader_app.model.b.f97257c) {
                    java.util.Map map3 = com.tencent.mm.plugin.downloader_app.model.b.f97256b;
                    java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map3).get(c17.field_downloadUrl);
                    if (num == null) {
                        ((java.util.HashMap) map3).put(c17.field_downloadUrl, java.lang.Integer.valueOf(((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(k0Var.b(), true)));
                    } else {
                        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(num.intValue(), k0Var.b(), true);
                    }
                    if (c17.field_status == 4) {
                        ((java.util.HashMap) map3).remove(c17.field_downloadUrl);
                        ((java.util.HashMap) map2).remove(c17.field_downloadUrl);
                    }
                }
            }
        }
        java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.x.f97337f.iterator();
        while (it.hasNext()) {
            ((r02.t0) ((com.tencent.mm.plugin.downloader_app.model.s) it.next())).a(i17, j17);
        }
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.plugin.downloader_app.model.u.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it6;
            if (!fVar.hasNext()) {
                return;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((n02.e) ((com.tencent.mm.plugin.downloader_app.model.u) ((fs.n) qVar.get()))).Z(i17, j17);
            }
        }
    }
}

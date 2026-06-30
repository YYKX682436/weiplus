package y73;

/* loaded from: classes11.dex */
public class d0 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.hp.util.TinkerSyncResponse f459706d;

    /* renamed from: e, reason: collision with root package name */
    public long f459707e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f459708f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f459709g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f459710h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f459711i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f459712m = false;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f459713n = false;

    public d0(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        this.f459708f = false;
        this.f459706d = tinkerSyncResponse;
        com.tencent.mm.plugin.downloader.model.r0.i().a(this);
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.tencent.mm.sdk.platformtools.t8.K0(bm5.o1.f22719a.k(bm5.h0.RepairerConfig_Updater_MMdiffCgi_String, ""))) {
            return;
        }
        this.f459708f = true;
    }

    public final void a(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, boolean z17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142420s) ? context.getString(com.tencent.mm.R.string.f490534xu) : tinkerSyncResponse.f142420s;
        java.lang.String str = tinkerSyncResponse.f142421t;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        java.lang.String str2 = tinkerSyncResponse.f142422u;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str2);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(268435456));
        z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
        k0Var.m(null);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(string);
        k0Var.e(str);
        k0Var.f469463g = activity;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        android.app.Notification b17 = k0Var.b();
        b17.flags |= 16;
        if (z17) {
            ((android.app.NotificationManager) context.getSystemService("notification")).notify(19841110, b17);
        } else {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "ignore action when load from cache,when response is alpha version");
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "onTaskFailed");
        long j18 = this.f459707e;
        if (j18 != j17) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        y73.z.b(2);
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
        if (tinkerSyncResponse.e() == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 51L, 1L, false);
        } else if (tinkerSyncResponse.e() == 4) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskFailed taskId:%d", java.lang.Long.valueOf(j17));
            w73.f.k(126);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 126L, 1L, false);
        }
        com.tencent.mm.plugin.downloader.model.r0.i().s(this);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.io.File file;
        android.content.Context context;
        java.io.File[] listFiles;
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        long j18 = this.f459707e;
        if (j18 != j17) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        y73.z.c(2);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.io.File file2 = new java.io.File(com.tencent.mm.vfs.w6.i(str, false));
        android.content.pm.ApplicationInfo applicationInfo = context2.getApplicationInfo();
        if (applicationInfo == null) {
            file = null;
        } else {
            file = new java.io.File(applicationInfo.dataDir, "tinker_server");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (file != null && (listFiles = file.listFiles()) != null) {
            java.lang.String name = file2.getName();
            for (java.io.File file3 : listFiles) {
                if (!file3.getName().equals(name)) {
                    ak0.z.b(file3);
                }
            }
        }
        int e17 = this.f459706d.e();
        if (e17 == 1) {
            context = context2;
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
        } else if (e17 != 2) {
            if (e17 == 3) {
                java.lang.String absolutePath = file2.getAbsolutePath();
                com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = w73.a.f443492b;
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeDiff HdiffApk， patchPath:%s , new apk md5：%s, TinkerSyncResponse = %s.", absolutePath, tinkerSyncResponse.f142416o, tinkerSyncResponse.toString());
                gm0.j1.e().j(new w73.b(context2, absolutePath, tinkerSyncResponse));
            } else if (e17 == 4) {
                this.f459713n = true;
                e(file2, j17);
            }
            context = context2;
        } else {
            b83.e eVar = new b83.e(lp0.a.f320249c, this.f459706d.f142419r);
            android.content.SharedPreferences b17 = eVar.b();
            java.lang.String a17 = eVar.a(1);
            if (b17.contains(a17)) {
                context = context2;
                eVar.c(1, java.lang.System.currentTimeMillis() - b17.getLong(a17, 0L));
                b17.edit().remove(a17).commit();
            } else {
                context = context2;
            }
            rf0.m mVar = (rf0.m) i95.n0.c(rf0.m.class);
            java.lang.String absolutePath2 = file2.getAbsolutePath();
            java.lang.String str2 = this.f459706d.f142419r;
            ((qf0.n) mVar).getClass();
            if (absolutePath2 != null && str2 != null) {
                ((ku5.t0) ku5.t0.f312615d).g(new qf0.m(absolutePath2, str2));
            }
            if (file2.exists() && file2.canRead() && file2.isFile() && file2.length() > 0) {
                java.lang.String file4 = file2.getAbsolutePath();
                kotlin.jvm.internal.o.g(file4, "file");
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(file4)));
                try {
                    long readLong = dataInputStream.readLong();
                    vz5.b.a(dataInputStream, null);
                    if (readLong == 96093072812398L) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Bi();
                        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "hotpatch hit tpc file");
                        final long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.String i17 = c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                        final com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h0("TPCFile"), file2.getName());
                        ((ku5.t0) ku5.t0.f312615d).q(new y73.j0(this, i17, file2.getAbsolutePath(), r6Var.o(), new xv.m0() { // from class: y73.d0$$a
                            @Override // xv.m0
                            public final void a(int i18) {
                                y73.d0 d0Var = y73.d0.this;
                                long j19 = currentTimeMillis;
                                com.tencent.mm.vfs.r6 r6Var2 = r6Var;
                                d0Var.getClass();
                                if (i18 == 0) {
                                    new b83.e(lp0.a.f320249c, d0Var.f459706d.f142419r).d(java.lang.System.currentTimeMillis() - j19);
                                    d0Var.d(new java.io.File(r6Var2.o()));
                                } else {
                                    com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                                    errorMsgInfoStruct.f56113e = 99L;
                                    errorMsgInfoStruct.f56115g = -1L;
                                    errorMsgInfoStruct.f56112d = -1L;
                                    errorMsgInfoStruct.k();
                                    com.tencent.mars.xlog.Log.e("Tinker.SyncResponseProcessor", "TCPFile Fail:$resultCode");
                                }
                                ((ku5.t0) ku5.t0.f312615d).g(new y73.d0$$b());
                            }
                        }));
                    }
                } finally {
                }
            }
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "hotpatch not tpc file");
            d(file2);
        }
        android.content.Context context3 = context;
        context3.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", this.f459706d.f142419r).apply();
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse2 = this.f459706d;
        context3.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", tinkerSyncResponse2.d(tinkerSyncResponse2.f142409e, 2)).apply();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this);
    }

    public final void d(java.io.File file) {
        boolean z17;
        try {
            z17 = new com.tencent.tinker.loader.shareutil.ShareSecurityCheck(ak0.o.f5543b).verifyPatchMetaSignature(file);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.SyncResponseProcessor", e17, "verify patch signature failed.", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 39L, 1L, false);
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "verify patch signature failed, tinker.");
            y73.z.b(2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 31L, 1L, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply");
        if (com.tencent.mm.sdk.platformtools.x2.r()) {
            return;
        }
        if (z65.c.f470459e) {
            com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "[tomys] patch applying is blocked by assist.");
            return;
        }
        if (!com.tencent.mm.app.m2.f53515a.a()) {
            com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientver to recover.");
            return;
        }
        ak0.e a17 = ak0.g.a(file);
        if (a17 != null) {
            java.lang.String property = ((ak0.f) a17).f5537a.getProperty("patch.client.ver");
            if (android.text.TextUtils.isEmpty(property)) {
                com.tencent.mars.xlog.Log.e("Tinker.SyncResponseProcessor", "[-] Fail to get patch clientversion.");
            } else {
                b83.e eVar = new b83.e(lp0.a.f320249c, property);
                eVar.f(eVar.a(2));
            }
        }
        ak0.n.d(file);
    }

    public final void e(java.io.File file, long j17) {
        java.lang.String str = (java.lang.String) this.f459711i.get(java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = this.f459710h;
        if (str == null || hashMap.get(str) == null || ((java.lang.Boolean) hashMap.get(str)).booleanValue()) {
            hashMap.remove(str);
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
            tinkerSyncResponse.f142423v = true;
            if (tinkerSyncResponse.f142425x) {
                w73.a.e("mmdiff_apk_has_update_notify", tinkerSyncResponse.c(), 4);
            }
            java.util.Map map = c83.e.f39678a;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_auto_update, 0) == 1;
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "isForceStopAutoMerge = %s, syncResponse = %s.", java.lang.Boolean.valueOf(z17), tinkerSyncResponse);
            if (z17) {
                return;
            }
            if (this.f459708f) {
                android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "finish download, and start merge patch", 1).show();
            }
            c83.e.b(tinkerSyncResponse);
            ((x73.g) x73.c.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f452441a).a(file.getAbsolutePath(), tinkerSyncResponse, false);
            com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService.f142399f = new y73.k0(this);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    public final void g() {
        boolean equals = fp.m.c().equals("mounted");
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
        if (!equals) {
            com.tencent.mars.xlog.Log.e("Tinker.SyncResponseProcessor", "no sdcard.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 50L, 1L, false);
            w73.f.i(10, tinkerSyncResponse.e(), 103);
            return;
        }
        if (!(tinkerSyncResponse.f142410f.intValue() == 4 ? fp.i.c(((int) new java.io.File(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a)).length()) * 4) : fp.i.c(tinkerSyncResponse.f142415n))) {
            com.tencent.mars.xlog.Log.e("Tinker.SyncResponseProcessor", "sdcard is full.");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(614L, 51L, 1L, false);
            if (tinkerSyncResponse.e() == 3 || tinkerSyncResponse.e() == 4) {
                g0Var.idkeyStat(614L, 55L, 1L, false);
                w73.f.i(10, tinkerSyncResponse.e(), 104);
                return;
            }
            return;
        }
        boolean z17 = this.f459708f;
        if (z17) {
            android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "start download patch.", 0).show();
        }
        c83.e.c(tinkerSyncResponse.f142410f.intValue(), 1);
        w73.f.h(1, tinkerSyncResponse.f142410f.intValue());
        if (tinkerSyncResponse.e() == 4) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "hdiffApk syncResponse, newApkMd5 = " + tinkerSyncResponse.f142416o + ", oldApkMd5 = " + tinkerSyncResponse.f142417p);
        }
        if (tinkerSyncResponse.e() == 3 || tinkerSyncResponse.e() == 4) {
            java.lang.String l17 = c83.e.l(tinkerSyncResponse.f142416o);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142416o) && c83.e.n(l17) && uk.b.a(l17)) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (z17) {
                    android.widget.Toast.makeText(context, "apk hase merge success can not megre, Switch wechat from background to foreground..", 0).show();
                }
                java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.b()) ? context.getString(com.tencent.mm.R.string.k3k) : tinkerSyncResponse.b();
                r45.mm6 mm6Var = new r45.mm6();
                mm6Var.f380668d = tinkerSyncResponse.f142414m;
                mm6Var.f380673i = context.getString(com.tencent.mm.R.string.fdx);
                mm6Var.f380675n = context.getString(com.tencent.mm.R.string.g1e);
                mm6Var.f380676o = context.getString(com.tencent.mm.R.string.f493416k33);
                mm6Var.f380671g = tinkerSyncResponse.f142416o;
                mm6Var.f380672h = tinkerSyncResponse.f142417p;
                mm6Var.f380670f = tinkerSyncResponse.f142415n;
                mm6Var.f380677p = tinkerSyncResponse.f142412h;
                mm6Var.f380678q = tinkerSyncResponse.f142413i;
                mm6Var.f380681t = tinkerSyncResponse.f142410f.intValue();
                mm6Var.f380679r = tinkerSyncResponse.f142418q;
                mm6Var.f380669e = l17;
                try {
                    mm6Var.f380680s = c83.e.q(tinkerSyncResponse.f142419r);
                } catch (java.lang.Exception unused) {
                }
                mm6Var.f380674m = string;
                c83.e.a(mm6Var, tinkerSyncResponse);
                c83.e.t(mm6Var);
                com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, file is exist. need no to download. newApkMd5:%s", tinkerSyncResponse.f142416o);
                w73.f.h(13, tinkerSyncResponse.e());
                return;
            }
        }
        c83.e.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ((ku5.t0) ku5.t0.f312615d).g(new c83.d());
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = tinkerSyncResponse.f142412h;
        t0Var.f97153d = tinkerSyncResponse.f142414m;
        t0Var.f97154e = tinkerSyncResponse.f142413i;
        t0Var.f97158i = false;
        t0Var.f97160k = true;
        t0Var.f97155f = 2;
        t0Var.f97159j = false;
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        this.f459707e = b17;
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "Download task id is :%d", java.lang.Long.valueOf(b17));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(614L, 2L, 1L, false);
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            g0Var2.idkeyStat(614L, 7L, 1L, false);
        } else {
            g0Var2.idkeyStat(614L, 8L, 1L, false);
        }
        if (tinkerSyncResponse.f142410f.intValue() == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142419r)) {
            b83.e eVar = new b83.e(lp0.a.f320249c, tinkerSyncResponse.f142419r);
            eVar.f(eVar.a(1));
            eVar.c(6, 0L);
        }
        if (tinkerSyncResponse.f142410f.intValue() == 3) {
            g0Var2.idkeyStat(614L, 56L, 1L, false);
        }
        if (tinkerSyncResponse.f142410f.intValue() == 4) {
            w73.f.k(124);
            g0Var2.idkeyStat(614L, 124L, 1L, false);
            ((x73.g) x73.c.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f452441a).a("", tinkerSyncResponse, true);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        if (this.f459706d.e() == 4) {
            this.f459709g.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            java.lang.String str2 = (java.lang.String) this.f459711i.get(java.lang.Long.valueOf(j17));
            try {
                java.io.File file = new java.io.File(com.tencent.mm.vfs.w6.i(str2, false));
                com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + file.exists() + "， 长度 " + file.length() + ", recvLen = " + ((j18 / 1024) / 1024) + "MB, totalLen = " + j19);
                if (j19 > w73.a.f443491a * 2) {
                    w73.a.f443491a = j19 / 2;
                }
                if (this.f459712m || j18 <= w73.a.f443491a || !file.exists()) {
                    return;
                }
                if (this.f459708f) {
                    android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "read OldDeltaFriendFile and download 50%", 0).show();
                }
                this.f459712m = true;
                this.f459710h.put(str2, java.lang.Boolean.FALSE);
                w73.a.a(file.getAbsolutePath(), new y73.l0(this, str2, file, j17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    public boolean j(boolean z17) {
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "process tinker response: %s", tinkerSyncResponse.toString());
        boolean z18 = false;
        if (bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Updater_CloseAutoPatch_Int, 0) == 1) {
            return false;
        }
        if (!tinkerSyncResponse.a()) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "process check response fail, just return");
            return false;
        }
        if (tinkerSyncResponse.h()) {
            if (ak0.o.f()) {
                com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process");
                new w11.f1(com.tencent.mm.sdk.platformtools.x2.f193071a, new y73.g0(this), false);
            } else {
                com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return");
            }
            return true;
        }
        if (!tinkerSyncResponse.i()) {
            return true;
        }
        if (tinkerSyncResponse.f()) {
            com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "is lower version skip.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 78L, 1L, false);
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                int intValue = java.lang.Integer.decode(lp0.a.f320249c).intValue();
                if (intValue >= 654316032 && intValue <= 654316287 && "vivo".equalsIgnoreCase(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT == 29) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_vivo_q_patch, 0) == 0) {
                        com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "[!] [tomys] Patch was blocked due to some compatibility issues.");
                        return true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.SyncResponseProcessor", th6, "[-] [tomys] Error happened in tmp ctrl code.", new java.lang.Object[0]);
            }
        }
        if (z65.c.f470459e) {
            com.tencent.mars.xlog.Log.w("Tinker.SyncResponseProcessor", "[tomys] patch downloading is blocked by assist.");
            return true;
        }
        int intValue2 = tinkerSyncResponse.f142410f.intValue();
        java.lang.String str = tinkerSyncResponse.f142422u;
        if (intValue2 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142419r) && !com.tencent.mm.sdk.platformtools.t8.K0(str) && c83.c.a(tinkerSyncResponse.f142419r)) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "auto,hdiff alpha package");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 77L, 1L, false);
            a(tinkerSyncResponse, z17);
            return true;
        }
        if (tinkerSyncResponse.f142410f.intValue() == 4) {
            y73.p.c(tinkerSyncResponse);
        }
        if (!(bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Updater_DISABLEALPHA_Int, 0) == 1) && tinkerSyncResponse.f142410f.intValue() == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142419r) && c83.c.a(tinkerSyncResponse.f142419r) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (this.f459708f) {
                android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "to open alpha switch.", 0).show();
            }
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk,auto,hdiff alpha package");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 79L, 1L, false);
            a(tinkerSyncResponse, z17);
            return true;
        }
        java.lang.String b17 = tinkerSyncResponse.b();
        java.lang.String str2 = tinkerSyncResponse.f142419r;
        java.lang.Integer num = tinkerSyncResponse.f142411g;
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s clientversion:%s", num, b17, str2);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int intValue3 = num.intValue();
        java.lang.String str3 = tinkerSyncResponse.f142414m;
        if (intValue3 == 2 && com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            java.util.HashMap hashMap = tinkerSyncResponse.f142409e;
            if (hashMap != null && !hashMap.isEmpty() && hashMap.containsKey(4)) {
                z18 = true;
            }
            if (z18) {
                if (b83.s.a(context, str3)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 44L, 1L, false);
                    com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", str3);
                } else {
                    int intValue4 = tinkerSyncResponse.f142410f.intValue();
                    int i17 = tinkerSyncResponse.f142415n;
                    if (intValue4 == 2) {
                        y73.u0.a(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdx), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdz, tinkerSyncResponse.b(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k3a), com.tencent.mm.sdk.platformtools.t8.f0(i17)), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k3e), new y73.e0(this), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493416k33), new y73.f0(this, context));
                    } else if (tinkerSyncResponse.f142410f.intValue() == 3 || tinkerSyncResponse.f142410f.intValue() == 4) {
                        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "showUpdateDialog syncResponse.packageType: %s.", tinkerSyncResponse.f142410f);
                        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.b()) ? context.getString(com.tencent.mm.R.string.k3k) : tinkerSyncResponse.b();
                        r45.mm6 mm6Var = new r45.mm6();
                        mm6Var.f380668d = str3;
                        mm6Var.f380673i = context.getString(com.tencent.mm.R.string.fdx);
                        mm6Var.f380675n = context.getString(com.tencent.mm.R.string.k3e);
                        mm6Var.f380676o = context.getString(com.tencent.mm.R.string.f493416k33);
                        mm6Var.f380671g = tinkerSyncResponse.f142416o;
                        mm6Var.f380672h = tinkerSyncResponse.f142417p;
                        mm6Var.f380670f = i17;
                        mm6Var.f380677p = tinkerSyncResponse.f142412h;
                        mm6Var.f380678q = tinkerSyncResponse.f142413i;
                        mm6Var.f380681t = tinkerSyncResponse.f142410f.intValue();
                        mm6Var.f380679r = tinkerSyncResponse.f142418q;
                        mm6Var.f380669e = c83.e.l(tinkerSyncResponse.f142416o);
                        c83.e.a(mm6Var, tinkerSyncResponse);
                        try {
                            mm6Var.f380680s = c83.e.q(tinkerSyncResponse.f142419r);
                        } catch (java.lang.Exception unused) {
                        }
                        mm6Var.f380674m = string;
                        c83.e.t(mm6Var);
                    }
                    y73.a.b(4);
                }
                return true;
            }
        }
        if (tinkerSyncResponse.g() && !b83.s.a(context, str3)) {
            g();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f459706d.e() == 4) {
            this.f459711i.put(java.lang.Long.valueOf(j17), str);
            this.f459709g.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.Long.parseLong("0")));
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "onTaskRemoved taskId:%d", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.downloader.model.r0.i().s(this);
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f459706d;
        if (tinkerSyncResponse == null || tinkerSyncResponse.e() != 4) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskRemoved taskId:%d", java.lang.Long.valueOf(j17));
        w73.f.k(127);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 127L, 1L, false);
    }
}

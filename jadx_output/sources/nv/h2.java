package nv;

/* loaded from: classes9.dex */
public class h2 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore.BackupToPc", "sysMsgListener onreceive sysmsg");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 0L, 1L, false);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(p0Var.f70726a.f377561h), "sysmsg", null);
        if (c01.id.a() - (p0Var.f70726a.f377565o * 1000) > 60000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCore.BackupToPc", "notify delaytime > 1min ignore");
            return;
        }
        final java.lang.String url = (java.lang.String) d17.get(".sysmsg.MMBakChatNotify.url");
        final java.lang.String str = (java.lang.String) d17.get(".sysmsg.MMBakChatNotify.pcdevicetype");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
            return;
        }
        xn1.c.a("Type", 1);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: nv.h2$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                final nv.h2 h2Var = nv.h2.this;
                final java.lang.String str2 = url;
                final java.lang.String str3 = str;
                sn1.j jVar = (sn1.j) obj;
                h2Var.getClass();
                final bw5.s10 s10Var = (bw5.s10) jVar.f410031a;
                int i17 = jVar.f410032b;
                if (i17 == 0 && jVar.f410033c == 0 && s10Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nv.h2$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.content.Intent intent;
                            nv.h2.this.getClass();
                            bw5.s10 s10Var2 = s10Var;
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore.BackupToPc", "[onRecieveMsg] Scene=%d", java.lang.Integer.valueOf(s10Var2.f32760r));
                            int i18 = s10Var2.f32760r;
                            if (i18 == 100 || i18 == 101 || i18 == 102) {
                                android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                                if (launcherUI == null) {
                                    launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                }
                                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).bj(launcherUI, s10Var2, mv.a.f331474m);
                                return;
                            }
                            android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.backuppcmove.BackupPcService.class);
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent2, 0);
                            if (queryIntentServices == null || queryIntentServices.size() != 1) {
                                intent = null;
                            } else {
                                android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                                intent = new android.content.Intent(intent2);
                                intent.setComponent(componentName);
                            }
                            if (intent != null) {
                                intent2 = intent;
                            }
                            j45.l.A(intent2.putExtra("url", str2).putExtra("isFromWifi", true).putExtra("deviceName", str3));
                        }
                    });
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupCore.BackupToPc", "getConnectInfoAsync fail, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f410033c));
                final bw5.zi0 zi0Var = (jVar.f410032b != 4 || jVar.f410033c == 0) ? bw5.zi0.ERROR_CODE_NETWORK_DISCONNECT : bw5.zi0.ERROR_CODE_ACCOUNT_MISMATCH;
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nv.h2$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                        if (launcherUI == null) {
                            launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        }
                        mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                        ((yn1.h4) wVar).ij(launcherUI, bw5.zi0.this, mv.a.f331474m);
                    }
                });
            }
        };
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new sn1.v(url, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}

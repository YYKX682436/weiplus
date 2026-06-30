package mn1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329825d;

    public a(mn1.d dVar, java.lang.String str) {
        this.f329825d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        final mn1.e j17 = mn1.d.i().j();
        j17.getClass();
        java.lang.String url = this.f329825d;
        com.tencent.mars.xlog.Log.w("MicroMsg.BackupMoveRecoverServer", "~~~~~~~~~~~~  start by url:%s", url);
        kn1.q.f309658a = kn1.p.f309655f;
        kn1.q.a(kn1.m.f309633f, kn1.o.f309649e, "scan qr code and get conn info");
        if (((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            c01.w9.a();
        }
        sn1.i.T();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: mn1.e$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                bw5.f4 f4Var;
                sn1.j jVar = (sn1.j) obj;
                mn1.e eVar = mn1.e.this;
                eVar.getClass();
                kn1.f.f309601g = 22;
                mn1.d.i().e().f309609a = 1;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI");
                className.addFlags(335544320);
                className.putExtra("nofification_type", "backup_move_notification");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(className);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer", "lambda$doGetConnectInfo$0", "(Lcom/tencent/mm/plugin/backup/backupscene/BackupCgiHelper$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                int i17 = 0;
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/backup/backupmove/BackupMoveRecoverServer", "lambda$doGetConnectInfo$0", "(Lcom/tencent/mm/plugin/backup/backupscene/BackupCgiHelper$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 41L, 1L, false);
                bw5.s10 s10Var = (bw5.s10) jVar.f410031a;
                java.lang.String str = null;
                int i18 = jVar.f410033c;
                int i19 = jVar.f410032b;
                if (i19 != 0 || i18 != 0) {
                    kn1.m mVar = kn1.m.f309633f;
                    kn1.o oVar = kn1.o.f309651g;
                    kn1.q.a(mVar, oVar, "onGetConnInfo: cgi failed");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info other error [%d,%d,%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), jVar.f410034d);
                    if (i19 == 4 && i18 == -2011) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnect info: INVALID URL");
                    }
                    java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(2, null);
                    if ((str2 != null ? str2 : "").equals(s10Var.b())) {
                        mn1.d.i().e().f309609a = -5;
                        eVar.a(-5);
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                        kn1.q.a(mVar, oVar, "onGetConnInfo: not same account");
                        mn1.d.i().e().f309609a = -14;
                        eVar.a(-14);
                        return;
                    }
                }
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(2, null);
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(s10Var.b())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getConnectinfo not the same account");
                    kn1.q.a(kn1.m.f309633f, kn1.o.f309651g, "onGetConnInfo: not same account");
                    mn1.d.i().e().f309609a = -5;
                    eVar.a(-14);
                    return;
                }
                boolean[] zArr = s10Var.f32765w;
                kn1.f.f309602h = (zArr[3] ? s10Var.f32750e : new r45.cu5()).f371841f.f192156a;
                mn1.d.i().f309604b = zArr[2] ? s10Var.f32749d : "";
                mn1.d.i().f309605c = zArr[4] ? s10Var.f32751f : "";
                mn1.d.i().f309606d = zArr[5] ? s10Var.f32752g : "";
                sn1.i.f410023t = eVar.L;
                mn1.d.i().f();
                sn1.i.f410015i = mn1.d.i().j();
                sn1.i.f410016m = mn1.d.i().h();
                sn1.i.f410017n = 2;
                sn1.i.f410019p = new sn1.s0(eVar.M);
                eVar.A = "";
                mn1.e.O = false;
                mn1.e.P = 2;
                if (s10Var.f32754i > 0) {
                    java.util.LinkedList linkedList = s10Var.f32755m;
                    bw5.f4 f4Var2 = (bw5.f4) linkedList.getFirst();
                    str = f4Var2.getIp();
                    int intValue = ((java.lang.Integer) f4Var2.f27143e.getFirst()).intValue();
                    eVar.D = s10Var.c();
                    eVar.E = str;
                    eVar.F = intValue;
                    if (linkedList.size() > 1) {
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.g(context2, "context");
                        if ((b3.l.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") == 0) && (f4Var = (bw5.f4) linkedList.get(1)) != null && f4Var.getIp().contains("$")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "start WifiDirect deviceName:" + f4Var.getIp());
                            int lastIndexOf = f4Var.getIp().lastIndexOf("$");
                            eVar.A = f4Var.getIp().substring(0, lastIndexOf);
                            str = f4Var.getIp().substring(lastIndexOf);
                            i17 = ((java.lang.Integer) f4Var.f27143e.getFirst()).intValue();
                        }
                    }
                    i17 = intValue;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd address convMsgCount is empty");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onGetConnectInfoEnd getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d, wifiDeviceName:%s", java.lang.Integer.valueOf(s10Var.f32753h), java.lang.Integer.valueOf(s10Var.f32760r), s10Var.c(), str, java.lang.Integer.valueOf(i17), eVar.A);
                if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.A)) {
                    kn1.q.a(kn1.m.f309633f, kn1.o.f309650f, "onGetConnInfo: start client service");
                    eVar.l(str, i17);
                }
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
}

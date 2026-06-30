package qn1;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364983e;

    public d0(com.tencent.mm.plugin.backup.backuppcmove.BackupPcService backupPcService, java.lang.String str, java.lang.String str2) {
        this.f364982d = str;
        this.f364983e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        final qn1.d j17 = qn1.c.i().j();
        j17.f364975o = true;
        java.lang.String url = this.f364982d;
        java.lang.String str = this.f364983e;
        com.tencent.mars.xlog.Log.w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s, deviceName:%s", url, str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String lowerCase = str.toLowerCase();
            if (lowerCase.contains("window")) {
                xn1.c.b("PairDevice", 1);
            } else if (lowerCase.contains(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC)) {
                xn1.c.b("PairDevice", 2);
            } else if (lowerCase.contains(com.eclipsesource.mmv8.Platform.ANDROID)) {
                xn1.c.b("PairDevice", 3);
            } else if (lowerCase.contains("ios")) {
                xn1.c.b("PairDevice", 4);
            }
        }
        kn1.f.f309601g = 1;
        sn1.i.T();
        j17.f364974n = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 0)).intValue();
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: qn1.d$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                java.lang.String str2;
                boolean z17;
                sn1.j jVar = (sn1.j) obj;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                qn1.d dVar = qn1.d.this;
                dVar.f364965e = bool;
                int i17 = jVar.f410032b;
                int i18 = jVar.f410033c;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: other error[%d,%d,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), jVar.f410034d);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 111L, 1L, false);
                    if (i17 == 4 && i18 == -2011) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: INVALID URL");
                    }
                    qn1.c.i().e().f309609a = -5;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    qn1.c.i().l().g(-5);
                    return;
                }
                bw5.s10 s10Var = (bw5.s10) jVar.f410031a;
                java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(2, null);
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(s10Var.b())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: not the same account");
                    qn1.c.i().e().f309609a = -5;
                    qn1.c.i().l().g(-5);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 112L, 1L, false);
                    return;
                }
                java.util.LinkedList linkedList = s10Var.f32755m;
                if (linkedList == null || linkedList.isEmpty() || linkedList.getFirst() == null) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = java.lang.Integer.valueOf(s10Var.f32754i);
                    if (linkedList == null) {
                        str2 = "null";
                    } else {
                        str2 = "" + linkedList.size();
                    }
                    objArr[1] = str2;
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd AddrList is empty! AddrCount[%d], AddrList size[%s]", objArr);
                    qn1.c.i().e().f309609a = -5;
                    qn1.c.i().l().g(-5);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 113L, 1L, false);
                    return;
                }
                boolean[] zArr = s10Var.f32765w;
                boolean z27 = zArr[10];
                if ((z27 ? s10Var.f32757o : "") != null) {
                    dVar.f364965e = java.lang.Boolean.valueOf((z27 ? s10Var.f32757o : "").indexOf("__migrateetargim__") > 0);
                }
                int i19 = s10Var.f32760r;
                if (i19 == 100 || i19 == 101) {
                    dVar.f364965e = java.lang.Boolean.TRUE;
                }
                xn1.b bVar = xn1.b.f455454a;
                if (i19 == 100) {
                    xn1.c.a("Type", 2);
                    bVar.a(2, 1, dVar.f364969i);
                } else if (i19 == 101) {
                    xn1.c.a("Type", 3);
                    bVar.a(3, 1, dVar.f364969i);
                }
                dVar.f364967g = s10Var.f32760r;
                bw5.f4 f4Var = (bw5.f4) linkedList.getFirst();
                java.lang.String ip6 = f4Var.getIp();
                int intValue = ((java.lang.Integer) f4Var.f27143e.getFirst()).intValue();
                dVar.f364962b = s10Var.c();
                dVar.f364963c = ip6;
                dVar.f364964d = intValue;
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", java.lang.Integer.valueOf(s10Var.f32753h), java.lang.Integer.valueOf(s10Var.f32760r), s10Var.c(), ip6, java.lang.Integer.valueOf(intValue));
                kn1.f.f309602h = (zArr[3] ? s10Var.f32750e : new r45.cu5()).f371841f.f192156a;
                qn1.c.i().f309604b = zArr[2] ? s10Var.f32749d : "";
                qn1.c.i().f309605c = zArr[4] ? s10Var.f32751f : "";
                qn1.c.i().f309606d = zArr[5] ? s10Var.f32752g : "";
                qn1.c.i().f309608f = (zArr[3] ? s10Var.f32750e : new r45.cu5()).f371841f.f192156a;
                sn1.i.f410017n = 1;
                qn1.c.i().f();
                xn1.c.a("Type", 0);
                sn1.i.f410023t = dVar.f364980t;
                sn1.i.f410015i = dVar.f364977q;
                sn1.i.f410016m = qn1.c.i().h();
                qn1.c.i().e().f309609a = 1;
                if (dVar.f364965e.booleanValue()) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", new java.lang.Throwable(), "never run here", new java.lang.Object[0]);
                    z17 = false;
                } else {
                    android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI");
                    className.addFlags(335544320);
                    className.putExtra("nofification_type", "back_to_pcmgr_notification");
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(className);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcProcessMgr", "startConnectPc", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    qn1.c.i();
                    android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
                    z17 = false;
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                    edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
                    edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
                    edit.commit();
                }
                dVar.f364968h = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "startConnectPc, PC ip:%s, PC wifi:%s, Phone wifi:%s", dVar.f364963c, dVar.f364962b, kn1.k.z(com.tencent.mm.sdk.platformtools.x2.f193071a));
                qn1.d.f364960u = 2;
                dVar.i();
            }
        };
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new sn1.v(url, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
        if (j17.f364966f != 2) {
            sn1.i.f410019p = new sn1.s0(j17.f364978r);
        }
        j17.f364966f = 1;
    }
}

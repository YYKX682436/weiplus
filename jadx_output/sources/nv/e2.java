package nv;

/* loaded from: classes11.dex */
public final class e2 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.Long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg");
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg, addMsgInfo is null, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onRecieveMsg, content = " + p0Var.f70726a.f377561h);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(p0Var.f70726a.f377561h), "sysmsg", null);
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.DeviceName");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.ContactName");
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.NickName");
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.chatrecordstartexport.CreateTime");
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        long a17 = hq.d.a();
        if (str4 == null || (j17 = r26.h0.j(str4)) == null) {
            return;
        }
        long longValue = j17.longValue() * 1000;
        if (a17 - longValue > 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "msg too old, createTimeLong=" + longValue + ", now=" + a17);
            return;
        }
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        java.lang.String str5 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
            android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI == null) {
                launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context = launcherUI;
            if (context == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "context is null, return");
                return;
            } else {
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).mj(context, str, str2, str3, longValue);
                return;
            }
        }
        long j18 = (com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL + a17) - longValue;
        long j19 = j18 <= 60000 ? j18 : 60000L;
        if (j19 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "Invalid time, remainMs=" + j19 + ", now=" + a17 + ", createTime=" + longValue);
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
        intent.putExtra("deviceName", str);
        intent.putExtra("contactName", str2);
        intent.putExtra("nickName", str3);
        intent.putExtra("msgCreateTime", longValue);
        intent.putExtra("nofification_type", "single_migration_to_pc_notification");
        intent.setFlags(268468224);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, 0, intent, 201326592);
        z2.k0 k0Var = new z2.k0(context2, n25.a.a());
        k0Var.D.when = longValue;
        k0Var.A = j19;
        k0Var.h(16, true);
        k0Var.f(context2.getString(com.tencent.mm.R.string.f490495wp));
        k0Var.e(context2.getString(com.tencent.mm.R.string.o9u));
        k0Var.f469466j = 1;
        k0Var.f469475s = "event";
        k0Var.g(-1);
        k0Var.f469463g = activity;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        android.app.Notification b17 = k0Var.b();
        kotlin.jvm.internal.o.f(b17, "build(...)");
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).m(b17, true);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticBackupMigrateToPcOnDemandEventListener", "onDeleteMsg");
    }
}

package s65;

/* loaded from: classes11.dex */
public class s0 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r65.a f403514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.Updater f403515b;

    public s0(com.tencent.mm.sandbox.updater.Updater updater, r65.a aVar) {
        this.f403515b = updater;
        this.f403514a = aVar;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 52L, 1L, true);
            iz5.a.g("updater invalid assert", false);
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(34);
        com.tencent.mm.sandbox.updater.Updater updater = this.f403515b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "go to update, isSilenceDownload:%s", java.lang.Boolean.valueOf(updater.f192327h));
        if (!fp.m.c().equals("mounted")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater", "no sdcard.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 53L, 1L, true);
            updater.f192327h = false;
        }
        r65.a aVar = this.f403514a;
        com.tencent.mm.protobuf.f fVar = aVar.f393067d.f70711b.f70700a;
        int i17 = ((r45.wp3) fVar).f389366f;
        java.lang.String str = ((r45.wp3) fVar).f389370m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        uk.m a17 = uk.m.a(str);
        uk.l lVar = a17 != null ? (uk.l) ((java.util.HashMap) a17.f428507b).get(k35.o1.a(updater.getContext())) : null;
        if (lVar != null) {
            i17 += lVar.f428505e;
        }
        if (!fp.i.c(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater", "no enough space.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 54L, 1L, true);
            updater.f192327h = false;
        }
        if ((com.tencent.mm.sdk.platformtools.a0.f192438a & 1) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "channel pack, not silence download.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 55L, 1L, true);
            updater.f192327h = false;
        }
        int i18 = updater.f192323d;
        com.tencent.mm.modelbase.o oVar = aVar.f393067d;
        if (i18 == 2 && !updater.f192328i) {
            java.lang.String a18 = s65.o0.a();
            if (com.tencent.mm.sandbox.monitor.l.c(((r45.wp3) oVar.f70711b.f70700a).f389365e, false) != null && !com.tencent.mm.sdk.platformtools.t8.K0(a18) && a18.equals(((r45.wp3) oVar.f70711b.f70700a).f389365e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", a18);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 56L, 1L, true);
                return;
            }
        }
        if (com.tencent.mm.plugin.sandbox.SubCoreSandBox.f158609d) {
            r45.wp3 wp3Var = (r45.wp3) oVar.f70711b.f70700a;
            wp3Var.f389371n = 1;
            wp3Var.f389372o = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
            wp3Var.f389373p = com.tencent.mm.plugin.sandbox.SubCoreSandBox.f158610e ? 1 : 0;
        }
        r45.wp3 wp3Var2 = (r45.wp3) oVar.f70711b.f70700a;
        if (wp3Var2 != null && wp3Var2.f389371n != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(wp3Var2.f389372o)) {
            java.lang.String str2 = wp3Var2.f389372o;
            android.content.Context context = updater.getContext();
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490534xu);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            intent.putExtra("rawUrl", str2);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.setFlags(872415232);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(updater.getContext(), 0, intent, fp.g0.a(268435456));
            z2.k0 k0Var = new z2.k0(updater.getContext(), "reminder_channel_id");
            k0Var.m(null);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f(string);
            k0Var.e("");
            k0Var.f469463g = activity;
            notification.icon = com.tencent.mm.R.drawable.c7v;
            android.app.Notification b17 = k0Var.b();
            b17.flags |= 16;
            ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, b17);
            s65.o0.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 57L, 1L, true);
            return;
        }
        if (updater.f192327h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 58L, 1L, true);
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            s65.r0 r0Var = new s65.r0(this, sVar);
            updater.f192329m = r0Var;
            r1Var.a(725, r0Var);
            gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.q0(0));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "gonna start AppUpdaterUI");
            android.content.Intent intent2 = new android.content.Intent(updater.getContext(), (java.lang.Class<?>) com.tencent.mm.sandbox.updater.AppUpdaterUI.class);
            com.tencent.mm.sandbox.updater.Updater.a(updater, intent2, sVar, aVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "current updateType : %s", java.lang.Integer.valueOf(updater.f192323d));
            if (updater.f192323d == 1) {
                intent2.putExtra("intent_extra_download_mode", 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 60L, 1L, true);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 61L, 1L, true);
                intent2.putExtra("intent_extra_download_mode", 1);
            }
            android.content.Context context2 = updater.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (updater.f192323d != 3) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().r(262145, true);
        }
        com.tencent.mm.pluginsdk.model.app.b.a();
    }
}

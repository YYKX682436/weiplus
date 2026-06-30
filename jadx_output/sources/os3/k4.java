package os3;

/* loaded from: classes8.dex */
public class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348138d;

    public k4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348138d = readMailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348138d;
        int i17 = readMailUI.I;
        if (i17 == 0) {
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI.T6(readMailUI, 11288, 2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f348138d.C) || com.tencent.mm.sdk.platformtools.t8.K0(this.f348138d.D)) {
                com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI2 = this.f348138d;
                readMailUI2.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new os3.b4(readMailUI2), "initQQMailDownloadUrlAndMD5");
            } else {
                com.tencent.mm.plugin.qqmail.ui.ReadMailUI.U6(this.f348138d);
            }
        } else if (i17 == 1) {
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI.T6(readMailUI, 11288, 1);
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", "cancel_download_task:fail_apilevel_too_low downloadId = %d", java.lang.Long.valueOf(this.f348138d.E));
        } else if (i17 == 2) {
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI.T6(readMailUI, 11288, 3);
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI3 = this.f348138d;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "try to install %s", readMailUI3.G);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(readMailUI3.G)) {
                zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                java.lang.String str = readMailUI3.G;
                ((yb0.c) yVar).getClass();
                com.tencent.mm.pluginsdk.model.app.n1.d(readMailUI3, str, null, false);
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI.T6(readMailUI, 11288, 4);
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI4 = this.f348138d;
            readMailUI4.getClass();
            android.content.Intent intent = new android.content.Intent();
            if (com.tencent.mm.sdk.platformtools.t8.K0(readMailUI4.K)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ReadMailUI", "mQQMailSchemeForUnread is null");
                android.content.Intent launchIntentForPackage = readMailUI4.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(launchIntentForPackage);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(readMailUI4, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                readMailUI4.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(readMailUI4, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                intent.setData(android.net.Uri.parse(readMailUI4.K));
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (com.tencent.mm.sdk.platformtools.t8.I0(readMailUI4, intent, false, false)) {
                    p95.a.a(new os3.f4(readMailUI4, intent));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ReadMailUI", "schema failed");
                    p95.a.a(new os3.i4(readMailUI4));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

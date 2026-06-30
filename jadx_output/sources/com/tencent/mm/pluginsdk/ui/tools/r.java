package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191857d;

    public r(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191857d = appChooserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserUI", "mDownloadOnClickListener");
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191857d;
        if (appChooserUI.f191333e != null) {
            com.tencent.mm.pluginsdk.ui.tools.e0 e0Var = appChooserUI.Z6() ? appChooserUI.N : appChooserUI.f191333e.f191500e;
            if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL) {
                com.tencent.mm.pluginsdk.ui.tools.d0 d0Var = appChooserUI.P;
                if (d0Var != null && d0Var.f191551b.isShowing()) {
                    appChooserUI.P.f191551b.dismiss();
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(appChooserUI.f191349w.f())) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(appChooserUI.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
                    intent.putExtra("task_name", appChooserUI.f191349w.c());
                    intent.putExtra("task_download_type", 1);
                    jt.u b17 = appChooserUI.f191349w.b();
                    java.lang.String c17 = appChooserUI.f191349w.c();
                    if (b17.f301591d > 0) {
                        c17 = appChooserUI.getResources().getString(b17.f301591d);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(b17.f301592e)) {
                        c17 = b17.f301592e;
                    }
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, c17);
                    intent.putExtra("icon_res_id", b17.f301588a);
                    if (appChooserUI.f191351y == 1) {
                        intent.putExtra("task_url", "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375");
                    } else {
                        intent.putExtra("task_url", appChooserUI.f191349w.d());
                    }
                    intent.putExtra("fileType", 1);
                    intent.putExtra("package_name", appChooserUI.f191349w.e());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(appChooserUI, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appChooserUI.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(appChooserUI, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", appChooserUI.f191349w.f());
                    j45.l.j(appChooserUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
                }
                com.tencent.mm.pluginsdk.model.z3 a17 = com.tencent.mm.pluginsdk.model.z3.a();
                int i17 = appChooserUI.f191346t;
                a17.getClass();
                if (i17 == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10998, 2);
                } else if (i17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 2);
                }
                if (appChooserUI.f191346t == 0) {
                    if (appChooserUI.K) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11168, 4, java.lang.Integer.valueOf(appChooserUI.f191351y));
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11168, 3, java.lang.Integer.valueOf(appChooserUI.f191351y));
                    }
                }
                if (appChooserUI.f191346t == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 5, "");
                }
            } else if (e0Var == com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED) {
                long j17 = appChooserUI.M;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserUI", "installRecommendApp");
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                java.lang.String str = com.tencent.mm.plugin.downloader.model.r0.i().p(j17).f96964g;
                zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                androidx.appcompat.app.AppCompatActivity context = appChooserUI.getContext();
                com.tencent.mm.pluginsdk.ui.tools.l lVar = new com.tencent.mm.pluginsdk.ui.tools.l(appChooserUI);
                ((yb0.c) yVar).getClass();
                com.tencent.mm.pluginsdk.model.app.n1.d(context, str, lVar, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

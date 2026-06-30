package j44;

/* loaded from: classes4.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f297682d;

    public i(j44.j jVar) {
        this.f297682d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f297682d;
        jVar.l();
        j44.a j17 = jVar.j();
        if (j17 != null) {
            com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            h44.b bVar = downloadHelper.f162641e;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "deleteDownloadingApk, mDownloadParams is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                java.lang.String b17 = bVar.b();
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "deleteDownloadingApk, appId is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                } else {
                    android.content.Context context = downloadHelper.f162640d;
                    if (context != null) {
                        if (downloadHelper.f162653t == null) {
                            downloadHelper.f162653t = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.j6s), false, true, null);
                        }
                        com.tencent.mm.ui.widget.dialog.u3 u3Var = downloadHelper.f162653t;
                        if (u3Var != null) {
                            u3Var.show();
                        }
                    }
                    kotlinx.coroutines.y0 y0Var = downloadHelper.f162648o;
                    if (y0Var != null) {
                        kotlinx.coroutines.z0.c(y0Var, null);
                    }
                    kotlinx.coroutines.y0 b18 = kotlinx.coroutines.z0.b();
                    downloadHelper.f162648o = b18;
                    ku5.f j18 = downloadHelper.j();
                    kotlin.jvm.internal.o.f(j18, "<get-mDownloadExecutorService>(...)");
                    kotlinx.coroutines.l.d(b18, new kotlinx.coroutines.g2(j18).plus(downloadHelper.f162654u), null, new a44.p(b17, downloadHelper, null), 2, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                }
            }
        }
        ca4.d e18 = jVar.e();
        if (e18 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            e18.f39860j = 5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        }
        l44.z.h(jVar.e());
        h44.b f17 = jVar.f();
        a44.m.c((f17 == null || (e17 = f17.e()) == null) ? 0 : e17.intValue(), 11, jVar.f(), null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$8");
    }
}

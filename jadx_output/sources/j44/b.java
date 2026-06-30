package j44;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f297675d;

    public b(j44.j jVar) {
        this.f297675d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f297675d;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i17 = jVar.f297706x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        if (i17 == 0) {
            ca4.d e17 = jVar.e();
            java.util.ArrayList arrayList2 = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                ca4.f fVar = new ca4.f();
                fVar.m(4001070);
                fVar.o(e17.f39851a);
                fVar.f(e17.f39852b);
                fVar.l(e17.f39853c);
                fVar.c(e17.f39854d);
                fVar.p(e17.f39856f);
                fVar.n(e17.f39857g);
                fVar.q(e17.f39858h);
                fVar.k(5);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportHalfScreenBtnClick, exp is " + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        }
        j44.a j17 = jVar.j();
        if (j17 != null) {
            j44.a.a(j17, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$1");
    }
}

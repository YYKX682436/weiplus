package g84;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView f269550d;

    public e(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView) {
        this.f269550d = snsAdConsultBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$resetUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adconsultbar/SnsAdConsultBarView$resetUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mTitle click, current index is ");
        com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView = this.f269550d;
        sb6.append(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.c(snsAdConsultBarView));
        com.tencent.mars.xlog.Log.i("AdConsultBarView", sb6.toString());
        s34.g gVar = (s34.g) ((java.util.ArrayList) com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.b(snsAdConsultBarView)).get(com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.c(snsAdConsultBarView));
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo b17 = gVar.b();
        if (b17 != null) {
            b17.f162569a = 25;
        }
        w64.n a17 = com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.a(snsAdConsultBarView);
        if (a17 != null) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo b18 = gVar.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsAdConsultBarView.f163284r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            a17.p(new w64.c(b18, snsInfo, com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.c(snsAdConsultBarView), null, false, 0, false, null, 248, null));
        }
        w64.n a18 = com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView.a(snsAdConsultBarView);
        if (a18 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTitleContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            com.tencent.mm.plugin.sns.ad.widget.adconsultbar.ConsultAlphaContainer consultAlphaContainer = snsAdConsultBarView.f163277h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTitleContainer$p", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView");
            a18.k(consultAlphaContainer);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adconsultbar/SnsAdConsultBarView$resetUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$resetUI$2");
    }
}

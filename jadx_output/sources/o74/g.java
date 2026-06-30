package o74;

/* loaded from: classes4.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o74.j f343569d;

    public g(o74.j jVar) {
        this.f343569d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        o74.j jVar = this.f343569d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "ProxySightClickListener onClick");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            com.tencent.mm.plugin.sns.ui.bs bsVar = jVar.f169251h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (bsVar.f168036b.k() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                com.tencent.mm.plugin.sns.ui.bs bsVar2 = jVar.f169251h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                bsVar2.f168039e.f169797J.onClick(view);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                com.tencent.mm.plugin.sns.ui.bs bsVar3 = jVar.f169251h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                if (bsVar3.f168036b.k() == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    com.tencent.mm.plugin.sns.ui.bs bsVar4 = jVar.f169251h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    bsVar4.f168039e.f169797J.onClick(view);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            jVar.f343573s = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "ProxySightClickListener onClick, exp=" + e17.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$3");
    }
}

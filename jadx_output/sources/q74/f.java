package q74;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f360455d;

    public f(q74.t tVar) {
        this.f360455d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.storage.ADXml adXml2;
        s34.a1 a1Var2;
        s34.z0 z0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        q74.t tVar = this.f360455d;
        com.tencent.mm.plugin.sns.storage.SnsInfo j17 = q74.t.j(tVar);
        java.util.List<s34.x0> list = null;
        java.util.List c17 = (j17 == null || (adXml2 = j17.getAdXml()) == null || (a1Var2 = adXml2.adSliderFullCardInfo) == null || (z0Var = a1Var2.f402569f) == null) ? null : z0Var.c();
        boolean z17 = c17 == null || c17.isEmpty();
        z84.h hVar = tVar.f360522d;
        if (!z17 && q74.t.e(tVar) < c17.size() && ((s34.o1) c17.get(q74.t.e(tVar))).a() != null) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = ((s34.o1) c17.get(q74.t.e(tVar))).a();
            if (a17 != null) {
                a17.f162569a = 24;
            }
            w64.n u17 = tVar.u();
            if (u17 != null) {
                u17.o(a17, q74.t.j(tVar), q74.t.e(tVar));
            }
            w64.n u18 = tVar.u();
            if (u18 != null) {
                u18.k(view);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            if (hVar != null) {
                hVar.f(view, q74.t.e(tVar));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo j18 = q74.t.j(tVar);
        if (j18 != null && (adXml = j18.getAdXml()) != null && (a1Var = adXml.adSliderFullCardInfo) != null) {
            list = a1Var.resInfoList;
        }
        if (list == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("AdSlideProductItemViewLogic", "doClick adSliderFullCardInfoList is empty");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        s34.x0 x0Var = list.get(q74.t.e(tVar));
        if (x0Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = x0Var.clickActionInfo;
        if (adClickActionInfo == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
            return;
        }
        adClickActionInfo.f162569a = 24;
        w64.n u19 = tVar.u();
        if (u19 != null) {
            u19.o(adClickActionInfo, q74.t.j(tVar), q74.t.e(tVar));
        }
        w64.n u27 = tVar.u();
        if (u27 != null) {
            u27.k(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMProductItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (hVar != null) {
            hVar.f(view, q74.t.e(tVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$1");
    }
}

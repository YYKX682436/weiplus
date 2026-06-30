package s74;

/* loaded from: classes4.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404343g;

    public i0(s74.f3 f3Var, s74.o0 o0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, org.json.JSONObject jSONObject) {
        this.f404340d = f3Var;
        this.f404341e = o0Var;
        this.f404342f = snsInfo;
        this.f404343g = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.f3 f3Var = this.f404340d;
        s34.e eVar = f3Var.e().f289288b.adConsultBarCarouselInfo;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = null;
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdConsultBarInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdConsultBarInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarCarouselInfo");
            list = eVar.f402621b;
        } else {
            list = null;
        }
        int i17 = 0;
        if (list == null || list.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
            return;
        }
        s74.o0 o0Var = this.f404341e;
        w64.n nVar = new w64.n(o0Var.E(), o0Var.H(), o0Var.G(), null, null);
        l44.k4 k4Var = l44.k4.f316220a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404342f;
        com.tencent.mm.plugin.sns.ui.listener.i f17 = o0Var.C().f();
        kz5.p0 p0Var = kz5.p0.f313996d;
        nVar.x(l44.k4.c(k4Var, snsInfo, 1, f17, null, p0Var, p0Var, null, null, 128, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i18 = f3Var.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (i18 < list.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            i17 = f3Var.W;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentClickIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        }
        org.json.JSONObject jSONObject = this.f404343g;
        if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "consultBarTitleClick")) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo b17 = ((s34.g) list.get(i17)).b();
            if (b17 != null) {
                b17.f162569a = 25;
            }
            adClickActionInfo = ((s34.g) list.get(i17)).b();
        } else if (kotlin.jvm.internal.o.b(jSONObject.optString("click-type"), "consultBarButtonClick")) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = ((s34.g) list.get(i17)).a();
            if (a17 != null) {
                a17.f162569a = 26;
            }
            adClickActionInfo = ((s34.g) list.get(i17)).a();
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = adClickActionInfo;
        if (adClickActionInfo2 != null) {
            nVar.p(new w64.c(adClickActionInfo2, this.f404342f, 0, null, false, 0, false, null, 248, null));
            nVar.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$9");
    }
}

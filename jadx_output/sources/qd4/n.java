package qd4;

/* loaded from: classes15.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd4.r f361874d;

    public n(qd4.r rVar) {
        this.f361874d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object child;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd4.q qVar = (view.getTag() == null || !(view.getTag() instanceof qd4.q)) ? null : (qd4.q) view.getTag();
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        qd4.r rVar = this.f361874d;
        qd4.p pVar = rVar.f361901v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (pVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            qd4.p pVar2 = rVar.f361901v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            qd4.d dVar = (qd4.d) pVar2;
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
            int i17 = qVar.f361881a;
            int i18 = qVar.f361882b;
            int i19 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = dVar.f361862a;
            jsapiSnsLabelUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            qd4.r rVar2 = jsapiSnsLabelUI.f169549p;
            if (rVar2 != null && (child = rVar2.getChild(i17, i18)) != null && (child instanceof java.lang.String)) {
                java.lang.String str = (java.lang.String) child;
                java.lang.String e17 = ((b93.b) c93.a.a()).e(str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("label_id", e17);
                intent.putExtra("label_name", str);
                intent.putExtra("is_show_delete", false);
                j45.l.n(jsapiSnsLabelUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
    }
}

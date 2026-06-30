package n44;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.r f335022d;

    public q(n44.r rVar) {
        this.f335022d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper$createHalfScreen$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper$createHalfScreen$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("AdHalfScreenKefuConfirmHelper", "do click, jump to kefu page");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        n44.r rVar = this.f335022d;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 100);
        i64.z g17 = rVar.g();
        if (g17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            i17 = g17.f289368f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            i17 = 0;
        }
        int i18 = i17 == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        i64.z g18 = rVar.g();
        if (g18 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            obj = g18.f289366d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            obj = null;
        }
        jSONObject.put("uxinfo", obj);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", 1554);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_customer_service_confirm_click_report", jSONObject3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper");
        x64.u uVar = x64.u.f452333a;
        i64.z g19 = rVar.g();
        if (g19 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            str = g19.f289381s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpKefuUrl", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            str = null;
        }
        i64.z g27 = rVar.g();
        if (g27 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
            str2 = g27.f289366d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        } else {
            str2 = null;
        }
        android.view.View h17 = rVar.h();
        uVar.d(str, str2, h17 != null ? h17.getContext() : null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenKefuConfirmHelper$createHalfScreen$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenKefuConfirmHelper$createHalfScreen$1");
    }
}

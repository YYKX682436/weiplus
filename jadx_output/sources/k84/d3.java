package k84;

/* loaded from: classes4.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f304995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304996e;

    public d3(k84.d4 d4Var, android.content.Context context) {
        this.f304995d = d4Var;
        this.f304996e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setUIForNoAnim$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$setUIForNoAnim$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k84.d4 d4Var = this.f304995d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) d4Var.i();
        java.lang.Object t07 = ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        i64.b1 b1Var = d4Var.f305004u;
        int i17 = b1Var != null && b1Var.f289095j == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", t07);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) d4Var.i();
        jSONObject.put("uxinfo", snsInfo2 != null ? snsInfo2.getUxinfo() : null);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", 1417);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_firework_cheer_btn_clk_report", jSONObject3);
        if (d4Var.T() != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.tencent.mm.plugin.sns.ui.bs bsVar = d4Var.f305006w;
            if (bsVar != null && (l1Var = bsVar.f168036b) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder T = d4Var.T();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                l1Var.h(T, bsVar.c(d4Var.T().f169262c), new r45.e86());
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", 16391);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 1);
        android.content.Context context = this.f304996e;
        intent.putExtra("titile", context.getString(com.tencent.mm.R.string.j6l));
        j45.l.v(context, ".ui.contact.SelectContactUI", intent, 2333);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$setUIForNoAnim$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setUIForNoAnim$1");
    }
}

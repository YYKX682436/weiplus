package gd4;

/* loaded from: classes4.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270596d;

    public a1(gd4.c2 c2Var) {
        this.f270596d = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gd4.c2 c2Var = this.f270596d;
        i64.b1 h17 = c2Var.h();
        int i17 = (h17 != null ? h17.f289095j : 0) == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", ca4.z0.t0(c2Var.i().field_snsId));
        jSONObject.put("uxinfo", c2Var.i().getUxinfo());
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        java.lang.String str = c2Var.i().getAdXml().adExtInfo;
        if (str == null) {
            str = "";
        }
        jSONObject.put("adExtInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
        com.tencent.mars.xlog.Log.i("IpInteractScheduleVideoController", "sns_ad_ip_interact_tag_click_report:".concat(jSONObject2));
        ca4.m0.a("sns_ad_ip_interact_tag_click_report", jSONObject2);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
    }
}

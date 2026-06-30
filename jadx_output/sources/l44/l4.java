package l44;

/* loaded from: classes4.dex */
public class l4 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f316240a;

    public l4(java.util.List list) {
        this.f316240a = list;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        try {
            jSONObject.putOpt("snsId", "");
            jSONObject.putOpt("uxinfo", "");
            jSONObject.putOpt("adExtInfo", "");
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        java.util.List list = this.f316240a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        if (a84.b0.b(list)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONObject.putOpt("totalCount", java.lang.Integer.valueOf(list.size()));
        jSONObject.putOpt("reportItemList", jSONArray);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            c(jSONArray, (l44.n4) it.next());
            i17++;
            if (i17 >= 10) {
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    public final void c(org.json.JSONArray jSONArray, l44.n4 n4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        if (n4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("snsId", ca4.z0.t0(n4Var.f316277b));
            jSONObject.putOpt("reserveSnsId", ca4.z0.t0(n4Var.f316276a));
            jSONArray.put(jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        return "sns_ad_remove_consecutive_ad_report";
    }
}

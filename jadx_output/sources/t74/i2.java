package t74;

/* loaded from: classes4.dex */
public final class i2 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f416158a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f416159b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f416160c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416161d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f416162e;

    /* renamed from: f, reason: collision with root package name */
    public int f416163f;

    /* renamed from: g, reason: collision with root package name */
    public int f416164g;

    /* renamed from: h, reason: collision with root package name */
    public int f416165h;

    /* renamed from: i, reason: collision with root package name */
    public final t74.h2 f416166i;

    /* renamed from: j, reason: collision with root package name */
    public final t74.h2 f416167j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f416168k;

    public i2() {
        t74.h2 h2Var = new t74.h2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        h2Var.f416148a = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f416166i = h2Var;
        t74.h2 h2Var2 = new t74.h2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        h2Var2.f416148a = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f416167j = h2Var2;
        this.f416168k = new java.util.ArrayList();
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f416159b);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f416160c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f416161d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f416158a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (jSONObject != null) {
            jSONObject.putOpt("touchCount", java.lang.Integer.valueOf(this.f416162e));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("flipCount", java.lang.Integer.valueOf(this.f416163f));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("cardClickCount", java.lang.Integer.valueOf(this.f416164g));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("learnMoreClickCount", java.lang.Integer.valueOf(this.f416165h));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillReportItemListJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f416168k;
        if (!arrayList.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t74.h2 h2Var = (t74.h2) it.next();
                h2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                try {
                    jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt(ya.b.INDEX, java.lang.Integer.valueOf(h2Var.f416148a));
                    jSONObject2.putOpt(dm.n.COL_EXPOSURECOUNT, java.lang.Integer.valueOf(h2Var.f416149b));
                    jSONObject2.putOpt("playCount", java.lang.Integer.valueOf(h2Var.f416150c));
                    jSONObject2.putOpt("finishPlayCount", java.lang.Integer.valueOf(h2Var.f416151d));
                    jSONObject2.putOpt("playTotalTime", java.lang.Integer.valueOf(h2Var.f416152e + h2Var.f416154g));
                    jSONObject2.putOpt("videoTotalTime", java.lang.Integer.valueOf(h2Var.f416153f));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.e("FlipCardAdChannelData", "fillReportItemListJsonArray, but jsonArray length less than 1");
            } else if (jSONObject != null) {
                jSONObject.putOpt("reportItemList", jSONArray);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillReportItemListJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (i17 == 0) {
            t74.h2 h2Var = this.f416166i;
            h2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            int i18 = h2Var.f416149b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            h2Var.f416149b = i18 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        } else {
            t74.h2 h2Var2 = this.f416167j;
            h2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            int i19 = h2Var2.f416149b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            h2Var2.f416149b = i19 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFlipCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        this.f416163f++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFlipCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (i17 == 0) {
            t74.h2 h2Var = this.f416166i;
            h2Var.d(h2Var.b() + h2Var.a());
            h2Var.c(0);
        } else {
            t74.h2 h2Var2 = this.f416167j;
            h2Var2.d(h2Var2.b() + h2Var2.a());
            h2Var2.c(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        return "sns_ad_flip_card_report";
    }
}

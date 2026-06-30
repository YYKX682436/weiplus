package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class c implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f162767a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f162768b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f162769c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f162771e;

    /* renamed from: f, reason: collision with root package name */
    public final int f162772f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f162773g;

    /* renamed from: h, reason: collision with root package name */
    public int f162774h;

    /* renamed from: i, reason: collision with root package name */
    public final int f162775i;

    public c(int i17, java.lang.String str) {
        this.f162775i = -1;
        this.f162772f = i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f162773g = str == null ? "" : str;
    }

    public final void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("appId", this.f162770d);
                jSONObject.putOpt("stockId", this.f162771e);
                jSONObject.putOpt("result", java.lang.Integer.valueOf(this.f162772f));
                jSONObject.putOpt("msg", this.f162773g);
                jSONObject.putOpt(ya.b.SOURCE, java.lang.Integer.valueOf(this.f162774h));
                jSONObject.putOpt("actionType", java.lang.Integer.valueOf(this.f162775i));
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExt", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        return "sns_ad_native_landing_page_coupon";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        try {
            jSONObject.putOpt("snsid", this.f162767a);
            jSONObject.putOpt("uxinfo", this.f162768b);
            jSONObject.putOpt("adExtInfo", this.f162769c);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.putOpt("extInfo", jSONObject2);
            a(jSONObject2);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        java.lang.String jSONObject3 = jSONObject.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
        return jSONObject3;
    }

    public c(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f fVar, int i17, java.lang.String str, int i18) {
        java.lang.String str2;
        this.f162775i = -1;
        if (fVar != null) {
            ab4.n0 u17 = fVar.u();
            if (u17 != null) {
                java.lang.String k17 = u17.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                try {
                    str2 = ca4.z0.t0(ca4.m0.D0(k17));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$AdCouponChannelReportData");
                    str2 = "";
                }
                this.f162767a = str2;
                java.lang.String a17 = u17.a();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f162769c = a17 == null ? "" : a17;
                java.lang.String n17 = u17.n();
                n17 = n17 == null ? "" : n17;
                this.f162768b = n17;
                if (android.text.TextUtils.isEmpty(n17)) {
                    java.lang.String o17 = u17.o();
                    this.f162768b = o17 == null ? "" : o17;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            f54.b bVar = fVar.B;
            if (bVar != null) {
                this.f162770d = bVar.f259699z1;
                this.f162771e = bVar.A1;
            }
        }
        this.f162774h = 0;
        this.f162772f = i17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f162773g = str == null ? "" : str;
        this.f162775i = i18;
    }
}

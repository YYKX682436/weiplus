package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f163668a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f163669b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f163670c;

    /* renamed from: d, reason: collision with root package name */
    public int f163671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f163672e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f163673f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f163674g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f163675h;

    /* renamed from: i, reason: collision with root package name */
    public int f163676i;

    /* renamed from: j, reason: collision with root package name */
    public int f163677j;

    /* renamed from: k, reason: collision with root package name */
    public int f163678k;

    /* renamed from: l, reason: collision with root package name */
    public int f163679l;

    /* renamed from: m, reason: collision with root package name */
    public int f163680m;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f163668a);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f163669b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f163670c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f163671d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("totalPlayTime", this.f163672e);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveFlag", this.f163673f);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveStartTimestamp", this.f163674g);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveEndTimestamp", this.f163675h);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("displayType", java.lang.Integer.valueOf(this.f163676i));
        }
        if (this.f163676i == 1) {
            if (jSONObject != null) {
                jSONObject.putOpt("showFrontImage", java.lang.Integer.valueOf(this.f163677j));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("showBrandWallpaperImage", java.lang.Integer.valueOf(this.f163678k));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("horizontalGravity", java.lang.Integer.valueOf(this.f163679l));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("verticalGravity", java.lang.Integer.valueOf(this.f163680m));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        return "sns_ad_finder_live_stream_report";
    }
}

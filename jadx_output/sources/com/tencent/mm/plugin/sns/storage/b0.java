package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.a0 f165930i = new com.tencent.mm.plugin.sns.storage.a0(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f165931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f165932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f165933c;

    @za4.k1(resType = 5)
    private final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public final int f165934d;

    /* renamed from: e, reason: collision with root package name */
    public final float f165935e;

    /* renamed from: f, reason: collision with root package name */
    public final float f165936f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f165937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f165938h;

    public b0(int i17, int i18, int i19, int i27, float f17, float f18, boolean z17, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i28) {
        this.f165931a = i17;
        this.f165932b = i18;
        this.f165933c = i19;
        this.f165934d = i27;
        this.f165935e = f17;
        this.f165936f = f18;
        this.f165937g = z17;
        this.clickActionInfo = adClickActionInfo;
        this.f165938h = i28;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        return adClickActionInfo;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[l=");
        sb6.append(this.f165931a);
        sb6.append(", t=");
        sb6.append(this.f165932b);
        sb6.append(", w=");
        sb6.append(this.f165933c);
        sb6.append(", h=");
        sb6.append(this.f165934d);
        sb6.append(", time=[");
        sb6.append(this.f165935e);
        sb6.append(", ");
        sb6.append(this.f165936f);
        sb6.append("], forbidClick=");
        sb6.append(this.f165937g);
        sb6.append(", clickType=");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        sb6.append(adClickActionInfo != null ? java.lang.Integer.valueOf(adClickActionInfo.f162571b) : null);
        sb6.append(", clickReportIndex=");
        sb6.append(this.f165938h);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        return sb7;
    }
}

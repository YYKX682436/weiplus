package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f163097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f163098b;

    public h0() {
        this.f163097a = "";
        this.f163098b = "";
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$SelectCardInfo");
        java.lang.String str = "[cardId=" + this.f163097a + ", cardExtInfo=" + this.f163098b + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$SelectCardInfo");
        return str;
    }

    public h0(java.lang.String str, java.lang.String str2) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f163097a = str == null ? "" : str;
        this.f163098b = str2 == null ? "" : str2;
    }
}

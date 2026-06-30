package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public long f162929a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f162930b;

    /* renamed from: c, reason: collision with root package name */
    public int f162931c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f162932d;

    public r1(long j17, java.lang.String finderJumpId, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        finderJumpId = (i18 & 2) != 0 ? "" : finderJumpId;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        z17 = (i18 & 8) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(finderJumpId, "finderJumpId");
        this.f162929a = j17;
        this.f162930b = finderJumpId;
        this.f162931c = i17;
        this.f162932d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1 r1Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r1) obj;
        if (this.f162929a != r1Var.f162929a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f162930b, r1Var.f162930b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        if (this.f162931c != r1Var.f162931c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        boolean z17 = this.f162932d;
        boolean z18 = r1Var.f162932d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        int hashCode = (((((java.lang.Long.hashCode(this.f162929a) * 31) + this.f162930b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f162931c)) * 31) + java.lang.Boolean.hashCode(this.f162932d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        java.lang.String str = "FinderConfig(finderFeedId=" + this.f162929a + ", finderJumpId=" + this.f162930b + ", finderCommentScene=" + this.f162931c + ", isFinderEnableBulletComment=" + this.f162932d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return str;
    }
}

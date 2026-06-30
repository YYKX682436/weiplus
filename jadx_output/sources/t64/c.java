package t64;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f416014a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdSnsInfo f416015b;

    /* renamed from: c, reason: collision with root package name */
    public final r34.b f416016c;

    public c(int i17, com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, r34.b adRecord) {
        kotlin.jvm.internal.o.g(adSnsInfo, "adSnsInfo");
        kotlin.jvm.internal.o.g(adRecord, "adRecord");
        this.f416014a = i17;
        this.f416015b = adSnsInfo;
        this.f416016c = adRecord;
    }

    public final com.tencent.mm.plugin.sns.storage.AdSnsInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return this.f416015b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return true;
        }
        if (!(obj instanceof t64.c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        t64.c cVar = (t64.c) obj;
        if (this.f416014a != cVar.f416014a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f416015b, cVar.f416015b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f416016c, cVar.f416016c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f416014a) * 31) + this.f416015b.hashCode()) * 31) + this.f416016c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        java.lang.String str = "AdSwapChangeInfo(createTime=" + this.f416014a + ", adSnsInfo=" + this.f416015b + ", adRecord=" + this.f416016c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return str;
    }
}

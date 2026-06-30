package t54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f415842a;

    /* renamed from: b, reason: collision with root package name */
    public int f415843b;

    /* renamed from: c, reason: collision with root package name */
    public int f415844c;

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f415843b = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f415842a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f415844c = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        boolean z17 = false;
        if (obj instanceof t54.b) {
            t54.b bVar = (t54.b) obj;
            if (bVar.f415842a == this.f415842a && bVar.f415843b == this.f415843b && bVar.f415844c == this.f415844c) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        int i17 = this.f415842a + this.f415843b + this.f415844c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return i17;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        java.lang.String str = "[nodeType=" + this.f415842a + ",compType=" + this.f415843b + ",subCompType=" + this.f415844c + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return str;
    }
}

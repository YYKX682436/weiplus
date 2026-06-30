package za4;

/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public int f471228a;

    /* renamed from: b, reason: collision with root package name */
    public int f471229b;

    /* renamed from: c, reason: collision with root package name */
    public int f471230c;

    public y0(za4.u0 u0Var) {
    }

    public static /* synthetic */ int a(za4.y0 y0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        y0Var.f471228a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return i17;
    }

    public static /* synthetic */ int b(za4.y0 y0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        y0Var.f471229b = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return i17;
    }

    public static /* synthetic */ int c(za4.y0 y0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        y0Var.f471230c = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return i17;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        boolean z17 = false;
        if (!(obj instanceof za4.y0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return false;
        }
        za4.y0 y0Var = (za4.y0) obj;
        if (y0Var.f471228a == this.f471228a && y0Var.f471229b == this.f471229b && y0Var.f471230c == this.f471230c) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        int i17 = this.f471228a + this.f471229b + this.f471230c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return i17;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        java.lang.String str = "[nodeType=" + this.f471228a + ",compType=" + this.f471229b + ",subCompType=" + this.f471230c + "]";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
        return str;
    }
}

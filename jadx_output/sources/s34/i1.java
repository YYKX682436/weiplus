package s34;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final s34.h1 f402669c = new s34.h1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402670a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402671b;

    public i1(java.lang.String color, java.lang.String colorDark) {
        kotlin.jvm.internal.o.g(color, "color");
        kotlin.jvm.internal.o.g(colorDark, "colorDark");
        this.f402670a = color;
        this.f402671b = colorDark;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return true;
        }
        if (!(obj instanceof s34.i1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return false;
        }
        s34.i1 i1Var = (s34.i1) obj;
        if (!kotlin.jvm.internal.o.b(this.f402670a, i1Var.f402670a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f402671b, i1Var.f402671b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        int hashCode = (this.f402670a.hashCode() * 31) + this.f402671b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        java.lang.String str = "ColorInfo(color=" + this.f402670a + ", colorDark=" + this.f402671b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return str;
    }

    public /* synthetic */ i1(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2);
    }
}

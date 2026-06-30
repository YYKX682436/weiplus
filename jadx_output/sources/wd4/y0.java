package wd4;

/* loaded from: classes11.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f445062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f445064c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445065d;

    public y0(int i17, int i18, int i19, java.lang.String rawName) {
        kotlin.jvm.internal.o.g(rawName, "rawName");
        this.f445062a = i17;
        this.f445063b = i18;
        this.f445064c = i19;
        this.f445065d = rawName;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return true;
        }
        if (!(obj instanceof wd4.y0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        wd4.y0 y0Var = (wd4.y0) obj;
        if (this.f445062a != y0Var.f445062a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        if (this.f445063b != y0Var.f445063b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        if (this.f445064c != y0Var.f445064c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f445065d, y0Var.f445065d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        int hashCode = (((((java.lang.Integer.hashCode(this.f445062a) * 31) + java.lang.Integer.hashCode(this.f445063b)) * 31) + java.lang.Integer.hashCode(this.f445064c)) * 31) + this.f445065d.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        java.lang.String str = "MenuItem(nameResId=" + this.f445062a + ", rawResId=" + this.f445063b + ", colorResId=" + this.f445064c + ", rawName=" + this.f445065d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return str;
    }

    public /* synthetic */ y0(int i17, int i18, int i19, java.lang.String str, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, (i27 & 2) != 0 ? -1 : i18, (i27 & 4) != 0 ? -1 : i19, (i27 & 8) != 0 ? "" : str);
    }
}

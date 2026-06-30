package zd4;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f471641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f471642b;

    /* renamed from: c, reason: collision with root package name */
    public final int f471643c;

    /* renamed from: d, reason: collision with root package name */
    public final int f471644d;

    public q(int i17, int i18, int i19, int i27) {
        this.f471641a = i17;
        this.f471642b = i18;
        this.f471643c = i19;
        this.f471644d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return true;
        }
        if (!(obj instanceof zd4.q)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        zd4.q qVar = (zd4.q) obj;
        if (this.f471641a != qVar.f471641a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        if (this.f471642b != qVar.f471642b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        if (this.f471643c != qVar.f471643c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        int i17 = this.f471644d;
        int i18 = qVar.f471644d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        int hashCode = (((((java.lang.Integer.hashCode(this.f471641a) * 31) + java.lang.Integer.hashCode(this.f471642b)) * 31) + java.lang.Integer.hashCode(this.f471643c)) * 31) + java.lang.Integer.hashCode(this.f471644d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        java.lang.String str = "SelectVisibleGroupChildConfigItem(visibleState=" + this.f471641a + ", childKey=" + this.f471642b + ", titleResId=" + this.f471643c + ", subTitleResId=" + this.f471644d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return str;
    }
}

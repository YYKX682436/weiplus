package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f171134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f171135b;

    /* renamed from: c, reason: collision with root package name */
    public int f171136c;

    /* renamed from: d, reason: collision with root package name */
    public int f171137d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171138e;

    /* renamed from: f, reason: collision with root package name */
    public int f171139f;

    /* renamed from: g, reason: collision with root package name */
    public int f171140g;

    public g1(java.lang.String cmtId, int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        i17 = (i37 & 2) != 0 ? 0 : i17;
        i18 = (i37 & 4) != 0 ? 0 : i18;
        i19 = (i37 & 8) != 0 ? 0 : i19;
        i28 = (i37 & 32) != 0 ? 0 : i28;
        i29 = (i37 & 64) != 0 ? 0 : i29;
        kotlin.jvm.internal.o.g(cmtId, "cmtId");
        this.f171134a = cmtId;
        this.f171135b = i17;
        this.f171136c = i18;
        this.f171137d = i19;
        this.f171138e = i27;
        this.f171139f = i28;
        this.f171140g = i29;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.widget.g1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.widget.g1 g1Var = (com.tencent.mm.plugin.sns.ui.widget.g1) obj;
        if (!kotlin.jvm.internal.o.b(this.f171134a, g1Var.f171134a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        if (this.f171135b != g1Var.f171135b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        if (this.f171136c != g1Var.f171136c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        if (this.f171137d != g1Var.f171137d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        if (this.f171138e != g1Var.f171138e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        if (this.f171139f != g1Var.f171139f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            return false;
        }
        int i17 = this.f171140g;
        int i18 = g1Var.f171140g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        int hashCode = (((((((((((this.f171134a.hashCode() * 31) + java.lang.Integer.hashCode(this.f171135b)) * 31) + java.lang.Integer.hashCode(this.f171136c)) * 31) + java.lang.Integer.hashCode(this.f171137d)) * 31) + java.lang.Integer.hashCode(this.f171138e)) * 31) + java.lang.Integer.hashCode(this.f171139f)) * 31) + java.lang.Integer.hashCode(this.f171140g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        java.lang.String str = "SnsCmtReportItem(cmtId=" + this.f171134a + ", contentLength=" + this.f171135b + ", expCnt=" + this.f171136c + ", clkCnt=" + this.f171137d + ", cmtType=" + this.f171138e + ", clkEmoCnt=" + this.f171139f + ", clkPicCnt=" + this.f171140g + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        return str;
    }
}

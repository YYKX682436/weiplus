package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f171375a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f171376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171377c;

    /* renamed from: d, reason: collision with root package name */
    public final long f171378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171379e;

    public g1(boolean z17, java.util.List requestSnsIdList, int i17, long j17, int i18) {
        kotlin.jvm.internal.o.g(requestSnsIdList, "requestSnsIdList");
        this.f171375a = z17;
        this.f171376b = requestSnsIdList;
        this.f171377c = i17;
        this.f171378d = j17;
        this.f171379e = i18;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestSnsIdList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestSnsIdList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        return this.f171376b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.wsfold.g1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.wsfold.g1 g1Var = (com.tencent.mm.plugin.sns.ui.wsfold.g1) obj;
        if (this.f171375a != g1Var.f171375a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f171376b, g1Var.f171376b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return false;
        }
        if (this.f171377c != g1Var.f171377c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return false;
        }
        if (this.f171378d != g1Var.f171378d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
            return false;
        }
        int i17 = this.f171379e;
        int i18 = g1Var.f171379e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        int hashCode = (((((((java.lang.Boolean.hashCode(this.f171375a) * 31) + this.f171376b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f171377c)) * 31) + java.lang.Long.hashCode(this.f171378d)) * 31) + java.lang.Integer.hashCode(this.f171379e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        java.lang.String str = "SnsWsFoldRequestData(continueFlag=" + this.f171375a + ", requestSnsIdList=" + this.f171376b + ", pageIndex=" + this.f171377c + ", groupId=" + this.f171378d + ", totalFeedSize=" + this.f171379e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldRequestData");
        return str;
    }
}

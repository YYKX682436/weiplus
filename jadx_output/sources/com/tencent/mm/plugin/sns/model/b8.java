package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class b8 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.a8 f164102g = new com.tencent.mm.plugin.sns.model.a8(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164103a;

    /* renamed from: b, reason: collision with root package name */
    public long f164104b;

    /* renamed from: c, reason: collision with root package name */
    public long f164105c;

    /* renamed from: d, reason: collision with root package name */
    public int f164106d;

    /* renamed from: e, reason: collision with root package name */
    public long f164107e;

    /* renamed from: f, reason: collision with root package name */
    public int f164108f;

    public b8(java.lang.String userName, long j17, long j18, int i17, long j19, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f164103a = userName;
        this.f164104b = j17;
        this.f164105c = j18;
        this.f164106d = i17;
        this.f164107e = j19;
        this.f164108f = i18;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        int i17 = this.f164106d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return i17;
    }

    public final long b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        long j17 = this.f164104b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return j17;
    }

    public final void c(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f164104b = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReportScene", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f164108f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReportScene", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public final void e(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f164107e = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.sns.model.b8)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        com.tencent.mm.plugin.sns.model.b8 b8Var = (com.tencent.mm.plugin.sns.model.b8) obj;
        if (!kotlin.jvm.internal.o.b(this.f164103a, b8Var.f164103a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f164104b != b8Var.f164104b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f164105c != b8Var.f164105c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f164106d != b8Var.f164106d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f164107e != b8Var.f164107e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        int i17 = this.f164108f;
        int i18 = b8Var.f164108f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        int hashCode = (((((((((this.f164103a.hashCode() * 31) + java.lang.Long.hashCode(this.f164104b)) * 31) + java.lang.Long.hashCode(this.f164105c)) * 31) + java.lang.Integer.hashCode(this.f164106d)) * 31) + java.lang.Long.hashCode(this.f164107e)) * 31) + java.lang.Integer.hashCode(this.f164108f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        java.lang.String str = this.f164103a + ',' + this.f164104b + ',' + this.f164105c + ',' + this.f164106d + ',' + this.f164107e + ',' + this.f164108f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return str;
    }
}

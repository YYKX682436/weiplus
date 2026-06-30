package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164616a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164617b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164618c;

    /* renamed from: d, reason: collision with root package name */
    public int f164619d;

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
        if (!(obj instanceof com.tencent.mm.plugin.sns.model.q6)) {
            boolean equals = super.equals(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
            return equals;
        }
        com.tencent.mm.plugin.sns.model.q6 q6Var = (com.tencent.mm.plugin.sns.model.q6) obj;
        if (this.f164616a.equals(q6Var.f164616a) && this.f164619d == q6Var.f164619d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
        return false;
    }
}

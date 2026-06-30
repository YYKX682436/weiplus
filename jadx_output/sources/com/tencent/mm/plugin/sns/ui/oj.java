package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oj {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f170102a;

    /* renamed from: b, reason: collision with root package name */
    public int f170103b;

    /* renamed from: c, reason: collision with root package name */
    public int f170104c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f170105d;

    /* renamed from: e, reason: collision with root package name */
    public int f170106e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f170107f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.v1 f170108g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.jw f170109h;

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        this.f170107f = 0L;
        this.f170106e = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        if (!(obj instanceof com.tencent.mm.plugin.sns.ui.oj)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.v1 v1Var = this.f170108g;
        if (v1Var != null) {
            boolean equals = v1Var.equals(((com.tencent.mm.plugin.sns.ui.oj) obj).f170108g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            return equals;
        }
        if (android.text.TextUtils.isEmpty(this.f170102a)) {
            boolean equals2 = super.equals(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            return equals2;
        }
        boolean equals3 = this.f170102a.equals(((com.tencent.mm.plugin.sns.ui.oj) obj).f170102a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        return equals3;
    }
}

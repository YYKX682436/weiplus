package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164087c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f164088d;

    public b2(java.lang.String str, int i17, int i18, boolean z17) {
        this.f164085a = str;
        this.f164086b = i17;
        this.f164087c = i18;
        this.f164088d = z17;
    }

    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        return this.f164086b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        boolean z17 = false;
        if (obj != null && obj.hashCode() == this.f164086b) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
        return this.f164086b;
    }
}

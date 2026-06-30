package oc4;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f344358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344359b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344360c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344361d;

    /* renamed from: e, reason: collision with root package name */
    public final long f344362e;

    /* renamed from: f, reason: collision with root package name */
    public final long f344363f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344364g;

    /* renamed from: h, reason: collision with root package name */
    public final long f344365h;

    public r(boolean z17, long j17, long j18, long j19, long j27, long j28, long j29, int i17, long j37) {
        this.f344358a = j17;
        this.f344359b = j18;
        this.f344360c = j19;
        this.f344361d = j27;
        this.f344362e = j28;
        this.f344363f = j29;
        this.f344364g = i17;
        this.f344365h = j37;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return true;
        }
        if (!(obj instanceof oc4.r)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        oc4.r rVar = (oc4.r) obj;
        rVar.getClass();
        if (this.f344358a != rVar.f344358a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344359b != rVar.f344359b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344360c != rVar.f344360c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344361d != rVar.f344361d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344362e != rVar.f344362e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344363f != rVar.f344363f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        if (this.f344364g != rVar.f344364g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            return false;
        }
        long j17 = this.f344365h;
        long j18 = rVar.f344365h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        int hashCode = (((((((((((((((java.lang.Boolean.hashCode(true) * 31) + java.lang.Long.hashCode(this.f344358a)) * 31) + java.lang.Long.hashCode(this.f344359b)) * 31) + java.lang.Long.hashCode(this.f344360c)) * 31) + java.lang.Long.hashCode(this.f344361d)) * 31) + java.lang.Long.hashCode(this.f344362e)) * 31) + java.lang.Long.hashCode(this.f344363f)) * 31) + java.lang.Integer.hashCode(this.f344364g)) * 31) + java.lang.Long.hashCode(this.f344365h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        java.lang.String str = "SnsUnReadConfig(jumpEnable=true, jumpMinInterval=" + this.f344358a + ", jumpMaxInterval=" + this.f344359b + ", jumpMinFeedsCount=" + this.f344360c + ", jumpMinFeedsGapCount=" + this.f344361d + ", jumpNotWsPercent=" + this.f344362e + ", jumpReadContinuousCount=" + this.f344363f + ", jumpIndicatorIndexOffset=" + this.f344364g + ", jumpIndicatorExposeInterval=" + this.f344365h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        return str;
    }
}

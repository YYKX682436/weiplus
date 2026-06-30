package hc4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f280361a;

    /* renamed from: b, reason: collision with root package name */
    public int f280362b;

    /* renamed from: c, reason: collision with root package name */
    public long f280363c;

    /* renamed from: d, reason: collision with root package name */
    public long f280364d;

    /* renamed from: e, reason: collision with root package name */
    public int f280365e;

    /* renamed from: f, reason: collision with root package name */
    public long f280366f;

    /* renamed from: g, reason: collision with root package name */
    public int f280367g;

    /* renamed from: h, reason: collision with root package name */
    public int f280368h;

    public e(long j17, int i17, long j18, long j19, int i18, long j27, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        long j28 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        long j29 = (i28 & 4) != 0 ? 0L : j18;
        long j37 = (i28 & 8) != 0 ? 0L : j19;
        int i37 = (i28 & 16) != 0 ? 0 : i18;
        long j38 = (i28 & 32) == 0 ? j27 : 0L;
        int i38 = (i28 & 64) != 0 ? 0 : i19;
        int i39 = (i28 & 128) == 0 ? i27 : 0;
        this.f280361a = j28;
        this.f280362b = i29;
        this.f280363c = j29;
        this.f280364d = j37;
        this.f280365e = i37;
        this.f280366f = j38;
        this.f280367g = i38;
        this.f280368h = i39;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return true;
        }
        if (!(obj instanceof hc4.e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        hc4.e eVar = (hc4.e) obj;
        if (this.f280361a != eVar.f280361a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280362b != eVar.f280362b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280363c != eVar.f280363c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280364d != eVar.f280364d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280365e != eVar.f280365e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280366f != eVar.f280366f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f280367g != eVar.f280367g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        int i17 = this.f280368h;
        int i18 = eVar.f280368h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f280361a) * 31) + java.lang.Integer.hashCode(this.f280362b)) * 31) + java.lang.Long.hashCode(this.f280363c)) * 31) + java.lang.Long.hashCode(this.f280364d)) * 31) + java.lang.Integer.hashCode(this.f280365e)) * 31) + java.lang.Long.hashCode(this.f280366f)) * 31) + java.lang.Integer.hashCode(this.f280367g)) * 31) + java.lang.Integer.hashCode(this.f280368h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        long j17 = this.f280361a;
        long j18 = this.f280363c;
        long j19 = j17 - j18;
        long j27 = j19 > 0 ? ((this.f280362b - this.f280368h) * 1000) / j19 : -1L;
        long j28 = j18 > 0 ? (this.f280368h * 1000) / j18 : -1L;
        stringBuffer.append("total time:" + this.f280361a + " ms,scroll time:" + this.f280363c + " ms,idle time:" + j19 + '\n');
        stringBuffer.append("total jank time:" + this.f280366f + " ms, scroll jank time:" + this.f280364d + " ms,idle jank time:" + (this.f280366f - this.f280364d) + " ms\n");
        stringBuffer.append("total frame:" + this.f280362b + " ,janke frame:" + this.f280365e + " scroll frame:" + this.f280368h + '\n');
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scroll fps:");
        sb6.append(j28);
        sb6.append(" ,idle fps:");
        sb6.append(j27);
        sb6.append('\n');
        stringBuffer.append(sb6.toString());
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return stringBuffer2;
    }
}

package sd4;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f406681a;

    /* renamed from: b, reason: collision with root package name */
    public int f406682b;

    /* renamed from: c, reason: collision with root package name */
    public long f406683c;

    /* renamed from: d, reason: collision with root package name */
    public long f406684d;

    /* renamed from: e, reason: collision with root package name */
    public int f406685e;

    /* renamed from: f, reason: collision with root package name */
    public long f406686f;

    /* renamed from: g, reason: collision with root package name */
    public int f406687g;

    /* renamed from: h, reason: collision with root package name */
    public int f406688h;

    public a(long j17, int i17, long j18, long j19, int i18, long j27, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        long j28 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        long j29 = (i28 & 4) != 0 ? 0L : j18;
        long j37 = (i28 & 8) != 0 ? 0L : j19;
        int i37 = (i28 & 16) != 0 ? 0 : i18;
        long j38 = (i28 & 32) == 0 ? j27 : 0L;
        int i38 = (i28 & 64) != 0 ? 0 : i19;
        int i39 = (i28 & 128) == 0 ? i27 : 0;
        this.f406681a = j28;
        this.f406682b = i29;
        this.f406683c = j29;
        this.f406684d = j37;
        this.f406685e = i37;
        this.f406686f = j38;
        this.f406687g = i38;
        this.f406688h = i39;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return true;
        }
        if (!(obj instanceof sd4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        sd4.a aVar = (sd4.a) obj;
        if (this.f406681a != aVar.f406681a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406682b != aVar.f406682b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406683c != aVar.f406683c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406684d != aVar.f406684d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406685e != aVar.f406685e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406686f != aVar.f406686f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f406687g != aVar.f406687g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        int i17 = this.f406688h;
        int i18 = aVar.f406688h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f406681a) * 31) + java.lang.Integer.hashCode(this.f406682b)) * 31) + java.lang.Long.hashCode(this.f406683c)) * 31) + java.lang.Long.hashCode(this.f406684d)) * 31) + java.lang.Integer.hashCode(this.f406685e)) * 31) + java.lang.Long.hashCode(this.f406686f)) * 31) + java.lang.Integer.hashCode(this.f406687g)) * 31) + java.lang.Integer.hashCode(this.f406688h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        return hashCode;
    }

    public java.lang.String toString() {
        java.lang.String str;
        long j17;
        long j18;
        long j19;
        long j27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j28 = this.f406681a;
        long j29 = this.f406683c;
        long j37 = j28 - j29;
        int i17 = this.f406685e;
        int i18 = i17 - this.f406687g;
        long j38 = this.f406686f;
        long j39 = this.f406684d;
        long j47 = j38 - j39;
        if (j38 > 0) {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j17 = j37;
            j18 = (100 * j39) / j38;
        } else {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j17 = j37;
            j18 = -1;
        }
        if (j29 > 0) {
            j19 = j18;
            j27 = (this.f406688h * 1000) / j29;
        } else {
            j19 = j18;
            j27 = -1;
        }
        if (j38 > 0) {
            long j48 = (i17 * 1000) / j38;
        }
        long j49 = i17 > 0 ? j38 / i17 : -1L;
        if (j39 > 0) {
            long j57 = (r8 * 1000) / j39;
        }
        if (j47 > 0) {
            long j58 = (i18 * 1000) / j47;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("总停留时长:");
        sb6.append(this.f406681a);
        sb6.append(" ms, 滑动时长:");
        sb6.append(this.f406683c);
        sb6.append("ms(");
        long j59 = 100;
        sb6.append((this.f406683c * j59) / this.f406681a);
        sb6.append("%) 静止时长:");
        long j66 = j17;
        sb6.append(j66);
        sb6.append("ms\n累计卡顿时长:");
        sb6.append(j49);
        sb6.append("ms(");
        sb6.append((j59 * j49) / this.f406681a);
        sb6.append("%) 滑动卡顿时长:");
        sb6.append(this.f406684d);
        sb6.append("ms(");
        sb6.append(j19);
        sb6.append("%) 静止卡顿时长:");
        sb6.append(j49 - this.f406684d);
        sb6.append("ms\n总帧数:");
        sb6.append(this.f406682b);
        sb6.append(",正常帧数:");
        sb6.append(this.f406682b - this.f406685e);
        sb6.append(",卡顿帧数=");
        sb6.append(this.f406685e);
        sb6.append(",静止帧数:");
        sb6.append(this.f406682b - this.f406688h);
        sb6.append(",滑动帧数:");
        sb6.append(this.f406688h);
        sb6.append("\n页面平均帧率:");
        sb6.append((this.f406682b * 1000) / this.f406681a);
        sb6.append(",帧均耗时:");
        sb6.append((this.f406682b * 1000) / this.f406681a);
        sb6.append("ms 静止帧率:");
        sb6.append(((this.f406682b - this.f406688h) * 1000) / j66);
        sb6.append(" 滑动帧率:");
        sb6.append(j27);
        sb6.append(" \n");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", str);
        return sb7;
    }
}

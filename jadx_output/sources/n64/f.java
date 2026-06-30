package n64;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f335219a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335220b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f335221c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f335222d;

    public f(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f335219a = i17;
        this.f335220b = i18;
        this.f335221c = str;
        this.f335222d = str2;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLogInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogInfo", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return this.f335222d;
    }

    public final boolean b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasFlag", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        boolean z17 = (i17 & this.f335220b) != 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasFlag", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return z17;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        java.lang.String str = "resType=" + this.f335219a + ", flag=" + this.f335220b + ", extra=" + this.f335221c + ", logInfo=" + this.f335222d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
        return str;
    }
}

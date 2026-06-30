package f44;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f259551b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f259552c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f259553d;

    /* renamed from: e, reason: collision with root package name */
    public final int f259554e;

    public e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f259551b = 0;
        this.f259553d = snsInfo;
        this.f259554e = i17;
        this.f259551b = 0;
        this.f259550a = a(snsInfo != null ? snsInfo.getSnsId() : "", 0);
    }

    public static java.lang.String a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
        if (str == null) {
            java.lang.String str2 = " _" + i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
            return str2;
        }
        java.lang.String str3 = str + "_" + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
        return str3;
    }

    public e(java.lang.String str, java.lang.String[] strArr) {
        this.f259551b = 0;
        this.f259552c = strArr;
        this.f259551b = 1;
        this.f259550a = a(str, 1);
    }
}

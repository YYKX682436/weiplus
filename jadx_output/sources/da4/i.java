package da4;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f227788a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f227789b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f227790c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f227791d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227792e;

    /* renamed from: f, reason: collision with root package name */
    public final long f227793f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f227794g;

    /* renamed from: h, reason: collision with root package name */
    public final long f227795h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f227796i;

    /* renamed from: j, reason: collision with root package name */
    public int f227797j;

    /* renamed from: k, reason: collision with root package name */
    public final int f227798k;

    /* renamed from: l, reason: collision with root package name */
    public final int f227799l;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, int i17) {
        this.f227797j = 0;
        this.f227798k = 0;
        this.f227788a = str;
        this.f227789b = str2;
        this.f227790c = str3 == null ? "" : str3;
        this.f227791d = str4 == null ? "" : str4;
        this.f227792e = z17;
        this.f227793f = android.os.SystemClock.elapsedRealtime();
        this.f227794g = snsInfo;
        this.f227795h = java.lang.System.currentTimeMillis();
        this.f227799l = i17;
    }

    public static da4.i a(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
        try {
            da4.i iVar = new da4.i(str, i17, i18, str2, str3, str4, snsInfo, z17, str5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return iVar;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            return null;
        }
    }

    public i(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, java.lang.String str5) {
        this.f227798k = 0;
        this.f227788a = str;
        this.f227797j = i17;
        this.f227798k = i18;
        this.f227789b = str2;
        this.f227790c = com.tencent.mm.sdk.platformtools.t8.K0(str3) ? "" : str3;
        this.f227791d = com.tencent.mm.sdk.platformtools.t8.K0(str4) ? "" : str4;
        this.f227792e = z17;
        this.f227793f = android.os.SystemClock.elapsedRealtime();
        this.f227794g = snsInfo;
        this.f227795h = java.lang.System.currentTimeMillis();
        this.f227796i = str5;
    }
}

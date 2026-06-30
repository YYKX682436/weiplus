package o54;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f343135a;

    /* renamed from: b, reason: collision with root package name */
    public long f343136b;

    /* renamed from: c, reason: collision with root package name */
    public long f343137c;

    /* renamed from: d, reason: collision with root package name */
    public long f343138d;

    /* renamed from: e, reason: collision with root package name */
    public long f343139e;

    /* renamed from: f, reason: collision with root package name */
    public long f343140f;

    /* renamed from: g, reason: collision with root package name */
    public long f343141g;

    /* renamed from: h, reason: collision with root package name */
    public long f343142h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f343143i;

    /* renamed from: k, reason: collision with root package name */
    public int f343145k;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f343144j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f343146l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f343147m = false;

    public o54.f a() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        long j17 = this.f343137c;
        long j18 = this.f343136b;
        this.f343146l = "onCreateTime=" + (j17 - j18) + "|viewCreate=" + (this.f343141g - j18) + "|firstFrame=" + (this.f343142h - j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f343146l);
        sb6.append("|snsId=");
        sb6.append(this.f343144j);
        this.f343146l = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f343146l);
        sb7.append("|startActCount=");
        int i18 = o54.g.f343148a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        int i19 = o54.g.f343148a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        sb7.append(i19);
        this.f343146l = sb7.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        java.util.HashMap hashMap = o54.g.f343149b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        if (hashMap.containsKey(this.f343144j)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            java.lang.Integer num = (java.lang.Integer) hashMap.get(this.f343144j);
            if (num != null) {
                i17 = num.intValue();
                this.f343146l += "|startSnsIdCount=" + i17;
                this.f343146l += "|isMM=" + (this.f343143i ? 1 : 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
                return this;
            }
        }
        i17 = 0;
        this.f343146l += "|startSnsIdCount=" + i17;
        this.f343146l += "|isMM=" + (this.f343143i ? 1 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        return this;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        int i17 = (int) (this.f343136b - this.f343135a);
        int i18 = (int) (this.f343140f - this.f343139e);
        com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "reportTime, ipcConnTime=" + i18 + "|processTime=" + i17 + "|" + this.f343146l + ", clickStart=" + this.f343135a + ", source=" + this.f343145k);
        ca4.e0.a("landing_page_cost", java.lang.String.valueOf(this.f343145k), i17, i18, this.f343146l);
        boolean z17 = this.f343147m;
        int i19 = this.f343145k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report13387Idkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report13387Idkey, isRestart=");
        sb6.append(z17);
        sb6.append(", source=");
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", sb6.toString());
        o54.g.a(1673L, 23L);
        if (z17) {
            o54.g.a(1673L, 26L);
            if (i19 == 29) {
                o54.g.a(1673L, 28L);
            }
        }
        if (i19 == 29) {
            o54.g.a(1667L, 12L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report13387Idkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
    }
}

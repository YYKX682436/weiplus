package ta4;

/* loaded from: classes15.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f416827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416828h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f416829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, boolean z18) {
        super(0);
        this.f416824d = str;
        this.f416825e = i17;
        this.f416826f = str2;
        this.f416827g = z17;
        this.f416828h = str3;
        this.f416829i = z18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f416824d;
        int i17 = this.f416825e;
        java.lang.String str2 = this.f416826f;
        boolean z17 = this.f416827g;
        java.lang.String str3 = this.f416828h;
        boolean z18 = this.f416829i;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f416838a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                boolean i18 = u0Var.i();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                if (i18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    ta4.a l17 = u0Var.l(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    if (l17 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                    } else {
                        ta4.a aVar = new ta4.a(str, i17, str2, z17, ta4.j.f416769d, str3);
                        if (ta4.u0.e().contains(l17)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Image.SnsImageLoadReporter", "startLoad already contain snsid:" + str3 + " mediaId:" + str);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAd", "com.tencent.mm.plugin.sns.report.Data");
                            aVar.f416711i = z18;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAd", "com.tencent.mm.plugin.sns.report.Data");
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                            aVar.f416717o = elapsedRealtime;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.String str4 = ta4.u0.f416844g;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSession", "com.tencent.mm.plugin.sns.report.Data");
                            kotlin.jvm.internal.o.g(str4, "<set-?>");
                            aVar.f416718p = str4;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSession", "com.tencent.mm.plugin.sns.report.Data");
                            ta4.u0.e().add(aVar);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "startLoad snsId:" + str3 + ", mediaId:" + str + ", requestType:" + i17 + ", fromScene:" + str2 + ", isBatchDownload:" + z17 + ", isAd:" + z18 + ", reportDataList.size:" + ta4.u0.e().size());
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                        }
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
            }
        }
        return jz5.f0.f302826a;
    }
}

package og1;

/* loaded from: classes7.dex */
public final class b implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ og1.c f345129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f345130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f345131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f345132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f345134i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.xw f345135m;

    public b(og1.c cVar, long j17, long j18, long j19, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.f0 f0Var, r45.xw xwVar) {
        this.f345129d = cVar;
        this.f345130e = j17;
        this.f345131f = j18;
        this.f345132g = j19;
        this.f345133h = h0Var;
        this.f345134i = f0Var;
        this.f345135m = xwVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "";
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.ie ieVar;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct();
        weAppQualityCGISpeedStruct.f62430g = this.f345130e;
        weAppQualityCGISpeedStruct.f62431h = this.f345131f;
        weAppQualityCGISpeedStruct.f62432i = this.f345132g;
        weAppQualityCGISpeedStruct.f62433j = weAppQualityCGISpeedStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        kotlin.jvm.internal.h0 h0Var = this.f345133h;
        weAppQualityCGISpeedStruct.f62434k = ((r45.js5) h0Var.f310123d) != null ? r2.computeSize() : -1L;
        weAppQualityCGISpeedStruct.f62435l = this.f345134i.f310116d;
        r45.js5 js5Var = (r45.js5) h0Var.f310123d;
        weAppQualityCGISpeedStruct.f62436m = (js5Var == null || (ieVar = js5Var.BaseResponse) == null) ? Integer.MIN_VALUE : ieVar.f376959d;
        og1.c cVar = this.f345129d;
        weAppQualityCGISpeedStruct.f62437n = cVar.a();
        weAppQualityCGISpeedStruct.f62438o = com.tencent.mm.plugin.appbrand.networking.i.a();
        r45.xw xwVar = this.f345135m;
        weAppQualityCGISpeedStruct.f62439p = xwVar != null ? xwVar.f390550t : 0L;
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        java.lang.String f17 = cVar.f();
        java.lang.String str = "";
        if (f17 == null) {
            f17 = "";
        }
        java.lang.String g17 = cVar.g();
        if (g17 == null) {
            g17 = "";
        }
        try {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(f17, true);
            java.lang.String str2 = b17 != null ? b17.f88134d : null;
            if (str2 != null) {
                str = str2;
            }
        } catch (java.lang.IllegalStateException unused) {
        }
        jVar.c(f17, g17, weAppQualityCGISpeedStruct, str);
    }
}

package com.tencent.mm.plugin.finder.report;

/* loaded from: classes5.dex */
public final class l3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f125113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125115c;

    public l3(long j17, int i17, int i18) {
        this.f125113a = j17;
        this.f125114b = i17;
        this.f125115c = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        long j17 = this.f125113a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.autogen.mmdata.rpt.FinderAdvertisementKvReportStruct finderAdvertisementKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAdvertisementKvReportStruct();
            finderAdvertisementKvReportStruct.f56477d = finderAdvertisementKvReportStruct.b("object_id", pm0.v.u(j17), true);
            finderAdvertisementKvReportStruct.f56478e = this.f125114b;
            finderAdvertisementKvReportStruct.f56479f = this.f125115c;
            finderAdvertisementKvReportStruct.f56480g = fVar.f70615a;
            finderAdvertisementKvReportStruct.f56481h = fVar.f70616b;
            finderAdvertisementKvReportStruct.k();
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "reportHardAdvertisement end, feedId=" + pm0.v.u(j17) + ", errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b + ", errMsg=" + fVar.f70617c);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return kotlin.Result.m520boximpl(m521constructorimpl);
    }
}

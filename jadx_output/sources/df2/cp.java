package df2;

/* loaded from: classes15.dex */
public final class cp extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f229905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(java.lang.String str, int i17) {
        super(2);
        this.f229904d = str;
        this.f229905e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String fileName = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportAssetsLoad: ");
        sb6.append(fileName);
        sb6.append(", type:");
        sb6.append(intValue);
        sb6.append(", liveId:");
        java.lang.String str = this.f229904d;
        sb6.append(str);
        sb6.append(", mode:");
        int i17 = this.f229905e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("LivePAGReportController", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.FinderLivePagAssetsUsageReportStruct finderLivePagAssetsUsageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePagAssetsUsageReportStruct();
        finderLivePagAssetsUsageReportStruct.f57265d = finderLivePagAssetsUsageReportStruct.b("PagFileName", fileName, true);
        finderLivePagAssetsUsageReportStruct.f57266e = finderLivePagAssetsUsageReportStruct.b("LiveId", str, true);
        finderLivePagAssetsUsageReportStruct.f57267f = i17;
        finderLivePagAssetsUsageReportStruct.f57268g = intValue;
        finderLivePagAssetsUsageReportStruct.f57269h = finderLivePagAssetsUsageReportStruct.b("ResourceName", fileName, true);
        finderLivePagAssetsUsageReportStruct.k();
        return jz5.f0.f302826a;
    }
}

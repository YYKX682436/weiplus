package ie1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ie1.b f290978a = new ie1.b();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String apiName, boolean z17, long j17, long j18, int i17, java.lang.String errorMsg, java.lang.String issuerID, java.lang.String appId) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(appId, "appId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((ie1.a.f290976a.length() > 0) == true) {
            str = ie1.a.f290976a;
        } else {
            java.lang.String name = ge1.j.f270953a.b().name();
            if (!kotlin.jvm.internal.o.b(name, "UNSUPPORTED")) {
                ie1.a.f290976a = name;
            }
            str = ie1.a.f290976a;
        }
        java.lang.String str2 = ie1.a.f290977b;
        jx3.f.INSTANCE.d(37934, apiName, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), errorMsg, str, str2, issuerID, appId);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.Reporter", "report, apiName=" + apiName + ", result=" + z17 + ", duration=" + (j18 - j17) + "ms, errorCode=" + i17 + ", brandName=" + str + ", walletVersion=" + str2 + ", appId=" + appId);
    }
}

package vd0;

/* loaded from: classes11.dex */
public final class l1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.api.AskParam f435458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.d2 f435459b;

    public l1(com.tencent.mm.feature.setting.api.AskParam askParam, wd0.d2 d2Var) {
        this.f435458a = askParam;
        this.f435459b = d2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c result = (eu5.c) eVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] prepareAppSecureKey onResult errCode: " + result.f475605a);
        int i17 = result.f475605a;
        com.tencent.mm.feature.setting.api.AskParam askParam = this.f435458a;
        askParam.f67806d = i17;
        if (i17 != 0) {
            askParam.f67807e = "";
            askParam.f67808f = "";
            askParam.f67809g = "";
        } else {
            zt5.r rVar = (zt5.r) result.f256827c;
            java.lang.String optString = new cl0.g(rVar.f475617e).optString("certs");
            if (optString == null) {
                optString = "";
            }
            if (kotlin.jvm.internal.o.b(optString, "")) {
                java.lang.String str = rVar.f475617e;
                kotlin.jvm.internal.o.f(str, "getRawJson(...)");
                askParam.f67807e = str;
                java.lang.String str2 = rVar.f475619g;
                kotlin.jvm.internal.o.f(str2, "getSignature(...)");
                askParam.f67808f = str2;
                askParam.f67809g = "";
            } else {
                askParam.f67807e = "";
                askParam.f67808f = "";
                java.lang.String str3 = rVar.f475617e;
                kotlin.jvm.internal.o.f(str3, "getRawJson(...)");
                askParam.f67809g = str3;
            }
        }
        vd0.m1 m1Var = (vd0.m1) this.f435459b;
        m1Var.getClass();
        ((kotlinx.coroutines.r) m1Var.f435466a).resumeWith(kotlin.Result.m521constructorimpl(askParam));
    }
}

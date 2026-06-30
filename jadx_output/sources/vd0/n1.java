package vd0;

/* loaded from: classes11.dex */
public final class n1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.api.AuthKeyParam f435473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.e2 f435474b;

    public n1(com.tencent.mm.feature.setting.api.AuthKeyParam authKeyParam, wd0.e2 e2Var) {
        this.f435473a = authKeyParam;
        this.f435474b = e2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c result = (eu5.c) eVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] prepareAuthKey onResult errCode: ");
        sb6.append(result.f475605a);
        sb6.append(", errMsg: ");
        sb6.append(result.f475606b);
        sb6.append(", resultInfo is : ");
        java.lang.Object obj = result.f256827c;
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", sb6.toString());
        int i17 = result.f475605a;
        com.tencent.mm.feature.setting.api.AuthKeyParam authKeyParam = this.f435473a;
        authKeyParam.f67810d = i17;
        if (i17 != 0) {
            authKeyParam.f67812f = "";
            authKeyParam.f67811e = "";
        } else {
            zt5.r rVar = (zt5.r) obj;
            java.lang.String str = rVar.f475617e;
            kotlin.jvm.internal.o.f(str, "getRawJson(...)");
            authKeyParam.f67811e = str;
            java.lang.String str2 = rVar.f475619g;
            kotlin.jvm.internal.o.f(str2, "getSignature(...)");
            authKeyParam.f67812f = str2;
        }
        vd0.o1 o1Var = (vd0.o1) this.f435474b;
        o1Var.getClass();
        ((kotlinx.coroutines.r) o1Var.f435479a).resumeWith(kotlin.Result.m521constructorimpl(authKeyParam));
    }
}

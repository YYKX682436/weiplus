package vd0;

/* loaded from: classes14.dex */
public final class t1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.g2 f435510a;

    public t1(wd0.g2 g2Var) {
        this.f435510a = g2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a result = (eu5.a) eVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] requestAuthorizeAndSign onResult errCode: ");
        sb6.append(result.f475605a);
        sb6.append(", errMsg: ");
        sb6.append(result.f475606b);
        sb6.append(", resultInfo is : ");
        java.lang.Object obj = result.f256827c;
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", sb6.toString());
        if (result.f475605a == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fingerprint login] requestAuthorizeAndSign onResult extData: ");
            zt5.s sVar = (zt5.s) obj;
            sb7.append(sVar.f475630k);
            sb7.append(", jsonValue: ");
            sb7.append(sVar.f475629j);
            sb7.append(", resultInfo is : ");
            sb7.append(sVar.f475621b);
            com.tencent.mars.xlog.Log.i("SettingFingerprintService", sb7.toString());
        }
        wd0.m2 m2Var = new wd0.m2(0, null, null, 7, null);
        m2Var.f444752a = result.f475605a;
        java.lang.String errMsg = result.f475606b;
        kotlin.jvm.internal.o.f(errMsg, "errMsg");
        m2Var.f444753b = errMsg;
        zt5.s sVar2 = (zt5.s) obj;
        if (sVar2 != null) {
            m2Var.f444754c = sVar2;
        }
        this.f435510a.a(m2Var);
    }
}

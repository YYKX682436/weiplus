package pg0;

/* loaded from: classes9.dex */
public class i2 implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2 = strArr[0];
        str2.getClass();
        if (!str2.equals("//cleanpaycn")) {
            return false;
        }
        com.tencent.mm.wallet_core.model.j.b().getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tenpay.ndk.CertUtil.getInstance().clearAllCert();
        com.tenpay.ndk.WxSmCertUtil.getInstance().clearAllCert();
        return true;
    }
}

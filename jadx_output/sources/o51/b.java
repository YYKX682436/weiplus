package o51;

/* loaded from: classes12.dex */
public class b implements p51.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f343084a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f343085b = {"1", "2", "3", "4", "5", "6", "7", "8", "9", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "11", "12"};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f343086c = {com.tencent.mm.R.string.him, com.tencent.mm.R.string.hil, com.tencent.mm.R.string.hip, com.tencent.mm.R.string.hii, com.tencent.mm.R.string.hiq, com.tencent.mm.R.string.hio, com.tencent.mm.R.string.hin, com.tencent.mm.R.string.hij, com.tencent.mm.R.string.hit, com.tencent.mm.R.string.his, com.tencent.mm.R.string.hir, com.tencent.mm.R.string.hik};

    public b(android.content.Context context) {
        this.f343084a = context;
    }

    @Override // p51.a
    public java.lang.String a(java.lang.String str) {
        java.lang.String[] strArr = this.f343085b;
        iz5.a.a(12, strArr.length);
        int[] iArr = this.f343086c;
        iz5.a.a(12, iArr.length);
        for (int i17 = 0; i17 < strArr.length; i17++) {
            if (str.equals(strArr[i17])) {
                return this.f343084a.getResources().getString(iArr[i17]);
            }
        }
        return str;
    }
}

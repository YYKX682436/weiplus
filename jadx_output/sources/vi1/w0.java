package vi1;

/* loaded from: classes7.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437482i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437483m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, vi1.b1 b1Var) {
        super(1);
        this.f437477d = str;
        this.f437478e = str2;
        this.f437479f = str3;
        this.f437480g = str4;
        this.f437481h = str5;
        this.f437482i = str6;
        this.f437483m = b1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.zs6 zs6Var = (r45.zs6) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserPhone success:");
        sb6.append(zs6Var != null);
        com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", sb6.toString());
        if (zs6Var != null) {
            vi1.o0 o0Var = vi1.o0.f437416a;
            java.lang.String str = this.f437477d;
            java.lang.String showMobile = this.f437478e;
            kotlin.jvm.internal.o.f(showMobile, "$showMobile");
            java.lang.String encryptedData = this.f437479f;
            kotlin.jvm.internal.o.f(encryptedData, "$encryptedData");
            java.lang.String iv6 = this.f437480g;
            kotlin.jvm.internal.o.f(iv6, "$iv");
            o0Var.a(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str, showMobile, encryptedData, iv6, this.f437481h, false, false, false, true, this.f437482i, 224, null));
            this.f437483m.f437275c.invoke();
        }
        return jz5.f0.f302826a;
    }
}

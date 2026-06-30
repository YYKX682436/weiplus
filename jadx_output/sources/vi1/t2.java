package vi1;

/* loaded from: classes7.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(vi1.k3 k3Var, android.app.ProgressDialog progressDialog, boolean z17) {
        super(1);
        this.f437455d = k3Var;
        this.f437456e = progressDialog;
        this.f437457f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.yz5 yz5Var = (r45.yz5) obj;
        ik1.h0.b(new vi1.q2(this.f437456e));
        vi1.k3 k3Var = this.f437455d;
        if (yz5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber SendVerifyCode cgi failed");
            vi1.k3.a(k3Var, "SendVerifyCode cgi fail");
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.r2(k3Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "SendVerifyCode cgi success");
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.s2(this.f437457f, k3Var, yz5Var));
        }
        return jz5.f0.f302826a;
    }
}

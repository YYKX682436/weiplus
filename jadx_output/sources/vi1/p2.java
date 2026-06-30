package vi1;

/* loaded from: classes7.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.app.ProgressDialog progressDialog, vi1.k3 k3Var, boolean z17) {
        super(1);
        this.f437427d = progressDialog;
        this.f437428e = k3Var;
        this.f437429f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.yz5 yz5Var = (r45.yz5) obj;
        this.f437427d.dismiss();
        vi1.k3 k3Var = this.f437428e;
        if (yz5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber SendVerifyCode cgi failed");
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.n2(k3Var));
            vi1.k3.a(k3Var, "SendVerifyCode cgi fail");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "SendVerifyCode cgi success");
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.o2(this.f437429f, k3Var, yz5Var));
        }
        return jz5.f0.f302826a;
    }
}

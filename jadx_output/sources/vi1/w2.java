package vi1;

/* loaded from: classes7.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(android.app.ProgressDialog progressDialog, vi1.k3 k3Var) {
        super(1);
        this.f437485d = progressDialog;
        this.f437486e = k3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.x20 x20Var = (r45.x20) obj;
        this.f437485d.dismiss();
        vi1.k3 k3Var = this.f437486e;
        if (x20Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber checkVerifyCode cgi failed");
            vi1.k3.a(k3Var, "checkVerifyCode cgi fail");
            vi1.j2 j2Var = k3Var.f437386c;
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437377z);
                kotlin.jvm.internal.o.d(valueOf);
                j2Var.f437377z = valueOf.longValue() + 1;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.u2(k3Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "checkVerifyCode success");
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.v2(k3Var, x20Var));
        }
        return jz5.f0.f302826a;
    }
}

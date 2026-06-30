package vi1;

/* loaded from: classes7.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vi1.b1 b1Var, android.app.ProgressDialog progressDialog) {
        super(1);
        this.f437462d = b1Var;
        this.f437463e = progressDialog;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.yz5 yz5Var = (r45.yz5) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendSms success");
        sb6.append(yz5Var != null);
        com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.b1 b1Var = this.f437462d;
        if (yz5Var != null) {
            com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", "sendSms:%d", java.lang.Integer.valueOf(yz5Var.f391538d));
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.r0(yz5Var, b1Var));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.s0(b1Var));
        }
        ik1.h0.b(new vi1.t0(this.f437463e));
        return jz5.f0.f302826a;
    }
}

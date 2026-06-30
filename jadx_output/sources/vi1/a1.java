package vi1;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f437267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(vi1.b1 b1Var, boolean z17, java.lang.String str, android.app.ProgressDialog progressDialog) {
        super(1);
        this.f437266d = b1Var;
        this.f437267e = z17;
        this.f437268f = str;
        this.f437269g = progressDialog;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.x20 x20Var = (r45.x20) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verifyCode success:");
        sb6.append(x20Var != null);
        com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.b1 b1Var = this.f437266d;
        if (x20Var != null) {
            com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", "checkVerifyCode:%d", java.lang.Integer.valueOf(x20Var.f389690d));
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.x0(x20Var, b1Var, this.f437267e, this.f437268f));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new vi1.y0(b1Var));
        }
        ik1.h0.b(new vi1.z0(this.f437269g));
        return jz5.f0.f302826a;
    }
}

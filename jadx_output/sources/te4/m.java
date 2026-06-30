package te4;

/* loaded from: classes15.dex */
public class m extends xt5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.security.Signature f418606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te4.n f418607b;

    public m(te4.n nVar, java.security.Signature signature) {
        this.f418607b = nVar;
        this.f418606a = signature;
    }

    @Override // xt5.c
    public void a() {
    }

    @Override // xt5.c
    public void b(int i17, java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationError");
    }

    @Override // xt5.c
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationFailed");
    }

    @Override // xt5.c
    public void d(int i17, java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationHelp");
    }

    @Override // xt5.c
    public void e(xt5.d dVar) {
        java.security.Signature signature = this.f418606a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationSucceeded");
        try {
            signature.update("challenge".getBytes());
            zt5.s a17 = wt5.a.a(signature.sign());
            this.f418607b.f418608d.f171766o.setText(a17 == null ? "not pass: exception occurs" : a17.toString());
        } catch (java.security.SignatureException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e17.toString());
        }
    }
}

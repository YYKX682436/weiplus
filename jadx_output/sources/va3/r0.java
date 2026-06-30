package va3;

/* loaded from: classes15.dex */
public class r0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va3.v0 f434339d;

    public r0(va3.v0 v0Var) {
        this.f434339d = v0Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        r45.wa5 wa5Var;
        if (!z17) {
            return false;
        }
        va3.v0 v0Var = this.f434339d;
        if (v0Var.A) {
            v0Var.A = false;
            v0Var.C = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "", 0, java.lang.Long.valueOf(v0Var.C - v0Var.B));
        }
        r45.mw6 mw6Var = v0Var.f434358p;
        if (mw6Var == null || (wa5Var = mw6Var.f380873e) == null) {
            return true;
        }
        wa5Var.f389011d = f18;
        wa5Var.f389012e = f17;
        return true;
    }
}

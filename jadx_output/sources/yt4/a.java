package yt4;

/* loaded from: classes9.dex */
public abstract class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f465748c;

    public a(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var, android.os.Bundle bundle) {
        super(mMActivity, b0Var);
        this.f465748c = bundle;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        android.os.Bundle bundle = this.f465748c;
        bundle.putString("key_pwd1", str);
        this.f338834b.a(new yt4.c(bundle.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof yt4.c)) {
            return false;
        }
        yt4.c cVar = (yt4.c) m1Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f465749d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
            return false;
        }
        java.lang.String str2 = cVar.f465749d;
        android.os.Bundle bundle = this.f465748c;
        bundle.putString("payu_reference", str2);
        com.tencent.mm.wallet_core.a.d(this.f338833a, bundle);
        return false;
    }
}

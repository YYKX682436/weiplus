package fs4;

/* loaded from: classes9.dex */
public class a extends np5.g {
    public a(fs4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof ss4.e0)) {
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "hy: reset_pwd_flag: %s, find_pwd_url: %s", y07.field_reset_passwd_flag, y07.field_find_passwd_url);
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            java.lang.String str2 = v1Var != null ? v1Var.field_forget_passwd_url : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "jump to forget url: %s", str2);
                com.tencent.mm.wallet_core.ui.r1.V(this.f338833a, str2, false);
                return true;
            }
        }
        return false;
    }
}

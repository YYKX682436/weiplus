package kt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312031c = rVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        this.f312031c.f(this.f338833a, bundle);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        kt4.r rVar = this.f312031c;
        int i17 = rVar.f213801c.getInt("key_open_scene");
        np5.b0 b0Var = this.f338834b;
        b0Var.c(1958);
        b0Var.a(new jt4.i(kt4.r.F(rVar), str, i17, null), true);
        rVar.f213801c.putString("key_pwd1", str);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof jt4.i)) {
            return false;
        }
        this.f338834b.i(1958);
        jt4.i iVar = (jt4.i) m1Var;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0 && i18 == 0) {
            r45.oz4 oz4Var = iVar.f301659f;
            if (oz4Var.f382623d == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                r45.oz4 oz4Var2 = iVar.f301659f;
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "req_serial: %s, is_reuse_existing_ecard: %s", oz4Var2.f382626g, java.lang.Boolean.valueOf(oz4Var2.f382629m));
                kt4.r rVar = this.f312031c;
                rVar.f213801c.putString("key_req_serial", iVar.f301659f.f382626g);
                if (iVar.f301659f.f382629m) {
                    bundle.putBoolean("key_is_reuse_existing_ecard", true);
                }
                rVar.o(mMActivity, 0, bundle);
            } else if (!jt4.f.c((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, oz4Var.f382627h)) {
                int i19 = iVar.f301660g;
                java.lang.String str2 = iVar.f301661h;
                r45.oz4 oz4Var3 = iVar.f301659f;
                if (!jt4.f.b((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, iVar, i19, str2, oz4Var3.f382623d, oz4Var3.f382624e)) {
                    db5.e1.G(mMActivity, jt4.f.a(mMActivity, iVar.f301659f.f382624e, iVar.f301661h, str), "", false, new kt4.c(this));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "net error: %s", iVar);
            db5.e1.G(mMActivity, jt4.f.a(mMActivity, str), "", false, new kt4.d(this));
        }
        return true;
    }
}

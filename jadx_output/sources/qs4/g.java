package qs4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs4.j f366418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qs4.j jVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366418c = jVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getString(com.tencent.mm.R.string.l0h);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qs4.j jVar = this.f366418c;
        jVar.a("WalletVerifyCodeUI onNext", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            z0Var.f14022a = "2";
        } else {
            z0Var.f14022a = "1";
        }
        boolean equals = "realname_verify_process".equals(jVar.e());
        np5.b0 b0Var = this.f338834b;
        if (equals) {
            b0Var.d(new ss4.w(z0Var, jVar.f213801c.getInt("entry_scene", -1), jVar.f213801c.getString("key_realname_sessionid")), true);
        } else {
            b0Var.d(new ss4.w(z0Var), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof rs4.a;
        qs4.j jVar = this.f366418c;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "verify code success!");
            jVar.f213801c.putString("kreq_token", ((rs4.a) m1Var).f399344e);
            return true;
        }
        if (!(m1Var instanceof ss4.w)) {
            return m1Var instanceof ys4.l;
        }
        jVar.F(this.f338834b);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = ((ss4.w) m1Var).f412138d;
        if (bindCardOrder == null) {
            return false;
        }
        jVar.f213801c.putParcelable("key_bindcard_value_result", bindCardOrder);
        return false;
    }
}

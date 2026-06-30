package qs4;

/* loaded from: classes9.dex */
public class h extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs4.j f366419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qs4.j jVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366419c = jVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        qs4.j jVar = this.f366419c;
        jVar.f213801c.getString("verify_card_flag", "0");
        boolean equals = "realname_verify_process".equals(jVar.e());
        np5.b0 b0Var = this.f338834b;
        if (equals) {
            b0Var.a(new rs4.b(z0Var, jVar.f213801c.getInt("entry_scene", -1), jVar.f213801c.getString("key_realname_sessionid"), (com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle) jVar.f213801c.getParcelable("realname_verify_process_bundle")), true);
        } else {
            b0Var.a(new rs4.b(z0Var), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof rs4.b)) {
            return m1Var instanceof ys4.l;
        }
        np5.b0 b0Var = this.f338834b;
        qs4.j jVar = this.f366419c;
        jVar.F(b0Var);
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = ((rs4.b) m1Var).f399346d;
        if (bindCardOrder == null) {
            return false;
        }
        jVar.f213801c.putParcelable("key_bindcard_value_result", bindCardOrder);
        return false;
    }
}

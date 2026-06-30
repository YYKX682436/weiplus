package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f179402c = aVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179402c;
        java.lang.String string = aVar.f213801c.getString("key_real_name_token");
        java.lang.String string2 = aVar.f213801c.getString("realname_verify_process_face_token");
        java.lang.String string3 = aVar.f213801c.getString("key_realname_sessionid");
        boolean z17 = aVar.f213801c.getBoolean("key_marketing_switch_closed", false);
        com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle = (com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle) aVar.f213801c.getParcelable("realname_verify_process_bundle");
        if (z0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14023b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RealNameVerifyProcess", "get pwd error");
        } else {
            boolean containsKey = aVar.f213801c.containsKey("kreq_token");
            np5.b0 b0Var = this.f338834b;
            if (containsKey) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "bindcard verify");
                b0Var.a(new rs4.b(z0Var, aVar.f213801c.getInt("entry_scene", -1), string3, realNameBundle), true);
            } else {
                b0Var.a(new ys4.f(1, z0Var.f14023b, string, string2, aVar.f213801c.getInt("entry_scene", -1), string3, realNameBundle, z17), true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof ys4.f;
        np5.b0 b0Var = this.f338834b;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179402c;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                ys4.f fVar = (ys4.f) m1Var;
                if (fVar.f465231g == 0) {
                    aVar.f213801c.putInt("realname_verify_process_ret", -1);
                }
                aVar.f213801c.putString("realname_verify_process_finish_title", fVar.f465228d);
                aVar.f213801c.putString("realname_verify_process_finish_desc", fVar.f465229e);
                aVar.f213801c.putString("realname_verify_process_finish_page", fVar.f465230f);
                aVar.f213801c.putInt("realname_verify_process_finish_err_jump", fVar.f465231g);
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
                com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
                walletGetUserInfoEvent.f54958g.f7215a = 16;
                walletGetUserInfoEvent.f192364d = new com.tencent.mm.plugin.wallet_core.id_verify.i(this);
                walletGetUserInfoEvent.e();
                aVar.F(b0Var);
                if (aVar.f179315e == 2) {
                    aVar.f(mMActivity, aVar.f213801c);
                    return true;
                }
                aVar.o(mMActivity, 0, aVar.f213801c);
                return true;
            }
        } else {
            if (!(m1Var instanceof rs4.b)) {
                return m1Var instanceof ys4.l;
            }
            if (i17 == 0 && i18 == 0) {
                rs4.b bVar = (rs4.b) m1Var;
                if (bVar.f399350h == 0) {
                    aVar.f213801c.putInt("realname_verify_process_ret", -1);
                }
                aVar.f213801c.putString("realname_verify_process_finish_title", bVar.f399347e);
                aVar.f213801c.putString("realname_verify_process_finish_desc", bVar.f399348f);
                aVar.f213801c.putString("realname_verify_process_finish_page", bVar.f399349g);
                aVar.f213801c.putInt("realname_verify_process_finish_err_jump", bVar.f399350h);
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "bind card verify succ ,update user info");
                com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = bVar.f399346d;
                if (bindCardOrder != null) {
                    aVar.f213801c.putParcelable("key_bindcard_value_result", bindCardOrder);
                }
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
                com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent2 = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
                walletGetUserInfoEvent2.f54958g.f7215a = 16;
                walletGetUserInfoEvent2.f192364d = new com.tencent.mm.plugin.wallet_core.id_verify.j(this);
                walletGetUserInfoEvent2.e();
                aVar.F(b0Var);
                if (aVar.f179315e == 2) {
                    aVar.f(mMActivity, aVar.f213801c);
                    return true;
                }
                aVar.o(mMActivity, 0, aVar.f213801c);
                return true;
            }
        }
        return false;
    }
}

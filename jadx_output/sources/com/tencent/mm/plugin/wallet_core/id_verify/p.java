package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f179455c = aVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getString(com.tencent.mm.R.string.l0h);
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1 || i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        java.lang.String string = intent.getExtras().getString("token");
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179455c;
        aVar.f213801c.putString("realname_verify_process_face_token", string);
        aVar.o(this.f338833a, 0, aVar.f213801c);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179455c;
        aVar.a("WalletVerifyCodeUI onNext", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "onNext, do bind verify!");
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || "rename".equals(aVar.f213801c.getString("key_realname_scene"))) {
            z0Var.f14022a = "1";
        } else {
            z0Var.f14022a = "2";
        }
        this.f338834b.d(new ss4.w(z0Var, aVar.f213801c.getInt("entry_scene", -1), aVar.f213801c.getString("key_realname_sessionid")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179455c;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "verify code success!");
                aVar.f213801c.putString("kreq_token", ((rs4.a) m1Var).f399344e);
                return true;
            }
            if (m1Var instanceof ss4.w) {
                aVar.F(this.f338834b);
                ss4.w wVar = (ss4.w) m1Var;
                com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = wVar.f412138d;
                if (bindCardOrder != null) {
                    aVar.f213801c.putParcelable("key_bindcard_value_result", bindCardOrder);
                }
                aVar.f213801c.putString("key_resetpwd", wVar.f412139e);
                boolean z18 = aVar.f213801c.getBoolean("realname_verify_process_need_face", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "forward: %s", java.lang.Boolean.valueOf(z18));
                com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
                if (z18) {
                    com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
                    am.jr jrVar = requestFaceVerifyForPayEvent.f54694g;
                    jrVar.f7076j = mMActivity;
                    jrVar.f7067a = (int) aVar.f213801c.getLong("realname_verify_process_face_scene");
                    jrVar.f7068b = aVar.f213801c.getString("realname_verify_process_face_package");
                    jrVar.f7069c = aVar.f213801c.getString("realname_verify_process_face_package_sign");
                    jrVar.f7074h = 1;
                    requestFaceVerifyForPayEvent.e();
                } else {
                    aVar.o(mMActivity, 0, aVar.f213801c);
                }
                return true;
            }
            if (m1Var instanceof ys4.l) {
                return true;
            }
        }
        return false;
    }
}

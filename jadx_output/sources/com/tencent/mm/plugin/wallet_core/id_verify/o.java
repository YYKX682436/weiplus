package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class o extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f179448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f179449d = aVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1 || i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        java.lang.String string = intent.getExtras().getString("token");
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179449d;
        aVar.f213801c.putString("realname_verify_process_face_token", string);
        aVar.o(this.f338833a, 0, aVar.f213801c);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179449d;
        aVar.a("onNext", objArr);
        com.tencent.mm.plugin.wallet_core.model.Authen authen = (com.tencent.mm.plugin.wallet_core.model.Authen) objArr[0];
        this.f179448c = authen;
        authen.f179542d = aVar.G();
        this.f338834b.d(new rs4.a(this.f179448c, "", aVar.f213801c.getString("key_realname_sessionid")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
            com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179449d;
            if (z17) {
                rs4.a aVar2 = (rs4.a) m1Var;
                if (aVar2.f399345f == null) {
                    aVar.f213801c.putString("kreq_token", aVar2.f399344e);
                    if (aVar.t(mMActivity, aVar.f213801c)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "need update bankcardlist");
                        this.f338834b.a(new ss4.e0(null, 12), true);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "not need update bankcardlist");
                        aVar.o(mMActivity, 0, aVar.f213801c);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                    com.tencent.mm.ui.MMActivity mMActivity2 = this.f338833a;
                    at4.y0 y0Var = aVar2.f399345f;
                    db5.e1.A(mMActivity2, y0Var.f14013a, "", y0Var.f14015c, y0Var.f14014b, new com.tencent.mm.plugin.wallet_core.id_verify.m(this), new com.tencent.mm.plugin.wallet_core.id_verify.n(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "update bankcardlist success!");
                aVar.o(mMActivity, 0, aVar.f213801c);
                return true;
            }
        }
        return false;
    }
}

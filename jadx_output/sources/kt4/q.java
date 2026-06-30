package kt4;

/* loaded from: classes9.dex */
public class q extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312047c = rVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f338833a.getIntent().getStringExtra("key_open_card_verify_msg_desc");
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f312047c.f(this.f338833a, new android.os.Bundle());
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        kt4.r rVar = this.f312047c;
        java.lang.String string = rVar.f213801c.getString("key_pwd1");
        java.lang.String string2 = rVar.f213801c.getString("key_verify_code");
        java.lang.String H = rVar.H();
        int i17 = rVar.f213801c.getInt("key_open_scene");
        jt4.g gVar = new jt4.g(kt4.r.F(rVar), H, string2, this.f338833a.getIntent().getStringExtra("key_open_card_bind_token"), string, i17);
        np5.b0 b0Var = this.f338834b;
        b0Var.c(1986);
        b0Var.e(gVar, true, 3, 0);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof jt4.g;
        np5.b0 b0Var = this.f338834b;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (z17) {
            b0Var.i(1986);
            jt4.g gVar = (jt4.g) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.qh qhVar = gVar.f301648f;
                if (qhVar.f383983d == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.x15 x15Var = gVar.f301648f.f383986g;
                    kt4.r rVar = this.f312047c;
                    if (x15Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "succ title: %s", x15Var.f389663d);
                        try {
                            rVar.f213801c.putByteArray("key_open_card_finish_title", gVar.f301648f.f383986g.toByteArray());
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                        }
                    }
                    rVar.o(mMActivity, 0, bundle);
                } else if (!jt4.f.c((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, qhVar.f383985f)) {
                    db5.e1.F(mMActivity, jt4.f.a(mMActivity, gVar.f301648f.f383984e, str), "", false);
                }
            }
            return true;
        }
        if (!(m1Var instanceof jt4.h)) {
            return false;
        }
        b0Var.i(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
        jt4.h hVar = (jt4.h) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.qz4 qz4Var = hVar.f301651f;
            if (qz4Var.f384366d == 0) {
                mMActivity.getIntent().putExtra("key_open_card_bind_token", hVar.f301651f.f384369g);
            } else if (!jt4.f.c((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, qz4Var.f384371i)) {
                int i19 = hVar.f301655m;
                java.lang.String str2 = hVar.f301656n;
                r45.qz4 qz4Var2 = hVar.f301651f;
                if (!jt4.f.b((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, hVar, i19, str2, qz4Var2.f384366d, qz4Var2.f384367e)) {
                    db5.e1.F(mMActivity, jt4.f.a(mMActivity, hVar.f301651f.f384367e, hVar.f301656n, str), "", false);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
            db5.e1.F(mMActivity, jt4.f.a(mMActivity, str), "", false);
        }
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        jt4.h hVar;
        kt4.r rVar = this.f312047c;
        int i17 = rVar.f213801c.getInt("key_select_card_action");
        java.lang.String H = rVar.H();
        int i18 = rVar.f213801c.getInt("key_verify_scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "bind action: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            hVar = new jt4.h(kt4.r.F(rVar), H, rVar.f213801c.getString("key_bind_card_no"), rVar.f213801c.getString("key_bind_mobile_no"), rVar.f213801c.getString("key_bind_bank_type"), rVar.G(), true, true, false, i18, "");
        } else {
            hVar = new jt4.h(kt4.r.F(rVar), H, rVar.f213801c.getString("key_bind_new_card_no"), rVar.f213801c.getString("key_bind_new_card_mobile"), rVar.f213801c.getString("key_bind_new_card_bank_type"), rVar.G(), false, true, false, i18, "");
        }
        np5.b0 b0Var = this.f338834b;
        b0Var.c(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
        b0Var.a(hVar, true);
        return true;
    }
}

package kt4;

/* loaded from: classes9.dex */
public class j extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312036c = rVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        this.f312036c.f(this.f338833a, bundle);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        int intValue = ((java.lang.Integer) objArr[0]).intValue();
        kt4.r rVar = this.f312036c;
        np5.b0 b0Var = this.f338834b;
        if (intValue == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "onNext do ecard auth");
            int intValue2 = ((java.lang.Integer) objArr[1]).intValue();
            java.lang.String str = (java.lang.String) objArr[2];
            b0Var.c(1958);
            b0Var.a(new jt4.i(kt4.r.F(rVar), null, intValue2, str), true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "onNext do ecard open");
            int intValue3 = ((java.lang.Integer) objArr[1]).intValue();
            b0Var.c(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
            b0Var.a(new jt4.h(kt4.r.F(rVar), rVar.H(), intValue3), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof jt4.i;
        np5.b0 b0Var = this.f338834b;
        kt4.r rVar = this.f312036c;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (z17) {
            b0Var.i(1958);
            jt4.i iVar = (jt4.i) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.oz4 oz4Var = iVar.f301659f;
                if (oz4Var.f382623d == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "req_serial: %s", iVar.f301659f.f382626g);
                    rVar.f213801c.putString("key_req_serial", iVar.f301659f.f382626g);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "authScene.token: %s, is_token_invalid: %s, is_reuse_existing_ecard: %s", null, java.lang.Boolean.valueOf(iVar.f301659f.f382628i), java.lang.Boolean.valueOf(iVar.f301659f.f382629m));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                        bundle.putBoolean("key_is_token_invalid", iVar.f301659f.f382628i);
                    }
                    if (iVar.f301659f.f382629m) {
                        bundle.putBoolean("key_is_reuse_existing_ecard", true);
                    }
                    bundle.putInt("key_ecard_proxy_action", 1);
                    rVar.o(mMActivity, 0, bundle);
                } else if (!jt4.f.c((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, oz4Var.f382627h)) {
                    int i19 = iVar.f301660g;
                    java.lang.String str2 = iVar.f301661h;
                    r45.oz4 oz4Var2 = iVar.f301659f;
                    if (!jt4.f.b((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, iVar, i19, str2, oz4Var2.f382623d, oz4Var2.f382624e)) {
                        db5.e1.G(mMActivity, jt4.f.a(mMActivity, iVar.f301659f.f382624e, iVar.f301661h, str), "", false, new kt4.f(this));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "net error: %s", iVar);
                db5.e1.G(mMActivity, jt4.f.a(mMActivity, str), "", false, new kt4.g(this));
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
                rVar.f213801c.putInt("key_select_card_action", 1);
                rVar.f213801c.putString("key_bind_card_no", hVar.f301652g);
                rVar.f213801c.putString("key_bind_mobile_no", hVar.f301653h);
                rVar.f213801c.putString("key_bind_bank_type", hVar.f301654i);
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (hVar.f301651f.f384372m != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "no need verify sms");
                    bundle2.putBoolean("key_need_verify_sms", false);
                    try {
                        rVar.f213801c.putByteArray("key_open_card_finish_title", hVar.f301651f.f384372m.toByteArray());
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "need verfiy sms");
                    bundle2.putBoolean("key_need_verify_sms", true);
                    bundle2.putString("key_open_card_bind_token", hVar.f301651f.f384369g);
                    bundle2.putString("key_open_card_verify_msg_desc", hVar.f301651f.f384370h);
                }
                bundle2.putInt("key_ecard_proxy_action", 2);
                rVar.o(mMActivity, 0, bundle2);
            } else if (!jt4.f.c((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, qz4Var.f384371i)) {
                int i27 = hVar.f301655m;
                java.lang.String str3 = hVar.f301656n;
                r45.qz4 qz4Var2 = hVar.f301651f;
                if (!jt4.f.b((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity, hVar, i27, str3, qz4Var2.f384366d, qz4Var2.f384367e)) {
                    db5.e1.G(mMActivity, jt4.f.a(mMActivity, hVar.f301651f.f384367e, hVar.f301656n, str), "", false, new kt4.h(this));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
            db5.e1.G(mMActivity, jt4.f.a(mMActivity, str), "", false, new kt4.i(this));
        }
        return true;
    }
}

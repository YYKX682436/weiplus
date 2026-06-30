package kt4;

/* loaded from: classes9.dex */
public class o extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312045c = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = ((com.tencent.mm.plugin.wallet_core.model.ElementQuery) objArr[0]).f179659s;
        kt4.r rVar = this.f312045c;
        java.lang.String string = rVar.f213801c.getString("key_bind_new_card_no");
        java.lang.String string2 = rVar.f213801c.getString("key_bind_new_card_mobile");
        np5.b0 b0Var = this.f338834b;
        b0Var.c(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
        b0Var.a(new jt4.h(kt4.r.F(rVar), rVar.H(), string, string2, str, rVar.G(), false, false, 0, ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof jt4.h)) {
            return false;
        }
        this.f338834b.i(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
        jt4.h hVar = (jt4.h) m1Var;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0 && i18 == 0) {
            r45.qz4 qz4Var = hVar.f301651f;
            if (qz4Var.f384366d == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                r45.x15 x15Var = hVar.f301651f.f384372m;
                kt4.r rVar = this.f312045c;
                if (x15Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "no need verify sms");
                    bundle.putBoolean("key_need_verify_sms", false);
                    try {
                        rVar.f213801c.putByteArray("key_open_card_finish_title", hVar.f301651f.f384372m.toByteArray());
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "need verfiy sms");
                    bundle.putBoolean("key_need_verify_sms", true);
                    bundle.putString("key_open_card_bind_token", hVar.f301651f.f384369g);
                    bundle.putString("key_open_card_verify_msg_desc", hVar.f301651f.f384370h);
                }
                rVar.o(mMActivity, 0, bundle);
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
}

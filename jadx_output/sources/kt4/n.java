package kt4;

/* loaded from: classes9.dex */
public class n extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f312043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.r f312044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kt4.r rVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f312044d = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        r45.od odVar = (r45.od) objArr[0];
        kt4.r rVar = this.f312044d;
        java.lang.String string = rVar.f213801c.getString("key_req_serial", "");
        if (odVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenECardProcess", "empty bank item");
            return false;
        }
        np5.b0 b0Var = this.f338834b;
        b0Var.c(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT);
        java.lang.String format = java.lang.String.format("%s %s(%s)", odVar.f382154d, odVar.f382156f, odVar.f382158h);
        rVar.f213801c.putInt("key_verify_scene", 1);
        b0Var.d(new jt4.h(kt4.r.F(rVar), string, odVar.f382159i, odVar.f382157g, odVar.f382155e, rVar.G(), true, false, 1, format), true);
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
                if (qz4Var.f384373n != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenECardProcess", "show input alert");
                    r45.wz3 wz3Var = hVar.f301651f.f384373n;
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f312043c;
                    if (j0Var == null) {
                        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f488719a52, null);
                        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.dg7);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dg8);
                        textView.setClickable(true);
                        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(mMActivity));
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wz3Var.f389596e)) {
                            editText.setHint(hVar.f301651f.f384373n.f389596e);
                        }
                        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                        aVar.f211709a = hVar.f301651f.f384373n.f389595d;
                        aVar.P = 4;
                        aVar.L = inflate;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wz3Var.f389600i)) {
                            aVar.f211732v = wz3Var.f389600i;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wz3Var.f389599h)) {
                            aVar.f211733w = wz3Var.f389599h;
                        }
                        aVar.E = new kt4.l(this, editText, hVar, textView);
                        aVar.Z = false;
                        aVar.A = false;
                        aVar.H = new kt4.m(this);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(mMActivity, com.tencent.mm.R.style.f494791wd);
                        j0Var2.e(aVar);
                        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                        if (d0Var != null) {
                            d0Var.a(j0Var2.f211837r);
                        }
                        this.f312043c = j0Var2;
                        g(wz3Var, textView);
                        this.f312043c.show();
                    } else {
                        g(wz3Var, (android.widget.TextView) j0Var.findViewById(com.tencent.mm.R.id.dg8));
                    }
                } else {
                    kt4.r rVar = this.f312044d;
                    rVar.f213801c.putInt("key_select_card_action", 1);
                    rVar.f213801c.putString("key_bind_card_no", hVar.f301652g);
                    rVar.f213801c.putString("key_bind_mobile_no", hVar.f301653h);
                    rVar.f213801c.putString("key_bind_bank_type", hVar.f301654i);
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (hVar.f301651f.f384372m != null) {
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
                }
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

    public final void g(r45.wz3 wz3Var, android.widget.TextView textView) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        r45.td0 td0Var = wz3Var.f389597f;
        if (td0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(td0Var.f386319d)) {
            spannableStringBuilder.append((java.lang.CharSequence) wz3Var.f389597f.f386319d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wz3Var.f389597f.f386320e)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.plugin.wallet_core.utils.z1.b(wz3Var.f389597f.f386320e, false)), 0, spannableStringBuilder.length(), 18);
            }
        }
        r45.td0 td0Var2 = wz3Var.f389598g;
        if (td0Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(td0Var2.f386319d)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) wz3Var.f389598g.f386319d);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(wz3Var.f389598g.f386320e, new kt4.k(this)), length, spannableStringBuilder.length(), 18);
        }
        textView.setText(spannableStringBuilder);
    }
}

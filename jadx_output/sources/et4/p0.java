package et4;

/* loaded from: classes9.dex */
public class p0 implements nz2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et4.q0 f256651a;

    public p0(et4.q0 q0Var) {
        this.f256651a = q0Var;
    }

    @Override // nz2.d
    public void onFail(nz2.e eVar) {
        et4.q0 q0Var;
        int i17 = eVar.f341550b;
        et4.q0 q0Var2 = this.f256651a;
        q0Var2.f256656d = i17;
        re4.n.f(2);
        int i18 = eVar.f341551c.f341543a;
        if (i18 == 2005 || i18 == 2007) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 36);
        }
        q0Var2.f256657e.dismiss();
        et4.r0 r0Var = q0Var2.f256657e.f180228m;
        if (r0Var != null) {
            boolean z17 = eVar.f341552d;
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "verify failed");
            int i19 = com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.f180198y0;
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = uVar.f256662a;
            wcPayCashierDialog.F(true);
            wcPayCashierDialog.f180212r.setText(com.tencent.mm.R.string.klu);
            wcPayCashierDialog.f180212r.setVisibility(0);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
            payInfo.f192125x = 0;
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = wcPayCashierDialog.E;
            payInfo.D = (wcPayCashierFingerprintDialog == null || (q0Var = wcPayCashierFingerprintDialog.f180227i) == null) ? 0 : q0Var.f256656d;
            payInfo.f192127z = z17 | payInfo.f192127z;
            wcPayCashierDialog.f180200d.setVisibility(0);
            wcPayCashierDialog.E = null;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = wcPayCashierDialog.L;
            com.tencent.mm.wallet_core.model.a2.a(payInfo2 == null ? 0 : payInfo2.f192109e, payInfo2 == null ? "" : payInfo2.f192114m, 23, "");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = wcPayCashierDialog.L;
            com.tencent.mm.wallet_core.model.a2.a(payInfo3 != null ? payInfo3.f192109e : 0, payInfo3 == null ? "" : payInfo3.f192114m, 25, "");
            q0Var2.f256657e.f180228m = null;
        }
    }

    @Override // nz2.d
    public void onRetry(nz2.e eVar) {
        et4.q0 q0Var = this.f256651a;
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = q0Var.f256657e;
        wcPayCashierFingerprintDialog.f180225g.setImageDrawable(com.tencent.mm.ui.uk.e(wcPayCashierFingerprintDialog.getContext(), com.tencent.mm.R.raw.icons_outlined_pay_fingerprint_android, wcPayCashierFingerprintDialog.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac)));
        wcPayCashierFingerprintDialog.f180226h.setTextColor(wcPayCashierFingerprintDialog.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
        wcPayCashierFingerprintDialog.f180224f.setVisibility(0);
        wcPayCashierFingerprintDialog.f180224f.setOnClickListener(new et4.n0(wcPayCashierFingerprintDialog));
        com.tencent.mm.sdk.platformtools.u3.i(new et4.o0(wcPayCashierFingerprintDialog), 500L);
        q0Var.f256656d = eVar.f341550b;
        re4.n.f(1);
    }

    @Override // nz2.d
    public void onSuccess(nz2.e eVar) {
        et4.q0 q0Var = this.f256651a;
        q0Var.f256657e.e();
        q0Var.f256656d = eVar.f341550b;
        q0Var.f256657e.dismiss();
        et4.r0 r0Var = q0Var.f256657e.f180228m;
        if (r0Var != null) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = ((et4.u) r0Var).f256662a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "verify succeeded: %s", java.lang.Boolean.valueOf(wcPayCashierDialog.Q));
            if (!wcPayCashierDialog.Q) {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
                com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 22, "");
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = wcPayCashierDialog.L;
                payInfo2.f192125x = 1;
                nz2.c cVar = eVar.f341551c;
                payInfo2.A = cVar.f341545c;
                payInfo2.B = cVar.f341546d;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", eVar.f341551c.f341547e);
                    jSONObject.put("signature", eVar.f341551c.f341548f);
                    jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                    wcPayCashierDialog.L.G = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayCashierDialog", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = wcPayCashierDialog.L;
                payInfo3.C = eVar.f341551c.f341544b;
                payInfo3.D = eVar.f341550b;
                wcPayCashierDialog.f180200d.setVisibility(0);
                wcPayCashierDialog.E = null;
                com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.e(wcPayCashierDialog, "", wcPayCashierDialog.L, wcPayCashierDialog.N);
            }
            q0Var.f256657e.f180228m = null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 37);
        re4.n.f(0);
    }
}

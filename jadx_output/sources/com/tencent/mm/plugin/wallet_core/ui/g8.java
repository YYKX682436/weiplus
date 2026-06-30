package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent f180290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180291e;

    public g8(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var, com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent) {
        this.f180291e = n8Var;
        this.f180290d = openFingerPrintAuthEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
        am.pn pnVar = this.f180290d.f54596h;
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180291e;
        if (pnVar == null) {
            n8Var.X.f192125x = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
            return;
        }
        int i17 = pnVar.f7635a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", pnVar.f7639e);
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = n8Var.X;
            com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 22, "");
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = n8Var.X;
            payInfo2.f192125x = 1;
            payInfo2.A = pnVar.f7636b;
            payInfo2.B = pnVar.f7637c;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
                jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                n8Var.X.G = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletPwdDialog", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo3 = n8Var.X;
            payInfo3.C = pnVar.f7638d;
            payInfo3.D++;
            n8Var.P.setText("");
            n8Var.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
            re4.n.f(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo4 = n8Var.X;
        com.tencent.mm.wallet_core.model.a2.a(payInfo4 == null ? 0 : payInfo4.f192109e, payInfo4 == null ? "" : payInfo4.f192114m, 23, "");
        n8Var.X.f192125x = 0;
        android.view.View view = n8Var.N;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n8Var.P.setTextColor(n8Var.getContext().getResources().getColor(com.tencent.mm.R.color.a2y));
        n8Var.P.setText(com.tencent.mm.R.string.klt);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = currentTimeMillis - n8Var.V;
        if (i18 > 1) {
            n8Var.V = currentTimeMillis;
            n8Var.U++;
            n8Var.X.D++;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
        boolean z17 = i17 == 2 || i17 == 10308;
        boolean z18 = pnVar.f7640f == 2;
        int i19 = n8Var.U;
        if ((z18 || (i19 < 3 && i18 > 1)) && !z17) {
            if (n8Var.W == null) {
                n8Var.W = na5.e.a(n8Var.getContext());
            }
            n8Var.Q.setVisibility(8);
            n8Var.P.setVisibility(4);
            n8Var.W.reset();
            n8Var.W.setAnimationListener(new com.tencent.mm.plugin.wallet_core.ui.f8(this));
            n8Var.P.startAnimation(n8Var.W);
            re4.n.f(1);
            return;
        }
        if (i19 >= 3 || z17) {
            n8Var.h();
            n8Var.R = 0;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            n8Var.Y = android.os.SystemClock.elapsedRealtime();
            n8Var.M.setVisibility(8);
            android.view.View view2 = n8Var.N;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n8Var.P.setVisibility(0);
            n8Var.P.setText(com.tencent.mm.R.string.klu);
            n8Var.P.setTextColor(n8Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479548aa5));
            n8Var.f180526i.setText(com.tencent.mm.R.string.kwv);
            n8Var.f180535t.setVisibility(0);
            if (!n8Var.f180524g.isShown()) {
                android.view.View view3 = n8Var.f180524g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            re4.n.f(2);
            com.tencent.mm.plugin.wallet_core.ui.n8.u(true);
        }
    }
}

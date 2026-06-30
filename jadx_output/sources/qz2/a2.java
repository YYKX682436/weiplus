package qz2;

/* loaded from: classes9.dex */
public final class a2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367839d;

    public a2(qz2.i2 i2Var) {
        this.f367839d = i2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        qz2.t1 t1Var = (qz2.t1) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "on receive event: " + t1Var);
        boolean z17 = t1Var instanceof qz2.n1;
        qz2.i2 i2Var = this.f367839d;
        if (z17) {
            android.os.Bundle e17 = com.tencent.mm.wallet_core.a.e(i2Var.getActivity());
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "contextdata is null,for that reason program can't get user pwd");
                re4.n.g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
                i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.f_k)));
                return;
            }
            java.lang.String string = e17.getString("pwd");
            if (android.text.TextUtils.isEmpty(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "get user pwd error");
                re4.n.g(1000, -1000223, -1, "get user pwd error");
                i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.f_k)));
                return;
            }
            nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
            if (!oVar.ja()) {
                i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.kut)));
                return;
            } else {
                if (!oVar.Je()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "device is not support FingerPrintAuth");
                    return;
                }
                ju5.n.c().b();
                kotlin.jvm.internal.o.d(string);
                i2Var.P6(new qz2.r1(string));
                return;
            }
        }
        if (t1Var instanceof qz2.r1) {
            i2Var.O6(qz2.x1.f367926a);
            java.lang.String str = ((qz2.r1) t1Var).f367907a;
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
            i2Var.f367874d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: start gen auth key");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 35);
            java.lang.Object value = ((jz5.n) i2Var.f367875e).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            qz2.g2 g2Var = new qz2.g2(i2Var);
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((ne4.n) ((d50.q) value)).b(g2Var, true, 1, new oz2.c(str, 1), 0);
            return;
        }
        if (t1Var instanceof qz2.m1) {
            androidx.appcompat.app.AppCompatActivity activity = i2Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).doSceneProgress(new oz2.a(1), false);
            return;
        }
        if (t1Var instanceof qz2.s1) {
            i2Var.O6(qz2.u1.f367914a);
            java.lang.String str2 = ((qz2.s1) t1Var).f367910a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "request authentication");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayUIC", "no challenge!!");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 41);
            nz2.o oVar2 = (nz2.o) gm0.j1.s(nz2.o.class);
            nz2.f fVar = new nz2.f(str2, 1);
            fVar.f341556d = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.heh);
            fVar.f341557e = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.heg);
            fVar.f341558f = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490347sg);
            oVar2.g9(i2Var.getContext(), fVar, new qz2.h2(i2Var));
            return;
        }
        if (t1Var instanceof qz2.o1) {
            androidx.appcompat.app.AppCompatActivity activity2 = i2Var.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
            qz2.o1 o1Var = (qz2.o1) t1Var;
            java.lang.String str3 = o1Var.f367897a;
            java.lang.String str4 = i2Var.f367874d;
            ((d50.i) kVar).getClass();
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).doSceneProgress(new oz2.b(str3, o1Var.f367898b, str4, 1), true);
            return;
        }
        if (t1Var instanceof qz2.l1) {
            androidx.appcompat.app.AppCompatActivity activity3 = i2Var.getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity3).doSceneProgress(new ss4.e0(null, 19), true);
        } else if (t1Var instanceof qz2.p1) {
            com.tencent.mm.wallet_core.a.c(i2Var.getActivity(), new android.os.Bundle(), 0);
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f_l, 0).show();
        } else if (t1Var instanceof qz2.q1) {
            com.tencent.mm.wallet_core.a.c(i2Var.getActivity(), new android.os.Bundle(), ((qz2.q1) t1Var).f367904a);
        }
    }
}

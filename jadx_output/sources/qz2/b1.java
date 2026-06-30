package qz2;

/* loaded from: classes9.dex */
public final class b1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367844d;

    public b1(qz2.j1 j1Var) {
        this.f367844d = j1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        qz2.t0 t0Var = (qz2.t0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive event: " + t0Var);
        boolean z17 = t0Var instanceof qz2.n0;
        qz2.j1 j1Var = this.f367844d;
        if (z17) {
            java.lang.String stringExtra = j1Var.getIntent().getStringExtra("kindaPayPwd");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "password is null");
                j1Var.getActivity().finish();
                return;
            }
            nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
            if (!oVar.ja()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "not enrolled fingerprint");
                j1Var.getActivity().finish();
                return;
            } else if (mz2.m0.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "has opened touch pay");
                j1Var.getActivity().finish();
                return;
            } else if (oVar.Je()) {
                ju5.n.c().b();
                j1Var.P6(new qz2.r0(stringExtra));
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "can't use soter");
                j1Var.getActivity().finish();
                return;
            }
        }
        if (t0Var instanceof qz2.r0) {
            j1Var.O6(qz2.x0.f367925a);
            java.lang.String str = ((qz2.r0) t0Var).f367906a;
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
            j1Var.f367879d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: start gen auth key");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 35);
            java.lang.Object value = ((jz5.n) j1Var.f367880e).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            qz2.h1 h1Var = new qz2.h1(j1Var);
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((ne4.n) ((d50.q) value)).b(h1Var, true, 1, new oz2.c(str, 1), 0);
            return;
        }
        if (t0Var instanceof qz2.m0) {
            androidx.appcompat.app.AppCompatActivity activity = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).doSceneProgress(new oz2.a(1), false);
            return;
        }
        if (t0Var instanceof qz2.s0) {
            j1Var.O6(qz2.u0.f367913a);
            java.lang.String str2 = ((qz2.s0) t0Var).f367909a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "request authentication");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "no challenge!!");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 41);
            nz2.o oVar2 = (nz2.o) gm0.j1.s(nz2.o.class);
            nz2.f fVar = new nz2.f(str2, 1);
            fVar.f341556d = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.heh);
            fVar.f341557e = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.heg);
            fVar.f341558f = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490347sg);
            oVar2.g9(j1Var.getContext(), fVar, new qz2.i1(j1Var));
            return;
        }
        if (t0Var instanceof qz2.o0) {
            androidx.appcompat.app.AppCompatActivity activity2 = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
            qz2.o0 o0Var = (qz2.o0) t0Var;
            java.lang.String str3 = o0Var.f367895a;
            java.lang.String str4 = j1Var.f367879d;
            ((d50.i) kVar).getClass();
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).doSceneProgress(new oz2.b(str3, o0Var.f367896b, str4, 1), true);
            return;
        }
        if (t0Var instanceof qz2.l0) {
            androidx.appcompat.app.AppCompatActivity activity3 = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity3).doSceneProgress(new ss4.e0(null, 19), true);
        } else if (t0Var instanceof qz2.p0) {
            db5.e1.E(j1Var.getActivity(), j1Var.getString(com.tencent.mm.R.string.f_m), j1Var.getString(com.tencent.mm.R.string.f_j), j1Var.getString(com.tencent.mm.R.string.kuq), false, new qz2.a1(j1Var));
        } else if (t0Var instanceof qz2.q0) {
            j1Var.getActivity().finish();
        }
    }
}

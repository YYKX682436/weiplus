package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f180921a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f180922b;

    public l0(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f180922b = mMActivity;
    }

    public static void a(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, r45.n34 n34Var) {
        l0Var.getClass();
        if (n34Var == null) {
            return;
        }
        int i17 = n34Var.f381049e;
        com.tencent.mm.ui.MMActivity mMActivity = l0Var.f180922b;
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n34Var.f381050f);
            com.tencent.mm.wallet_core.ui.r1.T(mMActivity, intent);
        } else if (i17 == 4) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = n34Var.f381051g;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            nxVar.f7467b = n34Var.f381052h;
            nxVar.f7469d = 1034;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
        }
        if (l0Var.f180921a) {
            mMActivity.finish();
        }
    }

    public static boolean d(com.tencent.mm.plugin.wallet_core.utils.n nVar) {
        return (nVar == null || nVar.f180935d == 0) ? false : true;
    }

    public static boolean e(r45.g04 g04Var) {
        return (g04Var == null || g04Var.f374780g == 0) ? false : true;
    }

    public void b(com.tencent.mm.plugin.wallet_core.utils.n nVar, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var) {
        int i17 = nVar.f180936e;
        com.tencent.mm.ui.MMActivity mMActivity = this.f180922b;
        if (i17 != 2) {
            int i18 = nVar.f180935d;
            if (i18 != 1) {
                if (i18 == 2) {
                    db5.e1.C(this.f180922b, nVar.f180932a, "", nVar.f180934c.f381048d, nVar.f180933b.f381048d, false, new com.tencent.mm.plugin.wallet_core.utils.d0(this, k0Var, nVar), new com.tencent.mm.plugin.wallet_core.utils.e0(this, k0Var, nVar));
                    return;
                }
                return;
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(nVar.f180933b.f381048d) && mMActivity != null) {
                    nVar.f180933b.f381048d = mMActivity.getString(com.tencent.mm.R.string.f490939bb1);
                }
                db5.e1.E(this.f180922b, nVar.f180932a, "", nVar.f180933b.f381048d, false, new com.tencent.mm.plugin.wallet_core.utils.c0(this, k0Var, nVar));
                return;
            }
        }
        int i19 = nVar.f180938g;
        boolean z17 = (i19 == 2 || i19 == 3) || !com.tencent.mm.sdk.platformtools.t8.K0(nVar.f180937f);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = z17 ? new com.tencent.mm.ui.widget.dialog.z2(mMActivity, 1, 3, false) : new com.tencent.mm.ui.widget.dialog.z2(mMActivity, 1, 0, false);
        int i27 = nVar.f180935d;
        if (i27 == 1) {
            z2Var.y(nVar.f180933b.f381048d);
            z2Var.F = new com.tencent.mm.plugin.wallet_core.utils.f0(this, k0Var, nVar, z2Var);
            com.tencent.mm.ui.bk.s0(z2Var.f212072x.getPaint());
        } else if (i27 == 2) {
            z2Var.m(nVar.f180933b.f381048d, nVar.f180934c.f381048d);
            com.tencent.mm.plugin.wallet_core.utils.g0 g0Var = new com.tencent.mm.plugin.wallet_core.utils.g0(this, k0Var, nVar, z2Var);
            com.tencent.mm.plugin.wallet_core.utils.h0 h0Var = new com.tencent.mm.plugin.wallet_core.utils.h0(this, k0Var, nVar, z2Var);
            z2Var.D = g0Var;
            z2Var.E = h0Var;
            com.tencent.mm.ui.bk.s0(z2Var.f212068t.getPaint());
            com.tencent.mm.ui.bk.s0(z2Var.f212069u.getPaint());
        }
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.cec, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(nVar.f180937f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.gw7);
        weImageView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.utils.i0(this, z2Var));
        int i28 = nVar.f180938g;
        if (i28 == 2) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_close);
        } else if (i28 == 3) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_back);
        } else {
            weImageView.setVisibility(8);
        }
        android.view.View inflate2 = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.ceb, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.gw8);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        textView2.setText(nVar.f180932a);
        if (z17) {
            z2Var.s(inflate);
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.topMargin = i65.a.b(mMActivity, 40);
            textView.setLayoutParams(layoutParams);
        }
        z2Var.j(inflate2);
        z2Var.C();
    }

    public void c(r45.g04 g04Var, com.tencent.mm.plugin.wallet_core.utils.k0 k0Var) {
        b(com.tencent.mm.plugin.wallet_core.utils.n.b(g04Var), k0Var);
    }
}

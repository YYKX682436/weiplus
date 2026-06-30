package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class t5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180626a;

    public t5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f180626a = walletOrderInfoNewUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180626a;
        walletOrderInfoNewUI.X1 = null;
        walletOrderInfoNewUI.G1.setVisibility(8);
        walletOrderInfoNewUI.E1.setVisibility(0);
        int i17 = 2;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(((r45.h10) fVar.f70618d).f375745d), ((r45.h10) fVar.f70618d).f375746e);
            if (((r45.h10) fVar.f70618d).f375745d == 0) {
                walletOrderInfoNewUI.P1 = true;
                a36.d dVar = walletOrderInfoNewUI.M1.f1115r;
                if (dVar.f1122m == 1 && !walletOrderInfoNewUI.Z1) {
                    a36.h hVar = dVar.f1123n;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "show card mch alert");
                    if (hVar != null) {
                        walletOrderInfoNewUI.Z1 = true;
                        androidx.appcompat.app.AppCompatActivity context = walletOrderInfoNewUI.getContext();
                        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                        aVar.f211709a = hVar.f1145d;
                        android.view.View inflate = android.view.View.inflate(walletOrderInfoNewUI.getContext(), com.tencent.mm.R.layout.f488340qm, null);
                        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.bzz);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bzy);
                        cdnImageView.setUrl(hVar.f1147f);
                        textView.setText(hVar.f1146e);
                        aVar.L = inflate;
                        aVar.f211732v = hVar.f1148g;
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                        j0Var.e(aVar);
                        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f211837r);
                        }
                        j0Var.show();
                        walletOrderInfoNewUI.addDialog(j0Var);
                    }
                    i17 = 1;
                }
                walletOrderInfoNewUI.k7();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 1, 1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 1, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17270, walletOrderInfoNewUI.f180032p, walletOrderInfoNewUI.M1.f1115r.f1126q, 1, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return null;
    }
}

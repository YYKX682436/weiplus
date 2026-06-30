package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class d3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rr6 f178988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f178989b;

    public d3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI, r45.rr6 rr6Var) {
        this.f178989b = walletUniversalPayOrderUI;
        this.f178988a = rr6Var;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        r45.qr6 qr6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "click switch: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f178989b;
        walletUniversalPayOrderUI.f178958d.setDragEnabled(z17);
        r45.rr6 rr6Var = this.f178988a;
        if (z17) {
            if (rr6Var.f385161n != 1 || (qr6Var = rr6Var.f385162o) == null || com.tencent.mm.sdk.platformtools.t8.K0(qr6Var.f384231d)) {
                com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.U6(walletUniversalPayOrderUI);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "show open dialog");
                r45.qr6 qr6Var2 = rr6Var.f385162o;
                androidx.appcompat.app.AppCompatActivity context = walletUniversalPayOrderUI.getContext();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211709a = qr6Var2.f384231d;
                aVar.f211729s = qr6Var2.f384232e;
                aVar.A = false;
                r45.b74 b74Var = qr6Var2.f384233f;
                if (b74Var != null) {
                    aVar.f211733w = b74Var.f370602d;
                    aVar.F = new com.tencent.mm.plugin.wallet.pwd.ui.z2(this);
                }
                r45.b74 b74Var2 = qr6Var2.f384234g;
                if (b74Var2 != null) {
                    aVar.f211732v = b74Var2.f370602d;
                    aVar.E = new com.tencent.mm.plugin.wallet.pwd.ui.a3(this);
                }
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                walletUniversalPayOrderUI.addDialog(j0Var);
                j0Var.show();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 3);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 2);
            return;
        }
        if (walletUniversalPayOrderUI.f178969r) {
            walletUniversalPayOrderUI.f178969r = false;
            r45.qr6 qr6Var3 = rr6Var.f385163p;
            if (qr6Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(qr6Var3.f384231d)) {
                com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.V6(walletUniversalPayOrderUI);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "show close dialog");
                r45.qr6 qr6Var4 = rr6Var.f385163p;
                androidx.appcompat.app.AppCompatActivity context2 = walletUniversalPayOrderUI.getContext();
                com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                aVar2.f211709a = qr6Var4.f384231d;
                aVar2.f211729s = qr6Var4.f384232e;
                aVar2.A = false;
                r45.b74 b74Var3 = qr6Var4.f384233f;
                if (b74Var3 != null) {
                    aVar2.f211733w = b74Var3.f370602d;
                    aVar2.F = new com.tencent.mm.plugin.wallet.pwd.ui.b3(this);
                }
                r45.b74 b74Var4 = qr6Var4.f384234g;
                if (b74Var4 != null) {
                    aVar2.f211732v = b74Var4.f370602d;
                    aVar2.E = new com.tencent.mm.plugin.wallet.pwd.ui.c3(this);
                }
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context2, com.tencent.mm.R.style.f494791wd);
                j0Var2.e(aVar2);
                com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var2.f211837r);
                }
                walletUniversalPayOrderUI.addDialog(j0Var2);
                j0Var2.show();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 7);
            }
        } else {
            com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI.V6(walletUniversalPayOrderUI);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 6);
    }
}

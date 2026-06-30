package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.b4 f152583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.offline.ui.b4 b4Var) {
        super(1);
        this.f152583d = b4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.offline.ui.b4 b4Var = this.f152583d;
        b4Var.f152591a.hideLoading();
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEnableUIC", "enable token response: " + fVar.f70615a + ", " + fVar.f70616b + ", " + ((r45.dy4) fVar.f70618d).f372853d);
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = b4Var.f152591a;
        if (i17 != 0 || fVar.f70616b != 0) {
            db5.e1.y(walletCheckPwdNewUI, walletCheckPwdNewUI.getString(com.tencent.mm.R.string.krl), "", walletCheckPwdNewUI.getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.plugin.offline.ui.z3(b4Var));
            walletCheckPwdNewUI.f179978g.a();
            return null;
        }
        r45.dy4 dy4Var = (r45.dy4) fVar.f70618d;
        int i18 = dy4Var.f372853d;
        if (i18 == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
            walletCheckPwdNewUI.setResult(-1);
            walletCheckPwdNewUI.finish();
            return null;
        }
        if (np5.t.a(walletCheckPwdNewUI, fVar.f70619e, 1000, i18, dy4Var.f372854e) || com.tencent.mm.sdk.platformtools.t8.K0(((r45.dy4) fVar.f70618d).f372854e)) {
            return null;
        }
        db5.e1.t(walletCheckPwdNewUI, ((r45.dy4) fVar.f70618d).f372854e, "", new com.tencent.mm.plugin.offline.ui.y3(b4Var));
        return null;
    }
}

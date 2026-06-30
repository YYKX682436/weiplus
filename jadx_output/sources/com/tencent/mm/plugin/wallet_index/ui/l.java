package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class l implements com.tencent.mm.plugin.wallet_index.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public int f181181a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f181182b = "";

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181183c;

    public l(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181183c = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public int a() {
        return 1563;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = this.f181183c.f181086h;
        this.f181181a = walletJsapiData.C;
        ot4.a aVar = new ot4.a(walletJsapiData.f192129d, walletJsapiData.f192132g, walletJsapiData.f192133h, walletJsapiData.f192134i, walletJsapiData.f192138p, walletJsapiData.f192131f, walletJsapiData.f192140r, walletJsapiData.f192141s, walletJsapiData.f192144v, null);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(aVar);
        return aVar;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public java.lang.String c() {
        return this.f181182b;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181183c;
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ot4.a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: gen prepay failed! errType: %d, errCode: %d, errmsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            db5.e1.u(walletBrandUI, str, "", new com.tencent.mm.plugin.wallet_index.ui.m(this), new com.tencent.mm.plugin.wallet_index.ui.n(this));
            return;
        }
        ot4.a aVar = (ot4.a) m1Var;
        java.lang.String str2 = aVar.f348866f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hy: gen prepay success! url is: %s", str2);
        this.f181182b = str2;
        r45.x57 Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(str2);
        if (Di != null && !com.tencent.mm.sdk.platformtools.t8.K0(Di.f389803d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "start hk native cashier");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("attach", Di.f389803d);
            bundle.putInt("cashierType", Di.f389806g);
            ((h45.q) i95.n0.c(h45.q.class)).handleHKNativeCashier(walletBrandUI.getContext(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.wallet_index.ui.l$$a
                @Override // h45.k
                public final void a(int i19) {
                    com.tencent.mm.plugin.wallet_index.ui.l lVar = com.tencent.mm.plugin.wallet_index.ui.l.this;
                    lVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i19));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("is_from_native", "1");
                    com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI2 = lVar.f181183c;
                    if (i19 == 1) {
                        walletBrandUI2.setResult(-1, intent);
                    } else if (i19 == -1 || i19 == -2) {
                        walletBrandUI2.setResult(0, intent);
                    }
                    walletBrandUI2.finish();
                }
            });
            return;
        }
        java.lang.String str3 = aVar.f348867g;
        if (this.f181181a == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("url", str2);
            intent.putExtra("jsInjectCode", str3);
            walletBrandUI.setResult(-1, intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str2);
            intent2.putExtra("showShare", true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                intent2.putExtra("shouldForceViewPort", true);
                intent2.putExtra("view_port_code", str3);
            }
            com.tencent.mm.wallet_core.ui.r1.T(walletBrandUI.getContext(), intent2);
            walletBrandUI.setResult(-1);
        }
        walletBrandUI.finish();
    }
}

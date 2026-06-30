package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class x0 implements com.tencent.mm.plugin.wallet_index.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f181222a = hashCode() & 65535;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_index.ui.f f181223b = null;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.ui.e f181224c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181225d;

    public x0(com.tencent.mm.plugin.wallet_index.ui.e eVar, com.tencent.mm.sdk.event.IListener iListener) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet create");
        this.f181224c = eVar;
        this.f181225d = iListener;
        iListener.alive();
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public int a() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void b(com.tencent.mm.ui.MMActivity mMActivity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet onDestroy");
        this.f181225d.dead();
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public boolean c(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        int i19 = this.f181222a;
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "onPayEnd requestCode : %d,payResult : %d,SIMPLE_PAY : %d, data is null : %b", objArr);
        if (i17 == i19 && this.f181223b != null) {
            nt4.f a17 = i18 == -1 ? (intent == null || intent.getIntExtra("key_jsapi_pay_err_code", 0) != 0) ? nt4.f.a(5) : nt4.f.a(0) : i18 == 0 ? nt4.f.a(1) : nt4.f.a(6);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "wxpay result : %s", a17);
            com.tencent.mm.plugin.wallet_index.ui.e eVar = this.f181224c;
            this.f181223b.a(a17, new mt4.e(eVar.f181163l, eVar.f181161j, eVar.f181160i, eVar.f181159h));
            this.f181223b = null;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void d(com.tencent.mm.ui.MMActivity mMActivity, java.util.ArrayList arrayList, com.tencent.mm.plugin.wallet_index.ui.f fVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        if (fVar != null) {
            nt4.f a17 = nt4.f.a(0);
            com.tencent.mm.plugin.wallet_index.ui.e eVar = this.f181224c;
            fVar.a(a17, new mt4.e(eVar.f181163l, eVar.f181161j, eVar.f181160i, eVar.f181159h));
        }
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public void e(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", 0);
        intent.putExtra("key_err_msg", "");
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.d
    public int f(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.wallet_index.ui.f fVar) {
        com.tencent.mm.plugin.wallet_index.ui.e eVar = this.f181224c;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "[alex] WeiXinWallet launchPay MiniProgram:%b,taskid:%d,scene:%d,rawscene:%d", java.lang.Boolean.valueOf(eVar.f181165n), java.lang.Integer.valueOf(mMActivity.getTaskId()), java.lang.Integer.valueOf(eVar.f181169r), java.lang.Integer.valueOf(eVar.f181170s));
        com.tencent.mm.wallet_core.model.n1.f213951a = java.lang.System.currentTimeMillis();
        this.f181223b = fVar;
        boolean z17 = eVar.f181165n;
        int i17 = this.f181222a;
        if (z17) {
            r45.py3 py3Var = eVar.f181154c;
            if (py3Var != null) {
                com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData();
                r45.p35 p35Var = py3Var.f383477i;
                walletJsapiData.f192129d = p35Var.f382699d;
                walletJsapiData.f192133h = p35Var.f382700e;
                walletJsapiData.f192132g = p35Var.f382701f;
                walletJsapiData.f192134i = p35Var.f382703h;
                walletJsapiData.f192131f = p35Var.f382702g;
                walletJsapiData.f192138p = py3Var.f383476h;
                walletJsapiData.f192142t = py3Var.f383472d;
                walletJsapiData.f192144v = 33;
                walletJsapiData.F = "key_from_scene_appbrandgame";
                walletJsapiData.f192143u = i17;
                int i18 = eVar.f181169r;
                if (i18 > 0) {
                    walletJsapiData.f192146x = i18;
                }
                h45.a0.d(mMActivity, walletJsapiData, i17, null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeiXinWallet", "[alex] mIapData.iapWxPayData is null");
            }
        } else {
            boolean isSwitch2InWxAppPay = ((h45.q) i95.n0.c(h45.q.class)).isSwitch2InWxAppPay(eVar.f181154c.f383474f);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeiXinWallet", "doEmojiReward, isSwitch2InWxAppPay:%b", java.lang.Boolean.valueOf(isSwitch2InWxAppPay));
            if (isSwitch2InWxAppPay) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("prepayId", eVar.f181154c.f383474f);
                bundle.putInt("payScene", 5);
                bundle.putInt("payChannel", 0);
                ((h45.q) i95.n0.c(h45.q.class)).startInWxAppPayUseCase(mMActivity, bundle);
            } else {
                com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
                r45.py3 py3Var2 = eVar.f181154c;
                payInfo.f192114m = py3Var2.f383474f;
                payInfo.f192118q = py3Var2.f383475g;
                payInfo.f192119r = py3Var2.f383476h;
                payInfo.f192109e = 5;
                h45.a0.f(mMActivity, payInfo, i17);
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeiXinWallet", "launchPay return SIMPLE_PAY:%d", java.lang.Integer.valueOf(i17));
        return i17;
    }
}

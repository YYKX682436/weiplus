package com.tencent.mm.plugin.wallet.bind.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletUnbindBankCardProxyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178601d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178602e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f178603f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.HashMap hashMap;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        setResult(0);
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "intent is null");
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("packageExt");
        this.f178601d = stringExtra;
        com.tencent.mars.xlog.Log.i("MicorMsg.WalletUnbindBankCardProxyUI", "mPackage：%s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178601d)) {
            com.tencent.mars.xlog.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param error");
            setResult(1);
            finish();
            return;
        }
        java.lang.String str = this.f178601d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String[] split = str.split("&");
            hashMap = new java.util.HashMap();
            if (split != null && split.length > 0) {
                for (java.lang.String str2 : split) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        int indexOf = str2.indexOf("=");
                        java.lang.String substring = str2.substring(0, indexOf);
                        java.lang.String substring2 = str2.substring(indexOf + 1, str2.length());
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(substring) && !com.tencent.mm.sdk.platformtools.t8.K0(substring2)) {
                            hashMap.put(substring, substring2);
                        }
                    }
                }
                this.f178603f = hashMap;
                if (hashMap != null || !hashMap.containsKey("bank_type") || !this.f178603f.containsKey("bind_serial")) {
                    com.tencent.mars.xlog.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.f178601d);
                    setResult(1);
                    finish();
                }
                dt4.d Ri = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
                java.lang.String str3 = (java.lang.String) this.f178603f.get("bind_serial");
                Ri.getClass();
                android.database.Cursor f17 = Ri.f243234d.f("select * from WalletBankcard where bindSerial = '" + str3 + "'", null, 2);
                if (f17.moveToNext()) {
                    bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                    bankcard.convertFrom(f17);
                }
                f17.close();
                this.f178602e = bankcard;
                if (bankcard == null) {
                    com.tencent.mars.xlog.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "can not found bankcard, new one ");
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                    this.f178602e = bankcard2;
                    bankcard2.field_bankcardType = (java.lang.String) this.f178603f.get("bank_type");
                    this.f178602e.field_bindSerial = (java.lang.String) this.f178603f.get("bind_serial");
                }
                intent.putExtra("key_is_show_detail", false);
                intent.putExtra("key_bankcard", this.f178602e);
                intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                java.util.Map map = this.f178603f;
                if (map != null && !map.isEmpty() && this.f178603f.containsKey("support_quick_bind")) {
                    intent.putExtra("key_support_quick_bind", (java.lang.String) this.f178603f.get("support_quick_bind"));
                }
                com.tencent.mm.wallet_core.a.j(this, sr4.b.class, intent.getExtras(), new com.tencent.mm.plugin.wallet.bind.ui.i0(this));
                return;
            }
        }
        hashMap = null;
        this.f178603f = hashMap;
        if (hashMap != null) {
        }
        com.tencent.mars.xlog.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.f178601d);
        setResult(1);
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}

package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.plugin.wallet_core.ui.e0 {
    @Override // com.tencent.mm.plugin.wallet_core.ui.e0, com.tencent.mm.plugin.wallet_core.ui.r3
    public void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("encrypt_pwd", str);
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = this.f180243a;
        walletCheckPwdNewUI.setResult(-1, intent);
        walletCheckPwdNewUI.finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.e0, com.tencent.mm.plugin.wallet_core.ui.r3
    public void onCreate() {
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI walletCheckPwdNewUI = this.f180243a;
        java.lang.String stringExtra = walletCheckPwdNewUI.getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            walletCheckPwdNewUI.f179976e.setText(stringExtra);
        }
        java.lang.String stringExtra2 = walletCheckPwdNewUI.getIntent().getStringExtra("subtitle");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        walletCheckPwdNewUI.f179977f.setText(stringExtra2);
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.e0, com.tencent.mm.plugin.wallet_core.ui.r3
    public void onDestroy() {
    }
}

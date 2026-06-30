package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y3 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180807a;

    public y3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180807a = walletCheckPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "verify code end: %s", java.lang.Integer.valueOf(i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("token", bundle.getString("key_jsapi_token"));
        intent.putExtra("key_process_result_code", i17);
        intent.setClass(this.f180807a.getContext(), com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.putExtra("key_process_is_stay", false);
        return intent;
    }
}

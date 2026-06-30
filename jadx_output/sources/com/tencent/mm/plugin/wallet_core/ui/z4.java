package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class z4 extends com.tencent.mm.wallet_core.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180824e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180825f;

    /* renamed from: g, reason: collision with root package name */
    public int f180826g;

    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
        this.f180823d = bundle.getString("key_relation_key");
        this.f180824e = bundle.getString("key_pwd1");
        this.f180825f = bundle.getString("key_jsapi_token");
        this.f180826g = bundle.getInt("key_verify_scene");
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
        if (this.f180826g == 8) {
            k(activity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, null, false);
        } else {
            h(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, -1, null, false);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        return new com.tencent.mm.plugin.wallet_core.ui.y4(this, mMActivity, b0Var, b0Var, mMActivity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}

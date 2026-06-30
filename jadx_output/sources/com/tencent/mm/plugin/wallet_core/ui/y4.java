package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y4 extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ np5.b0 f180808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f180809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.z4 f180810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.plugin.wallet_core.ui.z4 z4Var, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var, np5.b0 b0Var2, com.tencent.mm.ui.MMActivity mMActivity2) {
        super(mMActivity, b0Var);
        this.f180810e = z4Var;
        this.f180808c = b0Var2;
        this.f180809d = mMActivity2;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        if (objArr.length != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
            return false;
        }
        at4.z0 z0Var = (at4.z0) objArr[1];
        com.tencent.mm.plugin.wallet_core.ui.z4 z4Var = this.f180810e;
        z0Var.f14025d = z4Var.f180825f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
        this.f180808c.d(new ss4.i0(z0Var, z4Var.f180823d), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (!(m1Var instanceof ss4.i0)) {
                return m1Var instanceof ss4.y;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
            com.tencent.mm.plugin.wallet_core.ui.z4 z4Var = this.f180810e;
            android.os.Bundle bundle = z4Var.f213801c;
            bundle.putString("key_jsapi_token", ((ss4.i0) m1Var).f412067d);
            z4Var.f(this.f180809d, bundle);
            return true;
        }
        if (m1Var instanceof ss4.i0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + i17 + ",errCode=" + i18 + ",errMsg=" + str);
        }
        return false;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
        com.tencent.mm.plugin.wallet_core.ui.z4 z4Var = this.f180810e;
        this.f180808c.d(new ss4.y(z4Var.f180824e, z4Var.f180825f, true), true);
        return true;
    }
}

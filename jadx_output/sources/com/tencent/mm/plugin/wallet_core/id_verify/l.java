package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class l extends np5.g {
    public l(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        if (i17 != 0) {
            return null;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.f493602kx2);
        java.lang.String string2 = mMActivity.getString(com.tencent.mm.R.string.f493600kx0);
        java.lang.String string3 = mMActivity.getString(com.tencent.mm.R.string.kx8, string, string2);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(mMActivity);
        android.text.SpannableString spannableString = new android.text.SpannableString(string3);
        spannableString.setSpan(b4Var, string3.length() - string2.length(), string3.length(), 33);
        return spannableString.subSequence(0, spannableString.length());
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}

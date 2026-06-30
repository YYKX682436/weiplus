package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes.dex */
public class WalletBalancePrivacyMMHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public final java.util.Map M;

    public WalletBalancePrivacyMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.acr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            textView.setText(this.L);
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public WalletBalancePrivacyMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new java.util.HashMap();
    }

    public WalletBalancePrivacyMMHeaderPreference(android.content.Context context) {
        super(context);
        this.M = new java.util.HashMap();
    }
}

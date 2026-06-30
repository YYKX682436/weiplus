package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletBalancePrivacyCheckBoxPreference extends com.tencent.mm.ui.base.preference.CheckBoxPreference {
    public boolean X;
    public com.tencent.mm.ui.widget.MMSwitchBtn Y;
    public android.view.View Z;

    public WalletBalancePrivacyCheckBoxPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public int M() {
        return com.tencent.mm.R.layout.f488175jl;
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public boolean N() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.Y;
        return mMSwitchBtn != null ? mMSwitchBtn.f211363x : this.X;
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void O(boolean z17) {
        this.X = z17;
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void Q(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void R(int i17) {
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void S(boolean z17) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.Y;
        if (mMSwitchBtn != null) {
            this.X = z17;
            mMSwitchBtn.setCheck(z17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.btf);
        this.Y = mMSwitchBtn;
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.wallet.pwd.ui.c(this));
        this.Y.setCheck(this.X);
        if (r()) {
            return;
        }
        this.Y.setEnabled(false);
        ((android.widget.TextView) view.findViewById(android.R.id.title)).setTextColor(view.getResources().getColor(com.tencent.mm.R.color.f478895k4));
        ((android.widget.TextView) view.findViewById(android.R.id.summary)).setTextColor(view.getResources().getColor(com.tencent.mm.R.color.f478895k4));
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        this.Z = u17;
        return u17;
    }

    public WalletBalancePrivacyCheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WalletBalancePrivacyCheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.X = false;
        this.G = com.tencent.mm.R.layout.f488175jl;
    }
}

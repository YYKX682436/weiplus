package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes.dex */
public class WalletDelayTransferUISelectPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public boolean M;

    public WalletDelayTransferUISelectPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        java.lang.String text = textView != null ? textView.getText() : "";
        if (this.M) {
            view.setContentDescription(((java.lang.Object) text) + " " + ((java.lang.Object) view.getContext().getText(com.tencent.mm.R.string.kkw)));
        } else {
            view.setContentDescription(((java.lang.Object) text) + " " + ((java.lang.Object) view.getContext().getText(com.tencent.mm.R.string.kkx)));
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.nh8)).setVisibility(this.M ? 0 : 8);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        viewGroup2.setPadding(0, 0, 0, 0);
        ((android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.f486681m43)).setPadding(0, 0, 0, 0);
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0w, viewGroup2);
        this.L = u17;
        return u17;
    }

    public WalletDelayTransferUISelectPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WalletDelayTransferUISelectPreference(android.content.Context context) {
        super(context);
    }
}

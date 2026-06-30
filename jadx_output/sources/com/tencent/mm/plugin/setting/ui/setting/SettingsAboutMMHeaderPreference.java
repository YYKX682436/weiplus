package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class SettingsAboutMMHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;

    public SettingsAboutMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.oxh);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482329bj);
        if (textView != null) {
            textView.getPaint().setFakeBoldText(true);
            textView.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f492978ij2));
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482328bi)).setText(java.lang.String.format("%s %s", "Version", this.L));
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.e5(this));
        }
    }

    public SettingsAboutMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = "";
    }

    public SettingsAboutMMHeaderPreference(android.content.Context context) {
        super(context);
        this.L = "";
    }
}

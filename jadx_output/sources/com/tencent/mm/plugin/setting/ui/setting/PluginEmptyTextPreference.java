package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public final class PluginEmptyTextPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.content.Context L;
    public java.lang.String M;

    public PluginEmptyTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = context;
        this.G = com.tencent.mm.R.layout.c9x;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484228dg2)).setText(this.M);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.View.inflate(this.L, com.tencent.mm.R.layout.c9x, null);
        return u17;
    }
}

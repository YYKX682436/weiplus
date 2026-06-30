package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes3.dex */
public class PowerSettingPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public PowerSettingPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            viewGroup2.addView(android.view.LayoutInflater.from(this.f197770d).inflate(com.tencent.mm.R.layout.cb6, (android.view.ViewGroup) null), new android.widget.AbsListView.LayoutParams(-1, -2));
            this.L = u17;
        }
        return this.L;
    }

    public PowerSettingPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

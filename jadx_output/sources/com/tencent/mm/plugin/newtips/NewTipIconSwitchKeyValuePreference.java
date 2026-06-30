package com.tencent.mm.plugin.newtips;

/* loaded from: classes8.dex */
public class NewTipIconSwitchKeyValuePreference extends com.tencent.mm.plugin.newtips.NormalIconNewTipPreference {

    /* renamed from: i2, reason: collision with root package name */
    public android.widget.TextView f152356i2;

    public NewTipIconSwitchKeyValuePreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.f152356i2 = textView;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f197770d;
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 2.0f);
        this.f152356i2.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
        this.f152356i2.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.status_accountunkey, 0, 0, 0);
        this.f152356i2.setCompoundDrawablePadding(d17);
    }

    public NewTipIconSwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewTipIconSwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

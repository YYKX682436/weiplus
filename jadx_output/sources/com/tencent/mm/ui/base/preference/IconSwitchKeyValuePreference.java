package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public class IconSwitchKeyValuePreference extends com.tencent.mm.ui.base.preference.IconPreference {
    public android.widget.TextView Y1;
    public int Z1;

    public IconSwitchKeyValuePreference(android.content.Context context) {
        this(context, null);
    }

    public final void h0() {
        if (this.Y1 == null) {
            return;
        }
        android.content.Context context = this.f197770d;
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 2.0f);
        this.Y1.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
        int i17 = this.Z1;
        if (i17 == 0) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.status_accountunkey, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        } else if (i17 == 1) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.status_accountkey, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        } else if (i17 != 2) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.status_accountkey_off, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.Y1 = (android.widget.TextView) view.findViewById(android.R.id.summary);
        h0();
    }

    public IconSwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconSwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Z1 = 0;
    }
}

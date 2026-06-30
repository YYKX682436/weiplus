package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class VcardContactLinkPreference extends com.tencent.mm.ui.base.preference.KeyValuePreference {
    public VcardContactLinkPreference(android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.KeyValuePreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        ((android.widget.TextView) view.findViewById(android.R.id.summary)).setTextColor(i65.a.d(this.f197770d, com.tencent.mm.R.color.f478854j2));
    }

    @Override // com.tencent.mm.ui.base.preference.KeyValuePreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public VcardContactLinkPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcardContactLinkPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

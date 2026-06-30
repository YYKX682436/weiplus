package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public class SwitchKeyValuePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public boolean M;

    public SwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.L = textView;
        if (textView == null) {
            return;
        }
        boolean z17 = this.M;
        android.content.Context context = this.f197770d;
        if (!z17) {
            textView.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
        } else {
            iz5.a.g(null, context != null);
            textView.setTextColor(new com.tencent.mm.ui.tools.gd(context).f210448a[0]);
        }
    }

    public SwitchKeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = true;
        this.G = com.tencent.mm.R.layout.byv;
    }
}

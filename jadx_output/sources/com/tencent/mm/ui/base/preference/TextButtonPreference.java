package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class TextButtonPreference extends com.tencent.mm.ui.base.preference.Preference {
    public TextButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public int k() {
        return com.tencent.mm.R.layout.byy;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            textView.setText(this.f197774h);
            textView.setEnabled(r());
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        super.u(viewGroup);
        return com.tencent.mm.ui.id.b(this.f197770d).inflate(com.tencent.mm.R.layout.byy, viewGroup, false);
    }

    public TextButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

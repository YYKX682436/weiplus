package com.tencent.weui.base.preference;

/* loaded from: classes3.dex */
public class PreferenceTitleCategory extends com.tencent.weui.base.preference.PreferenceCategory {
    public PreferenceTitleCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView == null) {
            return;
        }
        if (getTitle() == null || getTitle().length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(getTitle());
        }
    }

    public PreferenceTitleCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (getLayoutResource() != com.tencent.mm.R.layout.c0i) {
            setLayoutResource(com.tencent.mm.R.layout.c0e);
        }
    }
}

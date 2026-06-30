package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class InputPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.EditText L;
    public android.widget.Button M;
    public final android.view.View.OnClickListener N;
    public final android.widget.TextView.OnEditorActionListener P;

    public InputPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.d98);
        this.L = editText;
        editText.setHint((java.lang.CharSequence) null);
        this.L.setOnEditorActionListener(this.P);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b2z);
        this.M = button;
        button.setText((java.lang.CharSequence) null);
        this.M.setOnClickListener(this.N);
    }

    public InputPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = new com.tencent.mm.ui.base.preference.u(this);
        this.P = new com.tencent.mm.ui.base.preference.v(this);
    }
}

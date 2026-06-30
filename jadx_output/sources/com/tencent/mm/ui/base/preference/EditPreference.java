package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class EditPreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.ui.base.preference.q0 L;
    public com.tencent.mm.ui.base.preference.o M;
    public com.tencent.mm.ui.widget.dialog.j0 N;
    public java.lang.String P;

    public EditPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void D(com.tencent.mm.ui.base.preference.q0 q0Var) {
        this.L = q0Var;
    }

    public void M() {
        android.content.Context context = this.f197770d;
        android.widget.EditText editText = new android.widget.EditText(context);
        editText.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        editText.setSingleLine(true);
        editText.setText(this.P);
        android.view.ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = editText.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        if (editText.getParent() != null) {
            ((android.view.ViewGroup) editText.getParent()).removeView(editText);
        }
        this.N = db5.e1.r(this.f197770d, this.f197774h.toString(), editText, i65.a.r(context, com.tencent.mm.R.string.f490507x1), i65.a.r(context, com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.base.preference.m(this, editText), new com.tencent.mm.ui.base.preference.n(this));
    }

    public EditPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

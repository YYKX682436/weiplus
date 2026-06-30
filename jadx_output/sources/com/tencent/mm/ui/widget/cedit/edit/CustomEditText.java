package com.tencent.mm.ui.widget.cedit.edit;

/* loaded from: classes15.dex */
public class CustomEditText extends com.tencent.mm.ui.widget.cedit.edit.CustomTextView {
    public CustomEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, com.tencent.mm.R.style.f494324jz);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.tencent.mm.ui.widget.cedit.edit.CustomEditText.class.getName();
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public boolean getDefaultEditable() {
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public il5.a getDefaultMovementMethod() {
        return com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod.getInstance();
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public boolean getFreezesText() {
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public void n0(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.n0(charSequence, android.widget.TextView.BufferType.EDITABLE);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
            throw new java.lang.IllegalArgumentException("EditText cannot use the ellipsize mode TextUtils.TruncateAt.MARQUEE");
        }
        super.setEllipsize(truncateAt);
    }

    public void setSelection(int i17) {
        android.text.Selection.setSelection(getText(), i17);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public boolean u0() {
        return false;
    }

    public CustomEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // com.tencent.mm.ui.widget.cedit.edit.CustomTextView
    public android.text.Editable getText() {
        java.lang.CharSequence text = super.getText();
        if (text == null) {
            return null;
        }
        if (text instanceof android.text.Editable) {
            return (android.text.Editable) super.getText();
        }
        super.n0(text, android.widget.TextView.BufferType.EDITABLE);
        return (android.text.Editable) super.getText();
    }
}

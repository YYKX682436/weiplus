package com.tencent.mm.ui.widget;

/* loaded from: classes10.dex */
public class MMNumberCheckbox extends androidx.appcompat.widget.AppCompatCheckBox {

    /* renamed from: e, reason: collision with root package name */
    public int f211326e;

    public MMNumberCheckbox(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getNumber() {
        return this.f211326e;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        int i17;
        super.setChecked(z17);
        if (z17 && (i17 = this.f211326e) > 0 && !java.lang.String.valueOf(i17).contentEquals(getText())) {
            setText(java.lang.String.valueOf(this.f211326e));
        }
        if (z17) {
            return;
        }
        this.f211326e = 0;
        setText("");
    }

    public void setCheckedNumber(int i17) {
        if (i17 <= 0 || i17 == this.f211326e) {
            return;
        }
        this.f211326e = i17;
        setText(java.lang.String.valueOf(i17));
        setChecked(true);
    }

    public void setNumber(int i17) {
        if (this.f211326e > 0) {
            this.f211326e = i17;
        }
    }

    public MMNumberCheckbox(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class v0 implements android.widget.NumberPicker.OnValueChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.x0 f212337a;

    public v0(com.tencent.mm.ui.widget.picker.x0 x0Var) {
        this.f212337a = x0Var;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public void onValueChange(android.widget.NumberPicker numberPicker, int i17, int i18) {
        com.tencent.mm.ui.widget.picker.x0 x0Var = this.f212337a;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) x0Var.f212332a.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            android.widget.EditText editText = x0Var.f212348j;
            if (inputMethodManager.isActive(editText)) {
                editText.clearFocus();
                inputMethodManager.hideSoftInputFromWindow(x0Var.f212332a.getWindowToken(), 0);
            } else {
                android.widget.EditText editText2 = x0Var.f212347i;
                if (inputMethodManager.isActive(editText2)) {
                    editText2.clearFocus();
                    inputMethodManager.hideSoftInputFromWindow(x0Var.f212332a.getWindowToken(), 0);
                } else {
                    android.widget.EditText editText3 = x0Var.f212346h;
                    if (inputMethodManager.isActive(editText3)) {
                        editText3.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(x0Var.f212332a.getWindowToken(), 0);
                    }
                }
            }
        }
        x0Var.f212353o.setTimeInMillis(x0Var.f212356r.getTimeInMillis());
        if (numberPicker == x0Var.f212342d) {
            int actualMaximum = x0Var.f212353o.getActualMaximum(5);
            if (i17 == actualMaximum && i18 == 1) {
                x0Var.f212353o.add(5, 1);
            } else if (i17 == 1 && i18 == actualMaximum) {
                x0Var.f212353o.add(5, -1);
            } else {
                x0Var.f212353o.add(5, i18 - i17);
            }
        } else if (numberPicker == x0Var.f212343e) {
            if (i17 == 11 && i18 == 0) {
                x0Var.f212353o.add(2, 1);
            } else if (i17 == 0 && i18 == 11) {
                x0Var.f212353o.add(2, -1);
            } else {
                x0Var.f212353o.add(2, i18 - i17);
            }
        } else {
            if (numberPicker != x0Var.f212344f) {
                throw new java.lang.IllegalArgumentException();
            }
            x0Var.f212353o.set(1, i18);
        }
        x0Var.d(x0Var.f212353o.get(1), x0Var.f212353o.get(2), x0Var.f212353o.get(5));
        x0Var.i();
        x0Var.h();
        x0Var.f212332a.sendAccessibilityEvent(4);
    }
}

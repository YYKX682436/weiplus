package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class e implements android.widget.NumberPicker.OnValueChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.CustomTimePicker f212268a;

    public e(com.tencent.mm.ui.widget.picker.CustomTimePicker customTimePicker) {
        this.f212268a = customTimePicker;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public void onValueChange(android.widget.NumberPicker numberPicker, int i17, int i18) {
        android.widget.NumberPicker numberPicker2;
        android.widget.NumberPicker numberPicker3;
        com.tencent.mm.ui.widget.picker.CustomTimePicker customTimePicker = this.f212268a;
        int i19 = customTimePicker.f212217f;
        if (i19 >= 0 && i19 <= 23) {
            int i27 = customTimePicker.f212218g;
            if ((i27 >= 0 && i27 <= 59) && (numberPicker3 = customTimePicker.f212215d) != null && customTimePicker.f212216e != null) {
                if (numberPicker3.getValue() == i19) {
                    customTimePicker.f212216e.setMinValue(i27);
                } else {
                    customTimePicker.f212216e.setMinValue(0);
                }
            }
        }
        int i28 = customTimePicker.f212219h;
        if (!(i28 >= 0 && i28 <= 23) || (numberPicker2 = customTimePicker.f212215d) == null || customTimePicker.f212216e == null) {
            return;
        }
        if (numberPicker2.getValue() == i28) {
            customTimePicker.f212216e.setMaxValue(customTimePicker.f212220i);
        } else {
            customTimePicker.f212216e.setMaxValue(59);
        }
    }
}

package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class a implements android.widget.NumberPicker.OnValueChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.CustomDatePicker f212243a;

    public a(com.tencent.mm.ui.widget.picker.CustomDatePicker customDatePicker) {
        this.f212243a = customDatePicker;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public void onValueChange(android.widget.NumberPicker numberPicker, int i17, int i18) {
        int i19 = com.tencent.mm.ui.widget.picker.CustomDatePicker.f212183p;
        this.f212243a.b();
    }
}

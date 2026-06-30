package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class c implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.CustomDatePickerNew f212245a;

    public c(com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew) {
        this.f212245a = customDatePickerNew;
    }

    @Override // v51.f
    public void a(java.util.Date date) {
        int i17 = com.tencent.mm.ui.widget.picker.CustomDatePickerNew.f212191y;
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212245a;
        customDatePickerNew.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        customDatePickerNew.f212197i = calendar.get(1);
        customDatePickerNew.f212198m = calendar.get(2) + 1;
        customDatePickerNew.f212199n = calendar.get(5);
        com.tencent.mm.ui.yk.c("pvTime", "onTimeSelect", new java.lang.Object[0]);
        v51.f fVar = customDatePickerNew.f212209x;
        if (fVar != null) {
            fVar.a(date);
        }
    }
}

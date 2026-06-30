package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class h implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.CustomTimePickerNew f212272a;

    public h(com.tencent.mm.ui.widget.picker.CustomTimePickerNew customTimePickerNew) {
        this.f212272a = customTimePickerNew;
    }

    @Override // v51.f
    public void a(java.util.Date date) {
        int i17 = com.tencent.mm.ui.widget.picker.CustomTimePickerNew.f212221s;
        com.tencent.mm.ui.widget.picker.CustomTimePickerNew customTimePickerNew = this.f212272a;
        customTimePickerNew.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        customTimePickerNew.f212231p = calendar.get(11);
        customTimePickerNew.f212232q = calendar.get(12);
    }
}

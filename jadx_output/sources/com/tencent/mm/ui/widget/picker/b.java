package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class b implements v51.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.CustomDatePickerNew f212244a;

    public b(com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew) {
        this.f212244a = customDatePickerNew;
    }

    @Override // v51.e
    public void a(java.util.Date date) {
        com.tencent.mm.ui.yk.c("pvTime", "onTimeSelectChanged", new java.lang.Object[0]);
        v51.e eVar = this.f212244a.f212208w;
        if (eVar != null) {
            eVar.a(date);
        }
    }
}

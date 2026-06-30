package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class w0 implements android.widget.CalendarView.OnDateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.x0 f212339a;

    public w0(com.tencent.mm.ui.widget.picker.x0 x0Var) {
        this.f212339a = x0Var;
    }

    @Override // android.widget.CalendarView.OnDateChangeListener
    public void onSelectedDayChange(android.widget.CalendarView calendarView, int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.picker.x0 x0Var = this.f212339a;
        x0Var.d(i17, i18, i19);
        x0Var.i();
        x0Var.f212332a.sendAccessibilityEvent(4);
    }
}

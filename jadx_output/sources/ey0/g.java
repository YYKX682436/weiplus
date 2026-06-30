package ey0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v51.f f257302a;

    /* renamed from: b, reason: collision with root package name */
    public final ey0.c f257303b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Date f257304c;

    public g(android.content.Context context, java.util.Calendar initDate, java.util.Calendar startDate, java.util.Calendar endDate, com.tencent.maas.moviecomposing.e options, v51.f listener) {
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initDate, "initDate");
        kotlin.jvm.internal.o.g(startDate, "startDate");
        kotlin.jvm.internal.o.g(endDate, "endDate");
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f257302a = listener;
        ey0.c cVar = new ey0.c(context);
        this.f257303b = cVar;
        int i17 = initDate.get(1);
        int i18 = initDate.get(2) + 1;
        int i19 = initDate.get(5);
        if (i17 >= 0 && i18 >= 0 && i19 >= 0 && (mJCustomDatePicker = cVar.f257297e) != null) {
            mJCustomDatePicker.f69703o = i17;
            mJCustomDatePicker.f69704p = i18;
            mJCustomDatePicker.f69705q = i19;
            if (mJCustomDatePicker.f69695d == null) {
                mJCustomDatePicker.f69695d = mJCustomDatePicker.f69696e.d();
            }
        }
        int i27 = options.f48490a;
        boolean z17 = (i27 & 1) != 0;
        boolean z18 = (i27 & 2) != 0;
        boolean z19 = (i27 & 4) != 0;
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker2 = cVar.f257297e;
        if (mJCustomDatePicker2 != null) {
            mJCustomDatePicker2.f69700i = z19;
            mJCustomDatePicker2.f69701m = z18;
            mJCustomDatePicker2.f69702n = z17;
        }
        int i28 = startDate.get(1);
        int i29 = startDate.get(2) + 1;
        int i37 = startDate.get(5);
        if (i28 >= 0 && i29 >= 0 && i37 >= 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar.set(i28, i29 - 1, i37);
            com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker3 = cVar.f257297e;
            if (mJCustomDatePicker3 != null) {
                mJCustomDatePicker3.setMinDate(java.lang.Long.valueOf(calendar.getTimeInMillis()));
            }
        }
        int i38 = endDate.get(1);
        int i39 = endDate.get(2) + 1;
        int i47 = endDate.get(5);
        if (i38 >= 0 && i39 >= 0 && i47 >= 0) {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar2.set(i38, i39 - 1, i47);
            com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker4 = cVar.f257297e;
            if (mJCustomDatePicker4 != null) {
                mJCustomDatePicker4.setMaxDate(java.lang.Long.valueOf(calendar2.getTimeInMillis()));
            }
        }
        ey0.e eVar = new ey0.e(this);
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker5 = cVar.f257297e;
        if (mJCustomDatePicker5 != null) {
            mJCustomDatePicker5.setTimeSelectChangeListener(eVar);
        }
        ey0.f fVar = new ey0.f(this);
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker mJCustomDatePicker6 = cVar.f257297e;
        if (mJCustomDatePicker6 != null) {
            mJCustomDatePicker6.setOnTimeSelectListener(fVar);
        }
    }
}

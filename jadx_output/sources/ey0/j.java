package ey0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final v51.f f257307a;

    /* renamed from: b, reason: collision with root package name */
    public final ey0.d f257308b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Date f257309c;

    public j(android.content.Context context, java.util.Calendar initDate, java.util.Calendar startDate, java.util.Calendar endDate, v51.f listener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initDate, "initDate");
        kotlin.jvm.internal.o.g(startDate, "startDate");
        kotlin.jvm.internal.o.g(endDate, "endDate");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f257307a = listener;
        ey0.d dVar = new ey0.d(context);
        this.f257308b = dVar;
        int i17 = initDate.get(11);
        i17 = i17 < 0 ? 0 : i17;
        i17 = i17 > 23 ? 23 : i17;
        int i18 = initDate.get(12);
        i18 = i18 < 0 ? 0 : i18;
        i18 = i18 > 59 ? 59 : i18;
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker mJCustomTimePicker = dVar.f257299e;
        if (mJCustomTimePicker != null) {
            mJCustomTimePicker.f69716n = i17;
            mJCustomTimePicker.f69717o = i18;
        }
        int i19 = startDate.get(11);
        i19 = i19 < 0 ? 0 : i19;
        i19 = i19 > 23 ? 23 : i19;
        int i27 = startDate.get(12);
        i27 = i27 < 0 ? 0 : i27;
        i27 = i27 > 59 ? 59 : i27;
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker mJCustomTimePicker2 = dVar.f257299e;
        if (mJCustomTimePicker2 != null) {
            mJCustomTimePicker2.f69712g = i19;
            mJCustomTimePicker2.f69713h = i27;
        }
        int i28 = endDate.get(11);
        i28 = i28 < 0 ? 0 : i28;
        int i29 = i28 <= 23 ? i28 : 23;
        int i37 = endDate.get(12);
        int i38 = i37 >= 0 ? i37 : 0;
        int i39 = i38 <= 59 ? i38 : 59;
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker mJCustomTimePicker3 = dVar.f257299e;
        if (mJCustomTimePicker3 != null) {
            mJCustomTimePicker3.f69714i = i29;
            mJCustomTimePicker3.f69715m = i39;
        }
        ey0.h hVar = new ey0.h(this);
        if (mJCustomTimePicker3 != null) {
            mJCustomTimePicker3.setTimeSelectChangeListener(hVar);
        }
        ey0.i iVar = new ey0.i(this);
        com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker mJCustomTimePicker4 = dVar.f257299e;
        if (mJCustomTimePicker4 != null) {
            mJCustomTimePicker4.setOnTimeSelectListener(iVar);
        }
    }
}

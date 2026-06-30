package ta4;

/* loaded from: classes3.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.f1 f416743a = new ta4.f1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f416744b = new java.util.ArrayList();

    public final void a(int i17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAction", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsScaleReporter", "addAction >> " + i17 + ", " + f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(';');
        sb6.append(f17);
        f416744b.add(sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAction", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
    }

    public final void b(int i17, int i18, java.lang.String snsId, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsScaleReporter", "report >> " + i17 + ", " + i18 + " snsId:" + snsId + " index:" + i19);
        java.util.ArrayList arrayList = f416744b;
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsScaleReporter", "report >> no action");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct = new com.tencent.mm.autogen.mmdata.rpt.MM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct();
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58897e = i18;
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58896d = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append((java.lang.String) next);
            if (i27 < arrayList.size() - 1) {
                sb6.append("#");
            }
            i27 = i28;
        }
        arrayList.clear();
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58898f = mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.b("ActionAndScales", sb6.toString(), true);
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58899g = mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.b("SnsFeedId", snsId, true);
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58900h = i19;
        mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
    }
}

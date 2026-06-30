package yd5;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.q f461145a = new yd5.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f461146b;

    static {
        new java.util.ArrayList();
        f461146b = new java.util.HashMap();
    }

    public final void a(int i17, int i18, float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoScaleReporter", "addAction >> " + i17 + ", " + i18 + ", " + f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append(';');
        sb6.append(f17);
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap = f461146b;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList.add(sb7);
        hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoScaleReporter", "report >> " + i17);
        java.util.HashMap hashMap = f461146b;
        if (hashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoScaleReporter", "report >> no action");
            return;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            com.tencent.mm.autogen.mmdata.rpt.MM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct = new com.tencent.mm.autogen.mmdata.rpt.MM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct();
            mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58897e = ((java.lang.Number) entry.getKey()).intValue();
            mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58896d = i17;
            java.util.ArrayList arrayList = (java.util.ArrayList) entry.getValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append((java.lang.String) obj);
                if (i18 < arrayList.size() - 1) {
                    sb6.append("#");
                }
                i18 = i19;
            }
            mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.f58898f = mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.b("ActionAndScales", sb6.toString(), true);
            mM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct.k();
        }
        hashMap.clear();
    }
}

package hr3;

/* loaded from: classes11.dex */
public class wh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f284162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f284163e;

    public wh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, long j17) {
        this.f284163e = sayHiWithSnsPermissionUI3;
        this.f284162d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct remarkTagOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct();
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f284163e;
        if (sayHiWithSnsPermissionUI3.M == null) {
            sayHiWithSnsPermissionUI3.M = new java.util.ArrayList();
        }
        if (sayHiWithSnsPermissionUI3.f153867y1 == null) {
            sayHiWithSnsPermissionUI3.f153867y1 = new java.util.ArrayList();
        }
        if (sayHiWithSnsPermissionUI3.f153867y1 == null) {
            sayHiWithSnsPermissionUI3.f153867y1 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = sayHiWithSnsPermissionUI3.M;
        remarkTagOperateLogStruct.p(sayHiWithSnsPermissionUI3.f153860v);
        long j17 = 0;
        remarkTagOperateLogStruct.f59966e = sayHiWithSnsPermissionUI3.f153863x0 ? 1L : 0L;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (sayHiWithSnsPermissionUI3.f153869z1.contains((java.lang.String) it.next())) {
                i18++;
            }
        }
        remarkTagOperateLogStruct.f59968g = i18;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (sayHiWithSnsPermissionUI3.A1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        remarkTagOperateLogStruct.f59970i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i19 = 0;
        while (it7.hasNext()) {
            if (sayHiWithSnsPermissionUI3.C1.contains((java.lang.String) it7.next())) {
                i19++;
            }
        }
        remarkTagOperateLogStruct.f59969h = i19;
        java.util.Iterator it8 = arrayList.iterator();
        int i27 = 0;
        while (it8.hasNext()) {
            if (sayHiWithSnsPermissionUI3.B1.contains((java.lang.String) it8.next())) {
                i27++;
            }
        }
        remarkTagOperateLogStruct.f59967f = i27;
        remarkTagOperateLogStruct.f59974m = java.lang.System.currentTimeMillis() - sayHiWithSnsPermissionUI3.I1;
        remarkTagOperateLogStruct.f59975n = sayHiWithSnsPermissionUI3.f153866y0;
        long j18 = this.f284162d;
        remarkTagOperateLogStruct.f59976o = j18;
        remarkTagOperateLogStruct.f59971j = sayHiWithSnsPermissionUI3.f153848l1;
        java.util.Iterator it9 = arrayList.iterator();
        int i28 = 0;
        while (it9.hasNext()) {
            if (!sayHiWithSnsPermissionUI3.f153867y1.contains((java.lang.String) it9.next())) {
                i28++;
            }
        }
        java.util.Iterator it10 = sayHiWithSnsPermissionUI3.f153867y1.iterator();
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i17++;
            }
        }
        remarkTagOperateLogStruct.f59977p = sayHiWithSnsPermissionUI3.A ? 4L : 2L;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = sayHiWithSnsPermissionUI3.f153846h;
        java.lang.String trim = (mMLimitedClearEditText == null || mMLimitedClearEditText.getText() == null || sayHiWithSnsPermissionUI3.f153846h.getText().toString() == null) ? "" : sayHiWithSnsPermissionUI3.f153846h.getText().toString().trim();
        java.lang.String str = trim != null ? trim : "";
        if (x51.t1.b(sayHiWithSnsPermissionUI3.Z)) {
            if (!sayHiWithSnsPermissionUI3.X) {
                sayHiWithSnsPermissionUI3.f153853p0 = 3;
            } else if (x51.t1.b(sayHiWithSnsPermissionUI3.Y)) {
                if (str.equals(sayHiWithSnsPermissionUI3.Y)) {
                    sayHiWithSnsPermissionUI3.f153853p0 = 3;
                } else {
                    sayHiWithSnsPermissionUI3.f153853p0 = 2;
                }
            } else if (sayHiWithSnsPermissionUI3.Y.equals(str)) {
                sayHiWithSnsPermissionUI3.f153853p0 = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                sayHiWithSnsPermissionUI3.f153853p0 = 3;
            } else {
                sayHiWithSnsPermissionUI3.f153853p0 = 2;
            }
        } else if (sayHiWithSnsPermissionUI3.Z.equals(str)) {
            sayHiWithSnsPermissionUI3.f153853p0 = 3;
        } else {
            sayHiWithSnsPermissionUI3.f153853p0 = 2;
        }
        remarkTagOperateLogStruct.f59978q = sayHiWithSnsPermissionUI3.f153853p0;
        remarkTagOperateLogStruct.f59973l = i28;
        remarkTagOperateLogStruct.f59972k = i17;
        remarkTagOperateLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "22865 setAddedLabelCnt = " + i28 + ",setRemovedLabelCnt = " + i17 + ",oriLabelCnt = " + sayHiWithSnsPermissionUI3.f153848l1 + ",opResult = " + j18 + ",totalLabelCnt = " + sayHiWithSnsPermissionUI3.f153866y0 + ",selectNewLabelCnt = " + i27 + ",selectAddLabelCnt = " + i19 + ",addRemarkType = " + sayHiWithSnsPermissionUI3.f153853p0 + ",scene= 2,newLebalCountBySearch = " + i18 + ",searchAddLabelCnt = " + j17);
    }
}

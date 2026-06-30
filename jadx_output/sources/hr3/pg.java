package hr3;

/* loaded from: classes11.dex */
public class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f283900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283901e;

    public pg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, long j17) {
        this.f283901e = sayHiWithSnsPermissionUI;
        this.f283900d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct remarkTagOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct();
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283901e;
        if (sayHiWithSnsPermissionUI.K == null) {
            sayHiWithSnsPermissionUI.K = new java.util.ArrayList();
        }
        if (sayHiWithSnsPermissionUI.f153824p0 == null) {
            sayHiWithSnsPermissionUI.f153824p0 = new java.util.ArrayList();
        }
        if (sayHiWithSnsPermissionUI.f153824p0 == null) {
            sayHiWithSnsPermissionUI.f153824p0 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = sayHiWithSnsPermissionUI.K;
        remarkTagOperateLogStruct.p(sayHiWithSnsPermissionUI.f153826q);
        long j17 = 0;
        remarkTagOperateLogStruct.f59966e = sayHiWithSnsPermissionUI.W ? 1L : 0L;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (sayHiWithSnsPermissionUI.f153834x0.contains((java.lang.String) it.next())) {
                i18++;
            }
        }
        remarkTagOperateLogStruct.f59968g = i18;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (sayHiWithSnsPermissionUI.f153837y0.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        remarkTagOperateLogStruct.f59970i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i19 = 0;
        while (it7.hasNext()) {
            if (sayHiWithSnsPermissionUI.f153825p1.contains((java.lang.String) it7.next())) {
                i19++;
            }
        }
        remarkTagOperateLogStruct.f59969h = i19;
        java.util.Iterator it8 = arrayList.iterator();
        int i27 = 0;
        while (it8.hasNext()) {
            if (sayHiWithSnsPermissionUI.f153819l1.contains((java.lang.String) it8.next())) {
                i27++;
            }
        }
        remarkTagOperateLogStruct.f59967f = i27;
        remarkTagOperateLogStruct.f59974m = java.lang.System.currentTimeMillis() - sayHiWithSnsPermissionUI.D1;
        remarkTagOperateLogStruct.f59975n = sayHiWithSnsPermissionUI.X;
        long j18 = this.f283900d;
        remarkTagOperateLogStruct.f59976o = j18;
        remarkTagOperateLogStruct.f59971j = sayHiWithSnsPermissionUI.Y;
        java.util.Iterator it9 = arrayList.iterator();
        int i28 = 0;
        while (it9.hasNext()) {
            if (!sayHiWithSnsPermissionUI.f153824p0.contains((java.lang.String) it9.next())) {
                i28++;
            }
        }
        java.util.Iterator it10 = sayHiWithSnsPermissionUI.f153824p0.iterator();
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i17++;
            }
        }
        remarkTagOperateLogStruct.f59977p = sayHiWithSnsPermissionUI.f153831v ? 4L : 2L;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = sayHiWithSnsPermissionUI.f153817h;
        java.lang.String trim = (mMLimitedClearEditText == null || mMLimitedClearEditText.getText() == null || sayHiWithSnsPermissionUI.f153817h.getText().toString() == null) ? "" : sayHiWithSnsPermissionUI.f153817h.getText().toString().trim();
        java.lang.String str = trim != null ? trim : "";
        if (x51.t1.b(sayHiWithSnsPermissionUI.U)) {
            if (!sayHiWithSnsPermissionUI.S) {
                sayHiWithSnsPermissionUI.V = 3;
            } else if (x51.t1.b(sayHiWithSnsPermissionUI.T)) {
                if (str.equals(sayHiWithSnsPermissionUI.T)) {
                    sayHiWithSnsPermissionUI.V = 3;
                } else {
                    sayHiWithSnsPermissionUI.V = 2;
                }
            } else if (sayHiWithSnsPermissionUI.T.equals(str)) {
                sayHiWithSnsPermissionUI.V = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                sayHiWithSnsPermissionUI.V = 3;
            } else {
                sayHiWithSnsPermissionUI.V = 2;
            }
        } else if (sayHiWithSnsPermissionUI.U.equals(str)) {
            sayHiWithSnsPermissionUI.V = 3;
        } else {
            sayHiWithSnsPermissionUI.V = 2;
        }
        remarkTagOperateLogStruct.f59978q = sayHiWithSnsPermissionUI.V;
        remarkTagOperateLogStruct.f59973l = i28;
        remarkTagOperateLogStruct.f59972k = i17;
        remarkTagOperateLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "22865 setAddedLabelCnt = " + i28 + ",setRemovedLabelCnt = " + i17 + ",oriLabelCnt = " + sayHiWithSnsPermissionUI.Y + ",opResult = " + j18 + ",totalLabelCnt = " + sayHiWithSnsPermissionUI.X + ",selectNewLabelCnt = " + i27 + ",selectAddLabelCnt = " + i19 + ",addRemarkType = " + sayHiWithSnsPermissionUI.V + ",scene= 2,newLebalCountBySearch = " + i18 + ",searchAddLabelCnt = " + j17);
    }
}

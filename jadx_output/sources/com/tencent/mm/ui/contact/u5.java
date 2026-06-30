package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f207207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f207208e;

    public u5(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI, long j17) {
        this.f207208e = modRemarkNameUI;
        this.f207207d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct remarkTagOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct();
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f207208e;
        java.util.List list = modRemarkNameUI.V;
        remarkTagOperateLogStruct.p(modRemarkNameUI.f206472h);
        long j17 = 0;
        remarkTagOperateLogStruct.f59966e = modRemarkNameUI.X ? 1L : 0L;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (modRemarkNameUI.f206492y0.contains((java.lang.String) it.next())) {
                i17++;
            }
        }
        remarkTagOperateLogStruct.f59968g = i17;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (modRemarkNameUI.f206474l1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        remarkTagOperateLogStruct.f59970i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i18 = 0;
        while (it7.hasNext()) {
            if (modRemarkNameUI.f206490x1.contains((java.lang.String) it7.next())) {
                i18++;
            }
        }
        remarkTagOperateLogStruct.f59969h = i18;
        java.util.Iterator it8 = arrayList.iterator();
        int i19 = 0;
        while (it8.hasNext()) {
            if (modRemarkNameUI.f206480p1.contains((java.lang.String) it8.next())) {
                i19++;
            }
        }
        remarkTagOperateLogStruct.f59967f = i19;
        remarkTagOperateLogStruct.f59974m = java.lang.System.currentTimeMillis() - modRemarkNameUI.Y;
        remarkTagOperateLogStruct.f59975n = modRemarkNameUI.Z;
        long j18 = this.f207207d;
        remarkTagOperateLogStruct.f59976o = j18;
        remarkTagOperateLogStruct.f59971j = modRemarkNameUI.f206479p0;
        int intExtra = modRemarkNameUI.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            remarkTagOperateLogStruct.f59979r = 22L;
        }
        java.util.Iterator it9 = arrayList.iterator();
        int i27 = 0;
        while (it9.hasNext()) {
            if (!((java.util.ArrayList) modRemarkNameUI.U).contains((java.lang.String) it9.next())) {
                i27++;
            }
        }
        java.util.Iterator it10 = ((java.util.ArrayList) modRemarkNameUI.U).iterator();
        int i28 = 0;
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i28++;
            }
        }
        long j19 = j17;
        remarkTagOperateLogStruct.f59977p = 3L;
        java.lang.String trim = modRemarkNameUI.f206468d.getText().toString().trim();
        if (trim == null) {
            trim = "";
        }
        if (x51.t1.b(modRemarkNameUI.f206481q)) {
            if (!modRemarkNameUI.f206482r) {
                modRemarkNameUI.Q = 3;
            } else if (x51.t1.b(modRemarkNameUI.f206477o)) {
                if (trim.equals(modRemarkNameUI.f206477o)) {
                    modRemarkNameUI.Q = 3;
                } else {
                    modRemarkNameUI.Q = 2;
                }
            } else if (modRemarkNameUI.f206477o.equals(trim)) {
                modRemarkNameUI.Q = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                modRemarkNameUI.Q = 3;
            } else {
                modRemarkNameUI.Q = 2;
            }
        } else if (modRemarkNameUI.f206481q.equals(trim)) {
            modRemarkNameUI.Q = 3;
        } else {
            modRemarkNameUI.Q = 2;
        }
        remarkTagOperateLogStruct.f59978q = modRemarkNameUI.Q;
        remarkTagOperateLogStruct.f59973l = i27;
        remarkTagOperateLogStruct.f59972k = i28;
        remarkTagOperateLogStruct.k();
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "22865 setAddedLabelCnt = " + i27 + ",setRemovedLabelCnt = " + i28 + ",source = " + intExtra + ",oriLabelCnt = " + modRemarkNameUI.f206479p0 + ",opResult = " + j18 + ",totalLabelCnt = " + modRemarkNameUI.Z + ",selectNewLabelCnt = " + i19 + ",addRemarkType = " + modRemarkNameUI.Q + ",scene= 3,selectAddLabelCnt = " + i18 + ",newLebalCountBySearch = " + i17 + ",searchAddLabelCnt = " + j19);
    }
}

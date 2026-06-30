package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f207037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207038e;

    public n2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI, long j17) {
        this.f207038e = contactRemarkInfoModUI;
        this.f207037d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct remarkTagOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct();
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f207038e;
        java.util.List list = contactRemarkInfoModUI.Y;
        remarkTagOperateLogStruct.p(contactRemarkInfoModUI.f206385t);
        contactRemarkInfoModUI.getClass();
        long j17 = 0;
        remarkTagOperateLogStruct.f59966e = 0L;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (contactRemarkInfoModUI.f206394y1.contains((java.lang.String) it.next())) {
                i17++;
            }
        }
        remarkTagOperateLogStruct.f59968g = i17;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (contactRemarkInfoModUI.f206396z1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        remarkTagOperateLogStruct.f59970i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i18 = 0;
        while (it7.hasNext()) {
            if (contactRemarkInfoModUI.B1.contains((java.lang.String) it7.next())) {
                i18++;
            }
        }
        remarkTagOperateLogStruct.f59969h = i18;
        java.util.Iterator it8 = arrayList.iterator();
        int i19 = 0;
        while (it8.hasNext()) {
            if (contactRemarkInfoModUI.A1.contains((java.lang.String) it8.next())) {
                i19++;
            }
        }
        remarkTagOperateLogStruct.f59967f = i19;
        remarkTagOperateLogStruct.f59974m = java.lang.System.currentTimeMillis() - contactRemarkInfoModUI.f206390x0;
        remarkTagOperateLogStruct.f59975n = contactRemarkInfoModUI.f206393y0;
        long j18 = this.f207037d;
        remarkTagOperateLogStruct.f59976o = j18;
        remarkTagOperateLogStruct.f59971j = contactRemarkInfoModUI.f206375l1;
        int intExtra = contactRemarkInfoModUI.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra > 0) {
            remarkTagOperateLogStruct.f59979r = 22L;
        }
        java.util.Iterator it9 = arrayList.iterator();
        int i27 = 0;
        while (it9.hasNext()) {
            if (!contactRemarkInfoModUI.X.contains((java.lang.String) it9.next())) {
                i27++;
            }
        }
        java.util.Iterator it10 = contactRemarkInfoModUI.X.iterator();
        int i28 = 0;
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i28++;
            }
        }
        long j19 = j17;
        remarkTagOperateLogStruct.f59977p = 1L;
        java.lang.String trim = contactRemarkInfoModUI.f206369d.getText().toString().trim();
        if (trim == null) {
            trim = "";
        }
        if (x51.t1.b(contactRemarkInfoModUI.B)) {
            if (!contactRemarkInfoModUI.K) {
                contactRemarkInfoModUI.f206381p1 = 3;
            } else if (x51.t1.b(contactRemarkInfoModUI.A)) {
                if (trim.equals(contactRemarkInfoModUI.A)) {
                    contactRemarkInfoModUI.f206381p1 = 3;
                } else {
                    contactRemarkInfoModUI.f206381p1 = 2;
                }
            } else if (contactRemarkInfoModUI.A.equals(trim)) {
                contactRemarkInfoModUI.f206381p1 = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                contactRemarkInfoModUI.f206381p1 = 3;
            } else {
                contactRemarkInfoModUI.f206381p1 = 2;
            }
        } else if (contactRemarkInfoModUI.B.equals(trim)) {
            contactRemarkInfoModUI.f206381p1 = 3;
        } else {
            contactRemarkInfoModUI.f206381p1 = 2;
        }
        remarkTagOperateLogStruct.f59978q = contactRemarkInfoModUI.f206381p1;
        remarkTagOperateLogStruct.f59973l = i27;
        remarkTagOperateLogStruct.f59972k = i28;
        remarkTagOperateLogStruct.k();
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "22865 setAddedLabelCnt = " + i27 + ",setRemovedLabelCnt = " + i28 + ",source = " + intExtra + ",oriLabelCnt = " + contactRemarkInfoModUI.f206375l1 + ",opResult = " + j18 + ",totalLabelCnt = " + contactRemarkInfoModUI.f206393y0 + ",selectNewLabelCnt = " + i19 + ",selectAddLabelCnt = " + i18 + ",addRemarkType = " + contactRemarkInfoModUI.f206381p1 + ",scene= 1,newLebalCountBySearch = " + i17 + ",searchAddLabelCnt = " + j19);
    }
}

package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198050d;

    public j(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198050d = brandServiceNotifyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28 = com.tencent.mm.ui.brandservice.BrandServiceNotifyUI.f198019x;
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198050d;
        brandServiceNotifyUI.getClass();
        if (gm0.j1.a()) {
            java.lang.System.currentTimeMillis();
            java.lang.String str = "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            android.database.Cursor s17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, null, brandServiceNotifyUI.f198025i, -1);
            if (s17 != null) {
                int columnIndex = s17.getColumnIndex("unReadCount");
                int columnIndex2 = s17.getColumnIndex("conversationTime");
                int columnIndex3 = s17.getColumnIndex("flag");
                i17 = s17.getCount();
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                j17 = 0;
                i18 = 0;
                i19 = 0;
                i27 = 0;
                while (s17.moveToNext()) {
                    java.lang.String str2 = str;
                    l4Var.z1(s17.getLong(columnIndex3));
                    int i29 = s17.getInt(columnIndex);
                    if (i29 > 0) {
                        j17 = s17.getLong(columnIndex2);
                        i18++;
                        i19 += i29;
                    } else {
                        i29 = 0;
                    }
                    sb6.append(s17.isFirst() ? str2 : ".");
                    sb6.append(i29);
                    if (((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var)) {
                        i27++;
                    }
                    str = str2;
                }
                s17.close();
            } else {
                j17 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i27 = 0;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13771, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17 / 1000), java.lang.Integer.valueOf(i27), sb6.toString());
            java.lang.System.currentTimeMillis();
        }
        if (brandServiceNotifyUI.f198029p != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13932, java.lang.Integer.valueOf(((int) (java.lang.System.currentTimeMillis() - brandServiceNotifyUI.f198029p)) / 1000), 2, java.lang.Long.valueOf(brandServiceNotifyUI.f198032s), 0, java.lang.Integer.valueOf(brandServiceNotifyUI.f198027n));
        }
        if (brandServiceNotifyUI.f198022f == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : brandServiceNotifyUI.f198022f.f198052J.entrySet()) {
            com.tencent.mm.ui.brandservice.m mVar = (com.tencent.mm.ui.brandservice.m) entry.getValue();
            r45.jp5 jp5Var = new r45.jp5();
            jp5Var.f378009d = (java.lang.String) entry.getKey();
            jp5Var.f378010e = mVar.f378010e;
            jp5Var.f378011f = mVar.f378011f;
            jp5Var.f378015m = mVar.f378015m;
            jp5Var.f378013h = mVar.f198058p > 0;
            jp5Var.f378016n = mVar.f378016n;
            jp5Var.f378012g = mVar.f378012g;
            jp5Var.f378014i = mVar.f378014i;
            linkedList.add(jp5Var);
        }
        gm0.j1.n().f273288b.g(new r01.n3(linkedList));
        linkedList.size();
    }
}

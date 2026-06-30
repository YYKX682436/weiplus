package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class l4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142900d;

    public l4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142900d = iPCallShareCouponCardUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142900d;
        java.util.LinkedList linkedList = iPCallShareCouponCardUI.B.f387082d;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList svr size =" + linkedList.size());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(8);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            i17 = 1;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.t57 t57Var = (r45.t57) it.next();
            androidx.appcompat.app.AppCompatActivity context = iPCallShareCouponCardUI.getContext();
            int i18 = t57Var.f386165d;
            if (i18 != 8 && i18 != 0 && i18 != 1 && i18 != 2 && i18 != 3 && i18 != 5) {
                if (i18 == 4) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0("com.whatsapp")) {
                        try {
                            context.getPackageManager().getApplicationInfo("com.whatsapp", 8192);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        }
                    }
                    z17 = false;
                } else if (i18 == 6) {
                    z17 = c01.z1.C();
                } else {
                    if (i18 == 7 && !com.tencent.mm.sdk.platformtools.t8.K0("com.facebook.orca")) {
                        context.getPackageManager().getApplicationInfo("com.facebook.orca", 8192);
                    }
                    z17 = false;
                }
            }
            if (z17) {
                linkedList2.add(java.lang.Integer.valueOf(t57Var.f386165d));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList final size =" + linkedList2.size());
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it6.next();
            androidx.appcompat.app.AppCompatActivity context2 = iPCallShareCouponCardUI.getContext();
            int intValue = num.intValue();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(8, context2.getString(com.tencent.mm.R.string.g4l));
            hashMap.put(0, context2.getString(com.tencent.mm.R.string.l8i));
            hashMap.put(java.lang.Integer.valueOf(i17), context2.getString(com.tencent.mm.R.string.g4q));
            hashMap.put(3, context2.getString(com.tencent.mm.R.string.g4m));
            hashMap.put(2, context2.getString(com.tencent.mm.R.string.g4p));
            hashMap.put(5, context2.getString(com.tencent.mm.R.string.g4r));
            hashMap.put(4, context2.getString(com.tencent.mm.R.string.g4s));
            hashMap.put(6, context2.getString(com.tencent.mm.R.string.g4o));
            hashMap.put(7, context2.getString(com.tencent.mm.R.string.g4n));
            java.lang.String str = hashMap.containsKey(java.lang.Integer.valueOf(intValue)) ? (java.lang.String) hashMap.get(java.lang.Integer.valueOf(intValue)) : null;
            int intValue2 = num.intValue();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(8, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_copy));
            hashMap2.put(0, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_repost));
            hashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_moment));
            hashMap2.put(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_email));
            hashMap2.put(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_sms));
            hashMap2.put(5, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_twitter));
            hashMap2.put(4, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_whatsapp));
            hashMap2.put(6, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_facebook));
            hashMap2.put(7, java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_messenger));
            int intValue3 = hashMap2.containsKey(java.lang.Integer.valueOf(intValue2)) ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(intValue2))).intValue() : -1;
            if (str != null && intValue3 != -1) {
                g4Var.g(num.intValue(), str, intValue3);
            }
            i17 = 1;
        }
    }
}

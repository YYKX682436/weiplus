package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.h0 f155155e;

    public e0(com.tencent.mm.plugin.recharge.ui.h0 h0Var, java.lang.String str) {
        this.f155155e = h0Var;
        this.f155154d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155155e.f155189a;
        int i17 = com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.Q;
        phoneRechargeUI.getClass();
        java.lang.String str = this.f155154d;
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "handle phone number: %s", str);
        vs3.a Di = us3.e.Di();
        if (Di == null || !str.equals(Di.f439875a)) {
            java.util.List list = phoneRechargeUI.M;
            if (list == null || list.isEmpty()) {
                phoneRechargeUI.M = o25.b.e(phoneRechargeUI.getContext());
            }
            java.util.List list2 = phoneRechargeUI.M;
            int[] iArr = vs3.a.f439873f;
            if (list2 != null && !list2.isEmpty()) {
                java.util.Iterator it = phoneRechargeUI.M.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Di = new vs3.a(str, "", 1);
                        Di.f439879e = iArr;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "not in address");
                        break;
                    }
                    java.lang.String[] strArr = (java.lang.String[]) it.next();
                    java.lang.String a17 = vs3.b.a(strArr[2]);
                    if (str.equals(a17)) {
                        vs3.a aVar = new vs3.a(a17, strArr[1], 1);
                        aVar.f439879e = iArr;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "find in address number");
                        Di = aVar;
                        break;
                    }
                }
            } else {
                java.util.List Bi = us3.e.Ai().Bi();
                if (!Bi.isEmpty()) {
                    java.util.Iterator it6 = Bi.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            Di = new vs3.a(str, phoneRechargeUI.getString(com.tencent.mm.R.string.kxv), 0);
                            Di.f439879e = iArr;
                            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "not find in history");
                            break;
                        } else {
                            vs3.a aVar2 = (vs3.a) it6.next();
                            if (aVar2.f439875a.equals(str)) {
                                Di = new vs3.a(str, aVar2.f439876b, aVar2.f439877c, 2);
                                Di.f439879e = iArr;
                                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "find in history");
                                break;
                            }
                        }
                    }
                } else {
                    Di = new vs3.a(str, "", 0);
                    Di.f439879e = iArr;
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "empty history");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "find bind mobile");
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.recharge.ui.d0(this, Di));
    }
}

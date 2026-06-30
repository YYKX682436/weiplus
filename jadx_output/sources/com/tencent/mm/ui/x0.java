package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zs3 f212536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.y0 f212537e;

    public x0(com.tencent.mm.ui.y0 y0Var, r45.zs3 zs3Var) {
        this.f212537e = y0Var;
        this.f212536d = zs3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.zs3 zs3Var = this.f212536d;
        java.util.LinkedList linkedList = zs3Var.f392348e;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNotifySettingsUI", "getNotifyMsgInfo, configList is null");
            return;
        }
        com.tencent.mm.ui.y0 y0Var = this.f212537e;
        com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI = y0Var.f212569d;
        int i17 = com.tencent.mm.ui.AppBrandNotifySettingsUI.f196579m;
        appBrandNotifySettingsUI.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.le7 le7Var = (r45.le7) it.next();
            com.tencent.mm.ui.a1 a1Var = new com.tencent.mm.ui.a1(null);
            java.lang.String str = le7Var.f379398d;
            k91.v5 Ai = ((k91.g4) f6Var).Ai(str);
            if (Ai == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, appId:%s", str);
            } else {
                a1Var.f197112a = Ai.field_username;
                a1Var.f197114c = Ai.field_nickname;
                a1Var.f197113b = Ai.field_brandIconURL;
                a1Var.f197115d = le7Var.f379399e == 0;
                linkedList2.add(a1Var);
            }
        }
        java.util.LinkedList linkedList3 = appBrandNotifySettingsUI.f196581e.f208408e;
        linkedList3.clear();
        if (!linkedList2.isEmpty()) {
            linkedList3.addAll(linkedList2);
        }
        appBrandNotifySettingsUI.f196581e.notifyDataSetChanged();
        com.tencent.mm.ui.AppBrandNotifySettingsUI.T6(y0Var.f212569d, zs3Var.f392348e);
    }
}

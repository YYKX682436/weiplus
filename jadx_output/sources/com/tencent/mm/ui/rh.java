package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class rh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.un3 f209745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209746e;

    public rh(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI, r45.un3 un3Var) {
        this.f209746e = serviceNotifySettingsUI;
        this.f209745d = un3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI = this.f209746e;
        if (serviceNotifySettingsUI.f197062i == 1) {
            java.util.LinkedList linkedList = this.f209745d.f387493g;
            serviceNotifySettingsUI.getClass();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q06 q06Var = (r45.q06) it.next();
                com.tencent.mm.ui.vh vhVar = new com.tencent.mm.ui.vh(null);
                vhVar.f211157a = q06Var.f383537d;
                vhVar.f211159c = q06Var.f383539f;
                vhVar.f211158b = q06Var.f383540g;
                linkedList2.add(vhVar);
            }
            java.util.LinkedList linkedList3 = serviceNotifySettingsUI.f197059f.f212560h;
            linkedList3.clear();
            if (!linkedList2.isEmpty()) {
                linkedList3.addAll(linkedList2);
            }
            serviceNotifySettingsUI.f197059f.notifyDataSetChanged();
        }
    }
}

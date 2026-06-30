package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ft implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f168359d;

    public ft(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f168359d = snsUIAction;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
        com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
        java.lang.String d17 = com.tencent.mm.plugin.sns.ui.SnsUIAction.d(this.f168359d);
        Ej.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        java.util.LinkedList<r45.yb6> linkedList = Ej.J0(d17).v0().f370660d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        ca4.r0 r0Var = new ca4.r0();
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(linkedList);
        java.util.ArrayList arrayList = r0Var.f40009a;
        java.util.ArrayList arrayList2 = r0Var.f40010b;
        if (!L0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String str = "";
            for (r45.yb6 yb6Var : linkedList) {
                java.lang.String valueOf = java.lang.String.valueOf(yb6Var.f390949d);
                java.lang.String valueOf2 = java.lang.String.valueOf(yb6Var.f390950e);
                java.lang.Long valueOf3 = java.lang.Long.valueOf(yb6Var.f390951f);
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, valueOf)) {
                    arrayList3 = new java.util.ArrayList();
                    hashMap = new java.util.HashMap();
                    arrayList.add(valueOf);
                    arrayList2.add(arrayList3);
                    ((java.util.HashMap) r0Var.f40011c).put(valueOf, hashMap);
                    str = valueOf;
                }
                arrayList3.add(valueOf2);
                hashMap.put(valueOf2, valueOf3);
            }
        }
        java.util.Collections.reverse(arrayList);
        java.util.Collections.reverse(arrayList2);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.Collections.reverse((java.util.List) it.next());
        }
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.ui.et(this, r0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
    }
}

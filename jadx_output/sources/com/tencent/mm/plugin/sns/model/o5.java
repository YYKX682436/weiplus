package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o5 implements com.tencent.mm.plugin.sns.storage.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f164549a = new java.util.HashMap();

    public static void a(com.tencent.mm.plugin.sns.model.o5 o5Var, int i17) {
        boolean z17;
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        o5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        java.util.HashMap hashMap = o5Var.f164549a;
        if (hashMap == null || hashMap.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtCache", "nothing need to pushto snsext");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        } else {
            java.lang.System.currentTimeMillis();
            if (com.tencent.mm.plugin.sns.model.l4.aj() != null) {
                j17 = com.tencent.mm.plugin.sns.model.l4.aj().F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                z17 = true;
            } else {
                z17 = false;
                j17 = 0;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
                if (linkedList.size() >= i17) {
                    break;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (hashMap.containsKey(str) && !com.tencent.mm.plugin.sns.model.l4.Xj()) {
                    com.tencent.mm.plugin.sns.model.l4.Ej().n1((com.tencent.mm.plugin.sns.storage.d2) hashMap.get(str));
                    hashMap.remove(str);
                }
            }
            if (z17) {
                com.tencent.mm.plugin.sns.model.l4.aj().w(java.lang.Long.valueOf(j17));
            }
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
    }
}

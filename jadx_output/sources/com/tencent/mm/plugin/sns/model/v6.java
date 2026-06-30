package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f164722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.w6 f164723e;

    public v6(com.tencent.mm.plugin.sns.model.w6 w6Var, java.util.List list) {
        this.f164723e = w6Var;
        this.f164722d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
        java.util.List list = this.f164722d;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            com.tencent.mm.plugin.sns.model.w6 w6Var = this.f164723e;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(w6Var.f164739a.f444287d)) {
                long longValue = ((java.lang.Long) list.get(0)).longValue();
                long longValue2 = ((java.lang.Long) list.get(list.size() - 1)).longValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = w6Var.f164739a.f444287d.iterator();
                while (it.hasNext()) {
                    wa4.w wVar = (wa4.w) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(wVar.f444290d)) {
                        java.util.Iterator it6 = wVar.f444290d.iterator();
                        while (it6.hasNext()) {
                            java.lang.Long l17 = (java.lang.Long) it6.next();
                            if (l17.longValue() < longValue && l17.longValue() > longValue2) {
                                arrayList.add(l17);
                            }
                        }
                    }
                }
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    java.lang.Long l18 = (java.lang.Long) it7.next();
                    if (!list.contains(l18)) {
                        long longValue3 = l18.longValue();
                        w6Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUnreadTipManager", "removeFeed:%s", java.lang.Long.valueOf(longValue3));
                        wa4.v vVar = w6Var.f164739a;
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(vVar.f444287d)) {
                            java.util.Iterator it8 = vVar.f444287d.iterator();
                            while (it8.hasNext()) {
                                wa4.w wVar2 = (wa4.w) it8.next();
                                wVar2.f444290d.remove(java.lang.Long.valueOf(longValue3));
                                if (com.tencent.mm.sdk.platformtools.t8.L0(wVar2.f444290d)) {
                                    it8.remove();
                                    if (wVar2 == w6Var.f164740b) {
                                        w6Var.f164740b = null;
                                    }
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
    }
}

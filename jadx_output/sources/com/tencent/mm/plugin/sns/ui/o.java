package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f170060a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f170061b;

    public o() {
        this.f170060a = null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f170061b = linkedList;
        this.f170060a = com.tencent.mm.plugin.sns.model.l4.Tj();
        linkedList.clear();
    }

    public void a(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        int i17 = !z17 ? 1 : 0;
        java.util.List list = this.f170061b;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                    z18 = false;
                    break;
                } else if (((java.lang.Integer) it.next()).intValue() == i17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                    z18 = true;
                    break;
                }
            }
            if (z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                return;
            }
        }
        if (z17) {
            ((java.util.LinkedList) list).size();
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        if (linkedList.size() > 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        linkedList.add(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        if (z17) {
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.ui.l(this, z17));
        } else {
            java.util.List b17 = b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            this.f170060a.post(new com.tencent.mm.plugin.sns.ui.m(this, b17, true));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
    }

    public abstract java.util.List b();

    public abstract void c(java.util.List list);
}

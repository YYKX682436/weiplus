package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class b extends hm0.x {
    @Override // hm0.t
    public void b() {
        java.util.ArrayList arrayList = com.tencent.mm.plugin.performance.diagnostic.c.f152911a;
        synchronized (arrayList) {
            com.tencent.mm.plugin.performance.diagnostic.c.f152912b = true;
            jx3.f.INSTANCE.b(arrayList, false);
            arrayList.clear();
        }
    }
}

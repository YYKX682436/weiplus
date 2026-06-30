package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f115668a = new java.util.LinkedList();

    public final void a(java.lang.String tag, int i17, int i18) {
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i("NewClickCntManager", "oldClickCnt:" + i17 + "  newClickCnt:" + i18);
        pm0.z.b(xy2.b.f458155b, "newOldDiffCntEqauls", i17 == i18, null, null, false, false, new com.tencent.mm.plugin.finder.live.util.q2(tag, i17, i18), 60, null);
    }

    public final int b(boolean z17) {
        int i17;
        synchronized (this.f115668a) {
            try {
                if (z17) {
                    i17 = 0;
                    while (!this.f115668a.isEmpty()) {
                        com.tencent.mm.plugin.finder.live.util.p2 p2Var = (com.tencent.mm.plugin.finder.live.util.p2) this.f115668a.poll();
                        i17 += p2Var != null ? p2Var.f115648b : 0;
                    }
                } else {
                    java.util.Iterator it = this.f115668a.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        i18 += ((com.tencent.mm.plugin.finder.live.util.p2) it.next()).f115648b;
                    }
                    i17 = 0 + i18;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return i17;
    }

    public final void c(dk2.g comboData, int i17) {
        kotlin.jvm.internal.o.g(comboData, "comboData");
        synchronized (this.f115668a) {
            this.f115668a.offer(new com.tencent.mm.plugin.finder.live.util.p2(comboData.f233467b, i17));
        }
    }
}

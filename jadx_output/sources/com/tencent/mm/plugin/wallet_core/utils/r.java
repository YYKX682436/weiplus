package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes8.dex */
public final class r {
    public final void a(java.util.List messages, com.tencent.mm.plugin.wallet_core.utils.p eventType) {
        kotlin.jvm.internal.o.g(messages, "messages");
        kotlin.jvm.internal.o.g(eventType, "eventType");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = messages.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) next;
            if ((!f9Var.k2() || f9Var.j() == null || f9Var.Q0() == null) ? false : true) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.wallet_core.utils.q(arrayList, this, eventType), "MessageReportor-report");
        }
    }
}

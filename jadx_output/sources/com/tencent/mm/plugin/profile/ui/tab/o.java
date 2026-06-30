package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.e f154494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154495e;

    public o(com.tencent.mm.plugin.profile.ui.tab.e eVar, java.util.ArrayList arrayList) {
        this.f154494d = eVar;
        this.f154495e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList messages = this.f154495e;
        kotlin.jvm.internal.o.f(messages, "$messages");
        vr3.r rVar = (vr3.r) this.f154494d;
        rVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = messages.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = rVar.f439645a;
            if (!hasNext) {
                ik1.h0.b(new vr3.q(bizProfileDataFetcher, arrayList));
                return;
            } else {
                r45.e6 e6Var = (r45.e6) it.next();
                arrayList.add(new vr3.h(e6Var.f373038d, bizProfileDataFetcher.a(e6Var.f373039e.f374031d)));
            }
        }
    }
}

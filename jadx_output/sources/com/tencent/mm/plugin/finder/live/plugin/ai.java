package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ai implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ci f111887d;

    public ai(com.tencent.mm.plugin.finder.live.plugin.ci ciVar) {
        this.f111887d = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ci ciVar = this.f111887d;
        bw5.x7 x7Var = ((mm2.f6) ciVar.S0().a(mm2.f6.class)).f329041p0;
        if (x7Var != null) {
            android.content.Context context = ciVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
            return;
        }
        r45.c33 c33Var = ((mm2.f6) ciVar.S0().a(mm2.f6.class)).Z;
        if (c33Var == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = c33Var.getString(0);
        b1Var.f317022f = c33Var.getString(1);
        b1Var.f317032k = 1177;
        b1Var.X = k91.b1.f305541e;
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context2 = ciVar.f365323d.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        q4Var.l(context2, ciVar.S0(), b1Var, true, null);
    }
}

package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class dd implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.jd f123626d;

    public dd(com.tencent.mm.plugin.finder.profile.uic.jd jdVar) {
        this.f123626d = jdVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        so2.q1 q1Var = obj instanceof so2.q1 ? (so2.q1) obj : null;
        if (q1Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.jd jdVar = this.f123626d;
        jdVar.O6().getDataListJustForAdapter().indexOf(q1Var);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.a aVar = new pq.a(jdVar.getContext());
        byte[] byteArray = q1Var.f410545d.b().toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        pq.q.hf((pq.q) c17, aVar, byteArray, null, 4, null);
    }
}

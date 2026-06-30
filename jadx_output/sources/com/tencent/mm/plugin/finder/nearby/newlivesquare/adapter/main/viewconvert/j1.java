package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121738b;

    public j1(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var) {
        this.f121737a = s0Var;
        this.f121738b = p1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271 A[SYNTHETIC] */
    @Override // in5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.Set r28) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j1.c(java.util.Set):void");
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        sp2.k kVar = this.f121738b.f121872g;
        int i17 = item.f293074e;
        in5.c cVar = item.f293070a;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        vp2.n nVar = cVar instanceof vp2.n ? (vp2.n) cVar : null;
        if (nVar != null) {
            nVar.f438945e = q17;
        }
        vp2.l lVar = cVar instanceof vp2.l ? (vp2.l) cVar : null;
        if (lVar != null) {
            lVar.f438938g = q17;
        }
        sp2.j jVar = sp2.j.f411054a;
        android.content.Context context = this.f121737a.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}

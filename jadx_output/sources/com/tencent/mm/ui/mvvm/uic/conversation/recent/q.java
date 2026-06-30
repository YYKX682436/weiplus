package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        super(1);
        this.f209353d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar = this.f209353d;
        if (dVar != null && (dVar instanceof wi5.e)) {
            tVar.W6(state);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            tVar.W6(state);
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            j75.e eVar = t0Var.f298067a;
            if (eVar == null || !(eVar instanceof wi5.w0)) {
                eVar = null;
            } else {
                if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                    tVar.V6(t0Var.f446341b.f396111f);
                }
            }
        }
        wi5.x0 x0Var = (wi5.x0) state.a(wi5.x0.class);
        if (x0Var != null) {
            tVar.V6(x0Var.f446361b);
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            wi5.m0 m0Var = (wi5.m0) dVar3;
            java.util.Iterator it = tVar.f209365d.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.contact.v8 v8Var = (com.tencent.mm.ui.contact.v8) it.next();
                v8Var.f207220d.f207233c = false;
                java.util.List<java.lang.String> list = m0Var.f446310b;
                if (list != null) {
                    for (java.lang.String str : list) {
                        com.tencent.mm.ui.contact.w8 w8Var = v8Var.f207220d;
                        if (kotlin.jvm.internal.o.b(w8Var.f207231a, str)) {
                            w8Var.f207233c = true;
                        }
                    }
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tVar.f209367f;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.c0)) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.t.U6(tVar);
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof xi5.e)) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.t.U6(tVar);
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof wi5.k)) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.t.U6(tVar);
        }
        return jz5.f0.f302826a;
    }
}

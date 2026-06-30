package qt;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt.d f366487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qt.d dVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f366487d = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new qt.c(this.f366487d, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((qt.c) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        v05.b k17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        qt.d dVar = this.f366487d;
        oi3.e eVar = dVar.f366488o.f412188j;
        java.lang.String string = eVar != null ? eVar.getString(eVar.f345617d + 3) : null;
        oi3.e eVar2 = dVar.f366488o.f412188j;
        boolean z17 = false;
        com.tencent.mm.storage.f9 k18 = e0Var.k(string, eVar2 != null ? eVar2.getLong(eVar2.f345617d + 0) : 0L);
        if (k18 == null) {
            return null;
        }
        qi3.d0 d0Var = dVar.f366488o.f412193o;
        if (d0Var != null && d0Var.f363685c == 0) {
            if (d0Var != null && d0Var.f363686d == 0) {
                java.lang.Object obj2 = d0Var != null ? d0Var.f363689g : null;
                if ((obj2 instanceof r45.qy5 ? (r45.qy5) obj2 : null) != null && com.tencent.mm.storage.z3.N4(k18.Q0())) {
                    l15.c cVar = dVar.f366488o.f412180b;
                    if (cVar != null && (k17 = cVar.k()) != null && k17.getInteger(k17.f432315e + 75) == 1) {
                        z17 = true;
                    }
                    if (z17) {
                        ((hn.h0) ((vg3.h4) i95.n0.c(vg3.h4.class))).getClass();
                        kn.j0.a(k18, ot0.q.v(k18.S1()));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

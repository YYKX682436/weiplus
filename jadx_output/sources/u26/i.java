package u26;

/* loaded from: classes14.dex */
public final class i implements kotlinx.coroutines.selects.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.k f424153d;

    public i(u26.k kVar) {
        this.f424153d = kVar;
    }

    @Override // kotlinx.coroutines.selects.g
    public void o(kotlinx.coroutines.selects.h hVar, yz5.p pVar) {
        u26.k kVar = this.f424153d;
        kVar.getClass();
        while (true) {
            kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) hVar;
            if (fVar.y()) {
                return;
            }
            if (kVar.A()) {
                u26.e eVar = new u26.e(kVar, fVar, pVar, 1);
                boolean x17 = kVar.x(eVar);
                if (x17) {
                    fVar.u(eVar);
                }
                if (x17) {
                    return;
                }
            } else {
                java.lang.Object E = kVar.E(fVar);
                if (E == kotlinx.coroutines.selects.i.f310639b) {
                    return;
                }
                if (E != u26.l.f424169d && E != kotlinx.coroutines.internal.c.f310486b) {
                    boolean z17 = E instanceof u26.e0;
                    if (!z17) {
                        if (z17) {
                            E = new u26.a0(((u26.e0) E).f424148g);
                        }
                        w26.a.a(pVar, new u26.c0(E), fVar);
                    } else if (fVar.B()) {
                        w26.a.a(pVar, new u26.c0(new u26.a0(((u26.e0) E).f424148g)), fVar);
                    }
                }
            }
        }
    }
}

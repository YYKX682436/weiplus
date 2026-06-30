package rr3;

/* loaded from: classes4.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.d f399169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rr3.c f399170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f399171f;

    public a(ym3.d dVar, rr3.c cVar, kotlinx.coroutines.flow.i2 i2Var) {
        this.f399169d = dVar;
        this.f399170e = cVar;
        this.f399171f = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ym ymVar;
        o01.a aVar = (o01.a) obj;
        q01.f fVar = aVar.f359284a;
        q01.f fVar2 = q01.f.f359276e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (fVar != fVar2) {
            return f0Var;
        }
        r45.p14 p14Var = (aVar.f359286c == 0 && aVar.f359285b == 0) ? (r45.p14) aVar.f359289f : null;
        int i17 = 0;
        ym3.d dVar = this.f399169d;
        if (p14Var == null) {
            dVar.f463148b = false;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList<r45.ym> linkedList = p14Var.f382659d;
            if (linkedList != null) {
                for (r45.ym ymVar2 : linkedList) {
                    kotlin.jvm.internal.o.d(ymVar2);
                    arrayList.add(new rr3.d(ymVar2, 0, 2, null));
                }
            }
            dVar.f463149c.addAll(arrayList);
            dVar.f463148b = p14Var.f382660e == 1;
            rr3.d dVar2 = (rr3.d) kz5.n0.k0(arrayList);
            if (dVar2 != null && (ymVar = dVar2.f399181d) != null) {
                i17 = ymVar.f391209e;
            }
            this.f399170e.f399179e = i17;
        }
        if (!dVar.f463148b) {
            dVar.f463149c.add(new rr3.d(null, 1, 1, null));
        }
        java.lang.Object emit = this.f399171f.emit(dVar, continuation);
        return emit == pz5.a.f359186d ? emit : f0Var;
    }
}

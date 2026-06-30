package iv5;

/* loaded from: classes16.dex */
public class l extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295164d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295165e;

    public l(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295164d = null;
        this.f295165e = null;
        av5.n0 n0Var = yVar2.f14462a.f14432i;
        this.f295164d = n0Var;
        this.f295165e = yVar2.d(n0Var);
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.h0 h0Var = (av5.h0) comparable;
        fVar.getClass();
        int ordinal = h0Var.f14381e.ordinal();
        boolean z17 = true;
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
            z17 = false;
        }
        int i17 = h0Var.f14383g;
        return new av5.h0(h0Var.f14417d, h0Var.f14381e, h0Var.f14382f, z17 ? fVar.b(i17) : fVar.c(i17), h0Var.f14384h);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14432i;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f312782w.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.n();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f312766g.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.h0 h0Var = (av5.h0) comparable;
        this.f295164d.f14420f++;
        av5.u uVar = this.f295165e;
        int position = uVar.f24762a.position();
        uVar.z(h0Var.f14381e.f14376d);
        uVar.z(h0Var.f14382f);
        uVar.z(h0Var.f14383g);
        uVar.z(h0Var.f14384h);
        return position;
    }
}

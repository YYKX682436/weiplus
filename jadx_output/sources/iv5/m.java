package iv5;

/* loaded from: classes16.dex */
public class m extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295166d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295167e;

    public m(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295166d = null;
        this.f295167e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14429f;
            this.f295166d = n0Var;
            this.f295167e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.i0 i0Var = (av5.i0) comparable;
        fVar.getClass();
        return new av5.i0(i0Var.f14417d, fVar.g(i0Var.f14393e), fVar.e(i0Var.f14394f), fVar.f(i0Var.f14395g));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14429f;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f312780u.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.o();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f312764e.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.i0 i0Var = (av5.i0) comparable;
        this.f295166d.f14420f++;
        av5.u uVar = this.f295167e;
        uVar.A(uVar.f14457f.f14462a.f14429f, true);
        int position = uVar.f24762a.position();
        uVar.z(i0Var.f14393e);
        uVar.z(i0Var.f14394f);
        uVar.w(i0Var.f14395g);
        return position;
    }
}

package iv5;

/* loaded from: classes16.dex */
public class k extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295162d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295163e;

    public k(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295162d = null;
        this.f295163e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14428e;
            this.f295162d = n0Var;
            this.f295163e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.e0 e0Var = (av5.e0) comparable;
        fVar.getClass();
        return new av5.e0(e0Var.f14417d, fVar.g(e0Var.f14367e), fVar.g(e0Var.f14368f), fVar.f(e0Var.f14369g));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14428e;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f312779t.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.l();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f312763d.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.e0 e0Var = (av5.e0) comparable;
        this.f295162d.f14420f++;
        av5.u uVar = this.f295163e;
        uVar.A(uVar.f14457f.f14462a.f14428e, true);
        int position = uVar.f24762a.position();
        uVar.z(e0Var.f14367e);
        uVar.z(e0Var.f14368f);
        uVar.w(e0Var.f14369g);
        return position;
    }
}

package iv5;

/* loaded from: classes16.dex */
public class q extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295176d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295177e;

    public q(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295176d = null;
        this.f295177e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14426c;
            this.f295176d = n0Var;
            this.f295177e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        return java.lang.Integer.valueOf(fVar.f(((java.lang.Integer) comparable).intValue()));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14426c;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f312777r.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return java.lang.Integer.valueOf(bVar.m());
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f312761b.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.u uVar = this.f295177e;
        int position = uVar.f24762a.position();
        uVar.w(((java.lang.Integer) comparable).intValue());
        this.f295176d.f14420f++;
        return position;
    }
}

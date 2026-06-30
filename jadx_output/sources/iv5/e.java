package iv5;

/* loaded from: classes16.dex */
public class e extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295147d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295148e;

    public e(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295147d = null;
        this.f295148e = null;
        av5.n0 n0Var = yVar2.f14462a.f14431h;
        this.f295147d = n0Var;
        this.f295148e = yVar2.d(n0Var);
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.e eVar = (av5.e) comparable;
        fVar.getClass();
        int i17 = eVar.f14366e;
        kv5.i iVar = (kv5.i) fVar;
        fv5.b bVar = iVar.f312772m;
        int d17 = bVar.d(i17);
        if (d17 >= 0) {
            i17 = bVar.f267022e[d17];
        } else if (i17 >= 0 && iVar.C.a(i17)) {
            i17 = -1;
        }
        return new av5.e(eVar.f14417d, i17);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14431h;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i17 < 0) {
            iVar.getClass();
        } else {
            iVar.f312781v.b(i17, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return new av5.e(bVar.f24762a.position(), bVar.m());
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            iVar.f312765f.f(i17, i19);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        this.f295147d.f14420f++;
        av5.u uVar = this.f295148e;
        int position = uVar.f24762a.position();
        uVar.w(((av5.e) comparable).f14366e);
        return position;
    }
}

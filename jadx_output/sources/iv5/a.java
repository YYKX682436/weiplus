package iv5;

/* loaded from: classes16.dex */
public class a extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295139d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295140e;

    public a(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295139d = null;
        this.f295140e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14441r;
            this.f295139d = n0Var;
            this.f295140e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.a aVar = (av5.a) comparable;
        fVar.getClass();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(aVar.f14352f.f14356e.length);
        kv5.e eVar = new kv5.e(fVar, new kv5.d(fVar, byteArrayOutputStream));
        av5.b0 b0Var = aVar.f14352f;
        eVar.b(new av5.d0(b0Var, 29));
        return new av5.a(aVar.f14417d, aVar.f14351e, new av5.b0(b0Var.f14417d, byteArrayOutputStream.toByteArray()));
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14441r;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.f312784y.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.b();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f312768i.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.a aVar = (av5.a) comparable;
        this.f295139d.f14420f++;
        av5.u uVar = this.f295140e;
        uVar.A(uVar.f14457f.f14462a.f14441r, true);
        int position = uVar.f24762a.position();
        uVar.e(aVar.f14351e);
        uVar.B(aVar.f14352f);
        return position;
    }
}

package iv5;

/* loaded from: classes16.dex */
public class o extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295170d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295171e;

    public o(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295170d = null;
        this.f295171e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14442s;
            this.f295170d = n0Var;
            this.f295171e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.b0 b0Var = (av5.b0) comparable;
        fVar.getClass();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(b0Var.f14356e.length);
        kv5.c cVar = new kv5.c(fVar, byteArrayOutputStream);
        kv5.e eVar = new kv5.e(fVar, cVar);
        av5.d0 d0Var = new av5.d0(b0Var, 28);
        d0Var.a(28);
        d0Var.f14363b = -1;
        int b17 = av5.f0.b(d0Var.f14362a);
        av5.f0.d(cVar, b17);
        for (int i17 = 0; i17 < b17; i17++) {
            eVar.a(d0Var);
        }
        return new av5.b0(b0Var.f14417d, byteArrayOutputStream.toByteArray());
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14442s;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.C.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.k();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f312772m.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        this.f295170d.f14420f++;
        return this.f295171e.B((av5.b0) comparable);
    }
}

package iv5;

/* loaded from: classes16.dex */
public class c extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295143d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295144e;

    public c(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295143d = null;
        this.f295144e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14436m;
            this.f295143d = n0Var;
            this.f295144e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.b bVar = (av5.b) comparable;
        fVar.getClass();
        int length = bVar.f14355e.length;
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = bVar.f14355e[i17];
            kv5.i iVar = (kv5.i) fVar;
            fv5.b bVar2 = iVar.f312768i;
            int d17 = bVar2.d(i18);
            if (d17 >= 0) {
                i18 = bVar2.f267022e[d17];
            } else if (i18 >= 0 && iVar.f312784y.a(i18)) {
                i18 = -1;
            }
            iArr[i17] = i18;
        }
        return new av5.b(bVar.f14417d, iArr);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14436m;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.f312785z.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.c();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f312769j.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.b bVar = (av5.b) comparable;
        this.f295143d.f14420f++;
        av5.u uVar = this.f295144e;
        uVar.A(uVar.f14457f.f14462a.f14436m, true);
        int position = uVar.f24762a.position();
        uVar.w(bVar.f14355e.length);
        for (int i17 : bVar.f14355e) {
            uVar.w(i17);
        }
        return position;
    }
}

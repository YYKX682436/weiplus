package iv5;

/* loaded from: classes16.dex */
public class d extends iv5.j {

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f295145d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.u f295146e;

    public d(jv5.a aVar, av5.y yVar, av5.y yVar2, kv5.i iVar) {
        super(aVar, yVar, iVar);
        this.f295145d = null;
        this.f295146e = null;
        if (yVar2 != null) {
            av5.n0 n0Var = yVar2.f14462a.f14443t;
            this.f295145d = n0Var;
            this.f295146e = yVar2.d(n0Var);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        av5.d dVar = (av5.d) comparable;
        fVar.getClass();
        int a17 = fVar.a(dVar.f14358e);
        int[][] iArr = dVar.f14359f;
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, iArr.length, 2);
        for (int i17 = 0; i17 < iArr2.length; i17++) {
            iArr2[i17][0] = fVar.b(iArr[i17][0]);
            iArr2[i17][1] = fVar.a(iArr[i17][1]);
        }
        int[][] iArr3 = dVar.f14360g;
        int[][] iArr4 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, iArr3.length, 2);
        for (int i18 = 0; i18 < iArr4.length; i18++) {
            iArr4[i18][0] = fVar.c(iArr3[i18][0]);
            iArr4[i18][1] = fVar.a(iArr3[i18][1]);
        }
        int[][] iArr5 = dVar.f14361h;
        int[][] iArr6 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, iArr5.length, 2);
        for (int i19 = 0; i19 < iArr6.length; i19++) {
            iArr6[i19][0] = fVar.c(iArr5[i19][0]);
            int[] iArr7 = iArr6[i19];
            int i27 = iArr5[i19][1];
            kv5.i iVar = (kv5.i) fVar;
            fv5.b bVar = iVar.f312770k;
            int d17 = bVar.d(i27);
            if (d17 >= 0) {
                i27 = bVar.f267022e[d17];
            } else if (i27 >= 0 && iVar.A.a(i27)) {
                i27 = -1;
            }
            iArr7[1] = i27;
        }
        return new av5.d(dVar.f14417d, a17, iArr2, iArr4, iArr6);
    }

    @Override // iv5.j
    public av5.n0 c(av5.y yVar) {
        return yVar.f14462a.f14443t;
    }

    @Override // iv5.j
    public void d(kv5.i iVar, int i17, int i18) {
        if (i18 < 0) {
            iVar.getClass();
        } else {
            iVar.B.b(i18, true);
        }
    }

    @Override // iv5.j
    public java.lang.Comparable e(bv5.b bVar) {
        return bVar.f();
    }

    @Override // iv5.j
    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            iVar.f312771l.f(i18, i27);
        }
    }

    @Override // iv5.j
    public int i(java.lang.Comparable comparable) {
        av5.d dVar = (av5.d) comparable;
        this.f295145d.f14420f++;
        av5.u uVar = this.f295146e;
        uVar.A(uVar.f14457f.f14462a.f14443t, true);
        int position = uVar.f24762a.position();
        uVar.w(dVar.f14358e);
        int[][] iArr = dVar.f14359f;
        uVar.w(iArr.length);
        int[][] iArr2 = dVar.f14360g;
        uVar.w(iArr2.length);
        int[][] iArr3 = dVar.f14361h;
        uVar.w(iArr3.length);
        for (int[] iArr4 : iArr) {
            uVar.w(iArr4[0]);
            uVar.w(iArr4[1]);
        }
        for (int[] iArr5 : iArr2) {
            uVar.w(iArr5[0]);
            uVar.w(iArr5[1]);
        }
        for (int[] iArr6 : iArr3) {
            uVar.w(iArr6[0]);
            uVar.w(iArr6[1]);
        }
        return position;
    }
}

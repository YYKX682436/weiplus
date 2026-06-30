package r45;

/* loaded from: classes14.dex */
public class e37 extends com.tencent.mm.protobuf.f {
    public r45.cu5 A;
    public int B;
    public r45.cu5 C;
    public int D;
    public int E;
    public int F;
    public r45.r24 G;
    public r45.cu5 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f372972J;
    public int K;
    public java.util.LinkedList L = new java.util.LinkedList();
    public r45.do5 M;
    public r45.ve0 N;
    public r45.kj3 P;

    /* renamed from: d, reason: collision with root package name */
    public r45.k37 f372973d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k37 f372974e;

    /* renamed from: f, reason: collision with root package name */
    public int f372975f;

    /* renamed from: g, reason: collision with root package name */
    public r45.c27 f372976g;

    /* renamed from: h, reason: collision with root package name */
    public r45.c27 f372977h;

    /* renamed from: i, reason: collision with root package name */
    public int f372978i;

    /* renamed from: m, reason: collision with root package name */
    public int f372979m;

    /* renamed from: n, reason: collision with root package name */
    public int f372980n;

    /* renamed from: o, reason: collision with root package name */
    public int f372981o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f372982p;

    /* renamed from: q, reason: collision with root package name */
    public int f372983q;

    /* renamed from: r, reason: collision with root package name */
    public r45.c27 f372984r;

    /* renamed from: s, reason: collision with root package name */
    public int f372985s;

    /* renamed from: t, reason: collision with root package name */
    public int f372986t;

    /* renamed from: u, reason: collision with root package name */
    public int f372987u;

    /* renamed from: v, reason: collision with root package name */
    public int f372988v;

    /* renamed from: w, reason: collision with root package name */
    public int f372989w;

    /* renamed from: x, reason: collision with root package name */
    public int f372990x;

    /* renamed from: y, reason: collision with root package name */
    public int f372991y;

    /* renamed from: z, reason: collision with root package name */
    public r45.cu5 f372992z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e37)) {
            return false;
        }
        r45.e37 e37Var = (r45.e37) fVar;
        return n51.f.a(this.f372973d, e37Var.f372973d) && n51.f.a(this.f372974e, e37Var.f372974e) && n51.f.a(java.lang.Integer.valueOf(this.f372975f), java.lang.Integer.valueOf(e37Var.f372975f)) && n51.f.a(this.f372976g, e37Var.f372976g) && n51.f.a(this.f372977h, e37Var.f372977h) && n51.f.a(java.lang.Integer.valueOf(this.f372978i), java.lang.Integer.valueOf(e37Var.f372978i)) && n51.f.a(java.lang.Integer.valueOf(this.f372979m), java.lang.Integer.valueOf(e37Var.f372979m)) && n51.f.a(java.lang.Integer.valueOf(this.f372980n), java.lang.Integer.valueOf(e37Var.f372980n)) && n51.f.a(java.lang.Integer.valueOf(this.f372981o), java.lang.Integer.valueOf(e37Var.f372981o)) && n51.f.a(this.f372982p, e37Var.f372982p) && n51.f.a(java.lang.Integer.valueOf(this.f372983q), java.lang.Integer.valueOf(e37Var.f372983q)) && n51.f.a(this.f372984r, e37Var.f372984r) && n51.f.a(java.lang.Integer.valueOf(this.f372985s), java.lang.Integer.valueOf(e37Var.f372985s)) && n51.f.a(java.lang.Integer.valueOf(this.f372986t), java.lang.Integer.valueOf(e37Var.f372986t)) && n51.f.a(java.lang.Integer.valueOf(this.f372987u), java.lang.Integer.valueOf(e37Var.f372987u)) && n51.f.a(java.lang.Integer.valueOf(this.f372988v), java.lang.Integer.valueOf(e37Var.f372988v)) && n51.f.a(java.lang.Integer.valueOf(this.f372989w), java.lang.Integer.valueOf(e37Var.f372989w)) && n51.f.a(java.lang.Integer.valueOf(this.f372990x), java.lang.Integer.valueOf(e37Var.f372990x)) && n51.f.a(java.lang.Integer.valueOf(this.f372991y), java.lang.Integer.valueOf(e37Var.f372991y)) && n51.f.a(this.f372992z, e37Var.f372992z) && n51.f.a(this.A, e37Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(e37Var.B)) && n51.f.a(this.C, e37Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(e37Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(e37Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(e37Var.F)) && n51.f.a(this.G, e37Var.G) && n51.f.a(this.H, e37Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(e37Var.I)) && n51.f.a(this.f372972J, e37Var.f372972J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(e37Var.K)) && n51.f.a(this.L, e37Var.L) && n51.f.a(this.M, e37Var.M) && n51.f.a(this.N, e37Var.N) && n51.f.a(this.P, e37Var.P);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.k37 k37Var = this.f372973d;
            if (k37Var != null) {
                fVar.i(1, k37Var.computeSize());
                this.f372973d.writeFields(fVar);
            }
            r45.k37 k37Var2 = this.f372974e;
            if (k37Var2 != null) {
                fVar.i(2, k37Var2.computeSize());
                this.f372974e.writeFields(fVar);
            }
            fVar.e(3, this.f372975f);
            r45.c27 c27Var = this.f372976g;
            if (c27Var != null) {
                fVar.i(4, c27Var.computeSize());
                this.f372976g.writeFields(fVar);
            }
            r45.c27 c27Var2 = this.f372977h;
            if (c27Var2 != null) {
                fVar.i(5, c27Var2.computeSize());
                this.f372977h.writeFields(fVar);
            }
            fVar.e(6, this.f372978i);
            fVar.e(7, this.f372979m);
            fVar.e(8, this.f372980n);
            fVar.e(9, this.f372981o);
            r45.cu5 cu5Var = this.f372982p;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.computeSize());
                this.f372982p.writeFields(fVar);
            }
            fVar.e(11, this.f372983q);
            r45.c27 c27Var3 = this.f372984r;
            if (c27Var3 != null) {
                fVar.i(12, c27Var3.computeSize());
                this.f372984r.writeFields(fVar);
            }
            fVar.e(13, this.f372985s);
            fVar.e(14, this.f372986t);
            fVar.e(15, this.f372987u);
            fVar.e(16, this.f372988v);
            fVar.e(17, this.f372989w);
            fVar.e(18, this.f372990x);
            fVar.e(19, this.f372991y);
            r45.cu5 cu5Var2 = this.f372992z;
            if (cu5Var2 != null) {
                fVar.i(20, cu5Var2.computeSize());
                this.f372992z.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.A;
            if (cu5Var3 != null) {
                fVar.i(21, cu5Var3.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.e(22, this.B);
            r45.cu5 cu5Var4 = this.C;
            if (cu5Var4 != null) {
                fVar.i(23, cu5Var4.computeSize());
                this.C.writeFields(fVar);
            }
            fVar.e(24, this.D);
            fVar.e(25, this.E);
            fVar.e(26, this.F);
            r45.r24 r24Var = this.G;
            if (r24Var != null) {
                fVar.i(27, r24Var.computeSize());
                this.G.writeFields(fVar);
            }
            r45.cu5 cu5Var5 = this.H;
            if (cu5Var5 != null) {
                fVar.i(28, cu5Var5.computeSize());
                this.H.writeFields(fVar);
            }
            fVar.e(29, this.I);
            java.lang.String str = this.f372972J;
            if (str != null) {
                fVar.j(30, str);
            }
            fVar.e(31, this.K);
            fVar.g(32, 8, this.L);
            r45.do5 do5Var = this.M;
            if (do5Var != null) {
                fVar.i(33, do5Var.computeSize());
                this.M.writeFields(fVar);
            }
            r45.ve0 ve0Var = this.N;
            if (ve0Var != null) {
                fVar.i(34, ve0Var.computeSize());
                this.N.writeFields(fVar);
            }
            r45.kj3 kj3Var = this.P;
            if (kj3Var != null) {
                fVar.i(35, kj3Var.computeSize());
                this.P.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.k37 k37Var3 = this.f372973d;
            int i18 = k37Var3 != null ? b36.f.i(1, k37Var3.computeSize()) + 0 : 0;
            r45.k37 k37Var4 = this.f372974e;
            if (k37Var4 != null) {
                i18 += b36.f.i(2, k37Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f372975f);
            r45.c27 c27Var4 = this.f372976g;
            if (c27Var4 != null) {
                e17 += b36.f.i(4, c27Var4.computeSize());
            }
            r45.c27 c27Var5 = this.f372977h;
            if (c27Var5 != null) {
                e17 += b36.f.i(5, c27Var5.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f372978i) + b36.f.e(7, this.f372979m) + b36.f.e(8, this.f372980n) + b36.f.e(9, this.f372981o);
            r45.cu5 cu5Var6 = this.f372982p;
            if (cu5Var6 != null) {
                e18 += b36.f.i(10, cu5Var6.computeSize());
            }
            int e19 = e18 + b36.f.e(11, this.f372983q);
            r45.c27 c27Var6 = this.f372984r;
            if (c27Var6 != null) {
                e19 += b36.f.i(12, c27Var6.computeSize());
            }
            int e27 = e19 + b36.f.e(13, this.f372985s) + b36.f.e(14, this.f372986t) + b36.f.e(15, this.f372987u) + b36.f.e(16, this.f372988v) + b36.f.e(17, this.f372989w) + b36.f.e(18, this.f372990x) + b36.f.e(19, this.f372991y);
            r45.cu5 cu5Var7 = this.f372992z;
            if (cu5Var7 != null) {
                e27 += b36.f.i(20, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.A;
            if (cu5Var8 != null) {
                e27 += b36.f.i(21, cu5Var8.computeSize());
            }
            int e28 = e27 + b36.f.e(22, this.B);
            r45.cu5 cu5Var9 = this.C;
            if (cu5Var9 != null) {
                e28 += b36.f.i(23, cu5Var9.computeSize());
            }
            int e29 = e28 + b36.f.e(24, this.D) + b36.f.e(25, this.E) + b36.f.e(26, this.F);
            r45.r24 r24Var2 = this.G;
            if (r24Var2 != null) {
                e29 += b36.f.i(27, r24Var2.computeSize());
            }
            r45.cu5 cu5Var10 = this.H;
            if (cu5Var10 != null) {
                e29 += b36.f.i(28, cu5Var10.computeSize());
            }
            int e37 = e29 + b36.f.e(29, this.I);
            java.lang.String str2 = this.f372972J;
            if (str2 != null) {
                e37 += b36.f.j(30, str2);
            }
            int e38 = e37 + b36.f.e(31, this.K) + b36.f.g(32, 8, this.L);
            r45.do5 do5Var2 = this.M;
            if (do5Var2 != null) {
                e38 += b36.f.i(33, do5Var2.computeSize());
            }
            r45.ve0 ve0Var2 = this.N;
            if (ve0Var2 != null) {
                e38 += b36.f.i(34, ve0Var2.computeSize());
            }
            r45.kj3 kj3Var2 = this.P;
            return kj3Var2 != null ? e38 + b36.f.i(35, kj3Var2.computeSize()) : e38;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.L.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.e37 e37Var = (r45.e37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr2 != null && bArr2.length > 0) {
                        k37Var5.parseFrom(bArr2);
                    }
                    e37Var.f372973d = k37Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var6.parseFrom(bArr3);
                    }
                    e37Var.f372974e = k37Var6;
                }
                return 0;
            case 3:
                e37Var.f372975f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.c27 c27Var7 = new r45.c27();
                    if (bArr4 != null && bArr4.length > 0) {
                        c27Var7.parseFrom(bArr4);
                    }
                    e37Var.f372976g = c27Var7;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.c27 c27Var8 = new r45.c27();
                    if (bArr5 != null && bArr5.length > 0) {
                        c27Var8.parseFrom(bArr5);
                    }
                    e37Var.f372977h = c27Var8;
                }
                return 0;
            case 6:
                e37Var.f372978i = aVar2.g(intValue);
                return 0;
            case 7:
                e37Var.f372979m = aVar2.g(intValue);
                return 0;
            case 8:
                e37Var.f372980n = aVar2.g(intValue);
                return 0;
            case 9:
                e37Var.f372981o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var11.b(bArr6);
                    }
                    e37Var.f372982p = cu5Var11;
                }
                return 0;
            case 11:
                e37Var.f372983q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.c27 c27Var9 = new r45.c27();
                    if (bArr7 != null && bArr7.length > 0) {
                        c27Var9.parseFrom(bArr7);
                    }
                    e37Var.f372984r = c27Var9;
                }
                return 0;
            case 13:
                e37Var.f372985s = aVar2.g(intValue);
                return 0;
            case 14:
                e37Var.f372986t = aVar2.g(intValue);
                return 0;
            case 15:
                e37Var.f372987u = aVar2.g(intValue);
                return 0;
            case 16:
                e37Var.f372988v = aVar2.g(intValue);
                return 0;
            case 17:
                e37Var.f372989w = aVar2.g(intValue);
                return 0;
            case 18:
                e37Var.f372990x = aVar2.g(intValue);
                return 0;
            case 19:
                e37Var.f372991y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var12.b(bArr8);
                    }
                    e37Var.f372992z = cu5Var12;
                }
                return 0;
            case 21:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var13.b(bArr9);
                    }
                    e37Var.A = cu5Var13;
                }
                return 0;
            case 22:
                e37Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr10 != null && bArr10.length > 0) {
                        cu5Var14.b(bArr10);
                    }
                    e37Var.C = cu5Var14;
                }
                return 0;
            case 24:
                e37Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                e37Var.E = aVar2.g(intValue);
                return 0;
            case 26:
                e37Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.r24 r24Var3 = new r45.r24();
                    if (bArr11 != null && bArr11.length > 0) {
                        r24Var3.parseFrom(bArr11);
                    }
                    e37Var.G = r24Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cu5Var15.b(bArr12);
                    }
                    e37Var.H = cu5Var15;
                }
                return 0;
            case 29:
                e37Var.I = aVar2.g(intValue);
                return 0;
            case 30:
                e37Var.f372972J = aVar2.k(intValue);
                return 0;
            case 31:
                e37Var.K = aVar2.g(intValue);
                return 0;
            case 32:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.f37 f37Var = new r45.f37();
                    if (bArr13 != null && bArr13.length > 0) {
                        f37Var.parseFrom(bArr13);
                    }
                    e37Var.L.add(f37Var);
                }
                return 0;
            case 33:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.do5 do5Var3 = new r45.do5();
                    if (bArr14 != null && bArr14.length > 0) {
                        do5Var3.parseFrom(bArr14);
                    }
                    e37Var.M = do5Var3;
                }
                return 0;
            case 34:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.ve0 ve0Var3 = new r45.ve0();
                    if (bArr15 != null && bArr15.length > 0) {
                        ve0Var3.parseFrom(bArr15);
                    }
                    e37Var.N = ve0Var3;
                }
                return 0;
            case 35:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.kj3 kj3Var3 = new r45.kj3();
                    if (bArr16 != null && bArr16.length > 0) {
                        kj3Var3.parseFrom(bArr16);
                    }
                    e37Var.P = kj3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

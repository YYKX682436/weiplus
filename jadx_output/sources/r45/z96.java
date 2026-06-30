package r45;

/* loaded from: classes4.dex */
public class z96 extends r45.mr5 {
    public java.lang.String A;
    public r45.lt B;
    public int C;
    public r45.o76 E;
    public r45.cu5 F;
    public r45.cu5 G;
    public r45.s15 H;
    public int I;
    public java.lang.String K;
    public r45.o86 L;
    public int M;
    public int P;
    public r45.cu5 R;
    public java.lang.String S;
    public int T;
    public int U;
    public int W;
    public java.lang.String X;

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f391801d;

    /* renamed from: e, reason: collision with root package name */
    public int f391802e;

    /* renamed from: g, reason: collision with root package name */
    public int f391804g;

    /* renamed from: h, reason: collision with root package name */
    public int f391805h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391806i;

    /* renamed from: m, reason: collision with root package name */
    public int f391807m;

    /* renamed from: n, reason: collision with root package name */
    public int f391808n;

    /* renamed from: p, reason: collision with root package name */
    public int f391810p;

    /* renamed from: q, reason: collision with root package name */
    public long f391811q;

    /* renamed from: r, reason: collision with root package name */
    public int f391812r;

    /* renamed from: t, reason: collision with root package name */
    public r45.kq6 f391814t;

    /* renamed from: u, reason: collision with root package name */
    public int f391815u;

    /* renamed from: w, reason: collision with root package name */
    public r45.w96 f391817w;

    /* renamed from: x, reason: collision with root package name */
    public r45.y96 f391818x;

    /* renamed from: y, reason: collision with root package name */
    public r45.da6 f391819y;

    /* renamed from: z, reason: collision with root package name */
    public r45.cu5 f391820z;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f391803f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f391809o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f391813s = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f391816v = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f391800J = new java.util.LinkedList();
    public java.util.LinkedList N = new java.util.LinkedList();
    public java.util.LinkedList Q = new java.util.LinkedList();
    public java.util.LinkedList V = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z96)) {
            return false;
        }
        r45.z96 z96Var = (r45.z96) fVar;
        return n51.f.a(this.BaseRequest, z96Var.BaseRequest) && n51.f.a(this.f391801d, z96Var.f391801d) && n51.f.a(java.lang.Integer.valueOf(this.f391802e), java.lang.Integer.valueOf(z96Var.f391802e)) && n51.f.a(this.f391803f, z96Var.f391803f) && n51.f.a(java.lang.Integer.valueOf(this.f391804g), java.lang.Integer.valueOf(z96Var.f391804g)) && n51.f.a(java.lang.Integer.valueOf(this.f391805h), java.lang.Integer.valueOf(z96Var.f391805h)) && n51.f.a(this.f391806i, z96Var.f391806i) && n51.f.a(java.lang.Integer.valueOf(this.f391807m), java.lang.Integer.valueOf(z96Var.f391807m)) && n51.f.a(java.lang.Integer.valueOf(this.f391808n), java.lang.Integer.valueOf(z96Var.f391808n)) && n51.f.a(this.f391809o, z96Var.f391809o) && n51.f.a(java.lang.Integer.valueOf(this.f391810p), java.lang.Integer.valueOf(z96Var.f391810p)) && n51.f.a(java.lang.Long.valueOf(this.f391811q), java.lang.Long.valueOf(z96Var.f391811q)) && n51.f.a(java.lang.Integer.valueOf(this.f391812r), java.lang.Integer.valueOf(z96Var.f391812r)) && n51.f.a(this.f391813s, z96Var.f391813s) && n51.f.a(this.f391814t, z96Var.f391814t) && n51.f.a(java.lang.Integer.valueOf(this.f391815u), java.lang.Integer.valueOf(z96Var.f391815u)) && n51.f.a(this.f391816v, z96Var.f391816v) && n51.f.a(this.f391817w, z96Var.f391817w) && n51.f.a(this.f391818x, z96Var.f391818x) && n51.f.a(this.f391819y, z96Var.f391819y) && n51.f.a(this.f391820z, z96Var.f391820z) && n51.f.a(this.A, z96Var.A) && n51.f.a(this.B, z96Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(z96Var.C)) && n51.f.a(this.D, z96Var.D) && n51.f.a(this.E, z96Var.E) && n51.f.a(this.F, z96Var.F) && n51.f.a(this.G, z96Var.G) && n51.f.a(this.H, z96Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(z96Var.I)) && n51.f.a(this.f391800J, z96Var.f391800J) && n51.f.a(this.K, z96Var.K) && n51.f.a(this.L, z96Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(z96Var.M)) && n51.f.a(this.N, z96Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(z96Var.P)) && n51.f.a(this.Q, z96Var.Q) && n51.f.a(this.R, z96Var.R) && n51.f.a(this.S, z96Var.S) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(z96Var.T)) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(z96Var.U)) && n51.f.a(this.V, z96Var.V) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(z96Var.W)) && n51.f.a(this.X, z96Var.X);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.D;
        java.util.LinkedList linkedList2 = this.f391809o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f391801d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f391801d.writeFields(fVar);
            }
            fVar.e(3, this.f391802e);
            fVar.g(4, 8, this.f391803f);
            fVar.e(5, this.f391804g);
            fVar.e(6, this.f391805h);
            java.lang.String str = this.f391806i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f391807m);
            fVar.e(9, this.f391808n);
            fVar.g(10, 8, linkedList2);
            fVar.e(11, this.f391810p);
            fVar.h(12, this.f391811q);
            fVar.e(13, this.f391812r);
            fVar.g(14, 8, this.f391813s);
            r45.kq6 kq6Var = this.f391814t;
            if (kq6Var != null) {
                fVar.i(15, kq6Var.computeSize());
                this.f391814t.writeFields(fVar);
            }
            fVar.e(16, this.f391815u);
            fVar.g(17, 8, this.f391816v);
            r45.w96 w96Var = this.f391817w;
            if (w96Var != null) {
                fVar.i(18, w96Var.computeSize());
                this.f391817w.writeFields(fVar);
            }
            r45.y96 y96Var = this.f391818x;
            if (y96Var != null) {
                fVar.i(19, y96Var.computeSize());
                this.f391818x.writeFields(fVar);
            }
            r45.da6 da6Var = this.f391819y;
            if (da6Var != null) {
                fVar.i(20, da6Var.computeSize());
                this.f391819y.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f391820z;
            if (cu5Var2 != null) {
                fVar.i(21, cu5Var2.computeSize());
                this.f391820z.writeFields(fVar);
            }
            java.lang.String str2 = this.A;
            if (str2 != null) {
                fVar.j(22, str2);
            }
            r45.lt ltVar = this.B;
            if (ltVar != null) {
                fVar.i(23, ltVar.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.e(24, this.C);
            fVar.g(25, 8, linkedList);
            r45.o76 o76Var = this.E;
            if (o76Var != null) {
                fVar.i(26, o76Var.computeSize());
                this.E.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.F;
            if (cu5Var3 != null) {
                fVar.i(27, cu5Var3.computeSize());
                this.F.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.G;
            if (cu5Var4 != null) {
                fVar.i(28, cu5Var4.computeSize());
                this.G.writeFields(fVar);
            }
            r45.s15 s15Var = this.H;
            if (s15Var != null) {
                fVar.i(29, s15Var.computeSize());
                this.H.writeFields(fVar);
            }
            fVar.e(32, this.I);
            fVar.g(33, 8, this.f391800J);
            java.lang.String str3 = this.K;
            if (str3 != null) {
                fVar.j(34, str3);
            }
            r45.o86 o86Var = this.L;
            if (o86Var != null) {
                fVar.i(35, o86Var.computeSize());
                this.L.writeFields(fVar);
            }
            fVar.e(36, this.M);
            fVar.k(37, 2, this.N);
            fVar.e(38, this.P);
            fVar.k(39, 2, this.Q);
            r45.cu5 cu5Var5 = this.R;
            if (cu5Var5 != null) {
                fVar.i(40, cu5Var5.computeSize());
                this.R.writeFields(fVar);
            }
            java.lang.String str4 = this.S;
            if (str4 != null) {
                fVar.j(41, str4);
            }
            fVar.e(42, this.T);
            fVar.e(43, this.U);
            fVar.g(44, 8, this.V);
            fVar.e(45, this.W);
            java.lang.String str5 = this.X;
            if (str5 == null) {
                return 0;
            }
            fVar.j(46, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var6 = this.f391801d;
            if (cu5Var6 != null) {
                i18 += b36.f.i(2, cu5Var6.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f391802e) + b36.f.g(4, 8, this.f391803f) + b36.f.e(5, this.f391804g) + b36.f.e(6, this.f391805h);
            java.lang.String str6 = this.f391806i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            int e18 = e17 + b36.f.e(8, this.f391807m) + b36.f.e(9, this.f391808n) + b36.f.g(10, 8, linkedList2) + b36.f.e(11, this.f391810p) + b36.f.h(12, this.f391811q) + b36.f.e(13, this.f391812r) + b36.f.g(14, 8, this.f391813s);
            r45.kq6 kq6Var2 = this.f391814t;
            if (kq6Var2 != null) {
                e18 += b36.f.i(15, kq6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(16, this.f391815u) + b36.f.g(17, 8, this.f391816v);
            r45.w96 w96Var2 = this.f391817w;
            if (w96Var2 != null) {
                e19 += b36.f.i(18, w96Var2.computeSize());
            }
            r45.y96 y96Var2 = this.f391818x;
            if (y96Var2 != null) {
                e19 += b36.f.i(19, y96Var2.computeSize());
            }
            r45.da6 da6Var2 = this.f391819y;
            if (da6Var2 != null) {
                e19 += b36.f.i(20, da6Var2.computeSize());
            }
            r45.cu5 cu5Var7 = this.f391820z;
            if (cu5Var7 != null) {
                e19 += b36.f.i(21, cu5Var7.computeSize());
            }
            java.lang.String str7 = this.A;
            if (str7 != null) {
                e19 += b36.f.j(22, str7);
            }
            r45.lt ltVar2 = this.B;
            if (ltVar2 != null) {
                e19 += b36.f.i(23, ltVar2.computeSize());
            }
            int e27 = e19 + b36.f.e(24, this.C) + b36.f.g(25, 8, linkedList);
            r45.o76 o76Var2 = this.E;
            if (o76Var2 != null) {
                e27 += b36.f.i(26, o76Var2.computeSize());
            }
            r45.cu5 cu5Var8 = this.F;
            if (cu5Var8 != null) {
                e27 += b36.f.i(27, cu5Var8.computeSize());
            }
            r45.cu5 cu5Var9 = this.G;
            if (cu5Var9 != null) {
                e27 += b36.f.i(28, cu5Var9.computeSize());
            }
            r45.s15 s15Var2 = this.H;
            if (s15Var2 != null) {
                e27 += b36.f.i(29, s15Var2.computeSize());
            }
            int e28 = e27 + b36.f.e(32, this.I) + b36.f.g(33, 8, this.f391800J);
            java.lang.String str8 = this.K;
            if (str8 != null) {
                e28 += b36.f.j(34, str8);
            }
            r45.o86 o86Var2 = this.L;
            if (o86Var2 != null) {
                e28 += b36.f.i(35, o86Var2.computeSize());
            }
            int e29 = e28 + b36.f.e(36, this.M) + b36.f.k(37, 2, this.N) + b36.f.e(38, this.P) + b36.f.k(39, 2, this.Q);
            r45.cu5 cu5Var10 = this.R;
            if (cu5Var10 != null) {
                e29 += b36.f.i(40, cu5Var10.computeSize());
            }
            java.lang.String str9 = this.S;
            if (str9 != null) {
                e29 += b36.f.j(41, str9);
            }
            int e37 = e29 + b36.f.e(42, this.T) + b36.f.e(43, this.U) + b36.f.g(44, 8, this.V) + b36.f.e(45, this.W);
            java.lang.String str10 = this.X;
            return str10 != null ? e37 + b36.f.j(46, str10) : e37;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391803f.clear();
            linkedList2.clear();
            this.f391813s.clear();
            this.f391816v.clear();
            linkedList.clear();
            this.f391800J.clear();
            this.N.clear();
            this.Q.clear();
            this.V.clear();
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
        r45.z96 z96Var = (r45.z96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    z96Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    z96Var.f391801d = cu5Var11;
                }
                return 0;
            case 3:
                z96Var.f391802e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    z96Var.f391803f.add(du5Var);
                }
                return 0;
            case 5:
                z96Var.f391804g = aVar2.g(intValue);
                return 0;
            case 6:
                z96Var.f391805h = aVar2.g(intValue);
                return 0;
            case 7:
                z96Var.f391806i = aVar2.k(intValue);
                return 0;
            case 8:
                z96Var.f391807m = aVar2.g(intValue);
                return 0;
            case 9:
                z96Var.f391808n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.a96 a96Var = new r45.a96();
                    if (bArr5 != null && bArr5.length > 0) {
                        a96Var.parseFrom(bArr5);
                    }
                    z96Var.f391809o.add(a96Var);
                }
                return 0;
            case 11:
                z96Var.f391810p = aVar2.g(intValue);
                return 0;
            case 12:
                z96Var.f391811q = aVar2.i(intValue);
                return 0;
            case 13:
                z96Var.f391812r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var2.b(bArr6);
                    }
                    z96Var.f391813s.add(du5Var2);
                }
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.kq6 kq6Var3 = new r45.kq6();
                    if (bArr7 != null && bArr7.length > 0) {
                        kq6Var3.parseFrom(bArr7);
                    }
                    z96Var.f391814t = kq6Var3;
                }
                return 0;
            case 16:
                z96Var.f391815u = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var3.b(bArr8);
                    }
                    z96Var.f391816v.add(du5Var3);
                }
                return 0;
            case 18:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.w96 w96Var3 = new r45.w96();
                    if (bArr9 != null && bArr9.length > 0) {
                        w96Var3.parseFrom(bArr9);
                    }
                    z96Var.f391817w = w96Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.y96 y96Var3 = new r45.y96();
                    if (bArr10 != null && bArr10.length > 0) {
                        y96Var3.parseFrom(bArr10);
                    }
                    z96Var.f391818x = y96Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.da6 da6Var3 = new r45.da6();
                    if (bArr11 != null && bArr11.length > 0) {
                        da6Var3.parseFrom(bArr11);
                    }
                    z96Var.f391819y = da6Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cu5Var12.b(bArr12);
                    }
                    z96Var.f391820z = cu5Var12;
                }
                return 0;
            case 22:
                z96Var.A = aVar2.k(intValue);
                return 0;
            case 23:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.lt ltVar3 = new r45.lt();
                    if (bArr13 != null && bArr13.length > 0) {
                        ltVar3.parseFrom(bArr13);
                    }
                    z96Var.B = ltVar3;
                }
                return 0;
            case 24:
                z96Var.C = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.hj4 hj4Var = new r45.hj4();
                    if (bArr14 != null && bArr14.length > 0) {
                        hj4Var.parseFrom(bArr14);
                    }
                    z96Var.D.add(hj4Var);
                }
                return 0;
            case 26:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.o76 o76Var3 = new r45.o76();
                    if (bArr15 != null && bArr15.length > 0) {
                        o76Var3.parseFrom(bArr15);
                    }
                    z96Var.E = o76Var3;
                }
                return 0;
            case 27:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr16 != null && bArr16.length > 0) {
                        cu5Var13.b(bArr16);
                    }
                    z96Var.F = cu5Var13;
                }
                return 0;
            case 28:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr17 != null && bArr17.length > 0) {
                        cu5Var14.b(bArr17);
                    }
                    z96Var.G = cu5Var14;
                }
                return 0;
            case 29:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr18 = (byte[]) j67.get(i69);
                    r45.s15 s15Var3 = new r45.s15();
                    if (bArr18 != null && bArr18.length > 0) {
                        s15Var3.parseFrom(bArr18);
                    }
                    z96Var.H = s15Var3;
                }
                return 0;
            case 30:
            case 31:
            default:
                return -1;
            case 32:
                z96Var.I = aVar2.g(intValue);
                return 0;
            case 33:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr19 = (byte[]) j68.get(i76);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr19 != null && bArr19.length > 0) {
                        du5Var4.b(bArr19);
                    }
                    z96Var.f391800J.add(du5Var4);
                }
                return 0;
            case 34:
                z96Var.K = aVar2.k(intValue);
                return 0;
            case 35:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr20 = (byte[]) j69.get(i77);
                    r45.o86 o86Var3 = new r45.o86();
                    if (bArr20 != null && bArr20.length > 0) {
                        o86Var3.parseFrom(bArr20);
                    }
                    z96Var.L = o86Var3;
                }
                return 0;
            case 36:
                z96Var.M = aVar2.g(intValue);
                return 0;
            case 37:
                byte[] bArr21 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr21, 0, bArr21.length);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList3.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                z96Var.N = linkedList3;
                return 0;
            case 38:
                z96Var.P = aVar2.g(intValue);
                return 0;
            case 39:
                byte[] bArr22 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr22, 0, bArr22.length);
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList4.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                z96Var.Q = linkedList4;
                return 0;
            case 40:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr23 = (byte[]) j76.get(i78);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr23 != null && bArr23.length > 0) {
                        cu5Var15.b(bArr23);
                    }
                    z96Var.R = cu5Var15;
                }
                return 0;
            case 41:
                z96Var.S = aVar2.k(intValue);
                return 0;
            case 42:
                z96Var.T = aVar2.g(intValue);
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                z96Var.U = aVar2.g(intValue);
                return 0;
            case 44:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr24 = (byte[]) j77.get(i79);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr24 != null && bArr24.length > 0) {
                        du5Var5.b(bArr24);
                    }
                    z96Var.V.add(du5Var5);
                }
                return 0;
            case 45:
                z96Var.W = aVar2.g(intValue);
                return 0;
            case 46:
                z96Var.X = aVar2.k(intValue);
                return 0;
        }
    }
}

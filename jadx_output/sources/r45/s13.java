package r45;

/* loaded from: classes2.dex */
public class s13 extends r45.js5 {
    public r45.er2 A;
    public r45.t13 B;
    public r45.tr2 C;
    public r45.cj2 D;
    public r45.ah2 E;
    public int F;
    public r45.a23 G;
    public r45.v31 H;
    public r45.c32 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.h23 f385378J;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo K;
    public r45.x13 L;
    public r45.fr2 M;
    public r45.q13 N;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f385379d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nk2 f385380e;

    /* renamed from: f, reason: collision with root package name */
    public int f385381f;

    /* renamed from: g, reason: collision with root package name */
    public int f385382g;

    /* renamed from: i, reason: collision with root package name */
    public int f385384i;

    /* renamed from: m, reason: collision with root package name */
    public int f385385m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385386n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fw0 f385387o;

    /* renamed from: q, reason: collision with root package name */
    public r45.j32 f385389q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ah1 f385390r;

    /* renamed from: s, reason: collision with root package name */
    public r45.dc1 f385391s;

    /* renamed from: t, reason: collision with root package name */
    public r45.sf2 f385392t;

    /* renamed from: u, reason: collision with root package name */
    public int f385393u;

    /* renamed from: v, reason: collision with root package name */
    public r45.dc1 f385394v;

    /* renamed from: w, reason: collision with root package name */
    public r45.gx0 f385395w;

    /* renamed from: x, reason: collision with root package name */
    public r45.vn2 f385396x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f385397y;

    /* renamed from: z, reason: collision with root package name */
    public r45.c23 f385398z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f385383h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f385388p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s13)) {
            return false;
        }
        r45.s13 s13Var = (r45.s13) fVar;
        return n51.f.a(this.BaseResponse, s13Var.BaseResponse) && n51.f.a(this.f385379d, s13Var.f385379d) && n51.f.a(this.f385380e, s13Var.f385380e) && n51.f.a(java.lang.Integer.valueOf(this.f385381f), java.lang.Integer.valueOf(s13Var.f385381f)) && n51.f.a(java.lang.Integer.valueOf(this.f385382g), java.lang.Integer.valueOf(s13Var.f385382g)) && n51.f.a(this.f385383h, s13Var.f385383h) && n51.f.a(java.lang.Integer.valueOf(this.f385384i), java.lang.Integer.valueOf(s13Var.f385384i)) && n51.f.a(java.lang.Integer.valueOf(this.f385385m), java.lang.Integer.valueOf(s13Var.f385385m)) && n51.f.a(this.f385386n, s13Var.f385386n) && n51.f.a(this.f385387o, s13Var.f385387o) && n51.f.a(this.f385388p, s13Var.f385388p) && n51.f.a(this.f385389q, s13Var.f385389q) && n51.f.a(this.f385390r, s13Var.f385390r) && n51.f.a(this.f385391s, s13Var.f385391s) && n51.f.a(this.f385392t, s13Var.f385392t) && n51.f.a(java.lang.Integer.valueOf(this.f385393u), java.lang.Integer.valueOf(s13Var.f385393u)) && n51.f.a(this.f385394v, s13Var.f385394v) && n51.f.a(this.f385395w, s13Var.f385395w) && n51.f.a(this.f385396x, s13Var.f385396x) && n51.f.a(this.f385397y, s13Var.f385397y) && n51.f.a(this.f385398z, s13Var.f385398z) && n51.f.a(this.A, s13Var.A) && n51.f.a(this.B, s13Var.B) && n51.f.a(this.C, s13Var.C) && n51.f.a(this.D, s13Var.D) && n51.f.a(this.E, s13Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(s13Var.F)) && n51.f.a(this.G, s13Var.G) && n51.f.a(this.H, s13Var.H) && n51.f.a(this.I, s13Var.I) && n51.f.a(this.f385378J, s13Var.f385378J) && n51.f.a(this.K, s13Var.K) && n51.f.a(this.L, s13Var.L) && n51.f.a(this.M, s13Var.M) && n51.f.a(this.N, s13Var.N);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385388p;
        java.util.LinkedList linkedList2 = this.f385383h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f385379d;
            if (finderContact != null) {
                fVar.i(2, finderContact.computeSize());
                this.f385379d.writeFields(fVar);
            }
            r45.nk2 nk2Var = this.f385380e;
            if (nk2Var != null) {
                fVar.i(3, nk2Var.computeSize());
                this.f385380e.writeFields(fVar);
            }
            fVar.e(4, this.f385381f);
            fVar.e(5, this.f385382g);
            fVar.g(6, 1, linkedList2);
            fVar.e(7, this.f385384i);
            fVar.e(8, this.f385385m);
            java.lang.String str = this.f385386n;
            if (str != null) {
                fVar.j(9, str);
            }
            r45.fw0 fw0Var = this.f385387o;
            if (fw0Var != null) {
                fVar.i(10, fw0Var.computeSize());
                this.f385387o.writeFields(fVar);
            }
            fVar.g(11, 8, linkedList);
            r45.j32 j32Var = this.f385389q;
            if (j32Var != null) {
                fVar.i(12, j32Var.computeSize());
                this.f385389q.writeFields(fVar);
            }
            r45.ah1 ah1Var = this.f385390r;
            if (ah1Var != null) {
                fVar.i(13, ah1Var.computeSize());
                this.f385390r.writeFields(fVar);
            }
            r45.dc1 dc1Var = this.f385391s;
            if (dc1Var != null) {
                fVar.i(14, dc1Var.computeSize());
                this.f385391s.writeFields(fVar);
            }
            r45.sf2 sf2Var = this.f385392t;
            if (sf2Var != null) {
                fVar.i(15, sf2Var.computeSize());
                this.f385392t.writeFields(fVar);
            }
            fVar.e(16, this.f385393u);
            r45.dc1 dc1Var2 = this.f385394v;
            if (dc1Var2 != null) {
                fVar.i(17, dc1Var2.computeSize());
                this.f385394v.writeFields(fVar);
            }
            r45.gx0 gx0Var = this.f385395w;
            if (gx0Var != null) {
                fVar.i(18, gx0Var.computeSize());
                this.f385395w.writeFields(fVar);
            }
            r45.vn2 vn2Var = this.f385396x;
            if (vn2Var != null) {
                fVar.i(19, vn2Var.computeSize());
                this.f385396x.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f385397y;
            if (finderJumpInfo != null) {
                fVar.i(20, finderJumpInfo.computeSize());
                this.f385397y.writeFields(fVar);
            }
            r45.c23 c23Var = this.f385398z;
            if (c23Var != null) {
                fVar.i(21, c23Var.computeSize());
                this.f385398z.writeFields(fVar);
            }
            r45.er2 er2Var = this.A;
            if (er2Var != null) {
                fVar.i(22, er2Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.t13 t13Var = this.B;
            if (t13Var != null) {
                fVar.i(23, t13Var.computeSize());
                this.B.writeFields(fVar);
            }
            r45.tr2 tr2Var = this.C;
            if (tr2Var != null) {
                fVar.i(24, tr2Var.computeSize());
                this.C.writeFields(fVar);
            }
            r45.cj2 cj2Var = this.D;
            if (cj2Var != null) {
                fVar.i(25, cj2Var.computeSize());
                this.D.writeFields(fVar);
            }
            r45.ah2 ah2Var = this.E;
            if (ah2Var != null) {
                fVar.i(26, ah2Var.computeSize());
                this.E.writeFields(fVar);
            }
            fVar.e(28, this.F);
            r45.a23 a23Var = this.G;
            if (a23Var != null) {
                fVar.i(30, a23Var.computeSize());
                this.G.writeFields(fVar);
            }
            r45.v31 v31Var = this.H;
            if (v31Var != null) {
                fVar.i(31, v31Var.computeSize());
                this.H.writeFields(fVar);
            }
            r45.c32 c32Var = this.I;
            if (c32Var != null) {
                fVar.i(32, c32Var.computeSize());
                this.I.writeFields(fVar);
            }
            r45.h23 h23Var = this.f385378J;
            if (h23Var != null) {
                fVar.i(33, h23Var.computeSize());
                this.f385378J.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.K;
            if (finderJumpInfo2 != null) {
                fVar.i(34, finderJumpInfo2.computeSize());
                this.K.writeFields(fVar);
            }
            r45.x13 x13Var = this.L;
            if (x13Var != null) {
                fVar.i(35, x13Var.computeSize());
                this.L.writeFields(fVar);
            }
            r45.fr2 fr2Var = this.M;
            if (fr2Var != null) {
                fVar.i(36, fr2Var.computeSize());
                this.M.writeFields(fVar);
            }
            r45.q13 q13Var = this.N;
            if (q13Var != null) {
                fVar.i(38, q13Var.computeSize());
                this.N.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f385379d;
            if (finderContact2 != null) {
                i18 += b36.f.i(2, finderContact2.computeSize());
            }
            r45.nk2 nk2Var2 = this.f385380e;
            if (nk2Var2 != null) {
                i18 += b36.f.i(3, nk2Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f385381f) + b36.f.e(5, this.f385382g) + b36.f.g(6, 1, linkedList2) + b36.f.e(7, this.f385384i) + b36.f.e(8, this.f385385m);
            java.lang.String str2 = this.f385386n;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            r45.fw0 fw0Var2 = this.f385387o;
            if (fw0Var2 != null) {
                e17 += b36.f.i(10, fw0Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(11, 8, linkedList);
            r45.j32 j32Var2 = this.f385389q;
            if (j32Var2 != null) {
                g17 += b36.f.i(12, j32Var2.computeSize());
            }
            r45.ah1 ah1Var2 = this.f385390r;
            if (ah1Var2 != null) {
                g17 += b36.f.i(13, ah1Var2.computeSize());
            }
            r45.dc1 dc1Var3 = this.f385391s;
            if (dc1Var3 != null) {
                g17 += b36.f.i(14, dc1Var3.computeSize());
            }
            r45.sf2 sf2Var2 = this.f385392t;
            if (sf2Var2 != null) {
                g17 += b36.f.i(15, sf2Var2.computeSize());
            }
            int e18 = g17 + b36.f.e(16, this.f385393u);
            r45.dc1 dc1Var4 = this.f385394v;
            if (dc1Var4 != null) {
                e18 += b36.f.i(17, dc1Var4.computeSize());
            }
            r45.gx0 gx0Var2 = this.f385395w;
            if (gx0Var2 != null) {
                e18 += b36.f.i(18, gx0Var2.computeSize());
            }
            r45.vn2 vn2Var2 = this.f385396x;
            if (vn2Var2 != null) {
                e18 += b36.f.i(19, vn2Var2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = this.f385397y;
            if (finderJumpInfo3 != null) {
                e18 += b36.f.i(20, finderJumpInfo3.computeSize());
            }
            r45.c23 c23Var2 = this.f385398z;
            if (c23Var2 != null) {
                e18 += b36.f.i(21, c23Var2.computeSize());
            }
            r45.er2 er2Var2 = this.A;
            if (er2Var2 != null) {
                e18 += b36.f.i(22, er2Var2.computeSize());
            }
            r45.t13 t13Var2 = this.B;
            if (t13Var2 != null) {
                e18 += b36.f.i(23, t13Var2.computeSize());
            }
            r45.tr2 tr2Var2 = this.C;
            if (tr2Var2 != null) {
                e18 += b36.f.i(24, tr2Var2.computeSize());
            }
            r45.cj2 cj2Var2 = this.D;
            if (cj2Var2 != null) {
                e18 += b36.f.i(25, cj2Var2.computeSize());
            }
            r45.ah2 ah2Var2 = this.E;
            if (ah2Var2 != null) {
                e18 += b36.f.i(26, ah2Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(28, this.F);
            r45.a23 a23Var2 = this.G;
            if (a23Var2 != null) {
                e19 += b36.f.i(30, a23Var2.computeSize());
            }
            r45.v31 v31Var2 = this.H;
            if (v31Var2 != null) {
                e19 += b36.f.i(31, v31Var2.computeSize());
            }
            r45.c32 c32Var2 = this.I;
            if (c32Var2 != null) {
                e19 += b36.f.i(32, c32Var2.computeSize());
            }
            r45.h23 h23Var2 = this.f385378J;
            if (h23Var2 != null) {
                e19 += b36.f.i(33, h23Var2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = this.K;
            if (finderJumpInfo4 != null) {
                e19 += b36.f.i(34, finderJumpInfo4.computeSize());
            }
            r45.x13 x13Var2 = this.L;
            if (x13Var2 != null) {
                e19 += b36.f.i(35, x13Var2.computeSize());
            }
            r45.fr2 fr2Var2 = this.M;
            if (fr2Var2 != null) {
                e19 += b36.f.i(36, fr2Var2.computeSize());
            }
            r45.q13 q13Var2 = this.N;
            return q13Var2 != null ? e19 + b36.f.i(38, q13Var2.computeSize()) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.s13 s13Var = (r45.s13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    s13Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderContact3.parseFrom(bArr3);
                    }
                    s13Var.f385379d = finderContact3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.nk2 nk2Var3 = new r45.nk2();
                    if (bArr4 != null && bArr4.length > 0) {
                        nk2Var3.parseFrom(bArr4);
                    }
                    s13Var.f385380e = nk2Var3;
                }
                return 0;
            case 4:
                s13Var.f385381f = aVar2.g(intValue);
                return 0;
            case 5:
                s13Var.f385382g = aVar2.g(intValue);
                return 0;
            case 6:
                s13Var.f385383h.add(aVar2.k(intValue));
                return 0;
            case 7:
                s13Var.f385384i = aVar2.g(intValue);
                return 0;
            case 8:
                s13Var.f385385m = aVar2.g(intValue);
                return 0;
            case 9:
                s13Var.f385386n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.fw0 fw0Var3 = new r45.fw0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fw0Var3.parseFrom(bArr5);
                    }
                    s13Var.f385387o = fw0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.e21 e21Var = new r45.e21();
                    if (bArr6 != null && bArr6.length > 0) {
                        e21Var.parseFrom(bArr6);
                    }
                    s13Var.f385388p.add(e21Var);
                }
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr7 != null && bArr7.length > 0) {
                        j32Var3.parseFrom(bArr7);
                    }
                    s13Var.f385389q = j32Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ah1 ah1Var3 = new r45.ah1();
                    if (bArr8 != null && bArr8.length > 0) {
                        ah1Var3.parseFrom(bArr8);
                    }
                    s13Var.f385390r = ah1Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.dc1 dc1Var5 = new r45.dc1();
                    if (bArr9 != null && bArr9.length > 0) {
                        dc1Var5.parseFrom(bArr9);
                    }
                    s13Var.f385391s = dc1Var5;
                }
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.sf2 sf2Var3 = new r45.sf2();
                    if (bArr10 != null && bArr10.length > 0) {
                        sf2Var3.parseFrom(bArr10);
                    }
                    s13Var.f385392t = sf2Var3;
                }
                return 0;
            case 16:
                s13Var.f385393u = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.dc1 dc1Var6 = new r45.dc1();
                    if (bArr11 != null && bArr11.length > 0) {
                        dc1Var6.parseFrom(bArr11);
                    }
                    s13Var.f385394v = dc1Var6;
                }
                return 0;
            case 18:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.gx0 gx0Var3 = new r45.gx0();
                    if (bArr12 != null && bArr12.length > 0) {
                        gx0Var3.parseFrom(bArr12);
                    }
                    s13Var.f385395w = gx0Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.vn2 vn2Var3 = new r45.vn2();
                    if (bArr13 != null && bArr13.length > 0) {
                        vn2Var3.parseFrom(bArr13);
                    }
                    s13Var.f385396x = vn2Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo5 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    if (bArr14 != null && bArr14.length > 0) {
                        finderJumpInfo5.parseFrom(bArr14);
                    }
                    s13Var.f385397y = finderJumpInfo5;
                }
                return 0;
            case 21:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.c23 c23Var3 = new r45.c23();
                    if (bArr15 != null && bArr15.length > 0) {
                        c23Var3.parseFrom(bArr15);
                    }
                    s13Var.f385398z = c23Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.er2 er2Var3 = new r45.er2();
                    if (bArr16 != null && bArr16.length > 0) {
                        er2Var3.parseFrom(bArr16);
                    }
                    s13Var.A = er2Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.t13 t13Var3 = new r45.t13();
                    if (bArr17 != null && bArr17.length > 0) {
                        t13Var3.parseFrom(bArr17);
                    }
                    s13Var.B = t13Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr18 = (byte[]) j67.get(i69);
                    r45.tr2 tr2Var3 = new r45.tr2();
                    if (bArr18 != null && bArr18.length > 0) {
                        tr2Var3.parseFrom(bArr18);
                    }
                    s13Var.C = tr2Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr19 = (byte[]) j68.get(i76);
                    r45.cj2 cj2Var3 = new r45.cj2();
                    if (bArr19 != null && bArr19.length > 0) {
                        cj2Var3.parseFrom(bArr19);
                    }
                    s13Var.D = cj2Var3;
                }
                return 0;
            case 26:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr20 = (byte[]) j69.get(i77);
                    r45.ah2 ah2Var3 = new r45.ah2();
                    if (bArr20 != null && bArr20.length > 0) {
                        ah2Var3.parseFrom(bArr20);
                    }
                    s13Var.E = ah2Var3;
                }
                return 0;
            case 27:
            case 29:
            case 37:
            default:
                return -1;
            case 28:
                s13Var.F = aVar2.g(intValue);
                return 0;
            case 30:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr21 = (byte[]) j76.get(i78);
                    r45.a23 a23Var3 = new r45.a23();
                    if (bArr21 != null && bArr21.length > 0) {
                        a23Var3.parseFrom(bArr21);
                    }
                    s13Var.G = a23Var3;
                }
                return 0;
            case 31:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr22 = (byte[]) j77.get(i79);
                    r45.v31 v31Var3 = new r45.v31();
                    if (bArr22 != null && bArr22.length > 0) {
                        v31Var3.parseFrom(bArr22);
                    }
                    s13Var.H = v31Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr23 = (byte[]) j78.get(i86);
                    r45.c32 c32Var3 = new r45.c32();
                    if (bArr23 != null && bArr23.length > 0) {
                        c32Var3.parseFrom(bArr23);
                    }
                    s13Var.I = c32Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr24 = (byte[]) j79.get(i87);
                    r45.h23 h23Var3 = new r45.h23();
                    if (bArr24 != null && bArr24.length > 0) {
                        h23Var3.parseFrom(bArr24);
                    }
                    s13Var.f385378J = h23Var3;
                }
                return 0;
            case 34:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr25 = (byte[]) j86.get(i88);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo6 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    if (bArr25 != null && bArr25.length > 0) {
                        finderJumpInfo6.parseFrom(bArr25);
                    }
                    s13Var.K = finderJumpInfo6;
                }
                return 0;
            case 35:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i89 = 0; i89 < size25; i89++) {
                    byte[] bArr26 = (byte[]) j87.get(i89);
                    r45.x13 x13Var3 = new r45.x13();
                    if (bArr26 != null && bArr26.length > 0) {
                        x13Var3.parseFrom(bArr26);
                    }
                    s13Var.L = x13Var3;
                }
                return 0;
            case 36:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i96 = 0; i96 < size26; i96++) {
                    byte[] bArr27 = (byte[]) j88.get(i96);
                    r45.fr2 fr2Var3 = new r45.fr2();
                    if (bArr27 != null && bArr27.length > 0) {
                        fr2Var3.parseFrom(bArr27);
                    }
                    s13Var.M = fr2Var3;
                }
                return 0;
            case 38:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i97 = 0; i97 < size27; i97++) {
                    byte[] bArr28 = (byte[]) j89.get(i97);
                    r45.q13 q13Var3 = new r45.q13();
                    if (bArr28 != null && bArr28.length > 0) {
                        q13Var3.parseFrom(bArr28);
                    }
                    s13Var.N = q13Var3;
                }
                return 0;
        }
    }
}

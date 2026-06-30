package r45;

/* loaded from: classes8.dex */
public class r83 extends r45.mr5 {
    public int A;
    public r45.cu5 B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public r45.w83 f384609J;
    public int K;
    public int L;
    public r45.cu5 M;
    public java.lang.String N;
    public r45.cu5 P;

    /* renamed from: d, reason: collision with root package name */
    public int f384610d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f384611e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f384612f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f384613g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f384614h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f384615i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384616m;

    /* renamed from: n, reason: collision with root package name */
    public int f384617n;

    /* renamed from: o, reason: collision with root package name */
    public int f384618o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f384619p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384620q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f384621r;

    /* renamed from: s, reason: collision with root package name */
    public int f384622s;

    /* renamed from: t, reason: collision with root package name */
    public int f384623t;

    /* renamed from: u, reason: collision with root package name */
    public int f384624u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f384625v;

    /* renamed from: w, reason: collision with root package name */
    public int f384626w;

    /* renamed from: x, reason: collision with root package name */
    public int f384627x;

    /* renamed from: y, reason: collision with root package name */
    public int f384628y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f384629z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r83)) {
            return false;
        }
        r45.r83 r83Var = (r45.r83) fVar;
        return n51.f.a(this.BaseRequest, r83Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384610d), java.lang.Integer.valueOf(r83Var.f384610d)) && n51.f.a(this.f384611e, r83Var.f384611e) && n51.f.a(this.f384612f, r83Var.f384612f) && n51.f.a(this.f384613g, r83Var.f384613g) && n51.f.a(this.f384614h, r83Var.f384614h) && n51.f.a(this.f384615i, r83Var.f384615i) && n51.f.a(this.f384616m, r83Var.f384616m) && n51.f.a(java.lang.Integer.valueOf(this.f384617n), java.lang.Integer.valueOf(r83Var.f384617n)) && n51.f.a(java.lang.Integer.valueOf(this.f384618o), java.lang.Integer.valueOf(r83Var.f384618o)) && n51.f.a(this.f384619p, r83Var.f384619p) && n51.f.a(this.f384620q, r83Var.f384620q) && n51.f.a(this.f384621r, r83Var.f384621r) && n51.f.a(java.lang.Integer.valueOf(this.f384622s), java.lang.Integer.valueOf(r83Var.f384622s)) && n51.f.a(java.lang.Integer.valueOf(this.f384623t), java.lang.Integer.valueOf(r83Var.f384623t)) && n51.f.a(java.lang.Integer.valueOf(this.f384624u), java.lang.Integer.valueOf(r83Var.f384624u)) && n51.f.a(this.f384625v, r83Var.f384625v) && n51.f.a(java.lang.Integer.valueOf(this.f384626w), java.lang.Integer.valueOf(r83Var.f384626w)) && n51.f.a(java.lang.Integer.valueOf(this.f384627x), java.lang.Integer.valueOf(r83Var.f384627x)) && n51.f.a(java.lang.Integer.valueOf(this.f384628y), java.lang.Integer.valueOf(r83Var.f384628y)) && n51.f.a(this.f384629z, r83Var.f384629z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(r83Var.A)) && n51.f.a(this.B, r83Var.B) && n51.f.a(this.C, r83Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(r83Var.D)) && n51.f.a(this.E, r83Var.E) && n51.f.a(this.F, r83Var.F) && n51.f.a(this.G, r83Var.G) && n51.f.a(this.H, r83Var.H) && n51.f.a(this.I, r83Var.I) && n51.f.a(this.f384609J, r83Var.f384609J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(r83Var.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(r83Var.L)) && n51.f.a(this.M, r83Var.M) && n51.f.a(this.N, r83Var.N) && n51.f.a(this.P, r83Var.P);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f384610d);
            r45.cu5 cu5Var = this.f384611e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f384611e.writeFields(fVar);
            }
            r45.du5 du5Var = this.f384612f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f384612f.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f384613g;
            if (du5Var2 != null) {
                fVar.i(5, du5Var2.computeSize());
                this.f384613g.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f384614h;
            if (du5Var3 != null) {
                fVar.i(6, du5Var3.computeSize());
                this.f384614h.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f384615i;
            if (du5Var4 != null) {
                fVar.i(7, du5Var4.computeSize());
                this.f384615i.writeFields(fVar);
            }
            java.lang.String str = this.f384616m;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.e(9, this.f384617n);
            fVar.e(10, this.f384618o);
            java.lang.String str2 = this.f384619p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f384620q;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            r45.cu5 cu5Var2 = this.f384621r;
            if (cu5Var2 != null) {
                fVar.i(13, cu5Var2.computeSize());
                this.f384621r.writeFields(fVar);
            }
            fVar.e(14, this.f384622s);
            fVar.e(15, this.f384623t);
            fVar.e(16, this.f384624u);
            java.lang.String str4 = this.f384625v;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.e(18, this.f384626w);
            fVar.e(19, this.f384627x);
            fVar.e(20, this.f384628y);
            java.lang.String str5 = this.f384629z;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            fVar.e(22, this.A);
            r45.cu5 cu5Var3 = this.B;
            if (cu5Var3 != null) {
                fVar.i(23, cu5Var3.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str6 = this.C;
            if (str6 != null) {
                fVar.j(24, str6);
            }
            fVar.e(25, this.D);
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(26, str7);
            }
            java.lang.String str8 = this.F;
            if (str8 != null) {
                fVar.j(27, str8);
            }
            java.lang.String str9 = this.G;
            if (str9 != null) {
                fVar.j(28, str9);
            }
            java.lang.String str10 = this.H;
            if (str10 != null) {
                fVar.j(29, str10);
            }
            java.lang.String str11 = this.I;
            if (str11 != null) {
                fVar.j(30, str11);
            }
            r45.w83 w83Var = this.f384609J;
            if (w83Var != null) {
                fVar.i(31, w83Var.computeSize());
                this.f384609J.writeFields(fVar);
            }
            fVar.e(33, this.K);
            fVar.e(34, this.L);
            r45.cu5 cu5Var4 = this.M;
            if (cu5Var4 != null) {
                fVar.i(35, cu5Var4.computeSize());
                this.M.writeFields(fVar);
            }
            java.lang.String str12 = this.N;
            if (str12 != null) {
                fVar.j(36, str12);
            }
            r45.cu5 cu5Var5 = this.P;
            if (cu5Var5 != null) {
                fVar.i(37, cu5Var5.computeSize());
                this.P.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f384610d);
            r45.cu5 cu5Var6 = this.f384611e;
            if (cu5Var6 != null) {
                i18 += b36.f.i(3, cu5Var6.computeSize());
            }
            r45.du5 du5Var5 = this.f384612f;
            if (du5Var5 != null) {
                i18 += b36.f.i(4, du5Var5.computeSize());
            }
            r45.du5 du5Var6 = this.f384613g;
            if (du5Var6 != null) {
                i18 += b36.f.i(5, du5Var6.computeSize());
            }
            r45.du5 du5Var7 = this.f384614h;
            if (du5Var7 != null) {
                i18 += b36.f.i(6, du5Var7.computeSize());
            }
            r45.du5 du5Var8 = this.f384615i;
            if (du5Var8 != null) {
                i18 += b36.f.i(7, du5Var8.computeSize());
            }
            java.lang.String str13 = this.f384616m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            int e17 = i18 + b36.f.e(9, this.f384617n) + b36.f.e(10, this.f384618o);
            java.lang.String str14 = this.f384619p;
            if (str14 != null) {
                e17 += b36.f.j(11, str14);
            }
            java.lang.String str15 = this.f384620q;
            if (str15 != null) {
                e17 += b36.f.j(12, str15);
            }
            r45.cu5 cu5Var7 = this.f384621r;
            if (cu5Var7 != null) {
                e17 += b36.f.i(13, cu5Var7.computeSize());
            }
            int e18 = e17 + b36.f.e(14, this.f384622s) + b36.f.e(15, this.f384623t) + b36.f.e(16, this.f384624u);
            java.lang.String str16 = this.f384625v;
            if (str16 != null) {
                e18 += b36.f.j(17, str16);
            }
            int e19 = e18 + b36.f.e(18, this.f384626w) + b36.f.e(19, this.f384627x) + b36.f.e(20, this.f384628y);
            java.lang.String str17 = this.f384629z;
            if (str17 != null) {
                e19 += b36.f.j(21, str17);
            }
            int e27 = e19 + b36.f.e(22, this.A);
            r45.cu5 cu5Var8 = this.B;
            if (cu5Var8 != null) {
                e27 += b36.f.i(23, cu5Var8.computeSize());
            }
            java.lang.String str18 = this.C;
            if (str18 != null) {
                e27 += b36.f.j(24, str18);
            }
            int e28 = e27 + b36.f.e(25, this.D);
            java.lang.String str19 = this.E;
            if (str19 != null) {
                e28 += b36.f.j(26, str19);
            }
            java.lang.String str20 = this.F;
            if (str20 != null) {
                e28 += b36.f.j(27, str20);
            }
            java.lang.String str21 = this.G;
            if (str21 != null) {
                e28 += b36.f.j(28, str21);
            }
            java.lang.String str22 = this.H;
            if (str22 != null) {
                e28 += b36.f.j(29, str22);
            }
            java.lang.String str23 = this.I;
            if (str23 != null) {
                e28 += b36.f.j(30, str23);
            }
            r45.w83 w83Var2 = this.f384609J;
            if (w83Var2 != null) {
                e28 += b36.f.i(31, w83Var2.computeSize());
            }
            int e29 = e28 + b36.f.e(33, this.K) + b36.f.e(34, this.L);
            r45.cu5 cu5Var9 = this.M;
            if (cu5Var9 != null) {
                e29 += b36.f.i(35, cu5Var9.computeSize());
            }
            java.lang.String str24 = this.N;
            if (str24 != null) {
                e29 += b36.f.j(36, str24);
            }
            r45.cu5 cu5Var10 = this.P;
            return cu5Var10 != null ? e29 + b36.f.i(37, cu5Var10.computeSize()) : e29;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.r83 r83Var = (r45.r83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    r83Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                r83Var.f384610d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var11.b(bArr2);
                    }
                    r83Var.f384611e = cu5Var11;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var9.b(bArr3);
                    }
                    r83Var.f384612f = du5Var9;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var10.b(bArr4);
                    }
                    r83Var.f384613g = du5Var10;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.du5 du5Var11 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var11.b(bArr5);
                    }
                    r83Var.f384614h = du5Var11;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.du5 du5Var12 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var12.b(bArr6);
                    }
                    r83Var.f384615i = du5Var12;
                }
                return 0;
            case 8:
                r83Var.f384616m = aVar2.k(intValue);
                return 0;
            case 9:
                r83Var.f384617n = aVar2.g(intValue);
                return 0;
            case 10:
                r83Var.f384618o = aVar2.g(intValue);
                return 0;
            case 11:
                r83Var.f384619p = aVar2.k(intValue);
                return 0;
            case 12:
                r83Var.f384620q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var12.b(bArr7);
                    }
                    r83Var.f384621r = cu5Var12;
                }
                return 0;
            case 14:
                r83Var.f384622s = aVar2.g(intValue);
                return 0;
            case 15:
                r83Var.f384623t = aVar2.g(intValue);
                return 0;
            case 16:
                r83Var.f384624u = aVar2.g(intValue);
                return 0;
            case 17:
                r83Var.f384625v = aVar2.k(intValue);
                return 0;
            case 18:
                r83Var.f384626w = aVar2.g(intValue);
                return 0;
            case 19:
                r83Var.f384627x = aVar2.g(intValue);
                return 0;
            case 20:
                r83Var.f384628y = aVar2.g(intValue);
                return 0;
            case 21:
                r83Var.f384629z = aVar2.k(intValue);
                return 0;
            case 22:
                r83Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var13.b(bArr8);
                    }
                    r83Var.B = cu5Var13;
                }
                return 0;
            case 24:
                r83Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                r83Var.D = aVar2.g(intValue);
                return 0;
            case 26:
                r83Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                r83Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                r83Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                r83Var.H = aVar2.k(intValue);
                return 0;
            case 30:
                r83Var.I = aVar2.k(intValue);
                return 0;
            case 31:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.w83 w83Var3 = new r45.w83();
                    if (bArr9 != null && bArr9.length > 0) {
                        w83Var3.parseFrom(bArr9);
                    }
                    r83Var.f384609J = w83Var3;
                }
                return 0;
            case 32:
            default:
                return -1;
            case 33:
                r83Var.K = aVar2.g(intValue);
                return 0;
            case 34:
                r83Var.L = aVar2.g(intValue);
                return 0;
            case 35:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr10 != null && bArr10.length > 0) {
                        cu5Var14.b(bArr10);
                    }
                    r83Var.M = cu5Var14;
                }
                return 0;
            case 36:
                r83Var.N = aVar2.k(intValue);
                return 0;
            case 37:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var15.b(bArr11);
                    }
                    r83Var.P = cu5Var15;
                }
                return 0;
        }
    }
}

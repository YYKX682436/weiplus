package r45;

/* loaded from: classes12.dex */
public class zv4 extends r45.js5 {
    public r45.kx3 A;
    public java.lang.String B;
    public r45.ms C;
    public java.lang.String D;
    public java.lang.String E;
    public r45.cu5 F;
    public r45.w56 G;
    public r45.ms H;
    public r45.ms I;

    /* renamed from: J, reason: collision with root package name */
    public r45.xx5 f392389J;
    public int K;
    public int L;
    public int M;
    public r45.mg7 N;
    public r45.jg7 P;
    public int Q;
    public r45.wc R;
    public r45.cu5 S;

    /* renamed from: d, reason: collision with root package name */
    public int f392390d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392393g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392394h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392395i;

    /* renamed from: m, reason: collision with root package name */
    public int f392396m;

    /* renamed from: n, reason: collision with root package name */
    public int f392397n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392398o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jo f392399p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f392400q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f392401r;

    /* renamed from: s, reason: collision with root package name */
    public int f392402s;

    /* renamed from: t, reason: collision with root package name */
    public r45.rt4 f392403t;

    /* renamed from: u, reason: collision with root package name */
    public int f392404u;

    /* renamed from: v, reason: collision with root package name */
    public int f392405v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392406w;

    /* renamed from: x, reason: collision with root package name */
    public r45.w85 f392407x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f392408y;

    /* renamed from: z, reason: collision with root package name */
    public int f392409z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zv4)) {
            return false;
        }
        r45.zv4 zv4Var = (r45.zv4) fVar;
        return n51.f.a(this.BaseResponse, zv4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f392390d), java.lang.Integer.valueOf(zv4Var.f392390d)) && n51.f.a(this.f392391e, zv4Var.f392391e) && n51.f.a(this.f392392f, zv4Var.f392392f) && n51.f.a(this.f392393g, zv4Var.f392393g) && n51.f.a(this.f392394h, zv4Var.f392394h) && n51.f.a(this.f392395i, zv4Var.f392395i) && n51.f.a(java.lang.Integer.valueOf(this.f392396m), java.lang.Integer.valueOf(zv4Var.f392396m)) && n51.f.a(java.lang.Integer.valueOf(this.f392397n), java.lang.Integer.valueOf(zv4Var.f392397n)) && n51.f.a(this.f392398o, zv4Var.f392398o) && n51.f.a(this.f392399p, zv4Var.f392399p) && n51.f.a(this.f392400q, zv4Var.f392400q) && n51.f.a(this.f392401r, zv4Var.f392401r) && n51.f.a(java.lang.Integer.valueOf(this.f392402s), java.lang.Integer.valueOf(zv4Var.f392402s)) && n51.f.a(this.f392403t, zv4Var.f392403t) && n51.f.a(java.lang.Integer.valueOf(this.f392404u), java.lang.Integer.valueOf(zv4Var.f392404u)) && n51.f.a(java.lang.Integer.valueOf(this.f392405v), java.lang.Integer.valueOf(zv4Var.f392405v)) && n51.f.a(this.f392406w, zv4Var.f392406w) && n51.f.a(this.f392407x, zv4Var.f392407x) && n51.f.a(this.f392408y, zv4Var.f392408y) && n51.f.a(java.lang.Integer.valueOf(this.f392409z), java.lang.Integer.valueOf(zv4Var.f392409z)) && n51.f.a(this.A, zv4Var.A) && n51.f.a(this.B, zv4Var.B) && n51.f.a(this.C, zv4Var.C) && n51.f.a(this.D, zv4Var.D) && n51.f.a(this.E, zv4Var.E) && n51.f.a(this.F, zv4Var.F) && n51.f.a(this.G, zv4Var.G) && n51.f.a(this.H, zv4Var.H) && n51.f.a(this.I, zv4Var.I) && n51.f.a(this.f392389J, zv4Var.f392389J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(zv4Var.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(zv4Var.L)) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(zv4Var.M)) && n51.f.a(this.N, zv4Var.N) && n51.f.a(this.P, zv4Var.P) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(zv4Var.Q)) && n51.f.a(this.R, zv4Var.R) && n51.f.a(this.S, zv4Var.S);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f392390d);
            java.lang.String str = this.f392391e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f392392f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f392393g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f392394h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f392395i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f392396m);
            fVar.e(9, this.f392397n);
            java.lang.String str6 = this.f392398o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            r45.jo joVar = this.f392399p;
            if (joVar != null) {
                fVar.i(14, joVar.computeSize());
                this.f392399p.writeFields(fVar);
            }
            java.lang.String str7 = this.f392400q;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            java.lang.String str8 = this.f392401r;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            fVar.e(17, this.f392402s);
            r45.rt4 rt4Var = this.f392403t;
            if (rt4Var != null) {
                fVar.i(18, rt4Var.computeSize());
                this.f392403t.writeFields(fVar);
            }
            fVar.e(19, this.f392404u);
            fVar.e(20, this.f392405v);
            java.lang.String str9 = this.f392406w;
            if (str9 != null) {
                fVar.j(21, str9);
            }
            r45.w85 w85Var = this.f392407x;
            if (w85Var != null) {
                fVar.i(22, w85Var.computeSize());
                this.f392407x.writeFields(fVar);
            }
            java.lang.String str10 = this.f392408y;
            if (str10 != null) {
                fVar.j(23, str10);
            }
            fVar.e(24, this.f392409z);
            r45.kx3 kx3Var = this.A;
            if (kx3Var != null) {
                fVar.i(25, kx3Var.computeSize());
                this.A.writeFields(fVar);
            }
            java.lang.String str11 = this.B;
            if (str11 != null) {
                fVar.j(26, str11);
            }
            r45.ms msVar = this.C;
            if (msVar != null) {
                fVar.i(27, msVar.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str12 = this.D;
            if (str12 != null) {
                fVar.j(28, str12);
            }
            java.lang.String str13 = this.E;
            if (str13 != null) {
                fVar.j(29, str13);
            }
            r45.cu5 cu5Var = this.F;
            if (cu5Var != null) {
                fVar.i(30, cu5Var.computeSize());
                this.F.writeFields(fVar);
            }
            r45.w56 w56Var = this.G;
            if (w56Var != null) {
                fVar.i(31, w56Var.computeSize());
                this.G.writeFields(fVar);
            }
            r45.ms msVar2 = this.H;
            if (msVar2 != null) {
                fVar.i(32, msVar2.computeSize());
                this.H.writeFields(fVar);
            }
            r45.ms msVar3 = this.I;
            if (msVar3 != null) {
                fVar.i(33, msVar3.computeSize());
                this.I.writeFields(fVar);
            }
            r45.xx5 xx5Var = this.f392389J;
            if (xx5Var != null) {
                fVar.i(34, xx5Var.computeSize());
                this.f392389J.writeFields(fVar);
            }
            fVar.e(35, this.K);
            fVar.e(36, this.L);
            fVar.e(37, this.M);
            r45.mg7 mg7Var = this.N;
            if (mg7Var != null) {
                fVar.i(38, mg7Var.computeSize());
                this.N.writeFields(fVar);
            }
            r45.jg7 jg7Var = this.P;
            if (jg7Var != null) {
                fVar.i(39, jg7Var.computeSize());
                this.P.writeFields(fVar);
            }
            fVar.e(40, this.Q);
            r45.wc wcVar = this.R;
            if (wcVar != null) {
                fVar.i(41, wcVar.computeSize());
                this.R.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.S;
            if (cu5Var2 != null) {
                fVar.i(42, cu5Var2.computeSize());
                this.S.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f392390d);
            java.lang.String str14 = this.f392391e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f392392f;
            if (str15 != null) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f392393g;
            if (str16 != null) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f392394h;
            if (str17 != null) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f392395i;
            if (str18 != null) {
                i18 += b36.f.j(7, str18);
            }
            int e17 = i18 + b36.f.e(8, this.f392396m) + b36.f.e(9, this.f392397n);
            java.lang.String str19 = this.f392398o;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            r45.jo joVar2 = this.f392399p;
            if (joVar2 != null) {
                e17 += b36.f.i(14, joVar2.computeSize());
            }
            java.lang.String str20 = this.f392400q;
            if (str20 != null) {
                e17 += b36.f.j(15, str20);
            }
            java.lang.String str21 = this.f392401r;
            if (str21 != null) {
                e17 += b36.f.j(16, str21);
            }
            int e18 = e17 + b36.f.e(17, this.f392402s);
            r45.rt4 rt4Var2 = this.f392403t;
            if (rt4Var2 != null) {
                e18 += b36.f.i(18, rt4Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(19, this.f392404u) + b36.f.e(20, this.f392405v);
            java.lang.String str22 = this.f392406w;
            if (str22 != null) {
                e19 += b36.f.j(21, str22);
            }
            r45.w85 w85Var2 = this.f392407x;
            if (w85Var2 != null) {
                e19 += b36.f.i(22, w85Var2.computeSize());
            }
            java.lang.String str23 = this.f392408y;
            if (str23 != null) {
                e19 += b36.f.j(23, str23);
            }
            int e27 = e19 + b36.f.e(24, this.f392409z);
            r45.kx3 kx3Var2 = this.A;
            if (kx3Var2 != null) {
                e27 += b36.f.i(25, kx3Var2.computeSize());
            }
            java.lang.String str24 = this.B;
            if (str24 != null) {
                e27 += b36.f.j(26, str24);
            }
            r45.ms msVar4 = this.C;
            if (msVar4 != null) {
                e27 += b36.f.i(27, msVar4.computeSize());
            }
            java.lang.String str25 = this.D;
            if (str25 != null) {
                e27 += b36.f.j(28, str25);
            }
            java.lang.String str26 = this.E;
            if (str26 != null) {
                e27 += b36.f.j(29, str26);
            }
            r45.cu5 cu5Var3 = this.F;
            if (cu5Var3 != null) {
                e27 += b36.f.i(30, cu5Var3.computeSize());
            }
            r45.w56 w56Var2 = this.G;
            if (w56Var2 != null) {
                e27 += b36.f.i(31, w56Var2.computeSize());
            }
            r45.ms msVar5 = this.H;
            if (msVar5 != null) {
                e27 += b36.f.i(32, msVar5.computeSize());
            }
            r45.ms msVar6 = this.I;
            if (msVar6 != null) {
                e27 += b36.f.i(33, msVar6.computeSize());
            }
            r45.xx5 xx5Var2 = this.f392389J;
            if (xx5Var2 != null) {
                e27 += b36.f.i(34, xx5Var2.computeSize());
            }
            int e28 = e27 + b36.f.e(35, this.K) + b36.f.e(36, this.L) + b36.f.e(37, this.M);
            r45.mg7 mg7Var2 = this.N;
            if (mg7Var2 != null) {
                e28 += b36.f.i(38, mg7Var2.computeSize());
            }
            r45.jg7 jg7Var2 = this.P;
            if (jg7Var2 != null) {
                e28 += b36.f.i(39, jg7Var2.computeSize());
            }
            int e29 = e28 + b36.f.e(40, this.Q);
            r45.wc wcVar2 = this.R;
            if (wcVar2 != null) {
                e29 += b36.f.i(41, wcVar2.computeSize());
            }
            r45.cu5 cu5Var4 = this.S;
            return cu5Var4 != null ? e29 + b36.f.i(42, cu5Var4.computeSize()) : e29;
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
        r45.zv4 zv4Var = (r45.zv4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    zv4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zv4Var.f392390d = aVar2.g(intValue);
                return 0;
            case 3:
                zv4Var.f392391e = aVar2.k(intValue);
                return 0;
            case 4:
                zv4Var.f392392f = aVar2.k(intValue);
                return 0;
            case 5:
                zv4Var.f392393g = aVar2.k(intValue);
                return 0;
            case 6:
                zv4Var.f392394h = aVar2.k(intValue);
                return 0;
            case 7:
                zv4Var.f392395i = aVar2.k(intValue);
                return 0;
            case 8:
                zv4Var.f392396m = aVar2.g(intValue);
                return 0;
            case 9:
                zv4Var.f392397n = aVar2.g(intValue);
                return 0;
            case 10:
                zv4Var.f392398o = aVar2.k(intValue);
                return 0;
            case 11:
            case 12:
            case 13:
            default:
                return -1;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jo joVar3 = new r45.jo();
                    if (bArr2 != null && bArr2.length > 0) {
                        joVar3.parseFrom(bArr2);
                    }
                    zv4Var.f392399p = joVar3;
                }
                return 0;
            case 15:
                zv4Var.f392400q = aVar2.k(intValue);
                return 0;
            case 16:
                zv4Var.f392401r = aVar2.k(intValue);
                return 0;
            case 17:
                zv4Var.f392402s = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.rt4 rt4Var3 = new r45.rt4();
                    if (bArr3 != null && bArr3.length > 0) {
                        rt4Var3.parseFrom(bArr3);
                    }
                    zv4Var.f392403t = rt4Var3;
                }
                return 0;
            case 19:
                zv4Var.f392404u = aVar2.g(intValue);
                return 0;
            case 20:
                zv4Var.f392405v = aVar2.g(intValue);
                return 0;
            case 21:
                zv4Var.f392406w = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.w85 w85Var3 = new r45.w85();
                    if (bArr4 != null && bArr4.length > 0) {
                        w85Var3.parseFrom(bArr4);
                    }
                    zv4Var.f392407x = w85Var3;
                }
                return 0;
            case 23:
                zv4Var.f392408y = aVar2.k(intValue);
                return 0;
            case 24:
                zv4Var.f392409z = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr5 != null && bArr5.length > 0) {
                        kx3Var3.parseFrom(bArr5);
                    }
                    zv4Var.A = kx3Var3;
                }
                return 0;
            case 26:
                zv4Var.B = aVar2.k(intValue);
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.ms msVar7 = new r45.ms();
                    if (bArr6 != null && bArr6.length > 0) {
                        msVar7.parseFrom(bArr6);
                    }
                    zv4Var.C = msVar7;
                }
                return 0;
            case 28:
                zv4Var.D = aVar2.k(intValue);
                return 0;
            case 29:
                zv4Var.E = aVar2.k(intValue);
                return 0;
            case 30:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var5.b(bArr7);
                    }
                    zv4Var.F = cu5Var5;
                }
                return 0;
            case 31:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.w56 w56Var3 = new r45.w56();
                    if (bArr8 != null && bArr8.length > 0) {
                        w56Var3.parseFrom(bArr8);
                    }
                    zv4Var.G = w56Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.ms msVar8 = new r45.ms();
                    if (bArr9 != null && bArr9.length > 0) {
                        msVar8.parseFrom(bArr9);
                    }
                    zv4Var.H = msVar8;
                }
                return 0;
            case 33:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.ms msVar9 = new r45.ms();
                    if (bArr10 != null && bArr10.length > 0) {
                        msVar9.parseFrom(bArr10);
                    }
                    zv4Var.I = msVar9;
                }
                return 0;
            case 34:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.xx5 xx5Var3 = new r45.xx5();
                    if (bArr11 != null && bArr11.length > 0) {
                        xx5Var3.parseFrom(bArr11);
                    }
                    zv4Var.f392389J = xx5Var3;
                }
                return 0;
            case 35:
                zv4Var.K = aVar2.g(intValue);
                return 0;
            case 36:
                zv4Var.L = aVar2.g(intValue);
                return 0;
            case 37:
                zv4Var.M = aVar2.g(intValue);
                return 0;
            case 38:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    r45.mg7 mg7Var3 = new r45.mg7();
                    if (bArr12 != null && bArr12.length > 0) {
                        mg7Var3.parseFrom(bArr12);
                    }
                    zv4Var.N = mg7Var3;
                }
                return 0;
            case 39:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    r45.jg7 jg7Var3 = new r45.jg7();
                    if (bArr13 != null && bArr13.length > 0) {
                        jg7Var3.parseFrom(bArr13);
                    }
                    zv4Var.P = jg7Var3;
                }
                return 0;
            case 40:
                zv4Var.Q = aVar2.g(intValue);
                return 0;
            case 41:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    r45.wc wcVar3 = new r45.wc();
                    if (bArr14 != null && bArr14.length > 0) {
                        wcVar3.parseFrom(bArr14);
                    }
                    zv4Var.R = wcVar3;
                }
                return 0;
            case 42:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr15 != null && bArr15.length > 0) {
                        cu5Var6.b(bArr15);
                    }
                    zv4Var.S = cu5Var6;
                }
                return 0;
        }
    }
}

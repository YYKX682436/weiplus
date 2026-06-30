package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class l2 extends com.tencent.mm.protobuf.f {
    public com.tencent.wechat.mm.biz.l5 A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public com.tencent.wechat.mm.biz.q2 F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f218278J;
    public int K;
    public boolean L;
    public boolean M;
    public java.lang.String N;
    public com.tencent.wechat.mm.biz.k2 P;
    public boolean Q;
    public boolean R;
    public com.tencent.wechat.mm.biz.e5 S;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218279d;

    /* renamed from: f, reason: collision with root package name */
    public int f218281f;

    /* renamed from: g, reason: collision with root package name */
    public int f218282g;

    /* renamed from: h, reason: collision with root package name */
    public long f218283h;

    /* renamed from: i, reason: collision with root package name */
    public int f218284i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218285m;

    /* renamed from: n, reason: collision with root package name */
    public int f218286n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218287o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218288p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218289q;

    /* renamed from: r, reason: collision with root package name */
    public int f218290r;

    /* renamed from: t, reason: collision with root package name */
    public int f218292t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f218293u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f218294v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f218295w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.t4 f218296x;

    /* renamed from: y, reason: collision with root package name */
    public int f218297y;

    /* renamed from: z, reason: collision with root package name */
    public int f218298z;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218280e = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f218291s = new java.util.LinkedList();
    public final boolean[] T = new boolean[55];

    static {
        new com.tencent.wechat.mm.biz.l2();
    }

    public com.tencent.wechat.mm.biz.t4 b() {
        return this.T[28] ? this.f218296x : new com.tencent.wechat.mm.biz.t4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.l2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.l2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.l2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.l2 l2Var = (com.tencent.wechat.mm.biz.l2) fVar;
        return n51.f.a(this.f218279d, l2Var.f218279d) && n51.f.a(this.f218280e, l2Var.f218280e) && n51.f.a(java.lang.Integer.valueOf(this.f218281f), java.lang.Integer.valueOf(l2Var.f218281f)) && n51.f.a(java.lang.Integer.valueOf(this.f218282g), java.lang.Integer.valueOf(l2Var.f218282g)) && n51.f.a(java.lang.Long.valueOf(this.f218283h), java.lang.Long.valueOf(l2Var.f218283h)) && n51.f.a(java.lang.Integer.valueOf(this.f218284i), java.lang.Integer.valueOf(l2Var.f218284i)) && n51.f.a(this.f218285m, l2Var.f218285m) && n51.f.a(java.lang.Integer.valueOf(this.f218286n), java.lang.Integer.valueOf(l2Var.f218286n)) && n51.f.a(this.f218287o, l2Var.f218287o) && n51.f.a(this.f218288p, l2Var.f218288p) && n51.f.a(this.f218289q, l2Var.f218289q) && n51.f.a(java.lang.Integer.valueOf(this.f218290r), java.lang.Integer.valueOf(l2Var.f218290r)) && n51.f.a(this.f218291s, l2Var.f218291s) && n51.f.a(java.lang.Integer.valueOf(this.f218292t), java.lang.Integer.valueOf(l2Var.f218292t)) && n51.f.a(this.f218293u, l2Var.f218293u) && n51.f.a(this.f218294v, l2Var.f218294v) && n51.f.a(this.f218295w, l2Var.f218295w) && n51.f.a(this.f218296x, l2Var.f218296x) && n51.f.a(java.lang.Integer.valueOf(this.f218297y), java.lang.Integer.valueOf(l2Var.f218297y)) && n51.f.a(java.lang.Integer.valueOf(this.f218298z), java.lang.Integer.valueOf(l2Var.f218298z)) && n51.f.a(this.A, l2Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(l2Var.B)) && n51.f.a(this.C, l2Var.C) && n51.f.a(this.D, l2Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(l2Var.E)) && n51.f.a(this.F, l2Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(l2Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(l2Var.H)) && n51.f.a(this.I, l2Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f218278J), java.lang.Integer.valueOf(l2Var.f218278J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(l2Var.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(l2Var.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(l2Var.M)) && n51.f.a(this.N, l2Var.N) && n51.f.a(this.P, l2Var.P) && n51.f.a(java.lang.Boolean.valueOf(this.Q), java.lang.Boolean.valueOf(l2Var.Q)) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(l2Var.R)) && n51.f.a(this.S, l2Var.S);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.l2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.T;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218279d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f218280e);
            if (zArr[3]) {
                fVar.e(3, this.f218281f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218282g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f218283h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218284i);
            }
            java.lang.String str2 = this.f218285m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218286n);
            }
            java.lang.String str3 = this.f218287o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f218288p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f218289q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.e(12, this.f218290r);
            }
            fVar.g(13, 1, this.f218291s);
            if (zArr[14]) {
                fVar.e(14, this.f218292t);
            }
            java.lang.String str6 = this.f218293u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f218294v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f218295w;
            if (str8 != null && zArr[17]) {
                fVar.j(17, str8);
            }
            com.tencent.wechat.mm.biz.t4 t4Var = this.f218296x;
            if (t4Var != null && zArr[28]) {
                fVar.i(28, t4Var.computeSize());
                this.f218296x.writeFields(fVar);
            }
            if (zArr[29]) {
                fVar.e(29, this.f218297y);
            }
            if (zArr[30]) {
                fVar.e(30, this.f218298z);
            }
            com.tencent.wechat.mm.biz.l5 l5Var = this.A;
            if (l5Var != null && zArr[31]) {
                fVar.i(31, l5Var.computeSize());
                this.A.writeFields(fVar);
            }
            if (zArr[32]) {
                fVar.e(32, this.B);
            }
            java.lang.String str9 = this.C;
            if (str9 != null && zArr[33]) {
                fVar.j(33, str9);
            }
            java.lang.String str10 = this.D;
            if (str10 != null && zArr[34]) {
                fVar.j(34, str10);
            }
            if (zArr[35]) {
                fVar.e(35, this.E);
            }
            com.tencent.wechat.mm.biz.q2 q2Var = this.F;
            if (q2Var != null && zArr[36]) {
                fVar.i(36, q2Var.computeSize());
                this.F.writeFields(fVar);
            }
            if (zArr[37]) {
                fVar.e(37, this.G);
            }
            if (zArr[38]) {
                fVar.e(38, this.H);
            }
            java.lang.String str11 = this.I;
            if (str11 != null && zArr[39]) {
                fVar.j(39, str11);
            }
            if (zArr[40]) {
                fVar.e(40, this.f218278J);
            }
            if (zArr[41]) {
                fVar.e(41, this.K);
            }
            if (zArr[42]) {
                fVar.a(42, this.L);
            }
            if (zArr[43]) {
                fVar.a(43, this.M);
            }
            java.lang.String str12 = this.N;
            if (str12 != null && zArr[47]) {
                fVar.j(47, str12);
            }
            com.tencent.wechat.mm.biz.k2 k2Var = this.P;
            if (k2Var != null && zArr[48]) {
                fVar.i(48, k2Var.computeSize());
                this.P.writeFields(fVar);
            }
            if (zArr[49]) {
                fVar.a(49, this.Q);
            }
            if (zArr[53]) {
                fVar.a(53, this.R);
            }
            com.tencent.wechat.mm.biz.e5 e5Var = this.S;
            if (e5Var != null && zArr[54]) {
                fVar.i(54, e5Var.computeSize());
                this.S.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f218279d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f218280e);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f218281f);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f218282g);
            }
            if (zArr[5]) {
                g17 += b36.f.h(5, this.f218283h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f218284i);
            }
            java.lang.String str14 = this.f218285m;
            if (str14 != null && zArr[7]) {
                g17 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f218286n);
            }
            java.lang.String str15 = this.f218287o;
            if (str15 != null && zArr[9]) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f218288p;
            if (str16 != null && zArr[10]) {
                g17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f218289q;
            if (str17 != null && zArr[11]) {
                g17 += b36.f.j(11, str17);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f218290r);
            }
            int g18 = g17 + b36.f.g(13, 1, this.f218291s);
            if (zArr[14]) {
                g18 += b36.f.e(14, this.f218292t);
            }
            java.lang.String str18 = this.f218293u;
            if (str18 != null && zArr[15]) {
                g18 += b36.f.j(15, str18);
            }
            java.lang.String str19 = this.f218294v;
            if (str19 != null && zArr[16]) {
                g18 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f218295w;
            if (str20 != null && zArr[17]) {
                g18 += b36.f.j(17, str20);
            }
            com.tencent.wechat.mm.biz.t4 t4Var2 = this.f218296x;
            if (t4Var2 != null && zArr[28]) {
                g18 += b36.f.i(28, t4Var2.computeSize());
            }
            if (zArr[29]) {
                g18 += b36.f.e(29, this.f218297y);
            }
            if (zArr[30]) {
                g18 += b36.f.e(30, this.f218298z);
            }
            com.tencent.wechat.mm.biz.l5 l5Var2 = this.A;
            if (l5Var2 != null && zArr[31]) {
                g18 += b36.f.i(31, l5Var2.computeSize());
            }
            if (zArr[32]) {
                g18 += b36.f.e(32, this.B);
            }
            java.lang.String str21 = this.C;
            if (str21 != null && zArr[33]) {
                g18 += b36.f.j(33, str21);
            }
            java.lang.String str22 = this.D;
            if (str22 != null && zArr[34]) {
                g18 += b36.f.j(34, str22);
            }
            if (zArr[35]) {
                g18 += b36.f.e(35, this.E);
            }
            com.tencent.wechat.mm.biz.q2 q2Var2 = this.F;
            if (q2Var2 != null && zArr[36]) {
                g18 += b36.f.i(36, q2Var2.computeSize());
            }
            if (zArr[37]) {
                g18 += b36.f.e(37, this.G);
            }
            if (zArr[38]) {
                g18 += b36.f.e(38, this.H);
            }
            java.lang.String str23 = this.I;
            if (str23 != null && zArr[39]) {
                g18 += b36.f.j(39, str23);
            }
            if (zArr[40]) {
                g18 += b36.f.e(40, this.f218278J);
            }
            if (zArr[41]) {
                g18 += b36.f.e(41, this.K);
            }
            if (zArr[42]) {
                g18 += b36.f.a(42, this.L);
            }
            if (zArr[43]) {
                g18 += b36.f.a(43, this.M);
            }
            java.lang.String str24 = this.N;
            if (str24 != null && zArr[47]) {
                g18 += b36.f.j(47, str24);
            }
            com.tencent.wechat.mm.biz.k2 k2Var2 = this.P;
            if (k2Var2 != null && zArr[48]) {
                g18 += b36.f.i(48, k2Var2.computeSize());
            }
            if (zArr[49]) {
                g18 += b36.f.a(49, this.Q);
            }
            if (zArr[53]) {
                g18 += b36.f.a(53, this.R);
            }
            com.tencent.wechat.mm.biz.e5 e5Var2 = this.S;
            return (e5Var2 == null || !zArr[54]) ? g18 : g18 + b36.f.i(54, e5Var2.computeSize());
        }
        if (i17 == 2) {
            this.f218280e.clear();
            this.f218291s.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 53) {
            this.R = aVar2.c(intValue);
            zArr[53] = true;
            return 0;
        }
        if (intValue == 54) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.mm.biz.e5 e5Var3 = new com.tencent.wechat.mm.biz.e5();
                if (bArr != null && bArr.length > 0) {
                    e5Var3.parseFrom(bArr);
                }
                this.S = e5Var3;
            }
            zArr[54] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f218279d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.m2 m2Var = new com.tencent.wechat.mm.biz.m2();
                    if (bArr2 != null && bArr2.length > 0) {
                        m2Var.parseFrom(bArr2);
                    }
                    this.f218280e.add(m2Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f218281f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218282g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218283h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218284i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218285m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218286n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218287o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218288p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218289q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218290r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218291s.add(aVar2.k(intValue));
                zArr[13] = true;
                return 0;
            case 14:
                this.f218292t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f218293u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f218294v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f218295w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            default:
                switch (intValue) {
                    case 28:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr3 = (byte[]) j19.get(i28);
                            com.tencent.wechat.mm.biz.t4 t4Var3 = new com.tencent.wechat.mm.biz.t4();
                            if (bArr3 != null && bArr3.length > 0) {
                                t4Var3.parseFrom(bArr3);
                            }
                            this.f218296x = t4Var3;
                        }
                        zArr[28] = true;
                        return 0;
                    case 29:
                        this.f218297y = aVar2.g(intValue);
                        zArr[29] = true;
                        return 0;
                    case 30:
                        this.f218298z = aVar2.g(intValue);
                        zArr[30] = true;
                        return 0;
                    case 31:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr4 = (byte[]) j27.get(i29);
                            com.tencent.wechat.mm.biz.l5 l5Var3 = new com.tencent.wechat.mm.biz.l5();
                            if (bArr4 != null && bArr4.length > 0) {
                                l5Var3.parseFrom(bArr4);
                            }
                            this.A = l5Var3;
                        }
                        zArr[31] = true;
                        return 0;
                    case 32:
                        this.B = aVar2.g(intValue);
                        zArr[32] = true;
                        return 0;
                    case 33:
                        this.C = aVar2.k(intValue);
                        zArr[33] = true;
                        return 0;
                    case 34:
                        this.D = aVar2.k(intValue);
                        zArr[34] = true;
                        return 0;
                    case 35:
                        this.E = aVar2.g(intValue);
                        zArr[35] = true;
                        return 0;
                    case 36:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr5 = (byte[]) j28.get(i37);
                            com.tencent.wechat.mm.biz.q2 q2Var3 = new com.tencent.wechat.mm.biz.q2();
                            if (bArr5 != null && bArr5.length > 0) {
                                q2Var3.parseFrom(bArr5);
                            }
                            this.F = q2Var3;
                        }
                        zArr[36] = true;
                        return 0;
                    case 37:
                        this.G = aVar2.g(intValue);
                        zArr[37] = true;
                        return 0;
                    case 38:
                        this.H = aVar2.g(intValue);
                        zArr[38] = true;
                        return 0;
                    case 39:
                        this.I = aVar2.k(intValue);
                        zArr[39] = true;
                        return 0;
                    case 40:
                        this.f218278J = aVar2.g(intValue);
                        zArr[40] = true;
                        return 0;
                    case 41:
                        this.K = aVar2.g(intValue);
                        zArr[41] = true;
                        return 0;
                    case 42:
                        this.L = aVar2.c(intValue);
                        zArr[42] = true;
                        return 0;
                    case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                        this.M = aVar2.c(intValue);
                        zArr[43] = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 47:
                                this.N = aVar2.k(intValue);
                                zArr[47] = true;
                                return 0;
                            case 48:
                                java.util.LinkedList j29 = aVar2.j(intValue);
                                int size6 = j29.size();
                                for (int i38 = 0; i38 < size6; i38++) {
                                    byte[] bArr6 = (byte[]) j29.get(i38);
                                    com.tencent.wechat.mm.biz.k2 k2Var3 = new com.tencent.wechat.mm.biz.k2();
                                    if (bArr6 != null && bArr6.length > 0) {
                                        k2Var3.parseFrom(bArr6);
                                    }
                                    this.P = k2Var3;
                                }
                                zArr[48] = true;
                                return 0;
                            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                this.Q = aVar2.c(intValue);
                                zArr[49] = true;
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }
}

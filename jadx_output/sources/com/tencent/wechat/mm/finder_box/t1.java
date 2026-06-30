package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class t1 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public int B;
    public int C;
    public java.lang.String D;
    public int E;
    public com.tencent.wechat.mm.finder_box.v2 F;
    public java.lang.String G;
    public java.lang.String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f219827J;
    public com.tencent.mm.protobuf.g K;
    public com.tencent.mm.protobuf.g L;
    public java.lang.String N;
    public int P;
    public java.lang.String Q;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219829e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219830f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219831g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219832h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219833i;

    /* renamed from: m, reason: collision with root package name */
    public int f219834m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219835n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219836o;

    /* renamed from: p, reason: collision with root package name */
    public int f219837p;

    /* renamed from: q, reason: collision with root package name */
    public int f219838q;

    /* renamed from: r, reason: collision with root package name */
    public int f219839r;

    /* renamed from: s, reason: collision with root package name */
    public int f219840s;

    /* renamed from: u, reason: collision with root package name */
    public int f219842u;

    /* renamed from: v, reason: collision with root package name */
    public int f219843v;

    /* renamed from: w, reason: collision with root package name */
    public int f219844w;

    /* renamed from: x, reason: collision with root package name */
    public int f219845x;

    /* renamed from: y, reason: collision with root package name */
    public int f219846y;

    /* renamed from: z, reason: collision with root package name */
    public int f219847z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f219841t = new java.util.LinkedList();
    public final java.util.LinkedList M = new java.util.LinkedList();
    public final boolean[] R = new boolean[43];

    static {
        new com.tencent.wechat.mm.finder_box.t1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.t1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.t1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.t1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.t1 t1Var = (com.tencent.wechat.mm.finder_box.t1) fVar;
        return n51.f.a(this.f219828d, t1Var.f219828d) && n51.f.a(this.f219829e, t1Var.f219829e) && n51.f.a(this.f219830f, t1Var.f219830f) && n51.f.a(this.f219831g, t1Var.f219831g) && n51.f.a(this.f219832h, t1Var.f219832h) && n51.f.a(this.f219833i, t1Var.f219833i) && n51.f.a(java.lang.Integer.valueOf(this.f219834m), java.lang.Integer.valueOf(t1Var.f219834m)) && n51.f.a(this.f219835n, t1Var.f219835n) && n51.f.a(this.f219836o, t1Var.f219836o) && n51.f.a(java.lang.Integer.valueOf(this.f219837p), java.lang.Integer.valueOf(t1Var.f219837p)) && n51.f.a(java.lang.Integer.valueOf(this.f219838q), java.lang.Integer.valueOf(t1Var.f219838q)) && n51.f.a(java.lang.Integer.valueOf(this.f219839r), java.lang.Integer.valueOf(t1Var.f219839r)) && n51.f.a(java.lang.Integer.valueOf(this.f219840s), java.lang.Integer.valueOf(t1Var.f219840s)) && n51.f.a(this.f219841t, t1Var.f219841t) && n51.f.a(java.lang.Integer.valueOf(this.f219842u), java.lang.Integer.valueOf(t1Var.f219842u)) && n51.f.a(java.lang.Integer.valueOf(this.f219843v), java.lang.Integer.valueOf(t1Var.f219843v)) && n51.f.a(java.lang.Integer.valueOf(this.f219844w), java.lang.Integer.valueOf(t1Var.f219844w)) && n51.f.a(java.lang.Integer.valueOf(this.f219845x), java.lang.Integer.valueOf(t1Var.f219845x)) && n51.f.a(java.lang.Integer.valueOf(this.f219846y), java.lang.Integer.valueOf(t1Var.f219846y)) && n51.f.a(java.lang.Integer.valueOf(this.f219847z), java.lang.Integer.valueOf(t1Var.f219847z)) && n51.f.a(this.A, t1Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(t1Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(t1Var.C)) && n51.f.a(this.D, t1Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(t1Var.E)) && n51.f.a(this.F, t1Var.F) && n51.f.a(this.G, t1Var.G) && n51.f.a(this.H, t1Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(t1Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f219827J), java.lang.Integer.valueOf(t1Var.f219827J)) && n51.f.a(this.K, t1Var.K) && n51.f.a(this.L, t1Var.L) && n51.f.a(this.M, t1Var.M) && n51.f.a(this.N, t1Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(t1Var.P)) && n51.f.a(this.Q, t1Var.Q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.t1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.R;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f219828d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f219829e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f219830f;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f219831g;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f219832h;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f219833i;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f219834m);
            }
            java.lang.String str6 = this.f219835n;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f219836o;
            if (str7 != null && zArr[15]) {
                fVar.j(15, str7);
            }
            if (zArr[16]) {
                fVar.e(16, this.f219837p);
            }
            if (zArr[17]) {
                fVar.e(17, this.f219838q);
            }
            if (zArr[18]) {
                fVar.e(18, this.f219839r);
            }
            if (zArr[19]) {
                fVar.e(19, this.f219840s);
            }
            fVar.g(20, 1, this.f219841t);
            if (zArr[21]) {
                fVar.e(21, this.f219842u);
            }
            if (zArr[22]) {
                fVar.e(22, this.f219843v);
            }
            if (zArr[23]) {
                fVar.e(23, this.f219844w);
            }
            if (zArr[24]) {
                fVar.e(24, this.f219845x);
            }
            if (zArr[25]) {
                fVar.e(25, this.f219846y);
            }
            if (zArr[26]) {
                fVar.e(26, this.f219847z);
            }
            java.lang.String str8 = this.A;
            if (str8 != null && zArr[27]) {
                fVar.j(27, str8);
            }
            if (zArr[28]) {
                fVar.e(28, this.B);
            }
            if (zArr[29]) {
                fVar.e(29, this.C);
            }
            java.lang.String str9 = this.D;
            if (str9 != null && zArr[30]) {
                fVar.j(30, str9);
            }
            if (zArr[31]) {
                fVar.e(31, this.E);
            }
            com.tencent.wechat.mm.finder_box.v2 v2Var = this.F;
            if (v2Var != null && zArr[32]) {
                fVar.i(32, v2Var.computeSize());
                this.F.writeFields(fVar);
            }
            java.lang.String str10 = this.G;
            if (str10 != null && zArr[33]) {
                fVar.j(33, str10);
            }
            java.lang.String str11 = this.H;
            if (str11 != null && zArr[34]) {
                fVar.j(34, str11);
            }
            if (zArr[35]) {
                fVar.e(35, this.I);
            }
            if (zArr[36]) {
                fVar.e(36, this.f219827J);
            }
            com.tencent.mm.protobuf.g gVar2 = this.K;
            if (gVar2 != null && zArr[37]) {
                fVar.b(37, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.L;
            if (gVar3 != null && zArr[38]) {
                fVar.b(38, gVar3);
            }
            fVar.g(39, 1, this.M);
            java.lang.String str12 = this.N;
            if (str12 != null && zArr[40]) {
                fVar.j(40, str12);
            }
            if (zArr[41]) {
                fVar.e(41, this.P);
            }
            java.lang.String str13 = this.Q;
            if (str13 != null && zArr[42]) {
                fVar.j(42, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f219828d;
            if (gVar4 != null && zArr[1]) {
                i18 = b36.f.b(1, gVar4) + 0;
            }
            java.lang.String str14 = this.f219829e;
            if (str14 != null && zArr[3]) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f219830f;
            if (str15 != null && zArr[6]) {
                i18 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f219831g;
            if (str16 != null && zArr[8]) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f219832h;
            if (str17 != null && zArr[9]) {
                i18 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f219833i;
            if (str18 != null && zArr[10]) {
                i18 += b36.f.j(10, str18);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f219834m);
            }
            java.lang.String str19 = this.f219835n;
            if (str19 != null && zArr[12]) {
                i18 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f219836o;
            if (str20 != null && zArr[15]) {
                i18 += b36.f.j(15, str20);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f219837p);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f219838q);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f219839r);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f219840s);
            }
            int g17 = i18 + b36.f.g(20, 1, this.f219841t);
            if (zArr[21]) {
                g17 += b36.f.e(21, this.f219842u);
            }
            if (zArr[22]) {
                g17 += b36.f.e(22, this.f219843v);
            }
            if (zArr[23]) {
                g17 += b36.f.e(23, this.f219844w);
            }
            if (zArr[24]) {
                g17 += b36.f.e(24, this.f219845x);
            }
            if (zArr[25]) {
                g17 += b36.f.e(25, this.f219846y);
            }
            if (zArr[26]) {
                g17 += b36.f.e(26, this.f219847z);
            }
            java.lang.String str21 = this.A;
            if (str21 != null && zArr[27]) {
                g17 += b36.f.j(27, str21);
            }
            if (zArr[28]) {
                g17 += b36.f.e(28, this.B);
            }
            if (zArr[29]) {
                g17 += b36.f.e(29, this.C);
            }
            java.lang.String str22 = this.D;
            if (str22 != null && zArr[30]) {
                g17 += b36.f.j(30, str22);
            }
            if (zArr[31]) {
                g17 += b36.f.e(31, this.E);
            }
            com.tencent.wechat.mm.finder_box.v2 v2Var2 = this.F;
            if (v2Var2 != null && zArr[32]) {
                g17 += b36.f.i(32, v2Var2.computeSize());
            }
            java.lang.String str23 = this.G;
            if (str23 != null && zArr[33]) {
                g17 += b36.f.j(33, str23);
            }
            java.lang.String str24 = this.H;
            if (str24 != null && zArr[34]) {
                g17 += b36.f.j(34, str24);
            }
            if (zArr[35]) {
                g17 += b36.f.e(35, this.I);
            }
            if (zArr[36]) {
                g17 += b36.f.e(36, this.f219827J);
            }
            com.tencent.mm.protobuf.g gVar5 = this.K;
            if (gVar5 != null && zArr[37]) {
                g17 += b36.f.b(37, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.L;
            if (gVar6 != null && zArr[38]) {
                g17 += b36.f.b(38, gVar6);
            }
            int g18 = g17 + b36.f.g(39, 1, this.M);
            java.lang.String str25 = this.N;
            if (str25 != null && zArr[40]) {
                g18 += b36.f.j(40, str25);
            }
            if (zArr[41]) {
                g18 += b36.f.e(41, this.P);
            }
            java.lang.String str26 = this.Q;
            return (str26 == null || !zArr[42]) ? g18 : g18 + b36.f.j(42, str26);
        }
        if (i17 == 2) {
            this.f219841t.clear();
            this.M.clear();
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
        if (intValue == 1) {
            this.f219828d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219829e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 6) {
            this.f219830f = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        switch (intValue) {
            case 8:
                this.f219831g = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219832h = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219833i = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219834m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219835n = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                switch (intValue) {
                    case 15:
                        this.f219836o = aVar2.k(intValue);
                        zArr[15] = true;
                        return 0;
                    case 16:
                        this.f219837p = aVar2.g(intValue);
                        zArr[16] = true;
                        return 0;
                    case 17:
                        this.f219838q = aVar2.g(intValue);
                        zArr[17] = true;
                        return 0;
                    case 18:
                        this.f219839r = aVar2.g(intValue);
                        zArr[18] = true;
                        return 0;
                    case 19:
                        this.f219840s = aVar2.g(intValue);
                        zArr[19] = true;
                        return 0;
                    case 20:
                        this.f219841t.add(aVar2.k(intValue));
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f219842u = aVar2.g(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f219843v = aVar2.g(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f219844w = aVar2.g(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f219845x = aVar2.g(intValue);
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.f219846y = aVar2.g(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        this.f219847z = aVar2.g(intValue);
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.A = aVar2.k(intValue);
                        zArr[27] = true;
                        return 0;
                    case 28:
                        this.B = aVar2.g(intValue);
                        zArr[28] = true;
                        return 0;
                    case 29:
                        this.C = aVar2.g(intValue);
                        zArr[29] = true;
                        return 0;
                    case 30:
                        this.D = aVar2.k(intValue);
                        zArr[30] = true;
                        return 0;
                    case 31:
                        this.E = aVar2.g(intValue);
                        zArr[31] = true;
                        return 0;
                    case 32:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            byte[] bArr = (byte[]) j17.get(i19);
                            com.tencent.wechat.mm.finder_box.v2 v2Var3 = new com.tencent.wechat.mm.finder_box.v2();
                            if (bArr != null && bArr.length > 0) {
                                v2Var3.parseFrom(bArr);
                            }
                            this.F = v2Var3;
                        }
                        zArr[32] = true;
                        return 0;
                    case 33:
                        this.G = aVar2.k(intValue);
                        zArr[33] = true;
                        return 0;
                    case 34:
                        this.H = aVar2.k(intValue);
                        zArr[34] = true;
                        return 0;
                    case 35:
                        this.I = aVar2.g(intValue);
                        zArr[35] = true;
                        return 0;
                    case 36:
                        this.f219827J = aVar2.g(intValue);
                        zArr[36] = true;
                        return 0;
                    case 37:
                        this.K = aVar2.d(intValue);
                        zArr[37] = true;
                        return 0;
                    case 38:
                        this.L = aVar2.d(intValue);
                        zArr[38] = true;
                        return 0;
                    case 39:
                        this.M.add(aVar2.k(intValue));
                        zArr[39] = true;
                        return 0;
                    case 40:
                        this.N = aVar2.k(intValue);
                        zArr[40] = true;
                        return 0;
                    case 41:
                        this.P = aVar2.g(intValue);
                        zArr[41] = true;
                        return 0;
                    case 42:
                        this.Q = aVar2.k(intValue);
                        zArr[42] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}

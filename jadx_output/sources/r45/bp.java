package r45;

/* loaded from: classes9.dex */
public class bp extends r45.mr5 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f370920J;
    public java.lang.String K;
    public int M;
    public java.lang.String N;
    public java.lang.String R;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370922e;

    /* renamed from: f, reason: collision with root package name */
    public int f370923f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370925h;

    /* renamed from: i, reason: collision with root package name */
    public int f370926i;

    /* renamed from: m, reason: collision with root package name */
    public int f370927m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370928n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f370929o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f370930p;

    /* renamed from: q, reason: collision with root package name */
    public int f370931q;

    /* renamed from: r, reason: collision with root package name */
    public int f370932r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f370933s;

    /* renamed from: t, reason: collision with root package name */
    public r45.uq0 f370934t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f370935u;

    /* renamed from: v, reason: collision with root package name */
    public int f370936v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f370937w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f370938x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f370939y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f370940z;
    public java.util.LinkedList L = new java.util.LinkedList();
    public boolean P = false;
    public boolean Q = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp)) {
            return false;
        }
        r45.bp bpVar = (r45.bp) fVar;
        return n51.f.a(this.BaseRequest, bpVar.BaseRequest) && n51.f.a(this.f370921d, bpVar.f370921d) && n51.f.a(this.f370922e, bpVar.f370922e) && n51.f.a(java.lang.Integer.valueOf(this.f370923f), java.lang.Integer.valueOf(bpVar.f370923f)) && n51.f.a(this.f370924g, bpVar.f370924g) && n51.f.a(this.f370925h, bpVar.f370925h) && n51.f.a(java.lang.Integer.valueOf(this.f370926i), java.lang.Integer.valueOf(bpVar.f370926i)) && n51.f.a(java.lang.Integer.valueOf(this.f370927m), java.lang.Integer.valueOf(bpVar.f370927m)) && n51.f.a(this.f370928n, bpVar.f370928n) && n51.f.a(this.f370929o, bpVar.f370929o) && n51.f.a(this.f370930p, bpVar.f370930p) && n51.f.a(java.lang.Integer.valueOf(this.f370931q), java.lang.Integer.valueOf(bpVar.f370931q)) && n51.f.a(java.lang.Integer.valueOf(this.f370932r), java.lang.Integer.valueOf(bpVar.f370932r)) && n51.f.a(this.f370933s, bpVar.f370933s) && n51.f.a(this.f370934t, bpVar.f370934t) && n51.f.a(this.f370935u, bpVar.f370935u) && n51.f.a(java.lang.Integer.valueOf(this.f370936v), java.lang.Integer.valueOf(bpVar.f370936v)) && n51.f.a(java.lang.Boolean.valueOf(this.f370937w), java.lang.Boolean.valueOf(bpVar.f370937w)) && n51.f.a(java.lang.Boolean.valueOf(this.f370938x), java.lang.Boolean.valueOf(bpVar.f370938x)) && n51.f.a(this.f370939y, bpVar.f370939y) && n51.f.a(this.f370940z, bpVar.f370940z) && n51.f.a(this.A, bpVar.A) && n51.f.a(this.B, bpVar.B) && n51.f.a(this.C, bpVar.C) && n51.f.a(this.D, bpVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(bpVar.E)) && n51.f.a(this.F, bpVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(bpVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(bpVar.H)) && n51.f.a(this.I, bpVar.I) && n51.f.a(this.f370920J, bpVar.f370920J) && n51.f.a(this.K, bpVar.K) && n51.f.a(this.L, bpVar.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(bpVar.M)) && n51.f.a(this.N, bpVar.N) && n51.f.a(java.lang.Boolean.valueOf(this.P), java.lang.Boolean.valueOf(bpVar.P)) && n51.f.a(java.lang.Boolean.valueOf(this.Q), java.lang.Boolean.valueOf(bpVar.Q)) && n51.f.a(this.R, bpVar.R);
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
            java.lang.String str = this.f370921d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370922e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f370923f);
            java.lang.String str3 = this.f370924g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f370925h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f370926i);
            fVar.e(8, this.f370927m);
            java.lang.String str5 = this.f370928n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f370929o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f370930p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f370931q);
            fVar.e(13, this.f370932r);
            java.lang.String str8 = this.f370933s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            r45.uq0 uq0Var = this.f370934t;
            if (uq0Var != null) {
                fVar.i(15, uq0Var.computeSize());
                this.f370934t.writeFields(fVar);
            }
            java.lang.String str9 = this.f370935u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            fVar.e(17, this.f370936v);
            fVar.a(18, this.f370937w);
            fVar.a(19, this.f370938x);
            java.lang.String str10 = this.f370939y;
            if (str10 != null) {
                fVar.j(20, str10);
            }
            java.lang.String str11 = this.f370940z;
            if (str11 != null) {
                fVar.j(21, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                fVar.j(22, str12);
            }
            java.lang.String str13 = this.B;
            if (str13 != null) {
                fVar.j(23, str13);
            }
            java.lang.String str14 = this.C;
            if (str14 != null) {
                fVar.j(24, str14);
            }
            java.lang.String str15 = this.D;
            if (str15 != null) {
                fVar.j(25, str15);
            }
            fVar.e(26, this.E);
            java.lang.String str16 = this.F;
            if (str16 != null) {
                fVar.j(27, str16);
            }
            fVar.e(28, this.G);
            fVar.e(29, this.H);
            java.lang.String str17 = this.I;
            if (str17 != null) {
                fVar.j(30, str17);
            }
            java.lang.String str18 = this.f370920J;
            if (str18 != null) {
                fVar.j(31, str18);
            }
            java.lang.String str19 = this.K;
            if (str19 != null) {
                fVar.j(32, str19);
            }
            fVar.g(33, 8, this.L);
            fVar.e(34, this.M);
            java.lang.String str20 = this.N;
            if (str20 != null) {
                fVar.j(35, str20);
            }
            fVar.a(101, this.P);
            fVar.a(102, this.Q);
            java.lang.String str21 = this.R;
            if (str21 != null) {
                fVar.j(103, str21);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str22 = this.f370921d;
            if (str22 != null) {
                i18 += b36.f.j(2, str22);
            }
            java.lang.String str23 = this.f370922e;
            if (str23 != null) {
                i18 += b36.f.j(3, str23);
            }
            int e17 = i18 + b36.f.e(4, this.f370923f);
            java.lang.String str24 = this.f370924g;
            if (str24 != null) {
                e17 += b36.f.j(5, str24);
            }
            java.lang.String str25 = this.f370925h;
            if (str25 != null) {
                e17 += b36.f.j(6, str25);
            }
            int e18 = e17 + b36.f.e(7, this.f370926i) + b36.f.e(8, this.f370927m);
            java.lang.String str26 = this.f370928n;
            if (str26 != null) {
                e18 += b36.f.j(9, str26);
            }
            java.lang.String str27 = this.f370929o;
            if (str27 != null) {
                e18 += b36.f.j(10, str27);
            }
            java.lang.String str28 = this.f370930p;
            if (str28 != null) {
                e18 += b36.f.j(11, str28);
            }
            int e19 = e18 + b36.f.e(12, this.f370931q) + b36.f.e(13, this.f370932r);
            java.lang.String str29 = this.f370933s;
            if (str29 != null) {
                e19 += b36.f.j(14, str29);
            }
            r45.uq0 uq0Var2 = this.f370934t;
            if (uq0Var2 != null) {
                e19 += b36.f.i(15, uq0Var2.computeSize());
            }
            java.lang.String str30 = this.f370935u;
            if (str30 != null) {
                e19 += b36.f.j(16, str30);
            }
            int e27 = e19 + b36.f.e(17, this.f370936v) + b36.f.a(18, this.f370937w) + b36.f.a(19, this.f370938x);
            java.lang.String str31 = this.f370939y;
            if (str31 != null) {
                e27 += b36.f.j(20, str31);
            }
            java.lang.String str32 = this.f370940z;
            if (str32 != null) {
                e27 += b36.f.j(21, str32);
            }
            java.lang.String str33 = this.A;
            if (str33 != null) {
                e27 += b36.f.j(22, str33);
            }
            java.lang.String str34 = this.B;
            if (str34 != null) {
                e27 += b36.f.j(23, str34);
            }
            java.lang.String str35 = this.C;
            if (str35 != null) {
                e27 += b36.f.j(24, str35);
            }
            java.lang.String str36 = this.D;
            if (str36 != null) {
                e27 += b36.f.j(25, str36);
            }
            int e28 = e27 + b36.f.e(26, this.E);
            java.lang.String str37 = this.F;
            if (str37 != null) {
                e28 += b36.f.j(27, str37);
            }
            int e29 = e28 + b36.f.e(28, this.G) + b36.f.e(29, this.H);
            java.lang.String str38 = this.I;
            if (str38 != null) {
                e29 += b36.f.j(30, str38);
            }
            java.lang.String str39 = this.f370920J;
            if (str39 != null) {
                e29 += b36.f.j(31, str39);
            }
            java.lang.String str40 = this.K;
            if (str40 != null) {
                e29 += b36.f.j(32, str40);
            }
            int g17 = e29 + b36.f.g(33, 8, this.L) + b36.f.e(34, this.M);
            java.lang.String str41 = this.N;
            if (str41 != null) {
                g17 += b36.f.j(35, str41);
            }
            int a17 = g17 + b36.f.a(101, this.P) + b36.f.a(102, this.Q);
            java.lang.String str42 = this.R;
            return str42 != null ? a17 + b36.f.j(103, str42) : a17;
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
        r45.bp bpVar = (r45.bp) objArr[1];
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
                    bpVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bpVar.f370921d = aVar2.k(intValue);
                return 0;
            case 3:
                bpVar.f370922e = aVar2.k(intValue);
                return 0;
            case 4:
                bpVar.f370923f = aVar2.g(intValue);
                return 0;
            case 5:
                bpVar.f370924g = aVar2.k(intValue);
                return 0;
            case 6:
                bpVar.f370925h = aVar2.k(intValue);
                return 0;
            case 7:
                bpVar.f370926i = aVar2.g(intValue);
                return 0;
            case 8:
                bpVar.f370927m = aVar2.g(intValue);
                return 0;
            case 9:
                bpVar.f370928n = aVar2.k(intValue);
                return 0;
            case 10:
                bpVar.f370929o = aVar2.k(intValue);
                return 0;
            case 11:
                bpVar.f370930p = aVar2.k(intValue);
                return 0;
            case 12:
                bpVar.f370931q = aVar2.g(intValue);
                return 0;
            case 13:
                bpVar.f370932r = aVar2.g(intValue);
                return 0;
            case 14:
                bpVar.f370933s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.uq0 uq0Var3 = new r45.uq0();
                    if (bArr3 != null && bArr3.length > 0) {
                        uq0Var3.parseFrom(bArr3);
                    }
                    bpVar.f370934t = uq0Var3;
                }
                return 0;
            case 16:
                bpVar.f370935u = aVar2.k(intValue);
                return 0;
            case 17:
                bpVar.f370936v = aVar2.g(intValue);
                return 0;
            case 18:
                bpVar.f370937w = aVar2.c(intValue);
                return 0;
            case 19:
                bpVar.f370938x = aVar2.c(intValue);
                return 0;
            case 20:
                bpVar.f370939y = aVar2.k(intValue);
                return 0;
            case 21:
                bpVar.f370940z = aVar2.k(intValue);
                return 0;
            case 22:
                bpVar.A = aVar2.k(intValue);
                return 0;
            case 23:
                bpVar.B = aVar2.k(intValue);
                return 0;
            case 24:
                bpVar.C = aVar2.k(intValue);
                return 0;
            case 25:
                bpVar.D = aVar2.k(intValue);
                return 0;
            case 26:
                bpVar.E = aVar2.g(intValue);
                return 0;
            case 27:
                bpVar.F = aVar2.k(intValue);
                return 0;
            case 28:
                bpVar.G = aVar2.g(intValue);
                return 0;
            case 29:
                bpVar.H = aVar2.g(intValue);
                return 0;
            case 30:
                bpVar.I = aVar2.k(intValue);
                return 0;
            case 31:
                bpVar.f370920J = aVar2.k(intValue);
                return 0;
            case 32:
                bpVar.K = aVar2.k(intValue);
                return 0;
            case 33:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ln0 ln0Var = new r45.ln0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ln0Var.parseFrom(bArr4);
                    }
                    bpVar.L.add(ln0Var);
                }
                return 0;
            case 34:
                bpVar.M = aVar2.g(intValue);
                return 0;
            case 35:
                bpVar.N = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        bpVar.P = aVar2.c(intValue);
                        return 0;
                    case 102:
                        bpVar.Q = aVar2.c(intValue);
                        return 0;
                    case 103:
                        bpVar.R = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}

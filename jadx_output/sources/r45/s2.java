package r45;

/* loaded from: classes4.dex */
public class s2 extends r45.mr5 {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f385404J;
    public int K;
    public java.lang.String L;
    public java.lang.String M;
    public int N;
    public java.lang.String P;
    public r45.r2 Q;
    public r45.q2 R;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385405d;

    /* renamed from: e, reason: collision with root package name */
    public int f385406e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385407f;

    /* renamed from: g, reason: collision with root package name */
    public int f385408g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385409h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385410i;

    /* renamed from: m, reason: collision with root package name */
    public long f385411m;

    /* renamed from: n, reason: collision with root package name */
    public r45.r3 f385412n;

    /* renamed from: o, reason: collision with root package name */
    public int f385413o;

    /* renamed from: p, reason: collision with root package name */
    public int f385414p;

    /* renamed from: q, reason: collision with root package name */
    public int f385415q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f385416r;

    /* renamed from: s, reason: collision with root package name */
    public int f385417s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385418t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385419u;

    /* renamed from: v, reason: collision with root package name */
    public long f385420v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f385421w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f385422x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f385423y;

    /* renamed from: z, reason: collision with root package name */
    public int f385424z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s2)) {
            return false;
        }
        r45.s2 s2Var = (r45.s2) fVar;
        return n51.f.a(this.BaseRequest, s2Var.BaseRequest) && n51.f.a(this.f385405d, s2Var.f385405d) && n51.f.a(java.lang.Integer.valueOf(this.f385406e), java.lang.Integer.valueOf(s2Var.f385406e)) && n51.f.a(this.f385407f, s2Var.f385407f) && n51.f.a(java.lang.Integer.valueOf(this.f385408g), java.lang.Integer.valueOf(s2Var.f385408g)) && n51.f.a(this.f385409h, s2Var.f385409h) && n51.f.a(this.f385410i, s2Var.f385410i) && n51.f.a(java.lang.Long.valueOf(this.f385411m), java.lang.Long.valueOf(s2Var.f385411m)) && n51.f.a(this.f385412n, s2Var.f385412n) && n51.f.a(java.lang.Integer.valueOf(this.f385413o), java.lang.Integer.valueOf(s2Var.f385413o)) && n51.f.a(java.lang.Integer.valueOf(this.f385414p), java.lang.Integer.valueOf(s2Var.f385414p)) && n51.f.a(java.lang.Integer.valueOf(this.f385415q), java.lang.Integer.valueOf(s2Var.f385415q)) && n51.f.a(this.f385416r, s2Var.f385416r) && n51.f.a(java.lang.Integer.valueOf(this.f385417s), java.lang.Integer.valueOf(s2Var.f385417s)) && n51.f.a(this.f385418t, s2Var.f385418t) && n51.f.a(this.f385419u, s2Var.f385419u) && n51.f.a(java.lang.Long.valueOf(this.f385420v), java.lang.Long.valueOf(s2Var.f385420v)) && n51.f.a(this.f385421w, s2Var.f385421w) && n51.f.a(this.f385422x, s2Var.f385422x) && n51.f.a(this.f385423y, s2Var.f385423y) && n51.f.a(java.lang.Integer.valueOf(this.f385424z), java.lang.Integer.valueOf(s2Var.f385424z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(s2Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(s2Var.B)) && n51.f.a(this.C, s2Var.C) && n51.f.a(this.D, s2Var.D) && n51.f.a(this.E, s2Var.E) && n51.f.a(this.F, s2Var.F) && n51.f.a(this.G, s2Var.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(s2Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(s2Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f385404J), java.lang.Integer.valueOf(s2Var.f385404J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(s2Var.K)) && n51.f.a(this.L, s2Var.L) && n51.f.a(this.M, s2Var.M) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(s2Var.N)) && n51.f.a(this.P, s2Var.P) && n51.f.a(this.Q, s2Var.Q) && n51.f.a(this.R, s2Var.R);
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
            java.lang.String str = this.f385405d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f385406e);
            java.lang.String str2 = this.f385407f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f385408g);
            java.lang.String str3 = this.f385409h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f385410i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.h(8, this.f385411m);
            r45.r3 r3Var = this.f385412n;
            if (r3Var != null) {
                fVar.i(9, r3Var.computeSize());
                this.f385412n.writeFields(fVar);
            }
            fVar.e(10, this.f385413o);
            fVar.e(11, this.f385414p);
            fVar.e(12, this.f385415q);
            java.lang.String str5 = this.f385416r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            fVar.e(14, this.f385417s);
            com.tencent.mm.protobuf.g gVar = this.f385418t;
            if (gVar != null) {
                fVar.b(15, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385419u;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            fVar.h(17, this.f385420v);
            java.lang.String str6 = this.f385421w;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            java.lang.String str7 = this.f385422x;
            if (str7 != null) {
                fVar.j(19, str7);
            }
            java.lang.String str8 = this.f385423y;
            if (str8 != null) {
                fVar.j(20, str8);
            }
            fVar.e(21, this.f385424z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            java.lang.String str9 = this.C;
            if (str9 != null) {
                fVar.j(24, str9);
            }
            java.lang.String str10 = this.D;
            if (str10 != null) {
                fVar.j(25, str10);
            }
            java.lang.String str11 = this.E;
            if (str11 != null) {
                fVar.j(26, str11);
            }
            java.lang.String str12 = this.F;
            if (str12 != null) {
                fVar.j(27, str12);
            }
            java.lang.String str13 = this.G;
            if (str13 != null) {
                fVar.j(28, str13);
            }
            fVar.e(29, this.H);
            fVar.e(30, this.I);
            fVar.e(31, this.f385404J);
            fVar.e(32, this.K);
            java.lang.String str14 = this.L;
            if (str14 != null) {
                fVar.j(33, str14);
            }
            java.lang.String str15 = this.M;
            if (str15 != null) {
                fVar.j(34, str15);
            }
            fVar.e(35, this.N);
            java.lang.String str16 = this.P;
            if (str16 != null) {
                fVar.j(36, str16);
            }
            r45.r2 r2Var = this.Q;
            if (r2Var != null) {
                fVar.i(37, r2Var.computeSize());
                this.Q.writeFields(fVar);
            }
            r45.q2 q2Var = this.R;
            if (q2Var != null) {
                fVar.i(38, q2Var.computeSize());
                this.R.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str17 = this.f385405d;
            if (str17 != null) {
                i18 += b36.f.j(2, str17);
            }
            int e17 = i18 + b36.f.e(3, this.f385406e);
            java.lang.String str18 = this.f385407f;
            if (str18 != null) {
                e17 += b36.f.j(4, str18);
            }
            int e18 = e17 + b36.f.e(5, this.f385408g);
            java.lang.String str19 = this.f385409h;
            if (str19 != null) {
                e18 += b36.f.j(6, str19);
            }
            java.lang.String str20 = this.f385410i;
            if (str20 != null) {
                e18 += b36.f.j(7, str20);
            }
            int h17 = e18 + b36.f.h(8, this.f385411m);
            r45.r3 r3Var2 = this.f385412n;
            if (r3Var2 != null) {
                h17 += b36.f.i(9, r3Var2.computeSize());
            }
            int e19 = h17 + b36.f.e(10, this.f385413o) + b36.f.e(11, this.f385414p) + b36.f.e(12, this.f385415q);
            java.lang.String str21 = this.f385416r;
            if (str21 != null) {
                e19 += b36.f.j(13, str21);
            }
            int e27 = e19 + b36.f.e(14, this.f385417s);
            com.tencent.mm.protobuf.g gVar3 = this.f385418t;
            if (gVar3 != null) {
                e27 += b36.f.b(15, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f385419u;
            if (gVar4 != null) {
                e27 += b36.f.b(16, gVar4);
            }
            int h18 = e27 + b36.f.h(17, this.f385420v);
            java.lang.String str22 = this.f385421w;
            if (str22 != null) {
                h18 += b36.f.j(18, str22);
            }
            java.lang.String str23 = this.f385422x;
            if (str23 != null) {
                h18 += b36.f.j(19, str23);
            }
            java.lang.String str24 = this.f385423y;
            if (str24 != null) {
                h18 += b36.f.j(20, str24);
            }
            int e28 = h18 + b36.f.e(21, this.f385424z) + b36.f.e(22, this.A) + b36.f.e(23, this.B);
            java.lang.String str25 = this.C;
            if (str25 != null) {
                e28 += b36.f.j(24, str25);
            }
            java.lang.String str26 = this.D;
            if (str26 != null) {
                e28 += b36.f.j(25, str26);
            }
            java.lang.String str27 = this.E;
            if (str27 != null) {
                e28 += b36.f.j(26, str27);
            }
            java.lang.String str28 = this.F;
            if (str28 != null) {
                e28 += b36.f.j(27, str28);
            }
            java.lang.String str29 = this.G;
            if (str29 != null) {
                e28 += b36.f.j(28, str29);
            }
            int e29 = e28 + b36.f.e(29, this.H) + b36.f.e(30, this.I) + b36.f.e(31, this.f385404J) + b36.f.e(32, this.K);
            java.lang.String str30 = this.L;
            if (str30 != null) {
                e29 += b36.f.j(33, str30);
            }
            java.lang.String str31 = this.M;
            if (str31 != null) {
                e29 += b36.f.j(34, str31);
            }
            int e37 = e29 + b36.f.e(35, this.N);
            java.lang.String str32 = this.P;
            if (str32 != null) {
                e37 += b36.f.j(36, str32);
            }
            r45.r2 r2Var2 = this.Q;
            if (r2Var2 != null) {
                e37 += b36.f.i(37, r2Var2.computeSize());
            }
            r45.q2 q2Var2 = this.R;
            return q2Var2 != null ? e37 + b36.f.i(38, q2Var2.computeSize()) : e37;
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
        r45.s2 s2Var = (r45.s2) objArr[1];
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
                    s2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                s2Var.f385405d = aVar2.k(intValue);
                return 0;
            case 3:
                s2Var.f385406e = aVar2.g(intValue);
                return 0;
            case 4:
                s2Var.f385407f = aVar2.k(intValue);
                return 0;
            case 5:
                s2Var.f385408g = aVar2.g(intValue);
                return 0;
            case 6:
                s2Var.f385409h = aVar2.k(intValue);
                return 0;
            case 7:
                s2Var.f385410i = aVar2.k(intValue);
                return 0;
            case 8:
                s2Var.f385411m = aVar2.i(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r3 r3Var3 = new r45.r3();
                    if (bArr2 != null && bArr2.length > 0) {
                        r3Var3.parseFrom(bArr2);
                    }
                    s2Var.f385412n = r3Var3;
                }
                return 0;
            case 10:
                s2Var.f385413o = aVar2.g(intValue);
                return 0;
            case 11:
                s2Var.f385414p = aVar2.g(intValue);
                return 0;
            case 12:
                s2Var.f385415q = aVar2.g(intValue);
                return 0;
            case 13:
                s2Var.f385416r = aVar2.k(intValue);
                return 0;
            case 14:
                s2Var.f385417s = aVar2.g(intValue);
                return 0;
            case 15:
                s2Var.f385418t = aVar2.d(intValue);
                return 0;
            case 16:
                s2Var.f385419u = aVar2.d(intValue);
                return 0;
            case 17:
                s2Var.f385420v = aVar2.i(intValue);
                return 0;
            case 18:
                s2Var.f385421w = aVar2.k(intValue);
                return 0;
            case 19:
                s2Var.f385422x = aVar2.k(intValue);
                return 0;
            case 20:
                s2Var.f385423y = aVar2.k(intValue);
                return 0;
            case 21:
                s2Var.f385424z = aVar2.g(intValue);
                return 0;
            case 22:
                s2Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                s2Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                s2Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                s2Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                s2Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                s2Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                s2Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                s2Var.H = aVar2.g(intValue);
                return 0;
            case 30:
                s2Var.I = aVar2.g(intValue);
                return 0;
            case 31:
                s2Var.f385404J = aVar2.g(intValue);
                return 0;
            case 32:
                s2Var.K = aVar2.g(intValue);
                return 0;
            case 33:
                s2Var.L = aVar2.k(intValue);
                return 0;
            case 34:
                s2Var.M = aVar2.k(intValue);
                return 0;
            case 35:
                s2Var.N = aVar2.g(intValue);
                return 0;
            case 36:
                s2Var.P = aVar2.k(intValue);
                return 0;
            case 37:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.r2 r2Var3 = new r45.r2();
                    if (bArr3 != null && bArr3.length > 0) {
                        r2Var3.parseFrom(bArr3);
                    }
                    s2Var.Q = r2Var3;
                }
                return 0;
            case 38:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.q2 q2Var3 = new r45.q2();
                    if (bArr4 != null && bArr4.length > 0) {
                        q2Var3.parseFrom(bArr4);
                    }
                    s2Var.R = q2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

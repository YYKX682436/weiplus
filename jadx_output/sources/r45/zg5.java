package r45;

/* loaded from: classes9.dex */
public class zg5 extends r45.js5 {
    public int A;
    public r45.na5 A1;
    public boolean B;
    public r45.na5 B1;
    public int C;
    public java.lang.String D;
    public int D1;
    public java.lang.String E;
    public r45.na5 E1;
    public java.lang.String F;
    public int F1;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f392008J;
    public java.lang.String K;
    public r45.du4 L;
    public r45.e54 M;
    public r45.e54 N;
    public java.lang.String P;
    public java.lang.String Q;
    public r45.ts0 R;
    public boolean S;
    public r45.oa5 T;
    public java.lang.String V;
    public java.lang.String W;
    public r45.du4 X;
    public r45.k64 Y;
    public r45.du4 Z;

    /* renamed from: d, reason: collision with root package name */
    public int f392009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392010e;

    /* renamed from: f, reason: collision with root package name */
    public int f392011f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392012g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392013h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392014i;

    /* renamed from: l1, reason: collision with root package name */
    public r45.c70 f392015l1;

    /* renamed from: m, reason: collision with root package name */
    public int f392016m;

    /* renamed from: o, reason: collision with root package name */
    public int f392018o;

    /* renamed from: p, reason: collision with root package name */
    public int f392019p;

    /* renamed from: p0, reason: collision with root package name */
    public r45.du4 f392020p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f392021p1;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f392023r;

    /* renamed from: s, reason: collision with root package name */
    public r45.if0 f392024s;

    /* renamed from: u, reason: collision with root package name */
    public r45.if0 f392026u;

    /* renamed from: v, reason: collision with root package name */
    public r45.pm4 f392027v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392028w;

    /* renamed from: x, reason: collision with root package name */
    public int f392029x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f392030x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f392031x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f392032y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f392033y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.ce4 f392034y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f392035z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f392036z1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f392017n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f392022q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f392025t = new java.util.LinkedList();
    public final java.util.LinkedList G = new java.util.LinkedList();
    public final java.util.LinkedList U = new java.util.LinkedList();
    public final java.util.LinkedList C1 = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zg5)) {
            return false;
        }
        r45.zg5 zg5Var = (r45.zg5) fVar;
        return n51.f.a(this.BaseResponse, zg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f392009d), java.lang.Integer.valueOf(zg5Var.f392009d)) && n51.f.a(this.f392010e, zg5Var.f392010e) && n51.f.a(java.lang.Integer.valueOf(this.f392011f), java.lang.Integer.valueOf(zg5Var.f392011f)) && n51.f.a(this.f392012g, zg5Var.f392012g) && n51.f.a(this.f392013h, zg5Var.f392013h) && n51.f.a(this.f392014i, zg5Var.f392014i) && n51.f.a(java.lang.Integer.valueOf(this.f392016m), java.lang.Integer.valueOf(zg5Var.f392016m)) && n51.f.a(this.f392017n, zg5Var.f392017n) && n51.f.a(java.lang.Integer.valueOf(this.f392018o), java.lang.Integer.valueOf(zg5Var.f392018o)) && n51.f.a(java.lang.Integer.valueOf(this.f392019p), java.lang.Integer.valueOf(zg5Var.f392019p)) && n51.f.a(this.f392022q, zg5Var.f392022q) && n51.f.a(this.f392023r, zg5Var.f392023r) && n51.f.a(this.f392024s, zg5Var.f392024s) && n51.f.a(this.f392025t, zg5Var.f392025t) && n51.f.a(this.f392026u, zg5Var.f392026u) && n51.f.a(this.f392027v, zg5Var.f392027v) && n51.f.a(this.f392028w, zg5Var.f392028w) && n51.f.a(java.lang.Integer.valueOf(this.f392029x), java.lang.Integer.valueOf(zg5Var.f392029x)) && n51.f.a(this.f392032y, zg5Var.f392032y) && n51.f.a(this.f392035z, zg5Var.f392035z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(zg5Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(zg5Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(zg5Var.C)) && n51.f.a(this.D, zg5Var.D) && n51.f.a(this.E, zg5Var.E) && n51.f.a(this.F, zg5Var.F) && n51.f.a(this.G, zg5Var.G) && n51.f.a(this.H, zg5Var.H) && n51.f.a(this.I, zg5Var.I) && n51.f.a(this.f392008J, zg5Var.f392008J) && n51.f.a(this.K, zg5Var.K) && n51.f.a(this.L, zg5Var.L) && n51.f.a(this.M, zg5Var.M) && n51.f.a(this.N, zg5Var.N) && n51.f.a(this.P, zg5Var.P) && n51.f.a(this.Q, zg5Var.Q) && n51.f.a(this.R, zg5Var.R) && n51.f.a(java.lang.Boolean.valueOf(this.S), java.lang.Boolean.valueOf(zg5Var.S)) && n51.f.a(this.T, zg5Var.T) && n51.f.a(this.U, zg5Var.U) && n51.f.a(this.V, zg5Var.V) && n51.f.a(this.W, zg5Var.W) && n51.f.a(this.X, zg5Var.X) && n51.f.a(this.Y, zg5Var.Y) && n51.f.a(this.Z, zg5Var.Z) && n51.f.a(this.f392020p0, zg5Var.f392020p0) && n51.f.a(java.lang.Boolean.valueOf(this.f392030x0), java.lang.Boolean.valueOf(zg5Var.f392030x0)) && n51.f.a(java.lang.Boolean.valueOf(this.f392033y0), java.lang.Boolean.valueOf(zg5Var.f392033y0)) && n51.f.a(this.f392015l1, zg5Var.f392015l1) && n51.f.a(this.f392021p1, zg5Var.f392021p1) && n51.f.a(java.lang.Boolean.valueOf(this.f392031x1), java.lang.Boolean.valueOf(zg5Var.f392031x1)) && n51.f.a(this.f392034y1, zg5Var.f392034y1) && n51.f.a(this.f392036z1, zg5Var.f392036z1) && n51.f.a(this.A1, zg5Var.A1) && n51.f.a(this.B1, zg5Var.B1) && n51.f.a(this.C1, zg5Var.C1) && n51.f.a(java.lang.Integer.valueOf(this.D1), java.lang.Integer.valueOf(zg5Var.D1)) && n51.f.a(this.E1, zg5Var.E1) && n51.f.a(java.lang.Integer.valueOf(this.F1), java.lang.Integer.valueOf(zg5Var.F1));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.C1;
        java.util.LinkedList linkedList2 = this.U;
        java.util.LinkedList linkedList3 = this.G;
        java.util.LinkedList linkedList4 = this.f392025t;
        java.util.LinkedList linkedList5 = this.f392022q;
        java.util.LinkedList linkedList6 = this.f392017n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f392009d);
            java.lang.String str = this.f392010e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f392011f);
            java.lang.String str2 = this.f392012g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f392013h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f392014i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.f(8, this.f392016m);
            fVar.g(9, 8, linkedList6);
            fVar.f(10, this.f392018o);
            fVar.f(11, this.f392019p);
            fVar.g(12, 8, linkedList5);
            java.lang.String str5 = this.f392023r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            r45.if0 if0Var = this.f392024s;
            if (if0Var != null) {
                fVar.i(14, if0Var.computeSize());
                this.f392024s.writeFields(fVar);
            }
            fVar.g(15, 8, linkedList4);
            r45.if0 if0Var2 = this.f392026u;
            if (if0Var2 != null) {
                fVar.i(16, if0Var2.computeSize());
                this.f392026u.writeFields(fVar);
            }
            r45.pm4 pm4Var = this.f392027v;
            if (pm4Var != null) {
                fVar.i(17, pm4Var.computeSize());
                this.f392027v.writeFields(fVar);
            }
            java.lang.String str6 = this.f392028w;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.f(19, this.f392029x);
            java.lang.String str7 = this.f392032y;
            if (str7 != null) {
                fVar.j(20, str7);
            }
            java.lang.String str8 = this.f392035z;
            if (str8 != null) {
                fVar.j(21, str8);
            }
            fVar.f(22, this.A);
            fVar.a(23, this.B);
            fVar.f(24, this.C);
            java.lang.String str9 = this.D;
            if (str9 != null) {
                fVar.j(25, str9);
            }
            java.lang.String str10 = this.E;
            if (str10 != null) {
                fVar.j(26, str10);
            }
            java.lang.String str11 = this.F;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            fVar.g(28, 8, linkedList3);
            java.lang.String str12 = this.H;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            java.lang.String str13 = this.I;
            if (str13 != null) {
                fVar.j(30, str13);
            }
            java.lang.String str14 = this.f392008J;
            if (str14 != null) {
                fVar.j(31, str14);
            }
            java.lang.String str15 = this.K;
            if (str15 != null) {
                fVar.j(32, str15);
            }
            r45.du4 du4Var = this.L;
            if (du4Var != null) {
                fVar.i(33, du4Var.computeSize());
                this.L.writeFields(fVar);
            }
            r45.e54 e54Var = this.M;
            if (e54Var != null) {
                fVar.i(34, e54Var.computeSize());
                this.M.writeFields(fVar);
            }
            r45.e54 e54Var2 = this.N;
            if (e54Var2 != null) {
                fVar.i(35, e54Var2.computeSize());
                this.N.writeFields(fVar);
            }
            java.lang.String str16 = this.P;
            if (str16 != null) {
                fVar.j(36, str16);
            }
            java.lang.String str17 = this.Q;
            if (str17 != null) {
                fVar.j(37, str17);
            }
            r45.ts0 ts0Var = this.R;
            if (ts0Var != null) {
                fVar.i(38, ts0Var.computeSize());
                this.R.writeFields(fVar);
            }
            fVar.a(39, this.S);
            r45.oa5 oa5Var = this.T;
            if (oa5Var != null) {
                fVar.i(40, oa5Var.computeSize());
                this.T.writeFields(fVar);
            }
            fVar.g(41, 8, linkedList2);
            java.lang.String str18 = this.V;
            if (str18 != null) {
                fVar.j(42, str18);
            }
            java.lang.String str19 = this.W;
            if (str19 != null) {
                fVar.j(43, str19);
            }
            r45.du4 du4Var2 = this.X;
            if (du4Var2 != null) {
                fVar.i(44, du4Var2.computeSize());
                this.X.writeFields(fVar);
            }
            r45.k64 k64Var = this.Y;
            if (k64Var != null) {
                fVar.i(45, k64Var.computeSize());
                this.Y.writeFields(fVar);
            }
            r45.du4 du4Var3 = this.Z;
            if (du4Var3 != null) {
                fVar.i(46, du4Var3.computeSize());
                this.Z.writeFields(fVar);
            }
            r45.du4 du4Var4 = this.f392020p0;
            if (du4Var4 != null) {
                fVar.i(47, du4Var4.computeSize());
                this.f392020p0.writeFields(fVar);
            }
            fVar.a(48, this.f392030x0);
            fVar.a(49, this.f392033y0);
            r45.c70 c70Var = this.f392015l1;
            if (c70Var != null) {
                fVar.i(50, c70Var.computeSize());
                this.f392015l1.writeFields(fVar);
            }
            java.lang.String str20 = this.f392021p1;
            if (str20 != null) {
                fVar.j(51, str20);
            }
            fVar.a(52, this.f392031x1);
            r45.ce4 ce4Var = this.f392034y1;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f392034y1.writeFields(fVar);
            }
            java.lang.String str21 = this.f392036z1;
            if (str21 != null) {
                fVar.j(100, str21);
            }
            r45.na5 na5Var = this.A1;
            if (na5Var != null) {
                fVar.i(101, na5Var.computeSize());
                this.A1.writeFields(fVar);
            }
            r45.na5 na5Var2 = this.B1;
            if (na5Var2 != null) {
                fVar.i(102, na5Var2.computeSize());
                this.B1.writeFields(fVar);
            }
            fVar.g(103, 8, linkedList);
            fVar.f(104, this.D1);
            r45.na5 na5Var3 = this.E1;
            if (na5Var3 != null) {
                fVar.i(105, na5Var3.computeSize());
                this.E1.writeFields(fVar);
            }
            fVar.f(106, this.F1);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f392009d);
            java.lang.String str22 = this.f392010e;
            if (str22 != null) {
                i18 += b36.f.j(3, str22);
            }
            int e17 = i18 + b36.f.e(4, this.f392011f);
            java.lang.String str23 = this.f392012g;
            if (str23 != null) {
                e17 += b36.f.j(5, str23);
            }
            java.lang.String str24 = this.f392013h;
            if (str24 != null) {
                e17 += b36.f.j(6, str24);
            }
            java.lang.String str25 = this.f392014i;
            if (str25 != null) {
                e17 += b36.f.j(7, str25);
            }
            int f17 = e17 + b36.f.f(8, this.f392016m) + b36.f.g(9, 8, linkedList6) + b36.f.f(10, this.f392018o) + b36.f.f(11, this.f392019p) + b36.f.g(12, 8, linkedList5);
            java.lang.String str26 = this.f392023r;
            if (str26 != null) {
                f17 += b36.f.j(13, str26);
            }
            r45.if0 if0Var3 = this.f392024s;
            if (if0Var3 != null) {
                f17 += b36.f.i(14, if0Var3.computeSize());
            }
            int g17 = f17 + b36.f.g(15, 8, linkedList4);
            r45.if0 if0Var4 = this.f392026u;
            if (if0Var4 != null) {
                g17 += b36.f.i(16, if0Var4.computeSize());
            }
            r45.pm4 pm4Var2 = this.f392027v;
            if (pm4Var2 != null) {
                g17 += b36.f.i(17, pm4Var2.computeSize());
            }
            java.lang.String str27 = this.f392028w;
            if (str27 != null) {
                g17 += b36.f.j(18, str27);
            }
            int f18 = g17 + b36.f.f(19, this.f392029x);
            java.lang.String str28 = this.f392032y;
            if (str28 != null) {
                f18 += b36.f.j(20, str28);
            }
            java.lang.String str29 = this.f392035z;
            if (str29 != null) {
                f18 += b36.f.j(21, str29);
            }
            int f19 = f18 + b36.f.f(22, this.A) + b36.f.a(23, this.B) + b36.f.f(24, this.C);
            java.lang.String str30 = this.D;
            if (str30 != null) {
                f19 += b36.f.j(25, str30);
            }
            java.lang.String str31 = this.E;
            if (str31 != null) {
                f19 += b36.f.j(26, str31);
            }
            java.lang.String str32 = this.F;
            if (str32 != null) {
                f19 += b36.f.j(27, str32);
            }
            int g18 = f19 + b36.f.g(28, 8, linkedList3);
            java.lang.String str33 = this.H;
            if (str33 != null) {
                g18 += b36.f.j(29, str33);
            }
            java.lang.String str34 = this.I;
            if (str34 != null) {
                g18 += b36.f.j(30, str34);
            }
            java.lang.String str35 = this.f392008J;
            if (str35 != null) {
                g18 += b36.f.j(31, str35);
            }
            java.lang.String str36 = this.K;
            if (str36 != null) {
                g18 += b36.f.j(32, str36);
            }
            r45.du4 du4Var5 = this.L;
            if (du4Var5 != null) {
                g18 += b36.f.i(33, du4Var5.computeSize());
            }
            r45.e54 e54Var3 = this.M;
            if (e54Var3 != null) {
                g18 += b36.f.i(34, e54Var3.computeSize());
            }
            r45.e54 e54Var4 = this.N;
            if (e54Var4 != null) {
                g18 += b36.f.i(35, e54Var4.computeSize());
            }
            java.lang.String str37 = this.P;
            if (str37 != null) {
                g18 += b36.f.j(36, str37);
            }
            java.lang.String str38 = this.Q;
            if (str38 != null) {
                g18 += b36.f.j(37, str38);
            }
            r45.ts0 ts0Var2 = this.R;
            if (ts0Var2 != null) {
                g18 += b36.f.i(38, ts0Var2.computeSize());
            }
            int a17 = g18 + b36.f.a(39, this.S);
            r45.oa5 oa5Var2 = this.T;
            if (oa5Var2 != null) {
                a17 += b36.f.i(40, oa5Var2.computeSize());
            }
            int g19 = a17 + b36.f.g(41, 8, linkedList2);
            java.lang.String str39 = this.V;
            if (str39 != null) {
                g19 += b36.f.j(42, str39);
            }
            java.lang.String str40 = this.W;
            if (str40 != null) {
                g19 += b36.f.j(43, str40);
            }
            r45.du4 du4Var6 = this.X;
            if (du4Var6 != null) {
                g19 += b36.f.i(44, du4Var6.computeSize());
            }
            r45.k64 k64Var2 = this.Y;
            if (k64Var2 != null) {
                g19 += b36.f.i(45, k64Var2.computeSize());
            }
            r45.du4 du4Var7 = this.Z;
            if (du4Var7 != null) {
                g19 += b36.f.i(46, du4Var7.computeSize());
            }
            r45.du4 du4Var8 = this.f392020p0;
            if (du4Var8 != null) {
                g19 += b36.f.i(47, du4Var8.computeSize());
            }
            int a18 = g19 + b36.f.a(48, this.f392030x0) + b36.f.a(49, this.f392033y0);
            r45.c70 c70Var2 = this.f392015l1;
            if (c70Var2 != null) {
                a18 += b36.f.i(50, c70Var2.computeSize());
            }
            java.lang.String str41 = this.f392021p1;
            if (str41 != null) {
                a18 += b36.f.j(51, str41);
            }
            int a19 = a18 + b36.f.a(52, this.f392031x1);
            r45.ce4 ce4Var2 = this.f392034y1;
            if (ce4Var2 != null) {
                a19 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str42 = this.f392036z1;
            if (str42 != null) {
                a19 += b36.f.j(100, str42);
            }
            r45.na5 na5Var4 = this.A1;
            if (na5Var4 != null) {
                a19 += b36.f.i(101, na5Var4.computeSize());
            }
            r45.na5 na5Var5 = this.B1;
            if (na5Var5 != null) {
                a19 += b36.f.i(102, na5Var5.computeSize());
            }
            int g27 = a19 + b36.f.g(103, 8, linkedList) + b36.f.f(104, this.D1);
            r45.na5 na5Var6 = this.E1;
            if (na5Var6 != null) {
                g27 += b36.f.i(105, na5Var6.computeSize());
            }
            return g27 + b36.f.f(106, this.F1);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.zg5 zg5Var = (r45.zg5) objArr[1];
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
                    zg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zg5Var.f392009d = aVar2.g(intValue);
                return 0;
            case 3:
                zg5Var.f392010e = aVar2.k(intValue);
                return 0;
            case 4:
                zg5Var.f392011f = aVar2.g(intValue);
                return 0;
            case 5:
                zg5Var.f392012g = aVar2.k(intValue);
                return 0;
            case 6:
                zg5Var.f392013h = aVar2.k(intValue);
                return 0;
            case 7:
                zg5Var.f392014i = aVar2.k(intValue);
                return 0;
            case 8:
                zg5Var.f392016m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.if0 if0Var5 = new r45.if0();
                    if (bArr3 != null && bArr3.length > 0) {
                        if0Var5.parseFrom(bArr3);
                    }
                    zg5Var.f392017n.add(if0Var5);
                }
                return 0;
            case 10:
                zg5Var.f392018o = aVar2.g(intValue);
                return 0;
            case 11:
                zg5Var.f392019p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.if0 if0Var6 = new r45.if0();
                    if (bArr4 != null && bArr4.length > 0) {
                        if0Var6.parseFrom(bArr4);
                    }
                    zg5Var.f392022q.add(if0Var6);
                }
                return 0;
            case 13:
                zg5Var.f392023r = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.if0 if0Var7 = new r45.if0();
                    if (bArr5 != null && bArr5.length > 0) {
                        if0Var7.parseFrom(bArr5);
                    }
                    zg5Var.f392024s = if0Var7;
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.if0 if0Var8 = new r45.if0();
                    if (bArr6 != null && bArr6.length > 0) {
                        if0Var8.parseFrom(bArr6);
                    }
                    zg5Var.f392025t.add(if0Var8);
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.if0 if0Var9 = new r45.if0();
                    if (bArr7 != null && bArr7.length > 0) {
                        if0Var9.parseFrom(bArr7);
                    }
                    zg5Var.f392026u = if0Var9;
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.pm4 pm4Var3 = new r45.pm4();
                    if (bArr8 != null && bArr8.length > 0) {
                        pm4Var3.parseFrom(bArr8);
                    }
                    zg5Var.f392027v = pm4Var3;
                }
                return 0;
            case 18:
                zg5Var.f392028w = aVar2.k(intValue);
                return 0;
            case 19:
                zg5Var.f392029x = aVar2.g(intValue);
                return 0;
            case 20:
                zg5Var.f392032y = aVar2.k(intValue);
                return 0;
            case 21:
                zg5Var.f392035z = aVar2.k(intValue);
                return 0;
            case 22:
                zg5Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                zg5Var.B = aVar2.c(intValue);
                return 0;
            case 24:
                zg5Var.C = aVar2.g(intValue);
                return 0;
            case 25:
                zg5Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                zg5Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                zg5Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.du4 du4Var9 = new r45.du4();
                    if (bArr9 != null && bArr9.length > 0) {
                        du4Var9.parseFrom(bArr9);
                    }
                    zg5Var.G.add(du4Var9);
                }
                return 0;
            case 29:
                zg5Var.H = aVar2.k(intValue);
                return 0;
            case 30:
                zg5Var.I = aVar2.k(intValue);
                return 0;
            case 31:
                zg5Var.f392008J = aVar2.k(intValue);
                return 0;
            case 32:
                zg5Var.K = aVar2.k(intValue);
                return 0;
            case 33:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.du4 du4Var10 = new r45.du4();
                    if (bArr10 != null && bArr10.length > 0) {
                        du4Var10.parseFrom(bArr10);
                    }
                    zg5Var.L = du4Var10;
                }
                return 0;
            case 34:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.e54 e54Var5 = new r45.e54();
                    if (bArr11 != null && bArr11.length > 0) {
                        e54Var5.parseFrom(bArr11);
                    }
                    zg5Var.M = e54Var5;
                }
                return 0;
            case 35:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.e54 e54Var6 = new r45.e54();
                    if (bArr12 != null && bArr12.length > 0) {
                        e54Var6.parseFrom(bArr12);
                    }
                    zg5Var.N = e54Var6;
                }
                return 0;
            case 36:
                zg5Var.P = aVar2.k(intValue);
                return 0;
            case 37:
                zg5Var.Q = aVar2.k(intValue);
                return 0;
            case 38:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.ts0 ts0Var3 = new r45.ts0();
                    if (bArr13 != null && bArr13.length > 0) {
                        ts0Var3.parseFrom(bArr13);
                    }
                    zg5Var.R = ts0Var3;
                }
                return 0;
            case 39:
                zg5Var.S = aVar2.c(intValue);
                return 0;
            case 40:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.oa5 oa5Var3 = new r45.oa5();
                    if (bArr14 != null && bArr14.length > 0) {
                        oa5Var3.parseFrom(bArr14);
                    }
                    zg5Var.T = oa5Var3;
                }
                return 0;
            case 41:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.du4 du4Var11 = new r45.du4();
                    if (bArr15 != null && bArr15.length > 0) {
                        du4Var11.parseFrom(bArr15);
                    }
                    zg5Var.U.add(du4Var11);
                }
                return 0;
            case 42:
                zg5Var.V = aVar2.k(intValue);
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                zg5Var.W = aVar2.k(intValue);
                return 0;
            case 44:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.du4 du4Var12 = new r45.du4();
                    if (bArr16 != null && bArr16.length > 0) {
                        du4Var12.parseFrom(bArr16);
                    }
                    zg5Var.X = du4Var12;
                }
                return 0;
            case 45:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr17 = (byte[]) j66.get(i68);
                    r45.k64 k64Var3 = new r45.k64();
                    if (bArr17 != null && bArr17.length > 0) {
                        k64Var3.parseFrom(bArr17);
                    }
                    zg5Var.Y = k64Var3;
                }
                return 0;
            case 46:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr18 = (byte[]) j67.get(i69);
                    r45.du4 du4Var13 = new r45.du4();
                    if (bArr18 != null && bArr18.length > 0) {
                        du4Var13.parseFrom(bArr18);
                    }
                    zg5Var.Z = du4Var13;
                }
                return 0;
            case 47:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr19 = (byte[]) j68.get(i76);
                    r45.du4 du4Var14 = new r45.du4();
                    if (bArr19 != null && bArr19.length > 0) {
                        du4Var14.parseFrom(bArr19);
                    }
                    zg5Var.f392020p0 = du4Var14;
                }
                return 0;
            case 48:
                zg5Var.f392030x0 = aVar2.c(intValue);
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                zg5Var.f392033y0 = aVar2.c(intValue);
                return 0;
            case 50:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr20 = (byte[]) j69.get(i77);
                    r45.c70 c70Var3 = new r45.c70();
                    if (bArr20 != null && bArr20.length > 0) {
                        c70Var3.parseFrom(bArr20);
                    }
                    zg5Var.f392015l1 = c70Var3;
                }
                return 0;
            case 51:
                zg5Var.f392021p1 = aVar2.k(intValue);
                return 0;
            case 52:
                zg5Var.f392031x1 = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 99:
                        java.util.LinkedList j76 = aVar2.j(intValue);
                        int size20 = j76.size();
                        for (int i78 = 0; i78 < size20; i78++) {
                            byte[] bArr21 = (byte[]) j76.get(i78);
                            r45.ce4 ce4Var3 = new r45.ce4();
                            if (bArr21 != null && bArr21.length > 0) {
                                ce4Var3.parseFrom(bArr21);
                            }
                            zg5Var.f392034y1 = ce4Var3;
                        }
                        return 0;
                    case 100:
                        zg5Var.f392036z1 = aVar2.k(intValue);
                        return 0;
                    case 101:
                        java.util.LinkedList j77 = aVar2.j(intValue);
                        int size21 = j77.size();
                        for (int i79 = 0; i79 < size21; i79++) {
                            byte[] bArr22 = (byte[]) j77.get(i79);
                            r45.na5 na5Var7 = new r45.na5();
                            if (bArr22 != null && bArr22.length > 0) {
                                na5Var7.parseFrom(bArr22);
                            }
                            zg5Var.A1 = na5Var7;
                        }
                        return 0;
                    case 102:
                        java.util.LinkedList j78 = aVar2.j(intValue);
                        int size22 = j78.size();
                        for (int i86 = 0; i86 < size22; i86++) {
                            byte[] bArr23 = (byte[]) j78.get(i86);
                            r45.na5 na5Var8 = new r45.na5();
                            if (bArr23 != null && bArr23.length > 0) {
                                na5Var8.parseFrom(bArr23);
                            }
                            zg5Var.B1 = na5Var8;
                        }
                        return 0;
                    case 103:
                        java.util.LinkedList j79 = aVar2.j(intValue);
                        int size23 = j79.size();
                        for (int i87 = 0; i87 < size23; i87++) {
                            byte[] bArr24 = (byte[]) j79.get(i87);
                            r45.k64 k64Var4 = new r45.k64();
                            if (bArr24 != null && bArr24.length > 0) {
                                k64Var4.parseFrom(bArr24);
                            }
                            zg5Var.C1.add(k64Var4);
                        }
                        return 0;
                    case 104:
                        zg5Var.D1 = aVar2.h(intValue);
                        return 0;
                    case 105:
                        java.util.LinkedList j86 = aVar2.j(intValue);
                        int size24 = j86.size();
                        for (int i88 = 0; i88 < size24; i88++) {
                            byte[] bArr25 = (byte[]) j86.get(i88);
                            r45.na5 na5Var9 = new r45.na5();
                            if (bArr25 != null && bArr25.length > 0) {
                                na5Var9.parseFrom(bArr25);
                            }
                            zg5Var.E1 = na5Var9;
                        }
                        return 0;
                    case 106:
                        zg5Var.F1 = aVar2.h(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}

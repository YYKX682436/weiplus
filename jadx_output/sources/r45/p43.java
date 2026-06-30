package r45;

/* loaded from: classes9.dex */
public class p43 extends r45.js5 {
    public r45.s43 A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f382726J;
    public java.lang.String K;
    public r45.m43 L;

    /* renamed from: f, reason: collision with root package name */
    public int f382729f;

    /* renamed from: g, reason: collision with root package name */
    public int f382730g;

    /* renamed from: h, reason: collision with root package name */
    public long f382731h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382732i;

    /* renamed from: m, reason: collision with root package name */
    public long f382733m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382734n;

    /* renamed from: o, reason: collision with root package name */
    public int f382735o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382736p;

    /* renamed from: r, reason: collision with root package name */
    public int f382738r;

    /* renamed from: s, reason: collision with root package name */
    public int f382739s;

    /* renamed from: t, reason: collision with root package name */
    public int f382740t;

    /* renamed from: u, reason: collision with root package name */
    public int f382741u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f382742v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f382743w;

    /* renamed from: x, reason: collision with root package name */
    public int f382744x;

    /* renamed from: y, reason: collision with root package name */
    public long f382745y;

    /* renamed from: d, reason: collision with root package name */
    public int f382727d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382728e = "ok";

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f382737q = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f382746z = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p43)) {
            return false;
        }
        r45.p43 p43Var = (r45.p43) fVar;
        return n51.f.a(this.BaseResponse, p43Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382727d), java.lang.Integer.valueOf(p43Var.f382727d)) && n51.f.a(this.f382728e, p43Var.f382728e) && n51.f.a(java.lang.Integer.valueOf(this.f382729f), java.lang.Integer.valueOf(p43Var.f382729f)) && n51.f.a(java.lang.Integer.valueOf(this.f382730g), java.lang.Integer.valueOf(p43Var.f382730g)) && n51.f.a(java.lang.Long.valueOf(this.f382731h), java.lang.Long.valueOf(p43Var.f382731h)) && n51.f.a(this.f382732i, p43Var.f382732i) && n51.f.a(java.lang.Long.valueOf(this.f382733m), java.lang.Long.valueOf(p43Var.f382733m)) && n51.f.a(this.f382734n, p43Var.f382734n) && n51.f.a(java.lang.Integer.valueOf(this.f382735o), java.lang.Integer.valueOf(p43Var.f382735o)) && n51.f.a(this.f382736p, p43Var.f382736p) && n51.f.a(this.f382737q, p43Var.f382737q) && n51.f.a(java.lang.Integer.valueOf(this.f382738r), java.lang.Integer.valueOf(p43Var.f382738r)) && n51.f.a(java.lang.Integer.valueOf(this.f382739s), java.lang.Integer.valueOf(p43Var.f382739s)) && n51.f.a(java.lang.Integer.valueOf(this.f382740t), java.lang.Integer.valueOf(p43Var.f382740t)) && n51.f.a(java.lang.Integer.valueOf(this.f382741u), java.lang.Integer.valueOf(p43Var.f382741u)) && n51.f.a(this.f382742v, p43Var.f382742v) && n51.f.a(this.f382743w, p43Var.f382743w) && n51.f.a(java.lang.Integer.valueOf(this.f382744x), java.lang.Integer.valueOf(p43Var.f382744x)) && n51.f.a(java.lang.Long.valueOf(this.f382745y), java.lang.Long.valueOf(p43Var.f382745y)) && n51.f.a(this.f382746z, p43Var.f382746z) && n51.f.a(this.A, p43Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(p43Var.B)) && n51.f.a(this.C, p43Var.C) && n51.f.a(this.D, p43Var.D) && n51.f.a(this.E, p43Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(p43Var.F)) && n51.f.a(this.G, p43Var.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(p43Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(p43Var.I)) && n51.f.a(this.f382726J, p43Var.f382726J) && n51.f.a(this.K, p43Var.K) && n51.f.a(this.L, p43Var.L);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382746z;
        java.util.LinkedList linkedList2 = this.f382737q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382727d);
            java.lang.String str = this.f382728e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382729f);
            fVar.e(5, this.f382730g);
            fVar.h(6, this.f382731h);
            java.lang.String str2 = this.f382732i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.h(8, this.f382733m);
            java.lang.String str3 = this.f382734n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f382735o);
            java.lang.String str4 = this.f382736p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.g(12, 8, linkedList2);
            fVar.e(13, this.f382738r);
            fVar.e(14, this.f382739s);
            fVar.e(15, this.f382740t);
            fVar.e(16, this.f382741u);
            java.lang.String str5 = this.f382742v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f382743w;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.e(19, this.f382744x);
            fVar.h(20, this.f382745y);
            fVar.g(21, 8, linkedList);
            r45.s43 s43Var = this.A;
            if (s43Var != null) {
                fVar.i(22, s43Var.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.e(23, this.B);
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(24, str7);
            }
            java.lang.String str8 = this.D;
            if (str8 != null) {
                fVar.j(25, str8);
            }
            java.lang.String str9 = this.E;
            if (str9 != null) {
                fVar.j(26, str9);
            }
            fVar.e(27, this.F);
            java.lang.String str10 = this.G;
            if (str10 != null) {
                fVar.j(28, str10);
            }
            fVar.e(29, this.H);
            fVar.e(30, this.I);
            java.lang.String str11 = this.f382726J;
            if (str11 != null) {
                fVar.j(31, str11);
            }
            java.lang.String str12 = this.K;
            if (str12 != null) {
                fVar.j(32, str12);
            }
            r45.m43 m43Var = this.L;
            if (m43Var != null) {
                fVar.i(33, m43Var.computeSize());
                this.L.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f382727d);
            java.lang.String str13 = this.f382728e;
            if (str13 != null) {
                i18 += b36.f.j(3, str13);
            }
            int e17 = i18 + b36.f.e(4, this.f382729f) + b36.f.e(5, this.f382730g) + b36.f.h(6, this.f382731h);
            java.lang.String str14 = this.f382732i;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            int h17 = e17 + b36.f.h(8, this.f382733m);
            java.lang.String str15 = this.f382734n;
            if (str15 != null) {
                h17 += b36.f.j(9, str15);
            }
            int e18 = h17 + b36.f.e(10, this.f382735o);
            java.lang.String str16 = this.f382736p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int g17 = e18 + b36.f.g(12, 8, linkedList2) + b36.f.e(13, this.f382738r) + b36.f.e(14, this.f382739s) + b36.f.e(15, this.f382740t) + b36.f.e(16, this.f382741u);
            java.lang.String str17 = this.f382742v;
            if (str17 != null) {
                g17 += b36.f.j(17, str17);
            }
            java.lang.String str18 = this.f382743w;
            if (str18 != null) {
                g17 += b36.f.j(18, str18);
            }
            int e19 = g17 + b36.f.e(19, this.f382744x) + b36.f.h(20, this.f382745y) + b36.f.g(21, 8, linkedList);
            r45.s43 s43Var2 = this.A;
            if (s43Var2 != null) {
                e19 += b36.f.i(22, s43Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(23, this.B);
            java.lang.String str19 = this.C;
            if (str19 != null) {
                e27 += b36.f.j(24, str19);
            }
            java.lang.String str20 = this.D;
            if (str20 != null) {
                e27 += b36.f.j(25, str20);
            }
            java.lang.String str21 = this.E;
            if (str21 != null) {
                e27 += b36.f.j(26, str21);
            }
            int e28 = e27 + b36.f.e(27, this.F);
            java.lang.String str22 = this.G;
            if (str22 != null) {
                e28 += b36.f.j(28, str22);
            }
            int e29 = e28 + b36.f.e(29, this.H) + b36.f.e(30, this.I);
            java.lang.String str23 = this.f382726J;
            if (str23 != null) {
                e29 += b36.f.j(31, str23);
            }
            java.lang.String str24 = this.K;
            if (str24 != null) {
                e29 += b36.f.j(32, str24);
            }
            r45.m43 m43Var2 = this.L;
            return m43Var2 != null ? e29 + b36.f.i(33, m43Var2.computeSize()) : e29;
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
        r45.p43 p43Var = (r45.p43) objArr[1];
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
                    p43Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                p43Var.f382727d = aVar2.g(intValue);
                return 0;
            case 3:
                p43Var.f382728e = aVar2.k(intValue);
                return 0;
            case 4:
                p43Var.f382729f = aVar2.g(intValue);
                return 0;
            case 5:
                p43Var.f382730g = aVar2.g(intValue);
                return 0;
            case 6:
                p43Var.f382731h = aVar2.i(intValue);
                return 0;
            case 7:
                p43Var.f382732i = aVar2.k(intValue);
                return 0;
            case 8:
                p43Var.f382733m = aVar2.i(intValue);
                return 0;
            case 9:
                p43Var.f382734n = aVar2.k(intValue);
                return 0;
            case 10:
                p43Var.f382735o = aVar2.g(intValue);
                return 0;
            case 11:
                p43Var.f382736p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s43 s43Var3 = new r45.s43();
                    if (bArr3 != null && bArr3.length > 0) {
                        s43Var3.parseFrom(bArr3);
                    }
                    p43Var.f382737q.add(s43Var3);
                }
                return 0;
            case 13:
                p43Var.f382738r = aVar2.g(intValue);
                return 0;
            case 14:
                p43Var.f382739s = aVar2.g(intValue);
                return 0;
            case 15:
                p43Var.f382740t = aVar2.g(intValue);
                return 0;
            case 16:
                p43Var.f382741u = aVar2.g(intValue);
                return 0;
            case 17:
                p43Var.f382742v = aVar2.k(intValue);
                return 0;
            case 18:
                p43Var.f382743w = aVar2.k(intValue);
                return 0;
            case 19:
                p43Var.f382744x = aVar2.g(intValue);
                return 0;
            case 20:
                p43Var.f382745y = aVar2.i(intValue);
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n43 n43Var = new r45.n43();
                    if (bArr4 != null && bArr4.length > 0) {
                        n43Var.parseFrom(bArr4);
                    }
                    p43Var.f382746z.add(n43Var);
                }
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.s43 s43Var4 = new r45.s43();
                    if (bArr5 != null && bArr5.length > 0) {
                        s43Var4.parseFrom(bArr5);
                    }
                    p43Var.A = s43Var4;
                }
                return 0;
            case 23:
                p43Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                p43Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                p43Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                p43Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                p43Var.F = aVar2.g(intValue);
                return 0;
            case 28:
                p43Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                p43Var.H = aVar2.g(intValue);
                return 0;
            case 30:
                p43Var.I = aVar2.g(intValue);
                return 0;
            case 31:
                p43Var.f382726J = aVar2.k(intValue);
                return 0;
            case 32:
                p43Var.K = aVar2.k(intValue);
                return 0;
            case 33:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.m43 m43Var3 = new r45.m43();
                    if (bArr6 != null && bArr6.length > 0) {
                        m43Var3.parseFrom(bArr6);
                    }
                    p43Var.L = m43Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

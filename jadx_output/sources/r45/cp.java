package r45;

/* loaded from: classes9.dex */
public class cp extends r45.js5 {
    public int A;
    public int B = 0;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public r45.vo I;

    /* renamed from: J, reason: collision with root package name */
    public r45.m7 f371738J;
    public r45.l7 K;
    public r45.b20 L;
    public boolean M;
    public java.lang.String N;

    /* renamed from: d, reason: collision with root package name */
    public int f371739d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371740e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371741f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371742g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v56 f371743h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371744i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371745m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371746n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371747o;

    /* renamed from: p, reason: collision with root package name */
    public int f371748p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371749q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371750r;

    /* renamed from: s, reason: collision with root package name */
    public int f371751s;

    /* renamed from: t, reason: collision with root package name */
    public int f371752t;

    /* renamed from: u, reason: collision with root package name */
    public r45.an6 f371753u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f371754v;

    /* renamed from: w, reason: collision with root package name */
    public int f371755w;

    /* renamed from: x, reason: collision with root package name */
    public int f371756x;

    /* renamed from: y, reason: collision with root package name */
    public int f371757y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371758z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cp)) {
            return false;
        }
        r45.cp cpVar = (r45.cp) fVar;
        return n51.f.a(this.BaseResponse, cpVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371739d), java.lang.Integer.valueOf(cpVar.f371739d)) && n51.f.a(this.f371740e, cpVar.f371740e) && n51.f.a(this.f371741f, cpVar.f371741f) && n51.f.a(this.f371742g, cpVar.f371742g) && n51.f.a(this.f371743h, cpVar.f371743h) && n51.f.a(this.f371744i, cpVar.f371744i) && n51.f.a(this.f371745m, cpVar.f371745m) && n51.f.a(this.f371746n, cpVar.f371746n) && n51.f.a(this.f371747o, cpVar.f371747o) && n51.f.a(java.lang.Integer.valueOf(this.f371748p), java.lang.Integer.valueOf(cpVar.f371748p)) && n51.f.a(this.f371749q, cpVar.f371749q) && n51.f.a(this.f371750r, cpVar.f371750r) && n51.f.a(java.lang.Integer.valueOf(this.f371751s), java.lang.Integer.valueOf(cpVar.f371751s)) && n51.f.a(java.lang.Integer.valueOf(this.f371752t), java.lang.Integer.valueOf(cpVar.f371752t)) && n51.f.a(this.f371753u, cpVar.f371753u) && n51.f.a(this.f371754v, cpVar.f371754v) && n51.f.a(java.lang.Integer.valueOf(this.f371755w), java.lang.Integer.valueOf(cpVar.f371755w)) && n51.f.a(java.lang.Integer.valueOf(this.f371756x), java.lang.Integer.valueOf(cpVar.f371756x)) && n51.f.a(java.lang.Integer.valueOf(this.f371757y), java.lang.Integer.valueOf(cpVar.f371757y)) && n51.f.a(this.f371758z, cpVar.f371758z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(cpVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(cpVar.B)) && n51.f.a(this.C, cpVar.C) && n51.f.a(this.D, cpVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(cpVar.E)) && n51.f.a(this.F, cpVar.F) && n51.f.a(this.G, cpVar.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(cpVar.H)) && n51.f.a(this.I, cpVar.I) && n51.f.a(this.f371738J, cpVar.f371738J) && n51.f.a(this.K, cpVar.K) && n51.f.a(this.L, cpVar.L) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(cpVar.M)) && n51.f.a(this.N, cpVar.N);
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
            fVar.e(2, this.f371739d);
            java.lang.String str = this.f371740e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371741f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371742g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.v56 v56Var = this.f371743h;
            if (v56Var != null) {
                fVar.i(6, v56Var.computeSize());
                this.f371743h.writeFields(fVar);
            }
            java.lang.String str4 = this.f371744i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f371745m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f371746n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f371747o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f371748p);
            java.lang.String str8 = this.f371749q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f371750r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.e(14, this.f371751s);
            fVar.e(15, this.f371752t);
            r45.an6 an6Var = this.f371753u;
            if (an6Var != null) {
                fVar.i(16, an6Var.computeSize());
                this.f371753u.writeFields(fVar);
            }
            java.lang.String str10 = this.f371754v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            fVar.e(18, this.f371755w);
            fVar.e(19, this.f371756x);
            fVar.e(20, this.f371757y);
            com.tencent.mm.protobuf.g gVar = this.f371758z;
            if (gVar != null) {
                fVar.b(21, gVar);
            }
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            java.lang.String str11 = this.C;
            if (str11 != null) {
                fVar.j(24, str11);
            }
            java.lang.String str12 = this.D;
            if (str12 != null) {
                fVar.j(25, str12);
            }
            fVar.e(26, this.E);
            java.lang.String str13 = this.F;
            if (str13 != null) {
                fVar.j(27, str13);
            }
            java.lang.String str14 = this.G;
            if (str14 != null) {
                fVar.j(28, str14);
            }
            fVar.e(29, this.H);
            r45.vo voVar = this.I;
            if (voVar != null) {
                fVar.i(30, voVar.computeSize());
                this.I.writeFields(fVar);
            }
            r45.m7 m7Var = this.f371738J;
            if (m7Var != null) {
                fVar.i(31, m7Var.computeSize());
                this.f371738J.writeFields(fVar);
            }
            r45.l7 l7Var = this.K;
            if (l7Var != null) {
                fVar.i(32, l7Var.computeSize());
                this.K.writeFields(fVar);
            }
            r45.b20 b20Var = this.L;
            if (b20Var != null) {
                fVar.i(33, b20Var.computeSize());
                this.L.writeFields(fVar);
            }
            fVar.a(34, this.M);
            java.lang.String str15 = this.N;
            if (str15 != null) {
                fVar.j(35, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f371739d);
            java.lang.String str16 = this.f371740e;
            if (str16 != null) {
                i18 += b36.f.j(3, str16);
            }
            java.lang.String str17 = this.f371741f;
            if (str17 != null) {
                i18 += b36.f.j(4, str17);
            }
            java.lang.String str18 = this.f371742g;
            if (str18 != null) {
                i18 += b36.f.j(5, str18);
            }
            r45.v56 v56Var2 = this.f371743h;
            if (v56Var2 != null) {
                i18 += b36.f.i(6, v56Var2.computeSize());
            }
            java.lang.String str19 = this.f371744i;
            if (str19 != null) {
                i18 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f371745m;
            if (str20 != null) {
                i18 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f371746n;
            if (str21 != null) {
                i18 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f371747o;
            if (str22 != null) {
                i18 += b36.f.j(10, str22);
            }
            int e17 = i18 + b36.f.e(11, this.f371748p);
            java.lang.String str23 = this.f371749q;
            if (str23 != null) {
                e17 += b36.f.j(12, str23);
            }
            java.lang.String str24 = this.f371750r;
            if (str24 != null) {
                e17 += b36.f.j(13, str24);
            }
            int e18 = e17 + b36.f.e(14, this.f371751s) + b36.f.e(15, this.f371752t);
            r45.an6 an6Var2 = this.f371753u;
            if (an6Var2 != null) {
                e18 += b36.f.i(16, an6Var2.computeSize());
            }
            java.lang.String str25 = this.f371754v;
            if (str25 != null) {
                e18 += b36.f.j(17, str25);
            }
            int e19 = e18 + b36.f.e(18, this.f371755w) + b36.f.e(19, this.f371756x) + b36.f.e(20, this.f371757y);
            com.tencent.mm.protobuf.g gVar2 = this.f371758z;
            if (gVar2 != null) {
                e19 += b36.f.b(21, gVar2);
            }
            int e27 = e19 + b36.f.e(22, this.A) + b36.f.e(23, this.B);
            java.lang.String str26 = this.C;
            if (str26 != null) {
                e27 += b36.f.j(24, str26);
            }
            java.lang.String str27 = this.D;
            if (str27 != null) {
                e27 += b36.f.j(25, str27);
            }
            int e28 = e27 + b36.f.e(26, this.E);
            java.lang.String str28 = this.F;
            if (str28 != null) {
                e28 += b36.f.j(27, str28);
            }
            java.lang.String str29 = this.G;
            if (str29 != null) {
                e28 += b36.f.j(28, str29);
            }
            int e29 = e28 + b36.f.e(29, this.H);
            r45.vo voVar2 = this.I;
            if (voVar2 != null) {
                e29 += b36.f.i(30, voVar2.computeSize());
            }
            r45.m7 m7Var2 = this.f371738J;
            if (m7Var2 != null) {
                e29 += b36.f.i(31, m7Var2.computeSize());
            }
            r45.l7 l7Var2 = this.K;
            if (l7Var2 != null) {
                e29 += b36.f.i(32, l7Var2.computeSize());
            }
            r45.b20 b20Var2 = this.L;
            if (b20Var2 != null) {
                e29 += b36.f.i(33, b20Var2.computeSize());
            }
            int a17 = e29 + b36.f.a(34, this.M);
            java.lang.String str30 = this.N;
            return str30 != null ? a17 + b36.f.j(35, str30) : a17;
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
        r45.cp cpVar = (r45.cp) objArr[1];
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
                    cpVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                cpVar.f371739d = aVar2.g(intValue);
                return 0;
            case 3:
                cpVar.f371740e = aVar2.k(intValue);
                return 0;
            case 4:
                cpVar.f371741f = aVar2.k(intValue);
                return 0;
            case 5:
                cpVar.f371742g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v56 v56Var3 = new r45.v56();
                    if (bArr2 != null && bArr2.length > 0) {
                        v56Var3.parseFrom(bArr2);
                    }
                    cpVar.f371743h = v56Var3;
                }
                return 0;
            case 7:
                cpVar.f371744i = aVar2.k(intValue);
                return 0;
            case 8:
                cpVar.f371745m = aVar2.k(intValue);
                return 0;
            case 9:
                cpVar.f371746n = aVar2.k(intValue);
                return 0;
            case 10:
                cpVar.f371747o = aVar2.k(intValue);
                return 0;
            case 11:
                cpVar.f371748p = aVar2.g(intValue);
                return 0;
            case 12:
                cpVar.f371749q = aVar2.k(intValue);
                return 0;
            case 13:
                cpVar.f371750r = aVar2.k(intValue);
                return 0;
            case 14:
                cpVar.f371751s = aVar2.g(intValue);
                return 0;
            case 15:
                cpVar.f371752t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr3 != null && bArr3.length > 0) {
                        an6Var3.parseFrom(bArr3);
                    }
                    cpVar.f371753u = an6Var3;
                }
                return 0;
            case 17:
                cpVar.f371754v = aVar2.k(intValue);
                return 0;
            case 18:
                cpVar.f371755w = aVar2.g(intValue);
                return 0;
            case 19:
                cpVar.f371756x = aVar2.g(intValue);
                return 0;
            case 20:
                cpVar.f371757y = aVar2.g(intValue);
                return 0;
            case 21:
                cpVar.f371758z = aVar2.d(intValue);
                return 0;
            case 22:
                cpVar.A = aVar2.g(intValue);
                return 0;
            case 23:
                cpVar.B = aVar2.g(intValue);
                return 0;
            case 24:
                cpVar.C = aVar2.k(intValue);
                return 0;
            case 25:
                cpVar.D = aVar2.k(intValue);
                return 0;
            case 26:
                cpVar.E = aVar2.g(intValue);
                return 0;
            case 27:
                cpVar.F = aVar2.k(intValue);
                return 0;
            case 28:
                cpVar.G = aVar2.k(intValue);
                return 0;
            case 29:
                cpVar.H = aVar2.g(intValue);
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vo voVar3 = new r45.vo();
                    if (bArr4 != null && bArr4.length > 0) {
                        voVar3.parseFrom(bArr4);
                    }
                    cpVar.I = voVar3;
                }
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.m7 m7Var3 = new r45.m7();
                    if (bArr5 != null && bArr5.length > 0) {
                        m7Var3.parseFrom(bArr5);
                    }
                    cpVar.f371738J = m7Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.l7 l7Var3 = new r45.l7();
                    if (bArr6 != null && bArr6.length > 0) {
                        l7Var3.parseFrom(bArr6);
                    }
                    cpVar.K = l7Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.b20 b20Var3 = new r45.b20();
                    if (bArr7 != null && bArr7.length > 0) {
                        b20Var3.parseFrom(bArr7);
                    }
                    cpVar.L = b20Var3;
                }
                return 0;
            case 34:
                cpVar.M = aVar2.c(intValue);
                return 0;
            case 35:
                cpVar.N = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

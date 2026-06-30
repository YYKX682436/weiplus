package r45;

/* loaded from: classes4.dex */
public class mj4 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public r45.vh4 B;
    public int C;
    public r45.mj4 D;
    public java.lang.String E;
    public r45.cj4 F;
    public r45.cj4 G;
    public r45.vb1 H;
    public java.lang.String I;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public int f380563d;

    /* renamed from: e, reason: collision with root package name */
    public int f380564e;

    /* renamed from: f, reason: collision with root package name */
    public int f380565f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cj4 f380566g;

    /* renamed from: h, reason: collision with root package name */
    public int f380567h;

    /* renamed from: m, reason: collision with root package name */
    public int f380569m;

    /* renamed from: n, reason: collision with root package name */
    public int f380570n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380571o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380572p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380573q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380574r;

    /* renamed from: s, reason: collision with root package name */
    public int f380575s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f380576t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f380577u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f380578v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f380579w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f380580x;

    /* renamed from: y, reason: collision with root package name */
    public int f380581y;

    /* renamed from: z, reason: collision with root package name */
    public int f380582z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f380568i = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f380562J = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj4)) {
            return false;
        }
        r45.mj4 mj4Var = (r45.mj4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380563d), java.lang.Integer.valueOf(mj4Var.f380563d)) && n51.f.a(java.lang.Integer.valueOf(this.f380564e), java.lang.Integer.valueOf(mj4Var.f380564e)) && n51.f.a(java.lang.Integer.valueOf(this.f380565f), java.lang.Integer.valueOf(mj4Var.f380565f)) && n51.f.a(this.f380566g, mj4Var.f380566g) && n51.f.a(java.lang.Integer.valueOf(this.f380567h), java.lang.Integer.valueOf(mj4Var.f380567h)) && n51.f.a(this.f380568i, mj4Var.f380568i) && n51.f.a(java.lang.Integer.valueOf(this.f380569m), java.lang.Integer.valueOf(mj4Var.f380569m)) && n51.f.a(java.lang.Integer.valueOf(this.f380570n), java.lang.Integer.valueOf(mj4Var.f380570n)) && n51.f.a(this.f380571o, mj4Var.f380571o) && n51.f.a(this.f380572p, mj4Var.f380572p) && n51.f.a(this.f380573q, mj4Var.f380573q) && n51.f.a(this.f380574r, mj4Var.f380574r) && n51.f.a(java.lang.Integer.valueOf(this.f380575s), java.lang.Integer.valueOf(mj4Var.f380575s)) && n51.f.a(this.f380576t, mj4Var.f380576t) && n51.f.a(this.f380577u, mj4Var.f380577u) && n51.f.a(this.f380578v, mj4Var.f380578v) && n51.f.a(this.f380579w, mj4Var.f380579w) && n51.f.a(this.f380580x, mj4Var.f380580x) && n51.f.a(java.lang.Integer.valueOf(this.f380581y), java.lang.Integer.valueOf(mj4Var.f380581y)) && n51.f.a(java.lang.Integer.valueOf(this.f380582z), java.lang.Integer.valueOf(mj4Var.f380582z)) && n51.f.a(this.A, mj4Var.A) && n51.f.a(this.B, mj4Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(mj4Var.C)) && n51.f.a(this.D, mj4Var.D) && n51.f.a(this.E, mj4Var.E) && n51.f.a(this.F, mj4Var.F) && n51.f.a(this.G, mj4Var.G) && n51.f.a(this.H, mj4Var.H) && n51.f.a(this.I, mj4Var.I) && n51.f.a(this.f380562J, mj4Var.f380562J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(mj4Var.K));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380562J;
        java.util.LinkedList linkedList2 = this.f380568i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380563d);
            fVar.e(2, this.f380564e);
            fVar.e(3, this.f380565f);
            r45.cj4 cj4Var = this.f380566g;
            if (cj4Var != null) {
                fVar.i(4, cj4Var.computeSize());
                this.f380566g.writeFields(fVar);
            }
            fVar.e(5, this.f380567h);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f380569m);
            fVar.e(8, this.f380570n);
            java.lang.String str = this.f380571o;
            if (str != null) {
                fVar.j(9, str);
            }
            java.lang.String str2 = this.f380572p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f380573q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f380574r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f380575s);
            java.lang.String str5 = this.f380576t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f380577u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f380578v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f380579w;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            java.lang.String str9 = this.f380580x;
            if (str9 != null) {
                fVar.j(18, str9);
            }
            fVar.e(19, this.f380581y);
            fVar.e(20, this.f380582z);
            java.lang.String str10 = this.A;
            if (str10 != null) {
                fVar.j(21, str10);
            }
            r45.vh4 vh4Var = this.B;
            if (vh4Var != null) {
                fVar.i(22, vh4Var.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.e(23, this.C);
            r45.mj4 mj4Var = this.D;
            if (mj4Var != null) {
                fVar.i(24, mj4Var.computeSize());
                this.D.writeFields(fVar);
            }
            java.lang.String str11 = this.E;
            if (str11 != null) {
                fVar.j(25, str11);
            }
            r45.cj4 cj4Var2 = this.F;
            if (cj4Var2 != null) {
                fVar.i(26, cj4Var2.computeSize());
                this.F.writeFields(fVar);
            }
            r45.cj4 cj4Var3 = this.G;
            if (cj4Var3 != null) {
                fVar.i(27, cj4Var3.computeSize());
                this.G.writeFields(fVar);
            }
            r45.vb1 vb1Var = this.H;
            if (vb1Var != null) {
                fVar.i(28, vb1Var.computeSize());
                this.H.writeFields(fVar);
            }
            java.lang.String str12 = this.I;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            fVar.g(30, 1, linkedList);
            fVar.e(31, this.K);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380563d) + 0 + b36.f.e(2, this.f380564e) + b36.f.e(3, this.f380565f);
            r45.cj4 cj4Var4 = this.f380566g;
            if (cj4Var4 != null) {
                e17 += b36.f.i(4, cj4Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f380567h) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f380569m) + b36.f.e(8, this.f380570n);
            java.lang.String str13 = this.f380571o;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f380572p;
            if (str14 != null) {
                e18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f380573q;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f380574r;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            int e19 = e18 + b36.f.e(13, this.f380575s);
            java.lang.String str17 = this.f380576t;
            if (str17 != null) {
                e19 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f380577u;
            if (str18 != null) {
                e19 += b36.f.j(15, str18);
            }
            java.lang.String str19 = this.f380578v;
            if (str19 != null) {
                e19 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f380579w;
            if (str20 != null) {
                e19 += b36.f.j(17, str20);
            }
            java.lang.String str21 = this.f380580x;
            if (str21 != null) {
                e19 += b36.f.j(18, str21);
            }
            int e27 = e19 + b36.f.e(19, this.f380581y) + b36.f.e(20, this.f380582z);
            java.lang.String str22 = this.A;
            if (str22 != null) {
                e27 += b36.f.j(21, str22);
            }
            r45.vh4 vh4Var2 = this.B;
            if (vh4Var2 != null) {
                e27 += b36.f.i(22, vh4Var2.computeSize());
            }
            int e28 = e27 + b36.f.e(23, this.C);
            r45.mj4 mj4Var2 = this.D;
            if (mj4Var2 != null) {
                e28 += b36.f.i(24, mj4Var2.computeSize());
            }
            java.lang.String str23 = this.E;
            if (str23 != null) {
                e28 += b36.f.j(25, str23);
            }
            r45.cj4 cj4Var5 = this.F;
            if (cj4Var5 != null) {
                e28 += b36.f.i(26, cj4Var5.computeSize());
            }
            r45.cj4 cj4Var6 = this.G;
            if (cj4Var6 != null) {
                e28 += b36.f.i(27, cj4Var6.computeSize());
            }
            r45.vb1 vb1Var2 = this.H;
            if (vb1Var2 != null) {
                e28 += b36.f.i(28, vb1Var2.computeSize());
            }
            java.lang.String str24 = this.I;
            if (str24 != null) {
                e28 += b36.f.j(29, str24);
            }
            return e28 + b36.f.g(30, 1, linkedList) + b36.f.e(31, this.K);
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
        r45.mj4 mj4Var3 = (r45.mj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mj4Var3.f380563d = aVar2.g(intValue);
                return 0;
            case 2:
                mj4Var3.f380564e = aVar2.g(intValue);
                return 0;
            case 3:
                mj4Var3.f380565f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.cj4 cj4Var7 = new r45.cj4();
                    if (bArr2 != null && bArr2.length > 0) {
                        cj4Var7.parseFrom(bArr2);
                    }
                    mj4Var3.f380566g = cj4Var7;
                }
                return 0;
            case 5:
                mj4Var3.f380567h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.cj4 cj4Var8 = new r45.cj4();
                    if (bArr3 != null && bArr3.length > 0) {
                        cj4Var8.parseFrom(bArr3);
                    }
                    mj4Var3.f380568i.add(cj4Var8);
                }
                return 0;
            case 7:
                mj4Var3.f380569m = aVar2.g(intValue);
                return 0;
            case 8:
                mj4Var3.f380570n = aVar2.g(intValue);
                return 0;
            case 9:
                mj4Var3.f380571o = aVar2.k(intValue);
                return 0;
            case 10:
                mj4Var3.f380572p = aVar2.k(intValue);
                return 0;
            case 11:
                mj4Var3.f380573q = aVar2.k(intValue);
                return 0;
            case 12:
                mj4Var3.f380574r = aVar2.k(intValue);
                return 0;
            case 13:
                mj4Var3.f380575s = aVar2.g(intValue);
                return 0;
            case 14:
                mj4Var3.f380576t = aVar2.k(intValue);
                return 0;
            case 15:
                mj4Var3.f380577u = aVar2.k(intValue);
                return 0;
            case 16:
                mj4Var3.f380578v = aVar2.k(intValue);
                return 0;
            case 17:
                mj4Var3.f380579w = aVar2.k(intValue);
                return 0;
            case 18:
                mj4Var3.f380580x = aVar2.k(intValue);
                return 0;
            case 19:
                mj4Var3.f380581y = aVar2.g(intValue);
                return 0;
            case 20:
                mj4Var3.f380582z = aVar2.g(intValue);
                return 0;
            case 21:
                mj4Var3.A = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.vh4 vh4Var3 = new r45.vh4();
                    if (bArr4 != null && bArr4.length > 0) {
                        vh4Var3.parseFrom(bArr4);
                    }
                    mj4Var3.B = vh4Var3;
                }
                return 0;
            case 23:
                mj4Var3.C = aVar2.g(intValue);
                return 0;
            case 24:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.mj4 mj4Var4 = new r45.mj4();
                    if (bArr5 != null && bArr5.length > 0) {
                        mj4Var4.parseFrom(bArr5);
                    }
                    mj4Var3.D = mj4Var4;
                }
                return 0;
            case 25:
                mj4Var3.E = aVar2.k(intValue);
                return 0;
            case 26:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.cj4 cj4Var9 = new r45.cj4();
                    if (bArr6 != null && bArr6.length > 0) {
                        cj4Var9.parseFrom(bArr6);
                    }
                    mj4Var3.F = cj4Var9;
                }
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cj4 cj4Var10 = new r45.cj4();
                    if (bArr7 != null && bArr7.length > 0) {
                        cj4Var10.parseFrom(bArr7);
                    }
                    mj4Var3.G = cj4Var10;
                }
                return 0;
            case 28:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.vb1 vb1Var3 = new r45.vb1();
                    if (bArr8 != null && bArr8.length > 0) {
                        vb1Var3.parseFrom(bArr8);
                    }
                    mj4Var3.H = vb1Var3;
                }
                return 0;
            case 29:
                mj4Var3.I = aVar2.k(intValue);
                return 0;
            case 30:
                mj4Var3.f380562J.add(aVar2.k(intValue));
                return 0;
            case 31:
                mj4Var3.K = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes9.dex */
public class d0 extends r45.js5 {
    public java.lang.String B;
    public int C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;
    public r45.a G;
    public java.lang.String H;

    /* renamed from: J, reason: collision with root package name */
    public r45.tw4 f371954J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371957f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371958g;

    /* renamed from: h, reason: collision with root package name */
    public int f371959h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371960i;

    /* renamed from: m, reason: collision with root package name */
    public long f371961m;

    /* renamed from: n, reason: collision with root package name */
    public int f371962n;

    /* renamed from: o, reason: collision with root package name */
    public long f371963o;

    /* renamed from: p, reason: collision with root package name */
    public int f371964p;

    /* renamed from: q, reason: collision with root package name */
    public int f371965q;

    /* renamed from: r, reason: collision with root package name */
    public int f371966r;

    /* renamed from: s, reason: collision with root package name */
    public int f371967s;

    /* renamed from: t, reason: collision with root package name */
    public int f371968t;

    /* renamed from: u, reason: collision with root package name */
    public int f371969u;

    /* renamed from: v, reason: collision with root package name */
    public long f371970v;

    /* renamed from: w, reason: collision with root package name */
    public long f371971w;

    /* renamed from: x, reason: collision with root package name */
    public long f371972x;

    /* renamed from: y, reason: collision with root package name */
    public int f371973y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f371974z;

    /* renamed from: d, reason: collision with root package name */
    public int f371955d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371956e = "请求不成功，请稍候再试";
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final java.util.LinkedList I = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d0)) {
            return false;
        }
        r45.d0 d0Var = (r45.d0) fVar;
        return n51.f.a(this.BaseResponse, d0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371955d), java.lang.Integer.valueOf(d0Var.f371955d)) && n51.f.a(this.f371956e, d0Var.f371956e) && n51.f.a(this.f371957f, d0Var.f371957f) && n51.f.a(this.f371958g, d0Var.f371958g) && n51.f.a(java.lang.Integer.valueOf(this.f371959h), java.lang.Integer.valueOf(d0Var.f371959h)) && n51.f.a(this.f371960i, d0Var.f371960i) && n51.f.a(java.lang.Long.valueOf(this.f371961m), java.lang.Long.valueOf(d0Var.f371961m)) && n51.f.a(java.lang.Integer.valueOf(this.f371962n), java.lang.Integer.valueOf(d0Var.f371962n)) && n51.f.a(java.lang.Long.valueOf(this.f371963o), java.lang.Long.valueOf(d0Var.f371963o)) && n51.f.a(java.lang.Integer.valueOf(this.f371964p), java.lang.Integer.valueOf(d0Var.f371964p)) && n51.f.a(java.lang.Integer.valueOf(this.f371965q), java.lang.Integer.valueOf(d0Var.f371965q)) && n51.f.a(java.lang.Integer.valueOf(this.f371966r), java.lang.Integer.valueOf(d0Var.f371966r)) && n51.f.a(java.lang.Integer.valueOf(this.f371967s), java.lang.Integer.valueOf(d0Var.f371967s)) && n51.f.a(java.lang.Integer.valueOf(this.f371968t), java.lang.Integer.valueOf(d0Var.f371968t)) && n51.f.a(java.lang.Integer.valueOf(this.f371969u), java.lang.Integer.valueOf(d0Var.f371969u)) && n51.f.a(java.lang.Long.valueOf(this.f371970v), java.lang.Long.valueOf(d0Var.f371970v)) && n51.f.a(java.lang.Long.valueOf(this.f371971w), java.lang.Long.valueOf(d0Var.f371971w)) && n51.f.a(java.lang.Long.valueOf(this.f371972x), java.lang.Long.valueOf(d0Var.f371972x)) && n51.f.a(java.lang.Integer.valueOf(this.f371973y), java.lang.Integer.valueOf(d0Var.f371973y)) && n51.f.a(this.f371974z, d0Var.f371974z) && n51.f.a(this.A, d0Var.A) && n51.f.a(this.B, d0Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(d0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(d0Var.D)) && n51.f.a(this.E, d0Var.E) && n51.f.a(this.F, d0Var.F) && n51.f.a(this.G, d0Var.G) && n51.f.a(this.H, d0Var.H) && n51.f.a(this.I, d0Var.I) && n51.f.a(this.f371954J, d0Var.f371954J) && n51.f.a(this.K, d0Var.K) && n51.f.a(this.L, d0Var.L) && n51.f.a(this.M, d0Var.M);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.I;
        java.util.LinkedList linkedList2 = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f371955d);
            java.lang.String str = this.f371956e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371957f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371958g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f371959h);
            java.lang.String str4 = this.f371960i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.h(8, this.f371961m);
            fVar.e(9, this.f371962n);
            fVar.h(10, this.f371963o);
            fVar.e(11, this.f371964p);
            fVar.e(12, this.f371965q);
            fVar.e(13, this.f371966r);
            fVar.e(14, this.f371967s);
            fVar.e(15, this.f371968t);
            fVar.e(16, this.f371969u);
            fVar.h(17, this.f371970v);
            fVar.h(18, this.f371971w);
            fVar.h(19, this.f371972x);
            fVar.e(20, this.f371973y);
            java.lang.String str5 = this.f371974z;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            fVar.g(22, 8, linkedList2);
            java.lang.String str6 = this.B;
            if (str6 != null) {
                fVar.j(23, str6);
            }
            fVar.e(24, this.C);
            fVar.h(25, this.D);
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(26, str7);
            }
            java.lang.String str8 = this.F;
            if (str8 != null) {
                fVar.j(27, str8);
            }
            r45.a aVar = this.G;
            if (aVar != null) {
                fVar.i(28, aVar.computeSize());
                this.G.writeFields(fVar);
            }
            java.lang.String str9 = this.H;
            if (str9 != null) {
                fVar.j(29, str9);
            }
            fVar.g(30, 8, linkedList);
            r45.tw4 tw4Var = this.f371954J;
            if (tw4Var != null) {
                fVar.i(31, tw4Var.computeSize());
                this.f371954J.writeFields(fVar);
            }
            java.lang.String str10 = this.K;
            if (str10 != null) {
                fVar.j(32, str10);
            }
            java.lang.String str11 = this.L;
            if (str11 != null) {
                fVar.j(33, str11);
            }
            java.lang.String str12 = this.M;
            if (str12 != null) {
                fVar.j(34, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f371955d);
            java.lang.String str13 = this.f371956e;
            if (str13 != null) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f371957f;
            if (str14 != null) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f371958g;
            if (str15 != null) {
                i18 += b36.f.j(5, str15);
            }
            int e17 = i18 + b36.f.e(6, this.f371959h);
            java.lang.String str16 = this.f371960i;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            int h17 = e17 + b36.f.h(8, this.f371961m) + b36.f.e(9, this.f371962n) + b36.f.h(10, this.f371963o) + b36.f.e(11, this.f371964p) + b36.f.e(12, this.f371965q) + b36.f.e(13, this.f371966r) + b36.f.e(14, this.f371967s) + b36.f.e(15, this.f371968t) + b36.f.e(16, this.f371969u) + b36.f.h(17, this.f371970v) + b36.f.h(18, this.f371971w) + b36.f.h(19, this.f371972x) + b36.f.e(20, this.f371973y);
            java.lang.String str17 = this.f371974z;
            if (str17 != null) {
                h17 += b36.f.j(21, str17);
            }
            int g17 = h17 + b36.f.g(22, 8, linkedList2);
            java.lang.String str18 = this.B;
            if (str18 != null) {
                g17 += b36.f.j(23, str18);
            }
            int e18 = g17 + b36.f.e(24, this.C) + b36.f.h(25, this.D);
            java.lang.String str19 = this.E;
            if (str19 != null) {
                e18 += b36.f.j(26, str19);
            }
            java.lang.String str20 = this.F;
            if (str20 != null) {
                e18 += b36.f.j(27, str20);
            }
            r45.a aVar2 = this.G;
            if (aVar2 != null) {
                e18 += b36.f.i(28, aVar2.computeSize());
            }
            java.lang.String str21 = this.H;
            if (str21 != null) {
                e18 += b36.f.j(29, str21);
            }
            int g18 = e18 + b36.f.g(30, 8, linkedList);
            r45.tw4 tw4Var2 = this.f371954J;
            if (tw4Var2 != null) {
                g18 += b36.f.i(31, tw4Var2.computeSize());
            }
            java.lang.String str22 = this.K;
            if (str22 != null) {
                g18 += b36.f.j(32, str22);
            }
            java.lang.String str23 = this.L;
            if (str23 != null) {
                g18 += b36.f.j(33, str23);
            }
            java.lang.String str24 = this.M;
            return str24 != null ? g18 + b36.f.j(34, str24) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.d0 d0Var = (r45.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    d0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                d0Var.f371955d = aVar4.g(intValue);
                return 0;
            case 3:
                d0Var.f371956e = aVar4.k(intValue);
                return 0;
            case 4:
                d0Var.f371957f = aVar4.k(intValue);
                return 0;
            case 5:
                d0Var.f371958g = aVar4.k(intValue);
                return 0;
            case 6:
                d0Var.f371959h = aVar4.g(intValue);
                return 0;
            case 7:
                d0Var.f371960i = aVar4.k(intValue);
                return 0;
            case 8:
                d0Var.f371961m = aVar4.i(intValue);
                return 0;
            case 9:
                d0Var.f371962n = aVar4.g(intValue);
                return 0;
            case 10:
                d0Var.f371963o = aVar4.i(intValue);
                return 0;
            case 11:
                d0Var.f371964p = aVar4.g(intValue);
                return 0;
            case 12:
                d0Var.f371965q = aVar4.g(intValue);
                return 0;
            case 13:
                d0Var.f371966r = aVar4.g(intValue);
                return 0;
            case 14:
                d0Var.f371967s = aVar4.g(intValue);
                return 0;
            case 15:
                d0Var.f371968t = aVar4.g(intValue);
                return 0;
            case 16:
                d0Var.f371969u = aVar4.g(intValue);
                return 0;
            case 17:
                d0Var.f371970v = aVar4.i(intValue);
                return 0;
            case 18:
                d0Var.f371971w = aVar4.i(intValue);
                return 0;
            case 19:
                d0Var.f371972x = aVar4.i(intValue);
                return 0;
            case 20:
                d0Var.f371973y = aVar4.g(intValue);
                return 0;
            case 21:
                d0Var.f371974z = aVar4.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.a0 a0Var = new r45.a0();
                    if (bArr3 != null && bArr3.length > 0) {
                        a0Var.parseFrom(bArr3);
                    }
                    d0Var.A.add(a0Var);
                }
                return 0;
            case 23:
                d0Var.B = aVar4.k(intValue);
                return 0;
            case 24:
                d0Var.C = aVar4.g(intValue);
                return 0;
            case 25:
                d0Var.D = aVar4.i(intValue);
                return 0;
            case 26:
                d0Var.E = aVar4.k(intValue);
                return 0;
            case 27:
                d0Var.F = aVar4.k(intValue);
                return 0;
            case 28:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.parseFrom(bArr4);
                    }
                    d0Var.G = aVar5;
                }
                return 0;
            case 29:
                d0Var.H = aVar4.k(intValue);
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.h0 h0Var = new r45.h0();
                    if (bArr5 != null && bArr5.length > 0) {
                        h0Var.parseFrom(bArr5);
                    }
                    d0Var.I.add(h0Var);
                }
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr6 != null && bArr6.length > 0) {
                        tw4Var3.parseFrom(bArr6);
                    }
                    d0Var.f371954J = tw4Var3;
                }
                return 0;
            case 32:
                d0Var.K = aVar4.k(intValue);
                return 0;
            case 33:
                d0Var.L = aVar4.k(intValue);
                return 0;
            case 34:
                d0Var.M = aVar4.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes11.dex */
public class gw5 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public r45.va0 C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f375561d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f375562e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f375563f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f375564g;

    /* renamed from: h, reason: collision with root package name */
    public int f375565h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f375566i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375567m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375568n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375569o;

    /* renamed from: p, reason: collision with root package name */
    public int f375570p;

    /* renamed from: q, reason: collision with root package name */
    public int f375571q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f375572r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f375573s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f375574t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f375575u;

    /* renamed from: v, reason: collision with root package name */
    public int f375576v;

    /* renamed from: w, reason: collision with root package name */
    public int f375577w;

    /* renamed from: x, reason: collision with root package name */
    public int f375578x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f375579y;

    /* renamed from: z, reason: collision with root package name */
    public r45.cb6 f375580z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gw5)) {
            return false;
        }
        r45.gw5 gw5Var = (r45.gw5) fVar;
        return n51.f.a(this.f375561d, gw5Var.f375561d) && n51.f.a(this.f375562e, gw5Var.f375562e) && n51.f.a(this.f375563f, gw5Var.f375563f) && n51.f.a(this.f375564g, gw5Var.f375564g) && n51.f.a(java.lang.Integer.valueOf(this.f375565h), java.lang.Integer.valueOf(gw5Var.f375565h)) && n51.f.a(this.f375566i, gw5Var.f375566i) && n51.f.a(this.f375567m, gw5Var.f375567m) && n51.f.a(this.f375568n, gw5Var.f375568n) && n51.f.a(this.f375569o, gw5Var.f375569o) && n51.f.a(java.lang.Integer.valueOf(this.f375570p), java.lang.Integer.valueOf(gw5Var.f375570p)) && n51.f.a(java.lang.Integer.valueOf(this.f375571q), java.lang.Integer.valueOf(gw5Var.f375571q)) && n51.f.a(this.f375572r, gw5Var.f375572r) && n51.f.a(this.f375573s, gw5Var.f375573s) && n51.f.a(this.f375574t, gw5Var.f375574t) && n51.f.a(this.f375575u, gw5Var.f375575u) && n51.f.a(java.lang.Integer.valueOf(this.f375576v), java.lang.Integer.valueOf(gw5Var.f375576v)) && n51.f.a(java.lang.Integer.valueOf(this.f375577w), java.lang.Integer.valueOf(gw5Var.f375577w)) && n51.f.a(java.lang.Integer.valueOf(this.f375578x), java.lang.Integer.valueOf(gw5Var.f375578x)) && n51.f.a(this.f375579y, gw5Var.f375579y) && n51.f.a(this.f375580z, gw5Var.f375580z) && n51.f.a(this.A, gw5Var.A) && n51.f.a(this.B, gw5Var.B) && n51.f.a(this.C, gw5Var.C) && n51.f.a(this.D, gw5Var.D) && n51.f.a(this.E, gw5Var.E) && n51.f.a(this.F, gw5Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(gw5Var.G));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f375561d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f375561d.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f375562e;
            if (du5Var2 != null) {
                fVar.i(2, du5Var2.computeSize());
                this.f375562e.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f375563f;
            if (du5Var3 != null) {
                fVar.i(3, du5Var3.computeSize());
                this.f375563f.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f375564g;
            if (du5Var4 != null) {
                fVar.i(4, du5Var4.computeSize());
                this.f375564g.writeFields(fVar);
            }
            fVar.e(5, this.f375565h);
            r45.cu5 cu5Var = this.f375566i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f375566i.writeFields(fVar);
            }
            java.lang.String str = this.f375567m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f375568n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f375569o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f375570p);
            fVar.e(11, this.f375571q);
            java.lang.String str4 = this.f375572r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f375573s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f375574t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f375575u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            fVar.e(16, this.f375576v);
            fVar.e(17, this.f375577w);
            fVar.e(18, this.f375578x);
            java.lang.String str8 = this.f375579y;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            r45.cb6 cb6Var = this.f375580z;
            if (cb6Var != null) {
                fVar.i(20, cb6Var.computeSize());
                this.f375580z.writeFields(fVar);
            }
            java.lang.String str9 = this.A;
            if (str9 != null) {
                fVar.j(21, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null) {
                fVar.j(22, str10);
            }
            r45.va0 va0Var = this.C;
            if (va0Var != null) {
                fVar.i(23, va0Var.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str11 = this.D;
            if (str11 != null) {
                fVar.j(24, str11);
            }
            java.lang.String str12 = this.E;
            if (str12 != null) {
                fVar.j(25, str12);
            }
            java.lang.String str13 = this.F;
            if (str13 != null) {
                fVar.j(26, str13);
            }
            fVar.e(27, this.G);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var5 = this.f375561d;
            int i18 = du5Var5 != null ? b36.f.i(1, du5Var5.computeSize()) + 0 : 0;
            r45.du5 du5Var6 = this.f375562e;
            if (du5Var6 != null) {
                i18 += b36.f.i(2, du5Var6.computeSize());
            }
            r45.du5 du5Var7 = this.f375563f;
            if (du5Var7 != null) {
                i18 += b36.f.i(3, du5Var7.computeSize());
            }
            r45.du5 du5Var8 = this.f375564g;
            if (du5Var8 != null) {
                i18 += b36.f.i(4, du5Var8.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f375565h);
            r45.cu5 cu5Var2 = this.f375566i;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.computeSize());
            }
            java.lang.String str14 = this.f375567m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f375568n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f375569o;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            int e18 = e17 + b36.f.e(10, this.f375570p) + b36.f.e(11, this.f375571q);
            java.lang.String str17 = this.f375572r;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f375573s;
            if (str18 != null) {
                e18 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f375574t;
            if (str19 != null) {
                e18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f375575u;
            if (str20 != null) {
                e18 += b36.f.j(15, str20);
            }
            int e19 = e18 + b36.f.e(16, this.f375576v) + b36.f.e(17, this.f375577w) + b36.f.e(18, this.f375578x);
            java.lang.String str21 = this.f375579y;
            if (str21 != null) {
                e19 += b36.f.j(19, str21);
            }
            r45.cb6 cb6Var2 = this.f375580z;
            if (cb6Var2 != null) {
                e19 += b36.f.i(20, cb6Var2.computeSize());
            }
            java.lang.String str22 = this.A;
            if (str22 != null) {
                e19 += b36.f.j(21, str22);
            }
            java.lang.String str23 = this.B;
            if (str23 != null) {
                e19 += b36.f.j(22, str23);
            }
            r45.va0 va0Var2 = this.C;
            if (va0Var2 != null) {
                e19 += b36.f.i(23, va0Var2.computeSize());
            }
            java.lang.String str24 = this.D;
            if (str24 != null) {
                e19 += b36.f.j(24, str24);
            }
            java.lang.String str25 = this.E;
            if (str25 != null) {
                e19 += b36.f.j(25, str25);
            }
            java.lang.String str26 = this.F;
            if (str26 != null) {
                e19 += b36.f.j(26, str26);
            }
            return e19 + b36.f.e(27, this.G);
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
        r45.gw5 gw5Var = (r45.gw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var9.b(bArr);
                    }
                    gw5Var.f375561d = du5Var9;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var10.b(bArr2);
                    }
                    gw5Var.f375562e = du5Var10;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var11 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var11.b(bArr3);
                    }
                    gw5Var.f375563f = du5Var11;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var12 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var12.b(bArr4);
                    }
                    gw5Var.f375564g = du5Var12;
                }
                return 0;
            case 5:
                gw5Var.f375565h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var3.b(bArr5);
                    }
                    gw5Var.f375566i = cu5Var3;
                }
                return 0;
            case 7:
                gw5Var.f375567m = aVar2.k(intValue);
                return 0;
            case 8:
                gw5Var.f375568n = aVar2.k(intValue);
                return 0;
            case 9:
                gw5Var.f375569o = aVar2.k(intValue);
                return 0;
            case 10:
                gw5Var.f375570p = aVar2.g(intValue);
                return 0;
            case 11:
                gw5Var.f375571q = aVar2.g(intValue);
                return 0;
            case 12:
                gw5Var.f375572r = aVar2.k(intValue);
                return 0;
            case 13:
                gw5Var.f375573s = aVar2.k(intValue);
                return 0;
            case 14:
                gw5Var.f375574t = aVar2.k(intValue);
                return 0;
            case 15:
                gw5Var.f375575u = aVar2.k(intValue);
                return 0;
            case 16:
                gw5Var.f375576v = aVar2.g(intValue);
                return 0;
            case 17:
                gw5Var.f375577w = aVar2.g(intValue);
                return 0;
            case 18:
                gw5Var.f375578x = aVar2.g(intValue);
                return 0;
            case 19:
                gw5Var.f375579y = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr6 != null && bArr6.length > 0) {
                        cb6Var3.parseFrom(bArr6);
                    }
                    gw5Var.f375580z = cb6Var3;
                }
                return 0;
            case 21:
                gw5Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                gw5Var.B = aVar2.k(intValue);
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr7 != null && bArr7.length > 0) {
                        va0Var3.parseFrom(bArr7);
                    }
                    gw5Var.C = va0Var3;
                }
                return 0;
            case 24:
                gw5Var.D = aVar2.k(intValue);
                return 0;
            case 25:
                gw5Var.E = aVar2.k(intValue);
                return 0;
            case 26:
                gw5Var.F = aVar2.k(intValue);
                return 0;
            case 27:
                gw5Var.G = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

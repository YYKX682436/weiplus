package r45;

/* loaded from: classes11.dex */
public class nn4 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public r45.cb6 F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f381530J;
    public r45.va0 K;

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f381531d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f381532e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f381533f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f381534g;

    /* renamed from: h, reason: collision with root package name */
    public int f381535h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f381536i;

    /* renamed from: m, reason: collision with root package name */
    public int f381537m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f381538n;

    /* renamed from: o, reason: collision with root package name */
    public r45.du5 f381539o;

    /* renamed from: p, reason: collision with root package name */
    public r45.du5 f381540p;

    /* renamed from: q, reason: collision with root package name */
    public int f381541q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381542r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381543s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381544t;

    /* renamed from: u, reason: collision with root package name */
    public int f381545u;

    /* renamed from: v, reason: collision with root package name */
    public int f381546v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f381547w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f381548x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f381549y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f381550z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nn4)) {
            return false;
        }
        r45.nn4 nn4Var = (r45.nn4) fVar;
        return n51.f.a(this.f381531d, nn4Var.f381531d) && n51.f.a(this.f381532e, nn4Var.f381532e) && n51.f.a(this.f381533f, nn4Var.f381533f) && n51.f.a(this.f381534g, nn4Var.f381534g) && n51.f.a(java.lang.Integer.valueOf(this.f381535h), java.lang.Integer.valueOf(nn4Var.f381535h)) && n51.f.a(this.f381536i, nn4Var.f381536i) && n51.f.a(java.lang.Integer.valueOf(this.f381537m), java.lang.Integer.valueOf(nn4Var.f381537m)) && n51.f.a(this.f381538n, nn4Var.f381538n) && n51.f.a(this.f381539o, nn4Var.f381539o) && n51.f.a(this.f381540p, nn4Var.f381540p) && n51.f.a(java.lang.Integer.valueOf(this.f381541q), java.lang.Integer.valueOf(nn4Var.f381541q)) && n51.f.a(this.f381542r, nn4Var.f381542r) && n51.f.a(this.f381543s, nn4Var.f381543s) && n51.f.a(this.f381544t, nn4Var.f381544t) && n51.f.a(java.lang.Integer.valueOf(this.f381545u), java.lang.Integer.valueOf(nn4Var.f381545u)) && n51.f.a(java.lang.Integer.valueOf(this.f381546v), java.lang.Integer.valueOf(nn4Var.f381546v)) && n51.f.a(this.f381547w, nn4Var.f381547w) && n51.f.a(this.f381548x, nn4Var.f381548x) && n51.f.a(this.f381549y, nn4Var.f381549y) && n51.f.a(this.f381550z, nn4Var.f381550z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(nn4Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(nn4Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(nn4Var.C)) && n51.f.a(this.D, nn4Var.D) && n51.f.a(this.E, nn4Var.E) && n51.f.a(this.F, nn4Var.F) && n51.f.a(this.G, nn4Var.G) && n51.f.a(this.H, nn4Var.H) && n51.f.a(this.I, nn4Var.I) && n51.f.a(this.f381530J, nn4Var.f381530J) && n51.f.a(this.K, nn4Var.K);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f381531d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f381531d.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f381532e;
            if (du5Var2 != null) {
                fVar.i(2, du5Var2.computeSize());
                this.f381532e.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f381533f;
            if (du5Var3 != null) {
                fVar.i(3, du5Var3.computeSize());
                this.f381533f.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f381534g;
            if (du5Var4 != null) {
                fVar.i(4, du5Var4.computeSize());
                this.f381534g.writeFields(fVar);
            }
            fVar.e(5, this.f381535h);
            r45.cu5 cu5Var = this.f381536i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f381536i.writeFields(fVar);
            }
            fVar.e(7, this.f381537m);
            r45.du5 du5Var5 = this.f381538n;
            if (du5Var5 != null) {
                fVar.i(8, du5Var5.computeSize());
                this.f381538n.writeFields(fVar);
            }
            r45.du5 du5Var6 = this.f381539o;
            if (du5Var6 != null) {
                fVar.i(9, du5Var6.computeSize());
                this.f381539o.writeFields(fVar);
            }
            r45.du5 du5Var7 = this.f381540p;
            if (du5Var7 != null) {
                fVar.i(10, du5Var7.computeSize());
                this.f381540p.writeFields(fVar);
            }
            fVar.e(11, this.f381541q);
            java.lang.String str = this.f381542r;
            if (str != null) {
                fVar.j(12, str);
            }
            java.lang.String str2 = this.f381543s;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f381544t;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            fVar.e(15, this.f381545u);
            fVar.e(16, this.f381546v);
            java.lang.String str4 = this.f381547w;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            java.lang.String str5 = this.f381548x;
            if (str5 != null) {
                fVar.j(18, str5);
            }
            java.lang.String str6 = this.f381549y;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            java.lang.String str7 = this.f381550z;
            if (str7 != null) {
                fVar.j(20, str7);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            fVar.e(23, this.C);
            java.lang.String str8 = this.D;
            if (str8 != null) {
                fVar.j(24, str8);
            }
            java.lang.String str9 = this.E;
            if (str9 != null) {
                fVar.j(25, str9);
            }
            r45.cb6 cb6Var = this.F;
            if (cb6Var != null) {
                fVar.i(26, cb6Var.computeSize());
                this.F.writeFields(fVar);
            }
            java.lang.String str10 = this.G;
            if (str10 != null) {
                fVar.j(27, str10);
            }
            java.lang.String str11 = this.H;
            if (str11 != null) {
                fVar.j(28, str11);
            }
            java.lang.String str12 = this.I;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            java.lang.String str13 = this.f381530J;
            if (str13 != null) {
                fVar.j(30, str13);
            }
            r45.va0 va0Var = this.K;
            if (va0Var != null) {
                fVar.i(31, va0Var.computeSize());
                this.K.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var8 = this.f381531d;
            int i18 = du5Var8 != null ? b36.f.i(1, du5Var8.computeSize()) + 0 : 0;
            r45.du5 du5Var9 = this.f381532e;
            if (du5Var9 != null) {
                i18 += b36.f.i(2, du5Var9.computeSize());
            }
            r45.du5 du5Var10 = this.f381533f;
            if (du5Var10 != null) {
                i18 += b36.f.i(3, du5Var10.computeSize());
            }
            r45.du5 du5Var11 = this.f381534g;
            if (du5Var11 != null) {
                i18 += b36.f.i(4, du5Var11.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f381535h);
            r45.cu5 cu5Var2 = this.f381536i;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f381537m);
            r45.du5 du5Var12 = this.f381538n;
            if (du5Var12 != null) {
                e18 += b36.f.i(8, du5Var12.computeSize());
            }
            r45.du5 du5Var13 = this.f381539o;
            if (du5Var13 != null) {
                e18 += b36.f.i(9, du5Var13.computeSize());
            }
            r45.du5 du5Var14 = this.f381540p;
            if (du5Var14 != null) {
                e18 += b36.f.i(10, du5Var14.computeSize());
            }
            int e19 = e18 + b36.f.e(11, this.f381541q);
            java.lang.String str14 = this.f381542r;
            if (str14 != null) {
                e19 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f381543s;
            if (str15 != null) {
                e19 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f381544t;
            if (str16 != null) {
                e19 += b36.f.j(14, str16);
            }
            int e27 = e19 + b36.f.e(15, this.f381545u) + b36.f.e(16, this.f381546v);
            java.lang.String str17 = this.f381547w;
            if (str17 != null) {
                e27 += b36.f.j(17, str17);
            }
            java.lang.String str18 = this.f381548x;
            if (str18 != null) {
                e27 += b36.f.j(18, str18);
            }
            java.lang.String str19 = this.f381549y;
            if (str19 != null) {
                e27 += b36.f.j(19, str19);
            }
            java.lang.String str20 = this.f381550z;
            if (str20 != null) {
                e27 += b36.f.j(20, str20);
            }
            int e28 = e27 + b36.f.e(21, this.A) + b36.f.e(22, this.B) + b36.f.e(23, this.C);
            java.lang.String str21 = this.D;
            if (str21 != null) {
                e28 += b36.f.j(24, str21);
            }
            java.lang.String str22 = this.E;
            if (str22 != null) {
                e28 += b36.f.j(25, str22);
            }
            r45.cb6 cb6Var2 = this.F;
            if (cb6Var2 != null) {
                e28 += b36.f.i(26, cb6Var2.computeSize());
            }
            java.lang.String str23 = this.G;
            if (str23 != null) {
                e28 += b36.f.j(27, str23);
            }
            java.lang.String str24 = this.H;
            if (str24 != null) {
                e28 += b36.f.j(28, str24);
            }
            java.lang.String str25 = this.I;
            if (str25 != null) {
                e28 += b36.f.j(29, str25);
            }
            java.lang.String str26 = this.f381530J;
            if (str26 != null) {
                e28 += b36.f.j(30, str26);
            }
            r45.va0 va0Var2 = this.K;
            return va0Var2 != null ? e28 + b36.f.i(31, va0Var2.computeSize()) : e28;
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
        r45.nn4 nn4Var = (r45.nn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var15 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var15.b(bArr);
                    }
                    nn4Var.f381531d = du5Var15;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var16 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var16.b(bArr2);
                    }
                    nn4Var.f381532e = du5Var16;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var17 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var17.b(bArr3);
                    }
                    nn4Var.f381533f = du5Var17;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var18 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var18.b(bArr4);
                    }
                    nn4Var.f381534g = du5Var18;
                }
                return 0;
            case 5:
                nn4Var.f381535h = aVar2.g(intValue);
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
                    nn4Var.f381536i = cu5Var3;
                }
                return 0;
            case 7:
                nn4Var.f381537m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.du5 du5Var19 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var19.b(bArr6);
                    }
                    nn4Var.f381538n = du5Var19;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.du5 du5Var20 = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var20.b(bArr7);
                    }
                    nn4Var.f381539o = du5Var20;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.du5 du5Var21 = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var21.b(bArr8);
                    }
                    nn4Var.f381540p = du5Var21;
                }
                return 0;
            case 11:
                nn4Var.f381541q = aVar2.g(intValue);
                return 0;
            case 12:
                nn4Var.f381542r = aVar2.k(intValue);
                return 0;
            case 13:
                nn4Var.f381543s = aVar2.k(intValue);
                return 0;
            case 14:
                nn4Var.f381544t = aVar2.k(intValue);
                return 0;
            case 15:
                nn4Var.f381545u = aVar2.g(intValue);
                return 0;
            case 16:
                nn4Var.f381546v = aVar2.g(intValue);
                return 0;
            case 17:
                nn4Var.f381547w = aVar2.k(intValue);
                return 0;
            case 18:
                nn4Var.f381548x = aVar2.k(intValue);
                return 0;
            case 19:
                nn4Var.f381549y = aVar2.k(intValue);
                return 0;
            case 20:
                nn4Var.f381550z = aVar2.k(intValue);
                return 0;
            case 21:
                nn4Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                nn4Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                nn4Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                nn4Var.D = aVar2.k(intValue);
                return 0;
            case 25:
                nn4Var.E = aVar2.k(intValue);
                return 0;
            case 26:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr9 != null && bArr9.length > 0) {
                        cb6Var3.parseFrom(bArr9);
                    }
                    nn4Var.F = cb6Var3;
                }
                return 0;
            case 27:
                nn4Var.G = aVar2.k(intValue);
                return 0;
            case 28:
                nn4Var.H = aVar2.k(intValue);
                return 0;
            case 29:
                nn4Var.I = aVar2.k(intValue);
                return 0;
            case 30:
                nn4Var.f381530J = aVar2.k(intValue);
                return 0;
            case 31:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr10 != null && bArr10.length > 0) {
                        va0Var3.parseFrom(bArr10);
                    }
                    nn4Var.K = va0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

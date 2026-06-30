package r45;

/* loaded from: classes12.dex */
public class zj0 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public java.lang.String C;
    public r45.tj0 D;
    public final java.util.LinkedList E = new java.util.LinkedList();
    public int F;
    public r45.xj0 G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392129e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392130f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392131g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392132h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392133i;

    /* renamed from: m, reason: collision with root package name */
    public int f392134m;

    /* renamed from: n, reason: collision with root package name */
    public int f392135n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392136o;

    /* renamed from: p, reason: collision with root package name */
    public int f392137p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f392138q;

    /* renamed from: r, reason: collision with root package name */
    public int f392139r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f392140s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f392141t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392142u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f392143v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392144w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f392145x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f392146y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f392147z;

    static {
        new r45.zj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.zj0 parseFrom(byte[] bArr) {
        return (r45.zj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zj0)) {
            return false;
        }
        r45.zj0 zj0Var = (r45.zj0) fVar;
        return n51.f.a(this.f392128d, zj0Var.f392128d) && n51.f.a(this.f392129e, zj0Var.f392129e) && n51.f.a(this.f392130f, zj0Var.f392130f) && n51.f.a(this.f392131g, zj0Var.f392131g) && n51.f.a(this.f392132h, zj0Var.f392132h) && n51.f.a(this.f392133i, zj0Var.f392133i) && n51.f.a(java.lang.Integer.valueOf(this.f392134m), java.lang.Integer.valueOf(zj0Var.f392134m)) && n51.f.a(java.lang.Integer.valueOf(this.f392135n), java.lang.Integer.valueOf(zj0Var.f392135n)) && n51.f.a(this.f392136o, zj0Var.f392136o) && n51.f.a(java.lang.Integer.valueOf(this.f392137p), java.lang.Integer.valueOf(zj0Var.f392137p)) && n51.f.a(this.f392138q, zj0Var.f392138q) && n51.f.a(java.lang.Integer.valueOf(this.f392139r), java.lang.Integer.valueOf(zj0Var.f392139r)) && n51.f.a(this.f392140s, zj0Var.f392140s) && n51.f.a(this.f392141t, zj0Var.f392141t) && n51.f.a(this.f392142u, zj0Var.f392142u) && n51.f.a(this.f392143v, zj0Var.f392143v) && n51.f.a(this.f392144w, zj0Var.f392144w) && n51.f.a(this.f392145x, zj0Var.f392145x) && n51.f.a(this.f392146y, zj0Var.f392146y) && n51.f.a(this.f392147z, zj0Var.f392147z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(zj0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(zj0Var.B)) && n51.f.a(this.C, zj0Var.C) && n51.f.a(this.D, zj0Var.D) && n51.f.a(this.E, zj0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(zj0Var.F)) && n51.f.a(this.G, zj0Var.G);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.zj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392128d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392129e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f392130f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f392131g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f392132h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f392133i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f392134m);
            fVar.e(8, this.f392135n);
            java.lang.String str7 = this.f392136o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f392137p);
            java.lang.String str8 = this.f392138q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f392139r);
            java.lang.String str9 = this.f392140s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f392141t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f392142u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f392143v;
            if (str12 != null) {
                fVar.j(16, str12);
            }
            java.lang.String str13 = this.f392144w;
            if (str13 != null) {
                fVar.j(17, str13);
            }
            java.lang.String str14 = this.f392145x;
            if (str14 != null) {
                fVar.j(18, str14);
            }
            java.lang.String str15 = this.f392146y;
            if (str15 != null) {
                fVar.j(19, str15);
            }
            java.lang.String str16 = this.f392147z;
            if (str16 != null) {
                fVar.j(20, str16);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            java.lang.String str17 = this.C;
            if (str17 != null) {
                fVar.j(23, str17);
            }
            r45.tj0 tj0Var = this.D;
            if (tj0Var != null) {
                fVar.i(24, tj0Var.computeSize());
                this.D.writeFields(fVar);
            }
            fVar.g(25, 8, linkedList);
            fVar.e(26, this.F);
            r45.xj0 xj0Var = this.G;
            if (xj0Var != null) {
                fVar.i(27, xj0Var.computeSize());
                this.G.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str18 = this.f392128d;
            int j17 = str18 != null ? b36.f.j(1, str18) + 0 : 0;
            java.lang.String str19 = this.f392129e;
            if (str19 != null) {
                j17 += b36.f.j(2, str19);
            }
            java.lang.String str20 = this.f392130f;
            if (str20 != null) {
                j17 += b36.f.j(3, str20);
            }
            java.lang.String str21 = this.f392131g;
            if (str21 != null) {
                j17 += b36.f.j(4, str21);
            }
            java.lang.String str22 = this.f392132h;
            if (str22 != null) {
                j17 += b36.f.j(5, str22);
            }
            java.lang.String str23 = this.f392133i;
            if (str23 != null) {
                j17 += b36.f.j(6, str23);
            }
            int e17 = j17 + b36.f.e(7, this.f392134m) + b36.f.e(8, this.f392135n);
            java.lang.String str24 = this.f392136o;
            if (str24 != null) {
                e17 += b36.f.j(9, str24);
            }
            int e18 = e17 + b36.f.e(10, this.f392137p);
            java.lang.String str25 = this.f392138q;
            if (str25 != null) {
                e18 += b36.f.j(11, str25);
            }
            int e19 = e18 + b36.f.e(12, this.f392139r);
            java.lang.String str26 = this.f392140s;
            if (str26 != null) {
                e19 += b36.f.j(13, str26);
            }
            java.lang.String str27 = this.f392141t;
            if (str27 != null) {
                e19 += b36.f.j(14, str27);
            }
            java.lang.String str28 = this.f392142u;
            if (str28 != null) {
                e19 += b36.f.j(15, str28);
            }
            java.lang.String str29 = this.f392143v;
            if (str29 != null) {
                e19 += b36.f.j(16, str29);
            }
            java.lang.String str30 = this.f392144w;
            if (str30 != null) {
                e19 += b36.f.j(17, str30);
            }
            java.lang.String str31 = this.f392145x;
            if (str31 != null) {
                e19 += b36.f.j(18, str31);
            }
            java.lang.String str32 = this.f392146y;
            if (str32 != null) {
                e19 += b36.f.j(19, str32);
            }
            java.lang.String str33 = this.f392147z;
            if (str33 != null) {
                e19 += b36.f.j(20, str33);
            }
            int e27 = e19 + b36.f.e(21, this.A) + b36.f.e(22, this.B);
            java.lang.String str34 = this.C;
            if (str34 != null) {
                e27 += b36.f.j(23, str34);
            }
            r45.tj0 tj0Var2 = this.D;
            if (tj0Var2 != null) {
                e27 += b36.f.i(24, tj0Var2.computeSize());
            }
            int g17 = e27 + b36.f.g(25, 8, linkedList) + b36.f.e(26, this.F);
            r45.xj0 xj0Var2 = this.G;
            return xj0Var2 != null ? g17 + b36.f.i(27, xj0Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        switch (intValue) {
            case 1:
                this.f392128d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f392129e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f392130f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f392131g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f392132h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f392133i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f392134m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f392135n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f392136o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f392137p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f392138q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f392139r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f392140s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f392141t = aVar2.k(intValue);
                return 0;
            case 15:
                this.f392142u = aVar2.k(intValue);
                return 0;
            case 16:
                this.f392143v = aVar2.k(intValue);
                return 0;
            case 17:
                this.f392144w = aVar2.k(intValue);
                return 0;
            case 18:
                this.f392145x = aVar2.k(intValue);
                return 0;
            case 19:
                this.f392146y = aVar2.k(intValue);
                return 0;
            case 20:
                this.f392147z = aVar2.k(intValue);
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tj0 tj0Var3 = new r45.tj0();
                    if (bArr != null && bArr.length > 0) {
                        tj0Var3.parseFrom(bArr);
                    }
                    this.D = tj0Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.m35 m35Var = new r45.m35();
                    if (bArr2 != null && bArr2.length > 0) {
                        m35Var.parseFrom(bArr2);
                    }
                    linkedList.add(m35Var);
                }
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.xj0 xj0Var3 = new r45.xj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xj0Var3.parseFrom(bArr3);
                    }
                    this.G = xj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

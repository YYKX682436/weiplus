package com.tencent.wechat.aff.udr;

/* loaded from: classes7.dex */
public class x extends com.tencent.mm.protobuf.f {
    public static final com.tencent.wechat.aff.udr.x L = new com.tencent.wechat.aff.udr.x();
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public long D;
    public java.lang.String E;
    public int F;
    public com.tencent.mm.protobuf.g G;
    public com.tencent.mm.protobuf.g H;
    public com.tencent.mm.protobuf.g I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217588J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217589d;

    /* renamed from: e, reason: collision with root package name */
    public long f217590e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217592g;

    /* renamed from: h, reason: collision with root package name */
    public long f217593h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217594i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f217595m;

    /* renamed from: n, reason: collision with root package name */
    public int f217596n;

    /* renamed from: o, reason: collision with root package name */
    public int f217597o;

    /* renamed from: p, reason: collision with root package name */
    public long f217598p;

    /* renamed from: q, reason: collision with root package name */
    public long f217599q;

    /* renamed from: r, reason: collision with root package name */
    public long f217600r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f217601s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f217602t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f217603u;

    /* renamed from: v, reason: collision with root package name */
    public long f217604v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217605w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f217607y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f217608z;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f217606x = new java.util.LinkedList();
    public final boolean[] K = new boolean[31];

    public java.util.LinkedList b() {
        return this.f217606x;
    }

    public java.lang.String c() {
        return this.K[7] ? this.f217595m : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.udr.x)) {
            return false;
        }
        com.tencent.wechat.aff.udr.x xVar = (com.tencent.wechat.aff.udr.x) fVar;
        return n51.f.a(this.f217589d, xVar.f217589d) && n51.f.a(java.lang.Long.valueOf(this.f217590e), java.lang.Long.valueOf(xVar.f217590e)) && n51.f.a(this.f217591f, xVar.f217591f) && n51.f.a(this.f217592g, xVar.f217592g) && n51.f.a(java.lang.Long.valueOf(this.f217593h), java.lang.Long.valueOf(xVar.f217593h)) && n51.f.a(this.f217594i, xVar.f217594i) && n51.f.a(this.f217595m, xVar.f217595m) && n51.f.a(java.lang.Integer.valueOf(this.f217596n), java.lang.Integer.valueOf(xVar.f217596n)) && n51.f.a(java.lang.Integer.valueOf(this.f217597o), java.lang.Integer.valueOf(xVar.f217597o)) && n51.f.a(java.lang.Long.valueOf(this.f217598p), java.lang.Long.valueOf(xVar.f217598p)) && n51.f.a(java.lang.Long.valueOf(this.f217599q), java.lang.Long.valueOf(xVar.f217599q)) && n51.f.a(java.lang.Long.valueOf(this.f217600r), java.lang.Long.valueOf(xVar.f217600r)) && n51.f.a(this.f217601s, xVar.f217601s) && n51.f.a(this.f217602t, xVar.f217602t) && n51.f.a(this.f217603u, xVar.f217603u) && n51.f.a(java.lang.Long.valueOf(this.f217604v), java.lang.Long.valueOf(xVar.f217604v)) && n51.f.a(this.f217605w, xVar.f217605w) && n51.f.a(this.f217606x, xVar.f217606x) && n51.f.a(this.f217607y, xVar.f217607y) && n51.f.a(this.f217608z, xVar.f217608z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(xVar.A)) && n51.f.a(this.B, xVar.B) && n51.f.a(this.C, xVar.C) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(xVar.D)) && n51.f.a(this.E, xVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(xVar.F)) && n51.f.a(this.G, xVar.G) && n51.f.a(this.H, xVar.H) && n51.f.a(this.I, xVar.I) && n51.f.a(this.f217588J, xVar.f217588J);
    }

    public java.lang.String d() {
        return this.K[23] ? this.C : "";
    }

    public java.lang.String e() {
        return this.K[13] ? this.f217601s : "";
    }

    public java.lang.String f() {
        return this.K[19] ? this.f217607y : "";
    }

    public long g() {
        return this.f217590e;
    }

    public java.lang.String getMd5() {
        return this.K[4] ? this.f217592g : "";
    }

    public java.lang.String getName() {
        return this.K[1] ? this.f217589d : "";
    }

    public java.lang.String getPath() {
        return this.K[6] ? this.f217594i : "";
    }

    public int getType() {
        return this.f217597o;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.udr.x parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.udr.x) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.udr.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.K;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217589d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217590e);
            }
            java.lang.String str2 = this.f217591f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f217592g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f217593h);
            }
            java.lang.String str4 = this.f217594i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f217595m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217596n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217597o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f217598p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f217599q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f217600r);
            }
            java.lang.String str6 = this.f217601s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f217602t;
            if (str7 != null && zArr[14]) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f217603u;
            if (str8 != null && zArr[15]) {
                fVar.j(15, str8);
            }
            if (zArr[16]) {
                fVar.h(16, this.f217604v);
            }
            com.tencent.mm.protobuf.g gVar = this.f217605w;
            if (gVar != null && zArr[17]) {
                fVar.b(17, gVar);
            }
            fVar.g(18, 8, this.f217606x);
            java.lang.String str9 = this.f217607y;
            if (str9 != null && zArr[19]) {
                fVar.j(19, str9);
            }
            java.lang.String str10 = this.f217608z;
            if (str10 != null && zArr[20]) {
                fVar.j(20, str10);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            java.lang.String str11 = this.B;
            if (str11 != null && zArr[22]) {
                fVar.j(22, str11);
            }
            java.lang.String str12 = this.C;
            if (str12 != null && zArr[23]) {
                fVar.j(23, str12);
            }
            if (zArr[24]) {
                fVar.h(24, this.D);
            }
            java.lang.String str13 = this.E;
            if (str13 != null && zArr[25]) {
                fVar.j(25, str13);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            com.tencent.mm.protobuf.g gVar2 = this.G;
            if (gVar2 != null && zArr[27]) {
                fVar.b(27, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.H;
            if (gVar3 != null && zArr[28]) {
                fVar.b(28, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.I;
            if (gVar4 != null && zArr[29]) {
                fVar.b(29, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f217588J;
            if (gVar5 != null && zArr[30]) {
                fVar.b(30, gVar5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f217589d;
            if (str14 != null && zArr[1]) {
                i18 = b36.f.j(1, str14) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f217590e);
            }
            java.lang.String str15 = this.f217591f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f217592g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f217593h);
            }
            java.lang.String str17 = this.f217594i;
            if (str17 != null && zArr[6]) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f217595m;
            if (str18 != null && zArr[7]) {
                i18 += b36.f.j(7, str18);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f217596n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f217597o);
            }
            if (zArr[10]) {
                i18 += b36.f.h(10, this.f217598p);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f217599q);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f217600r);
            }
            java.lang.String str19 = this.f217601s;
            if (str19 != null && zArr[13]) {
                i18 += b36.f.j(13, str19);
            }
            java.lang.String str20 = this.f217602t;
            if (str20 != null && zArr[14]) {
                i18 += b36.f.j(14, str20);
            }
            java.lang.String str21 = this.f217603u;
            if (str21 != null && zArr[15]) {
                i18 += b36.f.j(15, str21);
            }
            if (zArr[16]) {
                i18 += b36.f.h(16, this.f217604v);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f217605w;
            if (gVar6 != null && zArr[17]) {
                i18 += b36.f.b(17, gVar6);
            }
            int g17 = i18 + b36.f.g(18, 8, this.f217606x);
            java.lang.String str22 = this.f217607y;
            if (str22 != null && zArr[19]) {
                g17 += b36.f.j(19, str22);
            }
            java.lang.String str23 = this.f217608z;
            if (str23 != null && zArr[20]) {
                g17 += b36.f.j(20, str23);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            java.lang.String str24 = this.B;
            if (str24 != null && zArr[22]) {
                g17 += b36.f.j(22, str24);
            }
            java.lang.String str25 = this.C;
            if (str25 != null && zArr[23]) {
                g17 += b36.f.j(23, str25);
            }
            if (zArr[24]) {
                g17 += b36.f.h(24, this.D);
            }
            java.lang.String str26 = this.E;
            if (str26 != null && zArr[25]) {
                g17 += b36.f.j(25, str26);
            }
            if (zArr[26]) {
                g17 += b36.f.e(26, this.F);
            }
            com.tencent.mm.protobuf.g gVar7 = this.G;
            if (gVar7 != null && zArr[27]) {
                g17 += b36.f.b(27, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.H;
            if (gVar8 != null && zArr[28]) {
                g17 += b36.f.b(28, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.I;
            if (gVar9 != null && zArr[29]) {
                g17 += b36.f.b(29, gVar9);
            }
            com.tencent.mm.protobuf.g gVar10 = this.f217588J;
            return (gVar10 == null || !zArr[30]) ? g17 : g17 + b36.f.b(30, gVar10);
        }
        if (i17 == 2) {
            this.f217606x.clear();
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
                this.f217589d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217590e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217591f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217592g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217593h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217594i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217595m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217596n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217597o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217598p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217599q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217600r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f217601s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f217602t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f217603u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f217604v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f217605w = aVar2.d(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.udr.u uVar = new com.tencent.wechat.aff.udr.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar.parseFrom(bArr);
                    }
                    this.f217606x.add(uVar);
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f217607y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f217608z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.d(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.d(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.d(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f217588J = aVar2.d(intValue);
                zArr[30] = true;
                return 0;
            default:
                return -1;
        }
    }
}

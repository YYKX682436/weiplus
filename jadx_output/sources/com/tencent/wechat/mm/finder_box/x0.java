package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class x0 extends com.tencent.mm.protobuf.f {
    public static final com.tencent.wechat.mm.finder_box.x0 N = new com.tencent.wechat.mm.finder_box.x0();
    public com.tencent.mm.protobuf.g A;
    public long B;
    public int C;
    public int D;
    public java.lang.String E;
    public int F;
    public boolean G;
    public java.lang.String H;

    /* renamed from: J, reason: collision with root package name */
    public int f219935J;
    public boolean K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name */
    public long f219936d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.a1 f219937e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219938f;

    /* renamed from: g, reason: collision with root package name */
    public long f219939g;

    /* renamed from: h, reason: collision with root package name */
    public long f219940h;

    /* renamed from: i, reason: collision with root package name */
    public int f219941i;

    /* renamed from: m, reason: collision with root package name */
    public int f219942m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f219943n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f219944o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f219945p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f219946q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219947r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219948s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f219949t;

    /* renamed from: u, reason: collision with root package name */
    public int f219950u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f219951v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f219952w;

    /* renamed from: x, reason: collision with root package name */
    public long f219953x;

    /* renamed from: y, reason: collision with root package name */
    public int f219954y;

    /* renamed from: z, reason: collision with root package name */
    public int f219955z;
    public final java.util.LinkedList I = new java.util.LinkedList();
    public final boolean[] M = new boolean[33];

    public com.tencent.wechat.mm.finder_box.a1 b() {
        return this.M[2] ? this.f219937e : new com.tencent.wechat.mm.finder_box.a1();
    }

    public java.lang.String c() {
        return this.M[3] ? this.f219938f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.x0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.x0 x0Var = (com.tencent.wechat.mm.finder_box.x0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219936d), java.lang.Long.valueOf(x0Var.f219936d)) && n51.f.a(this.f219937e, x0Var.f219937e) && n51.f.a(this.f219938f, x0Var.f219938f) && n51.f.a(java.lang.Long.valueOf(this.f219939g), java.lang.Long.valueOf(x0Var.f219939g)) && n51.f.a(java.lang.Long.valueOf(this.f219940h), java.lang.Long.valueOf(x0Var.f219940h)) && n51.f.a(java.lang.Integer.valueOf(this.f219941i), java.lang.Integer.valueOf(x0Var.f219941i)) && n51.f.a(java.lang.Integer.valueOf(this.f219942m), java.lang.Integer.valueOf(x0Var.f219942m)) && n51.f.a(java.lang.Boolean.valueOf(this.f219943n), java.lang.Boolean.valueOf(x0Var.f219943n)) && n51.f.a(java.lang.Boolean.valueOf(this.f219944o), java.lang.Boolean.valueOf(x0Var.f219944o)) && n51.f.a(java.lang.Boolean.valueOf(this.f219945p), java.lang.Boolean.valueOf(x0Var.f219945p)) && n51.f.a(java.lang.Boolean.valueOf(this.f219946q), java.lang.Boolean.valueOf(x0Var.f219946q)) && n51.f.a(this.f219947r, x0Var.f219947r) && n51.f.a(this.f219948s, x0Var.f219948s) && n51.f.a(this.f219949t, x0Var.f219949t) && n51.f.a(java.lang.Integer.valueOf(this.f219950u), java.lang.Integer.valueOf(x0Var.f219950u)) && n51.f.a(this.f219951v, x0Var.f219951v) && n51.f.a(this.f219952w, x0Var.f219952w) && n51.f.a(java.lang.Long.valueOf(this.f219953x), java.lang.Long.valueOf(x0Var.f219953x)) && n51.f.a(java.lang.Integer.valueOf(this.f219954y), java.lang.Integer.valueOf(x0Var.f219954y)) && n51.f.a(java.lang.Integer.valueOf(this.f219955z), java.lang.Integer.valueOf(x0Var.f219955z)) && n51.f.a(this.A, x0Var.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(x0Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(x0Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(x0Var.D)) && n51.f.a(this.E, x0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(x0Var.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(x0Var.G)) && n51.f.a(this.H, x0Var.H) && n51.f.a(this.I, x0Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f219935J), java.lang.Integer.valueOf(x0Var.f219935J)) && n51.f.a(java.lang.Boolean.valueOf(this.K), java.lang.Boolean.valueOf(x0Var.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(x0Var.L));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.x0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.x0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.x0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.M;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219936d);
            }
            com.tencent.wechat.mm.finder_box.a1 a1Var = this.f219937e;
            if (a1Var != null && zArr[2]) {
                fVar.i(2, a1Var.computeSize());
                this.f219937e.writeFields(fVar);
            }
            java.lang.String str = this.f219938f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f219939g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f219940h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219941i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219942m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f219943n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f219944o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f219945p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f219946q);
            }
            java.lang.String str2 = this.f219947r;
            if (str2 != null && zArr[12]) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f219948s;
            if (str3 != null && zArr[13]) {
                fVar.j(13, str3);
            }
            java.lang.String str4 = this.f219949t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.e(15, this.f219950u);
            }
            java.lang.String str5 = this.f219951v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            java.lang.String str6 = this.f219952w;
            if (str6 != null && zArr[17]) {
                fVar.j(17, str6);
            }
            if (zArr[18]) {
                fVar.h(18, this.f219953x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f219954y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f219955z);
            }
            com.tencent.mm.protobuf.g gVar = this.A;
            if (gVar != null && zArr[21]) {
                fVar.b(21, gVar);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            java.lang.String str7 = this.E;
            if (str7 != null && zArr[25]) {
                fVar.j(25, str7);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            if (zArr[27]) {
                fVar.a(27, this.G);
            }
            java.lang.String str8 = this.H;
            if (str8 != null && zArr[28]) {
                fVar.j(28, str8);
            }
            fVar.g(29, 8, this.I);
            if (zArr[30]) {
                fVar.e(30, this.f219935J);
            }
            if (zArr[31]) {
                fVar.a(31, this.K);
            }
            if (zArr[32]) {
                fVar.a(32, this.L);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f219936d) + 0 : 0;
            com.tencent.wechat.mm.finder_box.a1 a1Var2 = this.f219937e;
            if (a1Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, a1Var2.computeSize());
            }
            java.lang.String str9 = this.f219938f;
            if (str9 != null && zArr[3]) {
                h17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f219939g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f219940h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f219941i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f219942m);
            }
            if (zArr[8]) {
                h17 += b36.f.a(8, this.f219943n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f219944o);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f219945p);
            }
            if (zArr[11]) {
                h17 += b36.f.a(11, this.f219946q);
            }
            java.lang.String str10 = this.f219947r;
            if (str10 != null && zArr[12]) {
                h17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f219948s;
            if (str11 != null && zArr[13]) {
                h17 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f219949t;
            if (str12 != null && zArr[14]) {
                h17 += b36.f.j(14, str12);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f219950u);
            }
            java.lang.String str13 = this.f219951v;
            if (str13 != null && zArr[16]) {
                h17 += b36.f.j(16, str13);
            }
            java.lang.String str14 = this.f219952w;
            if (str14 != null && zArr[17]) {
                h17 += b36.f.j(17, str14);
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f219953x);
            }
            if (zArr[19]) {
                h17 += b36.f.e(19, this.f219954y);
            }
            if (zArr[20]) {
                h17 += b36.f.e(20, this.f219955z);
            }
            com.tencent.mm.protobuf.g gVar2 = this.A;
            if (gVar2 != null && zArr[21]) {
                h17 += b36.f.b(21, gVar2);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                h17 += b36.f.e(23, this.C);
            }
            if (zArr[24]) {
                h17 += b36.f.e(24, this.D);
            }
            java.lang.String str15 = this.E;
            if (str15 != null && zArr[25]) {
                h17 += b36.f.j(25, str15);
            }
            if (zArr[26]) {
                h17 += b36.f.e(26, this.F);
            }
            if (zArr[27]) {
                h17 += b36.f.a(27, this.G);
            }
            java.lang.String str16 = this.H;
            if (str16 != null && zArr[28]) {
                h17 += b36.f.j(28, str16);
            }
            int g17 = h17 + b36.f.g(29, 8, this.I);
            if (zArr[30]) {
                g17 += b36.f.e(30, this.f219935J);
            }
            if (zArr[31]) {
                g17 += b36.f.a(31, this.K);
            }
            return zArr[32] ? g17 + b36.f.a(32, this.L) : g17;
        }
        if (i17 == 2) {
            this.I.clear();
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
                this.f219936d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.a1 a1Var3 = new com.tencent.wechat.mm.finder_box.a1();
                    if (bArr != null && bArr.length > 0) {
                        a1Var3.parseFrom(bArr);
                    }
                    this.f219937e = a1Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f219938f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219939g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219940h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219941i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219942m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219943n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219944o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219945p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219946q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219947r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f219948s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f219949t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f219950u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f219951v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f219952w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f219953x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f219954y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f219955z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.d(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
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
                this.G = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.finder_box.e2 e2Var = new com.tencent.wechat.mm.finder_box.e2();
                    if (bArr2 != null && bArr2.length > 0) {
                        e2Var.parseFrom(bArr2);
                    }
                    this.I.add(e2Var);
                }
                zArr[29] = true;
                return 0;
            case 30:
                this.f219935J = aVar2.g(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.c(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.c(intValue);
                zArr[32] = true;
                return 0;
            default:
                return -1;
        }
    }
}

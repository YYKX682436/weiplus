package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
public class z0 extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public boolean C;
    public boolean D;
    public com.tencent.wechat.mm.finder_box.s3 E;
    public int F;
    public int G;
    public java.lang.String I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219996e;

    /* renamed from: f, reason: collision with root package name */
    public long f219997f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219999h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220000i;

    /* renamed from: m, reason: collision with root package name */
    public int f220001m;

    /* renamed from: n, reason: collision with root package name */
    public int f220002n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f220003o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f220004p;

    /* renamed from: q, reason: collision with root package name */
    public int f220005q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f220006r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f220007s;

    /* renamed from: t, reason: collision with root package name */
    public int f220008t;

    /* renamed from: u, reason: collision with root package name */
    public int f220009u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f220010v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f220011w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f220012x;

    /* renamed from: y, reason: collision with root package name */
    public int f220013y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f220014z = new java.util.LinkedList();
    public java.util.LinkedList H = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final boolean[] f219994J = new boolean[30];

    static {
        new com.tencent.wechat.mm.finder_box.z0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.z0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.z0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.z0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.z0 z0Var = (com.tencent.wechat.mm.finder_box.z0) fVar;
        return n51.f.a(this.f219995d, z0Var.f219995d) && n51.f.a(this.f219996e, z0Var.f219996e) && n51.f.a(java.lang.Long.valueOf(this.f219997f), java.lang.Long.valueOf(z0Var.f219997f)) && n51.f.a(this.f219998g, z0Var.f219998g) && n51.f.a(this.f219999h, z0Var.f219999h) && n51.f.a(this.f220000i, z0Var.f220000i) && n51.f.a(java.lang.Integer.valueOf(this.f220001m), java.lang.Integer.valueOf(z0Var.f220001m)) && n51.f.a(java.lang.Integer.valueOf(this.f220002n), java.lang.Integer.valueOf(z0Var.f220002n)) && n51.f.a(this.f220003o, z0Var.f220003o) && n51.f.a(this.f220004p, z0Var.f220004p) && n51.f.a(java.lang.Integer.valueOf(this.f220005q), java.lang.Integer.valueOf(z0Var.f220005q)) && n51.f.a(java.lang.Boolean.valueOf(this.f220006r), java.lang.Boolean.valueOf(z0Var.f220006r)) && n51.f.a(this.f220007s, z0Var.f220007s) && n51.f.a(java.lang.Integer.valueOf(this.f220008t), java.lang.Integer.valueOf(z0Var.f220008t)) && n51.f.a(java.lang.Integer.valueOf(this.f220009u), java.lang.Integer.valueOf(z0Var.f220009u)) && n51.f.a(this.f220010v, z0Var.f220010v) && n51.f.a(this.f220011w, z0Var.f220011w) && n51.f.a(this.f220012x, z0Var.f220012x) && n51.f.a(java.lang.Integer.valueOf(this.f220013y), java.lang.Integer.valueOf(z0Var.f220013y)) && n51.f.a(this.f220014z, z0Var.f220014z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(z0Var.A)) && n51.f.a(this.B, z0Var.B) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(z0Var.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(z0Var.D)) && n51.f.a(this.E, z0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(z0Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(z0Var.G)) && n51.f.a(this.H, z0Var.H) && n51.f.a(this.I, z0Var.I);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.z0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219994J;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219995d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219996e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f219997f);
            }
            java.lang.String str3 = this.f219998g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f219999h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f220000i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f220001m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f220002n);
            }
            java.lang.String str6 = this.f220003o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f220004p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f220005q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f220006r);
            }
            java.lang.String str8 = this.f220007s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            if (zArr[14]) {
                fVar.e(14, this.f220008t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f220009u);
            }
            java.lang.String str9 = this.f220010v;
            if (str9 != null && zArr[16]) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f220011w;
            if (str10 != null && zArr[17]) {
                fVar.j(17, str10);
            }
            java.lang.String str11 = this.f220012x;
            if (str11 != null && zArr[18]) {
                fVar.j(18, str11);
            }
            if (zArr[19]) {
                fVar.e(19, this.f220013y);
            }
            fVar.g(20, 1, this.f220014z);
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[22]) {
                fVar.j(22, str12);
            }
            if (zArr[23]) {
                fVar.a(23, this.C);
            }
            if (zArr[24]) {
                fVar.a(24, this.D);
            }
            com.tencent.wechat.mm.finder_box.s3 s3Var = this.E;
            if (s3Var != null && zArr[25]) {
                fVar.i(25, s3Var.computeSize());
                this.E.writeFields(fVar);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            if (zArr[27]) {
                fVar.e(27, this.G);
            }
            fVar.g(28, 1, this.H);
            java.lang.String str13 = this.I;
            if (str13 != null && zArr[29]) {
                fVar.j(29, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f219995d;
            if (str14 != null && zArr[1]) {
                i18 = b36.f.j(1, str14) + 0;
            }
            java.lang.String str15 = this.f219996e;
            if (str15 != null && zArr[2]) {
                i18 += b36.f.j(2, str15);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f219997f);
            }
            java.lang.String str16 = this.f219998g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f219999h;
            if (str17 != null && zArr[5]) {
                i18 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f220000i;
            if (str18 != null && zArr[6]) {
                i18 += b36.f.j(6, str18);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f220001m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f220002n);
            }
            java.lang.String str19 = this.f220003o;
            if (str19 != null && zArr[9]) {
                i18 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f220004p;
            if (str20 != null && zArr[10]) {
                i18 += b36.f.j(10, str20);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f220005q);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f220006r);
            }
            java.lang.String str21 = this.f220007s;
            if (str21 != null && zArr[13]) {
                i18 += b36.f.j(13, str21);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f220008t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f220009u);
            }
            java.lang.String str22 = this.f220010v;
            if (str22 != null && zArr[16]) {
                i18 += b36.f.j(16, str22);
            }
            java.lang.String str23 = this.f220011w;
            if (str23 != null && zArr[17]) {
                i18 += b36.f.j(17, str23);
            }
            java.lang.String str24 = this.f220012x;
            if (str24 != null && zArr[18]) {
                i18 += b36.f.j(18, str24);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f220013y);
            }
            int g17 = i18 + b36.f.g(20, 1, this.f220014z);
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            java.lang.String str25 = this.B;
            if (str25 != null && zArr[22]) {
                g17 += b36.f.j(22, str25);
            }
            if (zArr[23]) {
                g17 += b36.f.a(23, this.C);
            }
            if (zArr[24]) {
                g17 += b36.f.a(24, this.D);
            }
            com.tencent.wechat.mm.finder_box.s3 s3Var2 = this.E;
            if (s3Var2 != null && zArr[25]) {
                g17 += b36.f.i(25, s3Var2.computeSize());
            }
            if (zArr[26]) {
                g17 += b36.f.e(26, this.F);
            }
            if (zArr[27]) {
                g17 += b36.f.e(27, this.G);
            }
            int g18 = g17 + b36.f.g(28, 1, this.H);
            java.lang.String str26 = this.I;
            return (str26 == null || !zArr[29]) ? g18 : g18 + b36.f.j(29, str26);
        }
        if (i17 == 2) {
            this.f220014z.clear();
            this.H.clear();
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
                this.f219995d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219996e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219997f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219998g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219999h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f220000i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f220001m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f220002n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f220003o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f220004p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f220005q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f220006r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f220007s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f220008t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f220009u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f220010v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f220011w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f220012x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f220013y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f220014z.add(aVar2.k(intValue));
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
                this.C = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.finder_box.s3 s3Var3 = new com.tencent.wechat.mm.finder_box.s3();
                    if (bArr != null && bArr.length > 0) {
                        s3Var3.parseFrom(bArr);
                    }
                    this.E = s3Var3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H.add(aVar2.k(intValue));
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class s2 extends com.tencent.mm.protobuf.f {
    public com.tencent.wechat.mm.biz.e5 A;
    public final boolean[] B = new boolean[22];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218595d;

    /* renamed from: e, reason: collision with root package name */
    public int f218596e;

    /* renamed from: f, reason: collision with root package name */
    public int f218597f;

    /* renamed from: g, reason: collision with root package name */
    public long f218598g;

    /* renamed from: h, reason: collision with root package name */
    public int f218599h;

    /* renamed from: i, reason: collision with root package name */
    public int f218600i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218601m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f218602n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218603o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218604p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218605q;

    /* renamed from: r, reason: collision with root package name */
    public int f218606r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218607s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f218608t;

    /* renamed from: u, reason: collision with root package name */
    public int f218609u;

    /* renamed from: v, reason: collision with root package name */
    public int f218610v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.q2 f218611w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f218612x;

    /* renamed from: y, reason: collision with root package name */
    public int f218613y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f218614z;

    static {
        new com.tencent.wechat.mm.biz.s2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.s2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.s2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.s2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.s2 s2Var = (com.tencent.wechat.mm.biz.s2) fVar;
        return n51.f.a(this.f218595d, s2Var.f218595d) && n51.f.a(java.lang.Integer.valueOf(this.f218596e), java.lang.Integer.valueOf(s2Var.f218596e)) && n51.f.a(java.lang.Integer.valueOf(this.f218597f), java.lang.Integer.valueOf(s2Var.f218597f)) && n51.f.a(java.lang.Long.valueOf(this.f218598g), java.lang.Long.valueOf(s2Var.f218598g)) && n51.f.a(java.lang.Integer.valueOf(this.f218599h), java.lang.Integer.valueOf(s2Var.f218599h)) && n51.f.a(java.lang.Integer.valueOf(this.f218600i), java.lang.Integer.valueOf(s2Var.f218600i)) && n51.f.a(this.f218601m, s2Var.f218601m) && n51.f.a(this.f218602n, s2Var.f218602n) && n51.f.a(this.f218603o, s2Var.f218603o) && n51.f.a(this.f218604p, s2Var.f218604p) && n51.f.a(this.f218605q, s2Var.f218605q) && n51.f.a(java.lang.Integer.valueOf(this.f218606r), java.lang.Integer.valueOf(s2Var.f218606r)) && n51.f.a(this.f218607s, s2Var.f218607s) && n51.f.a(this.f218608t, s2Var.f218608t) && n51.f.a(java.lang.Integer.valueOf(this.f218609u), java.lang.Integer.valueOf(s2Var.f218609u)) && n51.f.a(java.lang.Integer.valueOf(this.f218610v), java.lang.Integer.valueOf(s2Var.f218610v)) && n51.f.a(this.f218611w, s2Var.f218611w) && n51.f.a(this.f218612x, s2Var.f218612x) && n51.f.a(java.lang.Integer.valueOf(this.f218613y), java.lang.Integer.valueOf(s2Var.f218613y)) && n51.f.a(java.lang.Boolean.valueOf(this.f218614z), java.lang.Boolean.valueOf(s2Var.f218614z)) && n51.f.a(this.A, s2Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.s2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218595d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218596e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218597f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f218598g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218599h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218600i);
            }
            java.lang.String str2 = this.f218601m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f218602n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f218603o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f218604p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f218605q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f218606r);
            }
            java.lang.String str7 = this.f218607s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f218608t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            if (zArr[15]) {
                fVar.e(15, this.f218609u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f218610v);
            }
            com.tencent.wechat.mm.biz.q2 q2Var = this.f218611w;
            if (q2Var != null && zArr[17]) {
                fVar.i(17, q2Var.computeSize());
                this.f218611w.writeFields(fVar);
            }
            java.lang.String str9 = this.f218612x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            if (zArr[19]) {
                fVar.e(19, this.f218613y);
            }
            if (zArr[20]) {
                fVar.a(20, this.f218614z);
            }
            com.tencent.wechat.mm.biz.e5 e5Var = this.A;
            if (e5Var != null && zArr[21]) {
                fVar.i(21, e5Var.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f218595d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f218596e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f218597f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f218598g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f218599h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f218600i);
            }
            java.lang.String str11 = this.f218601m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f218602n;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f218603o;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f218604p;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f218605q;
            if (str15 != null && zArr[11]) {
                i18 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f218606r);
            }
            java.lang.String str16 = this.f218607s;
            if (str16 != null && zArr[13]) {
                i18 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f218608t;
            if (str17 != null && zArr[14]) {
                i18 += b36.f.j(14, str17);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f218609u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f218610v);
            }
            com.tencent.wechat.mm.biz.q2 q2Var2 = this.f218611w;
            if (q2Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, q2Var2.computeSize());
            }
            java.lang.String str18 = this.f218612x;
            if (str18 != null && zArr[18]) {
                i18 += b36.f.j(18, str18);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f218613y);
            }
            if (zArr[20]) {
                i18 += b36.f.a(20, this.f218614z);
            }
            com.tencent.wechat.mm.biz.e5 e5Var2 = this.A;
            return (e5Var2 == null || !zArr[21]) ? i18 : i18 + b36.f.i(21, e5Var2.computeSize());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f218595d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218596e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218597f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218598g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218599h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218600i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218601m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218602n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218603o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218604p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218605q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218606r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218607s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f218608t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f218609u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f218610v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.biz.q2 q2Var3 = new com.tencent.wechat.mm.biz.q2();
                    if (bArr != null && bArr.length > 0) {
                        q2Var3.parseFrom(bArr);
                    }
                    this.f218611w = q2Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f218612x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f218613y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f218614z = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.e5 e5Var3 = new com.tencent.wechat.mm.biz.e5();
                    if (bArr2 != null && bArr2.length > 0) {
                        e5Var3.parseFrom(bArr2);
                    }
                    this.A = e5Var3;
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}

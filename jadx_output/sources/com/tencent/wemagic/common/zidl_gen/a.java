package com.tencent.wemagic.common.zidl_gen;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220069d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220070e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220072g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220073h;

    /* renamed from: i, reason: collision with root package name */
    public long f220074i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f220075m;

    /* renamed from: n, reason: collision with root package name */
    public int f220076n;

    /* renamed from: o, reason: collision with root package name */
    public int f220077o;

    /* renamed from: p, reason: collision with root package name */
    public float f220078p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f220079q;

    /* renamed from: r, reason: collision with root package name */
    public float f220080r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f220081s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f220082t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f220083u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f220084v = new boolean[16];

    static {
        new com.tencent.wemagic.common.zidl_gen.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wemagic.common.zidl_gen.a)) {
            return false;
        }
        com.tencent.wemagic.common.zidl_gen.a aVar = (com.tencent.wemagic.common.zidl_gen.a) fVar;
        return n51.f.a(this.f220069d, aVar.f220069d) && n51.f.a(this.f220070e, aVar.f220070e) && n51.f.a(this.f220071f, aVar.f220071f) && n51.f.a(this.f220072g, aVar.f220072g) && n51.f.a(this.f220073h, aVar.f220073h) && n51.f.a(java.lang.Long.valueOf(this.f220074i), java.lang.Long.valueOf(aVar.f220074i)) && n51.f.a(this.f220075m, aVar.f220075m) && n51.f.a(java.lang.Integer.valueOf(this.f220076n), java.lang.Integer.valueOf(aVar.f220076n)) && n51.f.a(java.lang.Integer.valueOf(this.f220077o), java.lang.Integer.valueOf(aVar.f220077o)) && n51.f.a(java.lang.Float.valueOf(this.f220078p), java.lang.Float.valueOf(aVar.f220078p)) && n51.f.a(this.f220079q, aVar.f220079q) && n51.f.a(java.lang.Float.valueOf(this.f220080r), java.lang.Float.valueOf(aVar.f220080r)) && n51.f.a(this.f220081s, aVar.f220081s) && n51.f.a(java.lang.Boolean.valueOf(this.f220082t), java.lang.Boolean.valueOf(aVar.f220082t)) && n51.f.a(java.lang.Boolean.valueOf(this.f220083u), java.lang.Boolean.valueOf(aVar.f220083u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wemagic.common.zidl_gen.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f220084v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f220069d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f220070e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f220071f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f220072g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f220073h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.h(6, this.f220074i);
            }
            java.lang.String str6 = this.f220075m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f220076n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f220077o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f220078p);
            }
            java.lang.String str7 = this.f220079q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (zArr[12]) {
                fVar.d(12, this.f220080r);
            }
            java.lang.String str8 = this.f220081s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            if (zArr[14]) {
                fVar.a(14, this.f220082t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f220083u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f220069d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f220070e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f220071f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f220072g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f220073h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f220074i);
            }
            java.lang.String str14 = this.f220075m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f220076n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f220077o);
            }
            if (zArr[10]) {
                i18 += b36.f.d(10, this.f220078p);
            }
            java.lang.String str15 = this.f220079q;
            if (str15 != null && zArr[11]) {
                i18 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                i18 += b36.f.d(12, this.f220080r);
            }
            java.lang.String str16 = this.f220081s;
            if (str16 != null && zArr[13]) {
                i18 += b36.f.j(13, str16);
            }
            if (zArr[14]) {
                i18 += b36.f.a(14, this.f220082t);
            }
            return zArr[15] ? i18 + b36.f.a(15, this.f220083u) : i18;
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
                this.f220069d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f220070e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f220071f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f220072g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f220073h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f220074i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f220075m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f220076n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f220077o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f220078p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f220079q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f220080r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f220081s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f220082t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f220083u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wemagic.common.zidl_gen.a) super.parseFrom(bArr);
    }
}

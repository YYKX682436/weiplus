package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class n3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219674d;

    /* renamed from: e, reason: collision with root package name */
    public int f219675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219676f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219677g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219678h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219679i;

    /* renamed from: m, reason: collision with root package name */
    public int f219680m;

    /* renamed from: n, reason: collision with root package name */
    public int f219681n;

    /* renamed from: o, reason: collision with root package name */
    public int f219682o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219683p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219684q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219685r;

    /* renamed from: s, reason: collision with root package name */
    public int f219686s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f219687t = new boolean[14];

    static {
        new com.tencent.wechat.mm.finder_box.n3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.n3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.n3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.n3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.n3 n3Var = (com.tencent.wechat.mm.finder_box.n3) fVar;
        return n51.f.a(this.f219674d, n3Var.f219674d) && n51.f.a(java.lang.Integer.valueOf(this.f219675e), java.lang.Integer.valueOf(n3Var.f219675e)) && n51.f.a(this.f219676f, n3Var.f219676f) && n51.f.a(this.f219677g, n3Var.f219677g) && n51.f.a(this.f219678h, n3Var.f219678h) && n51.f.a(this.f219679i, n3Var.f219679i) && n51.f.a(java.lang.Integer.valueOf(this.f219680m), java.lang.Integer.valueOf(n3Var.f219680m)) && n51.f.a(java.lang.Integer.valueOf(this.f219681n), java.lang.Integer.valueOf(n3Var.f219681n)) && n51.f.a(java.lang.Integer.valueOf(this.f219682o), java.lang.Integer.valueOf(n3Var.f219682o)) && n51.f.a(this.f219683p, n3Var.f219683p) && n51.f.a(this.f219684q, n3Var.f219684q) && n51.f.a(this.f219685r, n3Var.f219685r) && n51.f.a(java.lang.Integer.valueOf(this.f219686s), java.lang.Integer.valueOf(n3Var.f219686s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.n3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219687t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219674d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219675e);
            }
            java.lang.String str2 = this.f219676f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219677g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f219678h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f219679i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219680m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219681n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f219682o);
            }
            java.lang.String str6 = this.f219683p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f219684q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f219685r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f219686s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f219674d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f219675e);
            }
            java.lang.String str10 = this.f219676f;
            if (str10 != null && zArr[3]) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f219677g;
            if (str11 != null && zArr[4]) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f219678h;
            if (str12 != null && zArr[5]) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f219679i;
            if (str13 != null && zArr[6]) {
                j17 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f219680m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f219681n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f219682o);
            }
            java.lang.String str14 = this.f219683p;
            if (str14 != null && zArr[10]) {
                j17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f219684q;
            if (str15 != null && zArr[11]) {
                j17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f219685r;
            if (str16 != null && zArr[12]) {
                j17 += b36.f.j(12, str16);
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f219686s) : j17;
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
                this.f219674d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219675e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219676f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219677g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219678h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219679i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219680m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219681n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219682o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219683p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219684q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219685r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f219686s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}

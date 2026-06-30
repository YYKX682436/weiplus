package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217561f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217562g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217563h;

    /* renamed from: i, reason: collision with root package name */
    public int f217564i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f217565m;

    /* renamed from: n, reason: collision with root package name */
    public int f217566n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f217567o;

    /* renamed from: p, reason: collision with root package name */
    public int f217568p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f217569q;

    /* renamed from: r, reason: collision with root package name */
    public int f217570r;

    /* renamed from: s, reason: collision with root package name */
    public int f217571s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f217572t = new boolean[14];

    static {
        new com.tencent.wechat.aff.udr.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.udr.s)) {
            return false;
        }
        com.tencent.wechat.aff.udr.s sVar = (com.tencent.wechat.aff.udr.s) fVar;
        return n51.f.a(this.f217559d, sVar.f217559d) && n51.f.a(this.f217560e, sVar.f217560e) && n51.f.a(this.f217561f, sVar.f217561f) && n51.f.a(this.f217562g, sVar.f217562g) && n51.f.a(this.f217563h, sVar.f217563h) && n51.f.a(java.lang.Integer.valueOf(this.f217564i), java.lang.Integer.valueOf(sVar.f217564i)) && n51.f.a(this.f217565m, sVar.f217565m) && n51.f.a(java.lang.Integer.valueOf(this.f217566n), java.lang.Integer.valueOf(sVar.f217566n)) && n51.f.a(this.f217567o, sVar.f217567o) && n51.f.a(java.lang.Integer.valueOf(this.f217568p), java.lang.Integer.valueOf(sVar.f217568p)) && n51.f.a(this.f217569q, sVar.f217569q) && n51.f.a(java.lang.Integer.valueOf(this.f217570r), java.lang.Integer.valueOf(sVar.f217570r)) && n51.f.a(java.lang.Integer.valueOf(this.f217571s), java.lang.Integer.valueOf(sVar.f217571s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.udr.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217572t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217559d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217560e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f217561f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f217562g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f217563h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217564i);
            }
            java.lang.String str6 = this.f217565m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217566n);
            }
            java.lang.String str7 = this.f217567o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.e(10, this.f217568p);
            }
            java.lang.String str8 = this.f217569q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            if (zArr[12]) {
                fVar.e(12, this.f217570r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f217571s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f217559d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            java.lang.String str10 = this.f217560e;
            if (str10 != null && zArr[2]) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f217561f;
            if (str11 != null && zArr[3]) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f217562g;
            if (str12 != null && zArr[4]) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f217563h;
            if (str13 != null && zArr[5]) {
                j17 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f217564i);
            }
            java.lang.String str14 = this.f217565m;
            if (str14 != null && zArr[7]) {
                j17 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f217566n);
            }
            java.lang.String str15 = this.f217567o;
            if (str15 != null && zArr[9]) {
                j17 += b36.f.j(9, str15);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f217568p);
            }
            java.lang.String str16 = this.f217569q;
            if (str16 != null && zArr[11]) {
                j17 += b36.f.j(11, str16);
            }
            if (zArr[12]) {
                j17 += b36.f.e(12, this.f217570r);
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f217571s) : j17;
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
                this.f217559d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217560e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217561f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217562g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217563h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217564i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217565m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217566n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217567o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217568p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217569q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217570r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f217571s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.udr.s) super.parseFrom(bArr);
    }
}

package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class f3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218041d;

    /* renamed from: e, reason: collision with root package name */
    public int f218042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218043f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218044g;

    /* renamed from: h, reason: collision with root package name */
    public int f218045h;

    /* renamed from: i, reason: collision with root package name */
    public long f218046i;

    /* renamed from: m, reason: collision with root package name */
    public int f218047m;

    /* renamed from: n, reason: collision with root package name */
    public int f218048n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218049o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218050p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218051q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218052r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218053s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f218054t = new boolean[14];

    static {
        new com.tencent.wechat.mm.biz.f3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.f3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.f3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.f3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.f3 f3Var = (com.tencent.wechat.mm.biz.f3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218041d), java.lang.Long.valueOf(f3Var.f218041d)) && n51.f.a(java.lang.Integer.valueOf(this.f218042e), java.lang.Integer.valueOf(f3Var.f218042e)) && n51.f.a(this.f218043f, f3Var.f218043f) && n51.f.a(this.f218044g, f3Var.f218044g) && n51.f.a(java.lang.Integer.valueOf(this.f218045h), java.lang.Integer.valueOf(f3Var.f218045h)) && n51.f.a(java.lang.Long.valueOf(this.f218046i), java.lang.Long.valueOf(f3Var.f218046i)) && n51.f.a(java.lang.Integer.valueOf(this.f218047m), java.lang.Integer.valueOf(f3Var.f218047m)) && n51.f.a(java.lang.Integer.valueOf(this.f218048n), java.lang.Integer.valueOf(f3Var.f218048n)) && n51.f.a(this.f218049o, f3Var.f218049o) && n51.f.a(this.f218050p, f3Var.f218050p) && n51.f.a(this.f218051q, f3Var.f218051q) && n51.f.a(this.f218052r, f3Var.f218052r) && n51.f.a(this.f218053s, f3Var.f218053s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.f3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218054t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218041d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218042e);
            }
            java.lang.String str = this.f218043f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f218044g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218045h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f218046i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218047m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218048n);
            }
            java.lang.String str3 = this.f218049o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f218050p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f218051q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f218052r;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f218053s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218041d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f218042e);
            }
            java.lang.String str8 = this.f218043f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f218044g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f218045h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f218046i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f218047m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f218048n);
            }
            java.lang.String str10 = this.f218049o;
            if (str10 != null && zArr[9]) {
                h17 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f218050p;
            if (str11 != null && zArr[10]) {
                h17 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f218051q;
            if (str12 != null && zArr[11]) {
                h17 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f218052r;
            if (str13 != null && zArr[12]) {
                h17 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f218053s;
            return (str14 == null || !zArr[13]) ? h17 : h17 + b36.f.j(13, str14);
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
                this.f218041d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218042e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218043f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218044g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218045h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218046i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218047m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218048n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218049o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218050p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218051q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218052r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218053s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}

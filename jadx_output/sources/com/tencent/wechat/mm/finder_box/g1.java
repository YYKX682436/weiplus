package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.g1 f219443v = new com.tencent.wechat.mm.finder_box.g1();

    /* renamed from: d, reason: collision with root package name */
    public long f219444d;

    /* renamed from: e, reason: collision with root package name */
    public long f219445e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219446f;

    /* renamed from: g, reason: collision with root package name */
    public long f219447g;

    /* renamed from: h, reason: collision with root package name */
    public long f219448h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219449i;

    /* renamed from: m, reason: collision with root package name */
    public int f219450m;

    /* renamed from: n, reason: collision with root package name */
    public int f219451n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219452o;

    /* renamed from: p, reason: collision with root package name */
    public int f219453p;

    /* renamed from: q, reason: collision with root package name */
    public int f219454q;

    /* renamed from: r, reason: collision with root package name */
    public int f219455r;

    /* renamed from: s, reason: collision with root package name */
    public int f219456s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f219457t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f219458u = new boolean[15];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.g1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.g1 g1Var = (com.tencent.wechat.mm.finder_box.g1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219444d), java.lang.Long.valueOf(g1Var.f219444d)) && n51.f.a(java.lang.Long.valueOf(this.f219445e), java.lang.Long.valueOf(g1Var.f219445e)) && n51.f.a(this.f219446f, g1Var.f219446f) && n51.f.a(java.lang.Long.valueOf(this.f219447g), java.lang.Long.valueOf(g1Var.f219447g)) && n51.f.a(java.lang.Long.valueOf(this.f219448h), java.lang.Long.valueOf(g1Var.f219448h)) && n51.f.a(this.f219449i, g1Var.f219449i) && n51.f.a(java.lang.Integer.valueOf(this.f219450m), java.lang.Integer.valueOf(g1Var.f219450m)) && n51.f.a(java.lang.Integer.valueOf(this.f219451n), java.lang.Integer.valueOf(g1Var.f219451n)) && n51.f.a(this.f219452o, g1Var.f219452o) && n51.f.a(java.lang.Integer.valueOf(this.f219453p), java.lang.Integer.valueOf(g1Var.f219453p)) && n51.f.a(java.lang.Integer.valueOf(this.f219454q), java.lang.Integer.valueOf(g1Var.f219454q)) && n51.f.a(java.lang.Integer.valueOf(this.f219455r), java.lang.Integer.valueOf(g1Var.f219455r)) && n51.f.a(java.lang.Integer.valueOf(this.f219456s), java.lang.Integer.valueOf(g1Var.f219456s)) && n51.f.a(this.f219457t, g1Var.f219457t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219458u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219444d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f219445e);
            }
            java.lang.String str = this.f219446f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f219447g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f219448h);
            }
            java.lang.String str2 = this.f219449i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219450m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219451n);
            }
            java.lang.String str3 = this.f219452o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f219453p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f219454q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f219455r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f219456s);
            }
            java.lang.String str4 = this.f219457t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f219444d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f219445e);
            }
            java.lang.String str5 = this.f219446f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f219447g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f219448h);
            }
            java.lang.String str6 = this.f219449i;
            if (str6 != null && zArr[6]) {
                h17 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f219450m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f219451n);
            }
            java.lang.String str7 = this.f219452o;
            if (str7 != null && zArr[9]) {
                h17 += b36.f.j(9, str7);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f219453p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f219454q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f219455r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f219456s);
            }
            java.lang.String str8 = this.f219457t;
            return (str8 == null || !zArr[14]) ? h17 : h17 + b36.f.j(14, str8);
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
                this.f219444d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219445e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219446f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219447g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219448h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219449i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219450m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219451n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219452o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219453p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219454q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219455r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f219456s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f219457t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.g1) super.parseFrom(bArr);
    }
}

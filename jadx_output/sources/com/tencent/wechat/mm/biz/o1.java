package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class o1 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.o1 f218399v = new com.tencent.wechat.mm.biz.o1();

    /* renamed from: d, reason: collision with root package name */
    public long f218400d;

    /* renamed from: e, reason: collision with root package name */
    public long f218401e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218402f;

    /* renamed from: g, reason: collision with root package name */
    public long f218403g;

    /* renamed from: h, reason: collision with root package name */
    public long f218404h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218405i;

    /* renamed from: m, reason: collision with root package name */
    public int f218406m;

    /* renamed from: n, reason: collision with root package name */
    public int f218407n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218408o;

    /* renamed from: p, reason: collision with root package name */
    public int f218409p;

    /* renamed from: q, reason: collision with root package name */
    public int f218410q;

    /* renamed from: r, reason: collision with root package name */
    public int f218411r;

    /* renamed from: s, reason: collision with root package name */
    public int f218412s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f218413t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f218414u = new boolean[15];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.o1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.o1 o1Var = (com.tencent.wechat.mm.biz.o1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218400d), java.lang.Long.valueOf(o1Var.f218400d)) && n51.f.a(java.lang.Long.valueOf(this.f218401e), java.lang.Long.valueOf(o1Var.f218401e)) && n51.f.a(this.f218402f, o1Var.f218402f) && n51.f.a(java.lang.Long.valueOf(this.f218403g), java.lang.Long.valueOf(o1Var.f218403g)) && n51.f.a(java.lang.Long.valueOf(this.f218404h), java.lang.Long.valueOf(o1Var.f218404h)) && n51.f.a(this.f218405i, o1Var.f218405i) && n51.f.a(java.lang.Integer.valueOf(this.f218406m), java.lang.Integer.valueOf(o1Var.f218406m)) && n51.f.a(java.lang.Integer.valueOf(this.f218407n), java.lang.Integer.valueOf(o1Var.f218407n)) && n51.f.a(this.f218408o, o1Var.f218408o) && n51.f.a(java.lang.Integer.valueOf(this.f218409p), java.lang.Integer.valueOf(o1Var.f218409p)) && n51.f.a(java.lang.Integer.valueOf(this.f218410q), java.lang.Integer.valueOf(o1Var.f218410q)) && n51.f.a(java.lang.Integer.valueOf(this.f218411r), java.lang.Integer.valueOf(o1Var.f218411r)) && n51.f.a(java.lang.Integer.valueOf(this.f218412s), java.lang.Integer.valueOf(o1Var.f218412s)) && n51.f.a(this.f218413t, o1Var.f218413t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.o1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218414u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218400d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218401e);
            }
            java.lang.String str = this.f218402f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f218403g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f218404h);
            }
            java.lang.String str2 = this.f218405i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218406m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218407n);
            }
            java.lang.String str3 = this.f218408o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f218409p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f218410q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f218411r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f218412s);
            }
            java.lang.String str4 = this.f218413t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218400d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f218401e);
            }
            java.lang.String str5 = this.f218402f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f218403g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f218404h);
            }
            java.lang.String str6 = this.f218405i;
            if (str6 != null && zArr[6]) {
                h17 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f218406m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f218407n);
            }
            java.lang.String str7 = this.f218408o;
            if (str7 != null && zArr[9]) {
                h17 += b36.f.j(9, str7);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f218409p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f218410q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f218411r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f218412s);
            }
            java.lang.String str8 = this.f218413t;
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
                this.f218400d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218401e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218402f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218403g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218404h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218405i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218406m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218407n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218408o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218409p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218410q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218411r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218412s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f218413t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.o1) super.parseFrom(bArr);
    }
}

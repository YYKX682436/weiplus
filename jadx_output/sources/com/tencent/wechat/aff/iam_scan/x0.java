package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class x0 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.x0 f217163v = new com.tencent.wechat.aff.iam_scan.x0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f217164d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217165e;

    /* renamed from: f, reason: collision with root package name */
    public int f217166f;

    /* renamed from: g, reason: collision with root package name */
    public int f217167g;

    /* renamed from: h, reason: collision with root package name */
    public int f217168h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217169i;

    /* renamed from: m, reason: collision with root package name */
    public int f217170m;

    /* renamed from: n, reason: collision with root package name */
    public int f217171n;

    /* renamed from: o, reason: collision with root package name */
    public int f217172o;

    /* renamed from: p, reason: collision with root package name */
    public int f217173p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f217174q;

    /* renamed from: r, reason: collision with root package name */
    public int f217175r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f217176s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f217177t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f217178u = new boolean[15];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.x0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.x0 x0Var = (com.tencent.wechat.aff.iam_scan.x0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f217164d), java.lang.Boolean.valueOf(x0Var.f217164d)) && n51.f.a(java.lang.Boolean.valueOf(this.f217165e), java.lang.Boolean.valueOf(x0Var.f217165e)) && n51.f.a(java.lang.Integer.valueOf(this.f217166f), java.lang.Integer.valueOf(x0Var.f217166f)) && n51.f.a(java.lang.Integer.valueOf(this.f217167g), java.lang.Integer.valueOf(x0Var.f217167g)) && n51.f.a(java.lang.Integer.valueOf(this.f217168h), java.lang.Integer.valueOf(x0Var.f217168h)) && n51.f.a(this.f217169i, x0Var.f217169i) && n51.f.a(java.lang.Integer.valueOf(this.f217170m), java.lang.Integer.valueOf(x0Var.f217170m)) && n51.f.a(java.lang.Integer.valueOf(this.f217171n), java.lang.Integer.valueOf(x0Var.f217171n)) && n51.f.a(java.lang.Integer.valueOf(this.f217172o), java.lang.Integer.valueOf(x0Var.f217172o)) && n51.f.a(java.lang.Integer.valueOf(this.f217173p), java.lang.Integer.valueOf(x0Var.f217173p)) && n51.f.a(this.f217174q, x0Var.f217174q) && n51.f.a(java.lang.Integer.valueOf(this.f217175r), java.lang.Integer.valueOf(x0Var.f217175r)) && n51.f.a(java.lang.Boolean.valueOf(this.f217176s), java.lang.Boolean.valueOf(x0Var.f217176s)) && n51.f.a(java.lang.Boolean.valueOf(this.f217177t), java.lang.Boolean.valueOf(x0Var.f217177t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.x0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217178u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f217164d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f217165e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f217166f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f217167g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f217168h);
            }
            java.lang.String str = this.f217169i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f217170m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217171n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217172o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f217173p);
            }
            java.lang.String str2 = this.f217174q;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            if (zArr[12]) {
                fVar.e(12, this.f217175r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f217176s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.a(14, this.f217177t);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f217164d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f217165e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f217166f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f217167g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f217168h);
            }
            java.lang.String str3 = this.f217169i;
            if (str3 != null && zArr[6]) {
                a17 += b36.f.j(6, str3);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f217170m);
            }
            if (zArr[8]) {
                a17 += b36.f.e(8, this.f217171n);
            }
            if (zArr[9]) {
                a17 += b36.f.e(9, this.f217172o);
            }
            if (zArr[10]) {
                a17 += b36.f.e(10, this.f217173p);
            }
            java.lang.String str4 = this.f217174q;
            if (str4 != null && zArr[11]) {
                a17 += b36.f.j(11, str4);
            }
            if (zArr[12]) {
                a17 += b36.f.e(12, this.f217175r);
            }
            if (zArr[13]) {
                a17 += b36.f.a(13, this.f217176s);
            }
            return zArr[14] ? a17 + b36.f.a(14, this.f217177t) : a17;
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
                this.f217164d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217165e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217166f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217167g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217168h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217169i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217170m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217171n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217172o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217173p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217174q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217175r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f217176s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f217177t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.x0) super.parseFrom(bArr);
    }
}

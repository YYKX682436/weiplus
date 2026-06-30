package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217018d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217019e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f217020f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f217021g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f217022h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f217023i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f217024m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f217025n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f217026o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f217027p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f217028q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f217029r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f217030s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f217031t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f217032u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f217033v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f217034w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f217035x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f217036y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f217037z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;

    static {
        new com.tencent.wechat.aff.iam_scan.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.g1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.g1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.g1)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.g1 g1Var = (com.tencent.wechat.aff.iam_scan.g1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217018d), java.lang.Integer.valueOf(g1Var.f217018d)) && n51.f.a(this.f217019e, g1Var.f217019e) && n51.f.a(java.lang.Integer.valueOf(this.f217020f), java.lang.Integer.valueOf(g1Var.f217020f)) && n51.f.a(java.lang.Integer.valueOf(this.f217021g), java.lang.Integer.valueOf(g1Var.f217021g)) && n51.f.a(java.lang.Integer.valueOf(this.f217022h), java.lang.Integer.valueOf(g1Var.f217022h)) && n51.f.a(java.lang.Integer.valueOf(this.f217023i), java.lang.Integer.valueOf(g1Var.f217023i)) && n51.f.a(java.lang.Boolean.valueOf(this.f217024m), java.lang.Boolean.valueOf(g1Var.f217024m)) && n51.f.a(java.lang.Integer.valueOf(this.f217025n), java.lang.Integer.valueOf(g1Var.f217025n)) && n51.f.a(java.lang.Boolean.valueOf(this.f217026o), java.lang.Boolean.valueOf(g1Var.f217026o)) && n51.f.a(java.lang.Boolean.valueOf(this.f217027p), java.lang.Boolean.valueOf(g1Var.f217027p)) && n51.f.a(java.lang.Boolean.valueOf(this.f217028q), java.lang.Boolean.valueOf(g1Var.f217028q)) && n51.f.a(java.lang.Boolean.valueOf(this.f217029r), java.lang.Boolean.valueOf(g1Var.f217029r)) && n51.f.a(java.lang.Boolean.valueOf(this.f217030s), java.lang.Boolean.valueOf(g1Var.f217030s)) && n51.f.a(java.lang.Integer.valueOf(this.f217031t), java.lang.Integer.valueOf(g1Var.f217031t)) && n51.f.a(java.lang.Integer.valueOf(this.f217032u), java.lang.Integer.valueOf(g1Var.f217032u)) && n51.f.a(java.lang.Integer.valueOf(this.f217033v), java.lang.Integer.valueOf(g1Var.f217033v)) && n51.f.a(java.lang.Boolean.valueOf(this.f217034w), java.lang.Boolean.valueOf(g1Var.f217034w)) && n51.f.a(java.lang.Integer.valueOf(this.f217035x), java.lang.Integer.valueOf(g1Var.f217035x)) && n51.f.a(java.lang.Integer.valueOf(this.f217036y), java.lang.Integer.valueOf(g1Var.f217036y)) && n51.f.a(java.lang.Integer.valueOf(this.f217037z), java.lang.Integer.valueOf(g1Var.f217037z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(g1Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(g1Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(g1Var.C));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f217018d);
            java.lang.String str = this.f217019e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f217020f);
            fVar.e(4, this.f217021g);
            fVar.e(5, this.f217022h);
            fVar.e(6, this.f217023i);
            fVar.a(7, this.f217024m);
            fVar.e(8, this.f217025n);
            fVar.a(9, this.f217026o);
            fVar.a(10, this.f217027p);
            fVar.a(11, this.f217028q);
            fVar.a(12, this.f217029r);
            fVar.a(13, this.f217030s);
            fVar.e(14, this.f217031t);
            fVar.e(15, this.f217032u);
            fVar.e(16, this.f217033v);
            fVar.a(17, this.f217034w);
            fVar.e(18, this.f217035x);
            fVar.e(19, this.f217036y);
            fVar.e(20, this.f217037z);
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            fVar.e(23, this.C);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f217018d) + 0;
            java.lang.String str2 = this.f217019e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f217020f) + b36.f.e(4, this.f217021g) + b36.f.e(5, this.f217022h) + b36.f.e(6, this.f217023i) + b36.f.a(7, this.f217024m) + b36.f.e(8, this.f217025n) + b36.f.a(9, this.f217026o) + b36.f.a(10, this.f217027p) + b36.f.a(11, this.f217028q) + b36.f.a(12, this.f217029r) + b36.f.a(13, this.f217030s) + b36.f.e(14, this.f217031t) + b36.f.e(15, this.f217032u) + b36.f.e(16, this.f217033v) + b36.f.a(17, this.f217034w) + b36.f.e(18, this.f217035x) + b36.f.e(19, this.f217036y) + b36.f.e(20, this.f217037z) + b36.f.e(21, this.A) + b36.f.e(22, this.B) + b36.f.e(23, this.C);
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
                this.f217018d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f217019e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f217020f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f217021g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f217022h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f217023i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f217024m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f217025n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f217026o = aVar2.c(intValue);
                return 0;
            case 10:
                this.f217027p = aVar2.c(intValue);
                return 0;
            case 11:
                this.f217028q = aVar2.c(intValue);
                return 0;
            case 12:
                this.f217029r = aVar2.c(intValue);
                return 0;
            case 13:
                this.f217030s = aVar2.c(intValue);
                return 0;
            case 14:
                this.f217031t = aVar2.g(intValue);
                return 0;
            case 15:
                this.f217032u = aVar2.g(intValue);
                return 0;
            case 16:
                this.f217033v = aVar2.g(intValue);
                return 0;
            case 17:
                this.f217034w = aVar2.c(intValue);
                return 0;
            case 18:
                this.f217035x = aVar2.g(intValue);
                return 0;
            case 19:
                this.f217036y = aVar2.g(intValue);
                return 0;
            case 20:
                this.f217037z = aVar2.g(intValue);
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

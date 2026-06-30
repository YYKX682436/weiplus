package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.i0 f215842y = new com.tencent.wechat.aff.affroam.i0();

    /* renamed from: d, reason: collision with root package name */
    public long f215843d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215844e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.o0 f215845f = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    public long f215846g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f215847h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f215848i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f215849m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f215850n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f215851o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f215852p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f215853q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f215854r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f215855s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f215856t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f215857u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f215858v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f215859w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f215860x = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.i0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.i0 i0Var = (com.tencent.wechat.aff.affroam.i0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215843d), java.lang.Long.valueOf(i0Var.f215843d)) && n51.f.a(this.f215844e, i0Var.f215844e) && n51.f.a(this.f215845f, i0Var.f215845f) && n51.f.a(java.lang.Long.valueOf(this.f215846g), java.lang.Long.valueOf(i0Var.f215846g)) && n51.f.a(java.lang.Long.valueOf(this.f215847h), java.lang.Long.valueOf(i0Var.f215847h)) && n51.f.a(java.lang.Long.valueOf(this.f215848i), java.lang.Long.valueOf(i0Var.f215848i)) && n51.f.a(java.lang.Long.valueOf(this.f215849m), java.lang.Long.valueOf(i0Var.f215849m)) && n51.f.a(java.lang.Long.valueOf(this.f215850n), java.lang.Long.valueOf(i0Var.f215850n)) && n51.f.a(java.lang.Long.valueOf(this.f215851o), java.lang.Long.valueOf(i0Var.f215851o)) && n51.f.a(java.lang.Long.valueOf(this.f215852p), java.lang.Long.valueOf(i0Var.f215852p)) && n51.f.a(java.lang.Long.valueOf(this.f215853q), java.lang.Long.valueOf(i0Var.f215853q)) && n51.f.a(java.lang.Long.valueOf(this.f215854r), java.lang.Long.valueOf(i0Var.f215854r)) && n51.f.a(java.lang.Long.valueOf(this.f215855s), java.lang.Long.valueOf(i0Var.f215855s)) && n51.f.a(java.lang.Long.valueOf(this.f215856t), java.lang.Long.valueOf(i0Var.f215856t)) && n51.f.a(java.lang.Long.valueOf(this.f215857u), java.lang.Long.valueOf(i0Var.f215857u)) && n51.f.a(java.lang.Long.valueOf(this.f215858v), java.lang.Long.valueOf(i0Var.f215858v)) && n51.f.a(java.lang.Long.valueOf(this.f215859w), java.lang.Long.valueOf(i0Var.f215859w)) && n51.f.a(java.lang.Long.valueOf(this.f215860x), java.lang.Long.valueOf(i0Var.f215860x));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.i0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215843d);
            java.lang.String str = this.f215844e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.wechat.aff.affroam.o0 o0Var = this.f215845f;
            if (o0Var != null) {
                fVar.e(3, o0Var.f215937d);
            }
            fVar.h(4, this.f215846g);
            fVar.h(5, this.f215847h);
            fVar.h(6, this.f215848i);
            fVar.h(7, this.f215849m);
            fVar.h(8, this.f215850n);
            fVar.h(9, this.f215851o);
            fVar.h(10, this.f215852p);
            fVar.h(11, this.f215853q);
            fVar.h(12, this.f215854r);
            fVar.h(13, this.f215855s);
            fVar.h(14, this.f215856t);
            fVar.h(15, this.f215857u);
            fVar.h(16, this.f215858v);
            fVar.h(17, this.f215859w);
            fVar.h(18, this.f215860x);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f215843d) + 0;
            java.lang.String str2 = this.f215844e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            com.tencent.wechat.aff.affroam.o0 o0Var2 = this.f215845f;
            if (o0Var2 != null) {
                h17 += b36.f.e(3, o0Var2.f215937d);
            }
            return h17 + b36.f.h(4, this.f215846g) + b36.f.h(5, this.f215847h) + b36.f.h(6, this.f215848i) + b36.f.h(7, this.f215849m) + b36.f.h(8, this.f215850n) + b36.f.h(9, this.f215851o) + b36.f.h(10, this.f215852p) + b36.f.h(11, this.f215853q) + b36.f.h(12, this.f215854r) + b36.f.h(13, this.f215855s) + b36.f.h(14, this.f215856t) + b36.f.h(15, this.f215857u) + b36.f.h(16, this.f215858v) + b36.f.h(17, this.f215859w) + b36.f.h(18, this.f215860x);
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
                this.f215843d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f215844e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f215845f = com.tencent.wechat.aff.affroam.o0.a(aVar2.g(intValue));
                return 0;
            case 4:
                this.f215846g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215847h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f215848i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f215849m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f215850n = aVar2.i(intValue);
                return 0;
            case 9:
                this.f215851o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f215852p = aVar2.i(intValue);
                return 0;
            case 11:
                this.f215853q = aVar2.i(intValue);
                return 0;
            case 12:
                this.f215854r = aVar2.i(intValue);
                return 0;
            case 13:
                this.f215855s = aVar2.i(intValue);
                return 0;
            case 14:
                this.f215856t = aVar2.i(intValue);
                return 0;
            case 15:
                this.f215857u = aVar2.i(intValue);
                return 0;
            case 16:
                this.f215858v = aVar2.i(intValue);
                return 0;
            case 17:
                this.f215859w = aVar2.i(intValue);
                return 0;
            case 18:
                this.f215860x = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.i0) super.parseFrom(bArr);
    }
}

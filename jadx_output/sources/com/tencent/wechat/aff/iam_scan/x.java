package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.x f217151r = new com.tencent.wechat.aff.iam_scan.x();

    /* renamed from: d, reason: collision with root package name */
    public long f217152d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f217153e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f217154f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f217155g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f217156h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f217157i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.u0 f217158m = new com.tencent.wechat.aff.iam_scan.u0();

    /* renamed from: n, reason: collision with root package name */
    public long f217159n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f217160o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f217161p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f217162q = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.x)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.x xVar = (com.tencent.wechat.aff.iam_scan.x) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217152d), java.lang.Long.valueOf(xVar.f217152d)) && n51.f.a(java.lang.Integer.valueOf(this.f217153e), java.lang.Integer.valueOf(xVar.f217153e)) && n51.f.a(java.lang.Integer.valueOf(this.f217154f), java.lang.Integer.valueOf(xVar.f217154f)) && n51.f.a(java.lang.Integer.valueOf(this.f217155g), java.lang.Integer.valueOf(xVar.f217155g)) && n51.f.a(java.lang.Integer.valueOf(this.f217156h), java.lang.Integer.valueOf(xVar.f217156h)) && n51.f.a(java.lang.Integer.valueOf(this.f217157i), java.lang.Integer.valueOf(xVar.f217157i)) && n51.f.a(this.f217158m, xVar.f217158m) && n51.f.a(java.lang.Long.valueOf(this.f217159n), java.lang.Long.valueOf(xVar.f217159n)) && n51.f.a(java.lang.Long.valueOf(this.f217160o), java.lang.Long.valueOf(xVar.f217160o)) && n51.f.a(java.lang.Long.valueOf(this.f217161p), java.lang.Long.valueOf(xVar.f217161p)) && n51.f.a(java.lang.Long.valueOf(this.f217162q), java.lang.Long.valueOf(xVar.f217162q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f217152d);
            fVar.e(2, this.f217153e);
            fVar.e(3, this.f217154f);
            fVar.e(4, this.f217155g);
            fVar.e(5, this.f217156h);
            fVar.e(6, this.f217157i);
            com.tencent.wechat.aff.iam_scan.u0 u0Var = this.f217158m;
            if (u0Var != null) {
                fVar.i(7, u0Var.computeSize());
                this.f217158m.writeFields(fVar);
            }
            fVar.h(8, this.f217159n);
            fVar.h(9, this.f217160o);
            fVar.h(10, this.f217161p);
            fVar.h(11, this.f217162q);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f217152d) + 0 + b36.f.e(2, this.f217153e) + b36.f.e(3, this.f217154f) + b36.f.e(4, this.f217155g) + b36.f.e(5, this.f217156h) + b36.f.e(6, this.f217157i);
            com.tencent.wechat.aff.iam_scan.u0 u0Var2 = this.f217158m;
            if (u0Var2 != null) {
                h17 += b36.f.i(7, u0Var2.computeSize());
            }
            return h17 + b36.f.h(8, this.f217159n) + b36.f.h(9, this.f217160o) + b36.f.h(10, this.f217161p) + b36.f.h(11, this.f217162q);
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
                this.f217152d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f217153e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f217154f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f217155g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f217156h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f217157i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.iam_scan.u0 u0Var3 = new com.tencent.wechat.aff.iam_scan.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.parseFrom(bArr);
                    }
                    this.f217158m = u0Var3;
                }
                return 0;
            case 8:
                this.f217159n = aVar2.i(intValue);
                return 0;
            case 9:
                this.f217160o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f217161p = aVar2.i(intValue);
                return 0;
            case 11:
                this.f217162q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.x) super.parseFrom(bArr);
    }
}

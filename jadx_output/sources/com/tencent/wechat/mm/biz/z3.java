package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class z3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218832d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218833e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218834f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218835g;

    /* renamed from: h, reason: collision with root package name */
    public int f218836h;

    /* renamed from: i, reason: collision with root package name */
    public int f218837i;

    /* renamed from: m, reason: collision with root package name */
    public int f218838m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f218839n = new boolean[8];

    static {
        new com.tencent.wechat.mm.biz.z3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.z3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.z3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.z3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.z3 z3Var = (com.tencent.wechat.mm.biz.z3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218832d), java.lang.Integer.valueOf(z3Var.f218832d)) && n51.f.a(this.f218833e, z3Var.f218833e) && n51.f.a(this.f218834f, z3Var.f218834f) && n51.f.a(this.f218835g, z3Var.f218835g) && n51.f.a(java.lang.Integer.valueOf(this.f218836h), java.lang.Integer.valueOf(z3Var.f218836h)) && n51.f.a(java.lang.Integer.valueOf(this.f218837i), java.lang.Integer.valueOf(z3Var.f218837i)) && n51.f.a(java.lang.Integer.valueOf(this.f218838m), java.lang.Integer.valueOf(z3Var.f218838m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.z3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218839n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218832d);
            }
            java.lang.String str = this.f218833e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218834f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f218835g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218836h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218837i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218838m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218832d) : 0;
            java.lang.String str4 = this.f218833e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f218834f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f218835g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f218836h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f218837i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f218838m) : e17;
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
                this.f218832d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218833e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218834f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218835g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218836h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218837i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218838m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

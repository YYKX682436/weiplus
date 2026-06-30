package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class u1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218673d;

    /* renamed from: e, reason: collision with root package name */
    public int f218674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218676g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218677h = new boolean[5];

    static {
        new com.tencent.wechat.mm.biz.u1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.u1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.u1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.u1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.u1 u1Var = (com.tencent.wechat.mm.biz.u1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218673d), java.lang.Integer.valueOf(u1Var.f218673d)) && n51.f.a(java.lang.Integer.valueOf(this.f218674e), java.lang.Integer.valueOf(u1Var.f218674e)) && n51.f.a(this.f218675f, u1Var.f218675f) && n51.f.a(this.f218676g, u1Var.f218676g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.u1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218677h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218673d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218674e);
            }
            java.lang.String str = this.f218675f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f218676g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218673d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f218674e);
            }
            java.lang.String str3 = this.f218675f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f218676g;
            return (str4 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str4);
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
        if (intValue == 1) {
            this.f218673d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218674e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218675f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f218676g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}

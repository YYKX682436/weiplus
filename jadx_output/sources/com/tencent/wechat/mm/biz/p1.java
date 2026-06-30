package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class p1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f218442d;

    /* renamed from: e, reason: collision with root package name */
    public int f218443e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f218444f = new boolean[3];

    static {
        new com.tencent.wechat.mm.biz.p1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.p1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.p1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.p1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.p1 p1Var = (com.tencent.wechat.mm.biz.p1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f218442d), java.lang.Boolean.valueOf(p1Var.f218442d)) && n51.f.a(java.lang.Integer.valueOf(this.f218443e), java.lang.Integer.valueOf(p1Var.f218443e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.p1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218444f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f218442d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218443e);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f218442d) : 0;
            return zArr[2] ? a17 + b36.f.e(2, this.f218443e) : a17;
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
            this.f218442d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f218443e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}

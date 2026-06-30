package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class p3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218466d;

    /* renamed from: e, reason: collision with root package name */
    public long f218467e;

    /* renamed from: f, reason: collision with root package name */
    public int f218468f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218469g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.p3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.p3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.p3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.p3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.p3 p3Var = (com.tencent.wechat.mm.biz.p3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218466d), java.lang.Long.valueOf(p3Var.f218466d)) && n51.f.a(java.lang.Long.valueOf(this.f218467e), java.lang.Long.valueOf(p3Var.f218467e)) && n51.f.a(java.lang.Integer.valueOf(this.f218468f), java.lang.Integer.valueOf(p3Var.f218468f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.p3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218469g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218466d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218467e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218468f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218466d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f218467e);
            }
            return zArr[3] ? h17 + b36.f.e(3, this.f218468f) : h17;
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
            this.f218466d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218467e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218468f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}

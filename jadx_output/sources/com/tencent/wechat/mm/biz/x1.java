package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class x1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218769d;

    /* renamed from: e, reason: collision with root package name */
    public int f218770e;

    /* renamed from: f, reason: collision with root package name */
    public int f218771f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218772g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.x1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.x1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.x1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.x1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.x1 x1Var = (com.tencent.wechat.mm.biz.x1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218769d), java.lang.Integer.valueOf(x1Var.f218769d)) && n51.f.a(java.lang.Integer.valueOf(this.f218770e), java.lang.Integer.valueOf(x1Var.f218770e)) && n51.f.a(java.lang.Integer.valueOf(this.f218771f), java.lang.Integer.valueOf(x1Var.f218771f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.x1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218772g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218769d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218770e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218771f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218769d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f218770e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f218771f) : e17;
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
            this.f218769d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218770e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218771f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}

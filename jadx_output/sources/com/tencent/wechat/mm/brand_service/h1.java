package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class h1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218947d;

    /* renamed from: e, reason: collision with root package name */
    public int f218948e;

    /* renamed from: f, reason: collision with root package name */
    public int f218949f;

    static {
        new com.tencent.wechat.mm.brand_service.h1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.h1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.h1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.h1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.h1 h1Var = (com.tencent.wechat.mm.brand_service.h1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218947d), java.lang.Integer.valueOf(h1Var.f218947d)) && n51.f.a(java.lang.Integer.valueOf(this.f218948e), java.lang.Integer.valueOf(h1Var.f218948e)) && n51.f.a(java.lang.Integer.valueOf(this.f218949f), java.lang.Integer.valueOf(h1Var.f218949f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.h1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218947d);
            fVar.e(2, this.f218948e);
            fVar.e(3, this.f218949f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f218947d) + 0 + b36.f.e(2, this.f218948e) + b36.f.e(3, this.f218949f);
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
            this.f218947d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218948e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218949f = aVar2.g(intValue);
        return 0;
    }
}

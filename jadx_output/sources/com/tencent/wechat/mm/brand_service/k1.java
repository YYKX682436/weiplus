package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class k1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f219012d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f219013e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f219014f = new java.util.LinkedList();

    static {
        new com.tencent.wechat.mm.brand_service.k1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.k1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.k1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.k1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.k1 k1Var = (com.tencent.wechat.mm.brand_service.k1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219012d), java.lang.Long.valueOf(k1Var.f219012d)) && n51.f.a(java.lang.Long.valueOf(this.f219013e), java.lang.Long.valueOf(k1Var.f219013e)) && n51.f.a(this.f219014f, k1Var.f219014f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.k1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219014f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f219012d);
            fVar.h(2, this.f219013e);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f219012d) + 0 + b36.f.h(2, this.f219013e) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f219012d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f219013e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        return 0;
    }
}

package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class j1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218995d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218996e = new java.util.LinkedList();

    static {
        new com.tencent.wechat.mm.brand_service.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.j1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.j1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.j1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.j1 j1Var = (com.tencent.wechat.mm.brand_service.j1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218995d), java.lang.Integer.valueOf(j1Var.f218995d)) && n51.f.a(this.f218996e, j1Var.f218996e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218996e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218995d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f218995d) + 0 + b36.f.g(2, 8, linkedList);
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
            this.f218995d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.brand_service.i1 i1Var = new com.tencent.wechat.mm.brand_service.i1();
            if (bArr != null && bArr.length > 0) {
                i1Var.parseFrom(bArr);
            }
            linkedList.add(i1Var);
        }
        return 0;
    }
}

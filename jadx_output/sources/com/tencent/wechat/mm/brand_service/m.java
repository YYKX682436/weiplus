package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219042d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.m1 f219043e = new com.tencent.wechat.mm.brand_service.m1();

    static {
        new com.tencent.wechat.mm.brand_service.m();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.m parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.m) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.m)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.m mVar = (com.tencent.wechat.mm.brand_service.m) fVar;
        return n51.f.a(this.f219042d, mVar.f219042d) && n51.f.a(this.f219043e, mVar.f219043e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219042d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.tencent.wechat.mm.brand_service.m1 m1Var = this.f219043e;
            if (m1Var != null) {
                fVar.i(2, m1Var.computeSize());
                this.f219043e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.tencent.wechat.mm.brand_service.m1 m1Var2 = this.f219043e;
            return m1Var2 != null ? g17 + b36.f.i(2, m1Var2.computeSize()) : g17;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.brand_service.l lVar = new com.tencent.wechat.mm.brand_service.l();
                if (bArr != null && bArr.length > 0) {
                    lVar.parseFrom(bArr);
                }
                linkedList.add(lVar);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.brand_service.m1 m1Var3 = new com.tencent.wechat.mm.brand_service.m1();
            if (bArr2 != null && bArr2.length > 0) {
                m1Var3.parseFrom(bArr2);
            }
            this.f219043e = m1Var3;
        }
        return 0;
    }
}

package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class r3 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.r3 f218521f = new com.tencent.wechat.mm.biz.r3();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218522d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f218523e = new boolean[2];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.mm.biz.r3) && n51.f.a(this.f218522d, ((com.tencent.wechat.mm.biz.r3) fVar).f218522d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.r3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218522d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0;
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.q3 q3Var = new com.tencent.wechat.mm.biz.q3();
            if (bArr != null && bArr.length > 0) {
                q3Var.parseFrom(bArr);
            }
            linkedList.add(q3Var);
        }
        this.f218523e[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.r3) super.parseFrom(bArr);
    }
}

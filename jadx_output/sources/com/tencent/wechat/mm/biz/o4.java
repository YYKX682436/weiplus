package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class o4 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.o4 f218433f = new com.tencent.wechat.mm.biz.o4();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218434d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f218435e = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.o4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.o4 o4Var = (com.tencent.wechat.mm.biz.o4) fVar;
        return n51.f.a(this.f218434d, o4Var.f218434d) && n51.f.a(java.lang.Integer.valueOf(this.f218435e), java.lang.Integer.valueOf(o4Var.f218435e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.o4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218434d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f218435e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f218435e);
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
            if (intValue != 2) {
                return -1;
            }
            this.f218435e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.n4 n4Var = new com.tencent.wechat.mm.biz.n4();
            if (bArr != null && bArr.length > 0) {
                n4Var.parseFrom(bArr);
            }
            linkedList.add(n4Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.o4) super.parseFrom(bArr);
    }
}

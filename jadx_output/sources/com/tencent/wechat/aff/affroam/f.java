package com.tencent.wechat.aff.affroam;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.f f215823h = new com.tencent.wechat.aff.affroam.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f215824d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f215825e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f215826f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f215827g = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.f)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.f fVar2 = (com.tencent.wechat.aff.affroam.f) fVar;
        return n51.f.a(this.f215824d, fVar2.f215824d) && n51.f.a(this.f215825e, fVar2.f215825e) && n51.f.a(java.lang.Boolean.valueOf(this.f215826f), java.lang.Boolean.valueOf(fVar2.f215826f)) && n51.f.a(java.lang.Integer.valueOf(this.f215827g), java.lang.Integer.valueOf(fVar2.f215827g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f215825e;
        java.util.LinkedList linkedList2 = this.f215824d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.g(2, 3, linkedList);
            fVar.a(3, this.f215826f);
            fVar.e(4, this.f215827g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList2) + 0 + b36.f.g(2, 3, linkedList) + b36.f.a(3, this.f215826f) + b36.f.e(4, this.f215827g);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            linkedList2.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 3) {
            this.f215826f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f215827g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.f) super.parseFrom(bArr);
    }
}

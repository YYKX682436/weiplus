package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class x4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218778d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218779e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f218780f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218781g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.x4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.x4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.x4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.x4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.x4 x4Var = (com.tencent.wechat.mm.biz.x4) fVar;
        return n51.f.a(this.f218778d, x4Var.f218778d) && n51.f.a(this.f218779e, x4Var.f218779e) && n51.f.a(this.f218780f, x4Var.f218780f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.x4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218780f;
        java.util.LinkedList linkedList2 = this.f218779e;
        java.util.LinkedList linkedList3 = this.f218778d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
        boolean[] zArr = this.f218781g;
        if (intValue != 1) {
            if (intValue == 2) {
                linkedList2.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.q1 q1Var = new com.tencent.wechat.mm.biz.q1();
            if (bArr != null && bArr.length > 0) {
                q1Var.parseFrom(bArr);
            }
            linkedList3.add(q1Var);
        }
        zArr[1] = true;
        return 0;
    }
}

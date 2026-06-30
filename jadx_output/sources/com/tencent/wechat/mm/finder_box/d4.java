package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class d4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f219377d;

    /* renamed from: e, reason: collision with root package name */
    public long f219378e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f219379f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219380g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.d4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.d4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.d4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.d4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.d4 d4Var = (com.tencent.wechat.mm.finder_box.d4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219377d), java.lang.Long.valueOf(d4Var.f219377d)) && n51.f.a(java.lang.Long.valueOf(this.f219378e), java.lang.Long.valueOf(d4Var.f219378e)) && n51.f.a(this.f219379f, d4Var.f219379f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.d4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219379f;
        boolean[] zArr = this.f219380g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219377d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f219378e);
            }
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f219377d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f219378e);
            }
            return h17 + b36.f.g(3, 1, linkedList);
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
            this.f219377d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219378e = aVar2.i(intValue);
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
}

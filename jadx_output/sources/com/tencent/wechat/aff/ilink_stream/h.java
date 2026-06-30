package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217287d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f217288e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f217289f = new boolean[3];

    static {
        new com.tencent.wechat.aff.ilink_stream.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.h)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.h hVar = (com.tencent.wechat.aff.ilink_stream.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217287d), java.lang.Integer.valueOf(hVar.f217287d)) && n51.f.a(this.f217288e, hVar.f217288e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217288e;
        boolean[] zArr = this.f217289f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217287d);
            }
            fVar.g(2, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.e(1, this.f217287d) : 0) + b36.f.g(2, 2, linkedList);
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
            this.f217287d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.h) super.parseFrom(bArr);
    }
}

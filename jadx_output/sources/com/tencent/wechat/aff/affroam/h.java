package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f215838d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f215839e = 0;

    static {
        new com.tencent.wechat.aff.affroam.h();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.h parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.h) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.h)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.h hVar = (com.tencent.wechat.aff.affroam.h) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215838d), java.lang.Long.valueOf(hVar.f215838d)) && n51.f.a(java.lang.Integer.valueOf(this.f215839e), java.lang.Integer.valueOf(hVar.f215839e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215838d);
            fVar.e(2, this.f215839e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f215838d) + 0 + b36.f.e(2, this.f215839e);
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
            this.f215838d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f215839e = aVar2.g(intValue);
        return 0;
    }
}

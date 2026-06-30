package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f215929d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f215930e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f215931f = 0;

    static {
        new com.tencent.wechat.aff.affroam.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.o)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.o oVar = (com.tencent.wechat.aff.affroam.o) fVar;
        return n51.f.a(this.f215929d, oVar.f215929d) && n51.f.a(java.lang.Boolean.valueOf(this.f215930e), java.lang.Boolean.valueOf(oVar.f215930e)) && n51.f.a(java.lang.Long.valueOf(this.f215931f), java.lang.Long.valueOf(oVar.f215931f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f215929d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f215930e);
            fVar.h(3, this.f215931f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f215930e) + b36.f.h(3, this.f215931f);
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
            if (intValue == 2) {
                this.f215930e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f215931f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.affroam.s sVar = new com.tencent.wechat.aff.affroam.s();
            if (bArr != null && bArr.length > 0) {
                sVar.parseFrom(bArr);
            }
            linkedList.add(sVar);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.o) super.parseFrom(bArr);
    }
}

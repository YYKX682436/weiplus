package com.tencent.wechat.aff.affroam;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.d f215808g = new com.tencent.wechat.aff.affroam.d();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.c f215809d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f215810e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f215811f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.d)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.d dVar = (com.tencent.wechat.aff.affroam.d) fVar;
        return n51.f.a(this.f215809d, dVar.f215809d) && n51.f.a(this.f215810e, dVar.f215810e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f215811f;
        java.util.LinkedList linkedList = this.f215810e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.affroam.c cVar = this.f215809d;
            if (cVar != null && zArr[1]) {
                fVar.i(1, cVar.computeSize());
                this.f215809d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.affroam.c cVar2 = this.f215809d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, cVar2.computeSize());
            }
            return i18 + b36.f.g(2, 8, linkedList);
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.affroam.c cVar3 = new com.tencent.wechat.aff.affroam.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.parseFrom(bArr);
                }
                this.f215809d = cVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.aff.affroam.a aVar3 = new com.tencent.wechat.aff.affroam.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.parseFrom(bArr2);
            }
            linkedList.add(aVar3);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.d) super.parseFrom(bArr);
    }
}

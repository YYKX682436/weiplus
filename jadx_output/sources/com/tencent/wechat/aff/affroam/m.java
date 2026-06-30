package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.k f215898d = new com.tencent.wechat.aff.affroam.k();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.k f215899e = new com.tencent.wechat.aff.affroam.k();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f215900f = new java.util.LinkedList();

    static {
        new com.tencent.wechat.aff.affroam.m();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.m parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.m) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.m)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.m mVar = (com.tencent.wechat.aff.affroam.m) fVar;
        return n51.f.a(this.f215898d, mVar.f215898d) && n51.f.a(this.f215899e, mVar.f215899e) && n51.f.a(this.f215900f, mVar.f215900f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f215900f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.affroam.k kVar = this.f215898d;
            if (kVar != null) {
                fVar.i(1, kVar.computeSize());
                this.f215898d.writeFields(fVar);
            }
            com.tencent.wechat.aff.affroam.k kVar2 = this.f215899e;
            if (kVar2 != null) {
                fVar.i(2, kVar2.computeSize());
                this.f215899e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.affroam.k kVar3 = this.f215898d;
            int i18 = kVar3 != null ? 0 + b36.f.i(1, kVar3.computeSize()) : 0;
            com.tencent.wechat.aff.affroam.k kVar4 = this.f215899e;
            if (kVar4 != null) {
                i18 += b36.f.i(2, kVar4.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
                com.tencent.wechat.aff.affroam.k kVar5 = new com.tencent.wechat.aff.affroam.k();
                if (bArr != null && bArr.length > 0) {
                    kVar5.parseFrom(bArr);
                }
                this.f215898d = kVar5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.aff.affroam.k kVar6 = new com.tencent.wechat.aff.affroam.k();
                if (bArr2 != null && bArr2.length > 0) {
                    kVar6.parseFrom(bArr2);
                }
                this.f215899e = kVar6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.wechat.aff.affroam.l lVar = new com.tencent.wechat.aff.affroam.l();
            if (bArr3 != null && bArr3.length > 0) {
                lVar.parseFrom(bArr3);
            }
            linkedList.add(lVar);
        }
        return 0;
    }
}

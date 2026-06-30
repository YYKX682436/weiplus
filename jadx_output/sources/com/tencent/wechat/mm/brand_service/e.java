package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.k f218879d = new com.tencent.wechat.mm.brand_service.k();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218880e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.j f218881f = new com.tencent.wechat.mm.brand_service.j();

    static {
        new com.tencent.wechat.mm.brand_service.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.e)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.e eVar = (com.tencent.wechat.mm.brand_service.e) fVar;
        return n51.f.a(this.f218879d, eVar.f218879d) && n51.f.a(this.f218880e, eVar.f218880e) && n51.f.a(this.f218881f, eVar.f218881f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218880e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.brand_service.k kVar = this.f218879d;
            if (kVar != null) {
                fVar.i(1, kVar.computeSize());
                this.f218879d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.wechat.mm.brand_service.j jVar = this.f218881f;
            if (jVar != null) {
                fVar.i(3, jVar.computeSize());
                this.f218881f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.brand_service.k kVar2 = this.f218879d;
            int i18 = (kVar2 != null ? 0 + b36.f.i(1, kVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.wechat.mm.brand_service.j jVar2 = this.f218881f;
            return jVar2 != null ? i18 + b36.f.i(3, jVar2.computeSize()) : i18;
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
                com.tencent.wechat.mm.brand_service.k kVar3 = new com.tencent.wechat.mm.brand_service.k();
                if (bArr != null && bArr.length > 0) {
                    kVar3.parseFrom(bArr);
                }
                this.f218879d = kVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.mm.brand_service.c cVar = new com.tencent.wechat.mm.brand_service.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar.parseFrom(bArr2);
                }
                linkedList.add(cVar);
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
            com.tencent.wechat.mm.brand_service.j jVar3 = new com.tencent.wechat.mm.brand_service.j();
            if (bArr3 != null && bArr3.length > 0) {
                jVar3.parseFrom(bArr3);
            }
            this.f218881f = jVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.e) super.parseFrom(bArr);
    }
}

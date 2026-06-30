package com.tencent.wechat.aff.magicbrush;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.magicbrush.c f217370d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217372f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f217371e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217373g = new boolean[4];

    static {
        new com.tencent.wechat.aff.magicbrush.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.magicbrush.b)) {
            return false;
        }
        com.tencent.wechat.aff.magicbrush.b bVar = (com.tencent.wechat.aff.magicbrush.b) fVar;
        return n51.f.a(this.f217370d, bVar.f217370d) && n51.f.a(this.f217371e, bVar.f217371e) && n51.f.a(java.lang.Boolean.valueOf(this.f217372f), java.lang.Boolean.valueOf(bVar.f217372f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.magicbrush.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217373g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.magicbrush.c cVar = this.f217370d;
            if (cVar != null && zArr[1]) {
                fVar.i(1, cVar.computeSize());
                this.f217370d.writeFields(fVar);
            }
            fVar.g(2, 8, this.f217371e);
            if (zArr[3]) {
                fVar.a(3, this.f217372f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.magicbrush.c cVar2 = this.f217370d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, cVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, this.f217371e);
            return zArr[3] ? g17 + b36.f.a(3, this.f217372f) : g17;
        }
        if (i17 == 2) {
            this.f217371e.clear();
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
                com.tencent.wechat.aff.magicbrush.c cVar3 = new com.tencent.wechat.aff.magicbrush.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.parseFrom(bArr);
                }
                this.f217370d = cVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f217372f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.aff.magicbrush.a aVar3 = new com.tencent.wechat.aff.magicbrush.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.parseFrom(bArr2);
            }
            this.f217371e.add(aVar3);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.magicbrush.b) super.parseFrom(bArr);
    }
}

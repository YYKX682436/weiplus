package com.tencent.wechat.aff.favorites;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.e f216754g = new com.tencent.wechat.aff.favorites.e();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.d f216755d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216756e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216757f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.e)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.e eVar = (com.tencent.wechat.aff.favorites.e) fVar;
        return n51.f.a(this.f216755d, eVar.f216755d) && n51.f.a(java.lang.Boolean.valueOf(this.f216756e), java.lang.Boolean.valueOf(eVar.f216756e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216757f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.favorites.d dVar = this.f216755d;
            if (dVar != null && zArr[1]) {
                fVar.i(1, dVar.computeSize());
                this.f216755d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f216756e);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.favorites.d dVar2 = this.f216755d;
            if (dVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dVar2.computeSize());
            }
            return zArr[2] ? i18 + b36.f.a(2, this.f216756e) : i18;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f216756e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.favorites.d dVar3 = new com.tencent.wechat.aff.favorites.d();
            if (bArr != null && bArr.length > 0) {
                dVar3.parseFrom(bArr);
            }
            this.f216755d = dVar3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.e) super.parseFrom(bArr);
    }
}

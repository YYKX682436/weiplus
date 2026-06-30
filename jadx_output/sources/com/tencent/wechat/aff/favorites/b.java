package com.tencent.wechat.aff.favorites;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.b f216737h = new com.tencent.wechat.aff.favorites.b();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.a f216738d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216739e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f216740f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216741g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.b)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.b bVar = (com.tencent.wechat.aff.favorites.b) fVar;
        return n51.f.a(this.f216738d, bVar.f216738d) && n51.f.a(java.lang.Boolean.valueOf(this.f216739e), java.lang.Boolean.valueOf(bVar.f216739e)) && n51.f.a(java.lang.Boolean.valueOf(this.f216740f), java.lang.Boolean.valueOf(bVar.f216740f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216741g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.favorites.a aVar = this.f216738d;
            if (aVar != null && zArr[1]) {
                fVar.i(1, aVar.computeSize());
                this.f216738d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f216739e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f216740f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.favorites.a aVar2 = this.f216738d;
            if (aVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f216739e);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f216740f) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                this.f216739e = aVar4.c(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f216740f = aVar4.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar4.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.favorites.a aVar5 = new com.tencent.wechat.aff.favorites.a();
            if (bArr != null && bArr.length > 0) {
                aVar5.parseFrom(bArr);
            }
            this.f216738d = aVar5;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.b) super.parseFrom(bArr);
    }
}

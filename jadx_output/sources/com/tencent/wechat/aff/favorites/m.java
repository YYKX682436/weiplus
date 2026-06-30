package com.tencent.wechat.aff.favorites;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.m f216832i = new com.tencent.wechat.aff.favorites.m();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.l f216833d;

    /* renamed from: e, reason: collision with root package name */
    public int f216834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216835f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216836g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216837h = new boolean[5];

    public java.lang.String b() {
        return this.f216837h[3] ? this.f216835f : "";
    }

    public com.tencent.wechat.aff.favorites.l c() {
        return this.f216837h[1] ? this.f216833d : new com.tencent.wechat.aff.favorites.l();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.m)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.m mVar = (com.tencent.wechat.aff.favorites.m) fVar;
        return n51.f.a(this.f216833d, mVar.f216833d) && n51.f.a(java.lang.Integer.valueOf(this.f216834e), java.lang.Integer.valueOf(mVar.f216834e)) && n51.f.a(this.f216835f, mVar.f216835f) && n51.f.a(java.lang.Boolean.valueOf(this.f216836g), java.lang.Boolean.valueOf(mVar.f216836g));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.m parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.m) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216837h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.favorites.l lVar = this.f216833d;
            if (lVar != null && zArr[1]) {
                fVar.i(1, lVar.computeSize());
                this.f216833d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f216834e);
            }
            java.lang.String str = this.f216835f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.a(4, this.f216836g);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.favorites.l lVar2 = this.f216833d;
            if (lVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f216834e);
            }
            java.lang.String str2 = this.f216835f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f216836g) : i18;
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
            if (intValue == 2) {
                this.f216834e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f216835f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f216836g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.favorites.l lVar3 = new com.tencent.wechat.aff.favorites.l();
            if (bArr != null && bArr.length > 0) {
                lVar3.parseFrom(bArr);
            }
            this.f216833d = lVar3;
        }
        zArr[1] = true;
        return 0;
    }
}

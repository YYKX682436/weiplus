package com.tencent.wechat.aff.favorites;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.n f216838h = new com.tencent.wechat.aff.favorites.n();

    /* renamed from: d, reason: collision with root package name */
    public int f216839d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216840e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.m f216841f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216842g = new boolean[4];

    public com.tencent.wechat.aff.favorites.m b() {
        return this.f216842g[3] ? this.f216841f : new com.tencent.wechat.aff.favorites.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.n)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.n nVar = (com.tencent.wechat.aff.favorites.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216839d), java.lang.Integer.valueOf(nVar.f216839d)) && n51.f.a(this.f216840e, nVar.f216840e) && n51.f.a(this.f216841f, nVar.f216841f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.n();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216842g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216839d);
            }
            java.lang.String str = this.f216840e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.wechat.aff.favorites.m mVar = this.f216841f;
            if (mVar != null && zArr[3]) {
                fVar.i(3, mVar.computeSize());
                this.f216841f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216839d) : 0;
            java.lang.String str2 = this.f216840e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.wechat.aff.favorites.m mVar2 = this.f216841f;
            return (mVar2 == null || !zArr[3]) ? e17 : e17 + b36.f.i(3, mVar2.computeSize());
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
            this.f216839d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216840e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.favorites.m mVar3 = new com.tencent.wechat.aff.favorites.m();
            if (bArr != null && bArr.length > 0) {
                mVar3.parseFrom(bArr);
            }
            this.f216841f = mVar3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.n) super.parseFrom(bArr);
    }
}

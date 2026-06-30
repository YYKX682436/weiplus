package com.tencent.wechat.aff.favorites;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.o f216843h = new com.tencent.wechat.aff.favorites.o();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216844d;

    /* renamed from: e, reason: collision with root package name */
    public float f216845e;

    /* renamed from: f, reason: collision with root package name */
    public float f216846f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216847g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.o)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.o oVar = (com.tencent.wechat.aff.favorites.o) fVar;
        return n51.f.a(this.f216844d, oVar.f216844d) && n51.f.a(java.lang.Float.valueOf(this.f216845e), java.lang.Float.valueOf(oVar.f216845e)) && n51.f.a(java.lang.Float.valueOf(this.f216846f), java.lang.Float.valueOf(oVar.f216846f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216847g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216844d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f216845e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f216846f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f216844d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f216845e);
            }
            return zArr[3] ? i18 + b36.f.d(3, this.f216846f) : i18;
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
            this.f216844d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216845e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f216846f = aVar2.f(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.o) super.parseFrom(bArr);
    }
}

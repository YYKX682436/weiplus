package com.tencent.wechat.aff.favorites;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.i f216791m = new com.tencent.wechat.aff.favorites.i();

    /* renamed from: d, reason: collision with root package name */
    public int f216792d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f216794f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216795g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216796h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216797i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.i)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.i iVar = (com.tencent.wechat.aff.favorites.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216792d), java.lang.Integer.valueOf(iVar.f216792d)) && n51.f.a(java.lang.Boolean.valueOf(this.f216793e), java.lang.Boolean.valueOf(iVar.f216793e)) && n51.f.a(java.lang.Boolean.valueOf(this.f216794f), java.lang.Boolean.valueOf(iVar.f216794f)) && n51.f.a(java.lang.Boolean.valueOf(this.f216795g), java.lang.Boolean.valueOf(iVar.f216795g)) && n51.f.a(java.lang.Boolean.valueOf(this.f216796h), java.lang.Boolean.valueOf(iVar.f216796h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216797i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216792d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f216793e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f216794f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f216795g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f216796h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216792d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f216793e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f216794f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f216795g);
            }
            return zArr[5] ? e17 + b36.f.a(5, this.f216796h) : e17;
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
            this.f216792d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216793e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216794f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f216795g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f216796h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.i) super.parseFrom(bArr);
    }
}

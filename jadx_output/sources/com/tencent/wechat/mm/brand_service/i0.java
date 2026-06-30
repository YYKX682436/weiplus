package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.i0 f218962h = new com.tencent.wechat.mm.brand_service.i0();

    /* renamed from: d, reason: collision with root package name */
    public int f218963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218964e;

    /* renamed from: f, reason: collision with root package name */
    public int f218965f;

    /* renamed from: g, reason: collision with root package name */
    public int f218966g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.i0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.i0 i0Var = (com.tencent.wechat.mm.brand_service.i0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218963d), java.lang.Integer.valueOf(i0Var.f218963d)) && n51.f.a(this.f218964e, i0Var.f218964e) && n51.f.a(java.lang.Integer.valueOf(this.f218965f), java.lang.Integer.valueOf(i0Var.f218965f)) && n51.f.a(java.lang.Integer.valueOf(this.f218966g), java.lang.Integer.valueOf(i0Var.f218966g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.i0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218963d);
            java.lang.String str = this.f218964e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f218965f);
            fVar.e(4, this.f218966g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f218963d) + 0;
            java.lang.String str2 = this.f218964e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f218965f) + b36.f.e(4, this.f218966g);
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
            this.f218963d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218964e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f218965f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f218966g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.i0) super.parseFrom(bArr);
    }
}

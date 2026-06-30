package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217218d;

    /* renamed from: e, reason: collision with root package name */
    public int f217219e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217220f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f217221g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f217222h = new boolean[5];

    static {
        new com.tencent.wechat.aff.ilink_stream.a0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.a0)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.a0 a0Var = (com.tencent.wechat.aff.ilink_stream.a0) fVar;
        return n51.f.a(this.f217218d, a0Var.f217218d) && n51.f.a(java.lang.Integer.valueOf(this.f217219e), java.lang.Integer.valueOf(a0Var.f217219e)) && n51.f.a(this.f217220f, a0Var.f217220f) && n51.f.a(java.lang.Boolean.valueOf(this.f217221g), java.lang.Boolean.valueOf(a0Var.f217221g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.a0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217222h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217218d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f217219e);
            }
            com.tencent.mm.protobuf.g gVar = this.f217220f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f217221g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f217218d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f217219e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f217220f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f217221g) : i18;
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
            this.f217218d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217219e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217220f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f217221g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.a0) super.parseFrom(bArr);
    }
}

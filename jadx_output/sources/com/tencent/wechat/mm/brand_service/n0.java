package com.tencent.wechat.mm.brand_service;

/* loaded from: classes4.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219080d;

    /* renamed from: e, reason: collision with root package name */
    public int f219081e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.m0 f219082f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219083g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219084h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f219085i;

    /* renamed from: m, reason: collision with root package name */
    public int f219086m;

    static {
        new com.tencent.wechat.mm.brand_service.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.n0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.n0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.n0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.n0 n0Var = (com.tencent.wechat.mm.brand_service.n0) fVar;
        return n51.f.a(this.f219080d, n0Var.f219080d) && n51.f.a(java.lang.Integer.valueOf(this.f219081e), java.lang.Integer.valueOf(n0Var.f219081e)) && n51.f.a(this.f219082f, n0Var.f219082f) && n51.f.a(this.f219083g, n0Var.f219083g) && n51.f.a(this.f219084h, n0Var.f219084h) && n51.f.a(java.lang.Boolean.valueOf(this.f219085i), java.lang.Boolean.valueOf(n0Var.f219085i)) && n51.f.a(java.lang.Integer.valueOf(this.f219086m), java.lang.Integer.valueOf(n0Var.f219086m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219080d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f219081e);
            com.tencent.wechat.mm.brand_service.m0 m0Var = this.f219082f;
            if (m0Var != null) {
                fVar.i(3, m0Var.computeSize());
                this.f219082f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f219083g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f219084h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(7, this.f219085i);
            fVar.e(8, this.f219086m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219080d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f219081e);
            com.tencent.wechat.mm.brand_service.m0 m0Var2 = this.f219082f;
            if (m0Var2 != null) {
                j17 += b36.f.i(3, m0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219083g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.f219084h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.a(7, this.f219085i) + b36.f.e(8, this.f219086m);
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
        switch (intValue) {
            case 1:
                this.f219080d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f219081e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.m0 m0Var3 = new com.tencent.wechat.mm.brand_service.m0();
                    if (bArr != null && bArr.length > 0) {
                        m0Var3.parseFrom(bArr);
                    }
                    this.f219082f = m0Var3;
                }
                return 0;
            case 4:
                this.f219083g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f219084h = aVar2.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f219085i = aVar2.c(intValue);
                return 0;
            case 8:
                this.f219086m = aVar2.g(intValue);
                return 0;
        }
    }
}

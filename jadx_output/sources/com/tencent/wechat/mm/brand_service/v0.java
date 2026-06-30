package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class v0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219204e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219205f;

    static {
        new com.tencent.wechat.mm.brand_service.v0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.v0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.v0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.v0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.v0 v0Var = (com.tencent.wechat.mm.brand_service.v0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219203d), java.lang.Integer.valueOf(v0Var.f219203d)) && n51.f.a(this.f219204e, v0Var.f219204e) && n51.f.a(this.f219205f, v0Var.f219205f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.v0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219203d);
            java.lang.String str = this.f219204e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219205f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f219203d) + 0;
            java.lang.String str3 = this.f219204e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f219205f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
            this.f219203d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f219204e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f219205f = aVar2.k(intValue);
        return 0;
    }
}

package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class f1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218904d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218906f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218907g;

    /* renamed from: h, reason: collision with root package name */
    public int f218908h;

    static {
        new com.tencent.wechat.mm.brand_service.f1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.f1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.f1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.f1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.f1 f1Var = (com.tencent.wechat.mm.brand_service.f1) fVar;
        return n51.f.a(this.f218904d, f1Var.f218904d) && n51.f.a(this.f218905e, f1Var.f218905e) && n51.f.a(this.f218906f, f1Var.f218906f) && n51.f.a(this.f218907g, f1Var.f218907g) && n51.f.a(java.lang.Integer.valueOf(this.f218908h), java.lang.Integer.valueOf(f1Var.f218908h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.f1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218904d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218905e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218906f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218907g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f218908h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f218904d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f218905e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f218906f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f218907g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f218908h);
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
            this.f218904d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218905e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f218906f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f218907g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f218908h = aVar2.g(intValue);
        return 0;
    }
}

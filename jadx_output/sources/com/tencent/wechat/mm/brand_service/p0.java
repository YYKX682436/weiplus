package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219141d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219142e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219143f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219144g;

    /* renamed from: h, reason: collision with root package name */
    public int f219145h;

    /* renamed from: i, reason: collision with root package name */
    public int f219146i;

    /* renamed from: m, reason: collision with root package name */
    public int f219147m;

    static {
        new com.tencent.wechat.mm.brand_service.p0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.p0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.p0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.p0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.p0 p0Var = (com.tencent.wechat.mm.brand_service.p0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219141d), java.lang.Integer.valueOf(p0Var.f219141d)) && n51.f.a(this.f219142e, p0Var.f219142e) && n51.f.a(this.f219143f, p0Var.f219143f) && n51.f.a(this.f219144g, p0Var.f219144g) && n51.f.a(java.lang.Integer.valueOf(this.f219145h), java.lang.Integer.valueOf(p0Var.f219145h)) && n51.f.a(java.lang.Integer.valueOf(this.f219146i), java.lang.Integer.valueOf(p0Var.f219146i)) && n51.f.a(java.lang.Integer.valueOf(this.f219147m), java.lang.Integer.valueOf(p0Var.f219147m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.p0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219141d);
            java.lang.String str = this.f219142e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219143f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219144g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f219145h);
            fVar.e(6, this.f219146i);
            fVar.e(7, this.f219147m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f219141d) + 0;
            java.lang.String str4 = this.f219142e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f219143f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f219144g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f219145h) + b36.f.e(6, this.f219146i) + b36.f.e(7, this.f219147m);
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
                this.f219141d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f219142e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f219143f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f219144g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219145h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219146i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f219147m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

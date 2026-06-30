package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class c1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218862d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218863e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.a1 f218864f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218865g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.b1 f218866h;

    static {
        new com.tencent.wechat.mm.brand_service.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.c1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.c1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.c1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.c1 c1Var = (com.tencent.wechat.mm.brand_service.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218862d), java.lang.Integer.valueOf(c1Var.f218862d)) && n51.f.a(this.f218863e, c1Var.f218863e) && n51.f.a(this.f218864f, c1Var.f218864f) && n51.f.a(this.f218865g, c1Var.f218865g) && n51.f.a(this.f218866h, c1Var.f218866h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218863e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218862d);
            fVar.g(2, 8, linkedList);
            com.tencent.wechat.mm.brand_service.a1 a1Var = this.f218864f;
            if (a1Var != null) {
                fVar.i(3, a1Var.computeSize());
                this.f218864f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f218865g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.wechat.mm.brand_service.b1 b1Var = this.f218866h;
            if (b1Var != null) {
                fVar.e(5, b1Var.f218856d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f218862d) + 0 + b36.f.g(2, 8, linkedList);
            com.tencent.wechat.mm.brand_service.a1 a1Var2 = this.f218864f;
            if (a1Var2 != null) {
                e17 += b36.f.i(3, a1Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f218865g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            com.tencent.wechat.mm.brand_service.b1 b1Var2 = this.f218866h;
            return b1Var2 != null ? e17 + b36.f.e(5, b1Var2.f218856d) : e17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f218862d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.brand_service.x0 x0Var = new com.tencent.wechat.mm.brand_service.x0();
                if (bArr != null && bArr.length > 0) {
                    x0Var.parseFrom(bArr);
                }
                linkedList.add(x0Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f218865g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            int g17 = aVar2.g(intValue);
            this.f218866h = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.brand_service.b1.FinderShowType_FINDER_RECOMMEND_HORIZON : com.tencent.wechat.mm.brand_service.b1.FinderShowType_FINDER_NORMAL : com.tencent.wechat.mm.brand_service.b1.FinderShowType_DEFAULT;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.brand_service.a1 a1Var3 = new com.tencent.wechat.mm.brand_service.a1();
            if (bArr2 != null && bArr2.length > 0) {
                a1Var3.parseFrom(bArr2);
            }
            this.f218864f = a1Var3;
        }
        return 0;
    }
}

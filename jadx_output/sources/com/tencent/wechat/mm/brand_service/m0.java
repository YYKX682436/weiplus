package com.tencent.wechat.mm.brand_service;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219044d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219045e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f219046f;

    static {
        new com.tencent.wechat.mm.brand_service.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.m0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.m0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.m0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.m0 m0Var = (com.tencent.wechat.mm.brand_service.m0) fVar;
        return n51.f.a(this.f219044d, m0Var.f219044d) && n51.f.a(this.f219045e, m0Var.f219045e) && n51.f.a(java.lang.Boolean.valueOf(this.f219046f), java.lang.Boolean.valueOf(m0Var.f219046f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219044d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f219045e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f219046f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str2 = this.f219045e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.a(3, this.f219046f);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f219045e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f219046f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.brand_service.l0 l0Var = new com.tencent.wechat.mm.brand_service.l0();
            if (bArr != null && bArr.length > 0) {
                l0Var.parseFrom(bArr);
            }
            linkedList.add(l0Var);
        }
        return 0;
    }
}

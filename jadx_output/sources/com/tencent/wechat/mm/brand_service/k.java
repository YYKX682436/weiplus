package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.k f218997h = new com.tencent.wechat.mm.brand_service.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218998d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f218999e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f219000f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.k1 f219001g = new com.tencent.wechat.mm.brand_service.k1();

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.k parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.k) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.k)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.k kVar = (com.tencent.wechat.mm.brand_service.k) fVar;
        return n51.f.a(this.f218998d, kVar.f218998d) && n51.f.a(java.lang.Boolean.valueOf(this.f218999e), java.lang.Boolean.valueOf(kVar.f218999e)) && n51.f.a(java.lang.Integer.valueOf(this.f219000f), java.lang.Integer.valueOf(kVar.f219000f)) && n51.f.a(this.f219001g, kVar.f219001g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218998d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f218999e);
            fVar.e(3, this.f219000f);
            com.tencent.wechat.mm.brand_service.k1 k1Var = this.f219001g;
            if (k1Var != null) {
                fVar.i(4, k1Var.computeSize());
                this.f219001g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f218999e) + b36.f.e(3, this.f219000f);
            com.tencent.wechat.mm.brand_service.k1 k1Var2 = this.f219001g;
            return k1Var2 != null ? g17 + b36.f.i(4, k1Var2.computeSize()) : g17;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.brand_service.j jVar = new com.tencent.wechat.mm.brand_service.j();
                if (bArr != null && bArr.length > 0) {
                    jVar.parseFrom(bArr);
                }
                linkedList.add(jVar);
            }
            return 0;
        }
        if (intValue == 2) {
            this.f218999e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f219000f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.brand_service.k1 k1Var3 = new com.tencent.wechat.mm.brand_service.k1();
            if (bArr2 != null && bArr2.length > 0) {
                k1Var3.parseFrom(bArr2);
            }
            this.f219001g = k1Var3;
        }
        return 0;
    }
}

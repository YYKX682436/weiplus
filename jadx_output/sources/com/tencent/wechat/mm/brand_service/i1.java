package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class i1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.f1 f218967d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.g1 f218968e;

    /* renamed from: f, reason: collision with root package name */
    public int f218969f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218970g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.h1 f218971h;

    static {
        new com.tencent.wechat.mm.brand_service.i1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.i1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.i1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.i1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.i1 i1Var = (com.tencent.wechat.mm.brand_service.i1) fVar;
        return n51.f.a(this.f218967d, i1Var.f218967d) && n51.f.a(this.f218968e, i1Var.f218968e) && n51.f.a(java.lang.Integer.valueOf(this.f218969f), java.lang.Integer.valueOf(i1Var.f218969f)) && n51.f.a(this.f218970g, i1Var.f218970g) && n51.f.a(this.f218971h, i1Var.f218971h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.i1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.brand_service.f1 f1Var = this.f218967d;
            if (f1Var != null) {
                fVar.i(1, f1Var.computeSize());
                this.f218967d.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.g1 g1Var = this.f218968e;
            if (g1Var != null) {
                fVar.i(2, g1Var.computeSize());
                this.f218968e.writeFields(fVar);
            }
            fVar.e(3, this.f218969f);
            java.lang.String str = this.f218970g;
            if (str != null) {
                fVar.j(4, str);
            }
            com.tencent.wechat.mm.brand_service.h1 h1Var = this.f218971h;
            if (h1Var != null) {
                fVar.i(5, h1Var.computeSize());
                this.f218971h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.brand_service.f1 f1Var2 = this.f218967d;
            int i18 = f1Var2 != null ? 0 + b36.f.i(1, f1Var2.computeSize()) : 0;
            com.tencent.wechat.mm.brand_service.g1 g1Var2 = this.f218968e;
            if (g1Var2 != null) {
                i18 += b36.f.i(2, g1Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f218969f);
            java.lang.String str2 = this.f218970g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            com.tencent.wechat.mm.brand_service.h1 h1Var2 = this.f218971h;
            return h1Var2 != null ? e17 + b36.f.i(5, h1Var2.computeSize()) : e17;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.mm.brand_service.f1 f1Var3 = new com.tencent.wechat.mm.brand_service.f1();
                if (bArr != null && bArr.length > 0) {
                    f1Var3.parseFrom(bArr);
                }
                this.f218967d = f1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.mm.brand_service.g1 g1Var3 = new com.tencent.wechat.mm.brand_service.g1();
                if (bArr2 != null && bArr2.length > 0) {
                    g1Var3.parseFrom(bArr2);
                }
                this.f218968e = g1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            this.f218969f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f218970g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.wechat.mm.brand_service.h1 h1Var3 = new com.tencent.wechat.mm.brand_service.h1();
            if (bArr3 != null && bArr3.length > 0) {
                h1Var3.parseFrom(bArr3);
            }
            this.f218971h = h1Var3;
        }
        return 0;
    }
}

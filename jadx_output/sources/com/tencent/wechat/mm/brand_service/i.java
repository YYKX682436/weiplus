package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.i f218950r = new com.tencent.wechat.mm.brand_service.i();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.u f218951d = new com.tencent.wechat.mm.brand_service.u();

    /* renamed from: e, reason: collision with root package name */
    public boolean f218952e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f218953f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f218954g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f218955h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f218956i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f218957m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218958n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f218959o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.d f218960p = new com.tencent.wechat.mm.brand_service.d();

    /* renamed from: q, reason: collision with root package name */
    public boolean f218961q = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.i)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.i iVar = (com.tencent.wechat.mm.brand_service.i) fVar;
        return n51.f.a(this.f218951d, iVar.f218951d) && n51.f.a(java.lang.Boolean.valueOf(this.f218952e), java.lang.Boolean.valueOf(iVar.f218952e)) && n51.f.a(java.lang.Boolean.valueOf(this.f218953f), java.lang.Boolean.valueOf(iVar.f218953f)) && n51.f.a(java.lang.Integer.valueOf(this.f218954g), java.lang.Integer.valueOf(iVar.f218954g)) && n51.f.a(java.lang.Integer.valueOf(this.f218955h), java.lang.Integer.valueOf(iVar.f218955h)) && n51.f.a(java.lang.Long.valueOf(this.f218956i), java.lang.Long.valueOf(iVar.f218956i)) && n51.f.a(java.lang.Boolean.valueOf(this.f218957m), java.lang.Boolean.valueOf(iVar.f218957m)) && n51.f.a(java.lang.Boolean.valueOf(this.f218958n), java.lang.Boolean.valueOf(iVar.f218958n)) && n51.f.a(java.lang.Integer.valueOf(this.f218959o), java.lang.Integer.valueOf(iVar.f218959o)) && n51.f.a(this.f218960p, iVar.f218960p) && n51.f.a(java.lang.Boolean.valueOf(this.f218961q), java.lang.Boolean.valueOf(iVar.f218961q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.brand_service.u uVar = this.f218951d;
            if (uVar != null) {
                fVar.i(1, uVar.computeSize());
                this.f218951d.writeFields(fVar);
            }
            fVar.a(2, this.f218952e);
            fVar.a(3, this.f218953f);
            fVar.e(4, this.f218954g);
            fVar.e(5, this.f218955h);
            fVar.h(6, this.f218956i);
            fVar.a(7, this.f218957m);
            fVar.a(8, this.f218958n);
            fVar.e(9, this.f218959o);
            com.tencent.wechat.mm.brand_service.d dVar = this.f218960p;
            if (dVar != null) {
                fVar.i(10, dVar.computeSize());
                this.f218960p.writeFields(fVar);
            }
            fVar.a(11, this.f218961q);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.brand_service.u uVar2 = this.f218951d;
            int i18 = (uVar2 != null ? 0 + b36.f.i(1, uVar2.computeSize()) : 0) + b36.f.a(2, this.f218952e) + b36.f.a(3, this.f218953f) + b36.f.e(4, this.f218954g) + b36.f.e(5, this.f218955h) + b36.f.h(6, this.f218956i) + b36.f.a(7, this.f218957m) + b36.f.a(8, this.f218958n) + b36.f.e(9, this.f218959o);
            com.tencent.wechat.mm.brand_service.d dVar2 = this.f218960p;
            if (dVar2 != null) {
                i18 += b36.f.i(10, dVar2.computeSize());
            }
            return i18 + b36.f.a(11, this.f218961q);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.brand_service.u uVar3 = new com.tencent.wechat.mm.brand_service.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    this.f218951d = uVar3;
                }
                return 0;
            case 2:
                this.f218952e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f218953f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f218954g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f218955h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f218956i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f218957m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f218958n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f218959o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.brand_service.d dVar3 = new com.tencent.wechat.mm.brand_service.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar3.parseFrom(bArr2);
                    }
                    this.f218960p = dVar3;
                }
                return 0;
            case 11:
                this.f218961q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.i) super.parseFrom(bArr);
    }
}

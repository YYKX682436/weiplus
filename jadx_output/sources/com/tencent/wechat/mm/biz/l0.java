package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class l0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218257d;

    /* renamed from: e, reason: collision with root package name */
    public long f218258e;

    /* renamed from: f, reason: collision with root package name */
    public long f218259f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218260g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.l0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.l0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.l0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.l0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.l0 l0Var = (com.tencent.wechat.mm.biz.l0) fVar;
        return n51.f.a(this.f218257d, l0Var.f218257d) && n51.f.a(java.lang.Long.valueOf(this.f218258e), java.lang.Long.valueOf(l0Var.f218258e)) && n51.f.a(java.lang.Long.valueOf(this.f218259f), java.lang.Long.valueOf(l0Var.f218259f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.l0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218260g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218257d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218258e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f218259f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f218257d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f218258e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f218259f) : i18;
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
            this.f218257d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218258e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218259f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}

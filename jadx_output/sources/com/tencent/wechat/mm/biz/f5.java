package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class f5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218060e;

    /* renamed from: f, reason: collision with root package name */
    public int f218061f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218062g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.f5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.f5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.f5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.f5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.f5 f5Var = (com.tencent.wechat.mm.biz.f5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218059d), java.lang.Integer.valueOf(f5Var.f218059d)) && n51.f.a(this.f218060e, f5Var.f218060e) && n51.f.a(java.lang.Integer.valueOf(this.f218061f), java.lang.Integer.valueOf(f5Var.f218061f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.f5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218062g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218059d);
            }
            java.lang.String str = this.f218060e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218061f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218059d) : 0;
            java.lang.String str2 = this.f218060e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f218061f) : e17;
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
            this.f218059d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218060e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218061f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
